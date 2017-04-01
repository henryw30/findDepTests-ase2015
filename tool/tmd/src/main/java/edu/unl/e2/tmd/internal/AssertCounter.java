package edu.unl.e2.tmd.internal;


import java.util.List;

import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMemberValuePair;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTNormalAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule;


public class AssertCounter extends AbstractJUnitRule {

    @Override
    public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {
        if (node.isInterface()) {
            return data;
        }
        return super.visit(node, data);
    }

    @Override
    public Object visit(ASTStatementExpression node, Object data) {
    	if (isAssertOrFailStatement(node)) {
            addViolation(data, node);
        }
    	return data;
	}
    
    @Override
    public Object visit(ASTNormalAnnotation node, Object data) {

    	ASTName name = node.getFirstChildOfType(ASTName.class);
        if (name != null && ("Test".equals(name.getImage())
                || (name.getType() != null && name.getType().equals(JUNIT4_CLASS)))) {
            List<ASTMemberValuePair> memberValues = node.findDescendantsOfType(ASTMemberValuePair.class);
            for (ASTMemberValuePair pair : memberValues) {
                if ("expected".equals(pair.getImage())) {
                   addViolation(data, node);
                }
            }
        }
    	return data;
	}

    /**
     * Tells if the expression is an assert statement or not.
     */
    private boolean isAssertOrFailStatement(ASTStatementExpression expression) {
        if (expression!=null
                && expression.jjtGetNumChildren()>0
                && expression.jjtGetChild(0) instanceof ASTPrimaryExpression
                ) {
            ASTPrimaryExpression pe = (ASTPrimaryExpression) expression.jjtGetChild(0);
            if (pe.jjtGetNumChildren()> 0 && pe.jjtGetChild(0) instanceof ASTPrimaryPrefix) {
                ASTPrimaryPrefix pp = (ASTPrimaryPrefix) pe.jjtGetChild(0);
                if (pp.jjtGetNumChildren()>0 && pp.jjtGetChild(0) instanceof ASTName) {
                    String img = ((ASTName) pp.jjtGetChild(0)).getImage();
                    if (img != null && (img.startsWith("assert") || img.startsWith("fail") || img.startsWith("Assert.assert") || img.startsWith("Assert.fail") )) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
