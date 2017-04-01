package edu.unl.e2.tmd;

import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;

public class LoggerRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTStatementExpression node, Object data) {
		
		ASTPrimaryPrefix prefix = node.getFirstDescendantOfType(ASTPrimaryPrefix.class);
		
		if(prefix!=null){
			
			ASTName name= prefix.getFirstChildOfType(ASTName.class);
			

			if(name!=null){
				String[] methodCall = name.getImage().split("\\.");
				
				if(methodCall.length==2){
					
					if(methodCall[1].equals("info")||methodCall[1].equals("debug")||methodCall[1].equals("error")||methodCall[1].startsWith("warn")){
						addViolation(data, node);
						
						
					}
				}
			}
			

		}
		
		return data;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			return super.visit(node, data);
		}
		
		return data;
	}

	
	
}
