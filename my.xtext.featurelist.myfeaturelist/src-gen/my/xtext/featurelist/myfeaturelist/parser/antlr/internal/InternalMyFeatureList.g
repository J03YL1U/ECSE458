/*
 * generated by Xtext 2.32.0
 */
grammar InternalMyFeatureList;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package my.xtext.featurelist.myfeaturelist.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package my.xtext.featurelist.myfeaturelist.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import my.xtext.featurelist.myfeaturelist.services.MyFeatureListGrammarAccess;

}

@parser::members {

 	private MyFeatureListGrammarAccess grammarAccess;

    public InternalMyFeatureListParser(TokenStream input, MyFeatureListGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FeatureList";
   	}

   	@Override
   	protected MyFeatureListGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFeatureList
entryRuleFeatureList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureListRule()); }
	iv_ruleFeatureList=ruleFeatureList
	{ $current=$iv_ruleFeatureList.current; }
	EOF;

// Rule FeatureList
ruleFeatureList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureListAccess().getConceptConceptParserRuleCall_0_0());
				}
				lv_concept_0_0=ruleConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureListRule());
					}
					add(
						$current,
						"concept",
						lv_concept_0_0,
						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Concept");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_1='features'
		{
			newLeafNode(otherlv_1, grammarAccess.getFeatureListAccess().getFeaturesKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_2_0());
				}
				lv_feature_2_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureListRule());
					}
					add(
						$current,
						"feature",
						lv_feature_2_0,
						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleConcept
entryRuleConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptRule()); }
	iv_ruleConcept=ruleConcept
	{ $current=$iv_ruleConcept.current; }
	EOF;

// Rule Concept
ruleConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='concept'
		{
			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConceptAccess().getAttributesAttributeParserRuleCall_2_0());
				}
				lv_attributes_2_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConceptRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_2_0,
						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_3='['
			{
				newLeafNode(otherlv_3, grammarAccess.getConceptAccess().getLeftSquareBracketKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConceptAccess().getConditionConditionParserRuleCall_3_1_0());
					}
					lv_condition_4_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConceptRule());
						}
						add(
							$current,
							"condition",
							lv_condition_4_0,
							"my.xtext.featurelist.myfeaturelist.MyFeatureList.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getConceptAccess().getRightSquareBracketKeyword_3_2());
			}
		)*
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAttributeRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getAttributeAttributeCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='>'
			{
				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_1_0());
			}
			    |
			otherlv_2='>='
			{
				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_1_1());
			}
			    |
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getEqualsSignKeyword_1_2());
			}
			    |
			otherlv_4='<='
			{
				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_1_3());
			}
			    |
			otherlv_5='<'
			{
				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getLessThanSignKeyword_1_4());
			}
		)
		(
			(
				lv_value_6_0=RULE_INT
				{
					newLeafNode(lv_value_6_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0());
				}
				lv_verb_0_0=ruleVerb
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"verb",
						lv_verb_0_0,
						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Verb");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFullStopKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFeatureRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0());
					}
				)
			)
		)?
	)
;

// Rule Verb
ruleVerb returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Add'
			{
				$current = grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Remove'
			{
				$current = grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Update'
			{
				$current = grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Display'
			{
				$current = grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
