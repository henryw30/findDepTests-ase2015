package edu.unl.e2.tmd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;

import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTImportDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;

public class MocksShouldBeMinimizedRule extends MyAbstractJUnitRule {

	private boolean isWhenImported=false;
	private boolean isVerifyImported=false;
	private  Map<String,List<String>> whens=new HashMap<>();

	
	
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit =data;
		try{
			visit = super.visit(node, data);
		}finally{
			isWhenImported=false;
			isVerifyImported=false;
			whens.clear();
		}
		return visit;
	}




	@Override
	public Object visit(ASTImportDeclaration node, Object data) {
		
		String packageName = node.getFirstChildOfType(ASTName.class).getImage();
		if(packageName.equals("org.mockito.Mockito.when")){
			isWhenImported=true;
		}
		else if(packageName.equals("org.mockito.Mockito.verify")){
			isVerifyImported=true;
		}
		else if(node.isImportOnDemand() && node.getPackageName().equals("org.mockito.Mockito")){			
			isWhenImported=true;
			isVerifyImported=true;
		}
		
		return data;
	}

	
	
	
	@Override
	public Object visit(ASTPrimaryExpression node, Object data) {

		if(isWhenImported && isVerifyImported){
			
			ASTName nameNode = node.getFirstDescendantOfType(ASTName.class);
			List<ASTPrimarySuffix> suffixes = node.findChildrenOfType(ASTPrimarySuffix.class);
			if(nameNode!=null && nameNode.hasImageEqualTo("when") && suffixes.size()==3 && suffixes.get(1).hasImageEqualTo("thenReturn")){

				String stubDeclaration = suffixes.get(0).getFirstDescendantOfType(ASTName.class).getImage();
				String[] split = stubDeclaration.split("\\.");
				
				if(!whens.containsKey(split[0])){
					whens.put(split[0], Lists.newArrayList(split[1]));
				}else{
					whens.get(split[0]).add(split[1]);
				}
				
			} else if(nameNode!=null && nameNode.hasImageEqualTo("verify") && suffixes.size()==3){

				String stubDeclaration = suffixes.get(0).getFirstDescendantOfType(ASTName.class).getImage();
				
				if(whens.containsKey(stubDeclaration) && whens.get(stubDeclaration).contains(suffixes.get(1).getImage())){
					addViolation(data,node);
				}
			}
			
			
		}
		
		return data;
	}




	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			whens.clear();
			return super.visit(node, data);
		}
		
		return data;
	}
}
