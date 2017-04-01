package edu.unl.e2.tmd;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTArguments;
import net.sourceforge.pmd.lang.java.ast.ASTExpression;
import net.sourceforge.pmd.lang.java.ast.ASTLocalVariableDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMemberValuePair;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTNormalAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTTryStatement;
import net.sourceforge.pmd.lang.java.ast.ASTVariableInitializer;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;

public class AvoidUselessGetterCallsRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTPrimaryExpression node, Object data) {

		ASTTryStatement tryStatement = node
				.getFirstParentOfType(ASTTryStatement.class);
		ASTMethodDeclaration method = node
				.getFirstParentOfType(ASTMethodDeclaration.class);
		ASTPrimaryPrefix prefix = node
				.getFirstDescendantOfType(ASTPrimaryPrefix.class);

		if (prefix == null /*|| tryStatement != null*/ || method == null
				/*|| method != null && containsExpect(method.jjtGetParent())*/) {
			return data;
		}

		if (isGetter(prefix)) {

			String variableN = prefix.getFirstChildOfType(ASTName.class).getImage().split("\\.")[0];
			if(Utils.isTrue(variableN, prefix.getScope(), new DeclarationFinder() {

				@Override
				public boolean onFound2(VariableNameDeclaration declaration,
						List<NameOccurrence> occurrences) {
						Class<?> type = declaration.getType();
					return type!=null && Future.class.isAssignableFrom(type);
				}
				
			})){
				return data;
			}
			
			Node parentNode = node.jjtGetParent();
			if (parentNode instanceof ASTStatementExpression) {
				addViolation(data, node);

			} else if (parentNode instanceof ASTExpression) {
				Node root = parentNode.jjtGetParent();

				if (root instanceof ASTStatementExpression) {

					ASTStatementExpression vDeclaration = (ASTStatementExpression) root;

					Map<VariableNameDeclaration, List<NameOccurrence>> declarations = vDeclaration
							.getScope().getDeclarations(
									VariableNameDeclaration.class);

					ASTName variableName = root
							.getFirstDescendantOfType(ASTName.class);

					for (VariableNameDeclaration declaration : declarations
							.keySet()) {

						if (!declaration.getName().equals(
								variableName.getImage())) {
							continue;
						}

						List<NameOccurrence> occurrences = declarations
								.get(declaration);
						if (occurrences.isEmpty()) {
							addViolation(data, node);
						} else {
							boolean isValid = false;

							for (NameOccurrence occurrence : occurrences) {
								if (occurrence.getLocation()
										.getFirstParentOfType(
												ASTMethodDeclaration.class) != method) {
									continue;
								}

								if (occurrence.getLocation().getBeginLine() > node
										.getBeginLine()) {
									isValid = true;
									break;
								}

							}
							if (!isValid) {
								addViolation(data, node);
							}
						}
						break;
					}

				} else if (root instanceof ASTVariableInitializer) {
					ASTLocalVariableDeclaration vDeclaration = root
							.getFirstParentOfType(ASTLocalVariableDeclaration.class);

					Map<VariableNameDeclaration, List<NameOccurrence>> declarations = vDeclaration
							.getScope().getDeclarations(
									VariableNameDeclaration.class);

					for (VariableNameDeclaration declaration : declarations
							.keySet()) {

						if (!declaration.getName().equals(
								vDeclaration.getVariableName())) {
							continue;
						}

						List<NameOccurrence> occurrences = declarations
								.get(declaration);
						if (occurrences.isEmpty()) {
							addViolation(data, node);
						}
						break;
					}
				}
			}
		}
		return data;
	}

	private boolean isGetter(ASTPrimaryPrefix prefix) {

		ASTName name = prefix.getFirstChildOfType(ASTName.class);

		if (name != null) {
			String[] methodCall = name.getImage().split("\\.");

			if (methodCall.length == 2) {

				if (methodCall[1].startsWith("get")) {

					Node expression = prefix.jjtGetParent();
					if (expression.jjtGetNumChildren() == 2) {
						return true;
					}else{
						List<ASTPrimarySuffix> suffixes = expression.findChildrenOfType(ASTPrimarySuffix.class);
						
						Collections.reverse(suffixes);
						
						for(ASTPrimarySuffix suffix : suffixes){
							String image = suffix.getImage();
							if(image!=null){
								return image.startsWith("get");
							}
						}
						
					}
					//if (expression.jjtGetNumChildren() == 2) {

						//ASTArguments arguments = expression
						//		.getFirstDescendantOfType(ASTArguments.class);
						//if (arguments.getArgumentCount() == 0) {
							//return true;
						//}
					//}
				}
			}
		}
		return false;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		if (isJUnitMethod(node, data) && !isIgnored(node)) {
			return super.visit(node, data);
		}

		return data;
	}

	/**
	 * Tells if the node contains a Test annotation with an expected exception.
	 */
	private boolean containsExpect(Node methodParent) {
		List<ASTNormalAnnotation> annotations = methodParent
				.findDescendantsOfType(ASTNormalAnnotation.class);
		for (ASTNormalAnnotation annotation : annotations) {
			ASTName name = annotation.getFirstChildOfType(ASTName.class);
			if (name != null
					&& ("Test".equals(name.getImage()) || (name.getType() != null && name
							.getType().equals(JUNIT4_CLASS)))) {
				List<ASTMemberValuePair> memberValues = annotation
						.findDescendantsOfType(ASTMemberValuePair.class);
				for (ASTMemberValuePair pair : memberValues) {
					if ("expected".equals(pair.getImage())) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
