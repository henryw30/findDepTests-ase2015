package edu.unl.e2.tmd;

import java.util.List;

import net.sourceforge.pmd.lang.java.ast.ASTBlockStatement;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;

public class EmptyTestsRule extends MyAbstractJUnitRule {



	
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		
		if(isJUnitMethod(node, data)&& !isIgnored(node)){
			List<ASTBlockStatement> blocks = node.findDescendantsOfType(ASTBlockStatement.class);
			
			if(blocks.isEmpty()){				
				addViolation(data, node);
			}
		}
		
		return data;
	}

	
	
}
