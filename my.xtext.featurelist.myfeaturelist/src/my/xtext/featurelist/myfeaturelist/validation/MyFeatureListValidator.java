/*
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

import my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Concept;
import my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Key;
import my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyFeatureListValidator extends AbstractMyFeatureListValidator {

	//	public static final String INVALID_NAME = "invalidName";
	//
	//	@Check
	//	public void checkGreetingStartsWithCapital(Greeting greeting) {
	//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	//			warning("Name should start with a capital",
	//					MyFeatureListPackage.Literals.GREETING__NAME,
	//					INVALID_NAME);
	//		}
	//	}

	@Check
	public void checkOnlyOneKeyPerConcept(Key key) {
		FeatureList featureList = (FeatureList) key.eContainer();

		if (featureList != null) {
			for (Key otherKey : featureList.getKeys()) {
				if ( !key.equals(otherKey) && key.getConcept().equals(otherKey.getConcept())) {
					error("There can only be one key per concept",
							MyFeatureListPackage.Literals.KEY__CONCEPT);
					break;
				}
			}
		}
	}

	@Check
	public void checkEachConceptHasKey(Concept concept) {
		FeatureList featureList = (FeatureList) concept.eContainer();
		boolean hasKey = false;

		if (featureList != null) {
			for (Key key : featureList.getKeys()) {
				if (key.getConcept().equals(concept)) {
					hasKey = true;
					break;
				}
			}

			if (!hasKey) {
				error("Every concept needs a key",
						MyFeatureListPackage.Literals.CONCEPT__NAME);
			}
		}
	}

	//TODO: FIX
	@Check
	public void checkMultiplicity(Attribute attribute) {
		String multiplicity = attribute.getMultiplicity();
		System.out.println(multiplicity);
		if (multiplicity != null) {
			String[] symbols = multiplicity.split("\\.\\.");
			int from;
			try {
				from = Integer.parseInt(symbols[0]);
			}
			catch (NumberFormatException e) {
				if (symbols[1] != "*") {
					error("Multiplicity's lower bound must be lesser or equal to upper bound",
							MyFeatureListPackage.Literals.ATTRIBUTE__NAME);
				}
				return;
			}
			int to;
			try {
				to = Integer.parseInt(symbols[1]);
			}
			catch (NumberFormatException e) {
				return;
			}

			if (from > to) {
				error("Multiplicity's lower bound must be lesser or equal to upper bound",
						MyFeatureListPackage.Literals.ATTRIBUTE__NAME);
			}
		}
	}

}
