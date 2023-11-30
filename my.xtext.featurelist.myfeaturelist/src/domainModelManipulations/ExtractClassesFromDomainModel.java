package domainModelManipulations;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
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

		// Print the contents of the resource to System.out.
		/*try
		{
		resource.save(System.out, Collections.EMPTY_MAP);
		}
		catch (IOException e) {
			System.out.println("problem");
		}*/
		
		//get classes
		EPackage epackage = (EPackage) resource.getContents().get(0);
		
		for (EClassifier classifier : epackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				System.out.println(classifier.getName());
				for (EStructuralFeature feature : ((EClass) classifier).getEStructuralFeatures()) {
					if (feature instanceof EAttribute) {
						System.out.println(feature.getName());
					}
					if (feature instanceof EReference) {
						
					}
				}
			}
			System.out.println();
		}
		
		
		
		/*for (EObject object : objects) {
			if (object.getClass() == EClassifier.class) {
				System.out.println(object.toString());
			}
		}*/
	}
}
