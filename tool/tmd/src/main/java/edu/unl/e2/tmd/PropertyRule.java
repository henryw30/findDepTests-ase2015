package edu.unl.e2.tmd;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.pmd.lang.java.ast.ASTArgumentList;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTConstructorDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTInitializer;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class PropertyRule extends MyAbstractJUnitRule {
	
	private Map<String,Set<ASTMethodDeclaration>> properties=Maps.newHashMap();
	private ASTMethodDeclaration setUp;
	private ASTMethodDeclaration tearDown;
	private Set<ASTMethodDeclaration> tests=Sets.newHashSet();
	
	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = data;
		try{
			visit = super.visit(node, data);
			
			if (isJUnit3Class || isJUnit4Class) {
			
				for(String property:properties.keySet()){
	
					if(setUp!=null){
						
						boolean isValid=false;
						
						for(ASTStatementExpression statement: setUp.findDescendantsOfType(ASTStatementExpression.class)){
							ASTPrimaryPrefix prefix = statement.getFirstDescendantOfType(ASTPrimaryPrefix.class);
							
							if(prefix==null){
								return data;
							}
	
							ASTName name= statement.getFirstDescendantOfType(ASTName.class);
							
							if(name!=null &&   name.hasImageEqualTo("System.setProperty")){
									
								ASTArgumentList arguments= statement.getFirstDescendantOfType(ASTArgumentList.class);
								
								if(arguments!=null && arguments.jjtGetNumChildren()==2){
									ASTLiteral propertyName = arguments.jjtGetChild(0).getFirstDescendantOfType(ASTLiteral.class);
									String newProperty = null;
									
									if(propertyName !=null){
										newProperty = propertyName.getImage();
									}else{
										ASTName propertyVariable = arguments.jjtGetChild(0).getFirstDescendantOfType(ASTName.class);
										
										if(propertyVariable!=null){
										
											Scope scope = statement.getScope();
											
											while(scope!=null){
		
												Map<VariableNameDeclaration, List<NameOccurrence>> declarations = scope.getDeclarations(VariableNameDeclaration.class);
												
												for(VariableNameDeclaration declaration : declarations.keySet()){
													
													if(!propertyVariable.hasImageEqualTo(declaration.getName())){
														continue;
													}
													
													propertyName=declaration.getAccessNodeParent().getFirstDescendantOfType(ASTLiteral.class);
													newProperty = propertyName.getImage();
													break;
													
												}
												
												scope=scope.getParent();
											}
										}
										
									}
									isValid=newProperty!=null;
								}
							}
	
						}
						
						
						if(isValid){
							continue;
						}
					}
					
					
					if(tearDown!=null){
						
						boolean isValid=false;
						
						for(ASTStatementExpression statement: tearDown.findDescendantsOfType(ASTStatementExpression.class)){
							ASTPrimaryPrefix prefix = statement.getFirstDescendantOfType(ASTPrimaryPrefix.class);
							
							if(prefix==null){
								return data;
							}
	
							ASTName name= statement.getFirstDescendantOfType(ASTName.class);
							
							if(name!=null &&   name.hasImageEqualTo("System.setProperty")){
									
								ASTArgumentList arguments= statement.getFirstDescendantOfType(ASTArgumentList.class);
								
								if(arguments!=null && arguments.jjtGetNumChildren()==2){
									ASTLiteral propertyName = arguments.jjtGetChild(0).getFirstDescendantOfType(ASTLiteral.class);
									String newProperty = null;
									
									if(propertyName !=null){
										newProperty = propertyName.getImage();
									}else{
										ASTName propertyVariable = arguments.jjtGetChild(0).getFirstDescendantOfType(ASTName.class);
										
										if(propertyVariable!=null){
										
											Scope scope = statement.getScope();
											
											while(scope!=null){
		
												Map<VariableNameDeclaration, List<NameOccurrence>> declarations = scope.getDeclarations(VariableNameDeclaration.class);
												
												for(VariableNameDeclaration declaration : declarations.keySet()){
													
													if(!propertyVariable.hasImageEqualTo(declaration.getName())){
														continue;
													}
													
													propertyName=declaration.getAccessNodeParent().getFirstDescendantOfType(ASTLiteral.class);
													newProperty = propertyName.getImage();
													break;
													
												}
												
												scope=scope.getParent();
											}
										}
										
									}
									isValid=newProperty!=null;
								}
							}
	
						}
						
						
						if(isValid){
							continue;
						}
					}
					
					
					for(ASTMethodDeclaration test: tests){
						
						for(ASTPrimaryExpression expression : test.findDescendantsOfType(ASTPrimaryExpression.class)){
							
							ASTPrimaryPrefix prefix = expression.getFirstDescendantOfType(ASTPrimaryPrefix.class);
							
							if(prefix==null){
								continue;
							}
																
							ASTName name= expression.getFirstDescendantOfType(ASTName.class);
							
							if(name!=null &&   name.hasImageEqualTo("System.getProperty")){
									
								ASTArgumentList arguments= expression.getFirstDescendantOfType(ASTArgumentList.class);
								
								if(arguments!=null && arguments.jjtGetNumChildren()<3){
									ASTLiteral propertyName = arguments.getFirstDescendantOfType(ASTLiteral.class);
									String getProperty = null;
									if(propertyName !=null){
										getProperty = propertyName.getImage();
									}else{
										ASTName propertyVariable = arguments.getFirstDescendantOfType(ASTName.class);
										
										Scope scope = expression.getScope();
										
										while(scope!=null){
	
											Map<VariableNameDeclaration, List<NameOccurrence>> declarations = scope.getDeclarations(VariableNameDeclaration.class);
											
											for(VariableNameDeclaration declaration : declarations.keySet()){
												
												if(!propertyVariable.hasImageEqualTo(declaration.getName())){
													continue;
												}
												
												propertyName=declaration.getAccessNodeParent().getFirstDescendantOfType(ASTLiteral.class);
												getProperty = propertyName.getImage();
												break;
												
											}
											
											scope=scope.getParent();
										}
										
										
									}
									
									if(getProperty !=null && getProperty.equals(property)){
										Set<ASTMethodDeclaration> propertySetters = properties.get(property);
										if(propertySetters.size()==1 &&  !propertySetters.contains(test) || propertySetters.size()>1 && propertySetters.contains(test)){
											addViolation(data, expression);
										}
									}
								}
							}
						}	
						
					}
				}	
					
			}
		}finally{
			setUp=null;
			tearDown=null;
			properties.clear();
			tests.clear();
		}
		return visit;
	}
	
	
	
	@Override
	public Object visit(ASTStatementExpression statement, Object data) {
		
		ASTPrimaryPrefix prefix = statement.getFirstDescendantOfType(ASTPrimaryPrefix.class);
		
		if(prefix==null){
			return data;
		}


			
		ASTName name= statement.getFirstDescendantOfType(ASTName.class);
		
		if(name!=null &&   name.hasImageEqualTo("System.setProperty")){
				
			ASTArgumentList arguments= statement.getFirstDescendantOfType(ASTArgumentList.class);
			
			if(arguments!=null && arguments.jjtGetNumChildren()==2){
				ASTLiteral propertyName = arguments.jjtGetChild(0).getFirstDescendantOfType(ASTLiteral.class);
				String property = null;
				
				if(propertyName !=null){
					property = propertyName.getImage();
				}else{
					ASTName propertyVariable = arguments.jjtGetChild(0).getFirstDescendantOfType(ASTName.class);
					
					if(propertyVariable!=null){
						Scope scope = statement.getScope();
						
						while(scope!=null){
	
							Map<VariableNameDeclaration, List<NameOccurrence>> declarations = scope.getDeclarations(VariableNameDeclaration.class);
							
							for(VariableNameDeclaration declaration : declarations.keySet()){
								
								if(!propertyVariable.hasImageEqualTo(declaration.getName())){
									continue;
								}
								
								propertyName=declaration.getAccessNodeParent().getFirstDescendantOfType(ASTLiteral.class);
								property = propertyName.getImage();
								break;
								
							}
							
							scope=scope.getParent();
						}
					}
					
					
				}
				if(property!=null){
					if(!properties.containsKey(property)){
						properties.put(property,new HashSet<ASTMethodDeclaration>());
					}
					
					ASTMethodDeclaration method = statement.getFirstParentOfType(ASTMethodDeclaration.class);
					
					if(method==null){
						throw new RuntimeException("This should not happen.");
					}
					
					properties.get(property).add(method);
				}
			}
		}


		
		return data;
	}


	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			tests.add(node);
			return super.visit(node, data);
		}else if(isSetUp(node)){
			setUp=node;
		}else if(isTearDown(node)){
			tearDown=node;
		}
		 
		return data;
	}

	@Override
    public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {
        if(node.isNested()){   
        	return data;
        }
        
        return super.visit(node, data);
    }

	@Override
    public Object visit(ASTConstructorDeclaration node, Object data) {
        	return data;
    }
	
	@Override
	public Object visit(ASTInitializer node, Object data) {
		if(node.isStatic()){
			return data;
		}
		
		return super.visit(node, data);
	}
}
