package edu.unl.e2.tmd;

import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class AfterClassShouldBeDeclaredBeforeTestsRule extends MyAbstractJUnitRule {

	private boolean isTestDeclared=false;

	
	
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		super.initialize(node);
		Object visit = data;
		try{
			visit = super.visit(node, data);
		}finally{
			isTestDeclared=false;
		}
		return visit;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isAfterClass(node)){
			if(isTestDeclared){
				addViolation(data, node);
			}
		}
		else if(isJUnitMethod(node, data)){
			isTestDeclared=true;
		}
		
		return data;
	}
}
