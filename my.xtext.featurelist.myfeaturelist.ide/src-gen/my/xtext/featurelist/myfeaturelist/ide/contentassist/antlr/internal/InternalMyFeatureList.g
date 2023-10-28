/*
 * generated by Xtext 2.32.0
 */
grammar InternalMyFeatureList;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package my.xtext.featurelist.myfeaturelist.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package my.xtext.featurelist.myfeaturelist.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import my.xtext.featurelist.myfeaturelist.services.MyFeatureListGrammarAccess;

}
@parser::members {
	private MyFeatureListGrammarAccess grammarAccess;

	public void setGrammarAccess(MyFeatureListGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFeatureList
entryRuleFeatureList
:
{ before(grammarAccess.getFeatureListRule()); }
	 ruleFeatureList
{ after(grammarAccess.getFeatureListRule()); } 
	 EOF 
;

// Rule FeatureList
ruleFeatureList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureListAccess().getGroup()); }
		(rule__FeatureList__Group__0)
		{ after(grammarAccess.getFeatureListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConcept
entryRuleConcept
:
{ before(grammarAccess.getConceptRule()); }
	 ruleConcept
{ after(grammarAccess.getConceptRule()); } 
	 EOF 
;

// Rule Concept
ruleConcept 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptAccess().getGroup()); }
		(rule__Concept__Group__0)
		{ after(grammarAccess.getConceptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getNameAssignment()); }
		(rule__Attribute__NameAssignment)
		{ after(grammarAccess.getAttributeAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getGroup()); }
		(rule__Condition__Group__0)
		{ after(grammarAccess.getConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Verb
ruleVerb
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVerbAccess().getAlternatives()); }
		(rule__Verb__Alternatives)
		{ after(grammarAccess.getVerbAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_1_0()); }
		'>'
		{ after(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_1_1()); }
		'>='
		{ after(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getConditionAccess().getEqualsSignKeyword_1_2()); }
		'='
		{ after(grammarAccess.getConditionAccess().getEqualsSignKeyword_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_1_3()); }
		'<='
		{ after(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getConditionAccess().getLessThanSignKeyword_1_4()); }
		'<'
		{ after(grammarAccess.getConditionAccess().getLessThanSignKeyword_1_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Verb__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); }
		('Add')
		{ after(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); }
		('Remove')
		{ after(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); }
		('Update')
		{ after(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); }
		('Display')
		{ after(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureList__Group__0__Impl
	rule__FeatureList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureListAccess().getConceptAssignment_0()); }
	(rule__FeatureList__ConceptAssignment_0)*
	{ after(grammarAccess.getFeatureListAccess().getConceptAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureList__Group__1__Impl
	rule__FeatureList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureListAccess().getFeaturesKeyword_1()); }
	'features'
	{ after(grammarAccess.getFeatureListAccess().getFeaturesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureList__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureList__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureList__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); }
		(rule__FeatureList__FeatureAssignment_2)
		{ after(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); }
	)
	(
		{ before(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); }
		(rule__FeatureList__FeatureAssignment_2)*
		{ after(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group__0__Impl
	rule__Concept__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getConceptKeyword_0()); }
	'concept'
	{ after(grammarAccess.getConceptAccess().getConceptKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group__1__Impl
	rule__Concept__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getNameAssignment_1()); }
	(rule__Concept__NameAssignment_1)
	{ after(grammarAccess.getConceptAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group__2__Impl
	rule__Concept__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getAttributesAssignment_2()); }
	(rule__Concept__AttributesAssignment_2)*
	{ after(grammarAccess.getConceptAccess().getAttributesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getGroup_3()); }
	(rule__Concept__Group_3__0)*
	{ after(grammarAccess.getConceptAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group_3__0__Impl
	rule__Concept__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getLeftSquareBracketKeyword_3_0()); }
	'['
	{ after(grammarAccess.getConceptAccess().getLeftSquareBracketKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group_3__1__Impl
	rule__Concept__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getConditionAssignment_3_1()); }
	(rule__Concept__ConditionAssignment_3_1)
	{ after(grammarAccess.getConceptAccess().getConditionAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getRightSquareBracketKeyword_3_2()); }
	']'
	{ after(grammarAccess.getConceptAccess().getRightSquareBracketKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAttributeAssignment_0()); }
	(rule__Condition__AttributeAssignment_0)
	{ after(grammarAccess.getConditionAccess().getAttributeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__1__Impl
	rule__Condition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAlternatives_1()); }
	(rule__Condition__Alternatives_1)
	{ after(grammarAccess.getConditionAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getValueAssignment_2()); }
	(rule__Condition__ValueAssignment_2)
	{ after(grammarAccess.getConditionAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getVerbAssignment_0()); }
	(rule__Feature__VerbAssignment_0)
	{ after(grammarAccess.getFeatureAccess().getVerbAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getConceptAssignment_1()); }
	(rule__Feature__ConceptAssignment_1)
	{ after(grammarAccess.getFeatureAccess().getConceptAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getGroup_2()); }
	(rule__Feature__Group_2__0)?
	{ after(grammarAccess.getFeatureAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2__0__Impl
	rule__Feature__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getFullStopKeyword_2_0()); }
	'.'
	{ after(grammarAccess.getFeatureAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1()); }
	(rule__Feature__AttributeAssignment_2_1)
	{ after(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureList__ConceptAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureListAccess().getConceptConceptParserRuleCall_0_0()); }
		ruleConcept
		{ after(grammarAccess.getFeatureListAccess().getConceptConceptParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureList__FeatureAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_2_0()); }
		ruleFeature
		{ after(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__AttributesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptAccess().getAttributesAttributeParserRuleCall_2_0()); }
		ruleAttribute
		{ after(grammarAccess.getConceptAccess().getAttributesAttributeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__ConditionAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptAccess().getConditionConditionParserRuleCall_3_1_0()); }
		ruleCondition
		{ after(grammarAccess.getConceptAccess().getConditionConditionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__AttributeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAttributeAttributeCrossReference_0_0()); }
		(
			{ before(grammarAccess.getConditionAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConditionAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getConditionAccess().getAttributeAttributeCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__VerbAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0()); }
		ruleVerb
		{ after(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ConceptAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getConceptConceptIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFeatureAccess().getConceptConceptIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__AttributeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getAttributeAttributeIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFeatureAccess().getAttributeAttributeIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
