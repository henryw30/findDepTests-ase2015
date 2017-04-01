package edu.unl.e2.tmd.internal;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

public class ScannerCounter extends MyAbstractJUnitRule {



	@Override
	public Object visit(ASTPrimaryExpression node, Object data) {
		
		ASTPrimaryPrefix prefix = node.getFirstDescendantOfType(ASTPrimaryPrefix.class);
		
		if(prefix!=null){
			
			ASTName name= prefix.getFirstChildOfType(ASTName.class);
			
			String variableName="";
			if(name!=null){
				String[] methodCall = name.getImage().split("\\.");
				
				if(methodCall.length==2){
					
					if(methodCall[1].startsWith("next")){
						
						if(node.jjtGetNumChildren()==2){
					
							variableName=methodCall[0];

						}
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
						
						if(type!=null && Scanner.class.isAssignableFrom(type)){
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
