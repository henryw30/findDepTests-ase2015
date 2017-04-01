package edu.unl.e2.tmd.internal;

import java.util.List;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTImportDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;

public class VerifyCounter extends MyAbstractJUnitRule {

	private boolean isVerifyImported=false;

	
	
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = super.visit(node, data);
		
		
		isVerifyImported=false;
		
		return visit;
	}




	@Override
	public Object visit(ASTImportDeclaration node, Object data) {
		
		String packageName = node.getFirstChildOfType(ASTName.class).getImage();
		 if(packageName.equals("org.mockito.Mockito.verify")){
			isVerifyImported=true;
		}
		else if(node.isImportOnDemand() && node.getPackageName().equals("org.mockito.Mockito")){			
			isVerifyImported=true;
		}
		
		return data;
	}

	
	
	
	@Override
	public Object visit(ASTPrimaryExpression node, Object data) {

		if(isVerifyImported){
			
			ASTName nameNode = node.getFirstDescendantOfType(ASTName.class);
			List<ASTPrimarySuffix> suffixes = node.findChildrenOfType(ASTPrimarySuffix.class);
			if(nameNode!=null && nameNode.hasImageEqualTo("verify") && suffixes.size()==3){

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
