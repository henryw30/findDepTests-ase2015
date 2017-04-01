package edu.unl.e2.tmd;

import java.util.Set;

import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTInitializer;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

import com.google.common.collect.Sets;

public class TestsShouldBeDeclaredBeforeHelperMethodsRule extends MyAbstractJUnitRule {

	private Set<ASTMethodDeclaration> helpers=Sets.newHashSet();

	
	
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = data;
		try{
			visit = super.visit(node, data);
		}finally{
			
			helpers.clear();
		}
		
		return visit;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isSetUp(node) || isTearDown(node) || isAfterClass(node) || isBeforeClass(node) || isJUnit3Class && (isSuite(node) || isMain(node)) ){
			
		}
		else if(isJUnitMethod(node, data)){
			if(!helpers.isEmpty()){
				for(ASTMethodDeclaration helperMethod: helpers){
					addViolation(data, helperMethod);
				}
				helpers.clear();
			}
		}else{
			helpers.add(node);
		}
		return data;
	}
	
	
	@Override
	public Object visit(ASTInitializer node, Object data) {

		return data;
	}
	

	@Override
	public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {

		if(!node.isNested()){
			return super.visit(node, data);
		}
		
		return data;
	}

	private boolean isSuite(ASTMethodDeclaration node) {
		return node.getMethodName().equals("suite");
	}

	private boolean isMain(ASTMethodDeclaration node) {
		return node.getMethodName().equals("main") && node.isStatic();
	}
}
