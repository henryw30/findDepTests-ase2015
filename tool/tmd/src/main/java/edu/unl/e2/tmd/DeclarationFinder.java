package edu.unl.e2.tmd;

import java.util.List;

import net.sourceforge.pmd.lang.java.symboltable.VariableNameDeclaration;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;

public abstract class DeclarationFinder {

	public void onFound(VariableNameDeclaration declaration,
			List<NameOccurrence> occurrences) {
	}

	public boolean onFound2(VariableNameDeclaration declaration,
			List<NameOccurrence> occurrences) {
		return false;
	}

}