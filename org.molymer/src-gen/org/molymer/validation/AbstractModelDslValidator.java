/*
 * generated by Xtext
 */
package org.molymer.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractModelDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.molymer.modelDsl.ModelDslPackage.eINSTANCE);
		return result;
	}
}
