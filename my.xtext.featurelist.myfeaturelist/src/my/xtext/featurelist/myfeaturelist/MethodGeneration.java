package my.xtext.featurelist.myfeaturelist;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Concept;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Feature;
import my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList;
import my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Verb;

public class MethodGeneration {

	 public static void main(String[] args) {
		 //get ecore model
		 MyFeatureListPackage.eINSTANCE.eClass();
		 
		 //get xmi file
		 Resource resource = ResourceHelper.INSTANCE.loadResource("xmiFiles/restoappxmi.xmi");
		 FeatureList xmiRoot = (FeatureList) resource.getContents().get(0);	
		 
		 EList<Feature> features = xmiRoot.getFeature();
		 
		 for (Feature feature : features) {
			 Verb verb = feature.getVerb();
			 Concept concept = feature.getConcept();
			 Attribute featureAttribute = feature.getAttribute();
			 
			 String methodName = verb.getName() + concept.getName();
			 if (featureAttribute != null) {
				 methodName.concat(featureAttribute.getName());
			 }
			 
			 if (verb.getName() == "Add") {
				 String paramList = "";
				 if (featureAttribute == null) {
					 EList<Attribute> attributes = concept.getAttributes();
					 for (Attribute attribute : attributes) {
						 paramList = paramList.concat(attribute.getName() + " " + attribute.getName().toLowerCase() + ", ");
					 }
					 paramList = paramList.substring(0, paramList.length() - 2);
				 }
				 else {
					 paramList = concept.getName() + " " + concept.getName().toLowerCase() + ", " + featureAttribute.getName() + " " + featureAttribute.getName().toLowerCase();
				 }
				 String returnStatement = featureAttribute == null? concept.getName() : featureAttribute.getName();
				 
				 String methodSignature = "public " + returnStatement + " " + methodName + "(" + paramList + ");";
				 System.out.println(methodSignature);
			 }
			 else if (verb.getName() == "Remove") {
				 String paramList;
				 paramList = concept.getName() + " " + concept.getName().toLowerCase();
				 if (featureAttribute != null){
					 paramList = paramList.concat(", " + featureAttribute.getName() + " " + featureAttribute.getName().toLowerCase());
				 }
				 String methodSignature = "public void " + methodName + "(" + paramList + ");";
				 System.out.println(methodSignature);
			 }
			 else if (verb.getName() == "Display") {
				 String paramList;
				 if (featureAttribute == null) {
					 paramList = concept.getName() + " " + concept.getName().toLowerCase();
				 }
				 else {
					 paramList = featureAttribute.getName() + " " + featureAttribute.getName().toLowerCase();
				 }
				 String returnStatement = featureAttribute == null? concept.getName() : featureAttribute.getName();
				 
				 String methodSignature = "public " + returnStatement + " " + methodName + "(" + paramList + ");";
				 System.out.println(methodSignature);
			 }
			 else if (verb.getName() == "Update") {
				 String paramList = "";
				 if (featureAttribute == null) {
					 EList<Attribute> attributes = concept.getAttributes();
					 for (Attribute attribute : attributes) {
						 paramList = paramList.concat(attribute.getName() + " " + attribute.getName().toLowerCase() + ", ");
					 }
					 paramList = paramList.substring(0, paramList.length() - 2);
				 }
				 else {
					 paramList = concept.getName() + " " + concept.getName().toLowerCase() + ", " + featureAttribute.getName() + " " + featureAttribute.getName().toLowerCase();
				 }
				 String returnStatement = featureAttribute == null? concept.getName() : featureAttribute.getName();
				 
				 String methodSignature = "public " + returnStatement + " " + methodName + "(" + paramList + ");";
				 System.out.println(methodSignature);
			 }
		 }
		 
		 //TODO: FIX CAPITALIZATION ISSUE
	 }
}
