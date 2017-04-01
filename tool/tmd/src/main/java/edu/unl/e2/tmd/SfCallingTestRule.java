package edu.unl.e2.tmd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTAssignmentOperator;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclarator;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.ASTTypeDeclaration;
import net.sourceforge.pmd.lang.java.ast.AccessNode;
import net.sourceforge.pmd.lang.java.ast.TypeNode;
import net.sourceforge.pmd.lang.java.symboltable.MethodNameDeclaration;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.ScopedNode;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class SfCallingTestRule extends MyAbstractJUnitRule {

	Set<ASTMethodDeclarator> tests = Sets.newHashSet();
	Set<VariableNameDeclaration> fields = Sets.newHashSet();
	private ASTMethodDeclaration setup = null;

	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = data;

		try {
			initialize(node);
			if (isJUnit3Class || isJUnit4Class) {

				visit = super.visit(node, data);

				if(tests.size()<=1){
					return visit;
				}
				
				
				checkForFixOrderAnnotation(node);

				ASTClassOrInterfaceDeclaration classNode = node
						.getFirstDescendantOfType(ASTClassOrInterfaceDeclaration.class);

				Map<VariableNameDeclaration, List<NameOccurrence>> variableDeclarations = classNode
						.getScope().getDeclarations(
								VariableNameDeclaration.class);

				for (VariableNameDeclaration variableDeclaration : variableDeclarations
						.keySet()) {

					AccessNode accessNodeParent = variableDeclaration
							.getAccessNodeParent();

					if (accessNodeParent.isStatic()) {
						boolean isUsedOnSetUp = false;

						for (NameOccurrence occurrence : variableDeclarations
								.get(variableDeclaration)) {

							ASTMethodDeclaration methodRelatedToField = getOuterMethodDeclaration(occurrence
									.getLocation());

							if (setup != null && setup.equals(methodRelatedToField)) {
								isUsedOnSetUp = true;
								break;
							}

						}

						if (!isUsedOnSetUp) {
							fields.add(variableDeclaration);
						}
					}
				}

				if (fields.isEmpty()) {
					return visit;
				}
				
				
				Set<Call> calls= Sets.newHashSet();
				Map<MethodNameDeclaration, List<NameOccurrence>> methodDeclarations = classNode
						.getScope()
						.getDeclarations(MethodNameDeclaration.class);

				for (ASTMethodDeclarator declaration : tests) {

					List<NameOccurrence> list = methodDeclarations
							.get(new MethodNameDeclaration(declaration));

					for (NameOccurrence occurrence : list) {

						ScopedNode methodCall = occurrence.getLocation();
						ASTMethodDeclaration method = getOuterMethodDeclaration(methodCall);
						if (!method.equals(declaration.jjtGetParent())
								&& isJUnitMethod(method, data)) {

							if (isInterMethodCall(declaration,methodCall)) {

								calls.add(new Call(declaration.getFirstParentOfType(ASTMethodDeclaration.class),method,methodCall));
								
								
							}
						}else if(!method.equals(declaration.jjtGetParent())
								&& !isSetUp(method)){

							Set<ASTMethodDeclaration> methodsCallingTests = Sets.newHashSet();
							Set<Call> checkForTransitivity = checkForTransitivity(methodDeclarations, method, data, methodsCallingTests);
							for(Call call: checkForTransitivity){
								if(isJUnitMethod(call.getOriginalCaller(), data) && !isIgnored(call.getOriginalCaller())){
									call.add(method, methodCall);
									call.setCallee(declaration.getFirstParentOfType(ASTMethodDeclaration.class));
									calls.add(call);
								}
							}
						}
					}
				}
				
				for(Call call: calls){
					Map<VariableNameDeclaration, Set<Node>> occurrencesPerTest = Maps.newHashMap();
					
					for (VariableNameDeclaration field : fields) {
						occurrencesPerTest.put(field, Sets.<Node>newHashSet());
						
						for (NameOccurrence fieldOccurrence : variableDeclarations.get(field)) {
							ScopedNode location = fieldOccurrence
											.getLocation();
									
								ASTMethodDeclaration methodRelatedToField = getOuterMethodDeclaration(location);
								
								if (call.getCallee().equals(methodRelatedToField)) {
									occurrencesPerTest.get(field).add(location);
								}

						}
					}
					
					for (VariableNameDeclaration field : occurrencesPerTest.keySet()) {
						if (occurrencesPerTest.get(field).size()>1) {
							addViolation(data, call.getCallee());
						}
					}
				}
			}

		} finally {
			tests.clear();
			fields.clear();
			setup = null;
		}
		return visit;
	}

	private boolean isInterMethodCall(ASTMethodDeclarator declaration,
			ScopedNode methodCall) {
		boolean isACall = false;
		if (!methodCall.getImage().contains(".")) {
			ASTPrimarySuffix argumentSuffix;
			if (methodCall instanceof ASTPrimarySuffix
					&& methodCall
							.getNthParent(1)
							.getFirstChildOfType(
									ASTPrimaryPrefix.class)
							.usesSuperModifier()) {

			} else if (methodCall instanceof ASTPrimarySuffix
					&& methodCall
							.getNthParent(1)
							.getFirstChildOfType(
									ASTPrimaryPrefix.class)
							.usesThisModifier()) {
				List<ASTPrimarySuffix> suffixes = methodCall
						.getNthParent(1)
						.findChildrenOfType(
								ASTPrimarySuffix.class);
				argumentSuffix = suffixes.get(suffixes
						.indexOf(methodCall) + 1);
				isACall = declaration.getParameterCount() == argumentSuffix.getArgumentCount();
			} else if(methodCall instanceof ASTName) {
				argumentSuffix = methodCall.getNthParent(2)
						.getFirstChildOfType(
								ASTPrimarySuffix.class);
				isACall = declaration.getParameterCount() == argumentSuffix.getArgumentCount();
			}


		}
		return isACall;
	}

	private void checkForFixOrderAnnotation(ASTCompilationUnit node) {
		ASTTypeDeclaration typeDeclaration = node
				.getFirstDescendantOfType(ASTTypeDeclaration.class);

		for (ASTAnnotation annotation : typeDeclaration
				.findChildrenOfType(ASTAnnotation.class)) {

			Node annotationTypeNode = annotation.jjtGetChild(0);
			TypeNode annotationType = (TypeNode) annotationTypeNode;
			if (annotationType.getType() == null) {
				ASTName name = annotationTypeNode
						.getFirstChildOfType(ASTName.class);
				if (name != null && "FixMethodOrder".equals(name.getImage())) {
					tests.clear();
				}
			} else {
				try {
					if (annotationType.getType().equals(
							Class.forName("org.junit.FixMethodOrder"))) {
						tests.clear();
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		if (isJUnitMethod(node, data) && !isIgnored(node)) {
			tests.add(node.getFirstDescendantOfType(ASTMethodDeclarator.class));
		} else if (isSetUp(node)) {
			setup = node;
		}

		return data;
	}

	@Override
	public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {

		if (node.isNested()) {
			return data;
		}

		return super.visit(node, data);
	}

	private Set<Call> checkForTransitivity(
			Map<MethodNameDeclaration, List<NameOccurrence>> declarations,
			ASTMethodDeclaration method, Object data, Set<ASTMethodDeclaration> set) {

		Set<Call> calls = Sets.newHashSet();
		if (!set.contains(method)) {
			set.add(method);
					
			ASTMethodDeclarator methodDeclarator = method.getFirstChildOfType(ASTMethodDeclarator.class);
			List<NameOccurrence> occurrences = declarations.get(new MethodNameDeclaration(methodDeclarator));
			for (NameOccurrence occurrence : occurrences) {
				ScopedNode methodCall = occurrence.getLocation();
				ASTMethodDeclaration occurrenceMethod = getOuterMethodDeclaration( methodCall);
				if (occurrenceMethod != null) {
					
					if(isInterMethodCall(methodDeclarator,methodCall)){
						calls = checkForTransitivity(declarations,occurrenceMethod, data, set);
						for(Call call : calls){
							call.add(occurrenceMethod,methodCall);
						}
					}
				}
			}
			if(occurrences.isEmpty()){
				calls.add(new Call(method));
			}
		}
		
		return calls;
	}
	
	private class Call{

		private List<ASTMethodDeclaration> chain;
		private ASTMethodDeclaration caller;
		private ASTMethodDeclaration callee;
		public ASTMethodDeclaration getOriginalCaller() {
			return caller;
		}

		private List<Node> methodCalls;

		public Call(ASTMethodDeclaration test,
				ASTMethodDeclaration callerMethod, Node methodCall) {
					this.caller=callerMethod;
					this.callee=test;
					this.chain =   Lists.newArrayList(callerMethod);
					this.methodCalls=Lists.newArrayList(methodCall);
		}

		public Call(ASTMethodDeclaration test) {
			this.chain = Lists.newArrayList();
			this.caller=test;
			this.methodCalls=Lists.newArrayList();
		}

		public void add(ASTMethodDeclaration methodDeclarator,
				ScopedNode methodCall2) {
			chain.add(methodDeclarator);
			methodCalls.add(methodCall2);
			
		}

		private Node getMethodCall() {
			return methodCalls.get(0);
		}

		public List<ASTMethodDeclaration> getChain() {
			return chain;
		}
		
		public ASTMethodDeclaration getCallee() {
			return callee;
		}

		public void setCallee(ASTMethodDeclaration callee) {
			this.callee=callee;
			
		}

		
	}
}
