package edu.unl.e2.tmd;

import java.util.List;
import java.util.Map;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTArguments;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceBodyDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTExpression;
import net.sourceforge.pmd.lang.java.ast.ASTFormalParameters;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTLocalVariableDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMemberValuePair;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTNormalAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTNullLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTTryStatement;
import net.sourceforge.pmd.lang.java.ast.ASTVariableInitializer;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;

public class FixValuesInHomeMadeAssertionsRule extends MyAbstractJUnitRule {

	
	
	@Override
	public Object visit(ASTStatementExpression node, Object data) {
		
		String assertion = getMethodName(node);
		
		if(assertion != null && (assertion.startsWith("assert") || assertion.startsWith("Assert.assert"))){
			
			ASTMethodDeclaration method = node.getFirstParentOfType(ASTMethodDeclaration.class);
			if(method !=null && !isJUnitMethod(method, data)){
				
				if(method.getFirstDescendantOfType(ASTFormalParameters.class).getParameterCount()==0){
					return data;
				}
				
				
				List<ASTLiteral> literals = node.findDescendantsOfType(ASTLiteral.class);
				ASTArguments arguments = node.getFirstDescendantOfType(ASTArguments.class);
				if(isAssertionWithMessage(assertion, arguments)){
					List<ASTLiteral> messageLiterals = arguments.jjtGetChild(0).jjtGetChild(0).findDescendantsOfType(ASTLiteral.class);
					
					for(ASTLiteral literal : literals){
						if(literal.getFirstChildOfType(ASTNullLiteral.class)==null && !messageLiterals.contains(literal) && literal.getFirstParentOfType(ASTPrimaryExpression.class).getNthParent(3).equals(arguments)){
							addViolation(data, node);
							return data;
						}
					}
					
				}else{
					if(!literals.isEmpty()){
						
						for(ASTLiteral literal : literals){
							if(literal.getFirstChildOfType(ASTNullLiteral.class)==null  && literal.getFirstParentOfType(ASTPrimaryExpression.class).getNthParent(3).equals(arguments)){
								addViolation(data, node);
								return data;
							}
						}
					}
				}
				
			}
			
		}
		
		return data;
	}
	
	

	@Override
	public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {
		
		if(node.isNested()){
			return data;
		}
		
		return  super.visit(node, data);
	}



	private String getMethodName(ASTStatementExpression expression) {
		if (expression!=null
                && expression.jjtGetNumChildren()>0
                && expression.jjtGetChild(0) instanceof ASTPrimaryExpression
                ) {
            ASTPrimaryExpression pe = (ASTPrimaryExpression) expression.jjtGetChild(0);
            if (pe.jjtGetNumChildren()> 0 && pe.jjtGetChild(0) instanceof ASTPrimaryPrefix) {
                ASTPrimaryPrefix pp = (ASTPrimaryPrefix) pe.jjtGetChild(0);
                if (pp.jjtGetNumChildren()>0 && pp.jjtGetChild(0) instanceof ASTName) {
                    return ((ASTName) pp.jjtGetChild(0)).getImage();
                }
            }
        }
		
		return null;
	}

	private boolean isAssertionWithMessage(String assertion, ASTArguments arguments) {
		return assertion.contains("assertArrayEquals") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertEquals") && arguments.getArgumentCount()>=3 ||
			assertion.contains("assertFalse") && arguments.getArgumentCount()==2 ||
			assertion.contains("assertNotNull") && arguments.getArgumentCount()==2 ||
			assertion.contains("assertNotSame") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertNull") && arguments.getArgumentCount()==2 ||
			assertion.contains("assertSame") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertThat") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertTrue") && arguments.getArgumentCount()==2;
	}

}
