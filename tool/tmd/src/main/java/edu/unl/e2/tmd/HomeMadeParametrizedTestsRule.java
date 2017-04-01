package edu.unl.e2.tmd;

import java.util.List;
import java.util.Map;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTBlockStatement;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.symboltable.MethodNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;

import com.google.common.collect.Maps;

public class HomeMadeParametrizedTestsRule extends MyAbstractJUnitRule {


	private Map<MethodNameDeclaration, List<NameOccurrence>> declarations=Maps.newHashMap();


	@Override
	public Object visit(ASTCompilationUnit node, Object data) {
		Object visit = data;
		try{
			super.initialize(node);
		
			if (isJUnit3Class || isJUnit4Class) {
				ASTClassOrInterfaceDeclaration classNode = node.getFirstDescendantOfType(ASTClassOrInterfaceDeclaration.class);
				declarations = classNode.getScope().getDeclarations(MethodNameDeclaration.class);
				
				visit=super.visit(node, data);
			}
		}finally{
			declarations.clear();
		}
		return visit;
	}
	
	
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			boolean isInvalid=true;
			List<ASTBlockStatement> blocks = node.findDescendantsOfType(ASTBlockStatement.class);
			for(ASTBlockStatement blockStatement : blocks){
				ASTStatementExpression statement = blockStatement.getFirstDescendantOfType(ASTStatementExpression.class);
				
				if(statement==null || !blockStatement.jjtGetChild(0).equals(statement.jjtGetParent())){
					return data;
				}
				
				
				ASTPrimaryPrefix prefix = statement.getFirstDescendantOfType(ASTPrimaryPrefix.class);
				
				if(prefix==null || prefix.usesSuperModifier()){
					return data;
				}
				
				Node name = null;
				
				if(!prefix.usesThisModifier()){
					name = prefix.jjtGetChild(0);
				}else{
					name=statement.getFirstDescendantOfType(ASTPrimarySuffix.class);
				}
				
				if(name==null){
					return data;
				}
				
				
				boolean found=false;
				for(MethodNameDeclaration method:declarations.keySet()){
			
					if(!name.hasImageEqualTo(method.getName())){
						continue;
					}
					found=true;
					boolean isUsed=false;
			
					for(NameOccurrence occurrence: declarations.get(method) ){
						ASTBlockStatement parent = occurrence.getLocation().getFirstParentOfType(ASTBlockStatement.class);
						
						isUsed= isUsed || parent!=null &&parent.equals(blockStatement);
					}
					
					isInvalid= isInvalid && isUsed;
					break;
				}
				
				if(!found){
					isInvalid=false;
				}
								
			}
			
			
			if(!blocks.isEmpty() && isInvalid){				
				addViolation(data, node);
			}
		}
		
		return data;
	}

	
	
}
