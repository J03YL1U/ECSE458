package domainModelManipulations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class ExtractClassesFromDomainModel {
	
	static List<String> EcoreDataTypes = Arrays.asList("EInt", "EByte", "EShort", "ELong", "EFloat", "EDouble", "EBoolean", "EChar", "EString");
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
		URI fileURI = URI.createFileURI("model/created/AssetPlusAppModel.ecore");
		//URI fileURI = URI.createFileURI("model/created/minimalRestoAppModel.ecore");
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
						String literals = "";
						if (!EcoreDataTypes.contains(feature.getEType().getName())) {
							literals = "{ ";
							EClassifier enumType = epackage.getEClassifier(featureType);							
							if (enumType instanceof EEnum) {
								EEnum e = (EEnum) enumType;
								for (EEnumLiteral lit : e.getELiterals()) {
									literals = literals.concat(lit.getName() + " ");
								}
								literals = literals.concat("}");
							}
							else {
								System.out.println("Invalid enum"); //should not happen
								return;
							}
						}
						result = result.concat("\t" + featureType + " " + feature.getName() + " " + literals + "\n");
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

		printToMyFeatureListFile(result);
	}

	private static String getJavaType(EStructuralFeature feature) {
		if (feature.getEType().getName() == "EString") {
			return "String";
		}
		String result = feature.getEType().getInstanceClassName(); //for primitive data types
		
		if (result == null) {
			result = feature.getEType().getName(); //for enums
		}
		return result;
	}

	private static void printToMyFeatureListFile(String result) {
		String xtextFileContent = "";

		//save info from current xtext (if any)
		try {
			File myObj = new File("C:\\Users\\Joey Liu\\runtime-EclipseApplication\\testproject\\src\\assetPlus.fl");
			
			//File myObj = new File("C:\\Users\\erica\\Documents\\UNI\\Grad School\\Thesis\\grad-project\\restaruantapp\\src\\minimalrestoapp.fl");
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
			FileWriter myWriter = new FileWriter("C:\\Users\\Joey Liu\\runtime-EclipseApplication\\testproject\\assetPlus.fl");
			//FileWriter myWriter = new FileWriter("C:\\Users\\erica\\Documents\\UNI\\Grad School\\Thesis\\grad-project\\restaruantapp\\src\\minimalrestoapp.fl");
			myWriter.write(result);
			myWriter.write(xtextFileContent);
			myWriter.close();
			System.out.println("Feature Language was updated.");
		} catch (IOException e) {
			System.out.println("Writing to Feature Language failed.");
			e.printStackTrace();
		}
	}
	
	private static String formatMultiplicity(int lowerBound, int upperBound) {
		String result = lowerBound + ".." + upperBound;
		result = result.replace("-1", "*");
		return result;
	}
}
