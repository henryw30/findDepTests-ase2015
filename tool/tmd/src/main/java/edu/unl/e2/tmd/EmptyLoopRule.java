package edu.unl.e2.tmd;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTBlock;
import net.sourceforge.pmd.lang.java.ast.ASTBlockStatement;
import net.sourceforge.pmd.lang.java.ast.ASTDoStatement;
import net.sourceforge.pmd.lang.java.ast.ASTEmptyStatement;
import net.sourceforge.pmd.lang.java.ast.ASTFinallyStatement;
import net.sourceforge.pmd.lang.java.ast.ASTForStatement;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTWhileStatement;


public class EmptyLoopRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTWhileStatement node, Object data) {
	
		Node block= node.jjtGetChild(1);
		if(block.getFirstDescendantOfType(ASTEmptyStatement.class)!=null || block.getFirstDescendantOfType(ASTBlock.class)!=null && block.getFirstDescendantOfType(ASTBlockStatement.class)==null ){
			if( node.getFirstDescendantOfType(ASTName.class)!=null && node.getFirstDescendantOfType(ASTName.class).getImage().contains(".") ){
				return data;
			}

			addViolation(data, node);
		}
		
		return data;
	}
	
	@Override
	public Object visit(ASTForStatement node, Object data) {
		Node block=null;
		if(node.jjtGetNumChildren()>1){
			block= node.jjtGetChild(1);
		}else{
			block= node.jjtGetChild(0);
		}
		if(block.getFirstDescendantOfType(ASTEmptyStatement.class)!=null || block.getFirstDescendantOfType(ASTBlock.class)!=null && block.getFirstDescendantOfType(ASTBlockStatement.class)==null ){
			if( node.getFirstDescendantOfType(ASTName.class)!=null && node.getFirstDescendantOfType(ASTName.class).getImage().contains(".") ){
				return data;
			}

			addViolation(data, node);
		}
		
		return data;
	}
	

	
	@Override
	public Object visit(ASTDoStatement node, Object data) {

		Node block= node.jjtGetChild(0);
		if(block.getFirstDescendantOfType(ASTEmptyStatement.class)!=null || block.getFirstDescendantOfType(ASTBlock.class)!=null && block.getFirstDescendantOfType(ASTBlockStatement.class)==null ){
			if( node.getFirstDescendantOfType(ASTName.class)!=null && node.getFirstDescendantOfType(ASTName.class).getImage().contains(".") ){
				return data;
			}

			addViolation(data, node);
		}
		
		return data;
	}
	
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		if(isJUnitMethod(node, data) && !isIgnored(node)){
			return super.visit(node, data);
		}
		
		return data;
	}
	
}
