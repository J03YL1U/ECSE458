package my.xtext.featurelist.myfeaturelist;

import org.eclipse.emf.ecore.resource.Resource;

import my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList;
import my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage;

public class MethodGeneration {

	 public static void main(String[] args) {
		 //get ecore model
		 MyFeatureListPackage.eINSTANCE.eClass();
		 
		 //get xmi file
		 Resource resource = ResourceHelper.INSTANCE.loadResource("xmiFiles/restoappxmi.xmi");
		 FeatureList xmiRoot = (FeatureList) resource.getContents().get(0);	
		 
		 System.out.println(xmiRoot.getFeature().get(0));
		 
		 //cycle through feature list in xmi file
		 
		 //for each feature
		 
		 //create method signature
	 }
}
