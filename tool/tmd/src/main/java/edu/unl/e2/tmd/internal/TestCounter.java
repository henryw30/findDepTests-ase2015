package edu.unl.e2.tmd.internal;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class TestCounter extends MyAbstractJUnitRule {



	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isJUnitMethod(node, data)){
			addViolation(data, node);
		}
		
		
		return data;
	}

	
	
}
