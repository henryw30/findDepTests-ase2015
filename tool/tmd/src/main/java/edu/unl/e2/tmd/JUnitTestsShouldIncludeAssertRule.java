package edu.unl.e2.tmd;

import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTAllocationExpression;
import net.sourceforge.pmd.lang.java.ast.ASTAssignmentOperator;
import net.sourceforge.pmd.lang.java.ast.ASTBlockStatement;
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
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.symboltable.ClassScope;
import net.sourceforge.pmd.lang.java.symboltable.MethodNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;

import com.beust.jcommander.internal.Sets;

public class JUnitTestsShouldIncludeAssertRule extends MyAbstractJUnitRule {

	Set<ASTMethodDeclaration> homeMadeAssertions = Sets.newHashSet();
	Set<ASTMethodDeclaration> alreadyConsidered = Sets.newHashSet();
	private boolean isVerifyImported = false;

	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = data;
		try{
			
			visit = super.visit(node, data);
	
			if (isJUnit4Class || isJUnit3Class) {
	
				ASTClassOrInterfaceDeclaration classNode = node
						.getFirstDescendantOfType(ASTClassOrInterfaceDeclaration.class);
				Map<MethodNameDeclaration, List<NameOccurrence>> declarations = classNode
						.getScope().getDeclarations(MethodNameDeclaration.class);
	
				for (ASTMethodDeclaration method : node
						.findDescendantsOfType(ASTMethodDeclaration.class)) {
					if (method.getBlock() != null && !isJUnitMethod(method, data)
							&& !homeMadeAssertions.contains(method)) {
						boolean containsCertainAssertions = containsAssert(method.getBlock(), false);
						boolean containsDobiousAssertions = isMaybe(method);
						if(containsCertainAssertions || containsDobiousAssertions){
							checkForAssertionTransitivity(declarations, method, data, homeMadeAssertions);
						}
					}
				}
	
				for (ASTMethodDeclaration method : node
						.findDescendantsOfType(ASTMethodDeclaration.class)) {
					if (method.getBlock() != null && isJUnitMethod(method, data) && !isIgnored(method)) {
						if (homeMadeAssertions.contains(method)) {
							continue;
						}
						if (method.getMethodName().toLowerCase()
								.contains("constructor")) {
							continue;
						}
	
						boolean allConstructors = true;
						for (ASTBlockStatement statement : method.getBlock()
								.findChildrenOfType(ASTBlockStatement.class)) {
	
							ASTAllocationExpression allocation = statement
									.getFirstDescendantOfType(ASTAllocationExpression.class);
	
							if (allocation == null) {
								allConstructors = false;
								break;
							}
	
							ASTPrimaryExpression expression = allocation
									.getFirstParentOfType(ASTPrimaryExpression.class);
	
							ASTPrimarySuffix suffix = expression
									.getFirstChildOfType(ASTPrimarySuffix.class);
	
							if (suffix != null && suffix.getImage() != null) {
								allConstructors = false;
								break;
							}
	
						}
	
						if (!allConstructors
								&& !containsAssert(method.getBlock(), false)
								&& !containsExpect(method.jjtGetParent())
								&& !callsHomeMadeAssertion(method)) {
	
							if (!isMaybe(method)) {
								addViolation(data, method);
							}
						}
					}
				}
	
			}
		}finally{
			homeMadeAssertions.clear();
			alreadyConsidered.clear();
			isVerifyImported = false;
		}
		return visit;
	}

	private boolean isMaybe(ASTMethodDeclaration method) {

		for (ASTPrimaryExpression expression : method
				.findDescendantsOfType(ASTPrimaryExpression.class)) {

			ASTPrimaryPrefix prefix = expression
					.getFirstChildOfType(ASTPrimaryPrefix.class);
			List<ASTPrimarySuffix> suffixes = expression
					.findChildrenOfType(ASTPrimarySuffix.class);
			
			if (!suffixes.isEmpty()) {
				if (prefix.jjtGetNumChildren() > 0) {
					ASTAllocationExpression allocation = prefix.getFirstChildOfType(ASTAllocationExpression.class);
					ASTName name = prefix.getFirstChildOfType(ASTName.class);
					

					String methodName=null;
					String callName=null;
					
					if (name != null) {

						String[] methodCall = name.getImage().split("\\.");
						if(methodCall.length>1){
							
							String objectsName = methodCall[0];
							if (objectsName.equalsIgnoreCase("Assert")
									|| objectsName.equalsIgnoreCase("Mockito")) {
								continue;
							}
							methodName = methodCall[methodCall.length-1];
						
						}else if(suffixes.size() > 1 && suffixes.get(0).isArrayDereference()){
						
							methodName=suffixes.get(1).getImage();
						
						}else{						
							callName = methodCall[0];
						}
					}else if(allocation!= null && !suffixes.get(0).isArrayDereference()){
						methodName = suffixes.get(0).getImage();
					}
					
					
					if(methodName!=null){
						methodName=methodName.toLowerCase();
						if (methodName.contains("assert")
								|| methodName.contains("check")
								|| methodName.contains("verify")
								|| methodName.contains("expect")
								|| methodName.contains("test")) {
							return true;
						}
						
					}else if( callName!=null){
						ASTStatementExpression statement = name.getFirstParentOfType(ASTStatementExpression.class);
						if (statement != null && statement.getFirstDescendantOfType(ASTAssignmentOperator.class) == null) {

							ClassScope scope = method
									.getScope()
									.getEnclosingScope(ClassScope.class);

							boolean containsMethod = isMethodDefined(
									scope, callName);

							if (!containsMethod && !isThirdPartyAssertion(callName)) {
								return true;
							}
						}
					}
					
					if(suffixes.size()>1){
						for(ASTPrimarySuffix suffix:suffixes){
							methodName = suffix.getImage();
							if(methodName!=null){
								methodName=methodName.toLowerCase();
								if (methodName.contains("assert")
										|| methodName.contains("check")
										|| methodName.contains("verify")
										|| methodName.contains("expect")
										|| methodName.contains("test")) {
									return true;
								}
							}
								
						}
					}
					
				} else {

					if (prefix.usesSuperModifier()) {

						if (suffixes.size() > 1) {
							return true;
						}
					}

					if (prefix.usesThisModifier()) {

						if (suffixes.size() > 1) {

							ASTPrimarySuffix suffix = suffixes.get(0);

							ClassScope scope = method.getScope()
									.getEnclosingScope(ClassScope.class);

							String methodName = suffix.getImage();
							if (suffixes.get(1).jjtGetNumChildren() > 0 && !isMethodDefined(scope,methodName)) {
								return true;
							}
							
							for(ASTPrimarySuffix suffix2:suffixes){
								methodName = suffix2.getImage();
								if(methodName!=null && !isMethodDefined(scope,methodName)){
									methodName=methodName.toLowerCase();
									if (methodName.contains("assert")
											|| methodName.contains("check")
											|| methodName.contains("verify")
											|| methodName.contains("expect")
											|| methodName.contains("test")) {
										return true;
									}
								}		
							}
							
						}
					}

				}

			}
		}

		return false;
	}

	private boolean isMethodDefined(ClassScope scope, String anObject) {

		Map<MethodNameDeclaration, List<NameOccurrence>> declarations = scope
				.getMethodDeclarations();

		boolean methodDefined = false;
		for (MethodNameDeclaration declaration : declarations.keySet()) {
			if (declaration.getName().equals(anObject)) {
				if(!declaration.getMethodNameDeclaratorNode().getFirstParentOfType(ASTMethodDeclaration.class).isAbstract()){
					methodDefined = true;
				}
				break;
			}
		}
		return methodDefined;
	}

	@Override
	public Object visit(ASTImportDeclaration node, Object data) {

		String packageName = node.getFirstChildOfType(ASTName.class).getImage();
		if (packageName.equals("org.mockito.Mockito.verify")) {
			isVerifyImported = true;
		} else if (node.isImportOnDemand()
				&& node.getPackageName().equals("org.mockito.Mockito")) {
			isVerifyImported = true;
		}

		return data;
	}

	private void checkForAssertionTransitivity(
			Map<MethodNameDeclaration, List<NameOccurrence>> declarations,
			ASTMethodDeclaration method, Object data, Set<ASTMethodDeclaration> set) {

		if (!set.contains(method)) {
			set.add(method);
			
			
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
						checkForAssertionTransitivity(declarations, occurrenceMethod,data,set);
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

		for (ASTStatementExpression statement : method
				.findDescendantsOfType(ASTStatementExpression.class)) {
			ASTPrimaryPrefix prefix = statement
					.getFirstDescendantOfType(ASTPrimaryPrefix.class);
			if (prefix != null) {
				ASTName name = prefix.getFirstChildOfType(ASTName.class);
				if (name != null) {
					for (ASTMethodDeclaration assertionMethod : homeMadeAssertions) {
						if (name.hasImageEqualTo(assertionMethod
								.getMethodName())) {
							return true;
						}
					}
					ClassScope classScope = method.getScope()
							.getEnclosingScope(ClassScope.class);

					Map<MethodNameDeclaration, List<NameOccurrence>> declarations = classScope
							.getMethodDeclarations();

					for (MethodNameDeclaration methodDeclaration : declarations
							.keySet()) {

						if (!name.hasImageEqualTo(methodDeclaration.getName())
								|| method.getFirstChildOfType(
										ASTMethodDeclarator.class).equals(
										methodDeclaration
												.getMethodNameDeclaratorNode())) {
							continue;
						}

						ASTMethodDeclaration methodX = (ASTMethodDeclaration) methodDeclaration
								.getNode().getNthParent(1);

						if (methodX.getBlock() != null
								&& containsAssert(methodX.getBlock(), false)
								|| !alreadyConsidered.contains(methodX)
								&& ( isMaybe(methodX) || callsHomeMadeAssertion(methodX))) {
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
		if (isVerifyImported) {
			return possibleAssertion.equals("verify")
					|| possibleAssertion.equals("verifyZeroInteractions")
					|| possibleAssertion.equals("verifyNoMoreInteractions");
		}
		return possibleAssertion.startsWith("Mockito.verify");

	}

}
