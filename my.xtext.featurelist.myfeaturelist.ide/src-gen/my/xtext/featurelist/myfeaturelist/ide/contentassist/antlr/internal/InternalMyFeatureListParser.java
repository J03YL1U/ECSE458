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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFeatureListParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_MULTIPLICITY", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'>='", "'='", "'<='", "'<'", "'unique'", "'autounique'", "'Add'", "'Remove'", "'Update'", "'Display'", "'constraints'", "'keys'", "'properties'", "'features'", "'concept'", "'.'", "'root'", "'lazy'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_MULTIPLICITY=6;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyFeatureListParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyFeatureListParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyFeatureListParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyFeatureList.g"; }


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



    // $ANTLR start "entryRuleFeatureList"
    // InternalMyFeatureList.g:53:1: entryRuleFeatureList : ruleFeatureList EOF ;
    public final void entryRuleFeatureList() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:54:1: ( ruleFeatureList EOF )
            // InternalMyFeatureList.g:55:1: ruleFeatureList EOF
            {
             before(grammarAccess.getFeatureListRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureList();

            state._fsp--;

             after(grammarAccess.getFeatureListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureList"


    // $ANTLR start "ruleFeatureList"
    // InternalMyFeatureList.g:62:1: ruleFeatureList : ( ( rule__FeatureList__Group__0 ) ) ;
    public final void ruleFeatureList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:66:2: ( ( ( rule__FeatureList__Group__0 ) ) )
            // InternalMyFeatureList.g:67:2: ( ( rule__FeatureList__Group__0 ) )
            {
            // InternalMyFeatureList.g:67:2: ( ( rule__FeatureList__Group__0 ) )
            // InternalMyFeatureList.g:68:3: ( rule__FeatureList__Group__0 )
            {
             before(grammarAccess.getFeatureListAccess().getGroup()); 
            // InternalMyFeatureList.g:69:3: ( rule__FeatureList__Group__0 )
            // InternalMyFeatureList.g:69:4: rule__FeatureList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureList"


    // $ANTLR start "entryRuleConcept"
    // InternalMyFeatureList.g:78:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:79:1: ( ruleConcept EOF )
            // InternalMyFeatureList.g:80:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalMyFeatureList.g:87:1: ruleConcept : ( ( rule__Concept__Group__0 ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:91:2: ( ( ( rule__Concept__Group__0 ) ) )
            // InternalMyFeatureList.g:92:2: ( ( rule__Concept__Group__0 ) )
            {
            // InternalMyFeatureList.g:92:2: ( ( rule__Concept__Group__0 ) )
            // InternalMyFeatureList.g:93:3: ( rule__Concept__Group__0 )
            {
             before(grammarAccess.getConceptAccess().getGroup()); 
            // InternalMyFeatureList.g:94:3: ( rule__Concept__Group__0 )
            // InternalMyFeatureList.g:94:4: rule__Concept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyFeatureList.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:104:1: ( ruleAttribute EOF )
            // InternalMyFeatureList.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyFeatureList.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyFeatureList.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyFeatureList.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyFeatureList.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyFeatureList.g:119:3: ( rule__Attribute__Group__0 )
            // InternalMyFeatureList.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMyFeatureList.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:129:1: ( ruleType EOF )
            // InternalMyFeatureList.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyFeatureList.g:137:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:141:2: ( ( ( rule__Type__NameAssignment ) ) )
            // InternalMyFeatureList.g:142:2: ( ( rule__Type__NameAssignment ) )
            {
            // InternalMyFeatureList.g:142:2: ( ( rule__Type__NameAssignment ) )
            // InternalMyFeatureList.g:143:3: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // InternalMyFeatureList.g:144:3: ( rule__Type__NameAssignment )
            // InternalMyFeatureList.g:144:4: rule__Type__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCondition"
    // InternalMyFeatureList.g:153:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:154:1: ( ruleCondition EOF )
            // InternalMyFeatureList.g:155:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyFeatureList.g:162:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:166:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalMyFeatureList.g:167:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalMyFeatureList.g:167:2: ( ( rule__Condition__Group__0 ) )
            // InternalMyFeatureList.g:168:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalMyFeatureList.g:169:3: ( rule__Condition__Group__0 )
            // InternalMyFeatureList.g:169:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleErrorMsg"
    // InternalMyFeatureList.g:178:1: entryRuleErrorMsg : ruleErrorMsg EOF ;
    public final void entryRuleErrorMsg() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:179:1: ( ruleErrorMsg EOF )
            // InternalMyFeatureList.g:180:1: ruleErrorMsg EOF
            {
             before(grammarAccess.getErrorMsgRule()); 
            pushFollow(FOLLOW_1);
            ruleErrorMsg();

            state._fsp--;

             after(grammarAccess.getErrorMsgRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleErrorMsg"


    // $ANTLR start "ruleErrorMsg"
    // InternalMyFeatureList.g:187:1: ruleErrorMsg : ( RULE_STRING ) ;
    public final void ruleErrorMsg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:191:2: ( ( RULE_STRING ) )
            // InternalMyFeatureList.g:192:2: ( RULE_STRING )
            {
            // InternalMyFeatureList.g:192:2: ( RULE_STRING )
            // InternalMyFeatureList.g:193:3: RULE_STRING
            {
             before(grammarAccess.getErrorMsgAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getErrorMsgAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleErrorMsg"


    // $ANTLR start "entryRuleConstraint"
    // InternalMyFeatureList.g:203:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:204:1: ( ruleConstraint EOF )
            // InternalMyFeatureList.g:205:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMyFeatureList.g:212:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:216:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalMyFeatureList.g:217:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalMyFeatureList.g:217:2: ( ( rule__Constraint__Group__0 ) )
            // InternalMyFeatureList.g:218:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalMyFeatureList.g:219:3: ( rule__Constraint__Group__0 )
            // InternalMyFeatureList.g:219:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleKey"
    // InternalMyFeatureList.g:228:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:229:1: ( ruleKey EOF )
            // InternalMyFeatureList.g:230:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalMyFeatureList.g:237:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:241:2: ( ( ( rule__Key__Group__0 ) ) )
            // InternalMyFeatureList.g:242:2: ( ( rule__Key__Group__0 ) )
            {
            // InternalMyFeatureList.g:242:2: ( ( rule__Key__Group__0 ) )
            // InternalMyFeatureList.g:243:3: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // InternalMyFeatureList.g:244:3: ( rule__Key__Group__0 )
            // InternalMyFeatureList.g:244:4: rule__Key__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleConceptProperty"
    // InternalMyFeatureList.g:253:1: entryRuleConceptProperty : ruleConceptProperty EOF ;
    public final void entryRuleConceptProperty() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:254:1: ( ruleConceptProperty EOF )
            // InternalMyFeatureList.g:255:1: ruleConceptProperty EOF
            {
             before(grammarAccess.getConceptPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleConceptProperty();

            state._fsp--;

             after(grammarAccess.getConceptPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConceptProperty"


    // $ANTLR start "ruleConceptProperty"
    // InternalMyFeatureList.g:262:1: ruleConceptProperty : ( ( rule__ConceptProperty__Group__0 ) ) ;
    public final void ruleConceptProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:266:2: ( ( ( rule__ConceptProperty__Group__0 ) ) )
            // InternalMyFeatureList.g:267:2: ( ( rule__ConceptProperty__Group__0 ) )
            {
            // InternalMyFeatureList.g:267:2: ( ( rule__ConceptProperty__Group__0 ) )
            // InternalMyFeatureList.g:268:3: ( rule__ConceptProperty__Group__0 )
            {
             before(grammarAccess.getConceptPropertyAccess().getGroup()); 
            // InternalMyFeatureList.g:269:3: ( rule__ConceptProperty__Group__0 )
            // InternalMyFeatureList.g:269:4: rule__ConceptProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConceptProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConceptProperty"


    // $ANTLR start "entryRuleAttributeProperty"
    // InternalMyFeatureList.g:278:1: entryRuleAttributeProperty : ruleAttributeProperty EOF ;
    public final void entryRuleAttributeProperty() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:279:1: ( ruleAttributeProperty EOF )
            // InternalMyFeatureList.g:280:1: ruleAttributeProperty EOF
            {
             before(grammarAccess.getAttributePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeProperty();

            state._fsp--;

             after(grammarAccess.getAttributePropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeProperty"


    // $ANTLR start "ruleAttributeProperty"
    // InternalMyFeatureList.g:287:1: ruleAttributeProperty : ( ( rule__AttributeProperty__Group__0 ) ) ;
    public final void ruleAttributeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:291:2: ( ( ( rule__AttributeProperty__Group__0 ) ) )
            // InternalMyFeatureList.g:292:2: ( ( rule__AttributeProperty__Group__0 ) )
            {
            // InternalMyFeatureList.g:292:2: ( ( rule__AttributeProperty__Group__0 ) )
            // InternalMyFeatureList.g:293:3: ( rule__AttributeProperty__Group__0 )
            {
             before(grammarAccess.getAttributePropertyAccess().getGroup()); 
            // InternalMyFeatureList.g:294:3: ( rule__AttributeProperty__Group__0 )
            // InternalMyFeatureList.g:294:4: rule__AttributeProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeProperty"


    // $ANTLR start "entryRuleProperty"
    // InternalMyFeatureList.g:303:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:304:1: ( ruleProperty EOF )
            // InternalMyFeatureList.g:305:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMyFeatureList.g:312:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:316:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalMyFeatureList.g:317:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalMyFeatureList.g:317:2: ( ( rule__Property__Alternatives ) )
            // InternalMyFeatureList.g:318:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalMyFeatureList.g:319:3: ( rule__Property__Alternatives )
            // InternalMyFeatureList.g:319:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:328:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:329:1: ( ruleFeature EOF )
            // InternalMyFeatureList.g:330:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyFeatureList.g:337:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:341:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalMyFeatureList.g:342:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalMyFeatureList.g:342:2: ( ( rule__Feature__Group__0 ) )
            // InternalMyFeatureList.g:343:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalMyFeatureList.g:344:3: ( rule__Feature__Group__0 )
            // InternalMyFeatureList.g:344:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "ruleVerb"
    // InternalMyFeatureList.g:353:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:357:1: ( ( ( rule__Verb__Alternatives ) ) )
            // InternalMyFeatureList.g:358:2: ( ( rule__Verb__Alternatives ) )
            {
            // InternalMyFeatureList.g:358:2: ( ( rule__Verb__Alternatives ) )
            // InternalMyFeatureList.g:359:3: ( rule__Verb__Alternatives )
            {
             before(grammarAccess.getVerbAccess().getAlternatives()); 
            // InternalMyFeatureList.g:360:3: ( rule__Verb__Alternatives )
            // InternalMyFeatureList.g:360:4: rule__Verb__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Verb__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVerbAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerb"


    // $ANTLR start "rule__Condition__Alternatives_0"
    // InternalMyFeatureList.g:368:1: rule__Condition__Alternatives_0 : ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) );
    public final void rule__Condition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:372:1: ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyFeatureList.g:373:2: ( '>' )
                    {
                    // InternalMyFeatureList.g:373:2: ( '>' )
                    // InternalMyFeatureList.g:374:3: '>'
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:379:2: ( '>=' )
                    {
                    // InternalMyFeatureList.g:379:2: ( '>=' )
                    // InternalMyFeatureList.g:380:3: '>='
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:385:2: ( '=' )
                    {
                    // InternalMyFeatureList.g:385:2: ( '=' )
                    // InternalMyFeatureList.g:386:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:391:2: ( '<=' )
                    {
                    // InternalMyFeatureList.g:391:2: ( '<=' )
                    // InternalMyFeatureList.g:392:3: '<='
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFeatureList.g:397:2: ( '<' )
                    {
                    // InternalMyFeatureList.g:397:2: ( '<' )
                    // InternalMyFeatureList.g:398:3: '<'
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignKeyword_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getLessThanSignKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_0"


    // $ANTLR start "rule__Key__Alternatives_2"
    // InternalMyFeatureList.g:407:1: rule__Key__Alternatives_2 : ( ( 'unique' ) | ( 'autounique' ) );
    public final void rule__Key__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:411:1: ( ( 'unique' ) | ( 'autounique' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyFeatureList.g:412:2: ( 'unique' )
                    {
                    // InternalMyFeatureList.g:412:2: ( 'unique' )
                    // InternalMyFeatureList.g:413:3: 'unique'
                    {
                     before(grammarAccess.getKeyAccess().getUniqueKeyword_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getKeyAccess().getUniqueKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:418:2: ( 'autounique' )
                    {
                    // InternalMyFeatureList.g:418:2: ( 'autounique' )
                    // InternalMyFeatureList.g:419:3: 'autounique'
                    {
                     before(grammarAccess.getKeyAccess().getAutouniqueKeyword_2_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getKeyAccess().getAutouniqueKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Alternatives_2"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalMyFeatureList.g:428:1: rule__Property__Alternatives : ( ( ruleConceptProperty ) | ( ruleAttributeProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:432:1: ( ( ruleConceptProperty ) | ( ruleAttributeProperty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==29) ) {
                    alt3=1;
                }
                else if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyFeatureList.g:433:2: ( ruleConceptProperty )
                    {
                    // InternalMyFeatureList.g:433:2: ( ruleConceptProperty )
                    // InternalMyFeatureList.g:434:3: ruleConceptProperty
                    {
                     before(grammarAccess.getPropertyAccess().getConceptPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConceptProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getConceptPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:439:2: ( ruleAttributeProperty )
                    {
                    // InternalMyFeatureList.g:439:2: ( ruleAttributeProperty )
                    // InternalMyFeatureList.g:440:3: ruleAttributeProperty
                    {
                     before(grammarAccess.getPropertyAccess().getAttributePropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAttributePropertyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Verb__Alternatives"
    // InternalMyFeatureList.g:449:1: rule__Verb__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:453:1: ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyFeatureList.g:454:2: ( ( 'Add' ) )
                    {
                    // InternalMyFeatureList.g:454:2: ( ( 'Add' ) )
                    // InternalMyFeatureList.g:455:3: ( 'Add' )
                    {
                     before(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalMyFeatureList.g:456:3: ( 'Add' )
                    // InternalMyFeatureList.g:456:4: 'Add'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:460:2: ( ( 'Remove' ) )
                    {
                    // InternalMyFeatureList.g:460:2: ( ( 'Remove' ) )
                    // InternalMyFeatureList.g:461:3: ( 'Remove' )
                    {
                     before(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // InternalMyFeatureList.g:462:3: ( 'Remove' )
                    // InternalMyFeatureList.g:462:4: 'Remove'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:466:2: ( ( 'Update' ) )
                    {
                    // InternalMyFeatureList.g:466:2: ( ( 'Update' ) )
                    // InternalMyFeatureList.g:467:3: ( 'Update' )
                    {
                     before(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // InternalMyFeatureList.g:468:3: ( 'Update' )
                    // InternalMyFeatureList.g:468:4: 'Update'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:472:2: ( ( 'Display' ) )
                    {
                    // InternalMyFeatureList.g:472:2: ( ( 'Display' ) )
                    // InternalMyFeatureList.g:473:3: ( 'Display' )
                    {
                     before(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); 
                    // InternalMyFeatureList.g:474:3: ( 'Display' )
                    // InternalMyFeatureList.g:474:4: 'Display'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verb__Alternatives"


    // $ANTLR start "rule__FeatureList__Group__0"
    // InternalMyFeatureList.g:482:1: rule__FeatureList__Group__0 : rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 ;
    public final void rule__FeatureList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:486:1: ( rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 )
            // InternalMyFeatureList.g:487:2: rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FeatureList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__0"


    // $ANTLR start "rule__FeatureList__Group__0__Impl"
    // InternalMyFeatureList.g:494:1: rule__FeatureList__Group__0__Impl : ( ( rule__FeatureList__ConceptsAssignment_0 )* ) ;
    public final void rule__FeatureList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:498:1: ( ( ( rule__FeatureList__ConceptsAssignment_0 )* ) )
            // InternalMyFeatureList.g:499:1: ( ( rule__FeatureList__ConceptsAssignment_0 )* )
            {
            // InternalMyFeatureList.g:499:1: ( ( rule__FeatureList__ConceptsAssignment_0 )* )
            // InternalMyFeatureList.g:500:2: ( rule__FeatureList__ConceptsAssignment_0 )*
            {
             before(grammarAccess.getFeatureListAccess().getConceptsAssignment_0()); 
            // InternalMyFeatureList.g:501:2: ( rule__FeatureList__ConceptsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFeatureList.g:501:3: rule__FeatureList__ConceptsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FeatureList__ConceptsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getConceptsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__0__Impl"


    // $ANTLR start "rule__FeatureList__Group__1"
    // InternalMyFeatureList.g:509:1: rule__FeatureList__Group__1 : rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 ;
    public final void rule__FeatureList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:513:1: ( rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 )
            // InternalMyFeatureList.g:514:2: rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FeatureList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__1"


    // $ANTLR start "rule__FeatureList__Group__1__Impl"
    // InternalMyFeatureList.g:521:1: rule__FeatureList__Group__1__Impl : ( 'constraints' ) ;
    public final void rule__FeatureList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:525:1: ( ( 'constraints' ) )
            // InternalMyFeatureList.g:526:1: ( 'constraints' )
            {
            // InternalMyFeatureList.g:526:1: ( 'constraints' )
            // InternalMyFeatureList.g:527:2: 'constraints'
            {
             before(grammarAccess.getFeatureListAccess().getConstraintsKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFeatureListAccess().getConstraintsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__1__Impl"


    // $ANTLR start "rule__FeatureList__Group__2"
    // InternalMyFeatureList.g:536:1: rule__FeatureList__Group__2 : rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3 ;
    public final void rule__FeatureList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:540:1: ( rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3 )
            // InternalMyFeatureList.g:541:2: rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FeatureList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__2"


    // $ANTLR start "rule__FeatureList__Group__2__Impl"
    // InternalMyFeatureList.g:548:1: rule__FeatureList__Group__2__Impl : ( ( rule__FeatureList__ConstraintsAssignment_2 )* ) ;
    public final void rule__FeatureList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:552:1: ( ( ( rule__FeatureList__ConstraintsAssignment_2 )* ) )
            // InternalMyFeatureList.g:553:1: ( ( rule__FeatureList__ConstraintsAssignment_2 )* )
            {
            // InternalMyFeatureList.g:553:1: ( ( rule__FeatureList__ConstraintsAssignment_2 )* )
            // InternalMyFeatureList.g:554:2: ( rule__FeatureList__ConstraintsAssignment_2 )*
            {
             before(grammarAccess.getFeatureListAccess().getConstraintsAssignment_2()); 
            // InternalMyFeatureList.g:555:2: ( rule__FeatureList__ConstraintsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFeatureList.g:555:3: rule__FeatureList__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureList__ConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getConstraintsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__2__Impl"


    // $ANTLR start "rule__FeatureList__Group__3"
    // InternalMyFeatureList.g:563:1: rule__FeatureList__Group__3 : rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 ;
    public final void rule__FeatureList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:567:1: ( rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 )
            // InternalMyFeatureList.g:568:2: rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FeatureList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__3"


    // $ANTLR start "rule__FeatureList__Group__3__Impl"
    // InternalMyFeatureList.g:575:1: rule__FeatureList__Group__3__Impl : ( 'keys' ) ;
    public final void rule__FeatureList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:579:1: ( ( 'keys' ) )
            // InternalMyFeatureList.g:580:1: ( 'keys' )
            {
            // InternalMyFeatureList.g:580:1: ( 'keys' )
            // InternalMyFeatureList.g:581:2: 'keys'
            {
             before(grammarAccess.getFeatureListAccess().getKeysKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureListAccess().getKeysKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__3__Impl"


    // $ANTLR start "rule__FeatureList__Group__4"
    // InternalMyFeatureList.g:590:1: rule__FeatureList__Group__4 : rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 ;
    public final void rule__FeatureList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:594:1: ( rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 )
            // InternalMyFeatureList.g:595:2: rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__FeatureList__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__4"


    // $ANTLR start "rule__FeatureList__Group__4__Impl"
    // InternalMyFeatureList.g:602:1: rule__FeatureList__Group__4__Impl : ( ( rule__FeatureList__KeysAssignment_4 )* ) ;
    public final void rule__FeatureList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:606:1: ( ( ( rule__FeatureList__KeysAssignment_4 )* ) )
            // InternalMyFeatureList.g:607:1: ( ( rule__FeatureList__KeysAssignment_4 )* )
            {
            // InternalMyFeatureList.g:607:1: ( ( rule__FeatureList__KeysAssignment_4 )* )
            // InternalMyFeatureList.g:608:2: ( rule__FeatureList__KeysAssignment_4 )*
            {
             before(grammarAccess.getFeatureListAccess().getKeysAssignment_4()); 
            // InternalMyFeatureList.g:609:2: ( rule__FeatureList__KeysAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyFeatureList.g:609:3: rule__FeatureList__KeysAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureList__KeysAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getKeysAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__4__Impl"


    // $ANTLR start "rule__FeatureList__Group__5"
    // InternalMyFeatureList.g:617:1: rule__FeatureList__Group__5 : rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 ;
    public final void rule__FeatureList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:621:1: ( rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 )
            // InternalMyFeatureList.g:622:2: rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__FeatureList__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__5"


    // $ANTLR start "rule__FeatureList__Group__5__Impl"
    // InternalMyFeatureList.g:629:1: rule__FeatureList__Group__5__Impl : ( 'properties' ) ;
    public final void rule__FeatureList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:633:1: ( ( 'properties' ) )
            // InternalMyFeatureList.g:634:1: ( 'properties' )
            {
            // InternalMyFeatureList.g:634:1: ( 'properties' )
            // InternalMyFeatureList.g:635:2: 'properties'
            {
             before(grammarAccess.getFeatureListAccess().getPropertiesKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFeatureListAccess().getPropertiesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__5__Impl"


    // $ANTLR start "rule__FeatureList__Group__6"
    // InternalMyFeatureList.g:644:1: rule__FeatureList__Group__6 : rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7 ;
    public final void rule__FeatureList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:648:1: ( rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7 )
            // InternalMyFeatureList.g:649:2: rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__FeatureList__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__6"


    // $ANTLR start "rule__FeatureList__Group__6__Impl"
    // InternalMyFeatureList.g:656:1: rule__FeatureList__Group__6__Impl : ( ( rule__FeatureList__PropertiesAssignment_6 )* ) ;
    public final void rule__FeatureList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:660:1: ( ( ( rule__FeatureList__PropertiesAssignment_6 )* ) )
            // InternalMyFeatureList.g:661:1: ( ( rule__FeatureList__PropertiesAssignment_6 )* )
            {
            // InternalMyFeatureList.g:661:1: ( ( rule__FeatureList__PropertiesAssignment_6 )* )
            // InternalMyFeatureList.g:662:2: ( rule__FeatureList__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getFeatureListAccess().getPropertiesAssignment_6()); 
            // InternalMyFeatureList.g:663:2: ( rule__FeatureList__PropertiesAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyFeatureList.g:663:3: rule__FeatureList__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureList__PropertiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getPropertiesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__6__Impl"


    // $ANTLR start "rule__FeatureList__Group__7"
    // InternalMyFeatureList.g:671:1: rule__FeatureList__Group__7 : rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8 ;
    public final void rule__FeatureList__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:675:1: ( rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8 )
            // InternalMyFeatureList.g:676:2: rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FeatureList__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__7"


    // $ANTLR start "rule__FeatureList__Group__7__Impl"
    // InternalMyFeatureList.g:683:1: rule__FeatureList__Group__7__Impl : ( 'features' ) ;
    public final void rule__FeatureList__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:687:1: ( ( 'features' ) )
            // InternalMyFeatureList.g:688:1: ( 'features' )
            {
            // InternalMyFeatureList.g:688:1: ( 'features' )
            // InternalMyFeatureList.g:689:2: 'features'
            {
             before(grammarAccess.getFeatureListAccess().getFeaturesKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFeatureListAccess().getFeaturesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__7__Impl"


    // $ANTLR start "rule__FeatureList__Group__8"
    // InternalMyFeatureList.g:698:1: rule__FeatureList__Group__8 : rule__FeatureList__Group__8__Impl ;
    public final void rule__FeatureList__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:702:1: ( rule__FeatureList__Group__8__Impl )
            // InternalMyFeatureList.g:703:2: rule__FeatureList__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__8"


    // $ANTLR start "rule__FeatureList__Group__8__Impl"
    // InternalMyFeatureList.g:709:1: rule__FeatureList__Group__8__Impl : ( ( rule__FeatureList__FeaturesAssignment_8 )* ) ;
    public final void rule__FeatureList__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:713:1: ( ( ( rule__FeatureList__FeaturesAssignment_8 )* ) )
            // InternalMyFeatureList.g:714:1: ( ( rule__FeatureList__FeaturesAssignment_8 )* )
            {
            // InternalMyFeatureList.g:714:1: ( ( rule__FeatureList__FeaturesAssignment_8 )* )
            // InternalMyFeatureList.g:715:2: ( rule__FeatureList__FeaturesAssignment_8 )*
            {
             before(grammarAccess.getFeatureListAccess().getFeaturesAssignment_8()); 
            // InternalMyFeatureList.g:716:2: ( rule__FeatureList__FeaturesAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=19 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyFeatureList.g:716:3: rule__FeatureList__FeaturesAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FeatureList__FeaturesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getFeaturesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__Group__8__Impl"


    // $ANTLR start "rule__Concept__Group__0"
    // InternalMyFeatureList.g:725:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:729:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalMyFeatureList.g:730:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Concept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__0"


    // $ANTLR start "rule__Concept__Group__0__Impl"
    // InternalMyFeatureList.g:737:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:741:1: ( ( 'concept' ) )
            // InternalMyFeatureList.g:742:1: ( 'concept' )
            {
            // InternalMyFeatureList.g:742:1: ( 'concept' )
            // InternalMyFeatureList.g:743:2: 'concept'
            {
             before(grammarAccess.getConceptAccess().getConceptKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getConceptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__0__Impl"


    // $ANTLR start "rule__Concept__Group__1"
    // InternalMyFeatureList.g:752:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:756:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalMyFeatureList.g:757:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Concept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__1"


    // $ANTLR start "rule__Concept__Group__1__Impl"
    // InternalMyFeatureList.g:764:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:768:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:769:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:769:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalMyFeatureList.g:770:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:771:2: ( rule__Concept__NameAssignment_1 )
            // InternalMyFeatureList.g:771:3: rule__Concept__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Concept__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__1__Impl"


    // $ANTLR start "rule__Concept__Group__2"
    // InternalMyFeatureList.g:779:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:783:1: ( rule__Concept__Group__2__Impl )
            // InternalMyFeatureList.g:784:2: rule__Concept__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__2"


    // $ANTLR start "rule__Concept__Group__2__Impl"
    // InternalMyFeatureList.g:790:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__AttributesAssignment_2 )* ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:794:1: ( ( ( rule__Concept__AttributesAssignment_2 )* ) )
            // InternalMyFeatureList.g:795:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            {
            // InternalMyFeatureList.g:795:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            // InternalMyFeatureList.g:796:2: ( rule__Concept__AttributesAssignment_2 )*
            {
             before(grammarAccess.getConceptAccess().getAttributesAssignment_2()); 
            // InternalMyFeatureList.g:797:2: ( rule__Concept__AttributesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyFeatureList.g:797:3: rule__Concept__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Concept__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConceptAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyFeatureList.g:806:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:810:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyFeatureList.g:811:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyFeatureList.g:818:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:822:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalMyFeatureList.g:823:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalMyFeatureList.g:823:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalMyFeatureList.g:824:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalMyFeatureList.g:825:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalMyFeatureList.g:825:3: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyFeatureList.g:833:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:837:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyFeatureList.g:838:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyFeatureList.g:845:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:849:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:850:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:850:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyFeatureList.g:851:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:852:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyFeatureList.g:852:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyFeatureList.g:860:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:864:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyFeatureList.g:865:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyFeatureList.g:871:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MultiplicityAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:875:1: ( ( ( rule__Attribute__MultiplicityAssignment_2 )? ) )
            // InternalMyFeatureList.g:876:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            {
            // InternalMyFeatureList.g:876:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            // InternalMyFeatureList.g:877:2: ( rule__Attribute__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 
            // InternalMyFeatureList.g:878:2: ( rule__Attribute__MultiplicityAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_MULTIPLICITY) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyFeatureList.g:878:3: rule__Attribute__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__MultiplicityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMyFeatureList.g:887:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:891:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMyFeatureList.g:892:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalMyFeatureList.g:899:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Alternatives_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:903:1: ( ( ( rule__Condition__Alternatives_0 ) ) )
            // InternalMyFeatureList.g:904:1: ( ( rule__Condition__Alternatives_0 ) )
            {
            // InternalMyFeatureList.g:904:1: ( ( rule__Condition__Alternatives_0 ) )
            // InternalMyFeatureList.g:905:2: ( rule__Condition__Alternatives_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0()); 
            // InternalMyFeatureList.g:906:2: ( rule__Condition__Alternatives_0 )
            // InternalMyFeatureList.g:906:3: rule__Condition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalMyFeatureList.g:914:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:918:1: ( rule__Condition__Group__1__Impl )
            // InternalMyFeatureList.g:919:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalMyFeatureList.g:925:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ValueAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:929:1: ( ( ( rule__Condition__ValueAssignment_1 ) ) )
            // InternalMyFeatureList.g:930:1: ( ( rule__Condition__ValueAssignment_1 ) )
            {
            // InternalMyFeatureList.g:930:1: ( ( rule__Condition__ValueAssignment_1 ) )
            // InternalMyFeatureList.g:931:2: ( rule__Condition__ValueAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1()); 
            // InternalMyFeatureList.g:932:2: ( rule__Condition__ValueAssignment_1 )
            // InternalMyFeatureList.g:932:3: rule__Condition__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalMyFeatureList.g:941:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:945:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyFeatureList.g:946:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalMyFeatureList.g:953:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__ConceptAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:957:1: ( ( ( rule__Constraint__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:958:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:958:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:959:2: ( rule__Constraint__ConceptAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:960:2: ( rule__Constraint__ConceptAssignment_0 )
            // InternalMyFeatureList.g:960:3: rule__Constraint__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ConceptAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getConceptAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalMyFeatureList.g:968:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:972:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyFeatureList.g:973:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalMyFeatureList.g:980:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Group_1__0 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:984:1: ( ( ( rule__Constraint__Group_1__0 ) ) )
            // InternalMyFeatureList.g:985:1: ( ( rule__Constraint__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:985:1: ( ( rule__Constraint__Group_1__0 ) )
            // InternalMyFeatureList.g:986:2: ( rule__Constraint__Group_1__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_1()); 
            // InternalMyFeatureList.g:987:2: ( rule__Constraint__Group_1__0 )
            // InternalMyFeatureList.g:987:3: rule__Constraint__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalMyFeatureList.g:995:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:999:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalMyFeatureList.g:1000:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalMyFeatureList.g:1007:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ConditionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1011:1: ( ( ( rule__Constraint__ConditionAssignment_2 ) ) )
            // InternalMyFeatureList.g:1012:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            {
            // InternalMyFeatureList.g:1012:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            // InternalMyFeatureList.g:1013:2: ( rule__Constraint__ConditionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getConditionAssignment_2()); 
            // InternalMyFeatureList.g:1014:2: ( rule__Constraint__ConditionAssignment_2 )
            // InternalMyFeatureList.g:1014:3: rule__Constraint__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalMyFeatureList.g:1022:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1026:1: ( rule__Constraint__Group__3__Impl )
            // InternalMyFeatureList.g:1027:2: rule__Constraint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalMyFeatureList.g:1033:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__ErrormsgAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1037:1: ( ( ( rule__Constraint__ErrormsgAssignment_3 ) ) )
            // InternalMyFeatureList.g:1038:1: ( ( rule__Constraint__ErrormsgAssignment_3 ) )
            {
            // InternalMyFeatureList.g:1038:1: ( ( rule__Constraint__ErrormsgAssignment_3 ) )
            // InternalMyFeatureList.g:1039:2: ( rule__Constraint__ErrormsgAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getErrormsgAssignment_3()); 
            // InternalMyFeatureList.g:1040:2: ( rule__Constraint__ErrormsgAssignment_3 )
            // InternalMyFeatureList.g:1040:3: rule__Constraint__ErrormsgAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ErrormsgAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getErrormsgAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group_1__0"
    // InternalMyFeatureList.g:1049:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1053:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalMyFeatureList.g:1054:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Constraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__0"


    // $ANTLR start "rule__Constraint__Group_1__0__Impl"
    // InternalMyFeatureList.g:1061:1: rule__Constraint__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1065:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1066:1: ( '.' )
            {
            // InternalMyFeatureList.g:1066:1: ( '.' )
            // InternalMyFeatureList.g:1067:2: '.'
            {
             before(grammarAccess.getConstraintAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__0__Impl"


    // $ANTLR start "rule__Constraint__Group_1__1"
    // InternalMyFeatureList.g:1076:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1080:1: ( rule__Constraint__Group_1__1__Impl )
            // InternalMyFeatureList.g:1081:2: rule__Constraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__1"


    // $ANTLR start "rule__Constraint__Group_1__1__Impl"
    // InternalMyFeatureList.g:1087:1: rule__Constraint__Group_1__1__Impl : ( ( rule__Constraint__AttributeAssignment_1_1 ) ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1091:1: ( ( ( rule__Constraint__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:1092:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:1092:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:1093:2: ( rule__Constraint__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:1094:2: ( rule__Constraint__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:1094:3: rule__Constraint__AttributeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__AttributeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAttributeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_1__1__Impl"


    // $ANTLR start "rule__Key__Group__0"
    // InternalMyFeatureList.g:1103:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1107:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalMyFeatureList.g:1108:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0"


    // $ANTLR start "rule__Key__Group__0__Impl"
    // InternalMyFeatureList.g:1115:1: rule__Key__Group__0__Impl : ( ( rule__Key__ConceptAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1119:1: ( ( ( rule__Key__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:1120:1: ( ( rule__Key__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1120:1: ( ( rule__Key__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:1121:2: ( rule__Key__ConceptAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:1122:2: ( rule__Key__ConceptAssignment_0 )
            // InternalMyFeatureList.g:1122:3: rule__Key__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Key__ConceptAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getConceptAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0__Impl"


    // $ANTLR start "rule__Key__Group__1"
    // InternalMyFeatureList.g:1130:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1134:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // InternalMyFeatureList.g:1135:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1"


    // $ANTLR start "rule__Key__Group__1__Impl"
    // InternalMyFeatureList.g:1142:1: rule__Key__Group__1__Impl : ( ( rule__Key__Group_1__0 ) ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1146:1: ( ( ( rule__Key__Group_1__0 ) ) )
            // InternalMyFeatureList.g:1147:1: ( ( rule__Key__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:1147:1: ( ( rule__Key__Group_1__0 ) )
            // InternalMyFeatureList.g:1148:2: ( rule__Key__Group_1__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup_1()); 
            // InternalMyFeatureList.g:1149:2: ( rule__Key__Group_1__0 )
            // InternalMyFeatureList.g:1149:3: rule__Key__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1__Impl"


    // $ANTLR start "rule__Key__Group__2"
    // InternalMyFeatureList.g:1157:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1161:1: ( rule__Key__Group__2__Impl )
            // InternalMyFeatureList.g:1162:2: rule__Key__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__2"


    // $ANTLR start "rule__Key__Group__2__Impl"
    // InternalMyFeatureList.g:1168:1: rule__Key__Group__2__Impl : ( ( rule__Key__Alternatives_2 ) ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1172:1: ( ( ( rule__Key__Alternatives_2 ) ) )
            // InternalMyFeatureList.g:1173:1: ( ( rule__Key__Alternatives_2 ) )
            {
            // InternalMyFeatureList.g:1173:1: ( ( rule__Key__Alternatives_2 ) )
            // InternalMyFeatureList.g:1174:2: ( rule__Key__Alternatives_2 )
            {
             before(grammarAccess.getKeyAccess().getAlternatives_2()); 
            // InternalMyFeatureList.g:1175:2: ( rule__Key__Alternatives_2 )
            // InternalMyFeatureList.g:1175:3: rule__Key__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Key__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__2__Impl"


    // $ANTLR start "rule__Key__Group_1__0"
    // InternalMyFeatureList.g:1184:1: rule__Key__Group_1__0 : rule__Key__Group_1__0__Impl rule__Key__Group_1__1 ;
    public final void rule__Key__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1188:1: ( rule__Key__Group_1__0__Impl rule__Key__Group_1__1 )
            // InternalMyFeatureList.g:1189:2: rule__Key__Group_1__0__Impl rule__Key__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Key__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Key__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__0"


    // $ANTLR start "rule__Key__Group_1__0__Impl"
    // InternalMyFeatureList.g:1196:1: rule__Key__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Key__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1200:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1201:1: ( '.' )
            {
            // InternalMyFeatureList.g:1201:1: ( '.' )
            // InternalMyFeatureList.g:1202:2: '.'
            {
             before(grammarAccess.getKeyAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__0__Impl"


    // $ANTLR start "rule__Key__Group_1__1"
    // InternalMyFeatureList.g:1211:1: rule__Key__Group_1__1 : rule__Key__Group_1__1__Impl ;
    public final void rule__Key__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1215:1: ( rule__Key__Group_1__1__Impl )
            // InternalMyFeatureList.g:1216:2: rule__Key__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__1"


    // $ANTLR start "rule__Key__Group_1__1__Impl"
    // InternalMyFeatureList.g:1222:1: rule__Key__Group_1__1__Impl : ( ( rule__Key__AttributeAssignment_1_1 ) ) ;
    public final void rule__Key__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1226:1: ( ( ( rule__Key__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:1227:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:1227:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:1228:2: ( rule__Key__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getKeyAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:1229:2: ( rule__Key__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:1229:3: rule__Key__AttributeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Key__AttributeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getAttributeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_1__1__Impl"


    // $ANTLR start "rule__ConceptProperty__Group__0"
    // InternalMyFeatureList.g:1238:1: rule__ConceptProperty__Group__0 : rule__ConceptProperty__Group__0__Impl rule__ConceptProperty__Group__1 ;
    public final void rule__ConceptProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1242:1: ( rule__ConceptProperty__Group__0__Impl rule__ConceptProperty__Group__1 )
            // InternalMyFeatureList.g:1243:2: rule__ConceptProperty__Group__0__Impl rule__ConceptProperty__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ConceptProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConceptProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptProperty__Group__0"


    // $ANTLR start "rule__ConceptProperty__Group__0__Impl"
    // InternalMyFeatureList.g:1250:1: rule__ConceptProperty__Group__0__Impl : ( ( rule__ConceptProperty__ConceptAssignment_0 ) ) ;
    public final void rule__ConceptProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1254:1: ( ( ( rule__ConceptProperty__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:1255:1: ( ( rule__ConceptProperty__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1255:1: ( ( rule__ConceptProperty__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:1256:2: ( rule__ConceptProperty__ConceptAssignment_0 )
            {
             before(grammarAccess.getConceptPropertyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:1257:2: ( rule__ConceptProperty__ConceptAssignment_0 )
            // InternalMyFeatureList.g:1257:3: rule__ConceptProperty__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConceptProperty__ConceptAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConceptPropertyAccess().getConceptAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptProperty__Group__0__Impl"


    // $ANTLR start "rule__ConceptProperty__Group__1"
    // InternalMyFeatureList.g:1265:1: rule__ConceptProperty__Group__1 : rule__ConceptProperty__Group__1__Impl ;
    public final void rule__ConceptProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1269:1: ( rule__ConceptProperty__Group__1__Impl )
            // InternalMyFeatureList.g:1270:2: rule__ConceptProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConceptProperty__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptProperty__Group__1"


    // $ANTLR start "rule__ConceptProperty__Group__1__Impl"
    // InternalMyFeatureList.g:1276:1: rule__ConceptProperty__Group__1__Impl : ( 'root' ) ;
    public final void rule__ConceptProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1280:1: ( ( 'root' ) )
            // InternalMyFeatureList.g:1281:1: ( 'root' )
            {
            // InternalMyFeatureList.g:1281:1: ( 'root' )
            // InternalMyFeatureList.g:1282:2: 'root'
            {
             before(grammarAccess.getConceptPropertyAccess().getRootKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConceptPropertyAccess().getRootKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptProperty__Group__1__Impl"


    // $ANTLR start "rule__AttributeProperty__Group__0"
    // InternalMyFeatureList.g:1292:1: rule__AttributeProperty__Group__0 : rule__AttributeProperty__Group__0__Impl rule__AttributeProperty__Group__1 ;
    public final void rule__AttributeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1296:1: ( rule__AttributeProperty__Group__0__Impl rule__AttributeProperty__Group__1 )
            // InternalMyFeatureList.g:1297:2: rule__AttributeProperty__Group__0__Impl rule__AttributeProperty__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AttributeProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group__0"


    // $ANTLR start "rule__AttributeProperty__Group__0__Impl"
    // InternalMyFeatureList.g:1304:1: rule__AttributeProperty__Group__0__Impl : ( ( rule__AttributeProperty__ConceptAssignment_0 ) ) ;
    public final void rule__AttributeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1308:1: ( ( ( rule__AttributeProperty__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:1309:1: ( ( rule__AttributeProperty__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1309:1: ( ( rule__AttributeProperty__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:1310:2: ( rule__AttributeProperty__ConceptAssignment_0 )
            {
             before(grammarAccess.getAttributePropertyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:1311:2: ( rule__AttributeProperty__ConceptAssignment_0 )
            // InternalMyFeatureList.g:1311:3: rule__AttributeProperty__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeProperty__ConceptAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributePropertyAccess().getConceptAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group__0__Impl"


    // $ANTLR start "rule__AttributeProperty__Group__1"
    // InternalMyFeatureList.g:1319:1: rule__AttributeProperty__Group__1 : rule__AttributeProperty__Group__1__Impl rule__AttributeProperty__Group__2 ;
    public final void rule__AttributeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1323:1: ( rule__AttributeProperty__Group__1__Impl rule__AttributeProperty__Group__2 )
            // InternalMyFeatureList.g:1324:2: rule__AttributeProperty__Group__1__Impl rule__AttributeProperty__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AttributeProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group__1"


    // $ANTLR start "rule__AttributeProperty__Group__1__Impl"
    // InternalMyFeatureList.g:1331:1: rule__AttributeProperty__Group__1__Impl : ( ( rule__AttributeProperty__Group_1__0 ) ) ;
    public final void rule__AttributeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1335:1: ( ( ( rule__AttributeProperty__Group_1__0 ) ) )
            // InternalMyFeatureList.g:1336:1: ( ( rule__AttributeProperty__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:1336:1: ( ( rule__AttributeProperty__Group_1__0 ) )
            // InternalMyFeatureList.g:1337:2: ( rule__AttributeProperty__Group_1__0 )
            {
             before(grammarAccess.getAttributePropertyAccess().getGroup_1()); 
            // InternalMyFeatureList.g:1338:2: ( rule__AttributeProperty__Group_1__0 )
            // InternalMyFeatureList.g:1338:3: rule__AttributeProperty__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeProperty__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributePropertyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group__1__Impl"


    // $ANTLR start "rule__AttributeProperty__Group__2"
    // InternalMyFeatureList.g:1346:1: rule__AttributeProperty__Group__2 : rule__AttributeProperty__Group__2__Impl ;
    public final void rule__AttributeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1350:1: ( rule__AttributeProperty__Group__2__Impl )
            // InternalMyFeatureList.g:1351:2: rule__AttributeProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group__2"


    // $ANTLR start "rule__AttributeProperty__Group__2__Impl"
    // InternalMyFeatureList.g:1357:1: rule__AttributeProperty__Group__2__Impl : ( 'lazy' ) ;
    public final void rule__AttributeProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1361:1: ( ( 'lazy' ) )
            // InternalMyFeatureList.g:1362:1: ( 'lazy' )
            {
            // InternalMyFeatureList.g:1362:1: ( 'lazy' )
            // InternalMyFeatureList.g:1363:2: 'lazy'
            {
             before(grammarAccess.getAttributePropertyAccess().getLazyKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributePropertyAccess().getLazyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group__2__Impl"


    // $ANTLR start "rule__AttributeProperty__Group_1__0"
    // InternalMyFeatureList.g:1373:1: rule__AttributeProperty__Group_1__0 : rule__AttributeProperty__Group_1__0__Impl rule__AttributeProperty__Group_1__1 ;
    public final void rule__AttributeProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1377:1: ( rule__AttributeProperty__Group_1__0__Impl rule__AttributeProperty__Group_1__1 )
            // InternalMyFeatureList.g:1378:2: rule__AttributeProperty__Group_1__0__Impl rule__AttributeProperty__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__AttributeProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeProperty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group_1__0"


    // $ANTLR start "rule__AttributeProperty__Group_1__0__Impl"
    // InternalMyFeatureList.g:1385:1: rule__AttributeProperty__Group_1__0__Impl : ( '.' ) ;
    public final void rule__AttributeProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1389:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1390:1: ( '.' )
            {
            // InternalMyFeatureList.g:1390:1: ( '.' )
            // InternalMyFeatureList.g:1391:2: '.'
            {
             before(grammarAccess.getAttributePropertyAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributePropertyAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeProperty__Group_1__1"
    // InternalMyFeatureList.g:1400:1: rule__AttributeProperty__Group_1__1 : rule__AttributeProperty__Group_1__1__Impl ;
    public final void rule__AttributeProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1404:1: ( rule__AttributeProperty__Group_1__1__Impl )
            // InternalMyFeatureList.g:1405:2: rule__AttributeProperty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeProperty__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group_1__1"


    // $ANTLR start "rule__AttributeProperty__Group_1__1__Impl"
    // InternalMyFeatureList.g:1411:1: rule__AttributeProperty__Group_1__1__Impl : ( ( rule__AttributeProperty__AttributeAssignment_1_1 ) ) ;
    public final void rule__AttributeProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1415:1: ( ( ( rule__AttributeProperty__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:1416:1: ( ( rule__AttributeProperty__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:1416:1: ( ( rule__AttributeProperty__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:1417:2: ( rule__AttributeProperty__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getAttributePropertyAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:1418:2: ( rule__AttributeProperty__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:1418:3: rule__AttributeProperty__AttributeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeProperty__AttributeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributePropertyAccess().getAttributeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__Group_1__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalMyFeatureList.g:1427:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1431:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalMyFeatureList.g:1432:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalMyFeatureList.g:1439:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__VerbAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1443:1: ( ( ( rule__Feature__VerbAssignment_0 ) ) )
            // InternalMyFeatureList.g:1444:1: ( ( rule__Feature__VerbAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1444:1: ( ( rule__Feature__VerbAssignment_0 ) )
            // InternalMyFeatureList.g:1445:2: ( rule__Feature__VerbAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getVerbAssignment_0()); 
            // InternalMyFeatureList.g:1446:2: ( rule__Feature__VerbAssignment_0 )
            // InternalMyFeatureList.g:1446:3: rule__Feature__VerbAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__VerbAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getVerbAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalMyFeatureList.g:1454:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1458:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalMyFeatureList.g:1459:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalMyFeatureList.g:1466:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConceptAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1470:1: ( ( ( rule__Feature__ConceptAssignment_1 ) ) )
            // InternalMyFeatureList.g:1471:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            {
            // InternalMyFeatureList.g:1471:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            // InternalMyFeatureList.g:1472:2: ( rule__Feature__ConceptAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getConceptAssignment_1()); 
            // InternalMyFeatureList.g:1473:2: ( rule__Feature__ConceptAssignment_1 )
            // InternalMyFeatureList.g:1473:3: rule__Feature__ConceptAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__ConceptAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getConceptAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalMyFeatureList.g:1481:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1485:1: ( rule__Feature__Group__2__Impl )
            // InternalMyFeatureList.g:1486:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalMyFeatureList.g:1492:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1496:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalMyFeatureList.g:1497:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalMyFeatureList.g:1497:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalMyFeatureList.g:1498:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalMyFeatureList.g:1499:2: ( rule__Feature__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyFeatureList.g:1499:3: rule__Feature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group_2__0"
    // InternalMyFeatureList.g:1508:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1512:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalMyFeatureList.g:1513:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0"


    // $ANTLR start "rule__Feature__Group_2__0__Impl"
    // InternalMyFeatureList.g:1520:1: rule__Feature__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1524:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1525:1: ( '.' )
            {
            // InternalMyFeatureList.g:1525:1: ( '.' )
            // InternalMyFeatureList.g:1526:2: '.'
            {
             before(grammarAccess.getFeatureAccess().getFullStopKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0__Impl"


    // $ANTLR start "rule__Feature__Group_2__1"
    // InternalMyFeatureList.g:1535:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1539:1: ( rule__Feature__Group_2__1__Impl )
            // InternalMyFeatureList.g:1540:2: rule__Feature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1"


    // $ANTLR start "rule__Feature__Group_2__1__Impl"
    // InternalMyFeatureList.g:1546:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__AttributeAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1550:1: ( ( ( rule__Feature__AttributeAssignment_2_1 ) ) )
            // InternalMyFeatureList.g:1551:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            {
            // InternalMyFeatureList.g:1551:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            // InternalMyFeatureList.g:1552:2: ( rule__Feature__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1()); 
            // InternalMyFeatureList.g:1553:2: ( rule__Feature__AttributeAssignment_2_1 )
            // InternalMyFeatureList.g:1553:3: rule__Feature__AttributeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__AttributeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1__Impl"


    // $ANTLR start "rule__FeatureList__ConceptsAssignment_0"
    // InternalMyFeatureList.g:1562:1: rule__FeatureList__ConceptsAssignment_0 : ( ruleConcept ) ;
    public final void rule__FeatureList__ConceptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1566:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:1567:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:1567:2: ( ruleConcept )
            // InternalMyFeatureList.g:1568:3: ruleConcept
            {
             before(grammarAccess.getFeatureListAccess().getConceptsConceptParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getConceptsConceptParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__ConceptsAssignment_0"


    // $ANTLR start "rule__FeatureList__ConstraintsAssignment_2"
    // InternalMyFeatureList.g:1577:1: rule__FeatureList__ConstraintsAssignment_2 : ( ruleConstraint ) ;
    public final void rule__FeatureList__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1581:1: ( ( ruleConstraint ) )
            // InternalMyFeatureList.g:1582:2: ( ruleConstraint )
            {
            // InternalMyFeatureList.g:1582:2: ( ruleConstraint )
            // InternalMyFeatureList.g:1583:3: ruleConstraint
            {
             before(grammarAccess.getFeatureListAccess().getConstraintsConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getConstraintsConstraintParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__ConstraintsAssignment_2"


    // $ANTLR start "rule__FeatureList__KeysAssignment_4"
    // InternalMyFeatureList.g:1592:1: rule__FeatureList__KeysAssignment_4 : ( ruleKey ) ;
    public final void rule__FeatureList__KeysAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1596:1: ( ( ruleKey ) )
            // InternalMyFeatureList.g:1597:2: ( ruleKey )
            {
            // InternalMyFeatureList.g:1597:2: ( ruleKey )
            // InternalMyFeatureList.g:1598:3: ruleKey
            {
             before(grammarAccess.getFeatureListAccess().getKeysKeyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getKeysKeyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__KeysAssignment_4"


    // $ANTLR start "rule__FeatureList__PropertiesAssignment_6"
    // InternalMyFeatureList.g:1607:1: rule__FeatureList__PropertiesAssignment_6 : ( ruleProperty ) ;
    public final void rule__FeatureList__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1611:1: ( ( ruleProperty ) )
            // InternalMyFeatureList.g:1612:2: ( ruleProperty )
            {
            // InternalMyFeatureList.g:1612:2: ( ruleProperty )
            // InternalMyFeatureList.g:1613:3: ruleProperty
            {
             before(grammarAccess.getFeatureListAccess().getPropertiesPropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getPropertiesPropertyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__PropertiesAssignment_6"


    // $ANTLR start "rule__FeatureList__FeaturesAssignment_8"
    // InternalMyFeatureList.g:1622:1: rule__FeatureList__FeaturesAssignment_8 : ( ruleFeature ) ;
    public final void rule__FeatureList__FeaturesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1626:1: ( ( ruleFeature ) )
            // InternalMyFeatureList.g:1627:2: ( ruleFeature )
            {
            // InternalMyFeatureList.g:1627:2: ( ruleFeature )
            // InternalMyFeatureList.g:1628:3: ruleFeature
            {
             before(grammarAccess.getFeatureListAccess().getFeaturesFeatureParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getFeaturesFeatureParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__FeaturesAssignment_8"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalMyFeatureList.g:1637:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1641:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1642:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1642:2: ( RULE_ID )
            // InternalMyFeatureList.g:1643:3: RULE_ID
            {
             before(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__NameAssignment_1"


    // $ANTLR start "rule__Concept__AttributesAssignment_2"
    // InternalMyFeatureList.g:1652:1: rule__Concept__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Concept__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1656:1: ( ( ruleAttribute ) )
            // InternalMyFeatureList.g:1657:2: ( ruleAttribute )
            {
            // InternalMyFeatureList.g:1657:2: ( ruleAttribute )
            // InternalMyFeatureList.g:1658:3: ruleAttribute
            {
             before(grammarAccess.getConceptAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getConceptAccess().getAttributesAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__AttributesAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // InternalMyFeatureList.g:1667:1: rule__Attribute__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1671:1: ( ( ruleType ) )
            // InternalMyFeatureList.g:1672:2: ( ruleType )
            {
            // InternalMyFeatureList.g:1672:2: ( ruleType )
            // InternalMyFeatureList.g:1673:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyFeatureList.g:1682:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1686:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1687:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1687:2: ( RULE_ID )
            // InternalMyFeatureList.g:1688:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__MultiplicityAssignment_2"
    // InternalMyFeatureList.g:1697:1: rule__Attribute__MultiplicityAssignment_2 : ( RULE_MULTIPLICITY ) ;
    public final void rule__Attribute__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1701:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMyFeatureList.g:1702:2: ( RULE_MULTIPLICITY )
            {
            // InternalMyFeatureList.g:1702:2: ( RULE_MULTIPLICITY )
            // InternalMyFeatureList.g:1703:3: RULE_MULTIPLICITY
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityMULTIPLICITYTerminalRuleCall_2_0()); 
            match(input,RULE_MULTIPLICITY,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMultiplicityMULTIPLICITYTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MultiplicityAssignment_2"


    // $ANTLR start "rule__Type__NameAssignment"
    // InternalMyFeatureList.g:1712:1: rule__Type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1716:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1717:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1717:2: ( RULE_ID )
            // InternalMyFeatureList.g:1718:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment"


    // $ANTLR start "rule__Condition__ValueAssignment_1"
    // InternalMyFeatureList.g:1727:1: rule__Condition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1731:1: ( ( RULE_INT ) )
            // InternalMyFeatureList.g:1732:2: ( RULE_INT )
            {
            // InternalMyFeatureList.g:1732:2: ( RULE_INT )
            // InternalMyFeatureList.g:1733:3: RULE_INT
            {
             before(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_1"


    // $ANTLR start "rule__Constraint__ConceptAssignment_0"
    // InternalMyFeatureList.g:1742:1: rule__Constraint__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1746:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1747:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1747:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1748:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1749:3: ( RULE_ID )
            // InternalMyFeatureList.g:1750:4: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ConceptAssignment_0"


    // $ANTLR start "rule__Constraint__AttributeAssignment_1_1"
    // InternalMyFeatureList.g:1761:1: rule__Constraint__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1765:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1766:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1766:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1767:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1768:3: ( RULE_ID )
            // InternalMyFeatureList.g:1769:4: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getAttributeAttributeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__AttributeAssignment_1_1"


    // $ANTLR start "rule__Constraint__ConditionAssignment_2"
    // InternalMyFeatureList.g:1780:1: rule__Constraint__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Constraint__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1784:1: ( ( ruleCondition ) )
            // InternalMyFeatureList.g:1785:2: ( ruleCondition )
            {
            // InternalMyFeatureList.g:1785:2: ( ruleCondition )
            // InternalMyFeatureList.g:1786:3: ruleCondition
            {
             before(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ConditionAssignment_2"


    // $ANTLR start "rule__Constraint__ErrormsgAssignment_3"
    // InternalMyFeatureList.g:1795:1: rule__Constraint__ErrormsgAssignment_3 : ( ruleErrorMsg ) ;
    public final void rule__Constraint__ErrormsgAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1799:1: ( ( ruleErrorMsg ) )
            // InternalMyFeatureList.g:1800:2: ( ruleErrorMsg )
            {
            // InternalMyFeatureList.g:1800:2: ( ruleErrorMsg )
            // InternalMyFeatureList.g:1801:3: ruleErrorMsg
            {
             before(grammarAccess.getConstraintAccess().getErrormsgErrorMsgParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleErrorMsg();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getErrormsgErrorMsgParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ErrormsgAssignment_3"


    // $ANTLR start "rule__Key__ConceptAssignment_0"
    // InternalMyFeatureList.g:1810:1: rule__Key__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Key__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1814:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1815:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1815:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1816:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1817:3: ( RULE_ID )
            // InternalMyFeatureList.g:1818:4: RULE_ID
            {
             before(grammarAccess.getKeyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__ConceptAssignment_0"


    // $ANTLR start "rule__Key__AttributeAssignment_1_1"
    // InternalMyFeatureList.g:1829:1: rule__Key__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Key__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1833:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1834:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1834:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1835:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1836:3: ( RULE_ID )
            // InternalMyFeatureList.g:1837:4: RULE_ID
            {
             before(grammarAccess.getKeyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getKeyAccess().getAttributeAttributeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__AttributeAssignment_1_1"


    // $ANTLR start "rule__ConceptProperty__ConceptAssignment_0"
    // InternalMyFeatureList.g:1848:1: rule__ConceptProperty__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ConceptProperty__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1852:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1853:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1853:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1854:3: ( RULE_ID )
            {
             before(grammarAccess.getConceptPropertyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1855:3: ( RULE_ID )
            // InternalMyFeatureList.g:1856:4: RULE_ID
            {
             before(grammarAccess.getConceptPropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConceptPropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConceptPropertyAccess().getConceptConceptCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptProperty__ConceptAssignment_0"


    // $ANTLR start "rule__AttributeProperty__ConceptAssignment_0"
    // InternalMyFeatureList.g:1867:1: rule__AttributeProperty__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeProperty__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1871:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1872:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1872:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1873:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePropertyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1874:3: ( RULE_ID )
            // InternalMyFeatureList.g:1875:4: RULE_ID
            {
             before(grammarAccess.getAttributePropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributePropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributePropertyAccess().getConceptConceptCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__ConceptAssignment_0"


    // $ANTLR start "rule__AttributeProperty__AttributeAssignment_1_1"
    // InternalMyFeatureList.g:1886:1: rule__AttributeProperty__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeProperty__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1890:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1891:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1891:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1892:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePropertyAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1893:3: ( RULE_ID )
            // InternalMyFeatureList.g:1894:4: RULE_ID
            {
             before(grammarAccess.getAttributePropertyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributePropertyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAttributePropertyAccess().getAttributeAttributeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeProperty__AttributeAssignment_1_1"


    // $ANTLR start "rule__Feature__VerbAssignment_0"
    // InternalMyFeatureList.g:1905:1: rule__Feature__VerbAssignment_0 : ( ruleVerb ) ;
    public final void rule__Feature__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1909:1: ( ( ruleVerb ) )
            // InternalMyFeatureList.g:1910:2: ( ruleVerb )
            {
            // InternalMyFeatureList.g:1910:2: ( ruleVerb )
            // InternalMyFeatureList.g:1911:3: ruleVerb
            {
             before(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVerb();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__VerbAssignment_0"


    // $ANTLR start "rule__Feature__ConceptAssignment_1"
    // InternalMyFeatureList.g:1920:1: rule__Feature__ConceptAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1924:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1925:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1925:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1926:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); 
            // InternalMyFeatureList.g:1927:3: ( RULE_ID )
            // InternalMyFeatureList.g:1928:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getConceptConceptIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getConceptConceptIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ConceptAssignment_1"


    // $ANTLR start "rule__Feature__AttributeAssignment_2_1"
    // InternalMyFeatureList.g:1939:1: rule__Feature__AttributeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1943:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1944:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1944:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1945:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0()); 
            // InternalMyFeatureList.g:1946:3: ( RULE_ID )
            // InternalMyFeatureList.g:1947:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getAttributeAttributeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getAttributeAttributeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AttributeAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});

}