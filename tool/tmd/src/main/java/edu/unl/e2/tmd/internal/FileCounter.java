package edu.unl.e2.tmd.internal;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTAllocationExpression;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceType;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;

public class FileCounter extends MyAbstractJUnitRule {


	boolean writerFound;
	boolean readerFound;

	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = super.visit(node, data);
		
		if(writerFound && readerFound){
			addViolation(data, node);
		}
		
		
		writerFound=false;
		readerFound=false;
		
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
			writerFound=true;
		}
		
		if(type!=null && (FileReader.class.isAssignableFrom(type) || FileInputStream.class.isAssignableFrom(type) || Scanner.class.isAssignableFrom(type) || RandomAccessFile.class.isAssignableFrom(type))){
			readerFound=true;
		}
		
		return super.visit(node, data);
	}
	

	@Override
	public Object visit(ASTPrimaryPrefix node, Object data) {
		
		
		ASTName name = node.getFirstDescendantOfType(ASTName.class);
		String methodCall=null;
		if(name!=null ){
			String[] splitedName = name.getImage().split("\\.");
			if(splitedName[0].equals("Files") && splitedName.length>1){
				methodCall=splitedName[1];
			}
		}

		if(methodCall!=null &&  (methodCall.startsWith("write") || methodCall.contains("Writer") || methodCall.contains("OutputStream"))){
			writerFound=true;
		}

		if(methodCall!=null && (methodCall.startsWith("read") || methodCall.contains("Reader") || methodCall.contains("InputStream"))){
			readerFound=true;
		}
		
		return super.visit(node, data);
	}
	
	
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {

		if (isJUnitMethod(node, data)&& !isIgnored(node)) {
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
	
	
	
}
