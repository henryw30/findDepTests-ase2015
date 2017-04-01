package edu.unl.e2.tmd;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTBooleanLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

public class ShouldNotUseReflectionRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTStatementExpression node, Object data) {
		
		ASTPrimaryPrefix prefix = node.getFirstDescendantOfType(ASTPrimaryPrefix.class);
		
		if(prefix!=null){
			
			ASTName name= prefix.getFirstChildOfType(ASTName.class);
			
			String variableName="";
			if(name!=null){
				String[] methodCall = name.getImage().split("\\.");
				
				if(methodCall.length==2){
					
					if(methodCall[1].equals("setAccessible")){
						
						Node expression = prefix.jjtGetParent();
						if(expression.jjtGetNumChildren()==2){
					
							ASTBooleanLiteral literal = expression.getFirstDescendantOfType(ASTBooleanLiteral.class);
							if(literal!=null && literal.isTrue()){
							
								variableName=methodCall[0];
							}
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
						
						if(type!=null && (type.equals(Field.class) || type.equals(Method.class))){
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
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			return super.visit(node, data);
		}
		
		return data;
	}

	
	
}
