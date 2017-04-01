package edu.unl.e2.tmd;


import java.util.List;
import java.util.Map;

import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

public class RuntimeExecRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTPrimaryExpression node, Object data) {
		
		if(node.jjtGetNumChildren()==2){
			ASTPrimaryPrefix prefix = node.getFirstDescendantOfType(ASTPrimaryPrefix.class);
			
			if(prefix!=null){
				
				ASTName name= prefix.getFirstChildOfType(ASTName.class);
				
				String variableName="";
				if(name!=null){
					String[] methodCall = name.getImage().split("\\.");
					
					if(methodCall.length==2){
						
						if(methodCall[1].startsWith("exec")){
							
								variableName=methodCall[0];
	
						}
					}
				}
				
				if(!variableName.equals("")){
					Scope scope = node.getScope();
					
					while(scope !=null){
					
						Map<VariableNameDeclaration, List<NameOccurrence>> declarations = scope.getDeclarations(VariableNameDeclaration.class);
						
						for(VariableNameDeclaration declaration: declarations.keySet()){
						
							if(!declaration.getName().equals(variableName)){
								continue;
							}
							
							Class<?> type = declaration.getType();
							
							if(type!=null && Runtime.class.isAssignableFrom(type)){
								addViolation(data, node);
								
								return data;
							}else{
								break;
							}
							
						}
						
						scope=scope.getParent();
					}
				}
			}
			
		}else if(node.jjtGetNumChildren()>2){
			ASTPrimaryPrefix prefix = node.getFirstDescendantOfType(ASTPrimaryPrefix.class);
			
			if(prefix!=null){
				ASTName name= prefix.getFirstChildOfType(ASTName.class);
				
				if(name!=null && !name.getImage().contains("Runtime")){
					return data;
				}
				
				for(ASTPrimarySuffix suffix:node.findChildrenOfType(ASTPrimarySuffix.class)){
					
					if(suffix.hasImageEqualTo("exec")){
						addViolation(data, node);
						break;
					}
				}
			}
		}
		
		
		return super.visit(node, data);
	}

	
	
/*
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		 if(isJUnitMethod(node, data)){
			return super.visit(node, data);
		}
		 
		return data;
	}
*/	
	

	@Override
	public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {
		
		if(node.isNested()){
			return data;
		}
		
		return super.visit(node, data);
	}
	
	
}
