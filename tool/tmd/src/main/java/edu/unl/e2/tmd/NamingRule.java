package edu.unl.e2.tmd;

import java.util.Set;

import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

import com.google.common.collect.Sets;

public class NamingRule extends MyAbstractJUnitRule {

Set<ASTMethodDeclaration> tests=Sets.newHashSet();
Set<ASTMethodDeclaration> invalidTests=Sets.newHashSet();
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {		
		Object visit = data;
		try{
			visit = super.visit(node, data);
	
			if(tests.size()>1){
				for(ASTMethodDeclaration method : invalidTests){
					addViolation(data, method);
				}
			}
			
		}finally{
			tests.clear();
			invalidTests.clear();
		}
		return visit;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
		
			tests.add(node);
			if(node.getMethodName().matches("test(\\d)*")){
				invalidTests.add(node);
			}
		}
		
		return data;
	}

	
	
}
