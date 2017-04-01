package edu.unl.e2.tmd;

import java.util.List;

import net.sourceforge.pmd.lang.java.ast.ASTBlockStatement;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;

public class OneLineTestsRule extends MyAbstractJUnitRule {


	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			
			List<ASTBlockStatement> statements = node.findDescendantsOfType(ASTBlockStatement.class);
			if(statements.size()==1){
				ASTName name = node.getFirstDescendantOfType(ASTName.class);
				
				if(name!=null && name.getImage().startsWith("test")){
					addViolation(data, node);
				}
			}
		}
		
		return data;
	}

	
	
}
