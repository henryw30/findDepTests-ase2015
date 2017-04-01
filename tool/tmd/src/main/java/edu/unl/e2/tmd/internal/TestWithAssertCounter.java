package edu.unl.e2.tmd.internal;


import java.util.List;
import java.util.Map;
import java.util.Set;

import com.beust.jcommander.internal.Sets;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTImportDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMemberValuePair;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclarator;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTNormalAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule;
import net.sourceforge.pmd.lang.java.symboltable.ClassScope;
import net.sourceforge.pmd.lang.java.symboltable.MethodNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;


public class TestWithAssertCounter extends MyAbstractJUnitRule {

	Set<ASTMethodDeclaration> homeMadeAssertions = Sets.newHashSet();
	Set<ASTMethodDeclaration> alreadyConsidered = Sets.newHashSet();
	private boolean isVerifyImported=false;

	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = super.visit(node, data);

		if (isJUnit4Class || isJUnit3Class) {

			ASTClassOrInterfaceDeclaration classNode = node
					.getFirstDescendantOfType(ASTClassOrInterfaceDeclaration.class);
			Map<MethodNameDeclaration, List<NameOccurrence>> declarations = classNode
					.getScope().getDeclarations(MethodNameDeclaration.class);

			for (ASTMethodDeclaration method : node
					.findDescendantsOfType(ASTMethodDeclaration.class)) {
				if (method.getBlock() != null && !isJUnitMethod(method, data) && !homeMadeAssertions.contains(method)
						&& containsAssert(method.getBlock(), false)) {
					checkForAssertionTransitivity(declarations, method,data);
				}
			}

			for (ASTMethodDeclaration method : node
					.findDescendantsOfType(ASTMethodDeclaration.class)) {
				if (method.getBlock() != null && isJUnitMethod(method, data) && !isIgnored(method)) {
					if(homeMadeAssertions.contains(method)){
						addViolation(data, method);
						continue;
					}
					if (containsAssert(method.getBlock(), false)
							|| containsExpect(method.jjtGetParent())
							|| callsHomeMadeAssertion(method)) {
						addViolation(data, method);
					}
				}
			}

		}
		homeMadeAssertions.clear();
		alreadyConsidered.clear();
		isVerifyImported=false;
		return visit;
	}
	

	@Override
	public Object visit(ASTImportDeclaration node, Object data) {
		
		String packageName = node.getFirstChildOfType(ASTName.class).getImage();
		if(packageName.equals("org.mockito.Mockito.verify")){
			isVerifyImported=true;
		}
		else if(node.isImportOnDemand() && node.getPackageName().equals("org.mockito.Mockito")){			
			isVerifyImported=true;
		}
		
		return data;
	}

	private void checkForAssertionTransitivity(
			Map<MethodNameDeclaration, List<NameOccurrence>> declarations,
			ASTMethodDeclaration method, Object data) {

		
		if (!homeMadeAssertions.contains(method)) {
			homeMadeAssertions.add(method);

			for (MethodNameDeclaration methodDeclaration : declarations
					.keySet()) {

				if (!method
						.getFirstChildOfType(ASTMethodDeclarator.class)
						.equals(methodDeclaration.getMethodNameDeclaratorNode())) {
					continue;
				}

				for (NameOccurrence occurrence : declarations
						.get(methodDeclaration)) {
					ASTMethodDeclaration occurrenceMethod = occurrence
							.getLocation().getFirstParentOfType(
									ASTMethodDeclaration.class);
					if (occurrenceMethod != null) {
						checkForAssertionTransitivity(declarations, occurrenceMethod,data);
					}
				}

				break;
			}

		}
	}

	// Ignores iterfaces
	@Override
	public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {

		return data;
	}

	private boolean callsHomeMadeAssertion(ASTMethodDeclaration method) {

		alreadyConsidered.add(method);
		
		for (ASTStatementExpression statement : method.findDescendantsOfType(ASTStatementExpression.class)) {
			ASTPrimaryPrefix prefix = statement.getFirstDescendantOfType(ASTPrimaryPrefix.class);
			if (prefix != null) {
				ASTName name = prefix.getFirstChildOfType(ASTName.class);
				if (name != null){
					for(ASTMethodDeclaration assertionMethod: homeMadeAssertions){
						if(name.hasImageEqualTo(assertionMethod.getMethodName())){
							return true;
						}
					}
					ClassScope classScope = method.getScope().getEnclosingScope(ClassScope.class);
					
					Map<MethodNameDeclaration, List<NameOccurrence>> declarations = classScope.getMethodDeclarations();
					
					for (MethodNameDeclaration methodDeclaration : declarations
							.keySet()) {

						if (!name.hasImageEqualTo(methodDeclaration.getName()) ||method
								.getFirstChildOfType(ASTMethodDeclarator.class)
								.equals(methodDeclaration.getMethodNameDeclaratorNode())) {
							continue;
						}
						
						ASTMethodDeclaration methodX = (ASTMethodDeclaration)methodDeclaration.getNode().getNthParent(1);
						
						if(methodX.getBlock() !=null && containsAssert(methodX.getBlock(), false)
						||!alreadyConsidered.contains(methodX) && callsHomeMadeAssertion(methodX)){
							return true;
						}
						
					}
					
				}
			}
		}

		return false;
	}

	private boolean containsAssert(Node n, boolean assertFound) {
		if (!assertFound) {
			if (n instanceof ASTStatementExpression) {
				if (isAssertOrFailStatement((ASTStatementExpression) n)) {
					return true;
				}
			}
			if (!assertFound) {
				for (int i = 0; i < n.jjtGetNumChildren() && !assertFound; i++) {
					Node c = n.jjtGetChild(i);
					if (containsAssert(c, assertFound)) {
						return true;
					}
				}
			}
		}
		return false;
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

	@Override
	protected boolean isThirdPartyAssertion(String possibleAssertion) {
		if(isVerifyImported){
			return possibleAssertion.equals("verify") ||possibleAssertion.equals("verifyZeroInteractions") ||possibleAssertion.equals("verifyNoMoreInteractions") ;
		}		
		return possibleAssertion.startsWith("Mockito\\.verify");
		
	}

	
}
