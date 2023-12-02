/*
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.validation;

import org.eclipse.xtext.validation.Check;

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
			for (Key otherKey : featureList.getKey()) {
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
			for (Key key : featureList.getKey()) {
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
	
}
