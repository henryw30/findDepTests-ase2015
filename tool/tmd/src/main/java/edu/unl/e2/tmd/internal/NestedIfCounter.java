package edu.unl.e2.tmd.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTIfStatement;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import edu.unl.e2.tmd.MyAbstractJUnitRule;

public class NestedIfCounter extends MyAbstractJUnitRule {


	List<ASTIfStatement> alreadyAnalized=Lists.newArrayList();
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {		
		Object visit = super.visit(node, data);

		alreadyAnalized.clear();
		return visit;
	}
	
	
	
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isJUnitMethod(node, data)){
			check(data, node.findDescendantsOfType(ASTIfStatement.class));
		}
		
		return data;
	}

	private void check(Object data, List<ASTIfStatement> findDescendantsOfType) {
		
		List<ASTIfStatement> newList= Lists.newArrayList(findDescendantsOfType);
		
		newList.removeAll(alreadyAnalized);
		
		for(ASTIfStatement ifNode: newList){
			alreadyAnalized.add(ifNode);
			
			check(data, ifNode);
			
		}
	}



	private void check(Object data, ASTIfStatement ifNode) {
		List<ASTIfStatement> nesteadIfs = ifNode.jjtGetChild(1).findDescendantsOfType(ASTIfStatement.class);
		nesteadIfs.removeAll(alreadyAnalized);
		check(data,nesteadIfs);

			if(!nesteadIfs.isEmpty()){
				addViolation(data, nesteadIfs.get(0));
			}
		
		if(ifNode.hasElse()){
			
			Node elseNode = ifNode.jjtGetChild(2).jjtGetChild(0);

			if(!(elseNode instanceof ASTIfStatement)){
			
				nesteadIfs = elseNode.findDescendantsOfType(ASTIfStatement.class);
				nesteadIfs.removeAll(alreadyAnalized);
				check(data,nesteadIfs);
				
				if(!nesteadIfs.isEmpty()){
					addViolation(data, nesteadIfs.get(0));
				}
			}else{
				check(data,(ASTIfStatement)elseNode);
			}
			
		}
	}

	
	
}
