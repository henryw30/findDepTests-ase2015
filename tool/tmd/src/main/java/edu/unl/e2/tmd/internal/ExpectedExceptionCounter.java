package edu.unl.e2.tmd.internal;

import java.util.List;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTCatchStatement;
import net.sourceforge.pmd.lang.java.ast.ASTMemberValuePair;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTNormalAnnotation;

public class ExpectedExceptionCounter extends MyAbstractJUnitRule {


	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isJUnitMethod(node,data)){
			
			if(containsExpect(node.jjtGetParent())){				
				addViolation(data, node);
			}
			
			return super.visit(node, data);
		}
		
		return data;
	}

	
	@Override
	public Object visit(ASTCatchStatement node, Object data) {
		
		addViolation(data, node);
		return data;
	}

    /**
     * Tells if the node contains a Test annotation with an expected exception.
     */
    private boolean containsExpect(Node methodParent) {
        List<ASTNormalAnnotation> annotations = methodParent.findDescendantsOfType(ASTNormalAnnotation.class);
        for (ASTNormalAnnotation annotation : annotations) {
            ASTName name = annotation.getFirstChildOfType(ASTName.class);
            if (name != null && ("Test".equals(name.getImage())
                    || (name.getType() != null && name.getType().equals(JUNIT4_CLASS)))) {
                List<ASTMemberValuePair> memberValues = annotation.findDescendantsOfType(ASTMemberValuePair.class);
                for (ASTMemberValuePair pair : memberValues) {
                    if ("expected".equals(pair.getImage())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
	
	
}
