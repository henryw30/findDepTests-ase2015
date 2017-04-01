package edu.unl.e2.tmd;

import net.sourceforge.pmd.lang.java.ast.ASTFinallyStatement;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;


public class FinallyBlocksShouldBeAvoidedRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTFinallyStatement node, Object data) {
	
		addViolation(data, node);
		
		return data;
	}
	
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			return super.visit(node, data);
		}
		
		return data;
	}
	
}
