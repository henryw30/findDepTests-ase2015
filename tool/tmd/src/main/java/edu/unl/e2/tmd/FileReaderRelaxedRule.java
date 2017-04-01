package edu.unl.e2.tmd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.dfa.DataFlowNode;
import net.sourceforge.pmd.lang.dfa.VariableAccess;
import net.sourceforge.pmd.lang.java.ast.ASTAllocationExpression;
import net.sourceforge.pmd.lang.java.ast.ASTArguments;
import net.sourceforge.pmd.lang.java.ast.ASTBlockStatement;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTFieldDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTInitializer;
import net.sourceforge.pmd.lang.java.ast.ASTLiteral;
import net.sourceforge.pmd.lang.java.ast.ASTLocalVariableDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTVariableDeclarator;
import net.sourceforge.pmd.lang.java.ast.AccessNode;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

public class FileReaderRelaxedRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTLocalVariableDeclaration node, Object data) {

		final Object data2=data;
		//final ASTPrimaryExpression node2=node;
		final ASTVariableDeclarator declarationNode=node.getFirstDescendantOfType(ASTVariableDeclarator.class);
		
		/*
		ASTPrimaryPrefix prefix = node
				.getFirstDescendantOfType(ASTPrimaryPrefix.class);

		if (prefix == null) {
			return data;
		}
		String variableName = getVariableName(node, "read");
		if(variableName==null){
			variableName = getVariableName(node, "next");
		}

		if (variableName != null) {
			final ASTMethodDeclaration method = node2.getFirstParentOfType(ASTMethodDeclaration.class);
			Utils.select(variableName, node.getScope(), new DeclarationFinder() {

				@Override
				public void onFound(VariableNameDeclaration declaration,
						List<NameOccurrence> occurrences) {
*/
		final ASTMethodDeclaration method = node.getFirstParentOfType(ASTMethodDeclaration.class);
					Class<?> type = declarationNode.getType();

