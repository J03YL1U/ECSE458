package my.xtext.featurelist.myfeaturelist;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Concept;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Feature;
import my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Key;
import my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Verb;

public class MethodGeneration {

	 public static void main(String[] args) {
		 //get ecore model
		 MyFeatureListPackage.eINSTANCE.eClass();
		 
		 //get xmi file
		 Resource resource = ResourceHelper.INSTANCE.loadResource("xmiFiles/restoappxmi.xmi");
		 FeatureList xmiRoot = (FeatureList) resource.getContents().get(0);	
		 
		 EList<Feature> features = xmiRoot.getFeatures();
		 EList<Key> keys = xmiRoot.getKeys();
		 EList<Concept> concepts = xmiRoot.getConcepts();
		 
		 for (Feature feature : features) {
			 Verb verb = feature.getVerb();
			 Concept concept = feature.getConcept();
			 Key key = keys.stream().filter(item -> item.getConcept() == concept).findFirst().get();
			 Attribute featureAttribute = feature.getAttribute();
			 Key attributeKey = null;
			 if (featureAttribute != null) {				 
				 try {
					attributeKey = keys.stream().filter(item -> item.getConcept().getName().toLowerCase().equals(featureAttribute.getName())).findFirst().get();
				} catch (NoSuchElementException e) {
					attributeKey = null;
				}
			 }
			 
			 String methodName = createMethodName(verb, concept, featureAttribute);
			 
			 if (verb.getName() == "Add") {
				 createAddMethodPrototype(concepts, concept, featureAttribute, key, methodName);
			 }
			 else if (verb.getName() == "Remove") {
				 createRemoveMethodPrototype(concept, featureAttribute, key, attributeKey, methodName);
			 }
			 else if (verb.getName() == "Display") {
				 createDisplayMethodPrototype(concept, featureAttribute, key, attributeKey, methodName);
			 }
			 else if (verb.getName() == "Update") {
				 createUpdateMethodPrototype(concept, featureAttribute, key, attributeKey, methodName);
			 }
		 }
	 }
	 
	 private static String createMethodName(Verb verb, Concept concept, Attribute featureAttribute) {
		 String methodName = verb.getName().toLowerCase();
		 if (featureAttribute != null && verb.getName() != "Update") {
			 String capitalizedAttributeName = featureAttribute.getName();
			 capitalizedAttributeName = capitalizedAttributeName.substring(0, 1).toUpperCase().concat(capitalizedAttributeName.substring(1));
			 methodName = methodName.concat(capitalizedAttributeName);
			 if (verb.getName() == "Add") {
				 methodName = methodName.concat("To");
			 }
			 else if (verb.getName() == "Remove" || verb.getName() == "Display"
					 ) {
				 methodName = methodName.concat("From");
			 }			 
		 }
		 methodName = methodName.concat(concept.getName());
		 
		 return methodName;
	 }
	 
	 private static void createAddMethodPrototype(EList<Concept> concepts, Concept concept, Attribute featureAttribute, Key key, String methodName) {
		 String paramList = "";
		 if (featureAttribute == null) {			  
			 EList<Attribute> attributes = concept.getAttributes();
			 for (Attribute attribute : attributes) {
				 Concept otherConcept = null;
				 try {
					 otherConcept = concepts.stream().filter(item -> item.getName().toLowerCase().equals(attribute.getName().toLowerCase())).findFirst().get();
				 }
				 catch (NoSuchElementException e) {
					 otherConcept = null;
				 }
				 if (otherConcept != null) {
					 for (Attribute att : otherConcept.getAttributes()) {
						 String capitalizedName = att.getName().substring(0, 1).toUpperCase().concat(att.getName().substring(1));
						 paramList = paramList.concat(att.getType().getName() + " " + otherConcept.getName().toLowerCase() + capitalizedName + ", ");
					 }
				 }
				 else {

					 paramList = paramList.concat(attribute.getType().getName() + " " + attribute.getName().toLowerCase() + ", ");
				 }
			 }
			 paramList = paramList.substring(0, paramList.length() - 2);
		 }
		 else {
			 paramList = concept.getName() + " " + concept.getName().toLowerCase() + ", " + featureAttribute.getName() + " " + featureAttribute.getName().toLowerCase();
		 }
		 
		 String methodSignature = "public String " + methodName + "(" + paramList + ");";
		 System.out.println(methodSignature);
	 }
	 
