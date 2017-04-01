package edu.unl.e2.tmd.internal;


import edu.unl.e2.tmd.MyAbstractJUnitRule;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;

public class JavaNIOCounter extends MyAbstractJUnitRule {


	@Override
	public Object visit(ASTPrimaryPrefix node, Object data) {
		
		
		ASTName name = node.getFirstDescendantOfType(ASTName.class);

		if(name!=null && (name.getImage().startsWith("Files.new") || name.getImage().startsWith("Files.read") || name.getImage().startsWith("Files.write"))){
			addViolation(data, node);
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
