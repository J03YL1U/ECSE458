/*
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.serializer;

import com.google.inject.Inject;
import java.util.Set;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Concept;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Condition;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Feature;
import my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Key;
import my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Property;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Type;
import my.xtext.featurelist.myfeaturelist.services.MyFeatureListGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyFeatureListSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyFeatureListGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyFeatureListPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyFeatureListPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case MyFeatureListPackage.CONCEPT:
				sequence_Concept(context, (Concept) semanticObject); 
				return; 
			case MyFeatureListPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case MyFeatureListPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case MyFeatureListPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case MyFeatureListPackage.FEATURE_LIST:
				sequence_FeatureList(context, (FeatureList) semanticObject); 
				return; 
			case MyFeatureListPackage.KEY:
				sequence_Key(context, (Key) semanticObject); 
				return; 
			case MyFeatureListPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case MyFeatureListPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (type=Type name=ID)
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.ATTRIBUTE__TYPE));
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Concept returns Concept
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute*)
	 * </pre>
	 */
	protected void sequence_Concept(ISerializationContext context, Concept semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.CONDITION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     (concept=[Concept|ID] attribute=[Attribute|ID] condition+=Condition)
	 * </pre>
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FeatureList returns FeatureList
	 *
	 * Constraint:
	 *     (concept+=Concept* constraint+=Constraint+ key+=Key+ property+=Property+ feature+=Feature+)
	 * </pre>
	 */
	protected void sequence_FeatureList(ISerializationContext context, FeatureList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (verb=Verb concept=[Concept|ID] attribute=[Attribute|ID]?)
	 * </pre>
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Key returns Key
	 *
	 * Constraint:
	 *     (concept=[Concept|ID] attribute=[Attribute|ID])
	 * </pre>
	 */
	protected void sequence_Key(ISerializationContext context, Key semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.KEY__CONCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.KEY__CONCEPT));
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.KEY__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.KEY__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyAccess().getConceptConceptIDTerminalRuleCall_0_0_1(), semanticObject.eGet(MyFeatureListPackage.Literals.KEY__CONCEPT, false));
		feeder.accept(grammarAccess.getKeyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(MyFeatureListPackage.Literals.KEY__ATTRIBUTE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (concept=[Concept|ID] attribute=[Attribute|ID])
	 * </pre>
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.PROPERTY__CONCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.PROPERTY__CONCEPT));
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.PROPERTY__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.PROPERTY__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1(), semanticObject.eGet(MyFeatureListPackage.Literals.PROPERTY__CONCEPT, false));
		feeder.accept(grammarAccess.getPropertyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(MyFeatureListPackage.Literals.PROPERTY__ATTRIBUTE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyFeatureListPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyFeatureListPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