	 private static void createRemoveMethodPrototype(Concept concept, Attribute featureAttribute, Key key, Key attributeKey, String methodName) {
		 String paramList;
		 Attribute uniqueAttribute = concept.getAttributes().stream().filter(item -> item == key.getAttribute()).findFirst().get();
		 paramList = uniqueAttribute.getType().getName() + " " + uniqueAttribute.getName().toLowerCase();
		 
		 if (featureAttribute != null) {
			 Attribute uniqueAttributeAttribute;
			 uniqueAttributeAttribute = attributeKey != null? attributeKey.getConcept().getAttributes().stream().filter(item -> item.getName().equals(key.getAttribute().getName())).findFirst().get() : featureAttribute;
			 String capitalizedName = uniqueAttribute.getName().substring(0, 1).toUpperCase() + uniqueAttribute.getName().substring(1);
			 paramList = uniqueAttribute.getType().getName() + " " + concept.getName().toLowerCase() + capitalizedName + ", " 
					 + uniqueAttributeAttribute.getType().getName() + " " + uniqueAttributeAttribute.getName().toLowerCase();
		 }
		 
		 String methodSignature = "public void " + methodName + "(" + paramList + ");";
		 System.out.println(methodSignature);
	 }
	 
	 private static void createDisplayMethodPrototype(Concept concept, Attribute featureAttribute, Key key, Key attributeKey, String methodName) {
		 String paramList;
		 methodName = methodName.replaceFirst("display", "get");
		 String returnType = "TO";
		 if (featureAttribute == null) {
			 returnType = returnType.concat(concept.getName());
			 paramList = key.getAttribute().getType().getName() + " " + key.getAttribute().getName().toLowerCase();
		 }
		 else {
			 returnType = returnType.concat(featureAttribute.getName());
			 Attribute uniqueAttribute = concept.getAttributes().stream().filter(item -> item == key.getAttribute()).findFirst().get();
			 Attribute uniqueAttributeAttribute;
			 uniqueAttributeAttribute = attributeKey != null? attributeKey.getConcept().getAttributes().stream().filter(item -> item.getName().equals(key.getAttribute().getName())).findFirst().get() : featureAttribute;
			 String capitalizedName = uniqueAttribute.getName().substring(0, 1).toUpperCase() + uniqueAttribute.getName().substring(1);
			 paramList = uniqueAttribute.getType().getName() + " " + concept.getName().toLowerCase() + capitalizedName + ", " 
					 + uniqueAttributeAttribute.getType().getName() + " " + uniqueAttributeAttribute.getName().toLowerCase();
		 }
		 
		 String methodSignature = "public " + returnType + " " + methodName + "(" + paramList + ");";
		 System.out.println(methodSignature);
	 }
	 
	 private static void createUpdateMethodPrototype(Concept concept, Attribute featureAttribute, Key key, Key attributeKey, String methodName) {
		 String paramList = "";
		 
		 if (featureAttribute == null) {
			 //THAT SHOULD NOT HAPPEN
			 EList<Attribute> attributes = concept.getAttributes();
			 for (Attribute attribute : attributes) {
				 paramList = paramList.concat(attribute.getName() + " " + attribute.getName().toLowerCase() + ", ");
			 }
			 paramList = paramList.substring(0, paramList.length() - 2);
		 }
		 else {
			 Attribute uniqueAttribute = concept.getAttributes().stream().filter(item -> item == key.getAttribute()).findFirst().get();
			 Attribute uniqueAttributeAttribute;
			 uniqueAttributeAttribute = attributeKey != null? attributeKey.getConcept().getAttributes().stream().filter(item -> item.getName().equals(key.getAttribute().getName())).findFirst().get() : featureAttribute;
			 String capitalizedName = uniqueAttributeAttribute.getName().substring(0, 1).toUpperCase() + uniqueAttributeAttribute.getName().substring(1);
			 paramList = paramList.concat(uniqueAttribute.getType().getName() + " " + uniqueAttribute.getName() + ", " 
					 + uniqueAttributeAttribute.getType().getName() + " new" + capitalizedName);
		}
		 
		 String methodSignature = "public String " + methodName + "(" + paramList + ");";
		 System.out.println(methodSignature);
	 }
}
