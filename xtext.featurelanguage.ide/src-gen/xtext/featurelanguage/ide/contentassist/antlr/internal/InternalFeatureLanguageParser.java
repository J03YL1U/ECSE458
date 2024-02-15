package xtext.featurelanguage.ide.contentassist.antlr.internal;

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
import xtext.featurelanguage.services.FeatureLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MULTIPLICITY", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Add'", "'Remove'", "'Update'", "'Display'", "'unique'", "'autounique'", "'index'", "'>'", "'>='", "'='", "'<='", "'<'", "'constraints'", "'keys'", "'properties'", "'features'", "'concept'", "'{'", "'}'", "'.'", "'root'", "'lazy'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_MULTIPLICITY=5;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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


        public InternalFeatureLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFeatureLanguage.g"; }


    	private FeatureLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(FeatureLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFeatureLanguage"
    // InternalFeatureLanguage.g:53:1: entryRuleFeatureLanguage : ruleFeatureLanguage EOF ;
    public final void entryRuleFeatureLanguage() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:54:1: ( ruleFeatureLanguage EOF )
            // InternalFeatureLanguage.g:55:1: ruleFeatureLanguage EOF
            {
             before(grammarAccess.getFeatureLanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureLanguage();

            state._fsp--;

             after(grammarAccess.getFeatureLanguageRule()); 
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
    // $ANTLR end "entryRuleFeatureLanguage"


    // $ANTLR start "ruleFeatureLanguage"
    // InternalFeatureLanguage.g:62:1: ruleFeatureLanguage : ( ( rule__FeatureLanguage__Group__0 ) ) ;
    public final void ruleFeatureLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:66:2: ( ( ( rule__FeatureLanguage__Group__0 ) ) )
            // InternalFeatureLanguage.g:67:2: ( ( rule__FeatureLanguage__Group__0 ) )
            {
            // InternalFeatureLanguage.g:67:2: ( ( rule__FeatureLanguage__Group__0 ) )
            // InternalFeatureLanguage.g:68:3: ( rule__FeatureLanguage__Group__0 )
            {
             before(grammarAccess.getFeatureLanguageAccess().getGroup()); 
            // InternalFeatureLanguage.g:69:3: ( rule__FeatureLanguage__Group__0 )
            // InternalFeatureLanguage.g:69:4: rule__FeatureLanguage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureLanguageAccess().getGroup()); 

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
    // $ANTLR end "ruleFeatureLanguage"


    // $ANTLR start "entryRuleConcept"
    // InternalFeatureLanguage.g:78:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:79:1: ( ruleConcept EOF )
            // InternalFeatureLanguage.g:80:1: ruleConcept EOF
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
    // InternalFeatureLanguage.g:87:1: ruleConcept : ( ( rule__Concept__Group__0 ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:91:2: ( ( ( rule__Concept__Group__0 ) ) )
            // InternalFeatureLanguage.g:92:2: ( ( rule__Concept__Group__0 ) )
            {
            // InternalFeatureLanguage.g:92:2: ( ( rule__Concept__Group__0 ) )
            // InternalFeatureLanguage.g:93:3: ( rule__Concept__Group__0 )
            {
             before(grammarAccess.getConceptAccess().getGroup()); 
            // InternalFeatureLanguage.g:94:3: ( rule__Concept__Group__0 )
            // InternalFeatureLanguage.g:94:4: rule__Concept__Group__0
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


    // $ANTLR start "entryRuleCharacteristic"
    // InternalFeatureLanguage.g:103:1: entryRuleCharacteristic : ruleCharacteristic EOF ;
    public final void entryRuleCharacteristic() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:104:1: ( ruleCharacteristic EOF )
            // InternalFeatureLanguage.g:105:1: ruleCharacteristic EOF
            {
             before(grammarAccess.getCharacteristicRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristic();

            state._fsp--;

             after(grammarAccess.getCharacteristicRule()); 
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
    // $ANTLR end "entryRuleCharacteristic"


    // $ANTLR start "ruleCharacteristic"
    // InternalFeatureLanguage.g:112:1: ruleCharacteristic : ( ( rule__Characteristic__Group__0 ) ) ;
    public final void ruleCharacteristic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:116:2: ( ( ( rule__Characteristic__Group__0 ) ) )
            // InternalFeatureLanguage.g:117:2: ( ( rule__Characteristic__Group__0 ) )
            {
            // InternalFeatureLanguage.g:117:2: ( ( rule__Characteristic__Group__0 ) )
            // InternalFeatureLanguage.g:118:3: ( rule__Characteristic__Group__0 )
            {
             before(grammarAccess.getCharacteristicAccess().getGroup()); 
            // InternalFeatureLanguage.g:119:3: ( rule__Characteristic__Group__0 )
            // InternalFeatureLanguage.g:119:4: rule__Characteristic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristic"


    // $ANTLR start "entryRuleType"
    // InternalFeatureLanguage.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:129:1: ( ruleType EOF )
            // InternalFeatureLanguage.g:130:1: ruleType EOF
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
    // InternalFeatureLanguage.g:137:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:141:2: ( ( ( rule__Type__NameAssignment ) ) )
            // InternalFeatureLanguage.g:142:2: ( ( rule__Type__NameAssignment ) )
            {
            // InternalFeatureLanguage.g:142:2: ( ( rule__Type__NameAssignment ) )
            // InternalFeatureLanguage.g:143:3: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // InternalFeatureLanguage.g:144:3: ( rule__Type__NameAssignment )
            // InternalFeatureLanguage.g:144:4: rule__Type__NameAssignment
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
    // InternalFeatureLanguage.g:153:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:154:1: ( ruleCondition EOF )
            // InternalFeatureLanguage.g:155:1: ruleCondition EOF
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
    // InternalFeatureLanguage.g:162:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:166:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalFeatureLanguage.g:167:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalFeatureLanguage.g:167:2: ( ( rule__Condition__Group__0 ) )
            // InternalFeatureLanguage.g:168:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalFeatureLanguage.g:169:3: ( rule__Condition__Group__0 )
            // InternalFeatureLanguage.g:169:4: rule__Condition__Group__0
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


    // $ANTLR start "entryRuleConstraint"
    // InternalFeatureLanguage.g:178:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:179:1: ( ruleConstraint EOF )
            // InternalFeatureLanguage.g:180:1: ruleConstraint EOF
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
    // InternalFeatureLanguage.g:187:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:191:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalFeatureLanguage.g:192:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalFeatureLanguage.g:192:2: ( ( rule__Constraint__Group__0 ) )
            // InternalFeatureLanguage.g:193:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalFeatureLanguage.g:194:3: ( rule__Constraint__Group__0 )
            // InternalFeatureLanguage.g:194:4: rule__Constraint__Group__0
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
    // InternalFeatureLanguage.g:203:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:204:1: ( ruleKey EOF )
            // InternalFeatureLanguage.g:205:1: ruleKey EOF
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
    // InternalFeatureLanguage.g:212:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:216:2: ( ( ( rule__Key__Group__0 ) ) )
            // InternalFeatureLanguage.g:217:2: ( ( rule__Key__Group__0 ) )
            {
            // InternalFeatureLanguage.g:217:2: ( ( rule__Key__Group__0 ) )
            // InternalFeatureLanguage.g:218:3: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // InternalFeatureLanguage.g:219:3: ( rule__Key__Group__0 )
            // InternalFeatureLanguage.g:219:4: rule__Key__Group__0
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
    // InternalFeatureLanguage.g:228:1: entryRuleConceptProperty : ruleConceptProperty EOF ;
    public final void entryRuleConceptProperty() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:229:1: ( ruleConceptProperty EOF )
            // InternalFeatureLanguage.g:230:1: ruleConceptProperty EOF
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
    // InternalFeatureLanguage.g:237:1: ruleConceptProperty : ( ( rule__ConceptProperty__Group__0 ) ) ;
    public final void ruleConceptProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:241:2: ( ( ( rule__ConceptProperty__Group__0 ) ) )
            // InternalFeatureLanguage.g:242:2: ( ( rule__ConceptProperty__Group__0 ) )
            {
            // InternalFeatureLanguage.g:242:2: ( ( rule__ConceptProperty__Group__0 ) )
            // InternalFeatureLanguage.g:243:3: ( rule__ConceptProperty__Group__0 )
            {
             before(grammarAccess.getConceptPropertyAccess().getGroup()); 
            // InternalFeatureLanguage.g:244:3: ( rule__ConceptProperty__Group__0 )
            // InternalFeatureLanguage.g:244:4: rule__ConceptProperty__Group__0
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


    // $ANTLR start "entryRuleCharacteristicProperty"
    // InternalFeatureLanguage.g:253:1: entryRuleCharacteristicProperty : ruleCharacteristicProperty EOF ;
    public final void entryRuleCharacteristicProperty() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:254:1: ( ruleCharacteristicProperty EOF )
            // InternalFeatureLanguage.g:255:1: ruleCharacteristicProperty EOF
            {
             before(grammarAccess.getCharacteristicPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacteristicProperty();

            state._fsp--;

             after(grammarAccess.getCharacteristicPropertyRule()); 
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
    // $ANTLR end "entryRuleCharacteristicProperty"


    // $ANTLR start "ruleCharacteristicProperty"
    // InternalFeatureLanguage.g:262:1: ruleCharacteristicProperty : ( ( rule__CharacteristicProperty__Group__0 ) ) ;
    public final void ruleCharacteristicProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:266:2: ( ( ( rule__CharacteristicProperty__Group__0 ) ) )
            // InternalFeatureLanguage.g:267:2: ( ( rule__CharacteristicProperty__Group__0 ) )
            {
            // InternalFeatureLanguage.g:267:2: ( ( rule__CharacteristicProperty__Group__0 ) )
            // InternalFeatureLanguage.g:268:3: ( rule__CharacteristicProperty__Group__0 )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getGroup()); 
            // InternalFeatureLanguage.g:269:3: ( rule__CharacteristicProperty__Group__0 )
            // InternalFeatureLanguage.g:269:4: rule__CharacteristicProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacteristicProperty"


    // $ANTLR start "entryRuleProperty"
    // InternalFeatureLanguage.g:278:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:279:1: ( ruleProperty EOF )
            // InternalFeatureLanguage.g:280:1: ruleProperty EOF
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
    // InternalFeatureLanguage.g:287:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:291:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalFeatureLanguage.g:292:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalFeatureLanguage.g:292:2: ( ( rule__Property__Alternatives ) )
            // InternalFeatureLanguage.g:293:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalFeatureLanguage.g:294:3: ( rule__Property__Alternatives )
            // InternalFeatureLanguage.g:294:4: rule__Property__Alternatives
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
    // InternalFeatureLanguage.g:303:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalFeatureLanguage.g:304:1: ( ruleFeature EOF )
            // InternalFeatureLanguage.g:305:1: ruleFeature EOF
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
    // InternalFeatureLanguage.g:312:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:316:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalFeatureLanguage.g:317:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalFeatureLanguage.g:317:2: ( ( rule__Feature__Group__0 ) )
            // InternalFeatureLanguage.g:318:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalFeatureLanguage.g:319:3: ( rule__Feature__Group__0 )
            // InternalFeatureLanguage.g:319:4: rule__Feature__Group__0
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
    // InternalFeatureLanguage.g:328:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:332:1: ( ( ( rule__Verb__Alternatives ) ) )
            // InternalFeatureLanguage.g:333:2: ( ( rule__Verb__Alternatives ) )
            {
            // InternalFeatureLanguage.g:333:2: ( ( rule__Verb__Alternatives ) )
            // InternalFeatureLanguage.g:334:3: ( rule__Verb__Alternatives )
            {
             before(grammarAccess.getVerbAccess().getAlternatives()); 
            // InternalFeatureLanguage.g:335:3: ( rule__Verb__Alternatives )
            // InternalFeatureLanguage.g:335:4: rule__Verb__Alternatives
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


    // $ANTLR start "ruleKeyType"
    // InternalFeatureLanguage.g:344:1: ruleKeyType : ( ( rule__KeyType__Alternatives ) ) ;
    public final void ruleKeyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:348:1: ( ( ( rule__KeyType__Alternatives ) ) )
            // InternalFeatureLanguage.g:349:2: ( ( rule__KeyType__Alternatives ) )
            {
            // InternalFeatureLanguage.g:349:2: ( ( rule__KeyType__Alternatives ) )
            // InternalFeatureLanguage.g:350:3: ( rule__KeyType__Alternatives )
            {
             before(grammarAccess.getKeyTypeAccess().getAlternatives()); 
            // InternalFeatureLanguage.g:351:3: ( rule__KeyType__Alternatives )
            // InternalFeatureLanguage.g:351:4: rule__KeyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KeyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeyTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKeyType"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFeatureLanguage.g:360:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:364:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalFeatureLanguage.g:365:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalFeatureLanguage.g:365:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalFeatureLanguage.g:366:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalFeatureLanguage.g:367:3: ( rule__ComparisonOperator__Alternatives )
            // InternalFeatureLanguage.g:367:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "rule__Characteristic__Alternatives_2"
    // InternalFeatureLanguage.g:375:1: rule__Characteristic__Alternatives_2 : ( ( ( rule__Characteristic__MultiplicityAssignment_2_0 ) ) | ( ( rule__Characteristic__Group_2_1__0 ) ) );
    public final void rule__Characteristic__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:379:1: ( ( ( rule__Characteristic__MultiplicityAssignment_2_0 ) ) | ( ( rule__Characteristic__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_MULTIPLICITY) ) {
                alt1=1;
            }
            else if ( (LA1_0==29) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFeatureLanguage.g:380:2: ( ( rule__Characteristic__MultiplicityAssignment_2_0 ) )
                    {
                    // InternalFeatureLanguage.g:380:2: ( ( rule__Characteristic__MultiplicityAssignment_2_0 ) )
                    // InternalFeatureLanguage.g:381:3: ( rule__Characteristic__MultiplicityAssignment_2_0 )
                    {
                     before(grammarAccess.getCharacteristicAccess().getMultiplicityAssignment_2_0()); 
                    // InternalFeatureLanguage.g:382:3: ( rule__Characteristic__MultiplicityAssignment_2_0 )
                    // InternalFeatureLanguage.g:382:4: rule__Characteristic__MultiplicityAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Characteristic__MultiplicityAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicAccess().getMultiplicityAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:386:2: ( ( rule__Characteristic__Group_2_1__0 ) )
                    {
                    // InternalFeatureLanguage.g:386:2: ( ( rule__Characteristic__Group_2_1__0 ) )
                    // InternalFeatureLanguage.g:387:3: ( rule__Characteristic__Group_2_1__0 )
                    {
                     before(grammarAccess.getCharacteristicAccess().getGroup_2_1()); 
                    // InternalFeatureLanguage.g:388:3: ( rule__Characteristic__Group_2_1__0 )
                    // InternalFeatureLanguage.g:388:4: rule__Characteristic__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Characteristic__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCharacteristicAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Characteristic__Alternatives_2"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalFeatureLanguage.g:396:1: rule__Property__Alternatives : ( ( ruleConceptProperty ) | ( ruleCharacteristicProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:400:1: ( ( ruleConceptProperty ) | ( ruleCharacteristicProperty ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==32) ) {
                    alt2=1;
                }
                else if ( (LA2_1==31) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFeatureLanguage.g:401:2: ( ruleConceptProperty )
                    {
                    // InternalFeatureLanguage.g:401:2: ( ruleConceptProperty )
                    // InternalFeatureLanguage.g:402:3: ruleConceptProperty
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
                    // InternalFeatureLanguage.g:407:2: ( ruleCharacteristicProperty )
                    {
                    // InternalFeatureLanguage.g:407:2: ( ruleCharacteristicProperty )
                    // InternalFeatureLanguage.g:408:3: ruleCharacteristicProperty
                    {
                     before(grammarAccess.getPropertyAccess().getCharacteristicPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacteristicProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getCharacteristicPropertyParserRuleCall_1()); 

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
    // InternalFeatureLanguage.g:417:1: rule__Verb__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:421:1: ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFeatureLanguage.g:422:2: ( ( 'Add' ) )
                    {
                    // InternalFeatureLanguage.g:422:2: ( ( 'Add' ) )
                    // InternalFeatureLanguage.g:423:3: ( 'Add' )
                    {
                     before(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalFeatureLanguage.g:424:3: ( 'Add' )
                    // InternalFeatureLanguage.g:424:4: 'Add'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:428:2: ( ( 'Remove' ) )
                    {
                    // InternalFeatureLanguage.g:428:2: ( ( 'Remove' ) )
                    // InternalFeatureLanguage.g:429:3: ( 'Remove' )
                    {
                     before(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // InternalFeatureLanguage.g:430:3: ( 'Remove' )
                    // InternalFeatureLanguage.g:430:4: 'Remove'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLanguage.g:434:2: ( ( 'Update' ) )
                    {
                    // InternalFeatureLanguage.g:434:2: ( ( 'Update' ) )
                    // InternalFeatureLanguage.g:435:3: ( 'Update' )
                    {
                     before(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // InternalFeatureLanguage.g:436:3: ( 'Update' )
                    // InternalFeatureLanguage.g:436:4: 'Update'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLanguage.g:440:2: ( ( 'Display' ) )
                    {
                    // InternalFeatureLanguage.g:440:2: ( ( 'Display' ) )
                    // InternalFeatureLanguage.g:441:3: ( 'Display' )
                    {
                     before(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); 
                    // InternalFeatureLanguage.g:442:3: ( 'Display' )
                    // InternalFeatureLanguage.g:442:4: 'Display'
                    {
                    match(input,15,FOLLOW_2); 

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


    // $ANTLR start "rule__KeyType__Alternatives"
    // InternalFeatureLanguage.g:450:1: rule__KeyType__Alternatives : ( ( ( 'unique' ) ) | ( ( 'autounique' ) ) | ( ( 'index' ) ) );
    public final void rule__KeyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:454:1: ( ( ( 'unique' ) ) | ( ( 'autounique' ) ) | ( ( 'index' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFeatureLanguage.g:455:2: ( ( 'unique' ) )
                    {
                    // InternalFeatureLanguage.g:455:2: ( ( 'unique' ) )
                    // InternalFeatureLanguage.g:456:3: ( 'unique' )
                    {
                     before(grammarAccess.getKeyTypeAccess().getUniqueEnumLiteralDeclaration_0()); 
                    // InternalFeatureLanguage.g:457:3: ( 'unique' )
                    // InternalFeatureLanguage.g:457:4: 'unique'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeyTypeAccess().getUniqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:461:2: ( ( 'autounique' ) )
                    {
                    // InternalFeatureLanguage.g:461:2: ( ( 'autounique' ) )
                    // InternalFeatureLanguage.g:462:3: ( 'autounique' )
                    {
                     before(grammarAccess.getKeyTypeAccess().getAutouniqueEnumLiteralDeclaration_1()); 
                    // InternalFeatureLanguage.g:463:3: ( 'autounique' )
                    // InternalFeatureLanguage.g:463:4: 'autounique'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeyTypeAccess().getAutouniqueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLanguage.g:467:2: ( ( 'index' ) )
                    {
                    // InternalFeatureLanguage.g:467:2: ( ( 'index' ) )
                    // InternalFeatureLanguage.g:468:3: ( 'index' )
                    {
                     before(grammarAccess.getKeyTypeAccess().getIndexEnumLiteralDeclaration_2()); 
                    // InternalFeatureLanguage.g:469:3: ( 'index' )
                    // InternalFeatureLanguage.g:469:4: 'index'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getKeyTypeAccess().getIndexEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__KeyType__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalFeatureLanguage.g:477:1: rule__ComparisonOperator__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:481:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '=' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFeatureLanguage.g:482:2: ( ( '>' ) )
                    {
                    // InternalFeatureLanguage.g:482:2: ( ( '>' ) )
                    // InternalFeatureLanguage.g:483:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 
                    // InternalFeatureLanguage.g:484:3: ( '>' )
                    // InternalFeatureLanguage.g:484:4: '>'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:488:2: ( ( '>=' ) )
                    {
                    // InternalFeatureLanguage.g:488:2: ( ( '>=' ) )
                    // InternalFeatureLanguage.g:489:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_1()); 
                    // InternalFeatureLanguage.g:490:3: ( '>=' )
                    // InternalFeatureLanguage.g:490:4: '>='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLanguage.g:494:2: ( ( '=' ) )
                    {
                    // InternalFeatureLanguage.g:494:2: ( ( '=' ) )
                    // InternalFeatureLanguage.g:495:3: ( '=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalFeatureLanguage.g:496:3: ( '=' )
                    // InternalFeatureLanguage.g:496:4: '='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLanguage.g:500:2: ( ( '<=' ) )
                    {
                    // InternalFeatureLanguage.g:500:2: ( ( '<=' ) )
                    // InternalFeatureLanguage.g:501:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_3()); 
                    // InternalFeatureLanguage.g:502:3: ( '<=' )
                    // InternalFeatureLanguage.g:502:4: '<='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFeatureLanguage.g:506:2: ( ( '<' ) )
                    {
                    // InternalFeatureLanguage.g:506:2: ( ( '<' ) )
                    // InternalFeatureLanguage.g:507:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_4()); 
                    // InternalFeatureLanguage.g:508:3: ( '<' )
                    // InternalFeatureLanguage.g:508:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__FeatureLanguage__Group__0"
    // InternalFeatureLanguage.g:516:1: rule__FeatureLanguage__Group__0 : rule__FeatureLanguage__Group__0__Impl rule__FeatureLanguage__Group__1 ;
    public final void rule__FeatureLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:520:1: ( rule__FeatureLanguage__Group__0__Impl rule__FeatureLanguage__Group__1 )
            // InternalFeatureLanguage.g:521:2: rule__FeatureLanguage__Group__0__Impl rule__FeatureLanguage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FeatureLanguage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__1();

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
    // $ANTLR end "rule__FeatureLanguage__Group__0"


    // $ANTLR start "rule__FeatureLanguage__Group__0__Impl"
    // InternalFeatureLanguage.g:528:1: rule__FeatureLanguage__Group__0__Impl : ( ( rule__FeatureLanguage__ConceptsAssignment_0 )* ) ;
    public final void rule__FeatureLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:532:1: ( ( ( rule__FeatureLanguage__ConceptsAssignment_0 )* ) )
            // InternalFeatureLanguage.g:533:1: ( ( rule__FeatureLanguage__ConceptsAssignment_0 )* )
            {
            // InternalFeatureLanguage.g:533:1: ( ( rule__FeatureLanguage__ConceptsAssignment_0 )* )
            // InternalFeatureLanguage.g:534:2: ( rule__FeatureLanguage__ConceptsAssignment_0 )*
            {
             before(grammarAccess.getFeatureLanguageAccess().getConceptsAssignment_0()); 
            // InternalFeatureLanguage.g:535:2: ( rule__FeatureLanguage__ConceptsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFeatureLanguage.g:535:3: rule__FeatureLanguage__ConceptsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FeatureLanguage__ConceptsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFeatureLanguageAccess().getConceptsAssignment_0()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__0__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__1"
    // InternalFeatureLanguage.g:543:1: rule__FeatureLanguage__Group__1 : rule__FeatureLanguage__Group__1__Impl rule__FeatureLanguage__Group__2 ;
    public final void rule__FeatureLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:547:1: ( rule__FeatureLanguage__Group__1__Impl rule__FeatureLanguage__Group__2 )
            // InternalFeatureLanguage.g:548:2: rule__FeatureLanguage__Group__1__Impl rule__FeatureLanguage__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FeatureLanguage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__2();

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
    // $ANTLR end "rule__FeatureLanguage__Group__1"


    // $ANTLR start "rule__FeatureLanguage__Group__1__Impl"
    // InternalFeatureLanguage.g:555:1: rule__FeatureLanguage__Group__1__Impl : ( 'constraints' ) ;
    public final void rule__FeatureLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:559:1: ( ( 'constraints' ) )
            // InternalFeatureLanguage.g:560:1: ( 'constraints' )
            {
            // InternalFeatureLanguage.g:560:1: ( 'constraints' )
            // InternalFeatureLanguage.g:561:2: 'constraints'
            {
             before(grammarAccess.getFeatureLanguageAccess().getConstraintsKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureLanguageAccess().getConstraintsKeyword_1()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__1__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__2"
    // InternalFeatureLanguage.g:570:1: rule__FeatureLanguage__Group__2 : rule__FeatureLanguage__Group__2__Impl rule__FeatureLanguage__Group__3 ;
    public final void rule__FeatureLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:574:1: ( rule__FeatureLanguage__Group__2__Impl rule__FeatureLanguage__Group__3 )
            // InternalFeatureLanguage.g:575:2: rule__FeatureLanguage__Group__2__Impl rule__FeatureLanguage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FeatureLanguage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__3();

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
    // $ANTLR end "rule__FeatureLanguage__Group__2"


    // $ANTLR start "rule__FeatureLanguage__Group__2__Impl"
    // InternalFeatureLanguage.g:582:1: rule__FeatureLanguage__Group__2__Impl : ( ( rule__FeatureLanguage__ConstraintsAssignment_2 )* ) ;
    public final void rule__FeatureLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:586:1: ( ( ( rule__FeatureLanguage__ConstraintsAssignment_2 )* ) )
            // InternalFeatureLanguage.g:587:1: ( ( rule__FeatureLanguage__ConstraintsAssignment_2 )* )
            {
            // InternalFeatureLanguage.g:587:1: ( ( rule__FeatureLanguage__ConstraintsAssignment_2 )* )
            // InternalFeatureLanguage.g:588:2: ( rule__FeatureLanguage__ConstraintsAssignment_2 )*
            {
             before(grammarAccess.getFeatureLanguageAccess().getConstraintsAssignment_2()); 
            // InternalFeatureLanguage.g:589:2: ( rule__FeatureLanguage__ConstraintsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFeatureLanguage.g:589:3: rule__FeatureLanguage__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureLanguage__ConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFeatureLanguageAccess().getConstraintsAssignment_2()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__2__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__3"
    // InternalFeatureLanguage.g:597:1: rule__FeatureLanguage__Group__3 : rule__FeatureLanguage__Group__3__Impl rule__FeatureLanguage__Group__4 ;
    public final void rule__FeatureLanguage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:601:1: ( rule__FeatureLanguage__Group__3__Impl rule__FeatureLanguage__Group__4 )
            // InternalFeatureLanguage.g:602:2: rule__FeatureLanguage__Group__3__Impl rule__FeatureLanguage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FeatureLanguage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__4();

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
    // $ANTLR end "rule__FeatureLanguage__Group__3"


    // $ANTLR start "rule__FeatureLanguage__Group__3__Impl"
    // InternalFeatureLanguage.g:609:1: rule__FeatureLanguage__Group__3__Impl : ( 'keys' ) ;
    public final void rule__FeatureLanguage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:613:1: ( ( 'keys' ) )
            // InternalFeatureLanguage.g:614:1: ( 'keys' )
            {
            // InternalFeatureLanguage.g:614:1: ( 'keys' )
            // InternalFeatureLanguage.g:615:2: 'keys'
            {
             before(grammarAccess.getFeatureLanguageAccess().getKeysKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFeatureLanguageAccess().getKeysKeyword_3()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__3__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__4"
    // InternalFeatureLanguage.g:624:1: rule__FeatureLanguage__Group__4 : rule__FeatureLanguage__Group__4__Impl rule__FeatureLanguage__Group__5 ;
    public final void rule__FeatureLanguage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:628:1: ( rule__FeatureLanguage__Group__4__Impl rule__FeatureLanguage__Group__5 )
            // InternalFeatureLanguage.g:629:2: rule__FeatureLanguage__Group__4__Impl rule__FeatureLanguage__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__FeatureLanguage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__5();

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
    // $ANTLR end "rule__FeatureLanguage__Group__4"


    // $ANTLR start "rule__FeatureLanguage__Group__4__Impl"
    // InternalFeatureLanguage.g:636:1: rule__FeatureLanguage__Group__4__Impl : ( ( rule__FeatureLanguage__KeysAssignment_4 )* ) ;
    public final void rule__FeatureLanguage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:640:1: ( ( ( rule__FeatureLanguage__KeysAssignment_4 )* ) )
            // InternalFeatureLanguage.g:641:1: ( ( rule__FeatureLanguage__KeysAssignment_4 )* )
            {
            // InternalFeatureLanguage.g:641:1: ( ( rule__FeatureLanguage__KeysAssignment_4 )* )
            // InternalFeatureLanguage.g:642:2: ( rule__FeatureLanguage__KeysAssignment_4 )*
            {
             before(grammarAccess.getFeatureLanguageAccess().getKeysAssignment_4()); 
            // InternalFeatureLanguage.g:643:2: ( rule__FeatureLanguage__KeysAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFeatureLanguage.g:643:3: rule__FeatureLanguage__KeysAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureLanguage__KeysAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFeatureLanguageAccess().getKeysAssignment_4()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__4__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__5"
    // InternalFeatureLanguage.g:651:1: rule__FeatureLanguage__Group__5 : rule__FeatureLanguage__Group__5__Impl rule__FeatureLanguage__Group__6 ;
    public final void rule__FeatureLanguage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:655:1: ( rule__FeatureLanguage__Group__5__Impl rule__FeatureLanguage__Group__6 )
            // InternalFeatureLanguage.g:656:2: rule__FeatureLanguage__Group__5__Impl rule__FeatureLanguage__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__FeatureLanguage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__6();

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
    // $ANTLR end "rule__FeatureLanguage__Group__5"


    // $ANTLR start "rule__FeatureLanguage__Group__5__Impl"
    // InternalFeatureLanguage.g:663:1: rule__FeatureLanguage__Group__5__Impl : ( 'properties' ) ;
    public final void rule__FeatureLanguage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:667:1: ( ( 'properties' ) )
            // InternalFeatureLanguage.g:668:1: ( 'properties' )
            {
            // InternalFeatureLanguage.g:668:1: ( 'properties' )
            // InternalFeatureLanguage.g:669:2: 'properties'
            {
             before(grammarAccess.getFeatureLanguageAccess().getPropertiesKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFeatureLanguageAccess().getPropertiesKeyword_5()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__5__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__6"
    // InternalFeatureLanguage.g:678:1: rule__FeatureLanguage__Group__6 : rule__FeatureLanguage__Group__6__Impl rule__FeatureLanguage__Group__7 ;
    public final void rule__FeatureLanguage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:682:1: ( rule__FeatureLanguage__Group__6__Impl rule__FeatureLanguage__Group__7 )
            // InternalFeatureLanguage.g:683:2: rule__FeatureLanguage__Group__6__Impl rule__FeatureLanguage__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__FeatureLanguage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__7();

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
    // $ANTLR end "rule__FeatureLanguage__Group__6"


    // $ANTLR start "rule__FeatureLanguage__Group__6__Impl"
    // InternalFeatureLanguage.g:690:1: rule__FeatureLanguage__Group__6__Impl : ( ( rule__FeatureLanguage__PropertiesAssignment_6 )* ) ;
    public final void rule__FeatureLanguage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:694:1: ( ( ( rule__FeatureLanguage__PropertiesAssignment_6 )* ) )
            // InternalFeatureLanguage.g:695:1: ( ( rule__FeatureLanguage__PropertiesAssignment_6 )* )
            {
            // InternalFeatureLanguage.g:695:1: ( ( rule__FeatureLanguage__PropertiesAssignment_6 )* )
            // InternalFeatureLanguage.g:696:2: ( rule__FeatureLanguage__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getFeatureLanguageAccess().getPropertiesAssignment_6()); 
            // InternalFeatureLanguage.g:697:2: ( rule__FeatureLanguage__PropertiesAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFeatureLanguage.g:697:3: rule__FeatureLanguage__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureLanguage__PropertiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFeatureLanguageAccess().getPropertiesAssignment_6()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__6__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__7"
    // InternalFeatureLanguage.g:705:1: rule__FeatureLanguage__Group__7 : rule__FeatureLanguage__Group__7__Impl rule__FeatureLanguage__Group__8 ;
    public final void rule__FeatureLanguage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:709:1: ( rule__FeatureLanguage__Group__7__Impl rule__FeatureLanguage__Group__8 )
            // InternalFeatureLanguage.g:710:2: rule__FeatureLanguage__Group__7__Impl rule__FeatureLanguage__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FeatureLanguage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__8();

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
    // $ANTLR end "rule__FeatureLanguage__Group__7"


    // $ANTLR start "rule__FeatureLanguage__Group__7__Impl"
    // InternalFeatureLanguage.g:717:1: rule__FeatureLanguage__Group__7__Impl : ( 'features' ) ;
    public final void rule__FeatureLanguage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:721:1: ( ( 'features' ) )
            // InternalFeatureLanguage.g:722:1: ( 'features' )
            {
            // InternalFeatureLanguage.g:722:1: ( 'features' )
            // InternalFeatureLanguage.g:723:2: 'features'
            {
             before(grammarAccess.getFeatureLanguageAccess().getFeaturesKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFeatureLanguageAccess().getFeaturesKeyword_7()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__7__Impl"


    // $ANTLR start "rule__FeatureLanguage__Group__8"
    // InternalFeatureLanguage.g:732:1: rule__FeatureLanguage__Group__8 : rule__FeatureLanguage__Group__8__Impl ;
    public final void rule__FeatureLanguage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:736:1: ( rule__FeatureLanguage__Group__8__Impl )
            // InternalFeatureLanguage.g:737:2: rule__FeatureLanguage__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureLanguage__Group__8__Impl();

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
    // $ANTLR end "rule__FeatureLanguage__Group__8"


    // $ANTLR start "rule__FeatureLanguage__Group__8__Impl"
    // InternalFeatureLanguage.g:743:1: rule__FeatureLanguage__Group__8__Impl : ( ( rule__FeatureLanguage__FeaturesAssignment_8 )* ) ;
    public final void rule__FeatureLanguage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:747:1: ( ( ( rule__FeatureLanguage__FeaturesAssignment_8 )* ) )
            // InternalFeatureLanguage.g:748:1: ( ( rule__FeatureLanguage__FeaturesAssignment_8 )* )
            {
            // InternalFeatureLanguage.g:748:1: ( ( rule__FeatureLanguage__FeaturesAssignment_8 )* )
            // InternalFeatureLanguage.g:749:2: ( rule__FeatureLanguage__FeaturesAssignment_8 )*
            {
             before(grammarAccess.getFeatureLanguageAccess().getFeaturesAssignment_8()); 
            // InternalFeatureLanguage.g:750:2: ( rule__FeatureLanguage__FeaturesAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=12 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFeatureLanguage.g:750:3: rule__FeatureLanguage__FeaturesAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FeatureLanguage__FeaturesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFeatureLanguageAccess().getFeaturesAssignment_8()); 

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
    // $ANTLR end "rule__FeatureLanguage__Group__8__Impl"


    // $ANTLR start "rule__Concept__Group__0"
    // InternalFeatureLanguage.g:759:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:763:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalFeatureLanguage.g:764:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
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
    // InternalFeatureLanguage.g:771:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:775:1: ( ( 'concept' ) )
            // InternalFeatureLanguage.g:776:1: ( 'concept' )
            {
            // InternalFeatureLanguage.g:776:1: ( 'concept' )
            // InternalFeatureLanguage.g:777:2: 'concept'
            {
             before(grammarAccess.getConceptAccess().getConceptKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalFeatureLanguage.g:786:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:790:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalFeatureLanguage.g:791:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
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
    // InternalFeatureLanguage.g:798:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:802:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalFeatureLanguage.g:803:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalFeatureLanguage.g:803:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalFeatureLanguage.g:804:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalFeatureLanguage.g:805:2: ( rule__Concept__NameAssignment_1 )
            // InternalFeatureLanguage.g:805:3: rule__Concept__NameAssignment_1
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
    // InternalFeatureLanguage.g:813:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:817:1: ( rule__Concept__Group__2__Impl )
            // InternalFeatureLanguage.g:818:2: rule__Concept__Group__2__Impl
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
    // InternalFeatureLanguage.g:824:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__CharacteristicsAssignment_2 )* ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:828:1: ( ( ( rule__Concept__CharacteristicsAssignment_2 )* ) )
            // InternalFeatureLanguage.g:829:1: ( ( rule__Concept__CharacteristicsAssignment_2 )* )
            {
            // InternalFeatureLanguage.g:829:1: ( ( rule__Concept__CharacteristicsAssignment_2 )* )
            // InternalFeatureLanguage.g:830:2: ( rule__Concept__CharacteristicsAssignment_2 )*
            {
             before(grammarAccess.getConceptAccess().getCharacteristicsAssignment_2()); 
            // InternalFeatureLanguage.g:831:2: ( rule__Concept__CharacteristicsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFeatureLanguage.g:831:3: rule__Concept__CharacteristicsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Concept__CharacteristicsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConceptAccess().getCharacteristicsAssignment_2()); 

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


    // $ANTLR start "rule__Characteristic__Group__0"
    // InternalFeatureLanguage.g:840:1: rule__Characteristic__Group__0 : rule__Characteristic__Group__0__Impl rule__Characteristic__Group__1 ;
    public final void rule__Characteristic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:844:1: ( rule__Characteristic__Group__0__Impl rule__Characteristic__Group__1 )
            // InternalFeatureLanguage.g:845:2: rule__Characteristic__Group__0__Impl rule__Characteristic__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Characteristic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__1();

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
    // $ANTLR end "rule__Characteristic__Group__0"


    // $ANTLR start "rule__Characteristic__Group__0__Impl"
    // InternalFeatureLanguage.g:852:1: rule__Characteristic__Group__0__Impl : ( ( rule__Characteristic__TypeAssignment_0 ) ) ;
    public final void rule__Characteristic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:856:1: ( ( ( rule__Characteristic__TypeAssignment_0 ) ) )
            // InternalFeatureLanguage.g:857:1: ( ( rule__Characteristic__TypeAssignment_0 ) )
            {
            // InternalFeatureLanguage.g:857:1: ( ( rule__Characteristic__TypeAssignment_0 ) )
            // InternalFeatureLanguage.g:858:2: ( rule__Characteristic__TypeAssignment_0 )
            {
             before(grammarAccess.getCharacteristicAccess().getTypeAssignment_0()); 
            // InternalFeatureLanguage.g:859:2: ( rule__Characteristic__TypeAssignment_0 )
            // InternalFeatureLanguage.g:859:3: rule__Characteristic__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Characteristic__Group__0__Impl"


    // $ANTLR start "rule__Characteristic__Group__1"
    // InternalFeatureLanguage.g:867:1: rule__Characteristic__Group__1 : rule__Characteristic__Group__1__Impl rule__Characteristic__Group__2 ;
    public final void rule__Characteristic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:871:1: ( rule__Characteristic__Group__1__Impl rule__Characteristic__Group__2 )
            // InternalFeatureLanguage.g:872:2: rule__Characteristic__Group__1__Impl rule__Characteristic__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Characteristic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__2();

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
    // $ANTLR end "rule__Characteristic__Group__1"


    // $ANTLR start "rule__Characteristic__Group__1__Impl"
    // InternalFeatureLanguage.g:879:1: rule__Characteristic__Group__1__Impl : ( ( rule__Characteristic__NameAssignment_1 ) ) ;
    public final void rule__Characteristic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:883:1: ( ( ( rule__Characteristic__NameAssignment_1 ) ) )
            // InternalFeatureLanguage.g:884:1: ( ( rule__Characteristic__NameAssignment_1 ) )
            {
            // InternalFeatureLanguage.g:884:1: ( ( rule__Characteristic__NameAssignment_1 ) )
            // InternalFeatureLanguage.g:885:2: ( rule__Characteristic__NameAssignment_1 )
            {
             before(grammarAccess.getCharacteristicAccess().getNameAssignment_1()); 
            // InternalFeatureLanguage.g:886:2: ( rule__Characteristic__NameAssignment_1 )
            // InternalFeatureLanguage.g:886:3: rule__Characteristic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Characteristic__Group__1__Impl"


    // $ANTLR start "rule__Characteristic__Group__2"
    // InternalFeatureLanguage.g:894:1: rule__Characteristic__Group__2 : rule__Characteristic__Group__2__Impl ;
    public final void rule__Characteristic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:898:1: ( rule__Characteristic__Group__2__Impl )
            // InternalFeatureLanguage.g:899:2: rule__Characteristic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__Group__2__Impl();

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
    // $ANTLR end "rule__Characteristic__Group__2"


    // $ANTLR start "rule__Characteristic__Group__2__Impl"
    // InternalFeatureLanguage.g:905:1: rule__Characteristic__Group__2__Impl : ( ( rule__Characteristic__Alternatives_2 )? ) ;
    public final void rule__Characteristic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:909:1: ( ( ( rule__Characteristic__Alternatives_2 )? ) )
            // InternalFeatureLanguage.g:910:1: ( ( rule__Characteristic__Alternatives_2 )? )
            {
            // InternalFeatureLanguage.g:910:1: ( ( rule__Characteristic__Alternatives_2 )? )
            // InternalFeatureLanguage.g:911:2: ( rule__Characteristic__Alternatives_2 )?
            {
             before(grammarAccess.getCharacteristicAccess().getAlternatives_2()); 
            // InternalFeatureLanguage.g:912:2: ( rule__Characteristic__Alternatives_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_MULTIPLICITY||LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureLanguage.g:912:3: rule__Characteristic__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Characteristic__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacteristicAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Characteristic__Group__2__Impl"


    // $ANTLR start "rule__Characteristic__Group_2_1__0"
    // InternalFeatureLanguage.g:921:1: rule__Characteristic__Group_2_1__0 : rule__Characteristic__Group_2_1__0__Impl rule__Characteristic__Group_2_1__1 ;
    public final void rule__Characteristic__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:925:1: ( rule__Characteristic__Group_2_1__0__Impl rule__Characteristic__Group_2_1__1 )
            // InternalFeatureLanguage.g:926:2: rule__Characteristic__Group_2_1__0__Impl rule__Characteristic__Group_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Characteristic__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group_2_1__1();

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
    // $ANTLR end "rule__Characteristic__Group_2_1__0"


    // $ANTLR start "rule__Characteristic__Group_2_1__0__Impl"
    // InternalFeatureLanguage.g:933:1: rule__Characteristic__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Characteristic__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:937:1: ( ( '{' ) )
            // InternalFeatureLanguage.g:938:1: ( '{' )
            {
            // InternalFeatureLanguage.g:938:1: ( '{' )
            // InternalFeatureLanguage.g:939:2: '{'
            {
             before(grammarAccess.getCharacteristicAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getLeftCurlyBracketKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Characteristic__Group_2_1__0__Impl"


    // $ANTLR start "rule__Characteristic__Group_2_1__1"
    // InternalFeatureLanguage.g:948:1: rule__Characteristic__Group_2_1__1 : rule__Characteristic__Group_2_1__1__Impl rule__Characteristic__Group_2_1__2 ;
    public final void rule__Characteristic__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:952:1: ( rule__Characteristic__Group_2_1__1__Impl rule__Characteristic__Group_2_1__2 )
            // InternalFeatureLanguage.g:953:2: rule__Characteristic__Group_2_1__1__Impl rule__Characteristic__Group_2_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Characteristic__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Characteristic__Group_2_1__2();

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
    // $ANTLR end "rule__Characteristic__Group_2_1__1"


    // $ANTLR start "rule__Characteristic__Group_2_1__1__Impl"
    // InternalFeatureLanguage.g:960:1: rule__Characteristic__Group_2_1__1__Impl : ( ( rule__Characteristic__LiteralsAssignment_2_1_1 )* ) ;
    public final void rule__Characteristic__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:964:1: ( ( ( rule__Characteristic__LiteralsAssignment_2_1_1 )* ) )
            // InternalFeatureLanguage.g:965:1: ( ( rule__Characteristic__LiteralsAssignment_2_1_1 )* )
            {
            // InternalFeatureLanguage.g:965:1: ( ( rule__Characteristic__LiteralsAssignment_2_1_1 )* )
            // InternalFeatureLanguage.g:966:2: ( rule__Characteristic__LiteralsAssignment_2_1_1 )*
            {
             before(grammarAccess.getCharacteristicAccess().getLiteralsAssignment_2_1_1()); 
            // InternalFeatureLanguage.g:967:2: ( rule__Characteristic__LiteralsAssignment_2_1_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFeatureLanguage.g:967:3: rule__Characteristic__LiteralsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Characteristic__LiteralsAssignment_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCharacteristicAccess().getLiteralsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Characteristic__Group_2_1__1__Impl"


    // $ANTLR start "rule__Characteristic__Group_2_1__2"
    // InternalFeatureLanguage.g:975:1: rule__Characteristic__Group_2_1__2 : rule__Characteristic__Group_2_1__2__Impl ;
    public final void rule__Characteristic__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:979:1: ( rule__Characteristic__Group_2_1__2__Impl )
            // InternalFeatureLanguage.g:980:2: rule__Characteristic__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Characteristic__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Characteristic__Group_2_1__2"


    // $ANTLR start "rule__Characteristic__Group_2_1__2__Impl"
    // InternalFeatureLanguage.g:986:1: rule__Characteristic__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Characteristic__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:990:1: ( ( '}' ) )
            // InternalFeatureLanguage.g:991:1: ( '}' )
            {
            // InternalFeatureLanguage.g:991:1: ( '}' )
            // InternalFeatureLanguage.g:992:2: '}'
            {
             before(grammarAccess.getCharacteristicAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getRightCurlyBracketKeyword_2_1_2()); 

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
    // $ANTLR end "rule__Characteristic__Group_2_1__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalFeatureLanguage.g:1002:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1006:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalFeatureLanguage.g:1007:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalFeatureLanguage.g:1014:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__OperatorAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1018:1: ( ( ( rule__Condition__OperatorAssignment_0 ) ) )
            // InternalFeatureLanguage.g:1019:1: ( ( rule__Condition__OperatorAssignment_0 ) )
            {
            // InternalFeatureLanguage.g:1019:1: ( ( rule__Condition__OperatorAssignment_0 ) )
            // InternalFeatureLanguage.g:1020:2: ( rule__Condition__OperatorAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_0()); 
            // InternalFeatureLanguage.g:1021:2: ( rule__Condition__OperatorAssignment_0 )
            // InternalFeatureLanguage.g:1021:3: rule__Condition__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_0()); 

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
    // InternalFeatureLanguage.g:1029:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1033:1: ( rule__Condition__Group__1__Impl )
            // InternalFeatureLanguage.g:1034:2: rule__Condition__Group__1__Impl
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
    // InternalFeatureLanguage.g:1040:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ValueAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1044:1: ( ( ( rule__Condition__ValueAssignment_1 ) ) )
            // InternalFeatureLanguage.g:1045:1: ( ( rule__Condition__ValueAssignment_1 ) )
            {
            // InternalFeatureLanguage.g:1045:1: ( ( rule__Condition__ValueAssignment_1 ) )
            // InternalFeatureLanguage.g:1046:2: ( rule__Condition__ValueAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1()); 
            // InternalFeatureLanguage.g:1047:2: ( rule__Condition__ValueAssignment_1 )
            // InternalFeatureLanguage.g:1047:3: rule__Condition__ValueAssignment_1
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
    // InternalFeatureLanguage.g:1056:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1060:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalFeatureLanguage.g:1061:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureLanguage.g:1068:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__ConceptAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1072:1: ( ( ( rule__Constraint__ConceptAssignment_0 ) ) )
            // InternalFeatureLanguage.g:1073:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            {
            // InternalFeatureLanguage.g:1073:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            // InternalFeatureLanguage.g:1074:2: ( rule__Constraint__ConceptAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getConceptAssignment_0()); 
            // InternalFeatureLanguage.g:1075:2: ( rule__Constraint__ConceptAssignment_0 )
            // InternalFeatureLanguage.g:1075:3: rule__Constraint__ConceptAssignment_0
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
    // InternalFeatureLanguage.g:1083:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1087:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalFeatureLanguage.g:1088:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureLanguage.g:1095:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Group_1__0 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1099:1: ( ( ( rule__Constraint__Group_1__0 ) ) )
            // InternalFeatureLanguage.g:1100:1: ( ( rule__Constraint__Group_1__0 ) )
            {
            // InternalFeatureLanguage.g:1100:1: ( ( rule__Constraint__Group_1__0 ) )
            // InternalFeatureLanguage.g:1101:2: ( rule__Constraint__Group_1__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_1()); 
            // InternalFeatureLanguage.g:1102:2: ( rule__Constraint__Group_1__0 )
            // InternalFeatureLanguage.g:1102:3: rule__Constraint__Group_1__0
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
    // InternalFeatureLanguage.g:1110:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1114:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalFeatureLanguage.g:1115:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalFeatureLanguage.g:1122:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ConditionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1126:1: ( ( ( rule__Constraint__ConditionAssignment_2 ) ) )
            // InternalFeatureLanguage.g:1127:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            {
            // InternalFeatureLanguage.g:1127:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            // InternalFeatureLanguage.g:1128:2: ( rule__Constraint__ConditionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getConditionAssignment_2()); 
            // InternalFeatureLanguage.g:1129:2: ( rule__Constraint__ConditionAssignment_2 )
            // InternalFeatureLanguage.g:1129:3: rule__Constraint__ConditionAssignment_2
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
    // InternalFeatureLanguage.g:1137:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1141:1: ( rule__Constraint__Group__3__Impl )
            // InternalFeatureLanguage.g:1142:2: rule__Constraint__Group__3__Impl
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
    // InternalFeatureLanguage.g:1148:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__ErrorMsgAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1152:1: ( ( ( rule__Constraint__ErrorMsgAssignment_3 ) ) )
            // InternalFeatureLanguage.g:1153:1: ( ( rule__Constraint__ErrorMsgAssignment_3 ) )
            {
            // InternalFeatureLanguage.g:1153:1: ( ( rule__Constraint__ErrorMsgAssignment_3 ) )
            // InternalFeatureLanguage.g:1154:2: ( rule__Constraint__ErrorMsgAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getErrorMsgAssignment_3()); 
            // InternalFeatureLanguage.g:1155:2: ( rule__Constraint__ErrorMsgAssignment_3 )
            // InternalFeatureLanguage.g:1155:3: rule__Constraint__ErrorMsgAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ErrorMsgAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getErrorMsgAssignment_3()); 

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
    // InternalFeatureLanguage.g:1164:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1168:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalFeatureLanguage.g:1169:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
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
    // InternalFeatureLanguage.g:1176:1: rule__Constraint__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1180:1: ( ( '.' ) )
            // InternalFeatureLanguage.g:1181:1: ( '.' )
            {
            // InternalFeatureLanguage.g:1181:1: ( '.' )
            // InternalFeatureLanguage.g:1182:2: '.'
            {
             before(grammarAccess.getConstraintAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFeatureLanguage.g:1191:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1195:1: ( rule__Constraint__Group_1__1__Impl )
            // InternalFeatureLanguage.g:1196:2: rule__Constraint__Group_1__1__Impl
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
    // InternalFeatureLanguage.g:1202:1: rule__Constraint__Group_1__1__Impl : ( ( rule__Constraint__CharacteristicAssignment_1_1 ) ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1206:1: ( ( ( rule__Constraint__CharacteristicAssignment_1_1 ) ) )
            // InternalFeatureLanguage.g:1207:1: ( ( rule__Constraint__CharacteristicAssignment_1_1 ) )
            {
            // InternalFeatureLanguage.g:1207:1: ( ( rule__Constraint__CharacteristicAssignment_1_1 ) )
            // InternalFeatureLanguage.g:1208:2: ( rule__Constraint__CharacteristicAssignment_1_1 )
            {
             before(grammarAccess.getConstraintAccess().getCharacteristicAssignment_1_1()); 
            // InternalFeatureLanguage.g:1209:2: ( rule__Constraint__CharacteristicAssignment_1_1 )
            // InternalFeatureLanguage.g:1209:3: rule__Constraint__CharacteristicAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__CharacteristicAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getCharacteristicAssignment_1_1()); 

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
    // InternalFeatureLanguage.g:1218:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1222:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalFeatureLanguage.g:1223:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureLanguage.g:1230:1: rule__Key__Group__0__Impl : ( ( rule__Key__ConceptAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1234:1: ( ( ( rule__Key__ConceptAssignment_0 ) ) )
            // InternalFeatureLanguage.g:1235:1: ( ( rule__Key__ConceptAssignment_0 ) )
            {
            // InternalFeatureLanguage.g:1235:1: ( ( rule__Key__ConceptAssignment_0 ) )
            // InternalFeatureLanguage.g:1236:2: ( rule__Key__ConceptAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getConceptAssignment_0()); 
            // InternalFeatureLanguage.g:1237:2: ( rule__Key__ConceptAssignment_0 )
            // InternalFeatureLanguage.g:1237:3: rule__Key__ConceptAssignment_0
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
    // InternalFeatureLanguage.g:1245:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1249:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // InternalFeatureLanguage.g:1250:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureLanguage.g:1257:1: rule__Key__Group__1__Impl : ( ( rule__Key__Group_1__0 ) ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1261:1: ( ( ( rule__Key__Group_1__0 ) ) )
            // InternalFeatureLanguage.g:1262:1: ( ( rule__Key__Group_1__0 ) )
            {
            // InternalFeatureLanguage.g:1262:1: ( ( rule__Key__Group_1__0 ) )
            // InternalFeatureLanguage.g:1263:2: ( rule__Key__Group_1__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup_1()); 
            // InternalFeatureLanguage.g:1264:2: ( rule__Key__Group_1__0 )
            // InternalFeatureLanguage.g:1264:3: rule__Key__Group_1__0
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
    // InternalFeatureLanguage.g:1272:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1276:1: ( rule__Key__Group__2__Impl )
            // InternalFeatureLanguage.g:1277:2: rule__Key__Group__2__Impl
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
    // InternalFeatureLanguage.g:1283:1: rule__Key__Group__2__Impl : ( ( rule__Key__KeyTypeAssignment_2 ) ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1287:1: ( ( ( rule__Key__KeyTypeAssignment_2 ) ) )
            // InternalFeatureLanguage.g:1288:1: ( ( rule__Key__KeyTypeAssignment_2 ) )
            {
            // InternalFeatureLanguage.g:1288:1: ( ( rule__Key__KeyTypeAssignment_2 ) )
            // InternalFeatureLanguage.g:1289:2: ( rule__Key__KeyTypeAssignment_2 )
            {
             before(grammarAccess.getKeyAccess().getKeyTypeAssignment_2()); 
            // InternalFeatureLanguage.g:1290:2: ( rule__Key__KeyTypeAssignment_2 )
            // InternalFeatureLanguage.g:1290:3: rule__Key__KeyTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Key__KeyTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getKeyTypeAssignment_2()); 

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
    // InternalFeatureLanguage.g:1299:1: rule__Key__Group_1__0 : rule__Key__Group_1__0__Impl rule__Key__Group_1__1 ;
    public final void rule__Key__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1303:1: ( rule__Key__Group_1__0__Impl rule__Key__Group_1__1 )
            // InternalFeatureLanguage.g:1304:2: rule__Key__Group_1__0__Impl rule__Key__Group_1__1
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
    // InternalFeatureLanguage.g:1311:1: rule__Key__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Key__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1315:1: ( ( '.' ) )
            // InternalFeatureLanguage.g:1316:1: ( '.' )
            {
            // InternalFeatureLanguage.g:1316:1: ( '.' )
            // InternalFeatureLanguage.g:1317:2: '.'
            {
             before(grammarAccess.getKeyAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFeatureLanguage.g:1326:1: rule__Key__Group_1__1 : rule__Key__Group_1__1__Impl ;
    public final void rule__Key__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1330:1: ( rule__Key__Group_1__1__Impl )
            // InternalFeatureLanguage.g:1331:2: rule__Key__Group_1__1__Impl
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
    // InternalFeatureLanguage.g:1337:1: rule__Key__Group_1__1__Impl : ( ( rule__Key__CharacteristicAssignment_1_1 ) ) ;
    public final void rule__Key__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1341:1: ( ( ( rule__Key__CharacteristicAssignment_1_1 ) ) )
            // InternalFeatureLanguage.g:1342:1: ( ( rule__Key__CharacteristicAssignment_1_1 ) )
            {
            // InternalFeatureLanguage.g:1342:1: ( ( rule__Key__CharacteristicAssignment_1_1 ) )
            // InternalFeatureLanguage.g:1343:2: ( rule__Key__CharacteristicAssignment_1_1 )
            {
             before(grammarAccess.getKeyAccess().getCharacteristicAssignment_1_1()); 
            // InternalFeatureLanguage.g:1344:2: ( rule__Key__CharacteristicAssignment_1_1 )
            // InternalFeatureLanguage.g:1344:3: rule__Key__CharacteristicAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Key__CharacteristicAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getCharacteristicAssignment_1_1()); 

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
    // InternalFeatureLanguage.g:1353:1: rule__ConceptProperty__Group__0 : rule__ConceptProperty__Group__0__Impl rule__ConceptProperty__Group__1 ;
    public final void rule__ConceptProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1357:1: ( rule__ConceptProperty__Group__0__Impl rule__ConceptProperty__Group__1 )
            // InternalFeatureLanguage.g:1358:2: rule__ConceptProperty__Group__0__Impl rule__ConceptProperty__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureLanguage.g:1365:1: rule__ConceptProperty__Group__0__Impl : ( ( rule__ConceptProperty__ConceptAssignment_0 ) ) ;
    public final void rule__ConceptProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1369:1: ( ( ( rule__ConceptProperty__ConceptAssignment_0 ) ) )
            // InternalFeatureLanguage.g:1370:1: ( ( rule__ConceptProperty__ConceptAssignment_0 ) )
            {
            // InternalFeatureLanguage.g:1370:1: ( ( rule__ConceptProperty__ConceptAssignment_0 ) )
            // InternalFeatureLanguage.g:1371:2: ( rule__ConceptProperty__ConceptAssignment_0 )
            {
             before(grammarAccess.getConceptPropertyAccess().getConceptAssignment_0()); 
            // InternalFeatureLanguage.g:1372:2: ( rule__ConceptProperty__ConceptAssignment_0 )
            // InternalFeatureLanguage.g:1372:3: rule__ConceptProperty__ConceptAssignment_0
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
    // InternalFeatureLanguage.g:1380:1: rule__ConceptProperty__Group__1 : rule__ConceptProperty__Group__1__Impl ;
    public final void rule__ConceptProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1384:1: ( rule__ConceptProperty__Group__1__Impl )
            // InternalFeatureLanguage.g:1385:2: rule__ConceptProperty__Group__1__Impl
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
    // InternalFeatureLanguage.g:1391:1: rule__ConceptProperty__Group__1__Impl : ( ( rule__ConceptProperty__IsRootAssignment_1 ) ) ;
    public final void rule__ConceptProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1395:1: ( ( ( rule__ConceptProperty__IsRootAssignment_1 ) ) )
            // InternalFeatureLanguage.g:1396:1: ( ( rule__ConceptProperty__IsRootAssignment_1 ) )
            {
            // InternalFeatureLanguage.g:1396:1: ( ( rule__ConceptProperty__IsRootAssignment_1 ) )
            // InternalFeatureLanguage.g:1397:2: ( rule__ConceptProperty__IsRootAssignment_1 )
            {
             before(grammarAccess.getConceptPropertyAccess().getIsRootAssignment_1()); 
            // InternalFeatureLanguage.g:1398:2: ( rule__ConceptProperty__IsRootAssignment_1 )
            // InternalFeatureLanguage.g:1398:3: rule__ConceptProperty__IsRootAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConceptProperty__IsRootAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptPropertyAccess().getIsRootAssignment_1()); 

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


    // $ANTLR start "rule__CharacteristicProperty__Group__0"
    // InternalFeatureLanguage.g:1407:1: rule__CharacteristicProperty__Group__0 : rule__CharacteristicProperty__Group__0__Impl rule__CharacteristicProperty__Group__1 ;
    public final void rule__CharacteristicProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1411:1: ( rule__CharacteristicProperty__Group__0__Impl rule__CharacteristicProperty__Group__1 )
            // InternalFeatureLanguage.g:1412:2: rule__CharacteristicProperty__Group__0__Impl rule__CharacteristicProperty__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__CharacteristicProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__Group__1();

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
    // $ANTLR end "rule__CharacteristicProperty__Group__0"


    // $ANTLR start "rule__CharacteristicProperty__Group__0__Impl"
    // InternalFeatureLanguage.g:1419:1: rule__CharacteristicProperty__Group__0__Impl : ( ( rule__CharacteristicProperty__ConceptAssignment_0 ) ) ;
    public final void rule__CharacteristicProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1423:1: ( ( ( rule__CharacteristicProperty__ConceptAssignment_0 ) ) )
            // InternalFeatureLanguage.g:1424:1: ( ( rule__CharacteristicProperty__ConceptAssignment_0 ) )
            {
            // InternalFeatureLanguage.g:1424:1: ( ( rule__CharacteristicProperty__ConceptAssignment_0 ) )
            // InternalFeatureLanguage.g:1425:2: ( rule__CharacteristicProperty__ConceptAssignment_0 )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getConceptAssignment_0()); 
            // InternalFeatureLanguage.g:1426:2: ( rule__CharacteristicProperty__ConceptAssignment_0 )
            // InternalFeatureLanguage.g:1426:3: rule__CharacteristicProperty__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__ConceptAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicPropertyAccess().getConceptAssignment_0()); 

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
    // $ANTLR end "rule__CharacteristicProperty__Group__0__Impl"


    // $ANTLR start "rule__CharacteristicProperty__Group__1"
    // InternalFeatureLanguage.g:1434:1: rule__CharacteristicProperty__Group__1 : rule__CharacteristicProperty__Group__1__Impl rule__CharacteristicProperty__Group__2 ;
    public final void rule__CharacteristicProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1438:1: ( rule__CharacteristicProperty__Group__1__Impl rule__CharacteristicProperty__Group__2 )
            // InternalFeatureLanguage.g:1439:2: rule__CharacteristicProperty__Group__1__Impl rule__CharacteristicProperty__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CharacteristicProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__Group__2();

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
    // $ANTLR end "rule__CharacteristicProperty__Group__1"


    // $ANTLR start "rule__CharacteristicProperty__Group__1__Impl"
    // InternalFeatureLanguage.g:1446:1: rule__CharacteristicProperty__Group__1__Impl : ( ( rule__CharacteristicProperty__Group_1__0 ) ) ;
    public final void rule__CharacteristicProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1450:1: ( ( ( rule__CharacteristicProperty__Group_1__0 ) ) )
            // InternalFeatureLanguage.g:1451:1: ( ( rule__CharacteristicProperty__Group_1__0 ) )
            {
            // InternalFeatureLanguage.g:1451:1: ( ( rule__CharacteristicProperty__Group_1__0 ) )
            // InternalFeatureLanguage.g:1452:2: ( rule__CharacteristicProperty__Group_1__0 )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getGroup_1()); 
            // InternalFeatureLanguage.g:1453:2: ( rule__CharacteristicProperty__Group_1__0 )
            // InternalFeatureLanguage.g:1453:3: rule__CharacteristicProperty__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicPropertyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CharacteristicProperty__Group__1__Impl"


    // $ANTLR start "rule__CharacteristicProperty__Group__2"
    // InternalFeatureLanguage.g:1461:1: rule__CharacteristicProperty__Group__2 : rule__CharacteristicProperty__Group__2__Impl ;
    public final void rule__CharacteristicProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1465:1: ( rule__CharacteristicProperty__Group__2__Impl )
            // InternalFeatureLanguage.g:1466:2: rule__CharacteristicProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__Group__2__Impl();

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
    // $ANTLR end "rule__CharacteristicProperty__Group__2"


    // $ANTLR start "rule__CharacteristicProperty__Group__2__Impl"
    // InternalFeatureLanguage.g:1472:1: rule__CharacteristicProperty__Group__2__Impl : ( ( rule__CharacteristicProperty__IsLazyAssignment_2 ) ) ;
    public final void rule__CharacteristicProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1476:1: ( ( ( rule__CharacteristicProperty__IsLazyAssignment_2 ) ) )
            // InternalFeatureLanguage.g:1477:1: ( ( rule__CharacteristicProperty__IsLazyAssignment_2 ) )
            {
            // InternalFeatureLanguage.g:1477:1: ( ( rule__CharacteristicProperty__IsLazyAssignment_2 ) )
            // InternalFeatureLanguage.g:1478:2: ( rule__CharacteristicProperty__IsLazyAssignment_2 )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getIsLazyAssignment_2()); 
            // InternalFeatureLanguage.g:1479:2: ( rule__CharacteristicProperty__IsLazyAssignment_2 )
            // InternalFeatureLanguage.g:1479:3: rule__CharacteristicProperty__IsLazyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__IsLazyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicPropertyAccess().getIsLazyAssignment_2()); 

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
    // $ANTLR end "rule__CharacteristicProperty__Group__2__Impl"


    // $ANTLR start "rule__CharacteristicProperty__Group_1__0"
    // InternalFeatureLanguage.g:1488:1: rule__CharacteristicProperty__Group_1__0 : rule__CharacteristicProperty__Group_1__0__Impl rule__CharacteristicProperty__Group_1__1 ;
    public final void rule__CharacteristicProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1492:1: ( rule__CharacteristicProperty__Group_1__0__Impl rule__CharacteristicProperty__Group_1__1 )
            // InternalFeatureLanguage.g:1493:2: rule__CharacteristicProperty__Group_1__0__Impl rule__CharacteristicProperty__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__CharacteristicProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__Group_1__1();

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
    // $ANTLR end "rule__CharacteristicProperty__Group_1__0"


    // $ANTLR start "rule__CharacteristicProperty__Group_1__0__Impl"
    // InternalFeatureLanguage.g:1500:1: rule__CharacteristicProperty__Group_1__0__Impl : ( '.' ) ;
    public final void rule__CharacteristicProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1504:1: ( ( '.' ) )
            // InternalFeatureLanguage.g:1505:1: ( '.' )
            {
            // InternalFeatureLanguage.g:1505:1: ( '.' )
            // InternalFeatureLanguage.g:1506:2: '.'
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCharacteristicPropertyAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__CharacteristicProperty__Group_1__0__Impl"


    // $ANTLR start "rule__CharacteristicProperty__Group_1__1"
    // InternalFeatureLanguage.g:1515:1: rule__CharacteristicProperty__Group_1__1 : rule__CharacteristicProperty__Group_1__1__Impl ;
    public final void rule__CharacteristicProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1519:1: ( rule__CharacteristicProperty__Group_1__1__Impl )
            // InternalFeatureLanguage.g:1520:2: rule__CharacteristicProperty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__Group_1__1__Impl();

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
    // $ANTLR end "rule__CharacteristicProperty__Group_1__1"


    // $ANTLR start "rule__CharacteristicProperty__Group_1__1__Impl"
    // InternalFeatureLanguage.g:1526:1: rule__CharacteristicProperty__Group_1__1__Impl : ( ( rule__CharacteristicProperty__CharacteristicAssignment_1_1 ) ) ;
    public final void rule__CharacteristicProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1530:1: ( ( ( rule__CharacteristicProperty__CharacteristicAssignment_1_1 ) ) )
            // InternalFeatureLanguage.g:1531:1: ( ( rule__CharacteristicProperty__CharacteristicAssignment_1_1 ) )
            {
            // InternalFeatureLanguage.g:1531:1: ( ( rule__CharacteristicProperty__CharacteristicAssignment_1_1 ) )
            // InternalFeatureLanguage.g:1532:2: ( rule__CharacteristicProperty__CharacteristicAssignment_1_1 )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getCharacteristicAssignment_1_1()); 
            // InternalFeatureLanguage.g:1533:2: ( rule__CharacteristicProperty__CharacteristicAssignment_1_1 )
            // InternalFeatureLanguage.g:1533:3: rule__CharacteristicProperty__CharacteristicAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacteristicProperty__CharacteristicAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacteristicPropertyAccess().getCharacteristicAssignment_1_1()); 

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
    // $ANTLR end "rule__CharacteristicProperty__Group_1__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalFeatureLanguage.g:1542:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1546:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalFeatureLanguage.g:1547:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalFeatureLanguage.g:1554:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__VerbAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1558:1: ( ( ( rule__Feature__VerbAssignment_0 ) ) )
            // InternalFeatureLanguage.g:1559:1: ( ( rule__Feature__VerbAssignment_0 ) )
            {
            // InternalFeatureLanguage.g:1559:1: ( ( rule__Feature__VerbAssignment_0 ) )
            // InternalFeatureLanguage.g:1560:2: ( rule__Feature__VerbAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getVerbAssignment_0()); 
            // InternalFeatureLanguage.g:1561:2: ( rule__Feature__VerbAssignment_0 )
            // InternalFeatureLanguage.g:1561:3: rule__Feature__VerbAssignment_0
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
    // InternalFeatureLanguage.g:1569:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1573:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalFeatureLanguage.g:1574:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureLanguage.g:1581:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConceptAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1585:1: ( ( ( rule__Feature__ConceptAssignment_1 ) ) )
            // InternalFeatureLanguage.g:1586:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            {
            // InternalFeatureLanguage.g:1586:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            // InternalFeatureLanguage.g:1587:2: ( rule__Feature__ConceptAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getConceptAssignment_1()); 
            // InternalFeatureLanguage.g:1588:2: ( rule__Feature__ConceptAssignment_1 )
            // InternalFeatureLanguage.g:1588:3: rule__Feature__ConceptAssignment_1
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
    // InternalFeatureLanguage.g:1596:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1600:1: ( rule__Feature__Group__2__Impl )
            // InternalFeatureLanguage.g:1601:2: rule__Feature__Group__2__Impl
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
    // InternalFeatureLanguage.g:1607:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1611:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalFeatureLanguage.g:1612:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalFeatureLanguage.g:1612:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalFeatureLanguage.g:1613:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalFeatureLanguage.g:1614:2: ( rule__Feature__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureLanguage.g:1614:3: rule__Feature__Group_2__0
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
    // InternalFeatureLanguage.g:1623:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1627:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalFeatureLanguage.g:1628:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
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
    // InternalFeatureLanguage.g:1635:1: rule__Feature__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1639:1: ( ( '.' ) )
            // InternalFeatureLanguage.g:1640:1: ( '.' )
            {
            // InternalFeatureLanguage.g:1640:1: ( '.' )
            // InternalFeatureLanguage.g:1641:2: '.'
            {
             before(grammarAccess.getFeatureAccess().getFullStopKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalFeatureLanguage.g:1650:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1654:1: ( rule__Feature__Group_2__1__Impl )
            // InternalFeatureLanguage.g:1655:2: rule__Feature__Group_2__1__Impl
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
    // InternalFeatureLanguage.g:1661:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__CharacteristicAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1665:1: ( ( ( rule__Feature__CharacteristicAssignment_2_1 ) ) )
            // InternalFeatureLanguage.g:1666:1: ( ( rule__Feature__CharacteristicAssignment_2_1 ) )
            {
            // InternalFeatureLanguage.g:1666:1: ( ( rule__Feature__CharacteristicAssignment_2_1 ) )
            // InternalFeatureLanguage.g:1667:2: ( rule__Feature__CharacteristicAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getCharacteristicAssignment_2_1()); 
            // InternalFeatureLanguage.g:1668:2: ( rule__Feature__CharacteristicAssignment_2_1 )
            // InternalFeatureLanguage.g:1668:3: rule__Feature__CharacteristicAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__CharacteristicAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getCharacteristicAssignment_2_1()); 

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


    // $ANTLR start "rule__FeatureLanguage__ConceptsAssignment_0"
    // InternalFeatureLanguage.g:1677:1: rule__FeatureLanguage__ConceptsAssignment_0 : ( ruleConcept ) ;
    public final void rule__FeatureLanguage__ConceptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1681:1: ( ( ruleConcept ) )
            // InternalFeatureLanguage.g:1682:2: ( ruleConcept )
            {
            // InternalFeatureLanguage.g:1682:2: ( ruleConcept )
            // InternalFeatureLanguage.g:1683:3: ruleConcept
            {
             before(grammarAccess.getFeatureLanguageAccess().getConceptsConceptParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getFeatureLanguageAccess().getConceptsConceptParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FeatureLanguage__ConceptsAssignment_0"


    // $ANTLR start "rule__FeatureLanguage__ConstraintsAssignment_2"
    // InternalFeatureLanguage.g:1692:1: rule__FeatureLanguage__ConstraintsAssignment_2 : ( ruleConstraint ) ;
    public final void rule__FeatureLanguage__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1696:1: ( ( ruleConstraint ) )
            // InternalFeatureLanguage.g:1697:2: ( ruleConstraint )
            {
            // InternalFeatureLanguage.g:1697:2: ( ruleConstraint )
            // InternalFeatureLanguage.g:1698:3: ruleConstraint
            {
             before(grammarAccess.getFeatureLanguageAccess().getConstraintsConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureLanguageAccess().getConstraintsConstraintParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FeatureLanguage__ConstraintsAssignment_2"


    // $ANTLR start "rule__FeatureLanguage__KeysAssignment_4"
    // InternalFeatureLanguage.g:1707:1: rule__FeatureLanguage__KeysAssignment_4 : ( ruleKey ) ;
    public final void rule__FeatureLanguage__KeysAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1711:1: ( ( ruleKey ) )
            // InternalFeatureLanguage.g:1712:2: ( ruleKey )
            {
            // InternalFeatureLanguage.g:1712:2: ( ruleKey )
            // InternalFeatureLanguage.g:1713:3: ruleKey
            {
             before(grammarAccess.getFeatureLanguageAccess().getKeysKeyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getFeatureLanguageAccess().getKeysKeyParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FeatureLanguage__KeysAssignment_4"


    // $ANTLR start "rule__FeatureLanguage__PropertiesAssignment_6"
    // InternalFeatureLanguage.g:1722:1: rule__FeatureLanguage__PropertiesAssignment_6 : ( ruleProperty ) ;
    public final void rule__FeatureLanguage__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1726:1: ( ( ruleProperty ) )
            // InternalFeatureLanguage.g:1727:2: ( ruleProperty )
            {
            // InternalFeatureLanguage.g:1727:2: ( ruleProperty )
            // InternalFeatureLanguage.g:1728:3: ruleProperty
            {
             before(grammarAccess.getFeatureLanguageAccess().getPropertiesPropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getFeatureLanguageAccess().getPropertiesPropertyParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FeatureLanguage__PropertiesAssignment_6"


    // $ANTLR start "rule__FeatureLanguage__FeaturesAssignment_8"
    // InternalFeatureLanguage.g:1737:1: rule__FeatureLanguage__FeaturesAssignment_8 : ( ruleFeature ) ;
    public final void rule__FeatureLanguage__FeaturesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1741:1: ( ( ruleFeature ) )
            // InternalFeatureLanguage.g:1742:2: ( ruleFeature )
            {
            // InternalFeatureLanguage.g:1742:2: ( ruleFeature )
            // InternalFeatureLanguage.g:1743:3: ruleFeature
            {
             before(grammarAccess.getFeatureLanguageAccess().getFeaturesFeatureParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureLanguageAccess().getFeaturesFeatureParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__FeatureLanguage__FeaturesAssignment_8"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalFeatureLanguage.g:1752:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1756:1: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:1757:2: ( RULE_ID )
            {
            // InternalFeatureLanguage.g:1757:2: ( RULE_ID )
            // InternalFeatureLanguage.g:1758:3: RULE_ID
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


    // $ANTLR start "rule__Concept__CharacteristicsAssignment_2"
    // InternalFeatureLanguage.g:1767:1: rule__Concept__CharacteristicsAssignment_2 : ( ruleCharacteristic ) ;
    public final void rule__Concept__CharacteristicsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1771:1: ( ( ruleCharacteristic ) )
            // InternalFeatureLanguage.g:1772:2: ( ruleCharacteristic )
            {
            // InternalFeatureLanguage.g:1772:2: ( ruleCharacteristic )
            // InternalFeatureLanguage.g:1773:3: ruleCharacteristic
            {
             before(grammarAccess.getConceptAccess().getCharacteristicsCharacteristicParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacteristic();

            state._fsp--;

             after(grammarAccess.getConceptAccess().getCharacteristicsCharacteristicParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Concept__CharacteristicsAssignment_2"


    // $ANTLR start "rule__Characteristic__TypeAssignment_0"
    // InternalFeatureLanguage.g:1782:1: rule__Characteristic__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Characteristic__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1786:1: ( ( ruleType ) )
            // InternalFeatureLanguage.g:1787:2: ( ruleType )
            {
            // InternalFeatureLanguage.g:1787:2: ( ruleType )
            // InternalFeatureLanguage.g:1788:3: ruleType
            {
             before(grammarAccess.getCharacteristicAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getCharacteristicAccess().getTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Characteristic__TypeAssignment_0"


    // $ANTLR start "rule__Characteristic__NameAssignment_1"
    // InternalFeatureLanguage.g:1797:1: rule__Characteristic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Characteristic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1801:1: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:1802:2: ( RULE_ID )
            {
            // InternalFeatureLanguage.g:1802:2: ( RULE_ID )
            // InternalFeatureLanguage.g:1803:3: RULE_ID
            {
             before(grammarAccess.getCharacteristicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Characteristic__NameAssignment_1"


    // $ANTLR start "rule__Characteristic__MultiplicityAssignment_2_0"
    // InternalFeatureLanguage.g:1812:1: rule__Characteristic__MultiplicityAssignment_2_0 : ( RULE_MULTIPLICITY ) ;
    public final void rule__Characteristic__MultiplicityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1816:1: ( ( RULE_MULTIPLICITY ) )
            // InternalFeatureLanguage.g:1817:2: ( RULE_MULTIPLICITY )
            {
            // InternalFeatureLanguage.g:1817:2: ( RULE_MULTIPLICITY )
            // InternalFeatureLanguage.g:1818:3: RULE_MULTIPLICITY
            {
             before(grammarAccess.getCharacteristicAccess().getMultiplicityMULTIPLICITYTerminalRuleCall_2_0_0()); 
            match(input,RULE_MULTIPLICITY,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getMultiplicityMULTIPLICITYTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Characteristic__MultiplicityAssignment_2_0"


    // $ANTLR start "rule__Characteristic__LiteralsAssignment_2_1_1"
    // InternalFeatureLanguage.g:1827:1: rule__Characteristic__LiteralsAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__Characteristic__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1831:1: ( ( RULE_STRING ) )
            // InternalFeatureLanguage.g:1832:2: ( RULE_STRING )
            {
            // InternalFeatureLanguage.g:1832:2: ( RULE_STRING )
            // InternalFeatureLanguage.g:1833:3: RULE_STRING
            {
             before(grammarAccess.getCharacteristicAccess().getLiteralsSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacteristicAccess().getLiteralsSTRINGTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Characteristic__LiteralsAssignment_2_1_1"


    // $ANTLR start "rule__Type__NameAssignment"
    // InternalFeatureLanguage.g:1842:1: rule__Type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1846:1: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:1847:2: ( RULE_ID )
            {
            // InternalFeatureLanguage.g:1847:2: ( RULE_ID )
            // InternalFeatureLanguage.g:1848:3: RULE_ID
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


    // $ANTLR start "rule__Condition__OperatorAssignment_0"
    // InternalFeatureLanguage.g:1857:1: rule__Condition__OperatorAssignment_0 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1861:1: ( ( ruleComparisonOperator ) )
            // InternalFeatureLanguage.g:1862:2: ( ruleComparisonOperator )
            {
            // InternalFeatureLanguage.g:1862:2: ( ruleComparisonOperator )
            // InternalFeatureLanguage.g:1863:3: ruleComparisonOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Condition__OperatorAssignment_0"


    // $ANTLR start "rule__Condition__ValueAssignment_1"
    // InternalFeatureLanguage.g:1872:1: rule__Condition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1876:1: ( ( RULE_INT ) )
            // InternalFeatureLanguage.g:1877:2: ( RULE_INT )
            {
            // InternalFeatureLanguage.g:1877:2: ( RULE_INT )
            // InternalFeatureLanguage.g:1878:3: RULE_INT
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
    // InternalFeatureLanguage.g:1887:1: rule__Constraint__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1891:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:1892:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:1892:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:1893:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0()); 
            // InternalFeatureLanguage.g:1894:3: ( RULE_ID )
            // InternalFeatureLanguage.g:1895:4: RULE_ID
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


    // $ANTLR start "rule__Constraint__CharacteristicAssignment_1_1"
    // InternalFeatureLanguage.g:1906:1: rule__Constraint__CharacteristicAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__CharacteristicAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1910:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:1911:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:1911:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:1912:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getCharacteristicCharacteristicCrossReference_1_1_0()); 
            // InternalFeatureLanguage.g:1913:3: ( RULE_ID )
            // InternalFeatureLanguage.g:1914:4: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getCharacteristicCharacteristicIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getCharacteristicCharacteristicIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getCharacteristicCharacteristicCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Constraint__CharacteristicAssignment_1_1"


    // $ANTLR start "rule__Constraint__ConditionAssignment_2"
    // InternalFeatureLanguage.g:1925:1: rule__Constraint__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Constraint__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1929:1: ( ( ruleCondition ) )
            // InternalFeatureLanguage.g:1930:2: ( ruleCondition )
            {
            // InternalFeatureLanguage.g:1930:2: ( ruleCondition )
            // InternalFeatureLanguage.g:1931:3: ruleCondition
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


    // $ANTLR start "rule__Constraint__ErrorMsgAssignment_3"
    // InternalFeatureLanguage.g:1940:1: rule__Constraint__ErrorMsgAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Constraint__ErrorMsgAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1944:1: ( ( RULE_STRING ) )
            // InternalFeatureLanguage.g:1945:2: ( RULE_STRING )
            {
            // InternalFeatureLanguage.g:1945:2: ( RULE_STRING )
            // InternalFeatureLanguage.g:1946:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getErrorMsgSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getErrorMsgSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constraint__ErrorMsgAssignment_3"


    // $ANTLR start "rule__Key__ConceptAssignment_0"
    // InternalFeatureLanguage.g:1955:1: rule__Key__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Key__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1959:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:1960:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:1960:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:1961:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalFeatureLanguage.g:1962:3: ( RULE_ID )
            // InternalFeatureLanguage.g:1963:4: RULE_ID
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


    // $ANTLR start "rule__Key__CharacteristicAssignment_1_1"
    // InternalFeatureLanguage.g:1974:1: rule__Key__CharacteristicAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Key__CharacteristicAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1978:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:1979:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:1979:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:1980:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getCharacteristicCharacteristicCrossReference_1_1_0()); 
            // InternalFeatureLanguage.g:1981:3: ( RULE_ID )
            // InternalFeatureLanguage.g:1982:4: RULE_ID
            {
             before(grammarAccess.getKeyAccess().getCharacteristicCharacteristicIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getCharacteristicCharacteristicIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getKeyAccess().getCharacteristicCharacteristicCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Key__CharacteristicAssignment_1_1"


    // $ANTLR start "rule__Key__KeyTypeAssignment_2"
    // InternalFeatureLanguage.g:1993:1: rule__Key__KeyTypeAssignment_2 : ( ruleKeyType ) ;
    public final void rule__Key__KeyTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:1997:1: ( ( ruleKeyType ) )
            // InternalFeatureLanguage.g:1998:2: ( ruleKeyType )
            {
            // InternalFeatureLanguage.g:1998:2: ( ruleKeyType )
            // InternalFeatureLanguage.g:1999:3: ruleKeyType
            {
             before(grammarAccess.getKeyAccess().getKeyTypeKeyTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyType();

            state._fsp--;

             after(grammarAccess.getKeyAccess().getKeyTypeKeyTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Key__KeyTypeAssignment_2"


    // $ANTLR start "rule__ConceptProperty__ConceptAssignment_0"
    // InternalFeatureLanguage.g:2008:1: rule__ConceptProperty__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ConceptProperty__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2012:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:2013:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:2013:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:2014:3: ( RULE_ID )
            {
             before(grammarAccess.getConceptPropertyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalFeatureLanguage.g:2015:3: ( RULE_ID )
            // InternalFeatureLanguage.g:2016:4: RULE_ID
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


    // $ANTLR start "rule__ConceptProperty__IsRootAssignment_1"
    // InternalFeatureLanguage.g:2027:1: rule__ConceptProperty__IsRootAssignment_1 : ( ( 'root' ) ) ;
    public final void rule__ConceptProperty__IsRootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2031:1: ( ( ( 'root' ) ) )
            // InternalFeatureLanguage.g:2032:2: ( ( 'root' ) )
            {
            // InternalFeatureLanguage.g:2032:2: ( ( 'root' ) )
            // InternalFeatureLanguage.g:2033:3: ( 'root' )
            {
             before(grammarAccess.getConceptPropertyAccess().getIsRootRootKeyword_1_0()); 
            // InternalFeatureLanguage.g:2034:3: ( 'root' )
            // InternalFeatureLanguage.g:2035:4: 'root'
            {
             before(grammarAccess.getConceptPropertyAccess().getIsRootRootKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConceptPropertyAccess().getIsRootRootKeyword_1_0()); 

            }

             after(grammarAccess.getConceptPropertyAccess().getIsRootRootKeyword_1_0()); 

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
    // $ANTLR end "rule__ConceptProperty__IsRootAssignment_1"


    // $ANTLR start "rule__CharacteristicProperty__ConceptAssignment_0"
    // InternalFeatureLanguage.g:2046:1: rule__CharacteristicProperty__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicProperty__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2050:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:2051:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:2051:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:2052:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalFeatureLanguage.g:2053:3: ( RULE_ID )
            // InternalFeatureLanguage.g:2054:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicPropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCharacteristicPropertyAccess().getConceptConceptCrossReference_0_0()); 

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
    // $ANTLR end "rule__CharacteristicProperty__ConceptAssignment_0"


    // $ANTLR start "rule__CharacteristicProperty__CharacteristicAssignment_1_1"
    // InternalFeatureLanguage.g:2065:1: rule__CharacteristicProperty__CharacteristicAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__CharacteristicProperty__CharacteristicAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2069:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:2070:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:2070:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:2071:3: ( RULE_ID )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getCharacteristicCharacteristicCrossReference_1_1_0()); 
            // InternalFeatureLanguage.g:2072:3: ( RULE_ID )
            // InternalFeatureLanguage.g:2073:4: RULE_ID
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getCharacteristicCharacteristicIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacteristicPropertyAccess().getCharacteristicCharacteristicIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getCharacteristicPropertyAccess().getCharacteristicCharacteristicCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__CharacteristicProperty__CharacteristicAssignment_1_1"


    // $ANTLR start "rule__CharacteristicProperty__IsLazyAssignment_2"
    // InternalFeatureLanguage.g:2084:1: rule__CharacteristicProperty__IsLazyAssignment_2 : ( ( 'lazy' ) ) ;
    public final void rule__CharacteristicProperty__IsLazyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2088:1: ( ( ( 'lazy' ) ) )
            // InternalFeatureLanguage.g:2089:2: ( ( 'lazy' ) )
            {
            // InternalFeatureLanguage.g:2089:2: ( ( 'lazy' ) )
            // InternalFeatureLanguage.g:2090:3: ( 'lazy' )
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getIsLazyLazyKeyword_2_0()); 
            // InternalFeatureLanguage.g:2091:3: ( 'lazy' )
            // InternalFeatureLanguage.g:2092:4: 'lazy'
            {
             before(grammarAccess.getCharacteristicPropertyAccess().getIsLazyLazyKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCharacteristicPropertyAccess().getIsLazyLazyKeyword_2_0()); 

            }

             after(grammarAccess.getCharacteristicPropertyAccess().getIsLazyLazyKeyword_2_0()); 

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
    // $ANTLR end "rule__CharacteristicProperty__IsLazyAssignment_2"


    // $ANTLR start "rule__Feature__VerbAssignment_0"
    // InternalFeatureLanguage.g:2103:1: rule__Feature__VerbAssignment_0 : ( ruleVerb ) ;
    public final void rule__Feature__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2107:1: ( ( ruleVerb ) )
            // InternalFeatureLanguage.g:2108:2: ( ruleVerb )
            {
            // InternalFeatureLanguage.g:2108:2: ( ruleVerb )
            // InternalFeatureLanguage.g:2109:3: ruleVerb
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
    // InternalFeatureLanguage.g:2118:1: rule__Feature__ConceptAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2122:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:2123:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:2123:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:2124:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); 
            // InternalFeatureLanguage.g:2125:3: ( RULE_ID )
            // InternalFeatureLanguage.g:2126:4: RULE_ID
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


    // $ANTLR start "rule__Feature__CharacteristicAssignment_2_1"
    // InternalFeatureLanguage.g:2137:1: rule__Feature__CharacteristicAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__CharacteristicAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureLanguage.g:2141:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureLanguage.g:2142:2: ( ( RULE_ID ) )
            {
            // InternalFeatureLanguage.g:2142:2: ( ( RULE_ID ) )
            // InternalFeatureLanguage.g:2143:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getCharacteristicCharacteristicCrossReference_2_1_0()); 
            // InternalFeatureLanguage.g:2144:3: ( RULE_ID )
            // InternalFeatureLanguage.g:2145:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getCharacteristicCharacteristicIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getCharacteristicCharacteristicIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getCharacteristicCharacteristicCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Feature__CharacteristicAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});

}