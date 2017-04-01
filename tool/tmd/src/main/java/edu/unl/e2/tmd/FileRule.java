package edu.unl.e2.tmd;

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

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTInitializer;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclarator;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.AccessNode;
import net.sourceforge.pmd.lang.java.symboltable.ClassScope;
import net.sourceforge.pmd.lang.java.symboltable.MethodNameDeclaration;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class FileRule extends MyAbstractJUnitRule {

	private final Map<String, Set<ASTMethodDeclaration>> writingPaths = Maps.newHashMap();
	private final Map<String, Set<ASTMethodDeclaration>> readingPaths = Maps.newHashMap();
	private ASTMethodDeclaration setUp;
	private ASTMethodDeclaration tearDown;
	private Set<ASTMethodDeclaration> tests = Sets.newHashSet();

	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		
		Object visit =  data;
		try{
			visit = super.visit(node, data);
	
			if (isJUnit3Class || isJUnit4Class) {

				Set<String> intersectingPaths = Sets.intersection(writingPaths.keySet(), readingPaths.keySet());
				
				for(String path : intersectingPaths){
					
					Set<ASTMethodDeclaration> writingTests = Sets.intersection(tests, writingPaths.get(path));
					Set<ASTMethodDeclaration> readingTests = Sets.intersection(tests, readingPaths.get(path));
					
					Set<ASTMethodDeclaration> invalidTests = Sets.union(writingTests, readingTests);
					
					if(invalidTests.size()>1){
						for(ASTMethodDeclaration invalidTest : writingTests){
							addViolation(data, invalidTest);
						}
					}
					
				}

			}
		}finally{
			setUp = null;
			tearDown = null;
			writingPaths.clear();
			readingPaths.clear();
			tests.clear();
		}
		return visit;
	}

	@Override
	public Object visit(final ASTPrimaryExpression node, Object data) {

		ASTPrimaryPrefix prefix = node
				.getFirstDescendantOfType(ASTPrimaryPrefix.class);

		if (prefix == null) {
			return super.visit(node, data);
		}
		String variableName = getVariableName(node, "write");
		if(variableName==null){
			variableName = getVariableName(node, "print");
		}

		if (variableName != null) {
			
			Scope scope = node.getScope();
			
			AccessNode declarationNode =Utils.get(variableName, scope, new TypedDeclarationFinder<AccessNode>() {

				@Override
				public AccessNode onFound3(VariableNameDeclaration declaration,
						List<NameOccurrence> occurrences) {

					
					Class<?> type = declaration.getType();

					if (type != null
							&& (FileWriter.class.isAssignableFrom(type) || 
								FileOutputStream.class.isAssignableFrom(type) ||
								PrintWriter.class.isAssignableFrom(type) ||
								RandomAccessFile.class.isAssignableFrom(type))) {

						return declaration.getAccessNodeParent();

					}
					
					return null;
				}
			});
						
			if(declarationNode!=null || variableName.equals("Files")){
				String path = null;
			
				Node theNode =declarationNode;
				if(variableName.equals("Files")){
					theNode=node.getFirstChildOfType(ASTPrimarySuffix.class);
				}
				
				ASTLiteral literal = theNode
						.getFirstDescendantOfType(ASTLiteral.class);
	
				if (literal != null && literal.isStringLiteral()) {
					path = literal.getImage();
				} else if (literal == null) {
	
					ASTName pathVariable = theNode
							.getFirstDescendantOfType(ASTName.class);
	
					if(pathVariable!=null){
					
						Scope pathScope = pathVariable.getScope();
		
						path = Utils.get(pathVariable.getImage(), pathScope, new TypedDeclarationFinder<String>() {
		
							@Override
							public String onFound3(
									VariableNameDeclaration pathDeclaration,
									List<NameOccurrence> pathOccurrences) {
								
								ASTLiteral literal = pathDeclaration
										.getAccessNodeParent()
										.getFirstDescendantOfType(
												ASTLiteral.class);
								if (literal != null) {
									return literal.getImage();
								}
								
								return null;
							}
								
						});
					}
				}

				if (path != null) {
	
					if (!writingPaths.containsKey(path)) {
						writingPaths.put(path,
								new HashSet<ASTMethodDeclaration>());
					}
	
					ASTMethodDeclaration method = node
							.getFirstParentOfType(ASTMethodDeclaration.class);
	
					if (method == null) {
						throw new RuntimeException(
								"This should not no be happeing.");
					}else if(isJUnitMethod(method, data) && !isIgnored(method)){

						writingPaths.get(path).add(method);
					}else if(!isJUnitMethod(method, data)){
						/*
						Set<ASTMethodDeclaration> methods=Sets.newHashSet();
						Map<MethodNameDeclaration, List<NameOccurrence>> classScope = node.getScope().getEnclosingScope(ClassScope.class).getMethodDeclarations();
						
						checkForTransitivity(classScope, method, data, methods);
						
						for(ASTMethodDeclaration testCallingMethod: methods){
							if(isJUnitMethod(testCallingMethod, data)){
								writingPaths.get(path).add(testCallingMethod);
							}
						}
						*/
					}
				}
			}
		}
		
		variableName = getVariableName(node,
				"read");
		
		if(variableName==null){
			variableName = getVariableName(node,"next");
		}

		if (variableName != null) {
			Scope scope = node.getScope();
			
			
			AccessNode declarationNode = Utils.get(variableName, scope, new TypedDeclarationFinder<AccessNode>() {
				
				@Override
				public AccessNode onFound3(
						VariableNameDeclaration declaration,
						List<NameOccurrence> occurrences) {
					
					
					Class<?> type = declaration.getType();

					if (type != null
							&& (FileReader.class
									.isAssignableFrom(type) || 
								FileInputStream.class
									.isAssignableFrom(type) || 
									Scanner.class
									.isAssignableFrom(type) || 
									RandomAccessFile.class
									.isAssignableFrom(type))) {

						return declaration.getAccessNodeParent();
				
					}
					
					return null;
				}
				
			});
			

			if(declarationNode!=null || variableName.equals("Files") ){
				
				Node theNode =declarationNode;
				if(variableName.equals("Files")){
					theNode=node.getFirstChildOfType(ASTPrimarySuffix.class);
				}
				
												
				ASTLiteral literal = theNode.getFirstDescendantOfType(ASTLiteral.class);
				String readOperationPath = null;

				if (literal != null
						&& literal.isStringLiteral()) {
					readOperationPath = literal
							.getImage();
				} else if (literal == null) {

					ASTName pathVariable = theNode
							.getFirstDescendantOfType(ASTName.class);

					if(pathVariable!=null){
						Scope pathScope = pathVariable
								.getScope();
	
						readOperationPath = Utils.get(pathVariable.getImage(), pathScope, new TypedDeclarationFinder<String>() {
							
							@Override
							public String onFound3(
									VariableNameDeclaration pathDeclaration,
									List<NameOccurrence> pathOccurrences) {
								
								ASTLiteral literal = pathDeclaration
										.getAccessNodeParent()
										.getFirstDescendantOfType(
												ASTLiteral.class);
								if (literal != null) {
									return literal.getImage();
								}
								
								return null;
							}
								
						});
					}
				}
				
				if (readOperationPath != null) {
					
					if (!readingPaths.containsKey(readOperationPath)) {
						readingPaths.put(readOperationPath,
								new HashSet<ASTMethodDeclaration>());
					}
	
					ASTMethodDeclaration method = node
							.getFirstParentOfType(ASTMethodDeclaration.class);
	
					if (method == null) {
						throw new RuntimeException(
								"This should not no be happeing.");
					}else if(isJUnitMethod(method, data) && !isIgnored(method)){
						readingPaths.get(readOperationPath).add(method);
					}else if(!isJUnitMethod(method, data)){
						/*
						Set<ASTMethodDeclaration> methods=Sets.newHashSet();
						Map<MethodNameDeclaration, List<NameOccurrence>> classScope = node.getScope().getEnclosingScope(ClassScope.class).getMethodDeclarations();
						
						checkForTransitivity(classScope, method, data, methods);
						
						for(ASTMethodDeclaration testCallingMethod: methods){
							if(isJUnitMethod(testCallingMethod, data)){
								readingPaths.get(readOperationPath).add(testCallingMethod);
							}
						}
						*/
					}
				}	
			}
			
		}
		return super.visit(node, data);
	}

	private String getVariableName(ASTPrimaryExpression node, String methodName) {

		ASTName name = node.getFirstDescendantOfType(ASTName.class);

		String variableName = null;
		if (name != null) {
			String[] methodCall = name.getImage().split("\\.");

			if (methodCall.length == 2) {

				if (methodCall[1].startsWith(methodName)) {

					if (node.jjtGetNumChildren() == 2) {

						variableName = methodCall[0];

					}
				}
			}
		}
		return variableName;
	}

	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		if (isJUnitMethod(node, data)&& !isIgnored(node)) {
			tests.add(node);
		} else if (isSetUp(node)) {
			setUp = node;
			return data;
		} else if (isTearDown(node)) {
			tearDown = node;
			return data;
		}

		return super.visit(node, data);
	}

	@Override
	public Object visit(ASTClassOrInterfaceDeclaration node, Object data) {
		if (node.isNested()) {
			return data;
		}

		return super.visit(node, data);
	}

	@Override
	public Object visit(ASTInitializer node, Object data) {
		if (node.isStatic()) {
			return data;
		}

		return super.visit(node, data);
	}
	
	private void checkForTransitivity(
			Map<MethodNameDeclaration, List<NameOccurrence>> declarations,
			ASTMethodDeclaration method, Object data, Set<ASTMethodDeclaration> set) {

		if (!set.contains(method)) {
			set.add(method);
					
			for (NameOccurrence occurrence : declarations.get(new MethodNameDeclaration(method.getFirstChildOfType(ASTMethodDeclarator.class)))) {
				ASTMethodDeclaration occurrenceMethod = occurrence
						.getLocation().getFirstParentOfType(
								ASTMethodDeclaration.class);
				if (occurrenceMethod != null) {
					ASTMethodDeclaration upperMethod=null;
					while(occurrenceMethod != null){
						upperMethod=occurrenceMethod;
						occurrenceMethod=occurrenceMethod.getFirstParentOfType(
								ASTMethodDeclaration.class);
					}
					
					checkForTransitivity(declarations,
							upperMethod, data, set);
				}
			}
			
		}
	}
	
	
}
