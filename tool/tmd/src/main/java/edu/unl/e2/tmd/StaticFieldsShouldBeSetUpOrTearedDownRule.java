package edu.unl.e2.tmd;

import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTAssignmentOperator;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTTypeDeclaration;
import net.sourceforge.pmd.lang.java.ast.AccessNode;
import net.sourceforge.pmd.lang.java.ast.TypeNode;
import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.ScopedNode;

import com.google.common.collect.Sets;

public class StaticFieldsShouldBeSetUpOrTearedDownRule extends MyAbstractJUnitRule {

	@Override
	public Object visit(ASTCompilationUnit cUnit, Object data) {
		
		super.initialize(cUnit);
		
		Object visit = data;
		if (isJUnit3Class || isJUnit4Class) {
			
			ASTTypeDeclaration typeDeclaration = cUnit
					.getFirstDescendantOfType(ASTTypeDeclaration.class);
			
			for (ASTAnnotation annotation : typeDeclaration
					.findChildrenOfType(ASTAnnotation.class)) {
			
				Node annotationTypeNode = annotation.jjtGetChild(0);
				TypeNode annotationType = (TypeNode) annotationTypeNode;
				if (annotationType.getType() == null) {
					ASTName name = annotationTypeNode
							.getFirstChildOfType(ASTName.class);
					if (name != null && "FixMethodOrder".equals(name.getImage())) {
						return visit;
					}
				} else {
					try {
						if (annotationType.getType().equals(
								Class.forName("org.junit.FixMethodOrder"))) {
							return visit;
						}
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			ASTClassOrInterfaceDeclaration classNode = cUnit.getFirstDescendantOfType(ASTClassOrInterfaceDeclaration.class);
			
			
			Map<VariableNameDeclaration, List<NameOccurrence>> declarations = classNode.getScope().getDeclarations(VariableNameDeclaration.class);
			
			for(VariableNameDeclaration variableDeclaration : declarations.keySet()){
				
				AccessNode accessNodeParent = variableDeclaration.getAccessNodeParent();
			
				if(accessNodeParent.isStatic()){
					Set<String> testWrite= Sets.newHashSet();
					Set<String> testRead= Sets.newHashSet();
					Set<String> setUpWrite= Sets.newHashSet();
					Set<String> tearDownWrite= Sets.newHashSet();
					for(NameOccurrence occurrence: declarations.get(variableDeclaration)){
						
						ScopedNode location = occurrence.getLocation();

						ASTMethodDeclaration method = location.getFirstParentOfType(ASTMethodDeclaration.class);
						
						if(method==null){
							continue;
						}
						
						
						Node parentNode = location.getNthParent(1);
						
						boolean isWritten=false;
						
						if(parentNode instanceof ASTPrimaryPrefix){
							Node expression = parentNode.getNthParent(2);
							
							isWritten=expression.getFirstChildOfType(ASTAssignmentOperator.class)!=null;
						}
						

						if(isWritten && isJUnitMethod(method,data) && !isIgnored(method)){
	
							testWrite.add(method.getMethodName());
						}else if(!isWritten && isJUnitMethod(method,data) && !isIgnored(method) && !testWrite.contains(method.getMethodName())){
							testRead.add(method.getMethodName());
						}else if(isWritten && isSetUp(method)){
							setUpWrite.add(method.getMethodName());
						}else if(isWritten && isTearDown(method)){
							tearDownWrite.add(method.getMethodName());
						}
					}
					
					if(!testWrite.isEmpty() && !testRead.isEmpty() && setUpWrite.isEmpty() && tearDownWrite.isEmpty() && Sets.union(testWrite, testRead).size()>1){
						addViolation(data, accessNodeParent);
					}
				}
			}
			
		}
		return visit;
	}

}
