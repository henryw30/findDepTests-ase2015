package edu.unl.e2.tmd;

import java.net.URL;
import java.util.List;

import net.sourceforge.pmd.lang.java.ast.ASTAssignmentOperator;
import net.sourceforge.pmd.lang.java.ast.ASTExpression;
import net.sourceforge.pmd.lang.java.ast.ASTFieldDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTIfStatement;
import net.sourceforge.pmd.lang.java.ast.ASTLocalVariableDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTVariableDeclaratorId;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;

public class URLRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(final ASTPrimaryExpression node, final Object data) {

		ASTPrimaryPrefix prefix = node
				.getFirstDescendantOfType(ASTPrimaryPrefix.class);

		if (prefix != null) {

			ASTName name = prefix.getFirstChildOfType(ASTName.class);

			String variableName = "";
			if (name != null) {
				String[] methodCall = name.getImage().split("\\.");

				if (methodCall.length == 2) {

					if (methodCall[1].equals("getContent")
							|| methodCall[1].equals("openConnection")
							|| methodCall[1].equals("openStream")) {

						if (node.jjtGetNumChildren() >= 2) {

							variableName = methodCall[0];

						}
					}
				}
			}

			if (!variableName.equals("")) {

				boolean isUrl = Utils.isTrue(variableName, node.getScope(),
						new DeclarationFinder() {

							@Override
							public boolean onFound2(
									VariableNameDeclaration declaration,
									List<NameOccurrence> occurrences) {

								Class<?> type = declaration.getType();

								return type != null
										&& URL.class.isAssignableFrom(type);
							}

						});

				if (isUrl) {

					ASTLocalVariableDeclaration localDeclaration = node.getFirstParentOfType(ASTLocalVariableDeclaration.class);
					final ASTStatementExpression assignment = node.getFirstParentOfType(ASTStatementExpression.class);

					if(localDeclaration!=null){
						ASTVariableDeclaratorId variableId = localDeclaration.getFirstDescendantOfType(ASTVariableDeclaratorId.class);
						List<NameOccurrence> occurrences = localDeclaration.getScope().getDeclarations(VariableNameDeclaration.class).get(new VariableNameDeclaration(variableId));
						
						boolean usedOnPredicate=false;
						
						for(NameOccurrence occurrence : occurrences){
							ASTStatementExpression statement = occurrence.getLocation().getFirstParentOfType(ASTStatementExpression.class);
							
							if(statement!=null && isAssertOrFailStatement(statement)){
								usedOnPredicate=true;
							}else if(statement!=null && statement.getFirstDescendantOfType(ASTAssignmentOperator.class)!=null && 
									statement.getFirstDescendantOfType(ASTName.class).hasImageEqualTo(variableId.getImage()) ){
								break;
							}else{
								ASTIfStatement ifStatement = occurrence.getLocation().getFirstParentOfType(ASTIfStatement.class);
								
								if(ifStatement!=null && ifStatement.jjtGetChild(0).equals(getOuter(occurrence.getLocation(), ASTExpression.class)) ){
									usedOnPredicate=true;
								}
							}
							
						}
						
						
						if(!usedOnPredicate){
							addViolation(data, node);
						}
						
					}else if(assignment!=null && assignment.getFirstDescendantOfType(ASTAssignmentOperator.class)!=null){
					final ASTName variableId = assignment.getFirstDescendantOfType(ASTName.class);
						
						
						boolean usedOnPredicate=Utils.isTrue(variableId.getImage(), assignment.getScope(), new DeclarationFinder() {

							@Override
							public boolean onFound2(
									VariableNameDeclaration declaration,
									List<NameOccurrence> occurrences) {

						for(NameOccurrence occurrence : occurrences){
							if(occurrence.getLocation().getBeginLine() <= assignment.getBeginLine() ||
									!getOuterMethodDeclaration(assignment).equals(getOuterMethodDeclaration(occurrence.getLocation()))){
								continue;
							}
							
							if(occurrence.getLocation() instanceof ASTFieldDeclaration){
								addViolationWithMessage(data, node, "URLfieldDec");
								continue;
							}
							
							ASTStatementExpression statement = occurrence.getLocation().getFirstParentOfType(ASTStatementExpression.class);
							
							if(statement!=null && isAssertOrFailStatement(statement)){
								return true;
							}else if(statement!=null && statement.getFirstDescendantOfType(ASTAssignmentOperator.class)!=null && 
									statement.getFirstDescendantOfType(ASTName.class).hasImageEqualTo(variableId.getImage()) ){
								break;
							}else{
								ASTIfStatement ifStatement = occurrence.getLocation().getFirstParentOfType(ASTIfStatement.class);
								
								if(ifStatement!=null && ifStatement.jjtGetChild(0).equals(getOuter(occurrence.getLocation(), ASTExpression.class)) ){
									return true;
								}
							}
							
						}
						
								return false;
							}
							
							
						});
						
						if(!usedOnPredicate){
							addViolation(data, node);
						}
					}

					
				}
			}
		}

		return data;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		if (isJUnitMethod(node, data) && !isIgnored(node)) {
			return super.visit(node, data);
		}

		return data;
	}

}
