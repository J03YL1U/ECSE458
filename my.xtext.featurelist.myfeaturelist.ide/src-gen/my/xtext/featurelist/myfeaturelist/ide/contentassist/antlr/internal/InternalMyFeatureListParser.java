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
    // InternalMyFeatureList.g:398:1: rule__FeatureList__Group__0__Impl : ( ( rule__FeatureList__ConceptAssignment_0 )* ) ;
    public final void rule__FeatureList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:402:1: ( ( ( rule__FeatureList__ConceptAssignment_0 )* ) )
            // InternalMyFeatureList.g:403:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            {
            // InternalMyFeatureList.g:403:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            // InternalMyFeatureList.g:404:2: ( rule__FeatureList__ConceptAssignment_0 )*
            {
             before(grammarAccess.getFeatureListAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:405:2: ( rule__FeatureList__ConceptAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyFeatureList.g:405:3: rule__FeatureList__ConceptAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FeatureList__ConceptAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getConceptAssignment_0()); 

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
            pushFollow(FOLLOW_6);
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
    // InternalMyFeatureList.g:452:1: rule__FeatureList__Group__2__Impl : ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) ) ;
    public final void rule__FeatureList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:456:1: ( ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) ) )
            // InternalMyFeatureList.g:457:1: ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) )
            {
            // InternalMyFeatureList.g:457:1: ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) )
            // InternalMyFeatureList.g:458:2: ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* )
            {
            // InternalMyFeatureList.g:458:2: ( ( rule__FeatureList__ConstraintAssignment_2 ) )
            // InternalMyFeatureList.g:459:3: ( rule__FeatureList__ConstraintAssignment_2 )
            {
             before(grammarAccess.getFeatureListAccess().getConstraintAssignment_2()); 
            // InternalMyFeatureList.g:460:3: ( rule__FeatureList__ConstraintAssignment_2 )
            // InternalMyFeatureList.g:460:4: rule__FeatureList__ConstraintAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__FeatureList__ConstraintAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getConstraintAssignment_2()); 

            }

            // InternalMyFeatureList.g:463:2: ( ( rule__FeatureList__ConstraintAssignment_2 )* )
            // InternalMyFeatureList.g:464:3: ( rule__FeatureList__ConstraintAssignment_2 )*
            {
             before(grammarAccess.getFeatureListAccess().getConstraintAssignment_2()); 
            // InternalMyFeatureList.g:465:3: ( rule__FeatureList__ConstraintAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFeatureList.g:465:4: rule__FeatureList__ConstraintAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FeatureList__ConstraintAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getConstraintAssignment_2()); 

            }


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
    // InternalMyFeatureList.g:474:1: rule__FeatureList__Group__3 : rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 ;
    public final void rule__FeatureList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:478:1: ( rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 )
            // InternalMyFeatureList.g:479:2: rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:486:1: rule__FeatureList__Group__3__Impl : ( 'keys' ) ;
    public final void rule__FeatureList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:490:1: ( ( 'keys' ) )
            // InternalMyFeatureList.g:491:1: ( 'keys' )
            {
            // InternalMyFeatureList.g:491:1: ( 'keys' )
            // InternalMyFeatureList.g:492:2: 'keys'
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
    // InternalMyFeatureList.g:501:1: rule__FeatureList__Group__4 : rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 ;
    public final void rule__FeatureList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:505:1: ( rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 )
            // InternalMyFeatureList.g:506:2: rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyFeatureList.g:513:1: rule__FeatureList__Group__4__Impl : ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) ) ;
    public final void rule__FeatureList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:517:1: ( ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) ) )
            // InternalMyFeatureList.g:518:1: ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) )
            {
            // InternalMyFeatureList.g:518:1: ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) )
            // InternalMyFeatureList.g:519:2: ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* )
            {
            // InternalMyFeatureList.g:519:2: ( ( rule__FeatureList__KeyAssignment_4 ) )
            // InternalMyFeatureList.g:520:3: ( rule__FeatureList__KeyAssignment_4 )
            {
             before(grammarAccess.getFeatureListAccess().getKeyAssignment_4()); 
            // InternalMyFeatureList.g:521:3: ( rule__FeatureList__KeyAssignment_4 )
            // InternalMyFeatureList.g:521:4: rule__FeatureList__KeyAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__FeatureList__KeyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getKeyAssignment_4()); 

            }

            // InternalMyFeatureList.g:524:2: ( ( rule__FeatureList__KeyAssignment_4 )* )
            // InternalMyFeatureList.g:525:3: ( rule__FeatureList__KeyAssignment_4 )*
            {
             before(grammarAccess.getFeatureListAccess().getKeyAssignment_4()); 
            // InternalMyFeatureList.g:526:3: ( rule__FeatureList__KeyAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFeatureList.g:526:4: rule__FeatureList__KeyAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FeatureList__KeyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getKeyAssignment_4()); 

            }


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
    // InternalMyFeatureList.g:535:1: rule__FeatureList__Group__5 : rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 ;
    public final void rule__FeatureList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:539:1: ( rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 )
            // InternalMyFeatureList.g:540:2: rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:547:1: rule__FeatureList__Group__5__Impl : ( 'properties' ) ;
    public final void rule__FeatureList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:551:1: ( ( 'properties' ) )
            // InternalMyFeatureList.g:552:1: ( 'properties' )
            {
            // InternalMyFeatureList.g:552:1: ( 'properties' )
            // InternalMyFeatureList.g:553:2: 'properties'
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
    // InternalMyFeatureList.g:562:1: rule__FeatureList__Group__6 : rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7 ;
    public final void rule__FeatureList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:566:1: ( rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7 )
            // InternalMyFeatureList.g:567:2: rule__FeatureList__Group__6__Impl rule__FeatureList__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyFeatureList.g:574:1: rule__FeatureList__Group__6__Impl : ( ( ( rule__FeatureList__PropertyAssignment_6 ) ) ( ( rule__FeatureList__PropertyAssignment_6 )* ) ) ;
    public final void rule__FeatureList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:578:1: ( ( ( ( rule__FeatureList__PropertyAssignment_6 ) ) ( ( rule__FeatureList__PropertyAssignment_6 )* ) ) )
            // InternalMyFeatureList.g:579:1: ( ( ( rule__FeatureList__PropertyAssignment_6 ) ) ( ( rule__FeatureList__PropertyAssignment_6 )* ) )
            {
            // InternalMyFeatureList.g:579:1: ( ( ( rule__FeatureList__PropertyAssignment_6 ) ) ( ( rule__FeatureList__PropertyAssignment_6 )* ) )
            // InternalMyFeatureList.g:580:2: ( ( rule__FeatureList__PropertyAssignment_6 ) ) ( ( rule__FeatureList__PropertyAssignment_6 )* )
            {
            // InternalMyFeatureList.g:580:2: ( ( rule__FeatureList__PropertyAssignment_6 ) )
            // InternalMyFeatureList.g:581:3: ( rule__FeatureList__PropertyAssignment_6 )
            {
             before(grammarAccess.getFeatureListAccess().getPropertyAssignment_6()); 
            // InternalMyFeatureList.g:582:3: ( rule__FeatureList__PropertyAssignment_6 )
            // InternalMyFeatureList.g:582:4: rule__FeatureList__PropertyAssignment_6
            {
            pushFollow(FOLLOW_7);
            rule__FeatureList__PropertyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getPropertyAssignment_6()); 

            }

            // InternalMyFeatureList.g:585:2: ( ( rule__FeatureList__PropertyAssignment_6 )* )
            // InternalMyFeatureList.g:586:3: ( rule__FeatureList__PropertyAssignment_6 )*
            {
             before(grammarAccess.getFeatureListAccess().getPropertyAssignment_6()); 
            // InternalMyFeatureList.g:587:3: ( rule__FeatureList__PropertyAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyFeatureList.g:587:4: rule__FeatureList__PropertyAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FeatureList__PropertyAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getPropertyAssignment_6()); 

            }


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
    // InternalMyFeatureList.g:596:1: rule__FeatureList__Group__7 : rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8 ;
    public final void rule__FeatureList__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:600:1: ( rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8 )
            // InternalMyFeatureList.g:601:2: rule__FeatureList__Group__7__Impl rule__FeatureList__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyFeatureList.g:608:1: rule__FeatureList__Group__7__Impl : ( 'features' ) ;
    public final void rule__FeatureList__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:612:1: ( ( 'features' ) )
            // InternalMyFeatureList.g:613:1: ( 'features' )
            {
            // InternalMyFeatureList.g:613:1: ( 'features' )
            // InternalMyFeatureList.g:614:2: 'features'
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
    // InternalMyFeatureList.g:623:1: rule__FeatureList__Group__8 : rule__FeatureList__Group__8__Impl ;
    public final void rule__FeatureList__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:627:1: ( rule__FeatureList__Group__8__Impl )
            // InternalMyFeatureList.g:628:2: rule__FeatureList__Group__8__Impl
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
    // InternalMyFeatureList.g:634:1: rule__FeatureList__Group__8__Impl : ( ( ( rule__FeatureList__FeatureAssignment_8 ) ) ( ( rule__FeatureList__FeatureAssignment_8 )* ) ) ;
    public final void rule__FeatureList__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:638:1: ( ( ( ( rule__FeatureList__FeatureAssignment_8 ) ) ( ( rule__FeatureList__FeatureAssignment_8 )* ) ) )
            // InternalMyFeatureList.g:639:1: ( ( ( rule__FeatureList__FeatureAssignment_8 ) ) ( ( rule__FeatureList__FeatureAssignment_8 )* ) )
            {
            // InternalMyFeatureList.g:639:1: ( ( ( rule__FeatureList__FeatureAssignment_8 ) ) ( ( rule__FeatureList__FeatureAssignment_8 )* ) )
            // InternalMyFeatureList.g:640:2: ( ( rule__FeatureList__FeatureAssignment_8 ) ) ( ( rule__FeatureList__FeatureAssignment_8 )* )
            {
            // InternalMyFeatureList.g:640:2: ( ( rule__FeatureList__FeatureAssignment_8 ) )
            // InternalMyFeatureList.g:641:3: ( rule__FeatureList__FeatureAssignment_8 )
            {
             before(grammarAccess.getFeatureListAccess().getFeatureAssignment_8()); 
            // InternalMyFeatureList.g:642:3: ( rule__FeatureList__FeatureAssignment_8 )
            // InternalMyFeatureList.g:642:4: rule__FeatureList__FeatureAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__FeatureList__FeatureAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getFeatureAssignment_8()); 

            }

            // InternalMyFeatureList.g:645:2: ( ( rule__FeatureList__FeatureAssignment_8 )* )
            // InternalMyFeatureList.g:646:3: ( rule__FeatureList__FeatureAssignment_8 )*
            {
             before(grammarAccess.getFeatureListAccess().getFeatureAssignment_8()); 
            // InternalMyFeatureList.g:647:3: ( rule__FeatureList__FeatureAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyFeatureList.g:647:4: rule__FeatureList__FeatureAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FeatureList__FeatureAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getFeatureAssignment_8()); 

            }


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
    // InternalMyFeatureList.g:657:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:661:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalMyFeatureList.g:662:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:669:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:673:1: ( ( 'concept' ) )
            // InternalMyFeatureList.g:674:1: ( 'concept' )
            {
            // InternalMyFeatureList.g:674:1: ( 'concept' )
            // InternalMyFeatureList.g:675:2: 'concept'
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
    // InternalMyFeatureList.g:684:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:688:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalMyFeatureList.g:689:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:696:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:700:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:701:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:701:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalMyFeatureList.g:702:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:703:2: ( rule__Concept__NameAssignment_1 )
            // InternalMyFeatureList.g:703:3: rule__Concept__NameAssignment_1
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
    // InternalMyFeatureList.g:711:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:715:1: ( rule__Concept__Group__2__Impl )
            // InternalMyFeatureList.g:716:2: rule__Concept__Group__2__Impl
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
    // InternalMyFeatureList.g:722:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__AttributesAssignment_2 )* ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:726:1: ( ( ( rule__Concept__AttributesAssignment_2 )* ) )
            // InternalMyFeatureList.g:727:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            {
            // InternalMyFeatureList.g:727:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            // InternalMyFeatureList.g:728:2: ( rule__Concept__AttributesAssignment_2 )*
            {
             before(grammarAccess.getConceptAccess().getAttributesAssignment_2()); 
            // InternalMyFeatureList.g:729:2: ( rule__Concept__AttributesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyFeatureList.g:729:3: rule__Concept__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalMyFeatureList.g:738:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:742:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyFeatureList.g:743:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:750:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:754:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalMyFeatureList.g:755:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalMyFeatureList.g:755:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalMyFeatureList.g:756:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalMyFeatureList.g:757:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalMyFeatureList.g:757:3: rule__Attribute__TypeAssignment_0
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
    // InternalMyFeatureList.g:765:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:769:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyFeatureList.g:770:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalMyFeatureList.g:777:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:781:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:782:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:782:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyFeatureList.g:783:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:784:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyFeatureList.g:784:3: rule__Attribute__NameAssignment_1
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
    // InternalMyFeatureList.g:792:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:796:1: ( rule__Attribute__Group__2__Impl )
            // InternalMyFeatureList.g:797:2: rule__Attribute__Group__2__Impl
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
    // InternalMyFeatureList.g:803:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MultiplicityAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:807:1: ( ( ( rule__Attribute__MultiplicityAssignment_2 )? ) )
            // InternalMyFeatureList.g:808:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            {
            // InternalMyFeatureList.g:808:1: ( ( rule__Attribute__MultiplicityAssignment_2 )? )
            // InternalMyFeatureList.g:809:2: ( rule__Attribute__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 
            // InternalMyFeatureList.g:810:2: ( rule__Attribute__MultiplicityAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_MULTIPLICITY) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyFeatureList.g:810:3: rule__Attribute__MultiplicityAssignment_2
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
    // InternalMyFeatureList.g:819:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:823:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMyFeatureList.g:824:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalMyFeatureList.g:831:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Alternatives_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:835:1: ( ( ( rule__Condition__Alternatives_0 ) ) )
            // InternalMyFeatureList.g:836:1: ( ( rule__Condition__Alternatives_0 ) )
            {
            // InternalMyFeatureList.g:836:1: ( ( rule__Condition__Alternatives_0 ) )
            // InternalMyFeatureList.g:837:2: ( rule__Condition__Alternatives_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0()); 
            // InternalMyFeatureList.g:838:2: ( rule__Condition__Alternatives_0 )
            // InternalMyFeatureList.g:838:3: rule__Condition__Alternatives_0
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
    // InternalMyFeatureList.g:846:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:850:1: ( rule__Condition__Group__1__Impl )
            // InternalMyFeatureList.g:851:2: rule__Condition__Group__1__Impl
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
    // InternalMyFeatureList.g:857:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ValueAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:861:1: ( ( ( rule__Condition__ValueAssignment_1 ) ) )
            // InternalMyFeatureList.g:862:1: ( ( rule__Condition__ValueAssignment_1 ) )
            {
            // InternalMyFeatureList.g:862:1: ( ( rule__Condition__ValueAssignment_1 ) )
            // InternalMyFeatureList.g:863:2: ( rule__Condition__ValueAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1()); 
            // InternalMyFeatureList.g:864:2: ( rule__Condition__ValueAssignment_1 )
            // InternalMyFeatureList.g:864:3: rule__Condition__ValueAssignment_1
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
    // InternalMyFeatureList.g:873:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:877:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyFeatureList.g:878:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalMyFeatureList.g:885:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__ConceptAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:889:1: ( ( ( rule__Constraint__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:890:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:890:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:891:2: ( rule__Constraint__ConceptAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:892:2: ( rule__Constraint__ConceptAssignment_0 )
            // InternalMyFeatureList.g:892:3: rule__Constraint__ConceptAssignment_0
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
    // InternalMyFeatureList.g:900:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:904:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyFeatureList.g:905:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalMyFeatureList.g:912:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Group_1__0 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:916:1: ( ( ( rule__Constraint__Group_1__0 ) ) )
            // InternalMyFeatureList.g:917:1: ( ( rule__Constraint__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:917:1: ( ( rule__Constraint__Group_1__0 ) )
            // InternalMyFeatureList.g:918:2: ( rule__Constraint__Group_1__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_1()); 
            // InternalMyFeatureList.g:919:2: ( rule__Constraint__Group_1__0 )
            // InternalMyFeatureList.g:919:3: rule__Constraint__Group_1__0
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
    // InternalMyFeatureList.g:927:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:931:1: ( rule__Constraint__Group__2__Impl )
            // InternalMyFeatureList.g:932:2: rule__Constraint__Group__2__Impl
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
    // InternalMyFeatureList.g:938:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ConditionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:942:1: ( ( ( rule__Constraint__ConditionAssignment_2 ) ) )
            // InternalMyFeatureList.g:943:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            {
            // InternalMyFeatureList.g:943:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            // InternalMyFeatureList.g:944:2: ( rule__Constraint__ConditionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getConditionAssignment_2()); 
            // InternalMyFeatureList.g:945:2: ( rule__Constraint__ConditionAssignment_2 )
            // InternalMyFeatureList.g:945:3: rule__Constraint__ConditionAssignment_2
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
    // InternalMyFeatureList.g:954:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:958:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalMyFeatureList.g:959:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:966:1: rule__Constraint__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:970:1: ( ( '.' ) )
            // InternalMyFeatureList.g:971:1: ( '.' )
            {
            // InternalMyFeatureList.g:971:1: ( '.' )
            // InternalMyFeatureList.g:972:2: '.'
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
    // InternalMyFeatureList.g:981:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:985:1: ( rule__Constraint__Group_1__1__Impl )
            // InternalMyFeatureList.g:986:2: rule__Constraint__Group_1__1__Impl
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
    // InternalMyFeatureList.g:992:1: rule__Constraint__Group_1__1__Impl : ( ( rule__Constraint__AttributeAssignment_1_1 ) ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:996:1: ( ( ( rule__Constraint__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:997:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:997:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:998:2: ( rule__Constraint__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:999:2: ( rule__Constraint__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:999:3: rule__Constraint__AttributeAssignment_1_1
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
    // InternalMyFeatureList.g:1008:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1012:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalMyFeatureList.g:1013:2: rule__Key__Group__0__Impl rule__Key__Group__1
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
    // InternalMyFeatureList.g:1020:1: rule__Key__Group__0__Impl : ( ( rule__Key__ConceptAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1024:1: ( ( ( rule__Key__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:1025:1: ( ( rule__Key__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1025:1: ( ( rule__Key__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:1026:2: ( rule__Key__ConceptAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:1027:2: ( rule__Key__ConceptAssignment_0 )
            // InternalMyFeatureList.g:1027:3: rule__Key__ConceptAssignment_0
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
    // InternalMyFeatureList.g:1035:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1039:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // InternalMyFeatureList.g:1040:2: rule__Key__Group__1__Impl rule__Key__Group__2
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
    // InternalMyFeatureList.g:1047:1: rule__Key__Group__1__Impl : ( ( rule__Key__Group_1__0 ) ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1051:1: ( ( ( rule__Key__Group_1__0 ) ) )
            // InternalMyFeatureList.g:1052:1: ( ( rule__Key__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:1052:1: ( ( rule__Key__Group_1__0 ) )
            // InternalMyFeatureList.g:1053:2: ( rule__Key__Group_1__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup_1()); 
            // InternalMyFeatureList.g:1054:2: ( rule__Key__Group_1__0 )
            // InternalMyFeatureList.g:1054:3: rule__Key__Group_1__0
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
    // InternalMyFeatureList.g:1062:1: rule__Key__Group__2 : rule__Key__Group__2__Impl ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1066:1: ( rule__Key__Group__2__Impl )
            // InternalMyFeatureList.g:1067:2: rule__Key__Group__2__Impl
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
    // InternalMyFeatureList.g:1073:1: rule__Key__Group__2__Impl : ( ( rule__Key__Alternatives_2 ) ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1077:1: ( ( ( rule__Key__Alternatives_2 ) ) )
            // InternalMyFeatureList.g:1078:1: ( ( rule__Key__Alternatives_2 ) )
            {
            // InternalMyFeatureList.g:1078:1: ( ( rule__Key__Alternatives_2 ) )
            // InternalMyFeatureList.g:1079:2: ( rule__Key__Alternatives_2 )
            {
             before(grammarAccess.getKeyAccess().getAlternatives_2()); 
            // InternalMyFeatureList.g:1080:2: ( rule__Key__Alternatives_2 )
            // InternalMyFeatureList.g:1080:3: rule__Key__Alternatives_2
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
    // InternalMyFeatureList.g:1089:1: rule__Key__Group_1__0 : rule__Key__Group_1__0__Impl rule__Key__Group_1__1 ;
    public final void rule__Key__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1093:1: ( rule__Key__Group_1__0__Impl rule__Key__Group_1__1 )
            // InternalMyFeatureList.g:1094:2: rule__Key__Group_1__0__Impl rule__Key__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:1101:1: rule__Key__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Key__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1105:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1106:1: ( '.' )
            {
            // InternalMyFeatureList.g:1106:1: ( '.' )
            // InternalMyFeatureList.g:1107:2: '.'
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
    // InternalMyFeatureList.g:1116:1: rule__Key__Group_1__1 : rule__Key__Group_1__1__Impl ;
    public final void rule__Key__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1120:1: ( rule__Key__Group_1__1__Impl )
            // InternalMyFeatureList.g:1121:2: rule__Key__Group_1__1__Impl
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
    // InternalMyFeatureList.g:1127:1: rule__Key__Group_1__1__Impl : ( ( rule__Key__AttributeAssignment_1_1 ) ) ;
    public final void rule__Key__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1131:1: ( ( ( rule__Key__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:1132:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:1132:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:1133:2: ( rule__Key__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getKeyAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:1134:2: ( rule__Key__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:1134:3: rule__Key__AttributeAssignment_1_1
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
    // InternalMyFeatureList.g:1143:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1147:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMyFeatureList.g:1148:2: rule__Property__Group__0__Impl rule__Property__Group__1
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
    // InternalMyFeatureList.g:1155:1: rule__Property__Group__0__Impl : ( ( rule__Property__ConceptAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1159:1: ( ( ( rule__Property__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:1160:1: ( ( rule__Property__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1160:1: ( ( rule__Property__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:1161:2: ( rule__Property__ConceptAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:1162:2: ( rule__Property__ConceptAssignment_0 )
            // InternalMyFeatureList.g:1162:3: rule__Property__ConceptAssignment_0
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
    // InternalMyFeatureList.g:1170:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1174:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalMyFeatureList.g:1175:2: rule__Property__Group__1__Impl rule__Property__Group__2
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
    // InternalMyFeatureList.g:1182:1: rule__Property__Group__1__Impl : ( ( rule__Property__Group_1__0 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1186:1: ( ( ( rule__Property__Group_1__0 ) ) )
            // InternalMyFeatureList.g:1187:1: ( ( rule__Property__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:1187:1: ( ( rule__Property__Group_1__0 ) )
            // InternalMyFeatureList.g:1188:2: ( rule__Property__Group_1__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup_1()); 
            // InternalMyFeatureList.g:1189:2: ( rule__Property__Group_1__0 )
            // InternalMyFeatureList.g:1189:3: rule__Property__Group_1__0
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
    // InternalMyFeatureList.g:1197:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1201:1: ( rule__Property__Group__2__Impl )
            // InternalMyFeatureList.g:1202:2: rule__Property__Group__2__Impl
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
    // InternalMyFeatureList.g:1208:1: rule__Property__Group__2__Impl : ( 'lazy' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1212:1: ( ( 'lazy' ) )
            // InternalMyFeatureList.g:1213:1: ( 'lazy' )
            {
            // InternalMyFeatureList.g:1213:1: ( 'lazy' )
            // InternalMyFeatureList.g:1214:2: 'lazy'
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
    // InternalMyFeatureList.g:1224:1: rule__Property__Group_1__0 : rule__Property__Group_1__0__Impl rule__Property__Group_1__1 ;
    public final void rule__Property__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1228:1: ( rule__Property__Group_1__0__Impl rule__Property__Group_1__1 )
            // InternalMyFeatureList.g:1229:2: rule__Property__Group_1__0__Impl rule__Property__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:1236:1: rule__Property__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Property__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1240:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1241:1: ( '.' )
            {
            // InternalMyFeatureList.g:1241:1: ( '.' )
            // InternalMyFeatureList.g:1242:2: '.'
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
    // InternalMyFeatureList.g:1251:1: rule__Property__Group_1__1 : rule__Property__Group_1__1__Impl ;
    public final void rule__Property__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1255:1: ( rule__Property__Group_1__1__Impl )
            // InternalMyFeatureList.g:1256:2: rule__Property__Group_1__1__Impl
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
    // InternalMyFeatureList.g:1262:1: rule__Property__Group_1__1__Impl : ( ( rule__Property__AttributeAssignment_1_1 ) ) ;
    public final void rule__Property__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1266:1: ( ( ( rule__Property__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:1267:1: ( ( rule__Property__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:1267:1: ( ( rule__Property__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:1268:2: ( rule__Property__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getPropertyAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:1269:2: ( rule__Property__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:1269:3: rule__Property__AttributeAssignment_1_1
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
    // InternalMyFeatureList.g:1278:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1282:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalMyFeatureList.g:1283:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:1290:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__VerbAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1294:1: ( ( ( rule__Feature__VerbAssignment_0 ) ) )
            // InternalMyFeatureList.g:1295:1: ( ( rule__Feature__VerbAssignment_0 ) )
            {
            // InternalMyFeatureList.g:1295:1: ( ( rule__Feature__VerbAssignment_0 ) )
            // InternalMyFeatureList.g:1296:2: ( rule__Feature__VerbAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getVerbAssignment_0()); 
            // InternalMyFeatureList.g:1297:2: ( rule__Feature__VerbAssignment_0 )
            // InternalMyFeatureList.g:1297:3: rule__Feature__VerbAssignment_0
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
    // InternalMyFeatureList.g:1305:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1309:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalMyFeatureList.g:1310:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalMyFeatureList.g:1317:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConceptAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1321:1: ( ( ( rule__Feature__ConceptAssignment_1 ) ) )
            // InternalMyFeatureList.g:1322:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            {
            // InternalMyFeatureList.g:1322:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            // InternalMyFeatureList.g:1323:2: ( rule__Feature__ConceptAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getConceptAssignment_1()); 
            // InternalMyFeatureList.g:1324:2: ( rule__Feature__ConceptAssignment_1 )
            // InternalMyFeatureList.g:1324:3: rule__Feature__ConceptAssignment_1
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
    // InternalMyFeatureList.g:1332:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1336:1: ( rule__Feature__Group__2__Impl )
            // InternalMyFeatureList.g:1337:2: rule__Feature__Group__2__Impl
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
    // InternalMyFeatureList.g:1343:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1347:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalMyFeatureList.g:1348:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalMyFeatureList.g:1348:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalMyFeatureList.g:1349:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalMyFeatureList.g:1350:2: ( rule__Feature__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyFeatureList.g:1350:3: rule__Feature__Group_2__0
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
    // InternalMyFeatureList.g:1359:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1363:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalMyFeatureList.g:1364:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyFeatureList.g:1371:1: rule__Feature__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1375:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1376:1: ( '.' )
            {
            // InternalMyFeatureList.g:1376:1: ( '.' )
            // InternalMyFeatureList.g:1377:2: '.'
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
    // InternalMyFeatureList.g:1386:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1390:1: ( rule__Feature__Group_2__1__Impl )
            // InternalMyFeatureList.g:1391:2: rule__Feature__Group_2__1__Impl
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
    // InternalMyFeatureList.g:1397:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__AttributeAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1401:1: ( ( ( rule__Feature__AttributeAssignment_2_1 ) ) )
            // InternalMyFeatureList.g:1402:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            {
            // InternalMyFeatureList.g:1402:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            // InternalMyFeatureList.g:1403:2: ( rule__Feature__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1()); 
            // InternalMyFeatureList.g:1404:2: ( rule__Feature__AttributeAssignment_2_1 )
            // InternalMyFeatureList.g:1404:3: rule__Feature__AttributeAssignment_2_1
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


    // $ANTLR start "rule__FeatureList__ConceptAssignment_0"
    // InternalMyFeatureList.g:1413:1: rule__FeatureList__ConceptAssignment_0 : ( ruleConcept ) ;
    public final void rule__FeatureList__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1417:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:1418:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:1418:2: ( ruleConcept )
            // InternalMyFeatureList.g:1419:3: ruleConcept
            {
             before(grammarAccess.getFeatureListAccess().getConceptConceptParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getConceptConceptParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FeatureList__ConceptAssignment_0"


    // $ANTLR start "rule__FeatureList__ConstraintAssignment_2"
    // InternalMyFeatureList.g:1428:1: rule__FeatureList__ConstraintAssignment_2 : ( ruleConstraint ) ;
    public final void rule__FeatureList__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1432:1: ( ( ruleConstraint ) )
            // InternalMyFeatureList.g:1433:2: ( ruleConstraint )
            {
            // InternalMyFeatureList.g:1433:2: ( ruleConstraint )
            // InternalMyFeatureList.g:1434:3: ruleConstraint
            {
             before(grammarAccess.getFeatureListAccess().getConstraintConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getConstraintConstraintParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FeatureList__ConstraintAssignment_2"


    // $ANTLR start "rule__FeatureList__KeyAssignment_4"
    // InternalMyFeatureList.g:1443:1: rule__FeatureList__KeyAssignment_4 : ( ruleKey ) ;
    public final void rule__FeatureList__KeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1447:1: ( ( ruleKey ) )
            // InternalMyFeatureList.g:1448:2: ( ruleKey )
            {
            // InternalMyFeatureList.g:1448:2: ( ruleKey )
            // InternalMyFeatureList.g:1449:3: ruleKey
            {
             before(grammarAccess.getFeatureListAccess().getKeyKeyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getKeyKeyParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FeatureList__KeyAssignment_4"


    // $ANTLR start "rule__FeatureList__PropertyAssignment_6"
    // InternalMyFeatureList.g:1458:1: rule__FeatureList__PropertyAssignment_6 : ( ruleProperty ) ;
    public final void rule__FeatureList__PropertyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1462:1: ( ( ruleProperty ) )
            // InternalMyFeatureList.g:1463:2: ( ruleProperty )
            {
            // InternalMyFeatureList.g:1463:2: ( ruleProperty )
            // InternalMyFeatureList.g:1464:3: ruleProperty
            {
             before(grammarAccess.getFeatureListAccess().getPropertyPropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getPropertyPropertyParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FeatureList__PropertyAssignment_6"


    // $ANTLR start "rule__FeatureList__FeatureAssignment_8"
    // InternalMyFeatureList.g:1473:1: rule__FeatureList__FeatureAssignment_8 : ( ruleFeature ) ;
    public final void rule__FeatureList__FeatureAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1477:1: ( ( ruleFeature ) )
            // InternalMyFeatureList.g:1478:2: ( ruleFeature )
            {
            // InternalMyFeatureList.g:1478:2: ( ruleFeature )
            // InternalMyFeatureList.g:1479:3: ruleFeature
            {
             before(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__FeatureList__FeatureAssignment_8"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalMyFeatureList.g:1488:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1492:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1493:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1493:2: ( RULE_ID )
            // InternalMyFeatureList.g:1494:3: RULE_ID
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
    // InternalMyFeatureList.g:1503:1: rule__Concept__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Concept__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1507:1: ( ( ruleAttribute ) )
            // InternalMyFeatureList.g:1508:2: ( ruleAttribute )
            {
            // InternalMyFeatureList.g:1508:2: ( ruleAttribute )
            // InternalMyFeatureList.g:1509:3: ruleAttribute
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
    // InternalMyFeatureList.g:1518:1: rule__Attribute__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1522:1: ( ( ruleType ) )
            // InternalMyFeatureList.g:1523:2: ( ruleType )
            {
            // InternalMyFeatureList.g:1523:2: ( ruleType )
            // InternalMyFeatureList.g:1524:3: ruleType
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
    // InternalMyFeatureList.g:1533:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1537:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1538:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1538:2: ( RULE_ID )
            // InternalMyFeatureList.g:1539:3: RULE_ID
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
    // InternalMyFeatureList.g:1548:1: rule__Attribute__MultiplicityAssignment_2 : ( RULE_MULTIPLICITY ) ;
    public final void rule__Attribute__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1552:1: ( ( RULE_MULTIPLICITY ) )
            // InternalMyFeatureList.g:1553:2: ( RULE_MULTIPLICITY )
            {
            // InternalMyFeatureList.g:1553:2: ( RULE_MULTIPLICITY )
            // InternalMyFeatureList.g:1554:3: RULE_MULTIPLICITY
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
    // InternalMyFeatureList.g:1563:1: rule__Type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1567:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1568:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1568:2: ( RULE_ID )
            // InternalMyFeatureList.g:1569:3: RULE_ID
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
    // InternalMyFeatureList.g:1578:1: rule__Condition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1582:1: ( ( RULE_INT ) )
            // InternalMyFeatureList.g:1583:2: ( RULE_INT )
            {
            // InternalMyFeatureList.g:1583:2: ( RULE_INT )
            // InternalMyFeatureList.g:1584:3: RULE_INT
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
    // InternalMyFeatureList.g:1593:1: rule__Constraint__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1597:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1598:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1598:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1599:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1600:3: ( RULE_ID )
            // InternalMyFeatureList.g:1601:4: RULE_ID
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
    // InternalMyFeatureList.g:1612:1: rule__Constraint__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1616:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1617:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1617:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1618:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1619:3: ( RULE_ID )
            // InternalMyFeatureList.g:1620:4: RULE_ID
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
    // InternalMyFeatureList.g:1631:1: rule__Constraint__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Constraint__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1635:1: ( ( ruleCondition ) )
            // InternalMyFeatureList.g:1636:2: ( ruleCondition )
            {
            // InternalMyFeatureList.g:1636:2: ( ruleCondition )
            // InternalMyFeatureList.g:1637:3: ruleCondition
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
    // InternalMyFeatureList.g:1646:1: rule__Key__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Key__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1650:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1651:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1651:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1652:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1653:3: ( RULE_ID )
            // InternalMyFeatureList.g:1654:4: RULE_ID
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
    // InternalMyFeatureList.g:1665:1: rule__Key__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Key__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1669:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1670:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1670:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1671:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1672:3: ( RULE_ID )
            // InternalMyFeatureList.g:1673:4: RULE_ID
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
    // InternalMyFeatureList.g:1684:1: rule__Property__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1688:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1689:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1689:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1690:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1691:3: ( RULE_ID )
            // InternalMyFeatureList.g:1692:4: RULE_ID
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
    // InternalMyFeatureList.g:1703:1: rule__Property__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1707:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1708:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1708:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1709:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1710:3: ( RULE_ID )
            // InternalMyFeatureList.g:1711:4: RULE_ID
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
    // InternalMyFeatureList.g:1722:1: rule__Feature__VerbAssignment_0 : ( ruleVerb ) ;
    public final void rule__Feature__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1726:1: ( ( ruleVerb ) )
            // InternalMyFeatureList.g:1727:2: ( ruleVerb )
            {
            // InternalMyFeatureList.g:1727:2: ( ruleVerb )
            // InternalMyFeatureList.g:1728:3: ruleVerb
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
    // InternalMyFeatureList.g:1737:1: rule__Feature__ConceptAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1741:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1742:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1742:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1743:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); 
            // InternalMyFeatureList.g:1744:3: ( RULE_ID )
            // InternalMyFeatureList.g:1745:4: RULE_ID
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
    // InternalMyFeatureList.g:1756:1: rule__Feature__AttributeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1760:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1761:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1761:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1762:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0()); 
            // InternalMyFeatureList.g:1763:3: ( RULE_ID )
            // InternalMyFeatureList.g:1764:4: RULE_ID
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});

}