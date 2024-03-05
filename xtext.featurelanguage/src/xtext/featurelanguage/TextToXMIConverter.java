package xtext.featurelanguage;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class TextToXMIConverter {
	
	public static void main(String[] args) {
	    Injector injector = new FeatureLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

	    // replace absoluteTargetFolderPath with the path to your folder
	    String absoluteTargetFolderPath = "C:\\Users\\Joey Liu\\runtime-EclipseApplication\\testproject\\";
	   // String inputURI = "file:///" + absoluteTargetFolderPath + "restaruantapp\\src\\myrestaurantapp.fl";
	    String inputURI = "file:///" + absoluteTargetFolderPath + "assetPlus.fl";
	    //String inputURI = "file:///" + absoluteTargetFolderPath + "restaruantapp\\src\\MinimalRestoApp.fl";
	    String outputURI = "file:///" + absoluteTargetFolderPath + "assetPlus.xmi";
	    //String outputURI = "file:///" + absoluteTargetFolderPath + "MinimalRestoApp.xmi";
	    
	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet.createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}