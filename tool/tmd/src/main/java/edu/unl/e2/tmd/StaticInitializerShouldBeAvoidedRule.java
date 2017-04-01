package edu.unl.e2.tmd;

import net.sourceforge.pmd.lang.java.ast.ASTInitializer;


public class StaticInitializerShouldBeAvoidedRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTInitializer node, Object data) {
		if(isJUnit4Class && node.isStatic()){
				addViolation(data, node);
		}
		
		return data;
	}
	
}
