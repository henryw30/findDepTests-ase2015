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
import net.sourceforge.pmd.lang.java.ast.ASTAllocationExpression;
import net.sourceforge.pmd.lang.java.ast.ASTAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTArgumentList;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceType;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.ASTTypeDeclaration;
import net.sourceforge.pmd.lang.java.ast.AbstractJavaNode;
import net.sourceforge.pmd.lang.java.ast.TypeNode;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class StringPathFileRule extends MyAbstractJUnitRule {

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
			setUp = null;
			tearDown = null;
			writingPaths.clear();
			readingPaths.clear();
			tests.clear();
		}
		return visit;
	}

	@Override
	public Object visit(ASTAllocationExpression node, Object data) {
		
		ASTClassOrInterfaceType typeNode = node.getFirstChildOfType(ASTClassOrInterfaceType.class);
		Class<?> type = null;
		if(typeNode!=null){
			type = typeNode.getType();
		}

		if(type!=null && (FileWriter.class.isAssignableFrom(type) || FileOutputStream.class.isAssignableFrom(type) || PrintWriter.class.isAssignableFrom(type)|| RandomAccessFile.class.isAssignableFrom(type))){
			ASTPrimaryPrefix primaryPrefix = node.getFirstDescendantOfType(ASTArgumentList.class).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTPrimaryPrefix.class);
			if(primaryPrefix!=null){
				Node realNode = null;
				if(primaryPrefix.jjtGetNumChildren()==1){
					
					realNode = primaryPrefix.jjtGetChild(0);
				}else if(primaryPrefix.usesThisModifier()){
					List<ASTPrimarySuffix> suffixes = primaryPrefix.getNthParent(1).findChildrenOfType(ASTPrimarySuffix.class);
					boolean isVariable=true;
					
					for(ASTPrimarySuffix suffix : suffixes){
						if(suffix.isArguments()){
							isVariable=false;
						}
					}
					
					if(isVariable){
						realNode= suffixes.get(0); 
					}
				}
				if(realNode instanceof ASTName || realNode instanceof ASTLiteral){
					checkForWriteOperations(realNode, data);
				}
			}
		}
		
		if(type!=null && (FileReader.class.isAssignableFrom(type) || FileInputStream.class.isAssignableFrom(type) || Scanner.class.isAssignableFrom(type) || RandomAccessFile.class.isAssignableFrom(type))){
			ASTPrimaryPrefix primaryPrefix = node.getFirstDescendantOfType(ASTArgumentList.class).jjtGetChild(0).jjtGetChild(0).getFirstChildOfType(ASTPrimaryPrefix.class);
			if(primaryPrefix!=null){
				Node realNode = null;
				if(primaryPrefix.jjtGetNumChildren()==1){
					
					realNode = primaryPrefix.jjtGetChild(0);
				}else if(primaryPrefix.usesThisModifier()){
					List<ASTPrimarySuffix> suffixes = primaryPrefix.getNthParent(1).findChildrenOfType(ASTPrimarySuffix.class);
					boolean isVariable=true;
					
					for(ASTPrimarySuffix suffix : suffixes){
						if(suffix.isArguments()){
							isVariable=false;
						}
					}
					
					if(isVariable){
						realNode= suffixes.get(0); 
					}
				}
				if(realNode instanceof ASTName || realNode instanceof ASTLiteral || realNode instanceof ASTPrimarySuffix){
					checkforReadOperations(realNode, data);	
				}
			}
		}
		
		return super.visit(node, data);
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

	private void checkforReadOperations(Node node,
			Object data) {
		ASTLiteral literal =null;
		
		if(node instanceof ASTLiteral){
			literal=(ASTLiteral)node;
		}
		String readOperationPath = null;

		if (literal != null
				&& literal.isStringLiteral()) {
			readOperationPath = literal
					.getImage();
		} else if (literal == null) {
			AbstractJavaNode pathVariable =null;
			
			if(node instanceof ASTName){
				pathVariable = (ASTName)node;
			}
			
			if(node instanceof ASTPrimarySuffix){
				pathVariable = (ASTPrimarySuffix)node;
			}

			if(pathVariable!=null){
				Scope pathScope = pathVariable
						.getScope();

				readOperationPath = Utils.get(pathVariable.getImage(), pathScope, new TypedDeclarationFinder<String>() {
					
					@Override
					public String onFound3(
							VariableNameDeclaration pathDeclaration,
							List<NameOccurrence> pathOccurrences) {
						
						Class<?> type = pathDeclaration.getType();
						if(type!=null && String.class.isAssignableFrom(type)){
							ASTLiteral literal = pathDeclaration
									.getAccessNodeParent()
									.getFirstDescendantOfType(
											ASTLiteral.class);
							if (literal != null) {
								return literal.getImage();
							}
						}
						return null;
					}
						
				});
			}
		}
		
		if (readOperationPath != null) {
			

			ASTMethodDeclaration method = node
					.getFirstParentOfType(ASTMethodDeclaration.class);
			
			if (method == null) {
				throw new RuntimeException(
						"This should not no be happeing.");
			}
			
			if(!writingPaths.containsKey(readOperationPath) || !writingPaths.get(readOperationPath).contains(method)){
				if (!readingPaths.containsKey(readOperationPath)) {
					readingPaths.put(readOperationPath,
							new HashSet<ASTMethodDeclaration>());
				}

				if(isJUnitMethod(method, data) && !isIgnored(method)){
					readingPaths.get(readOperationPath).add(method);
				}
			}
		}
	}

	private void checkForWriteOperations(Node node,
			Object data) {
		String path = null;
		ASTLiteral literal =null;
		
		if(node instanceof ASTLiteral){
			literal=(ASTLiteral)node;
		}

		if (literal != null && literal.isStringLiteral()) {
			path = literal.getImage();
		} else if (literal == null) {
			AbstractJavaNode pathVariable =null;
			
			if(node instanceof ASTName){
				pathVariable = (ASTName)node;
			}
			
			if(node instanceof ASTPrimarySuffix){
				pathVariable = (ASTPrimarySuffix)node;
			}


			if(pathVariable!=null){
			
				Scope pathScope = pathVariable.getScope();

				path = Utils.get(pathVariable.getImage(), pathScope, new TypedDeclarationFinder<String>() {

					@Override
					public String onFound3(
							VariableNameDeclaration pathDeclaration,
							List<NameOccurrence> pathOccurrences) {
						Class<?> type = pathDeclaration.getType();
						if(type!=null && String.class.isAssignableFrom(type)){
							ASTLiteral literal = pathDeclaration
									.getAccessNodeParent()
									.getFirstDescendantOfType(
											ASTLiteral.class);
							if (literal != null) {
								return literal.getImage();
							}
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
			}else if(isJUnitMethod(method, data) && !isIgnored(method) || isSetUp(method) || isTearDown(method)){

				writingPaths.get(path).add(method);
			}
		}
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
