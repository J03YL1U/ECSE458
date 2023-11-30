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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'>='", "'='", "'<='", "'<'", "'Add'", "'Remove'", "'Update'", "'Display'", "'constraints'", "'keys'", "'features'", "'concept'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:228:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:229:1: ( ruleFeature EOF )
            // InternalMyFeatureList.g:230:1: ruleFeature EOF
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
    // InternalMyFeatureList.g:237:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:241:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalMyFeatureList.g:242:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalMyFeatureList.g:242:2: ( ( rule__Feature__Group__0 ) )
            // InternalMyFeatureList.g:243:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalMyFeatureList.g:244:3: ( rule__Feature__Group__0 )
            // InternalMyFeatureList.g:244:4: rule__Feature__Group__0
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
    // InternalMyFeatureList.g:253:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:257:1: ( ( ( rule__Verb__Alternatives ) ) )
            // InternalMyFeatureList.g:258:2: ( ( rule__Verb__Alternatives ) )
            {
            // InternalMyFeatureList.g:258:2: ( ( rule__Verb__Alternatives ) )
            // InternalMyFeatureList.g:259:3: ( rule__Verb__Alternatives )
            {
             before(grammarAccess.getVerbAccess().getAlternatives()); 
            // InternalMyFeatureList.g:260:3: ( rule__Verb__Alternatives )
            // InternalMyFeatureList.g:260:4: rule__Verb__Alternatives
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
    // InternalMyFeatureList.g:268:1: rule__Condition__Alternatives_0 : ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) );
    public final void rule__Condition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:272:1: ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
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
                    // InternalMyFeatureList.g:273:2: ( '>' )
                    {
                    // InternalMyFeatureList.g:273:2: ( '>' )
                    // InternalMyFeatureList.g:274:3: '>'
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:279:2: ( '>=' )
                    {
                    // InternalMyFeatureList.g:279:2: ( '>=' )
                    // InternalMyFeatureList.g:280:3: '>='
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:285:2: ( '=' )
                    {
                    // InternalMyFeatureList.g:285:2: ( '=' )
                    // InternalMyFeatureList.g:286:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:291:2: ( '<=' )
                    {
                    // InternalMyFeatureList.g:291:2: ( '<=' )
                    // InternalMyFeatureList.g:292:3: '<='
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFeatureList.g:297:2: ( '<' )
                    {
                    // InternalMyFeatureList.g:297:2: ( '<' )
                    // InternalMyFeatureList.g:298:3: '<'
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__Verb__Alternatives"
    // InternalMyFeatureList.g:307:1: rule__Verb__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:311:1: ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyFeatureList.g:312:2: ( ( 'Add' ) )
                    {
                    // InternalMyFeatureList.g:312:2: ( ( 'Add' ) )
                    // InternalMyFeatureList.g:313:3: ( 'Add' )
                    {
                     before(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalMyFeatureList.g:314:3: ( 'Add' )
                    // InternalMyFeatureList.g:314:4: 'Add'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:318:2: ( ( 'Remove' ) )
                    {
                    // InternalMyFeatureList.g:318:2: ( ( 'Remove' ) )
                    // InternalMyFeatureList.g:319:3: ( 'Remove' )
                    {
                     before(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // InternalMyFeatureList.g:320:3: ( 'Remove' )
                    // InternalMyFeatureList.g:320:4: 'Remove'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:324:2: ( ( 'Update' ) )
                    {
                    // InternalMyFeatureList.g:324:2: ( ( 'Update' ) )
                    // InternalMyFeatureList.g:325:3: ( 'Update' )
                    {
                     before(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // InternalMyFeatureList.g:326:3: ( 'Update' )
                    // InternalMyFeatureList.g:326:4: 'Update'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:330:2: ( ( 'Display' ) )
                    {
                    // InternalMyFeatureList.g:330:2: ( ( 'Display' ) )
                    // InternalMyFeatureList.g:331:3: ( 'Display' )
                    {
                     before(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); 
                    // InternalMyFeatureList.g:332:3: ( 'Display' )
                    // InternalMyFeatureList.g:332:4: 'Display'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalMyFeatureList.g:340:1: rule__FeatureList__Group__0 : rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 ;
    public final void rule__FeatureList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:344:1: ( rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 )
            // InternalMyFeatureList.g:345:2: rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1
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
    // InternalMyFeatureList.g:352:1: rule__FeatureList__Group__0__Impl : ( ( rule__FeatureList__ConceptAssignment_0 )* ) ;
    public final void rule__FeatureList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:356:1: ( ( ( rule__FeatureList__ConceptAssignment_0 )* ) )
            // InternalMyFeatureList.g:357:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            {
            // InternalMyFeatureList.g:357:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            // InternalMyFeatureList.g:358:2: ( rule__FeatureList__ConceptAssignment_0 )*
            {
             before(grammarAccess.getFeatureListAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:359:2: ( rule__FeatureList__ConceptAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFeatureList.g:359:3: rule__FeatureList__ConceptAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FeatureList__ConceptAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalMyFeatureList.g:367:1: rule__FeatureList__Group__1 : rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 ;
    public final void rule__FeatureList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:371:1: ( rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 )
            // InternalMyFeatureList.g:372:2: rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2
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
    // InternalMyFeatureList.g:379:1: rule__FeatureList__Group__1__Impl : ( 'constraints' ) ;
    public final void rule__FeatureList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:383:1: ( ( 'constraints' ) )
            // InternalMyFeatureList.g:384:1: ( 'constraints' )
            {
            // InternalMyFeatureList.g:384:1: ( 'constraints' )
            // InternalMyFeatureList.g:385:2: 'constraints'
            {
             before(grammarAccess.getFeatureListAccess().getConstraintsKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyFeatureList.g:394:1: rule__FeatureList__Group__2 : rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3 ;
    public final void rule__FeatureList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:398:1: ( rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3 )
            // InternalMyFeatureList.g:399:2: rule__FeatureList__Group__2__Impl rule__FeatureList__Group__3
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
    // InternalMyFeatureList.g:406:1: rule__FeatureList__Group__2__Impl : ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) ) ;
    public final void rule__FeatureList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:410:1: ( ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) ) )
            // InternalMyFeatureList.g:411:1: ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) )
            {
            // InternalMyFeatureList.g:411:1: ( ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* ) )
            // InternalMyFeatureList.g:412:2: ( ( rule__FeatureList__ConstraintAssignment_2 ) ) ( ( rule__FeatureList__ConstraintAssignment_2 )* )
            {
            // InternalMyFeatureList.g:412:2: ( ( rule__FeatureList__ConstraintAssignment_2 ) )
            // InternalMyFeatureList.g:413:3: ( rule__FeatureList__ConstraintAssignment_2 )
            {
             before(grammarAccess.getFeatureListAccess().getConstraintAssignment_2()); 
            // InternalMyFeatureList.g:414:3: ( rule__FeatureList__ConstraintAssignment_2 )
            // InternalMyFeatureList.g:414:4: rule__FeatureList__ConstraintAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__FeatureList__ConstraintAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getConstraintAssignment_2()); 

            }

            // InternalMyFeatureList.g:417:2: ( ( rule__FeatureList__ConstraintAssignment_2 )* )
            // InternalMyFeatureList.g:418:3: ( rule__FeatureList__ConstraintAssignment_2 )*
            {
             before(grammarAccess.getFeatureListAccess().getConstraintAssignment_2()); 
            // InternalMyFeatureList.g:419:3: ( rule__FeatureList__ConstraintAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyFeatureList.g:419:4: rule__FeatureList__ConstraintAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FeatureList__ConstraintAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMyFeatureList.g:428:1: rule__FeatureList__Group__3 : rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 ;
    public final void rule__FeatureList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:432:1: ( rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4 )
            // InternalMyFeatureList.g:433:2: rule__FeatureList__Group__3__Impl rule__FeatureList__Group__4
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
    // InternalMyFeatureList.g:440:1: rule__FeatureList__Group__3__Impl : ( 'keys' ) ;
    public final void rule__FeatureList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:444:1: ( ( 'keys' ) )
            // InternalMyFeatureList.g:445:1: ( 'keys' )
            {
            // InternalMyFeatureList.g:445:1: ( 'keys' )
            // InternalMyFeatureList.g:446:2: 'keys'
            {
             before(grammarAccess.getFeatureListAccess().getKeysKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyFeatureList.g:455:1: rule__FeatureList__Group__4 : rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 ;
    public final void rule__FeatureList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:459:1: ( rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5 )
            // InternalMyFeatureList.g:460:2: rule__FeatureList__Group__4__Impl rule__FeatureList__Group__5
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
    // InternalMyFeatureList.g:467:1: rule__FeatureList__Group__4__Impl : ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) ) ;
    public final void rule__FeatureList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:471:1: ( ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) ) )
            // InternalMyFeatureList.g:472:1: ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) )
            {
            // InternalMyFeatureList.g:472:1: ( ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* ) )
            // InternalMyFeatureList.g:473:2: ( ( rule__FeatureList__KeyAssignment_4 ) ) ( ( rule__FeatureList__KeyAssignment_4 )* )
            {
            // InternalMyFeatureList.g:473:2: ( ( rule__FeatureList__KeyAssignment_4 ) )
            // InternalMyFeatureList.g:474:3: ( rule__FeatureList__KeyAssignment_4 )
            {
             before(grammarAccess.getFeatureListAccess().getKeyAssignment_4()); 
            // InternalMyFeatureList.g:475:3: ( rule__FeatureList__KeyAssignment_4 )
            // InternalMyFeatureList.g:475:4: rule__FeatureList__KeyAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__FeatureList__KeyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getKeyAssignment_4()); 

            }

            // InternalMyFeatureList.g:478:2: ( ( rule__FeatureList__KeyAssignment_4 )* )
            // InternalMyFeatureList.g:479:3: ( rule__FeatureList__KeyAssignment_4 )*
            {
             before(grammarAccess.getFeatureListAccess().getKeyAssignment_4()); 
            // InternalMyFeatureList.g:480:3: ( rule__FeatureList__KeyAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFeatureList.g:480:4: rule__FeatureList__KeyAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FeatureList__KeyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMyFeatureList.g:489:1: rule__FeatureList__Group__5 : rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 ;
    public final void rule__FeatureList__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:493:1: ( rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6 )
            // InternalMyFeatureList.g:494:2: rule__FeatureList__Group__5__Impl rule__FeatureList__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyFeatureList.g:501:1: rule__FeatureList__Group__5__Impl : ( 'features' ) ;
    public final void rule__FeatureList__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:505:1: ( ( 'features' ) )
            // InternalMyFeatureList.g:506:1: ( 'features' )
            {
            // InternalMyFeatureList.g:506:1: ( 'features' )
            // InternalMyFeatureList.g:507:2: 'features'
            {
             before(grammarAccess.getFeatureListAccess().getFeaturesKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFeatureListAccess().getFeaturesKeyword_5()); 

            }


            }

        }
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
    // InternalMyFeatureList.g:516:1: rule__FeatureList__Group__6 : rule__FeatureList__Group__6__Impl ;
    public final void rule__FeatureList__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:520:1: ( rule__FeatureList__Group__6__Impl )
            // InternalMyFeatureList.g:521:2: rule__FeatureList__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__6__Impl();

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
    // InternalMyFeatureList.g:527:1: rule__FeatureList__Group__6__Impl : ( ( ( rule__FeatureList__FeatureAssignment_6 ) ) ( ( rule__FeatureList__FeatureAssignment_6 )* ) ) ;
    public final void rule__FeatureList__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:531:1: ( ( ( ( rule__FeatureList__FeatureAssignment_6 ) ) ( ( rule__FeatureList__FeatureAssignment_6 )* ) ) )
            // InternalMyFeatureList.g:532:1: ( ( ( rule__FeatureList__FeatureAssignment_6 ) ) ( ( rule__FeatureList__FeatureAssignment_6 )* ) )
            {
            // InternalMyFeatureList.g:532:1: ( ( ( rule__FeatureList__FeatureAssignment_6 ) ) ( ( rule__FeatureList__FeatureAssignment_6 )* ) )
            // InternalMyFeatureList.g:533:2: ( ( rule__FeatureList__FeatureAssignment_6 ) ) ( ( rule__FeatureList__FeatureAssignment_6 )* )
            {
            // InternalMyFeatureList.g:533:2: ( ( rule__FeatureList__FeatureAssignment_6 ) )
            // InternalMyFeatureList.g:534:3: ( rule__FeatureList__FeatureAssignment_6 )
            {
             before(grammarAccess.getFeatureListAccess().getFeatureAssignment_6()); 
            // InternalMyFeatureList.g:535:3: ( rule__FeatureList__FeatureAssignment_6 )
            // InternalMyFeatureList.g:535:4: rule__FeatureList__FeatureAssignment_6
            {
            pushFollow(FOLLOW_10);
            rule__FeatureList__FeatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getFeatureAssignment_6()); 

            }

            // InternalMyFeatureList.g:538:2: ( ( rule__FeatureList__FeatureAssignment_6 )* )
            // InternalMyFeatureList.g:539:3: ( rule__FeatureList__FeatureAssignment_6 )*
            {
             before(grammarAccess.getFeatureListAccess().getFeatureAssignment_6()); 
            // InternalMyFeatureList.g:540:3: ( rule__FeatureList__FeatureAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFeatureList.g:540:4: rule__FeatureList__FeatureAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FeatureList__FeatureAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getFeatureAssignment_6()); 

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


    // $ANTLR start "rule__Concept__Group__0"
    // InternalMyFeatureList.g:550:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:554:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalMyFeatureList.g:555:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
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
    // InternalMyFeatureList.g:562:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:566:1: ( ( 'concept' ) )
            // InternalMyFeatureList.g:567:1: ( 'concept' )
            {
            // InternalMyFeatureList.g:567:1: ( 'concept' )
            // InternalMyFeatureList.g:568:2: 'concept'
            {
             before(grammarAccess.getConceptAccess().getConceptKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyFeatureList.g:577:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:581:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalMyFeatureList.g:582:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
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
    // InternalMyFeatureList.g:589:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:593:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:594:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:594:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalMyFeatureList.g:595:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:596:2: ( rule__Concept__NameAssignment_1 )
            // InternalMyFeatureList.g:596:3: rule__Concept__NameAssignment_1
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
    // InternalMyFeatureList.g:604:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:608:1: ( rule__Concept__Group__2__Impl )
            // InternalMyFeatureList.g:609:2: rule__Concept__Group__2__Impl
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
    // InternalMyFeatureList.g:615:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__AttributesAssignment_2 )* ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:619:1: ( ( ( rule__Concept__AttributesAssignment_2 )* ) )
            // InternalMyFeatureList.g:620:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            {
            // InternalMyFeatureList.g:620:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            // InternalMyFeatureList.g:621:2: ( rule__Concept__AttributesAssignment_2 )*
            {
             before(grammarAccess.getConceptAccess().getAttributesAssignment_2()); 
            // InternalMyFeatureList.g:622:2: ( rule__Concept__AttributesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyFeatureList.g:622:3: rule__Concept__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Concept__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyFeatureList.g:631:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:635:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyFeatureList.g:636:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMyFeatureList.g:643:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:647:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalMyFeatureList.g:648:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalMyFeatureList.g:648:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalMyFeatureList.g:649:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalMyFeatureList.g:650:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalMyFeatureList.g:650:3: rule__Attribute__TypeAssignment_0
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
    // InternalMyFeatureList.g:658:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:662:1: ( rule__Attribute__Group__1__Impl )
            // InternalMyFeatureList.g:663:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1__Impl();

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
    // InternalMyFeatureList.g:669:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:673:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:674:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:674:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyFeatureList.g:675:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:676:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyFeatureList.g:676:3: rule__Attribute__NameAssignment_1
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


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMyFeatureList.g:685:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:689:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMyFeatureList.g:690:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyFeatureList.g:697:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Alternatives_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:701:1: ( ( ( rule__Condition__Alternatives_0 ) ) )
            // InternalMyFeatureList.g:702:1: ( ( rule__Condition__Alternatives_0 ) )
            {
            // InternalMyFeatureList.g:702:1: ( ( rule__Condition__Alternatives_0 ) )
            // InternalMyFeatureList.g:703:2: ( rule__Condition__Alternatives_0 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_0()); 
            // InternalMyFeatureList.g:704:2: ( rule__Condition__Alternatives_0 )
            // InternalMyFeatureList.g:704:3: rule__Condition__Alternatives_0
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
    // InternalMyFeatureList.g:712:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:716:1: ( rule__Condition__Group__1__Impl )
            // InternalMyFeatureList.g:717:2: rule__Condition__Group__1__Impl
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
    // InternalMyFeatureList.g:723:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ValueAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:727:1: ( ( ( rule__Condition__ValueAssignment_1 ) ) )
            // InternalMyFeatureList.g:728:1: ( ( rule__Condition__ValueAssignment_1 ) )
            {
            // InternalMyFeatureList.g:728:1: ( ( rule__Condition__ValueAssignment_1 ) )
            // InternalMyFeatureList.g:729:2: ( rule__Condition__ValueAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1()); 
            // InternalMyFeatureList.g:730:2: ( rule__Condition__ValueAssignment_1 )
            // InternalMyFeatureList.g:730:3: rule__Condition__ValueAssignment_1
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
    // InternalMyFeatureList.g:739:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:743:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalMyFeatureList.g:744:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyFeatureList.g:751:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__ConceptAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:755:1: ( ( ( rule__Constraint__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:756:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:756:1: ( ( rule__Constraint__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:757:2: ( rule__Constraint__ConceptAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:758:2: ( rule__Constraint__ConceptAssignment_0 )
            // InternalMyFeatureList.g:758:3: rule__Constraint__ConceptAssignment_0
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
    // InternalMyFeatureList.g:766:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:770:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalMyFeatureList.g:771:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyFeatureList.g:778:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__Group_1__0 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:782:1: ( ( ( rule__Constraint__Group_1__0 ) ) )
            // InternalMyFeatureList.g:783:1: ( ( rule__Constraint__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:783:1: ( ( rule__Constraint__Group_1__0 ) )
            // InternalMyFeatureList.g:784:2: ( rule__Constraint__Group_1__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup_1()); 
            // InternalMyFeatureList.g:785:2: ( rule__Constraint__Group_1__0 )
            // InternalMyFeatureList.g:785:3: rule__Constraint__Group_1__0
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
    // InternalMyFeatureList.g:793:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:797:1: ( rule__Constraint__Group__2__Impl )
            // InternalMyFeatureList.g:798:2: rule__Constraint__Group__2__Impl
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
    // InternalMyFeatureList.g:804:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ConditionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:808:1: ( ( ( rule__Constraint__ConditionAssignment_2 ) ) )
            // InternalMyFeatureList.g:809:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            {
            // InternalMyFeatureList.g:809:1: ( ( rule__Constraint__ConditionAssignment_2 ) )
            // InternalMyFeatureList.g:810:2: ( rule__Constraint__ConditionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getConditionAssignment_2()); 
            // InternalMyFeatureList.g:811:2: ( rule__Constraint__ConditionAssignment_2 )
            // InternalMyFeatureList.g:811:3: rule__Constraint__ConditionAssignment_2
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
    // InternalMyFeatureList.g:820:1: rule__Constraint__Group_1__0 : rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 ;
    public final void rule__Constraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:824:1: ( rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1 )
            // InternalMyFeatureList.g:825:2: rule__Constraint__Group_1__0__Impl rule__Constraint__Group_1__1
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
    // InternalMyFeatureList.g:832:1: rule__Constraint__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Constraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:836:1: ( ( '.' ) )
            // InternalMyFeatureList.g:837:1: ( '.' )
            {
            // InternalMyFeatureList.g:837:1: ( '.' )
            // InternalMyFeatureList.g:838:2: '.'
            {
             before(grammarAccess.getConstraintAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyFeatureList.g:847:1: rule__Constraint__Group_1__1 : rule__Constraint__Group_1__1__Impl ;
    public final void rule__Constraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:851:1: ( rule__Constraint__Group_1__1__Impl )
            // InternalMyFeatureList.g:852:2: rule__Constraint__Group_1__1__Impl
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
    // InternalMyFeatureList.g:858:1: rule__Constraint__Group_1__1__Impl : ( ( rule__Constraint__AttributeAssignment_1_1 ) ) ;
    public final void rule__Constraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:862:1: ( ( ( rule__Constraint__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:863:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:863:1: ( ( rule__Constraint__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:864:2: ( rule__Constraint__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:865:2: ( rule__Constraint__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:865:3: rule__Constraint__AttributeAssignment_1_1
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
    // InternalMyFeatureList.g:874:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:878:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalMyFeatureList.g:879:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyFeatureList.g:886:1: rule__Key__Group__0__Impl : ( ( rule__Key__ConceptAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:890:1: ( ( ( rule__Key__ConceptAssignment_0 ) ) )
            // InternalMyFeatureList.g:891:1: ( ( rule__Key__ConceptAssignment_0 ) )
            {
            // InternalMyFeatureList.g:891:1: ( ( rule__Key__ConceptAssignment_0 ) )
            // InternalMyFeatureList.g:892:2: ( rule__Key__ConceptAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:893:2: ( rule__Key__ConceptAssignment_0 )
            // InternalMyFeatureList.g:893:3: rule__Key__ConceptAssignment_0
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
    // InternalMyFeatureList.g:901:1: rule__Key__Group__1 : rule__Key__Group__1__Impl ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:905:1: ( rule__Key__Group__1__Impl )
            // InternalMyFeatureList.g:906:2: rule__Key__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Key__Group__1__Impl();

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
    // InternalMyFeatureList.g:912:1: rule__Key__Group__1__Impl : ( ( rule__Key__Group_1__0 ) ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:916:1: ( ( ( rule__Key__Group_1__0 ) ) )
            // InternalMyFeatureList.g:917:1: ( ( rule__Key__Group_1__0 ) )
            {
            // InternalMyFeatureList.g:917:1: ( ( rule__Key__Group_1__0 ) )
            // InternalMyFeatureList.g:918:2: ( rule__Key__Group_1__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup_1()); 
            // InternalMyFeatureList.g:919:2: ( rule__Key__Group_1__0 )
            // InternalMyFeatureList.g:919:3: rule__Key__Group_1__0
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


    // $ANTLR start "rule__Key__Group_1__0"
    // InternalMyFeatureList.g:928:1: rule__Key__Group_1__0 : rule__Key__Group_1__0__Impl rule__Key__Group_1__1 ;
    public final void rule__Key__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:932:1: ( rule__Key__Group_1__0__Impl rule__Key__Group_1__1 )
            // InternalMyFeatureList.g:933:2: rule__Key__Group_1__0__Impl rule__Key__Group_1__1
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
    // InternalMyFeatureList.g:940:1: rule__Key__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Key__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:944:1: ( ( '.' ) )
            // InternalMyFeatureList.g:945:1: ( '.' )
            {
            // InternalMyFeatureList.g:945:1: ( '.' )
            // InternalMyFeatureList.g:946:2: '.'
            {
             before(grammarAccess.getKeyAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyFeatureList.g:955:1: rule__Key__Group_1__1 : rule__Key__Group_1__1__Impl ;
    public final void rule__Key__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:959:1: ( rule__Key__Group_1__1__Impl )
            // InternalMyFeatureList.g:960:2: rule__Key__Group_1__1__Impl
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
    // InternalMyFeatureList.g:966:1: rule__Key__Group_1__1__Impl : ( ( rule__Key__AttributeAssignment_1_1 ) ) ;
    public final void rule__Key__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:970:1: ( ( ( rule__Key__AttributeAssignment_1_1 ) ) )
            // InternalMyFeatureList.g:971:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            {
            // InternalMyFeatureList.g:971:1: ( ( rule__Key__AttributeAssignment_1_1 ) )
            // InternalMyFeatureList.g:972:2: ( rule__Key__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getKeyAccess().getAttributeAssignment_1_1()); 
            // InternalMyFeatureList.g:973:2: ( rule__Key__AttributeAssignment_1_1 )
            // InternalMyFeatureList.g:973:3: rule__Key__AttributeAssignment_1_1
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


    // $ANTLR start "rule__Feature__Group__0"
    // InternalMyFeatureList.g:982:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:986:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalMyFeatureList.g:987:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalMyFeatureList.g:994:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__VerbAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:998:1: ( ( ( rule__Feature__VerbAssignment_0 ) ) )
            // InternalMyFeatureList.g:999:1: ( ( rule__Feature__VerbAssignment_0 ) )
            {
            // InternalMyFeatureList.g:999:1: ( ( rule__Feature__VerbAssignment_0 ) )
            // InternalMyFeatureList.g:1000:2: ( rule__Feature__VerbAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getVerbAssignment_0()); 
            // InternalMyFeatureList.g:1001:2: ( rule__Feature__VerbAssignment_0 )
            // InternalMyFeatureList.g:1001:3: rule__Feature__VerbAssignment_0
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
    // InternalMyFeatureList.g:1009:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1013:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalMyFeatureList.g:1014:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyFeatureList.g:1021:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConceptAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1025:1: ( ( ( rule__Feature__ConceptAssignment_1 ) ) )
            // InternalMyFeatureList.g:1026:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            {
            // InternalMyFeatureList.g:1026:1: ( ( rule__Feature__ConceptAssignment_1 ) )
            // InternalMyFeatureList.g:1027:2: ( rule__Feature__ConceptAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getConceptAssignment_1()); 
            // InternalMyFeatureList.g:1028:2: ( rule__Feature__ConceptAssignment_1 )
            // InternalMyFeatureList.g:1028:3: rule__Feature__ConceptAssignment_1
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
    // InternalMyFeatureList.g:1036:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1040:1: ( rule__Feature__Group__2__Impl )
            // InternalMyFeatureList.g:1041:2: rule__Feature__Group__2__Impl
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
    // InternalMyFeatureList.g:1047:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1051:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalMyFeatureList.g:1052:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalMyFeatureList.g:1052:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalMyFeatureList.g:1053:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalMyFeatureList.g:1054:2: ( rule__Feature__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyFeatureList.g:1054:3: rule__Feature__Group_2__0
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
    // InternalMyFeatureList.g:1063:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1067:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalMyFeatureList.g:1068:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
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
    // InternalMyFeatureList.g:1075:1: rule__Feature__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1079:1: ( ( '.' ) )
            // InternalMyFeatureList.g:1080:1: ( '.' )
            {
            // InternalMyFeatureList.g:1080:1: ( '.' )
            // InternalMyFeatureList.g:1081:2: '.'
            {
             before(grammarAccess.getFeatureAccess().getFullStopKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyFeatureList.g:1090:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1094:1: ( rule__Feature__Group_2__1__Impl )
            // InternalMyFeatureList.g:1095:2: rule__Feature__Group_2__1__Impl
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
    // InternalMyFeatureList.g:1101:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__AttributeAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1105:1: ( ( ( rule__Feature__AttributeAssignment_2_1 ) ) )
            // InternalMyFeatureList.g:1106:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            {
            // InternalMyFeatureList.g:1106:1: ( ( rule__Feature__AttributeAssignment_2_1 ) )
            // InternalMyFeatureList.g:1107:2: ( rule__Feature__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1()); 
            // InternalMyFeatureList.g:1108:2: ( rule__Feature__AttributeAssignment_2_1 )
            // InternalMyFeatureList.g:1108:3: rule__Feature__AttributeAssignment_2_1
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
    // InternalMyFeatureList.g:1117:1: rule__FeatureList__ConceptAssignment_0 : ( ruleConcept ) ;
    public final void rule__FeatureList__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1121:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:1122:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:1122:2: ( ruleConcept )
            // InternalMyFeatureList.g:1123:3: ruleConcept
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
    // InternalMyFeatureList.g:1132:1: rule__FeatureList__ConstraintAssignment_2 : ( ruleConstraint ) ;
    public final void rule__FeatureList__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1136:1: ( ( ruleConstraint ) )
            // InternalMyFeatureList.g:1137:2: ( ruleConstraint )
            {
            // InternalMyFeatureList.g:1137:2: ( ruleConstraint )
            // InternalMyFeatureList.g:1138:3: ruleConstraint
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
    // InternalMyFeatureList.g:1147:1: rule__FeatureList__KeyAssignment_4 : ( ruleKey ) ;
    public final void rule__FeatureList__KeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1151:1: ( ( ruleKey ) )
            // InternalMyFeatureList.g:1152:2: ( ruleKey )
            {
            // InternalMyFeatureList.g:1152:2: ( ruleKey )
            // InternalMyFeatureList.g:1153:3: ruleKey
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


    // $ANTLR start "rule__FeatureList__FeatureAssignment_6"
    // InternalMyFeatureList.g:1162:1: rule__FeatureList__FeatureAssignment_6 : ( ruleFeature ) ;
    public final void rule__FeatureList__FeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1166:1: ( ( ruleFeature ) )
            // InternalMyFeatureList.g:1167:2: ( ruleFeature )
            {
            // InternalMyFeatureList.g:1167:2: ( ruleFeature )
            // InternalMyFeatureList.g:1168:3: ruleFeature
            {
             before(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__FeatureAssignment_6"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalMyFeatureList.g:1177:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1181:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1182:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1182:2: ( RULE_ID )
            // InternalMyFeatureList.g:1183:3: RULE_ID
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
    // InternalMyFeatureList.g:1192:1: rule__Concept__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Concept__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1196:1: ( ( ruleAttribute ) )
            // InternalMyFeatureList.g:1197:2: ( ruleAttribute )
            {
            // InternalMyFeatureList.g:1197:2: ( ruleAttribute )
            // InternalMyFeatureList.g:1198:3: ruleAttribute
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
    // InternalMyFeatureList.g:1207:1: rule__Attribute__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1211:1: ( ( ruleType ) )
            // InternalMyFeatureList.g:1212:2: ( ruleType )
            {
            // InternalMyFeatureList.g:1212:2: ( ruleType )
            // InternalMyFeatureList.g:1213:3: ruleType
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
    // InternalMyFeatureList.g:1222:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1226:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1227:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1227:2: ( RULE_ID )
            // InternalMyFeatureList.g:1228:3: RULE_ID
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


    // $ANTLR start "rule__Type__NameAssignment"
    // InternalMyFeatureList.g:1237:1: rule__Type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1241:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1242:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:1242:2: ( RULE_ID )
            // InternalMyFeatureList.g:1243:3: RULE_ID
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
    // InternalMyFeatureList.g:1252:1: rule__Condition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1256:1: ( ( RULE_INT ) )
            // InternalMyFeatureList.g:1257:2: ( RULE_INT )
            {
            // InternalMyFeatureList.g:1257:2: ( RULE_INT )
            // InternalMyFeatureList.g:1258:3: RULE_INT
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
    // InternalMyFeatureList.g:1267:1: rule__Constraint__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1271:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1272:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1272:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1273:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1274:3: ( RULE_ID )
            // InternalMyFeatureList.g:1275:4: RULE_ID
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
    // InternalMyFeatureList.g:1286:1: rule__Constraint__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1290:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1291:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1291:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1292:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1293:3: ( RULE_ID )
            // InternalMyFeatureList.g:1294:4: RULE_ID
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
    // InternalMyFeatureList.g:1305:1: rule__Constraint__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Constraint__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1309:1: ( ( ruleCondition ) )
            // InternalMyFeatureList.g:1310:2: ( ruleCondition )
            {
            // InternalMyFeatureList.g:1310:2: ( ruleCondition )
            // InternalMyFeatureList.g:1311:3: ruleCondition
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
    // InternalMyFeatureList.g:1320:1: rule__Key__ConceptAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Key__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1324:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1325:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1325:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1326:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0()); 
            // InternalMyFeatureList.g:1327:3: ( RULE_ID )
            // InternalMyFeatureList.g:1328:4: RULE_ID
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
    // InternalMyFeatureList.g:1339:1: rule__Key__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Key__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1343:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1344:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1344:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1345:3: ( RULE_ID )
            {
             before(grammarAccess.getKeyAccess().getAttributeAttributeCrossReference_1_1_0()); 
            // InternalMyFeatureList.g:1346:3: ( RULE_ID )
            // InternalMyFeatureList.g:1347:4: RULE_ID
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


    // $ANTLR start "rule__Feature__VerbAssignment_0"
    // InternalMyFeatureList.g:1358:1: rule__Feature__VerbAssignment_0 : ( ruleVerb ) ;
    public final void rule__Feature__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1362:1: ( ( ruleVerb ) )
            // InternalMyFeatureList.g:1363:2: ( ruleVerb )
            {
            // InternalMyFeatureList.g:1363:2: ( ruleVerb )
            // InternalMyFeatureList.g:1364:3: ruleVerb
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
    // InternalMyFeatureList.g:1373:1: rule__Feature__ConceptAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1377:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1378:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1378:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1379:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0()); 
            // InternalMyFeatureList.g:1380:3: ( RULE_ID )
            // InternalMyFeatureList.g:1381:4: RULE_ID
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
    // InternalMyFeatureList.g:1392:1: rule__Feature__AttributeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1396:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1397:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1397:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1398:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0()); 
            // InternalMyFeatureList.g:1399:3: ( RULE_ID )
            // InternalMyFeatureList.g:1400:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000F800L});

}