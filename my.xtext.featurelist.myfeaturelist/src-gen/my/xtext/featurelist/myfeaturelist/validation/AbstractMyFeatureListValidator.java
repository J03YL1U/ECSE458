/*
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyFeatureListValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage.eINSTANCE);
		return result;
	}
}