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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MULTIPLICITY", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'>='", "'='", "'<='", "'<'", "'unique'", "'autounique'", "'Add'", "'Remove'", "'Update'", "'Display'", "'constraints'", "'keys'", "'properties'", "'features'", "'concept'", "'.'", "'lazy'"
    };
    public static final int RULE_STRING=7;
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
    public static final int RULE_MULTIPLICITY=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


    // $ANTLR start "entryRuleConstraint"
    // InternalMyFeatureList.g:178:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:179:1: ( ruleConstraint EOF )
            // InternalMyFeatureList.g:180:1: ruleConstraint EOF
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
    // InternalMyFeatureList.g:187:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:191:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalMyFeatureList.g:192:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalMyFeatureList.g:192:2: ( ( rule__Constraint__Group__0 ) )
            // InternalMyFeatureList.g:193:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalMyFeatureList.g:194:3: ( rule__Constraint__Group__0 )
            // InternalMyFeatureList.g:194:4: rule__Constraint__Group__0
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
    // InternalMyFeatureList.g:203:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:204:1: ( ruleKey EOF )
            // InternalMyFeatureList.g:205:1: ruleKey EOF
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
    // InternalMyFeatureList.g:212:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:216:2: ( ( ( rule__Key__Group__0 ) ) )
            // InternalMyFeatureList.g:217:2: ( ( rule__Key__Group__0 ) )
            {
            // InternalMyFeatureList.g:217:2: ( ( rule__Key__Group__0 ) )
            // InternalMyFeatureList.g:218:3: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // InternalMyFeatureList.g:219:3: ( rule__Key__Group__0 )
            // InternalMyFeatureList.g:219:4: rule__Key__Group__0
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


    // $ANTLR start "entryRuleProperty"
    // InternalMyFeatureList.g:228:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:229:1: ( ruleProperty EOF )
            // InternalMyFeatureList.g:230:1: ruleProperty EOF
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
    // InternalMyFeatureList.g:237:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:241:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalMyFeatureList.g:242:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalMyFeatureList.g:242:2: ( ( rule__Property__Group__0 ) )
            // InternalMyFeatureList.g:243:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalMyFeatureList.g:244:3: ( rule__Property__Group__0 )
            // InternalMyFeatureList.g:244:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

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
    // InternalMyFeatureList.g:253:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:254:1: ( ruleFeature EOF )
            // InternalMyFeatureList.g:255:1: ruleFeature EOF
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
    // InternalMyFeatureList.g:262:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:266:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalMyFeatureList.g:267:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalMyFeatureList.g:267:2: ( ( rule__Feature__Group__0 ) )
            // InternalMyFeatureList.g:268:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalMyFeatureList.g:269:3: ( rule__Feature__Group__0 )
            // InternalMyFeatureList.g:269:4: rule__Feature__Group__0
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
    // InternalMyFeatureList.g:278:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:282:1: ( ( ( rule__Verb__Alternatives ) ) )
            // InternalMyFeatureList.g:283:2: ( ( rule__Verb__Alternatives ) )
            {
            // InternalMyFeatureList.g:283:2: ( ( rule__Verb__Alternatives ) )
            // InternalMyFeatureList.g:284:3: ( rule__Verb__Alternatives )
            {
             before(grammarAccess.getVerbAccess().getAlternatives()); 
            // InternalMyFeatureList.g:285:3: ( rule__Verb__Alternatives )
            // InternalMyFeatureList.g:285:4: rule__Verb__Alternatives
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
    // InternalMyFeatureList.g:293:1: rule__Condition__Alternatives_0 : ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) );
    public final void rule__Condition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:297:1: ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) )
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
                    // InternalMyFeatureList.g:298:2: ( '>' )
                    {
                    // InternalMyFeatureList.g:298:2: ( '>' )
                    // InternalMyFeatureList.g:299:3: '>'
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:304:2: ( '>=' )
                    {
                    // InternalMyFeatureList.g:304:2: ( '>=' )
                    // InternalMyFeatureList.g:305:3: '>='
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:310:2: ( '=' )
                    {
                    // InternalMyFeatureList.g:310:2: ( '=' )
                    // InternalMyFeatureList.g:311:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:316:2: ( '<=' )
                    {
                    // InternalMyFeatureList.g:316:2: ( '<=' )
                    // InternalMyFeatureList.g:317:3: '<='
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFeatureList.g:322:2: ( '<' )
                    {
                    // InternalMyFeatureList.g:322:2: ( '<' )
                    // InternalMyFeatureList.g:323:3: '<'
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
    // InternalMyFeatureList.g:332:1: rule__Key__Alternatives_2 : ( ( 'unique' ) | ( 'autounique' ) );
    public final void rule__Key__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:336:1: ( ( 'unique' ) | ( 'autounique' ) )
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
                    // InternalMyFeatureList.g:337:2: ( 'unique' )
                    {
                    // InternalMyFeatureList.g:337:2: ( 'unique' )
                    // InternalMyFeatureList.g:338:3: 'unique'
                    {
                     before(grammarAccess.getKeyAccess().getUniqueKeyword_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getKeyAccess().getUniqueKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:343:2: ( 'autounique' )
                    {
                    // InternalMyFeatureList.g:343:2: ( 'autounique' )
                    // InternalMyFeatureList.g:344:3: 'autounique'
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


    // $ANTLR start "rule__Verb__Alternatives"
    // InternalMyFeatureList.g:353:1: rule__Verb__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:357:1: ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
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
                    // InternalMyFeatureList.g:358:2: ( ( 'Add' ) )
                    {
                    // InternalMyFeatureList.g:358:2: ( ( 'Add' ) )
                    // InternalMyFeatureList.g:359:3: ( 'Add' )
                    {
                     before(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalMyFeatureList.g:360:3: ( 'Add' )
                    // InternalMyFeatureList.g:360:4: 'Add'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:364:2: ( ( 'Remove' ) )
                    {
                    // InternalMyFeatureList.g:364:2: ( ( 'Remove' ) )
                    // InternalMyFeatureList.g:365:3: ( 'Remove' )
                    {
                     before(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // InternalMyFeatureList.g:366:3: ( 'Remove' )
                    // InternalMyFeatureList.g:366:4: 'Remove'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:370:2: ( ( 'Update' ) )
                    {
                    // InternalMyFeatureList.g:370:2: ( ( 'Update' ) )
                    // InternalMyFeatureList.g:371:3: ( 'Update' )
                    {
                     before(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // InternalMyFeatureList.g:372:3: ( 'Update' )
                    // InternalMyFeatureList.g:372:4: 'Update'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:376:2: ( ( 'Display' ) )
                    {
                    // InternalMyFeatureList.g:376:2: ( ( 'Display' ) )
                    // InternalMyFeatureList.g:377:3: ( 'Display' )
                    {
                     before(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); 
                    // InternalMyFeatureList.g:378:3: ( 'Display' )
                    // InternalMyFeatureList.g:378:4: 'Display'
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
    // InternalMyFeatureList.g:386:1: rule__FeatureList__Group__0 : rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 ;
    public final void rule__FeatureList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:390:1: ( rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 )
            // InternalMyFeatureList.g:391:2: rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1
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
    // InternalMyFeatureList.g:398:1: rule__FeatureList__Group__0__Impl : ( ( rule__FeatureList__ConceptsAssignment_0 )* ) ;
    public final void rule__FeatureList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:402:1: ( ( ( rule__FeatureList__ConceptsAssignment_0 )* ) )
            // InternalMyFeatureList.g:403:1: ( ( rule__FeatureList__ConceptsAssignment_0 )* )
            {
            // InternalMyFeatureList.g:403:1: ( ( rule__FeatureList__ConceptsAssignment_0 )* )
            // InternalMyFeatureList.g:404:2: ( rule__FeatureList__ConceptsAssignment_0 )*
            {
             before(grammarAccess.getFeatureListAccess().getConceptsAssignment_0()); 
            // InternalMyFeatureList.g:405:2: ( rule__FeatureList__ConceptsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyFeatureList.g:405:3: rule__FeatureList__ConceptsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FeatureList__ConceptsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMyFeatureList.g:413:1: rule__FeatureList__Group__1 : rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 ;
    public final void rule__FeatureList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:417:1: ( rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 )
            // InternalMyFeatureList.g:418:2: rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2
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
    // InternalMyFeatureList.g:425:1: rule__FeatureList__Group__1__Impl : ( 'constraints' ) ;
    public final void rule__FeatureList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:429:1: ( ( 'constraints' ) )
            // InternalMyFeatureList.g:430:1: ( 'constraints' )
            {
            // InternalMyFeatureList.g:430:1: ( 'constraints' )
            // InternalMyFeatureList.g:431:2: 'constraints'
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
    // InternalMyFeatureList.g:440:1: rule__FeatureList__Group__2 : rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3 ;
    public final void rule__FeatureList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:444:1: ( rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3 )
            // InternalMyFeatureList.g:445:2: rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3
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
    // InternalMyFeatureList.g:452:1: rule__FeatureList__Group__2__Impl : ( ( rule__FeatureList__ConstraintsAssignment_2 )* ) ;
    public final void rule__FeatureList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:456:1: ( ( ( rule__FeatureList__ConstraintsAssignment_2 )* ) )
            // InternalMyFeatureList.g:457:1: ( ( rule__FeatureList__ConstraintsAssignment_2 )* )
            {
            // InternalMyFeatureList.g:457:1: ( ( rule__FeatureList__ConstraintsAssignment_2 )* )
            // InternalMyFeatureList.g:458:2: ( rule__FeatureList__ConstraintsAssignment_2 )*
            {
             before(grammarAccess.getFeatureListAccess().getConstraintsAssignment_2()); 
            // InternalMyFeatureList.g:459:2: ( rule__FeatureList__ConstraintsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFeatureList.g:459:3: rule__FeatureList__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureList__ConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMyFeatureList.g:467:1: rule__FeatureList__Group__3 : rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 ;
    public final void rule__FeatureList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:471:1: ( rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 )
            // InternalMyFeatureList.g:472:2: rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4
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
    // InternalMyFeatureList.g:479:1: rule__FeatureList__Group__3__Impl : ( 'keys' ) ;
    public final void rule__FeatureList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:483:1: ( ( 'keys' ) )
            // InternalMyFeatureList.g:484:1: ( 'keys' )
            {
            // InternalMyFeatureList.g:484:1: ( 'keys' )
            // InternalMyFeatureList.g:485:2: 'keys'
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
    // InternalMyFeatureList.g:494:1: rule__FeatureList__Group__4 : rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 ;
    public final void rule__FeatureList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:498:1: ( rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 )
            // InternalMyFeatureList.g:499:2: rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5
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
    // InternalMyFeatureList.g:506:1: rule__FeatureList__Group__4__Impl : ( ( rule__FeatureList__KeysAssignment_4 )* ) ;
    public final void rule__FeatureList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:510:1: ( ( ( rule__FeatureList__KeysAssignment_4 )* ) )
            // InternalMyFeatureList.g:511:1: ( ( rule__FeatureList__KeysAssignment_4 )* )
            {
            // InternalMyFeatureList.g:511:1: ( ( rule__FeatureList__KeysAssignment_4 )* )
            // InternalMyFeatureList.g:512:2: ( rule__FeatureList__KeysAssignment_4 )*
            {
             before(grammarAccess.getFeatureListAccess().getKeysAssignment_4()); 
            // InternalMyFeatureList.g:513:2: ( rule__FeatureList__KeysAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFeatureList.g:513:3: rule__FeatureList__KeysAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureList__KeysAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyFeatureList.g:521:1: rule__FeatureList__Group__5 : rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 ;
    public final void rule__FeatureList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:525:1: ( rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 )
            // InternalMyFeatureList.g:526:2: rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6
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
    // InternalMyFeatureList.g:533:1: rule__FeatureList__Group__5__Impl : ( 'properties' ) ;
    public final void rule__FeatureList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:537:1: ( ( 'properties' ) )
            // InternalMyFeatureList.g:538:1: ( 'properties' )
            {
            // InternalMyFeatureList.g:538:1: ( 'properties' )
            // InternalMyFeatureList.g:539:2: 'properties'
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
    // InternalMyFeatureList.g:548:1: rule__FeatureList__Group__6 : rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7 ;
    public final void rule__FeatureList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:552:1: ( rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7 )
            // InternalMyFeatureList.g:553:2: rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7
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
    // InternalMyFeatureList.g:560:1: rule__FeatureList__Group__6__Impl : ( ( rule__FeatureList__PropertiesAssignment_6 )* ) ;
    public final void rule__FeatureList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:564:1: ( ( ( rule__FeatureList__PropertiesAssignment_6 )* ) )
            // InternalMyFeatureList.g:565:1: ( ( rule__FeatureList__PropertiesAssignment_6 )* )
            {
            // InternalMyFeatureList.g:565:1: ( ( rule__FeatureList__PropertiesAssignment_6 )* )
            // InternalMyFeatureList.g:566:2: ( rule__FeatureList__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getFeatureListAccess().getPropertiesAssignment_6()); 
            // InternalMyFeatureList.g:567:2: ( rule__FeatureList__PropertiesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyFeatureList.g:567:3: rule__FeatureList__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureList__PropertiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyFeatureList.g:575:1: rule__FeatureList__Group__7 : rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8 ;
    public final void rule__FeatureList__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:579:1: ( rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8 )
            // InternalMyFeatureList.g:580:2: rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8
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
    // InternalMyFeatureList.g:587:1: rule__FeatureList__Group__7__Impl : ( 'features' ) ;
    public final void rule__FeatureList__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:591:1: ( ( 'features' ) )
            // InternalMyFeatureList.g:592:1: ( 'features' )
            {
            // InternalMyFeatureList.g:592:1: ( 'features' )
            // InternalMyFeatureList.g:593:2: 'features'
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
    // InternalMyFeatureList.g:602:1: rule__FeatureList__Group__8 : rule__FeatureList__Group__8__Impl ;
    public final void rule__FeatureList__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:606:1: ( rule__FeatureList__Group__8__Impl )
            // InternalMyFeatureList.g:607:2: rule__FeatureList__Group__8__Impl
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
    // InternalMyFeatureList.g:613:1: rule__FeatureList__Group__8__Impl : ( ( rule__FeatureList__FeaturesAssignment_8 )* ) ;
    public final void rule__FeatureList__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:617:1: ( ( ( rule__FeatureList__FeaturesAssignment_8 )* ) )
            // InternalMyFeatureList.g:618:1: ( ( rule__FeatureList__FeaturesAssignment_8 )* )
            {
            // InternalMyFeatureList.g:618:1: ( ( rule__FeatureList__FeaturesAssignment_8 )* )
            // InternalMyFeatureList.g:619:2: ( rule__FeatureList__FeaturesAssignment_8 )*
            {
             before(grammarAccess.getFeatureListAccess().getFeaturesAssignment_8()); 
            // InternalMyFeatureList.g:620:2: ( rule__FeatureList__FeaturesAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyFeatureList.g:620:3: rule__FeatureList__FeaturesAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FeatureList__FeaturesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyFeatureList.g:629:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:633:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalMyFeatureList.g:634:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
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
    // InternalMyFeatureList.g:641:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:645:1: ( ( 'concept' ) )
            // InternalMyFeatureList.g:646:1: ( 'concept' )
            {
            // InternalMyFeatureList.g:646:1: ( 'concept' )
            // InternalMyFeatureList.g:647:2: 'concept'
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
    // InternalMyFeatureList.g:656:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:660:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalMyFeatureList.g:661:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
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
    // InternalMyFeatureList.g:668:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:672:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:673:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:673:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalMyFeatureList.g:674:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:675:2: ( rule__Concept__NameAssignment_1 )
            // InternalMyFeatureList.g:675:3: rule__Concept__NameAssignment_1
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
    // InternalMyFeatureList.g:683:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:687:1: ( rule__Concept__Group__2__Impl )
            // InternalMyFeatureList.g:688:2: rule__Concept__Group__2__Impl
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
    // InternalMyFeatureList.g:694:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__AttributesAssignment_2 )* ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:698:1: ( ( ( rule__Concept__AttributesAssignment_2 )* ) )
            // InternalMyFeatureList.g:699:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            {
            // InternalMyFeatureList.g:699:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            // InternalMyFeatureList.g:700:2: ( rule__Concept__AttributesAssignment_2 )*
            {
             before(grammarAccess.getConceptAccess().getAttributesAssignment_2()); 
            // InternalMyFeatureList.g:701:2: ( rule__Concept__AttributesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyFeatureList.g:701:3: rule__Concept__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Concept__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyFeatureList.g:710:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:714:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyFeatureList.g:715:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMyFeatureList.g:722:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:726:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalMyFeatureList.g:727:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalMyFeatureList.g:727:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalMyFeatureList.g:728:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalMyFeatureList.g:729:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalMyFeatureList.g:729:3: rule__Attribute__TypeAssignment_0
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
    // InternalMyFeatureList.g:737:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:741:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyFeatureList.g:742:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalMyFeatureList.g:749:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:753:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:754:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:754:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyFeatureList.g:755:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:756:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyFeatureList.g:756:3: rule__Attribute__NameAssignment_1
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
    // InternalMyFeatureList.g:764:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:768:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyFeatureList.g:769:2: rule__Attribute__Group__2__Impl
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
    // InternalMyFeatureList.g:775:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MultiplicityAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:779:1: ( ( ( rule__Attribute__MultiplicityAssignment_2 )? ) )
            // InternalMyFeatureList.g:780:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            {
            // InternalMyFeatureList.g:780:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            // InternalMyFeatureList.g:781:2: ( rule__Attribute__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 
            // InternalMyFeatureList.g:782:2: ( rule__Attribute__MultiplicityAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_MULTIPLICITY) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyFeatureList.g:782:3: rule__Attribute__MultiplicityAssignment_2
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
    // InternalMyFeatureList.g:791:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:795:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMyFeatureList.g:796:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalMyFeatureList.g:803:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Alternatives_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:807:1: ( ( ( rule__Condition__Alternatives_0 ) ) )
            // InternalMyFeatureList.g:808:1: ( ( rule__Condition__Alternatives_0 ) )
            {
            // InternalMyFeatureList.g:808:1: ( ( rule__Condition__Alternatives_0 ) )
            // InternalMyFeatureList.g:809:2: ( rule__Condition__Alternatives_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0()); 
            // InternalMyFeatureList.g:810:2: ( rule__Condition__Alternatives_0 )
            // InternalMyFeatureList.g:810:3: rule__Condition__Alternatives_0
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
    // InternalMyFeatureList.g:818:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:822:1: ( rule__Condition__Group__1__Impl )
            // InternalMyFeatureList.g:823:2: rule__Condition__Group__1__Impl
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
    // InternalMyFeatureList.g:829:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ValueAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:833:1: ( ( ( rule__Condition__ValueAssignment_1 ) ) )
            // InternalMyFeatureList.g:834:1: ( ( rule__Condition__ValueAssignment_1 ) )
            {
            // InternalMyFeatureList.g:834:1: ( ( rule__Condition__ValueAssignment_1 ) )
            // InternalMyFeatureList.g:835:2: ( rule__Condition__ValueAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1()); 
            // InternalMyFeatureList.g:836:2: ( rule__Condition__ValueAssignment_1 )
            // InternalMyFeatureList.g:836:3: rule__Condition__ValueAssignment_1
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
    // InternalMyFeatureList.g:845:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:849:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyFeatureList.g:850:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalMyFeatureList.g:857:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__ConceptAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:861:1: ( ( ( rule__Constraint__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:862:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:862:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:863:2: ( rule__Constraint__ConceptAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:864:2: ( rule__Constraint__ConceptAssignment_0 )
            // InternalMyFeatureList.g:864:3: rule__Constraint__ConceptAssignment_0
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
    // InternalMyFeatureList.g:872:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:876:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyFeatureList.g:877:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalMyFeatureList.g:884:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Group_1__0 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:888:1: ( ( ( rule__Constraint__Group_1__0 ) ) )
            // InternalMyFeatureList.g:889:1: ( ( rule__Constraint__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:889:1: ( ( rule__Constraint__Group_1__0 ) )
            // InternalMyFeatureList.g:890:2: ( rule__Constraint__Group_1__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_1()); 
            // InternalMyFeatureList.g:891:2: ( rule__Constraint__Group_1__0 )
            // InternalMyFeatureList.g:891:3: rule__Constraint__Group_1__0
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
    // InternalMyFeatureList.g:899:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:903:1: ( rule__Constraint__Group__2__Impl )
            // InternalMyFeatureList.g:904:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2__Impl();

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
    // InternalMyFeatureList.g:910:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ConditionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:914:1: ( ( ( rule__Constraint__ConditionAssignment_2 ) ) )
            // InternalMyFeatureList.g:915:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            {
            // InternalMyFeatureList.g:915:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            // InternalMyFeatureList.g:916:2: ( rule__Constraint__ConditionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getConditionAssignment_2()); 
            // InternalMyFeatureList.g:917:2: ( rule__Constraint__ConditionAssignment_2 )
            // InternalMyFeatureList.g:917:3: rule__Constraint__ConditionAssignment_2
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


    // $ANTLR start "rule__Constraint__Group_1__0"
    // InternalMyFeatureList.g:926:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:930:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalMyFeatureList.g:931:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
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
    // InternalMyFeatureList.g:938:1: rule__Constraint__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:942:1: ( ( '.' ) )
            // InternalMyFeatureList.g:943:1: ( '.' )
            {
            // InternalMyFeatureList.g:943:1: ( '.' )
            // InternalMyFeatureList.g:944:2: '.'
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
    // InternalMyFeatureList.g:953:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:957:1: ( rule__Constraint__Group_1__1__Impl )
            // InternalMyFeatureList.g:958:2: rule__Constraint__Group_1__1__Impl
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
    // InternalMyFeatureList.g:964:1: rule__Constraint__Group_1__1__Impl : ( ( rule__Constraint__AttributeAssignment_1_1 ) ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:968:1: ( ( ( rule__Constraint__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:969:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:969:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:970:2: ( rule__Constraint__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:971:2: ( rule__Constraint__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:971:3: rule__Constraint__AttributeAssignment_1_1
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
    // InternalMyFeatureList.g:980:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:984:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalMyFeatureList.g:985:2: rule__Key__Group__0__Impl rule__Key__Group__1
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
    // InternalMyFeatureList.g:992:1: rule__Key__Group__0__Impl : ( ( rule__Key__ConceptAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:996:1: ( ( ( rule__Key__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:997:1: ( ( rule__Key__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:997:1: ( ( rule__Key__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:998:2: ( rule__Key__ConceptAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:999:2: ( rule__Key__ConceptAssignment_0 )
            // InternalMyFeatureList.g:999:3: rule__Key__ConceptAssignment_0
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
    // InternalMyFeatureList.g:1007:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1011:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // InternalMyFeatureList.g:1012:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyFeatureList.g:1019:1: rule__Key__Group__1__Impl : ( ( rule__Key__Group_1__0 ) ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1023:1: ( ( ( rule__Key__Group_1__0 ) ) )
            // InternalMyFeatureList.g:1024:1: ( ( rule__Key__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:1024:1: ( ( rule__Key__Group_1__0 ) )
            // InternalMyFeatureList.g:1025:2: ( rule__Key__Group_1__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup_1()); 
            // InternalMyFeatureList.g:1026:2: ( rule__Key__Group_1__0 )
            // InternalMyFeatureList.g:1026:3: rule__Key__Group_1__0
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
    // InternalMyFeatureList.g:1034:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1038:1: ( rule__Key__Group__2__Impl )
            // InternalMyFeatureList.g:1039:2: rule__Key__Group__2__Impl
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
    // InternalMyFeatureList.g:1045:1: rule__Key__Group__2__Impl : ( ( rule__Key__Alternatives_2 ) ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1049:1: ( ( ( rule__Key__Alternatives_2 ) ) )
            // InternalMyFeatureList.g:1050:1: ( ( rule__Key__Alternatives_2 ) )
            {
            // InternalMyFeatureList.g:1050:1: ( ( rule__Key__Alternatives_2 ) )
            // InternalMyFeatureList.g:1051:2: ( rule__Key__Alternatives_2 )
            {
             before(grammarAccess.getKeyAccess().getAlternatives_2()); 
            // InternalMyFeatureList.g:1052:2: ( rule__Key__Alternatives_2 )
            // InternalMyFeatureList.g:1052:3: rule__Key__Alternatives_2
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
    // InternalMyFeatureList.g:1061:1: rule__Key__Group_1__0 : rule__Key__Group_1__0__Impl rule__Key__Group_1__1 ;
    public final void rule__Key__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1065:1: ( rule__Key__Group_1__0__Impl rule__Key__Group_1__1 )
            // InternalMyFeatureList.g:1066:2: rule__Key__Group_1__0__Impl rule__Key__Group_1__1
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
    // InternalMyFeatureList.g:1073:1: rule__Key__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Key__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1077:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1078:1: ( '.' )
            {
            // InternalMyFeatureList.g:1078:1: ( '.' )
            // InternalMyFeatureList.g:1079:2: '.'
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
    // InternalMyFeatureList.g:1088:1: rule__Key__Group_1__1 : rule__Key__Group_1__1__Impl ;
    public final void rule__Key__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1092:1: ( rule__Key__Group_1__1__Impl )
            // InternalMyFeatureList.g:1093:2: rule__Key__Group_1__1__Impl
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
    // InternalMyFeatureList.g:1099:1: rule__Key__Group_1__1__Impl : ( ( rule__Key__AttributeAssignment_1_1 ) ) ;
    public final void rule__Key__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1103:1: ( ( ( rule__Key__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:1104:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:1104:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:1105:2: ( rule__Key__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getKeyAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:1106:2: ( rule__Key__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:1106:3: rule__Key__AttributeAssignment_1_1
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


    // $ANTLR start "rule__Property__Group__0"
    // InternalMyFeatureList.g:1115:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1119:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMyFeatureList.g:1120:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalMyFeatureList.g:1127:1: rule__Property__Group__0__Impl : ( ( rule__Property__ConceptAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1131:1: ( ( ( rule__Property__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:1132:1: ( ( rule__Property__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1132:1: ( ( rule__Property__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:1133:2: ( rule__Property__ConceptAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:1134:2: ( rule__Property__ConceptAssignment_0 )
            // InternalMyFeatureList.g:1134:3: rule__Property__ConceptAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__ConceptAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getConceptAssignment_0()); 

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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalMyFeatureList.g:1142:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1146:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalMyFeatureList.g:1147:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalMyFeatureList.g:1154:1: rule__Property__Group__1__Impl : ( ( rule__Property__Group_1__0 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1158:1: ( ( ( rule__Property__Group_1__0 ) ) )
            // InternalMyFeatureList.g:1159:1: ( ( rule__Property__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:1159:1: ( ( rule__Property__Group_1__0 ) )
            // InternalMyFeatureList.g:1160:2: ( rule__Property__Group_1__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup_1()); 
            // InternalMyFeatureList.g:1161:2: ( rule__Property__Group_1__0 )
            // InternalMyFeatureList.g:1161:3: rule__Property__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalMyFeatureList.g:1169:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1173:1: ( rule__Property__Group__2__Impl )
            // InternalMyFeatureList.g:1174:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__2__Impl();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalMyFeatureList.g:1180:1: rule__Property__Group__2__Impl : ( 'lazy' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1184:1: ( ( 'lazy' ) )
            // InternalMyFeatureList.g:1185:1: ( 'lazy' )
            {
            // InternalMyFeatureList.g:1185:1: ( 'lazy' )
            // InternalMyFeatureList.g:1186:2: 'lazy'
            {
             before(grammarAccess.getPropertyAccess().getLazyKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLazyKeyword_2()); 

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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group_1__0"
    // InternalMyFeatureList.g:1196:1: rule__Property__Group_1__0 : rule__Property__Group_1__0__Impl rule__Property__Group_1__1 ;
    public final void rule__Property__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1200:1: ( rule__Property__Group_1__0__Impl rule__Property__Group_1__1 )
            // InternalMyFeatureList.g:1201:2: rule__Property__Group_1__0__Impl rule__Property__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Property__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group_1__1();

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
    // $ANTLR end "rule__Property__Group_1__0"


    // $ANTLR start "rule__Property__Group_1__0__Impl"
    // InternalMyFeatureList.g:1208:1: rule__Property__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Property__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1212:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1213:1: ( '.' )
            {
            // InternalMyFeatureList.g:1213:1: ( '.' )
            // InternalMyFeatureList.g:1214:2: '.'
            {
             before(grammarAccess.getPropertyAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Property__Group_1__0__Impl"


    // $ANTLR start "rule__Property__Group_1__1"
    // InternalMyFeatureList.g:1223:1: rule__Property__Group_1__1 : rule__Property__Group_1__1__Impl ;
    public final void rule__Property__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1227:1: ( rule__Property__Group_1__1__Impl )
            // InternalMyFeatureList.g:1228:2: rule__Property__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_1__1__Impl();

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
    // $ANTLR end "rule__Property__Group_1__1"


    // $ANTLR start "rule__Property__Group_1__1__Impl"
    // InternalMyFeatureList.g:1234:1: rule__Property__Group_1__1__Impl : ( ( rule__Property__AttributeAssignment_1_1 ) ) ;
    public final void rule__Property__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1238:1: ( ( ( rule__Property__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:1239:1: ( ( rule__Property__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:1239:1: ( ( rule__Property__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:1240:2: ( rule__Property__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getPropertyAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:1241:2: ( rule__Property__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:1241:3: rule__Property__AttributeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__AttributeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAttributeAssignment_1_1()); 

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
    // $ANTLR end "rule__Property__Group_1__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalMyFeatureList.g:1250:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1254:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalMyFeatureList.g:1255:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalMyFeatureList.g:1262:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__VerbAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1266:1: ( ( ( rule__Feature__VerbAssignment_0 ) ) )
            // InternalMyFeatureList.g:1267:1: ( ( rule__Feature__VerbAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1267:1: ( ( rule__Feature__VerbAssignment_0 ) )
            // InternalMyFeatureList.g:1268:2: ( rule__Feature__VerbAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getVerbAssignment_0()); 
            // InternalMyFeatureList.g:1269:2: ( rule__Feature__VerbAssignment_0 )
            // InternalMyFeatureList.g:1269:3: rule__Feature__VerbAssignment_0
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
    // InternalMyFeatureList.g:1277:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1281:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalMyFeatureList.g:1282:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalMyFeatureList.g:1289:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConceptAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1293:1: ( ( ( rule__Feature__ConceptAssignment_1 ) ) )
            // InternalMyFeatureList.g:1294:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            {
            // InternalMyFeatureList.g:1294:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            // InternalMyFeatureList.g:1295:2: ( rule__Feature__ConceptAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getConceptAssignment_1()); 
            // InternalMyFeatureList.g:1296:2: ( rule__Feature__ConceptAssignment_1 )
            // InternalMyFeatureList.g:1296:3: rule__Feature__ConceptAssignment_1
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
    // InternalMyFeatureList.g:1304:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1308:1: ( rule__Feature__Group__2__Impl )
            // InternalMyFeatureList.g:1309:2: rule__Feature__Group__2__Impl
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
    // InternalMyFeatureList.g:1315:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1319:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalMyFeatureList.g:1320:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalMyFeatureList.g:1320:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalMyFeatureList.g:1321:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalMyFeatureList.g:1322:2: ( rule__Feature__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyFeatureList.g:1322:3: rule__Feature__Group_2__0
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
    // InternalMyFeatureList.g:1331:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1335:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalMyFeatureList.g:1336:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
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
    // InternalMyFeatureList.g:1343:1: rule__Feature__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1347:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1348:1: ( '.' )
            {
            // InternalMyFeatureList.g:1348:1: ( '.' )
            // InternalMyFeatureList.g:1349:2: '.'
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
    // InternalMyFeatureList.g:1358:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1362:1: ( rule__Feature__Group_2__1__Impl )
            // InternalMyFeatureList.g:1363:2: rule__Feature__Group_2__1__Impl
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
    // InternalMyFeatureList.g:1369:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__AttributeAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1373:1: ( ( ( rule__Feature__AttributeAssignment_2_1 ) ) )
            // InternalMyFeatureList.g:1374:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            {
            // InternalMyFeatureList.g:1374:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            // InternalMyFeatureList.g:1375:2: ( rule__Feature__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1()); 
            // InternalMyFeatureList.g:1376:2: ( rule__Feature__AttributeAssignment_2_1 )
            // InternalMyFeatureList.g:1376:3: rule__Feature__AttributeAssignment_2_1
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
    // InternalMyFeatureList.g:1385:1: rule__FeatureList__ConceptsAssignment_0 : ( ruleConcept ) ;
    public final void rule__FeatureList__ConceptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1389:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:1390:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:1390:2: ( ruleConcept )
            // InternalMyFeatureList.g:1391:3: ruleConcept
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
    // InternalMyFeatureList.g:1400:1: rule__FeatureList__ConstraintsAssignment_2 : ( ruleConstraint ) ;
    public final void rule__FeatureList__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1404:1: ( ( ruleConstraint ) )
            // InternalMyFeatureList.g:1405:2: ( ruleConstraint )
            {
            // InternalMyFeatureList.g:1405:2: ( ruleConstraint )
            // InternalMyFeatureList.g:1406:3: ruleConstraint
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
    // InternalMyFeatureList.g:1415:1: rule__FeatureList__KeysAssignment_4 : ( ruleKey ) ;
    public final void rule__FeatureList__KeysAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1419:1: ( ( ruleKey ) )
            // InternalMyFeatureList.g:1420:2: ( ruleKey )
            {
            // InternalMyFeatureList.g:1420:2: ( ruleKey )
            // InternalMyFeatureList.g:1421:3: ruleKey
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
    // InternalMyFeatureList.g:1430:1: rule__FeatureList__PropertiesAssignment_6 : ( ruleProperty ) ;
    public final void rule__FeatureList__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1434:1: ( ( ruleProperty ) )
            // InternalMyFeatureList.g:1435:2: ( ruleProperty )
            {
            // InternalMyFeatureList.g:1435:2: ( ruleProperty )
            // InternalMyFeatureList.g:1436:3: ruleProperty
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
    // InternalMyFeatureList.g:1445:1: rule__FeatureList__FeaturesAssignment_8 : ( ruleFeature ) ;
    public final void rule__FeatureList__FeaturesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1449:1: ( ( ruleFeature ) )
            // InternalMyFeatureList.g:1450:2: ( ruleFeature )
            {
            // InternalMyFeatureList.g:1450:2: ( ruleFeature )
            // InternalMyFeatureList.g:1451:3: ruleFeature
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
    // InternalMyFeatureList.g:1460:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1464:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1465:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1465:2: ( RULE_ID )
            // InternalMyFeatureList.g:1466:3: RULE_ID
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
    // InternalMyFeatureList.g:1475:1: rule__Concept__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Concept__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1479:1: ( ( ruleAttribute ) )
            // InternalMyFeatureList.g:1480:2: ( ruleAttribute )
            {
            // InternalMyFeatureList.g:1480:2: ( ruleAttribute )
            // InternalMyFeatureList.g:1481:3: ruleAttribute
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
    // InternalMyFeatureList.g:1490:1: rule__Attribute__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1494:1: ( ( ruleType ) )
            // InternalMyFeatureList.g:1495:2: ( ruleType )
            {
            // InternalMyFeatureList.g:1495:2: ( ruleType )
            // InternalMyFeatureList.g:1496:3: ruleType
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
    // InternalMyFeatureList.g:1505:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1509:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1510:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1510:2: ( RULE_ID )
            // InternalMyFeatureList.g:1511:3: RULE_ID
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
    // InternalMyFeatureList.g:1520:1: rule__Attribute__MultiplicityAssignment_2 : ( RULE_MULTIPLICITY ) ;
    public final void rule__Attribute__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1524:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMyFeatureList.g:1525:2: ( RULE_MULTIPLICITY )
            {
            // InternalMyFeatureList.g:1525:2: ( RULE_MULTIPLICITY )
            // InternalMyFeatureList.g:1526:3: RULE_MULTIPLICITY
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
    // InternalMyFeatureList.g:1535:1: rule__Type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1539:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1540:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1540:2: ( RULE_ID )
            // InternalMyFeatureList.g:1541:3: RULE_ID
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
    // InternalMyFeatureList.g:1550:1: rule__Condition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1554:1: ( ( RULE_INT ) )
            // InternalMyFeatureList.g:1555:2: ( RULE_INT )
            {
            // InternalMyFeatureList.g:1555:2: ( RULE_INT )
            // InternalMyFeatureList.g:1556:3: RULE_INT
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
    // InternalMyFeatureList.g:1565:1: rule__Constraint__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1569:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1570:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1570:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1571:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1572:3: ( RULE_ID )
            // InternalMyFeatureList.g:1573:4: RULE_ID
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
    // InternalMyFeatureList.g:1584:1: rule__Constraint__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1588:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1589:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1589:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1590:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1591:3: ( RULE_ID )
            // InternalMyFeatureList.g:1592:4: RULE_ID
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
    // InternalMyFeatureList.g:1603:1: rule__Constraint__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Constraint__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1607:1: ( ( ruleCondition ) )
            // InternalMyFeatureList.g:1608:2: ( ruleCondition )
            {
            // InternalMyFeatureList.g:1608:2: ( ruleCondition )
            // InternalMyFeatureList.g:1609:3: ruleCondition
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


    // $ANTLR start "rule__Key__ConceptAssignment_0"
    // InternalMyFeatureList.g:1618:1: rule__Key__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Key__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1622:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1623:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1623:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1624:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1625:3: ( RULE_ID )
            // InternalMyFeatureList.g:1626:4: RULE_ID
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
    // InternalMyFeatureList.g:1637:1: rule__Key__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Key__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1641:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1642:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1642:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1643:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1644:3: ( RULE_ID )
            // InternalMyFeatureList.g:1645:4: RULE_ID
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


    // $ANTLR start "rule__Property__ConceptAssignment_0"
    // InternalMyFeatureList.g:1656:1: rule__Property__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1660:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1661:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1661:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1662:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1663:3: ( RULE_ID )
            // InternalMyFeatureList.g:1664:4: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getConceptConceptIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getConceptConceptCrossReference_0_0()); 

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
    // $ANTLR end "rule__Property__ConceptAssignment_0"


    // $ANTLR start "rule__Property__AttributeAssignment_1_1"
    // InternalMyFeatureList.g:1675:1: rule__Property__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1679:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1680:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1680:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1681:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1682:3: ( RULE_ID )
            // InternalMyFeatureList.g:1683:4: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getAttributeAttributeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getAttributeAttributeCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Property__AttributeAssignment_1_1"


    // $ANTLR start "rule__Feature__VerbAssignment_0"
    // InternalMyFeatureList.g:1694:1: rule__Feature__VerbAssignment_0 : ( ruleVerb ) ;
    public final void rule__Feature__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1698:1: ( ( ruleVerb ) )
            // InternalMyFeatureList.g:1699:2: ( ruleVerb )
            {
            // InternalMyFeatureList.g:1699:2: ( ruleVerb )
            // InternalMyFeatureList.g:1700:3: ruleVerb
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
    // InternalMyFeatureList.g:1709:1: rule__Feature__ConceptAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1713:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1714:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1714:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1715:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); 
            // InternalMyFeatureList.g:1716:3: ( RULE_ID )
            // InternalMyFeatureList.g:1717:4: RULE_ID
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
    // InternalMyFeatureList.g:1728:1: rule__Feature__AttributeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1732:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1733:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1733:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1734:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0()); 
            // InternalMyFeatureList.g:1735:3: ( RULE_ID )
            // InternalMyFeatureList.g:1736:4: RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});

}