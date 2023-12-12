/*
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyFeatureListGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FeatureListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.FeatureList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConceptsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cConceptsConceptParserRuleCall_0_0 = (RuleCall)cConceptsAssignment_0.eContents().get(0);
		private final Keyword cConstraintsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConstraintsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConstraintsConstraintParserRuleCall_2_0 = (RuleCall)cConstraintsAssignment_2.eContents().get(0);
		private final Keyword cKeysKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cKeysAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cKeysKeyParserRuleCall_4_0 = (RuleCall)cKeysAssignment_4.eContents().get(0);
		private final Keyword cPropertiesKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cPropertiesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cPropertiesPropertyParserRuleCall_6_0 = (RuleCall)cPropertiesAssignment_6.eContents().get(0);
		private final Keyword cFeaturesKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFeaturesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFeaturesFeatureParserRuleCall_8_0 = (RuleCall)cFeaturesAssignment_8.eContents().get(0);
		
		//FeatureList:
		//        (concepts+=Concept)*
		//        'constraints' (constraints+=Constraint)*
		//        'keys' (keys+=Key)*
		//        'properties' (properties+=Property)*
		//        'features' (features+=Feature)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(concepts+=Concept)*
		//'constraints' (constraints+=Constraint)*
		//'keys' (keys+=Key)*
		//'properties' (properties+=Property)*
		//'features' (features+=Feature)*
		public Group getGroup() { return cGroup; }
		
		//(concepts+=Concept)*
		public Assignment getConceptsAssignment_0() { return cConceptsAssignment_0; }
		
		//Concept
		public RuleCall getConceptsConceptParserRuleCall_0_0() { return cConceptsConceptParserRuleCall_0_0; }
		
		//'constraints'
		public Keyword getConstraintsKeyword_1() { return cConstraintsKeyword_1; }
		
		//(constraints+=Constraint)*
		public Assignment getConstraintsAssignment_2() { return cConstraintsAssignment_2; }
		
		//Constraint
		public RuleCall getConstraintsConstraintParserRuleCall_2_0() { return cConstraintsConstraintParserRuleCall_2_0; }
		
		//'keys'
		public Keyword getKeysKeyword_3() { return cKeysKeyword_3; }
		
		//(keys+=Key)*
		public Assignment getKeysAssignment_4() { return cKeysAssignment_4; }
		
		//Key
		public RuleCall getKeysKeyParserRuleCall_4_0() { return cKeysKeyParserRuleCall_4_0; }
		
		//'properties'
		public Keyword getPropertiesKeyword_5() { return cPropertiesKeyword_5; }
		
		//(properties+=Property)*
		public Assignment getPropertiesAssignment_6() { return cPropertiesAssignment_6; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_6_0() { return cPropertiesPropertyParserRuleCall_6_0; }
		
		//'features'
		public Keyword getFeaturesKeyword_7() { return cFeaturesKeyword_7; }
		
		//(features+=Feature)*
		public Assignment getFeaturesAssignment_8() { return cFeaturesAssignment_8; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_8_0() { return cFeaturesFeatureParserRuleCall_8_0; }
	}
	public class ConceptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Concept");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConceptKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAttributesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributesAttributeParserRuleCall_2_0 = (RuleCall)cAttributesAssignment_2.eContents().get(0);
		
		//Concept:
		//        'concept' name=ID
		//        (attributes+=Attribute)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'concept' name=ID
		//(attributes+=Attribute)*
		public Group getGroup() { return cGroup; }
		
		//'concept'
		public Keyword getConceptKeyword_0() { return cConceptKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(attributes+=Attribute)*
		public Assignment getAttributesAssignment_2() { return cAttributesAssignment_2; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_0() { return cAttributesAttributeParserRuleCall_2_0; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cMultiplicityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMultiplicityMULTIPLICITYTerminalRuleCall_2_0 = (RuleCall)cMultiplicityAssignment_2.eContents().get(0);
		
		//Attribute:
		//        (type=Type) name=ID (multiplicity=MULTIPLICITY)?;
		@Override public ParserRule getRule() { return rule; }
		
		//(type=Type) name=ID (multiplicity=MULTIPLICITY)?
		public Group getGroup() { return cGroup; }
		
		//(type=Type)
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(multiplicity=MULTIPLICITY)?
		public Assignment getMultiplicityAssignment_2() { return cMultiplicityAssignment_2; }
		
		//MULTIPLICITY
		public RuleCall getMultiplicityMULTIPLICITYTerminalRuleCall_2_0() { return cMultiplicityMULTIPLICITYTerminalRuleCall_2_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Type");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Type:
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cGreaterThanSignEqualsSignKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0_2 = (Keyword)cAlternatives_0.eContents().get(2);
		private final Keyword cLessThanSignEqualsSignKeyword_0_3 = (Keyword)cAlternatives_0.eContents().get(3);
		private final Keyword cLessThanSignKeyword_0_4 = (Keyword)cAlternatives_0.eContents().get(4);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Condition:
		//        ('>' | '>=' | '=' | '<=' | '<') (value=INT);
		@Override public ParserRule getRule() { return rule; }
		
		//('>' | '>=' | '=' | '<=' | '<') (value=INT)
		public Group getGroup() { return cGroup; }
		
		//('>' | '>=' | '=' | '<=' | '<')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_0_0() { return cGreaterThanSignKeyword_0_0; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_0_1() { return cGreaterThanSignEqualsSignKeyword_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_0_2() { return cEqualsSignKeyword_0_2; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_0_3() { return cLessThanSignEqualsSignKeyword_0_3; }
		
		//'<'
		public Keyword getLessThanSignKeyword_0_4() { return cLessThanSignKeyword_0_4; }
		
		//(value=INT)
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class ConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Constraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConceptAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cConceptConceptCrossReference_0_0 = (CrossReference)cConceptAssignment_0.eContents().get(0);
		private final RuleCall cConceptConceptIDTerminalRuleCall_0_0_1 = (RuleCall)cConceptConceptCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAttributeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cAttributeAttributeCrossReference_1_1_0 = (CrossReference)cAttributeAssignment_1_1.eContents().get(0);
		private final RuleCall cAttributeAttributeIDTerminalRuleCall_1_1_0_1 = (RuleCall)cAttributeAttributeCrossReference_1_1_0.eContents().get(1);
		private final Assignment cConditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConditionConditionParserRuleCall_2_0 = (RuleCall)cConditionAssignment_2.eContents().get(0);
		
		//Constraint:
		//    (concept=[Concept])('.'(attribute=[Attribute])) (condition+=Condition);
		@Override public ParserRule getRule() { return rule; }
		
		//(concept=[Concept])('.'(attribute=[Attribute])) (condition+=Condition)
		public Group getGroup() { return cGroup; }
		
		//(concept=[Concept])
		public Assignment getConceptAssignment_0() { return cConceptAssignment_0; }
		
		//[Concept]
		public CrossReference getConceptConceptCrossReference_0_0() { return cConceptConceptCrossReference_0_0; }
		
		//ID
		public RuleCall getConceptConceptIDTerminalRuleCall_0_0_1() { return cConceptConceptIDTerminalRuleCall_0_0_1; }
		
		//('.'(attribute=[Attribute]))
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(attribute=[Attribute])
		public Assignment getAttributeAssignment_1_1() { return cAttributeAssignment_1_1; }
		
		//[Attribute]
		public CrossReference getAttributeAttributeCrossReference_1_1_0() { return cAttributeAttributeCrossReference_1_1_0; }
		
		//ID
		public RuleCall getAttributeAttributeIDTerminalRuleCall_1_1_0_1() { return cAttributeAttributeIDTerminalRuleCall_1_1_0_1; }
		
		//(condition+=Condition)
		public Assignment getConditionAssignment_2() { return cConditionAssignment_2; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_2_0() { return cConditionConditionParserRuleCall_2_0; }
	}
	public class KeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Key");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConceptAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cConceptConceptCrossReference_0_0 = (CrossReference)cConceptAssignment_0.eContents().get(0);
		private final RuleCall cConceptConceptIDTerminalRuleCall_0_0_1 = (RuleCall)cConceptConceptCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAttributeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cAttributeAttributeCrossReference_1_1_0 = (CrossReference)cAttributeAssignment_1_1.eContents().get(0);
		private final RuleCall cAttributeAttributeIDTerminalRuleCall_1_1_0_1 = (RuleCall)cAttributeAttributeCrossReference_1_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cUniqueKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Keyword cAutouniqueKeyword_2_1 = (Keyword)cAlternatives_2.eContents().get(1);
		
		//Key:
		//    (concept=[Concept])('.'(attribute=[Attribute])) ('unique' | 'autounique');
		@Override public ParserRule getRule() { return rule; }
		
		//(concept=[Concept])('.'(attribute=[Attribute])) ('unique' | 'autounique')
		public Group getGroup() { return cGroup; }
		
		//(concept=[Concept])
		public Assignment getConceptAssignment_0() { return cConceptAssignment_0; }
		
		//[Concept]
		public CrossReference getConceptConceptCrossReference_0_0() { return cConceptConceptCrossReference_0_0; }
		
		//ID
		public RuleCall getConceptConceptIDTerminalRuleCall_0_0_1() { return cConceptConceptIDTerminalRuleCall_0_0_1; }
		
		//('.'(attribute=[Attribute]))
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(attribute=[Attribute])
		public Assignment getAttributeAssignment_1_1() { return cAttributeAssignment_1_1; }
		
		//[Attribute]
		public CrossReference getAttributeAttributeCrossReference_1_1_0() { return cAttributeAttributeCrossReference_1_1_0; }
		
		//ID
		public RuleCall getAttributeAttributeIDTerminalRuleCall_1_1_0_1() { return cAttributeAttributeIDTerminalRuleCall_1_1_0_1; }
		
		//('unique' | 'autounique')
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'unique'
		public Keyword getUniqueKeyword_2_0() { return cUniqueKeyword_2_0; }
		
		//'autounique'
		public Keyword getAutouniqueKeyword_2_1() { return cAutouniqueKeyword_2_1; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConceptAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cConceptConceptCrossReference_0_0 = (CrossReference)cConceptAssignment_0.eContents().get(0);
		private final RuleCall cConceptConceptIDTerminalRuleCall_0_0_1 = (RuleCall)cConceptConceptCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAttributeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cAttributeAttributeCrossReference_1_1_0 = (CrossReference)cAttributeAssignment_1_1.eContents().get(0);
		private final RuleCall cAttributeAttributeIDTerminalRuleCall_1_1_0_1 = (RuleCall)cAttributeAttributeCrossReference_1_1_0.eContents().get(1);
		private final Keyword cLazyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		// //possibly add a 'unique (Concept)' to signify uniqueness in that concept only
		//Property:
		//    (concept=[Concept])('.'(attribute=[Attribute])) 'lazy';
		@Override public ParserRule getRule() { return rule; }
		
		//(concept=[Concept])('.'(attribute=[Attribute])) 'lazy'
		public Group getGroup() { return cGroup; }
		
		//(concept=[Concept])
		public Assignment getConceptAssignment_0() { return cConceptAssignment_0; }
		
		//[Concept]
		public CrossReference getConceptConceptCrossReference_0_0() { return cConceptConceptCrossReference_0_0; }
		
		//ID
		public RuleCall getConceptConceptIDTerminalRuleCall_0_0_1() { return cConceptConceptIDTerminalRuleCall_0_0_1; }
		
		//('.'(attribute=[Attribute]))
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(attribute=[Attribute])
		public Assignment getAttributeAssignment_1_1() { return cAttributeAssignment_1_1; }
		
		//[Attribute]
		public CrossReference getAttributeAttributeCrossReference_1_1_0() { return cAttributeAttributeCrossReference_1_1_0; }
		
		//ID
		public RuleCall getAttributeAttributeIDTerminalRuleCall_1_1_0_1() { return cAttributeAttributeIDTerminalRuleCall_1_1_0_1; }
		
		//'lazy'
		public Keyword getLazyKeyword_2() { return cLazyKeyword_2; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVerbAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVerbVerbEnumRuleCall_0_0 = (RuleCall)cVerbAssignment_0.eContents().get(0);
		private final Assignment cConceptAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cConceptConceptCrossReference_1_0 = (CrossReference)cConceptAssignment_1.eContents().get(0);
		private final RuleCall cConceptConceptIDTerminalRuleCall_1_0_1 = (RuleCall)cConceptConceptCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttributeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cAttributeAttributeCrossReference_2_1_0 = (CrossReference)cAttributeAssignment_2_1.eContents().get(0);
		private final RuleCall cAttributeAttributeIDTerminalRuleCall_2_1_0_1 = (RuleCall)cAttributeAttributeCrossReference_2_1_0.eContents().get(1);
		
		//Feature:
		//        (verb=Verb) (concept=[Concept])('.'(attribute=[Attribute]))?;
		@Override public ParserRule getRule() { return rule; }
		
		//(verb=Verb) (concept=[Concept])('.'(attribute=[Attribute]))?
		public Group getGroup() { return cGroup; }
		
		//(verb=Verb)
		public Assignment getVerbAssignment_0() { return cVerbAssignment_0; }
		
		//Verb
		public RuleCall getVerbVerbEnumRuleCall_0_0() { return cVerbVerbEnumRuleCall_0_0; }
		
		//(concept=[Concept])
		public Assignment getConceptAssignment_1() { return cConceptAssignment_1; }
		
		//[Concept]
		public CrossReference getConceptConceptCrossReference_1_0() { return cConceptConceptCrossReference_1_0; }
		
		//ID
		public RuleCall getConceptConceptIDTerminalRuleCall_1_0_1() { return cConceptConceptIDTerminalRuleCall_1_0_1; }
		
		//('.'(attribute=[Attribute]))?
		public Group getGroup_2() { return cGroup_2; }
		
		//'.'
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//(attribute=[Attribute])
		public Assignment getAttributeAssignment_2_1() { return cAttributeAssignment_2_1; }
		
		//[Attribute]
		public CrossReference getAttributeAttributeCrossReference_2_1_0() { return cAttributeAttributeCrossReference_2_1_0; }
		
		//ID
		public RuleCall getAttributeAttributeIDTerminalRuleCall_2_1_0_1() { return cAttributeAttributeIDTerminalRuleCall_2_1_0_1; }
	}
	
	public class VerbElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.Verb");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAddEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAddAddKeyword_0_0 = (Keyword)cAddEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRemoveEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRemoveRemoveKeyword_1_0 = (Keyword)cRemoveEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cUpdateEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cUpdateUpdateKeyword_2_0 = (Keyword)cUpdateEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDisplayEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDisplayDisplayKeyword_3_0 = (Keyword)cDisplayEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Verb:
		//        Add | Remove | Update | Display;
		public EnumRule getRule() { return rule; }
		
		//Add | Remove | Update | Display
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Add
		public EnumLiteralDeclaration getAddEnumLiteralDeclaration_0() { return cAddEnumLiteralDeclaration_0; }
		
		public Keyword getAddAddKeyword_0_0() { return cAddAddKeyword_0_0; }
		
		//Remove
		public EnumLiteralDeclaration getRemoveEnumLiteralDeclaration_1() { return cRemoveEnumLiteralDeclaration_1; }
		
		public Keyword getRemoveRemoveKeyword_1_0() { return cRemoveRemoveKeyword_1_0; }
		
		//Update
		public EnumLiteralDeclaration getUpdateEnumLiteralDeclaration_2() { return cUpdateEnumLiteralDeclaration_2; }
		
		public Keyword getUpdateUpdateKeyword_2_0() { return cUpdateUpdateKeyword_2_0; }
		
		//Display
		public EnumLiteralDeclaration getDisplayEnumLiteralDeclaration_3() { return cDisplayEnumLiteralDeclaration_3; }
		
		public Keyword getDisplayDisplayKeyword_3_0() { return cDisplayDisplayKeyword_3_0; }
	}
	
	private final FeatureListElements pFeatureList;
	private final ConceptElements pConcept;
	private final AttributeElements pAttribute;
	private final TypeElements pType;
	private final ConditionElements pCondition;
	private final ConstraintElements pConstraint;
	private final KeyElements pKey;
	private final PropertyElements pProperty;
	private final FeatureElements pFeature;
	private final VerbElements eVerb;
	private final TerminalRule tMULTIPLICITY;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyFeatureListGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFeatureList = new FeatureListElements();
		this.pConcept = new ConceptElements();
		this.pAttribute = new AttributeElements();
		this.pType = new TypeElements();
		this.pCondition = new ConditionElements();
		this.pConstraint = new ConstraintElements();
		this.pKey = new KeyElements();
		this.pProperty = new PropertyElements();
		this.pFeature = new FeatureElements();
		this.eVerb = new VerbElements();
		this.tMULTIPLICITY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "my.xtext.featurelist.myfeaturelist.MyFeatureList.MULTIPLICITY");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("my.xtext.featurelist.myfeaturelist.MyFeatureList".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FeatureList:
	//        (concepts+=Concept)*
	//        'constraints' (constraints+=Constraint)*
	//        'keys' (keys+=Key)*
	//        'properties' (properties+=Property)*
	//        'features' (features+=Feature)*;
	public FeatureListElements getFeatureListAccess() {
		return pFeatureList;
	}
	
	public ParserRule getFeatureListRule() {
		return getFeatureListAccess().getRule();
	}
	
	//Concept:
	//        'concept' name=ID
	//        (attributes+=Attribute)*;
	public ConceptElements getConceptAccess() {
		return pConcept;
	}
	
	public ParserRule getConceptRule() {
		return getConceptAccess().getRule();
	}
	
	//Attribute:
	//        (type=Type) name=ID (multiplicity=MULTIPLICITY)?;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Type:
	//    name=ID;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Condition:
	//        ('>' | '>=' | '=' | '<=' | '<') (value=INT);
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//Constraint:
	//    (concept=[Concept])('.'(attribute=[Attribute])) (condition+=Condition);
	public ConstraintElements getConstraintAccess() {
		return pConstraint;
	}
	
	public ParserRule getConstraintRule() {
		return getConstraintAccess().getRule();
	}
	
	//Key:
	//    (concept=[Concept])('.'(attribute=[Attribute])) ('unique' | 'autounique');
	public KeyElements getKeyAccess() {
		return pKey;
	}
	
	public ParserRule getKeyRule() {
		return getKeyAccess().getRule();
	}
	
	// //possibly add a 'unique (Concept)' to signify uniqueness in that concept only
	//Property:
	//    (concept=[Concept])('.'(attribute=[Attribute])) 'lazy';
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//Feature:
	//        (verb=Verb) (concept=[Concept])('.'(attribute=[Attribute]))?;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//enum Verb:
	//        Add | Remove | Update | Display;
	public VerbElements getVerbAccess() {
		return eVerb;
	}
	
	public EnumRule getVerbRule() {
		return getVerbAccess().getRule();
	}
	
	//terminal MULTIPLICITY:
	//    (INT | '*')'..'(INT | '*');
	public TerminalRule getMULTIPLICITYRule() {
		return tMULTIPLICITY;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
