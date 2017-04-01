package edu.unl.e2.tmd;

import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTInitializer;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class BeforeClassShouldBeDeclaredBeforeTestsRule extends MyAbstractJUnitRule {

	private boolean isTestDeclared=false;

	
	
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		
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
		
		if(isBeforeClass(node)){
			if(isTestDeclared){
				addViolation(data, node);
			}
		}
		else if(isJUnitMethod(node, data)){
			isTestDeclared=true;
		}
		
		return data;
	}

	@Override
	public Object visit(ASTInitializer node, Object data) {
		if(isJUnit3Class && node.isStatic()){
			if(isTestDeclared){
				addViolation(data, node);
			}
		}
		
		return data;
	}
	
	
	
}
