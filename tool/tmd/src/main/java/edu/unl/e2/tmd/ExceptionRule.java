package edu.unl.e2.tmd;

import java.util.List;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTCatchStatement;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceType;
import net.sourceforge.pmd.lang.java.ast.ASTFormalParameter;
import net.sourceforge.pmd.lang.java.ast.ASTMemberValuePair;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTNormalAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTThrowStatement;
import net.sourceforge.pmd.lang.java.ast.ASTType;
import net.sourceforge.pmd.lang.java.ast.ASTVariableDeclaratorId;

public class ExceptionRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(!isJUnitMethod(node, data) || isIgnored(node)){			
			return data;
		}

		if(isJUnit4Class){
			List<ASTNormalAnnotation> annotations = node.jjtGetParent().findDescendantsOfType(ASTNormalAnnotation.class);
	        for (ASTNormalAnnotation annotation : annotations) {
	            ASTName name = annotation.getFirstChildOfType(ASTName.class);
	            if (name != null && ("Test".equals(name.getImage())
	                    || (name.getType() != null && name.getType().equals(JUNIT4_CLASS)))) {
	                List<ASTMemberValuePair> memberValues = annotation.findDescendantsOfType(ASTMemberValuePair.class);
	                for (ASTMemberValuePair pair : memberValues) {
	                    if ("expected".equals(pair.getImage())) {
	                    	String type = pair.getFirstDescendantOfType(ASTClassOrInterfaceType.class).getImage();
	                    	if(type.equals("Exception") || type.equals("RuntimeException")){
	                			addViolation(data, node);
	                		}
	                    	break;
	                    }
	                }
	                break;
	            }
	        }
		}
		
		return super.visit(node, data);
	}

	@Override
	public Object visit(ASTCatchStatement node, Object data) {
		
		ASTFormalParameter catchDeclaration = node.getFirstChildOfType(ASTFormalParameter.class);
				
		final String varaibleName = catchDeclaration.getFirstChildOfType(ASTVariableDeclaratorId.class).getImage();
		String typeImage = catchDeclaration.getFirstChildOfType(ASTType.class).getTypeImage();
		
		if(typeImage.equals("Exception") || typeImage.equals("RuntimeException")){
			
			final Lock violationFound=new Lock();

			containsAssert(node.jjtGetChild(1),new StatementFinder() {


				@Override
				public void onStatementFound(ASTStatementExpression expression) {
					
					ASTPrimaryExpression pe = (ASTPrimaryExpression) expression.jjtGetChild(0);
		            if (pe.jjtGetNumChildren()> 0 && pe.jjtGetChild(0) instanceof ASTPrimaryPrefix) {
		                ASTPrimaryPrefix pp = (ASTPrimaryPrefix) pe.jjtGetChild(0);
		                if (pp.jjtGetNumChildren()>0 && pp.jjtGetChild(0) instanceof ASTName) {
		                    String img = ((ASTName) pp.jjtGetChild(0)).getImage();
		                    if (img != null) {
		                    	if (img.startsWith("fail") || img.startsWith("Assert.fail") ) {
			                        violationFound.lock();
			                    }
		                    	else if (img.startsWith("assert") || img.startsWith("Assert.assert")  ) {
		                    		if(pe.jjtGetNumChildren()> 1){
		                    			for(ASTName name: pe.jjtGetChild(1).findDescendantsOfType(ASTName.class)){
		                    				if(name.hasImageEqualTo(varaibleName) || name.getImage().startsWith(varaibleName+".")){	
		                    					violationFound.lock();
		                    					break;
		                    				}
		                    			}
		                    		}
			                    }
		                    }
		                }
		            }
					
				}	
			});
			
			if(!violationFound.isLock()){
				if(node.findDescendantsOfType(ASTThrowStatement.class).isEmpty()){
					addViolation(data, node);
				}
			}

		}
		
		return super.visit(node, data);
	}
	
	private class Lock{

		private boolean isLock = false;

		public boolean isLock() {
			return isLock;
		}

		public void lock() {
			isLock=true;
		}
		
	}

	private void containsAssert(Node n,StatementFinder finder) {

        if (n instanceof ASTStatementExpression) {
            if (isAssertOrFailStatement((ASTStatementExpression)n)) {
                finder.onStatementFound((ASTStatementExpression)n);
            }
        }else{
            for (int i=0;i<n.jjtGetNumChildren();i++) {
                Node c = n.jjtGetChild(i);
                containsAssert(c,finder);
            }
        }
       

    }
	
	private interface StatementFinder{

		void onStatementFound(ASTStatementExpression expression);
		
	}

}
