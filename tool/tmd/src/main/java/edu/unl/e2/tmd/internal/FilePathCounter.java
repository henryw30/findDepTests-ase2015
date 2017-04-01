package edu.unl.e2.tmd.internal;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class FilePathCounter extends MyAbstractJUnitRule {


	@Override
	public Object visit(ASTLiteral node, Object data) {
		
		if(node.isStringLiteral() && node.getImage().matches("[A-Za-z]:\\\\")){
			addViolation(data, node);
		}
		
		return data;
	}

	
	
}
