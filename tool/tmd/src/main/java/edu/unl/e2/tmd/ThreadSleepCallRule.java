package edu.unl.e2.tmd;

import net.sourceforge.pmd.lang.java.ast.ASTDoStatement;
import net.sourceforge.pmd.lang.java.ast.ASTForStatement;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTWhileStatement;

public class ThreadSleepCallRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTStatementExpression node, Object data) {
		
		ASTPrimaryPrefix prefix = node.getFirstDescendantOfType(ASTPrimaryPrefix.class);
		
		if(prefix!=null){
			
			ASTName name= prefix.getFirstChildOfType(ASTName.class);
			
			if(name!=null && name.getImage().startsWith("Thread.sleep") && (name.getFirstParentOfType(ASTWhileStatement.class)==null &&
					name.getFirstParentOfType(ASTForStatement.class)==null &&
					name.getFirstParentOfType(ASTDoStatement.class)==null)){		
				addViolation(data, node);
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