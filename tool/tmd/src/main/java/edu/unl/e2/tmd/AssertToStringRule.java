package edu.unl.e2.tmd;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.util.List;

import com.google.common.collect.Lists;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTArguments;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTPrimarySuffix;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

public class AssertToStringRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTMethodDeclaration method, Object data) {
		
		if(isJUnitMethod(method, data) && method.getMethodName().toLowerCase().contains("tostring")){
			return data;
		}
		
		List<ASTStatementExpression> statements = method.findDescendantsOfType(ASTStatementExpression.class);
		boolean isInvalid=true;
		boolean hasAssertStatement=false;
		for(ASTStatementExpression node: statements){

			String assertion = getMethodName(node);
			
			if(assertion != null && (assertion.startsWith("assert") || assertion.startsWith("Assert.assert"))){
				hasAssertStatement=true;
				boolean callToString=false;
				for(ASTName name :   node.findDescendantsOfType(ASTName.class)){
					
					String [] methodCall=name.getImage().split("\\.");
					
					if(methodCall.length>1 &&  methodCall[1].equals("toString") ){

						
						ASTArguments arguments = node.getFirstDescendantOfType(ASTArguments.class);
						
						if(!arguments.equals(name.getFirstParentOfType(ASTArguments.class))){
							continue;
						}
						
						ASTPrimaryExpression pExp = name.getFirstParentOfType(ASTPrimaryExpression.class);
						List<Node> nodes = Lists.newArrayList();
						for(int i=0;i<pExp.jjtGetNumChildren(); i++){
							nodes.add(pExp.jjtGetChild(i));
						}
						
						ASTPrimarySuffix suffix = (ASTPrimarySuffix) nodes.get(nodes.indexOf(name.jjtGetParent())+1);
						ASTArguments toStringArg = suffix.getFirstChildOfType(ASTArguments.class);
						if(suffix!=null && toStringArg!=null && toStringArg.getArgumentCount()>0 ){
							continue;
						}
						
						int indexOfName = nodes.indexOf(name.jjtGetParent());
						
						if(nodes.size()>indexOfName+2){
						
							suffix = (ASTPrimarySuffix) nodes.get(indexOfName+2);
							if(suffix!=null &&( suffix.hasImageEqualTo("contains") || suffix.hasImageEqualTo("startsWith") || suffix.hasImageEqualTo("endsWith") || suffix.hasImageEqualTo("matches"))){
								continue;
							}
						}
						
						if(shouldIgnoreIfType(methodCall[0],
								name.getScope())){
							continue;
						}
						
						
						if(isAssertionWithMessage(assertion, arguments)){
							
							List<ASTName> findDescendantsOfType = arguments.jjtGetChild(0).jjtGetChild(0).findDescendantsOfType(ASTName.class);
							callToString |= !findDescendantsOfType.contains(name);
						}else{
							callToString |=true;
						}
					}
				}
				isInvalid&=callToString;
			}
		}
		
		if(hasAssertStatement && isInvalid){
			addViolation(data, method);
			
		}
		return data;
	}

	private boolean isAssertionWithMessage(String assertion, ASTArguments arguments) {
		return assertion.contains("assertArrayEquals") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertEquals") && arguments.getArgumentCount()>=3 ||
			assertion.contains("assertFalse") && arguments.getArgumentCount()==2 ||
			assertion.contains("assertNotNull") && arguments.getArgumentCount()==2 ||
			assertion.contains("assertNotSame") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertNull") && arguments.getArgumentCount()==2 ||
			assertion.contains("assertSame") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertThat") && arguments.getArgumentCount()==3 ||
			assertion.contains("assertTrue") && arguments.getArgumentCount()==2;
	}

	private boolean shouldIgnoreIfType(String variable, Scope scope) {
		return Utils.isTrue(variable, scope, new DeclarationFinder() {

			@Override
			public boolean onFound2(
					VariableNameDeclaration declaration,
					List<NameOccurrence> occurrences) {
				
				
				Class<?> type = declaration.getType();
				boolean b = type!=null && (type.isAssignableFrom(StringBuilder.class) ||
						type.isAssignableFrom(StringBuffer.class) ||
						type.isAssignableFrom(StringWriter.class)  ||
						type.isAssignableFrom(Integer.class)   ||
						type.isAssignableFrom(Double.class)   || 
						type.isAssignableFrom(Long.class) || 
						type.isAssignableFrom(Byte.class) || 
						type.isAssignableFrom(Boolean.class) || 
						type.isAssignableFrom(Float.class) || 
						type.isAssignableFrom(Short.class)  || 
						type.isAssignableFrom(ByteArrayOutputStream.class)   );
				return b;
				
			}
			
			
		});
	}

	private String getMethodName(ASTStatementExpression expression) {
		if (expression!=null
                && expression.jjtGetNumChildren()>0
                && expression.jjtGetChild(0) instanceof ASTPrimaryExpression
                ) {
            ASTPrimaryExpression pe = (ASTPrimaryExpression) expression.jjtGetChild(0);
            if (pe.jjtGetNumChildren()> 0 && pe.jjtGetChild(0) instanceof ASTPrimaryPrefix) {
                ASTPrimaryPrefix pp = (ASTPrimaryPrefix) pe.jjtGetChild(0);
                if (pp.jjtGetNumChildren()>0 && pp.jjtGetChild(0) instanceof ASTName) {
                    return ((ASTName) pp.jjtGetChild(0)).getImage();
                }
            }
        }
		
		return null;
	}	
}
