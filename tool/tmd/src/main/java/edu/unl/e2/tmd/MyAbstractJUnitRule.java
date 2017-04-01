package edu.unl.e2.tmd;

import java.util.List;

import org.apache.tools.ant.taskdefs.Typedef;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceType;
import net.sourceforge.pmd.lang.java.ast.ASTCompilationUnit;
import net.sourceforge.pmd.lang.java.ast.ASTExtendsList;
import net.sourceforge.pmd.lang.java.ast.ASTFormalParameters;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTName;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryExpression;
import net.sourceforge.pmd.lang.java.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.lang.java.ast.ASTResultType;
import net.sourceforge.pmd.lang.java.ast.ASTStatementExpression;
import net.sourceforge.pmd.lang.java.ast.ASTTypeDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTTypeParameters;
import net.sourceforge.pmd.lang.java.ast.TypeNode;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;
import net.sourceforge.pmd.lang.java.typeresolution.TypeHelper;

public class MyAbstractJUnitRule extends AbstractJavaRule {

    public static final Class<?> JUNIT4_CLASS;

    public static final Class<?> JUNIT3_CLASS;

    protected boolean isJUnit3Class;
    protected boolean isJUnit4Class;

    /**
     * Extracted from net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule
     */
    static {
		Class<?> c;
		try {
		    c = Class.forName("org.junit.Test");
		} catch (ClassNotFoundException t) {
		    c = null;
		}
		JUNIT4_CLASS = c;
	
		try {
		    c = Class.forName("junit.framework.TestCase");
		} catch (ClassNotFoundException t) {
		    c = null;
		}
		JUNIT3_CLASS = c;
    }

    /**
     * Extracted from net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule
     */
    @Override
    public Object visit(ASTCompilationUnit node, Object data) {
	
		initialize(node);
	
		if (isJUnit3Class || isJUnit4Class) {
		    
			List<ASTAnnotation> testClassAnnotations = node.getFirstDescendantOfType(ASTTypeDeclaration.class).findChildrenOfType(ASTAnnotation.class);
			

			
			if(isJUnit4Class && isIgnored(testClassAnnotations)){
		    	return data;
		    }
			
			return super.visit(node, data);
		}
		return data;
	}

	protected void initialize(ASTCompilationUnit node) {
		isJUnit3Class = isJUnit4Class = false;
	
		isJUnit3Class = isJUnit3Class(node);
		if (!isJUnit3Class) {
		    isJUnit4Class = isJUnit4Class(node);
		}
	}

	public boolean isJUnitMethod(ASTMethodDeclaration method, Object data) {
	
		if (!method.isPublic() || method.isAbstract() || method.isNative() || method.isStatic()) {
		    return false; // skip various inapplicable method variations
		}
	
		if (isJUnit3Class) {
		    return isJUnit3Method(method);
		} else {
		    return isJUnit4Method(method);
		}
    }

    /**
     * Extracted from net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule
     */
    private boolean isJUnit4Method(ASTMethodDeclaration method) {
    	return doesNodeContainJUnitAnnotation(method.jjtGetParent());
    }
    
    /**
     * Extracted from net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule
     */
    private boolean isJUnit3Method(ASTMethodDeclaration method) {
		Node node = method.jjtGetChild(0);
		if (node instanceof ASTTypeParameters) {
		    node = method.jjtGetChild(1);
		}
		ASTFormalParameters firstChildOfType = method.getFirstDescendantOfType(ASTFormalParameters.class);
		return ((ASTResultType) node).isVoid() && firstChildOfType.getParameterCount()==0 && method.getMethodName().startsWith("test");
    }

    /**
     * Extracted from net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule
     */
    private boolean isJUnit3Class(ASTCompilationUnit node) {
		if (node.getType() != null && TypeHelper.isA(node, JUNIT3_CLASS)) {
		    return true;
	
		} else if (node.getType() == null) {
			ASTClassOrInterfaceDeclaration cid = node
					.getFirstDescendantOfType(ASTClassOrInterfaceDeclaration.class);
			if (cid == null) {
				return false;
			}
			ASTExtendsList extendsList = cid
					.getFirstChildOfType(ASTExtendsList.class);
			if (extendsList == null) {
				return false;
			}
			if (((ASTClassOrInterfaceType) extendsList.jjtGetChild(0))
					.getImage().endsWith("TestCase")) {
				return true;
			}
			String className = cid.getImage();
			return className.endsWith("Test");
		}
		return false;
    }
    
    /**
     * Extracted from net.sourceforge.pmd.lang.java.rule.junit.AbstractJUnitRule
     */
    private boolean isJUnit4Class(ASTCompilationUnit node) {
    	return doesNodeContainJUnitAnnotation(node);
    }

    
    protected boolean isIgnored(ASTMethodDeclaration node) {
       

		return isIgnored(node.getNthParent(1).findDescendantsOfType(ASTAnnotation.class));
    }

