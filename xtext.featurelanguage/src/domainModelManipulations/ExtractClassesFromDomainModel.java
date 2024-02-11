package domainModelManipulations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class ExtractClassesFromDomainModel {
	public static void main(String[] args) {

		String result = "";

		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		EcorePackage ecorePackage = EcorePackage.eINSTANCE;

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI("model/created/restoappModel.ecore");
		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);

		//get classes
		EPackage epackage = (EPackage) resource.getContents().get(0);

		for (EClassifier classifier : epackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				result = result.concat("concept " + classifier.getName() + "\n");
				for (EStructuralFeature feature : ((EClass) classifier).getEStructuralFeatures()) {
					if (feature instanceof EAttribute) {
						String featureType = getJavaType(feature);
						result = result.concat("\t" + featureType + " " + feature.getName() + "\n");
					}
					if (feature instanceof EReference) {
						int lowerBound = feature.getLowerBound();
						int upperBound = feature.getUpperBound();
						String multiplicity = formatMultiplicity(lowerBound, upperBound);
						result = result.concat("\t" + feature.getEType().getName() + " " + feature.getName() + " " + multiplicity + "\n");
					}
				}
				result = result.concat("\n");
			}
		}

		//System.out.println(result);

		printToMyFeatureListFile(result);
	}

	private static String getJavaType(EStructuralFeature feature) {
		if (feature.getEType().getName() == "EString") {
			return "String";
		}
		return feature.getEType().getInstanceClassName();
	}

	private static void printToMyFeatureListFile(String result) {
		String xtextFileContent = "";

		//save info from current xtext (if any)
		try {
			File myObj = new File("C:\\Users\\erica\\Documents\\UNI\\Grad School\\Thesis\\grad-project\\restaruantapp\\src\\myrestaurantapp.myfeaturelist");
			Scanner myReader = new Scanner(myObj);
			boolean flag = false;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (data.equals("constraints")) {
					flag = true;
				}
				if (flag) {
					xtextFileContent = xtextFileContent.concat(data + "\n");
				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}

		try {
			//TODO: CHANGE TO SAME FILE NAME AS LINE 95 WHEN EXTRACTION WILL BE BETTER
			FileWriter myWriter = new FileWriter("C:\\Users\\erica\\Documents\\UNI\\Grad School\\Thesis\\grad-project\\myrestaurantappFromUmple.myfeaturelist");
			myWriter.write(result);
			myWriter.write(xtextFileContent);
			myWriter.close();
			System.out.println("MyFeatureList was updated.");
		} catch (IOException e) {
			System.out.println("Writing to MyFeatureList failed.");
			e.printStackTrace();
		}
	}
	
	private static String formatMultiplicity(int lowerBound, int upperBound) {
		String result = lowerBound + ".." + upperBound;
		result = result.replace("-1", "*");
		return result;
	}
}
