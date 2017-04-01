package edu.unl.e2.tmd.internal;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTFieldDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class StaticFieldCounter extends MyAbstractJUnitRule {

	

	@Override
	public Object visit(ASTFieldDeclaration node, Object data) {
		
		if(node.isStatic()){
			addViolation(data, node);
		}
		
		return data;
	}
	
	
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		return data;
	}
}
