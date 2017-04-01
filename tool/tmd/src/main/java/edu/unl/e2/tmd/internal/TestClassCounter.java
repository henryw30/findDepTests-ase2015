package edu.unl.e2.tmd.internal;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class TestClassCounter extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTCompilationUnit node, Object data) {

		super.visit(node, data);
		
		if(isJUnit3Class || isJUnit4Class){
			addViolation(data, node);
		}
		
		return data;
	}


	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		return data;
	}

    @Override
    public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {
        return data;
    }
	
	
}
