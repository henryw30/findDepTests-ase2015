package edu.unl.e2.tmd;

import java.util.Set;

import com.google.common.collect.Sets;

import net.sourceforge.pmd.lang.java.ast.ASTAllocationExpression;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceType;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTImportDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule;


public class RefactorNewCallsRule extends AbstractJUnitRule {

	Set<String> importedClasses=Sets.newHashSet();
    
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = data;
		try{
			visit = super.visit(node, data);
		}finally{
			importedClasses.clear();
		}

		return visit;
	}
	
	
	
	@Override
	public Object visit(ASTImportDeclaration node, Object data) {

		if(!node.isStatic() && !node.isImportOnDemand()){
			String[] className = node.getImportedName().split("\\.");
			importedClasses.add(className[className.length-1]);
		}
		
		return data;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(!isJUnitMethod(node, data)){
			return data;
		}
		
		return super.visit(node, data);
	}

	@Override
	public Object visit(ASTAllocationExpression node, Object data) {

			ASTClassOrInterfaceType typeDeclaration = node.getFirstChildOfType(ASTClassOrInterfaceType.class);
			boolean violationDectected=false;
			
			
			if(typeDeclaration!=null){
				
				
				String canonicalName = "";
				
				Class<?> type = typeDeclaration.getType();
				
				if(type!=null){
					canonicalName = type.getCanonicalName();
				}
				
				violationDectected=!canonicalName.startsWith("java") && !importedClasses.contains(typeDeclaration.getImage());
			}
			
			if( violationDectected){
				addViolation(data, node);			
			}
			
			return data;
	}


	

}
