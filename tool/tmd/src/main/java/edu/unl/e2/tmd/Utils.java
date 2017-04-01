package edu.unl.e2.tmd;

import java.util.List;
import java.util.Map;

import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.lang.symboltable.Scope;

public class Utils {

	public static void select(String pathVariable, Scope pathScope,
			DeclarationFinder finder) {

		boolean found = false;
		while (pathScope != null && !found) {

			Map<VariableNameDeclaration, List<NameOccurrence>> pathDeclarations = pathScope
					.getDeclarations(VariableNameDeclaration.class);

			for (VariableNameDeclaration pathDeclaration : pathDeclarations
					.keySet()) {

				if (!pathVariable.equals(pathDeclaration.getName())) {
					continue;
				}

				finder.onFound(pathDeclaration,
						pathDeclarations.get(pathDeclaration));

				found = true;
				break;

			}

			pathScope = pathScope.getParent();
		}
	}

	public static boolean isTrue(String variable, Scope scope,
			DeclarationFinder finder) {
		boolean found = false;
		while (scope != null && !found) {

			Map<VariableNameDeclaration, List<NameOccurrence>> pathDeclarations = scope
					.getDeclarations(VariableNameDeclaration.class);

			for (VariableNameDeclaration pathDeclaration : pathDeclarations
					.keySet()) {

				if (!variable.equals(pathDeclaration.getName())) {
					continue;
				}

				if(finder.onFound2(pathDeclaration,
						pathDeclarations.get(pathDeclaration))){
					return true;
				}

				

			}

			scope = scope.getParent();
		}
		
		return false;
	}
	
	public static boolean isFalse(String variable, Scope scope,
			DeclarationFinder finder) {
		boolean found = false;
		while (scope != null && !found) {

			Map<VariableNameDeclaration, List<NameOccurrence>> pathDeclarations = scope
					.getDeclarations(VariableNameDeclaration.class);

			for (VariableNameDeclaration pathDeclaration : pathDeclarations
					.keySet()) {

				if (!variable.equals(pathDeclaration.getName())) {
					continue;
				}

				if(finder.onFound2(pathDeclaration,
						pathDeclarations.get(pathDeclaration))){
					return false;
				}

				

			}

			scope = scope.getParent();
		}
		
		return true;
	}
	
	

	public static <T> T get(String pathVariable, Scope pathScope,
			TypedDeclarationFinder<T> finder) {
		boolean found = false;
		while (pathScope != null && !found) {

			Map<VariableNameDeclaration, List<NameOccurrence>> pathDeclarations = pathScope
					.getDeclarations(VariableNameDeclaration.class);

			for (VariableNameDeclaration pathDeclaration : pathDeclarations
					.keySet()) {

				if (!pathVariable.equals(pathDeclaration.getName())) {
					continue;
				}

				return finder.onFound3(pathDeclaration,
						pathDeclarations.get(pathDeclaration));

			}

			pathScope = pathScope.getParent();
		}
		
		return null;
	}

}