					if (type != null
							&& (FileReader.class.isAssignableFrom(type) || FileInputStream.class
									.isAssignableFrom(type) || RandomAccessFile.class
									.isAssignableFrom(type) ||Scanner.class
									.isAssignableFrom(type))) {

						//final AccessNode declarationNode = declaration.getAccessNodeParent();

						ASTArguments arguments = declarationNode
								.getFirstDescendantOfType(ASTArguments.class);
						
						if (arguments != null && arguments.getArgumentCount()>0){ 
							ASTLiteral literal=arguments.jjtGetChild(0).jjtGetChild(0).getFirstDescendantOfType(ASTLiteral.class);
							
						if (literal != null && literal.isStringLiteral()) {
							addViolation(data2, declarationNode);
						} else if (literal == null) {
							
							ASTName pathVariable=null;
							/*
							if(declarationNode instanceof ASTFieldDeclaration){
								
								for(NameOccurrence occurrence: occurrences){
									ASTMethodDeclaration parentMethod = occurrence.getLocation().getFirstParentOfType(ASTMethodDeclaration.class);
									if(parentMethod!=null && method.equals(parentMethod)){
										if(occurrence.getLocation().getEndLine()> node2.getEndLine()){
											break;
										}
										ASTBlockStatement statement = getStatement(occurrence.getLocation());
										ASTAllocationExpression allocation = statement.getFirstDescendantOfType(ASTAllocationExpression.class);
										
										if(allocation!=null){
											Node nthParent = allocation.getNthParent(1);
											if(nthParent instanceof ASTStatementExpression){
												pathVariable = declarationNode
														.getFirstDescendantOfType(ASTName.class);
											}
										}
										
									}
								}
								
							}else{
								*/
								pathVariable = declarationNode
										.getFirstDescendantOfType(ASTName.class);
								
							//}
/*
							if(pathVariable==null){
								return;
							}
	*/						
							Scope pathScope = pathVariable.getScope();

							final String pathVariableName = pathVariable.getImage();
							Utils.select(pathVariableName, pathScope,
									new DeclarationFinder() {

										@Override
										public void onFound(
												VariableNameDeclaration pathDeclaration,
												List<NameOccurrence> pathOccurrences) {

											Class<?> type = pathDeclaration
													.getType();

											if (type != null
													&& String.class.isAssignableFrom(type)) {
												addViolation(data2,
														declarationNode);
											} else if (type != null
													&& File.class.isAssignableFrom(type)) {
												
												AccessNode fileDeclarationNode = pathDeclaration.getAccessNodeParent();
												boolean found=false;
												
												if(fileDeclarationNode instanceof ASTFieldDeclaration){
													
													for(Iterator<NameOccurrence> it=pathOccurrences.iterator();it.hasNext() && !found;){
														NameOccurrence occurrence=it.next();
														ASTMethodDeclaration parentMethod = occurrence.getLocation().getFirstParentOfType(ASTMethodDeclaration.class);
														if(parentMethod!=null && method.equals(parentMethod)){
															//if(occurrence.getLocation().getEndLine()> node2.getEndLine()){
															//	break;
															//}
															
															ASTBlockStatement statement = getStatement(occurrence.getLocation());
															List<ASTPrimaryExpression> exps = statement.findDescendantsOfType(ASTPrimaryExpression.class);
															for(Iterator<ASTPrimaryExpression> it2=exps.iterator();it2.hasNext() && !found;){
																ASTPrimaryExpression exp =it2.next();
																if( exp!=null&&	pathVariableName.equals(getVariableName(exp, "exists")) ||
																		pathVariableName.equals(getVariableName(exp, "createNewFile")) ||
																		pathVariableName.equals(getVariableName(exp, "mkdir")) ){
																
																		found=true;
																}
															}
															
															
															ASTAllocationExpression allocation = statement.getFirstDescendantOfType(ASTAllocationExpression.class);
															
															if(allocation!=null){
																type=allocation.getType();
																
																if(type!=null && (FileWriter.class.isAssignableFrom(type)||FileOutputStream.class.isAssignableFrom(type)||PrintWriter.class.isAssignableFrom(type) )){
																	
																	found=true;
																}
															}
															
															
														}
													}
												}else{
												
													DataFlowNode dataFlowNode = declarationNode.getDataFlowNode();
													List<DataFlowNode> flow = dataFlowNode.getFlow();
												
													boolean shouldAnalyze=false;
													for(Iterator<DataFlowNode> it =flow.iterator();it.hasNext() && !found;){
														DataFlowNode flowNode=it.next();
														//if(flowNode.getLine()> node2.getEndLine()){
													//		break;
													//	}
														
														if(shouldAnalyze){
															
															for(Iterator<VariableAccess> it2=flowNode.getVariableAccess().iterator() ;it2.hasNext() && !found;){
																VariableAccess access=it2.next();
																if(access.isReference() && access.getVariableName().equals(pathDeclaration.getName())){
																	ASTAllocationExpression allocation = flowNode.getNode().getFirstDescendantOfType(ASTAllocationExpression.class);
																	
																	if(allocation!=null){
																		type=allocation.getType();
																		
																		if(type!=null && (FileWriter.class.isAssignableFrom(type)||FileOutputStream.class.isAssignableFrom(type)||PrintWriter.class.isAssignableFrom(type))){
																			/*
																			for(int i=flow.indexOf(flowNode)+1;i<flow.size() && !found;i++){
																				DataFlowNode writerFlowNode= flow.get(i);
																				if(writerFlowNode.getLine()> node2.getEndLine()){
																					break;
																				}
																				for(Iterator<VariableAccess> it3= writerFlowNode.getVariableAccess().iterator();it3.hasNext() && !found;){
																					VariableAccess wirterAccess=it3.next();
																					String writerVariableName = flowNode.getNode().getFirstChildOfType(ASTVariableDeclaratorId.class).getImage();
																					if(wirterAccess.isReference() && wirterAccess.getVariableName().equals(writerVariableName)){
																						List<ASTPrimaryExpression> exps = writerFlowNode.getNode().findDescendantsOfType(ASTPrimaryExpression.class);
																						for(Iterator<ASTPrimaryExpression> it4=exps.iterator();it4.hasNext() && !found;){
																							ASTPrimaryExpression exp=it4.next();
																							if( exp!=null&&	writerVariableName.equals(getVariableName(exp, "write")) ){
																								found=true;
																							}
																						}
																					}
																				}
																				
																			}
																			*/
																			found=true;
																		}
																		
																	}
																	List<ASTPrimaryExpression> exps = flowNode.getNode().findDescendantsOfType(ASTPrimaryExpression.class);
																	for(Iterator<ASTPrimaryExpression> it3=exps.iterator();it3.hasNext() && !found;){
																		ASTPrimaryExpression exp =it3.next();
																		if( exp!=null&&	pathVariableName.equals(getVariableName(exp, "exists")) ||
																				pathVariableName.equals(getVariableName(exp, "createNewFile")) ||
																				pathVariableName.equals(getVariableName(exp, "mkdir")) ){
																		
																				found=true;
																		}
																	}
																}
															}
	
														}
														if(!shouldAnalyze && flowNode.getNode()!=null &&  flowNode.getNode().equals(fileDeclarationNode.getFirstDescendantOfType(ASTVariableDeclarator.class))){
															shouldAnalyze=true;
														}
													}
													
													
												}
												if(!found){
													addViolation(data2,declarationNode);
												}
											}

										}

									});
						}
						}
					}
				//}
			//});

		//}
		return data;
	}

	private ASTBlockStatement getStatement(Node node) {
		ASTMethodDeclaration methodDeclaration = node.getFirstParentOfType(ASTMethodDeclaration.class);
		
		
		ASTBlockStatement parent = node.getFirstParentOfType(ASTBlockStatement.class);
		
		while(!parent.jjtGetParent().equals(methodDeclaration.getBlock())){
			parent=parent.getFirstParentOfType(ASTBlockStatement.class);
		}
		
		return parent;
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

		if (isJUnitMethod(node, data) && !isIgnored(node)) {
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

	@Override
	public Object visit(ASTInitializer node, Object data) {
		if (node.isStatic()) {
			return data;
		}

		return super.visit(node, data);
	}
}