	private boolean isIgnored(List<ASTAnnotation> annotations) {
		for (ASTAnnotation annotation : annotations) {
	        Node annotationTypeNode = annotation.jjtGetChild(0);
	        TypeNode annotationType = (TypeNode) annotationTypeNode;
	        if (annotationType.getType() == null) {
	            ASTName name = annotationTypeNode.getFirstChildOfType(ASTName.class);
	            if (name != null && "Ignore".equals(name.getImage())) {
	                return true;
	            }
	        } else
				try {
					if (annotationType.getType().equals(Class.forName("org.junit.Ignore"))) {
					    return true;
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    }

        return false;
	}
	
    private boolean doesNodeContainJUnitAnnotation(Node node) {
        List<ASTAnnotation> annotations = node.findDescendantsOfType(ASTAnnotation.class);
        for (ASTAnnotation annotation : annotations) {
            Node annotationTypeNode = annotation.jjtGetChild(0);
            TypeNode annotationType = (TypeNode) annotationTypeNode;
            if (annotationType.getType() == null) {
                ASTName name = annotationTypeNode.getFirstChildOfType(ASTName.class);
                if (name != null && "Test".equals(name.getImage())) {
                    return true;
                }else if(name != null && "Ignore".equals(name.getImage())) {
                    return false;
                }
            } else if (annotationType.getType().equals(JUNIT4_CLASS)) {
                return true;
            } else
				try {
					if (annotationType.getType().equals(Class.forName("org.junit.Ignore"))) {
					    return false;
					}
				} catch (ClassNotFoundException e) {
				}
        }
        return false;
    }
    
    
	
	/**
     * Tells if the expression is an assert statement or not.
     * Extracted from net.sourceforge.pmd.lang.java.rule.junit.JUnitTestsShouldIncludeAssertRule
     */
    protected boolean isAssertOrFailStatement(ASTStatementExpression expression) {
        if (expression!=null
                && expression.jjtGetNumChildren()>0
                && expression.jjtGetChild(0) instanceof ASTPrimaryExpression
                ) {
            ASTPrimaryExpression pe = (ASTPrimaryExpression) expression.jjtGetChild(0);
            if (pe.jjtGetNumChildren()> 0 && pe.jjtGetChild(0) instanceof ASTPrimaryPrefix) {
                ASTPrimaryPrefix pp = (ASTPrimaryPrefix) pe.jjtGetChild(0);
                if (pp.jjtGetNumChildren()>0 && pp.jjtGetChild(0) instanceof ASTName) {
                    String img = ((ASTName) pp.jjtGetChild(0)).getImage();
                    if (img != null && (img.startsWith("assert") || img.startsWith("fail") || img.startsWith("Assert.assert") || img.startsWith("Assert.fail") || isThirdPartyAssertion(img))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    protected boolean isThirdPartyAssertion(String possibleAssertion) {
		return false;
	}

	protected boolean isSetUp(ASTMethodDeclaration node) {
		if(isJUnit4Class){
			return isAnnotated(node, "Before");
		}else{
			return node.getName().equals("setUp");
		}
	}
    
    protected boolean isTearDown(ASTMethodDeclaration node) {
		if(isJUnit4Class){
			return isAnnotated(node, "After");
		}else{
			return node.getName().equals("tearDown");
		}
	}
    
    protected boolean isBeforeClass(ASTMethodDeclaration node) {
		if(isJUnit4Class){
			return isAnnotated(node, "BeforeClass");
		}else{
			return false;
		}
	}

    protected boolean isAfterClass(ASTMethodDeclaration node) {
		if(isJUnit4Class){
			return isAnnotated(node, "AfterClass");
		}else{
			return false;
		}
	}


	protected ASTMethodDeclaration getOuterMethodDeclaration(Node location) {
		return getOuter(location,ASTMethodDeclaration.class);
	}

	protected <T extends Node> T getOuter(Node location,Class<T> klass) {
		T current = location
				.getFirstParentOfType(klass);
		T outter = null;
		while (current != null) {
			outter = current;
			current = current.getFirstParentOfType(klass);
		}
		return outter;
	}

	private boolean isAnnotated(ASTMethodDeclaration node,
			String annotationName) {
		List<ASTAnnotation> annotations = node.jjtGetParent().findDescendantsOfType(ASTAnnotation.class);
		 for (ASTAnnotation annotation : annotations) {

            ASTName name = annotation.getFirstDescendantOfType(ASTName.class);
			if (name != null && annotationName.equals(name.getImage())) {
                return true;
            }
	           
        }
        return false;
	}
	
	
}
