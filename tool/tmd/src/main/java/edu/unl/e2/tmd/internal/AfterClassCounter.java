package edu.unl.e2.tmd.internal;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class AfterClassCounter extends MyAbstractJUnitRule {


	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isAfterClass(node)){
			addViolation(data, node);
		}
		
		return data;
	}

	
	
}
