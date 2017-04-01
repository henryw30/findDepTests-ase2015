package edu.unl.e2.tmd.internal;

import java.util.List;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTImportDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;

public class WhenCounter extends MyAbstractJUnitRule {

	private boolean isWhenImported=false;

	
	
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = super.visit(node, data);
		
		isWhenImported=false;
		
		return visit;
	}




	@Override
	public Object visit(ASTImportDeclaration node, Object data) {
		
		String packageName = node.getFirstChildOfType(ASTName.class).getImage();
		if(packageName.equals("org.mockito.Mockito.when")){
			isWhenImported=true;
		}else if(node.isImportOnDemand() && node.getPackageName().equals("org.mockito.Mockito")){			
			isWhenImported=true;
		}
		
		return data;
	}

	
	
	
	@Override
	public Object visit(ASTPrimaryExpression node, Object data) {

		if(isWhenImported){
			
			ASTName nameNode = node.getFirstDescendantOfType(ASTName.class);
			List<ASTPrimarySuffix> suffixes = node.findChildrenOfType(ASTPrimarySuffix.class);
			if(nameNode!=null && nameNode.hasImageEqualTo("when") && suffixes.size()==3){

				addViolation(data, nameNode);
			} 
		}
		
		return data;
	}




	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		if(isJUnitMethod(node, data)){
			return super.visit(node, data);
		}
		
		return data;
	}
}
