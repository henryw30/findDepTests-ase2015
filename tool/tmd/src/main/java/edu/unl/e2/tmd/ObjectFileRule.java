package edu.unl.e2.tmd;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTAllocationExpression;
import net.sourceforge.pmd.lang.java.ast.ASTAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTArguments;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceType;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTExpression;
import net.sourceforge.pmd.lang.java.ast.ASTFieldDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTLocalVariableDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTTypeDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTVariableDeclaratorId;
import net.sourceforge.pmd.lang.java.ast.AccessNode;
import net.sourceforge.pmd.lang.java.ast.TypeNode;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class ObjectFileRule extends MyAbstractJUnitRule {

	private final Map<String, Set<ASTMethodDeclaration>> writingPaths = Maps.newHashMap();
	private final Map<String, Set<ASTMethodDeclaration>> readingPaths = Maps.newHashMap();
	private final Map<Node, String> nameTable = Maps.newHashMap();
	private ASTMethodDeclaration setUp;
	private ASTMethodDeclaration tearDown;
	private Set<ASTMethodDeclaration> tests = Sets.newHashSet();

	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit =  data;
		try{
			visit = super.visit(node, data);

			if (isJUnit3Class || isJUnit4Class) {
				

				checkForFixOrderAnnotation(node);
				
				if(tests.size()<=1){
					return visit;
				}

				Set<String> intersectingPaths = Sets.intersection(writingPaths.keySet(), readingPaths.keySet());
				
				for(String path : intersectingPaths){
					
					if(writingPaths.get(path).contains(setUp) || writingPaths.get(path).contains(tearDown)){
						continue;
					}
					
					Set<ASTMethodDeclaration> writingTests = Sets.intersection(tests, writingPaths.get(path));
					Set<ASTMethodDeclaration> readingTests = Sets.intersection(tests, readingPaths.get(path));
										
					for(ASTMethodDeclaration invalidTest : writingTests){
						if(Sets.difference(readingTests, Sets.newHashSet(invalidTest)).size()>0){
							addViolation(data, invalidTest);
						}
					}
					
				}

			}
		}finally{
			cleanUp();
		}
		return visit;
	}

	private void cleanUp() {
		setUp = null;
		tearDown = null;
		writingPaths.clear();
		readingPaths.clear();
		tests.clear();
		nameTable.clear();
	}

	@Override
	public Object visit(final ASTAllocationExpression node, Object data) {
		ASTArguments args = node.getFirstChildOfType(ASTArguments.class);
		if(args!=null){
			if(args.getArgumentCount()==2){
				ASTLiteral variable = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTLiteral.class);
				if(variable!=null){
					processFileAllocation(node, data, "");
				}
			}else{
				processFileAllocation(node, data, "");
			}
		}
		return super.visit(node, data);
	}

	private void processFileAllocation(final ASTAllocationExpression node,final Object data,final String parentPath) {
		ASTClassOrInterfaceType typeNode = node.getFirstChildOfType(ASTClassOrInterfaceType.class);
		Class<?> type = null;
		if(typeNode!=null){
			type = typeNode.getType();
		}

		if(type!=null && (File.class.isAssignableFrom(type))){
			
			ASTAllocationExpression parent = node.getFirstParentOfType(ASTAllocationExpression.class);
			ASTLocalVariableDeclaration localDeclaration = node.getFirstParentOfType(ASTLocalVariableDeclaration.class);
			ASTStatementExpression assignment = node.getFirstParentOfType(ASTStatementExpression.class);
			ASTFieldDeclaration fieldDeclaration = node.getFirstParentOfType(ASTFieldDeclaration.class);
			
			if(parent!=null){
				processAllocationExpression(node.getFirstChildOfType(ASTArguments.class), parent,parentPath,data);
			}else if(localDeclaration!=null){
				
				Map<VariableNameDeclaration, List<NameOccurrence>> declarations = localDeclaration.getScope().getDeclarations(VariableNameDeclaration.class);
				
				List<NameOccurrence> occurences = declarations.get(new VariableNameDeclaration(localDeclaration.getFirstDescendantOfType(ASTVariableDeclaratorId.class)));
				
				for(NameOccurrence occurrence : occurences){
					parent = occurrence.getLocation().getFirstParentOfType(ASTAllocationExpression.class);
					
					if(parent!=null){
						processAllocationExpression(node.getFirstChildOfType(ASTArguments.class), parent,parentPath,data);
					}
				}
				
			}else if(assignment!=null){
				ASTMethodDeclaration outerMethod = getOuterMethodDeclaration(node);
				if(outerMethod!=null){
					if(isJUnitMethod(outerMethod, data)){
						ASTName variableNameNode = assignment.jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTName.class);
						String variableName = null;
						if(variableNameNode==null){
							ASTPrimarySuffix suffix = assignment.jjtGetChild(0).getFirstChildOfType(ASTPrimarySuffix.class);
							if(suffix!=null){
								variableName=suffix.getImage();
							}
						}else{
							variableName = variableNameNode.getImage();
						}
						if(variableName!=null){
							Utils.select(variableName, assignment.getScope(), new DeclarationFinder() {
			
								@Override
								public void onFound(VariableNameDeclaration declaration,
										List<NameOccurrence> occurrences) {
									
									ASTMethodDeclaration outterMethod = getOuterMethodDeclaration(node);
									
									for(NameOccurrence occurrence : occurrences){
										ASTAllocationExpression parent = occurrence.getLocation().getFirstParentOfType(ASTAllocationExpression.class);
										
										if(parent!=null){
											if( outterMethod!=null && outterMethod.equals(getOuterMethodDeclaration(occurrence.getLocation()))){
												processAllocationExpression(node.getFirstChildOfType(ASTArguments.class), parent,parentPath,data);
											}
										}
									}
									
								}
							});
						}
					}else{
						ASTName variableNameNode = assignment.jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTName.class);
						String variableName = null;
						if(variableNameNode==null){
							ASTPrimarySuffix suffix = assignment.jjtGetChild(0).getFirstChildOfType(ASTPrimarySuffix.class);
							if(suffix!=null){
								variableName=suffix.getImage();
							}
						}else{
							variableName = variableNameNode.getImage();
						}

						if(variableName!=null){
							Utils.select(variableName, assignment.getScope(), new DeclarationFinder() {
			
								@Override
								public void onFound(VariableNameDeclaration declaration,
										List<NameOccurrence> occurrences) {
									
									ASTMethodDeclaration outterMethod = getOuterMethodDeclaration(node);
									
									for(NameOccurrence occurrence : occurrences){
										ASTAllocationExpression parent = occurrence.getLocation().getFirstParentOfType(ASTAllocationExpression.class);
										
										if(parent!=null){
											if( outterMethod!=null && !setUp.equals(getOuterMethodDeclaration(occurrence.getLocation()))){
												processAllocationExpression(node.getFirstChildOfType(ASTArguments.class), parent,parentPath,data);
											}
										}
									}
									
								}
							});
						}
					}
				}
			}else if(fieldDeclaration!=null){
				ASTVariableDeclaratorId variableName = fieldDeclaration.getFirstDescendantOfType(ASTVariableDeclaratorId.class);
				
				Utils.select(variableName.getImage(), variableName.getScope(), new DeclarationFinder() {

					@Override
					public void onFound(VariableNameDeclaration declaration,
							List<NameOccurrence> occurrences) {
						
						for(NameOccurrence occurrence : occurrences){
							ASTAllocationExpression parent = occurrence.getLocation().getFirstParentOfType(ASTAllocationExpression.class);
							
							if(parent!=null){
								processAllocationExpression(node.getFirstChildOfType(ASTArguments.class), parent,parentPath,data);
							}
						}
						
					}
				});
			}
			
		}
	}

	private void processAllocationExpression(ASTArguments args,
			ASTAllocationExpression parent, String inheritedPath, Object data) {
		ASTClassOrInterfaceType  typeNode2 = parent.getFirstChildOfType(ASTClassOrInterfaceType.class);
		Class<?> type2 = null;
		if(typeNode2!=null){
			type2 = typeNode2.getType();
		}
		
		if (type2 != null && File.class.isAssignableFrom(type2)){
			String parentPath="";
			ASTExpression parameter=null;
			if(args.getArgumentCount()==1){
				parameter=(ASTExpression)args.jjtGetChild(0).jjtGetChild(0);
			}else{
				ASTLiteral parentLiteral = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTLiteral.class);
				if(parentLiteral!=null){
					parentPath=parentLiteral.getImage();
				}
				ASTName parentName = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTName.class);
				ASTAllocationExpression parentNode = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTAllocationExpression.class);
				if(parentName!=null || parentNode!=null){
					parentPath=inheritedPath;
				}
				
				parameter=(ASTExpression)args.jjtGetChild(0).jjtGetChild(1);
			}
			
			String path = null;
			if(nameTable.containsKey(parameter)){
				path=nameTable.get(parameter);
			}else{
				ASTPrimaryPrefix prefix = parameter.jjtGetChild(0).getFirstChildOfType(ASTPrimaryPrefix.class);
				if(prefix!=null){
					ASTLiteral literal= prefix.getFirstChildOfType(ASTLiteral.class);
					
					if(literal!=null){
					
						path = literal.getImage();
					}else{
						ASTName pathVariable = prefix.getFirstChildOfType(ASTName.class);

						if(pathVariable!=null){
							Scope pathScope = pathVariable
									.getScope();

							path = Utils.get(pathVariable.getImage(), pathScope, new TypedDeclarationFinder<String>() {
								
								@Override
								public String onFound3(
										VariableNameDeclaration pathDeclaration,
										List<NameOccurrence> pathOccurrences) {
									
									String path=null;
									if(nameTable.containsKey(pathDeclaration.getAccessNodeParent())){
										return nameTable.get(pathDeclaration.getAccessNodeParent());
									}else{
										Class<?> type = pathDeclaration.getType();
										if(type!=null && String.class.isAssignableFrom(type)){
											AccessNode accessNodeParent = pathDeclaration
													.getAccessNodeParent();
											ASTExpression exp = accessNodeParent
													.getFirstDescendantOfType(
															ASTExpression.class);
											if(exp!=null){
												ASTLiteral literal = exp.jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTLiteral.class);
												if (literal != null) {
													path= literal.getImage();
												}
											}
											
											if(path==null){
												path= UUID.randomUUID().toString();
											}
										}
										nameTable.put(pathDeclaration.getAccessNodeParent(), path);
									}
									return path;
								}
									
							});
						}else if(path==null && prefix.usesThisModifier()){
							List<ASTPrimarySuffix> suffixes = prefix.getNthParent(1).findChildrenOfType(ASTPrimarySuffix.class);
							 boolean isInvalid=false;
							 for(ASTPrimarySuffix suffix : suffixes){
								 if(suffix.isArguments()){
									 isInvalid=true;
								 }
							 }
							 if(!isInvalid){
								 path = suffixes.get(0).getImage();
							 }
						}
					}
				}else{
					path=UUID.randomUUID().toString();
				}
				nameTable.put(parameter, path);
			}
			if(path!=null){
				processFileAllocation(parent, data, inheritedPath+parentPath+path);
			}
			
		}
		
		if (type2 != null
				&& (FileWriter.class.isAssignableFrom(type2) || 
					FileOutputStream.class.isAssignableFrom(type2) ||
					PrintWriter.class.isAssignableFrom(type2) ||
					RandomAccessFile.class.isAssignableFrom(type2))) {
			

			String parentPath="";
			ASTExpression parameter=null;
			if(args.getArgumentCount()==1){
				parameter=(ASTExpression)args.jjtGetChild(0).jjtGetChild(0);
			}else{
				ASTLiteral parentLiteral = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTLiteral.class);
				if(parentLiteral!=null){
					parentPath=parentLiteral.getImage();
				}
				ASTName parentName = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTName.class);
				ASTAllocationExpression parentNode = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTAllocationExpression.class);
				if(parentName!=null || parentNode!=null){
					parentPath=inheritedPath;
				}
				parameter=(ASTExpression)args.jjtGetChild(0).jjtGetChild(1);
			}
						
			String path = null;
			if(nameTable.containsKey(parameter)){
				path=nameTable.get(parameter);
			}else{
				ASTPrimaryPrefix prefix = parameter.jjtGetChild(0).getFirstChildOfType(ASTPrimaryPrefix.class);
				if(prefix!=null){
					ASTLiteral literal= prefix.getFirstChildOfType(ASTLiteral.class);
					
					if(literal!=null){
					
						path = literal.getImage();
					}else{
						ASTName pathVariable = prefix.getFirstChildOfType(ASTName.class);

						if(pathVariable!=null){
							Scope pathScope = pathVariable
									.getScope();

							path = Utils.get(pathVariable.getImage(), pathScope, new TypedDeclarationFinder<String>() {
								
								@Override
								public String onFound3(
										VariableNameDeclaration pathDeclaration,
										List<NameOccurrence> pathOccurrences) {
									
									String path=null;
									if(nameTable.containsKey(pathDeclaration.getAccessNodeParent())){
										return nameTable.get(pathDeclaration.getAccessNodeParent());
									}else{
										Class<?> type = pathDeclaration.getType();
										if(type!=null && String.class.isAssignableFrom(type)){
											AccessNode accessNodeParent = pathDeclaration
													.getAccessNodeParent();
											ASTExpression exp = accessNodeParent
													.getFirstDescendantOfType(
															ASTExpression.class);
											if(exp!=null){
												ASTLiteral literal = exp.jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTLiteral.class);
												if (literal != null) {
													path= literal.getImage();
												}
											}
											
											if(path==null){
												path= UUID.randomUUID().toString();
											}
										}
										nameTable.put(pathDeclaration.getAccessNodeParent(), path);
									}
									return path;
								}
									
							});
						}else if(path==null && prefix.usesThisModifier()){
							List<ASTPrimarySuffix> suffixes = prefix.getNthParent(1).findChildrenOfType(ASTPrimarySuffix.class);
							 boolean isInvalid=false;
							 for(ASTPrimarySuffix suffix : suffixes){
								 if(suffix.isArguments()){
									 isInvalid=true;
								 }
							 }
							 if(!isInvalid){
								 path = suffixes.get(0).getImage();
							 }
						}
					}
				}else{
					path=UUID.randomUUID().toString();
				}
				nameTable.put(parameter,path);
			}
			if(path!=null){
				if (!writingPaths.containsKey(parentPath+path)) {
					writingPaths.put(parentPath+path,
							new HashSet<ASTMethodDeclaration>());
				}
				writingPaths.get(parentPath+path).add(getOuterMethodDeclaration(parent));
			}
			
			
			
		}
		
		if (type2 != null
				&& (FileReader.class
						.isAssignableFrom(type2) || 
					FileInputStream.class
						.isAssignableFrom(type2) || 
						Scanner.class
						.isAssignableFrom(type2) || 
						RandomAccessFile.class
						.isAssignableFrom(type2))) {

			String parentPath="";
			ASTExpression parameter=null;
			if(args.getArgumentCount()==1){
				parameter=(ASTExpression)args.jjtGetChild(0).jjtGetChild(0);
			}else{
				ASTLiteral parentLiteral = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTLiteral.class);
				if(parentLiteral!=null){
					parentPath=parentLiteral.getImage();
				}
				ASTName parentName = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTName.class);
				ASTAllocationExpression parentNode = args.jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTAllocationExpression.class);
				if(parentName!=null || parentNode!=null){
					parentPath=inheritedPath;
				}
				parameter=(ASTExpression)args.jjtGetChild(0).jjtGetChild(1);
			}
			
			String path = null;
			if(nameTable.containsKey(parameter)){
				path=nameTable.get(parameter);
			}else{
				ASTPrimaryPrefix prefix = parameter.jjtGetChild(0).getFirstChildOfType(ASTPrimaryPrefix.class);
				if(prefix!=null){
					ASTLiteral literal= prefix.getFirstChildOfType(ASTLiteral.class);
					
					if(literal!=null){
					
						path = literal.getImage();
					}else{
						ASTName pathVariable = prefix.getFirstChildOfType(ASTName.class);

						if(pathVariable!=null){
							Scope pathScope = pathVariable
									.getScope();

							path = Utils.get(pathVariable.getImage(), pathScope, new TypedDeclarationFinder<String>() {
								
								@Override
								public String onFound3(
										VariableNameDeclaration pathDeclaration,
										List<NameOccurrence> pathOccurrences) {
						
									String path=null;
									if(nameTable.containsKey(pathDeclaration.getAccessNodeParent())){
										return nameTable.get(pathDeclaration.getAccessNodeParent());
									}else{
										Class<?> type = pathDeclaration.getType();
										if(type!=null && String.class.isAssignableFrom(type)){
											AccessNode accessNodeParent = pathDeclaration
													.getAccessNodeParent();
											ASTExpression exp = accessNodeParent
													.getFirstDescendantOfType(
															ASTExpression.class);
											if(exp!=null){
												ASTLiteral literal = exp.jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTLiteral.class);
												if (literal != null) {
													path= literal.getImage();
												}
											}
											
											if(path==null){
												path= UUID.randomUUID().toString();
											}
										}
										nameTable.put(pathDeclaration.getAccessNodeParent(), path);
									}
									return path;
								}
									
							});
						}else if(path==null && prefix.usesThisModifier()){
							 List<ASTPrimarySuffix> suffixes = prefix.getNthParent(1).findChildrenOfType(ASTPrimarySuffix.class);
							 boolean isInvalid=false;
							 for(ASTPrimarySuffix suffix : suffixes){
								 if(suffix.isArguments()){
									 isInvalid=true;
								 }
							 }
							 if(!isInvalid){
								 path = suffixes.get(0).getImage();
							 }
						}
					}
				}else{
					path=UUID.randomUUID().toString();
				}
				nameTable.put(parameter, path);
			}
			if(path!=null){
				if(!writingPaths.containsKey(parentPath+path) || !writingPaths.get(parentPath+path).contains(getOuterMethodDeclaration(parent))){
					if (!readingPaths.containsKey(parentPath+path)) {
						readingPaths.put(parentPath+path,
								new HashSet<ASTMethodDeclaration>());
					}
					readingPaths.get(parentPath+path).add(getOuterMethodDeclaration(parent));
				}
			}
		}
	}
		
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		if (isJUnitMethod(node, data)&& !isIgnored(node)) {
			tests.add(node);
			return super.visit(node, data);
		}else if(isSetUp(node)){
			setUp=node;
			return super.visit(node, data);
		}else if(isTearDown(node)){
			tearDown=node;
			return super.visit(node, data);
		}

		return data;
	}

	@Override
	public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {
		if (node.isNested()) {
			return data;
		}

		return super.visit(node, data);
	}

	private void checkForFixOrderAnnotation(ASTCompilationUnit node) {
		ASTTypeDeclaration typeDeclaration = node
				.getFirstDescendantOfType(ASTTypeDeclaration.class);

		for (ASTAnnotation annotation : typeDeclaration
				.findChildrenOfType(ASTAnnotation.class)) {

			Node annotationTypeNode = annotation.jjtGetChild(0);
			TypeNode annotationType = (TypeNode) annotationTypeNode;
			if (annotationType.getType() == null) {
				ASTName name = annotationTypeNode
						.getFirstChildOfType(ASTName.class);
				if (name != null && "FixMethodOrder".equals(name.getImage())) {
					tests.clear();
				}
			} else {
				try {
					if (annotationType.getType().equals(
							Class.forName("org.junit.FixMethodOrder"))) {
						tests.clear();
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
