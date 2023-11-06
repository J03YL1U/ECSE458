package domainModelManipulations;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
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
		URI fileURI = URI.createFileURI("C:/Users/erica/Documents/UNI/Grad School/Thesis/grad-project/my.xtext.featurelist.myfeaturelist/model/created/restoappModel.ecore");
		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);

		// Print the contents of the resource to System.out.
		try
		{
		resource.save(System.out, Collections.EMPTY_MAP);
		}
		catch (IOException e) {
			System.out.println("problem");
		}
		
		
		
	}
}
