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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'>='", "'='", "'<='", "'<'", "'Add'", "'Remove'", "'Update'", "'Display'", "'features'", "'concept'", "'['", "']'", "'.'"
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
    // InternalMyFeatureList.g:112:1: ruleAttribute : ( ( rule__Attribute__NameAssignment ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:116:2: ( ( ( rule__Attribute__NameAssignment ) ) )
            // InternalMyFeatureList.g:117:2: ( ( rule__Attribute__NameAssignment ) )
            {
            // InternalMyFeatureList.g:117:2: ( ( rule__Attribute__NameAssignment ) )
            // InternalMyFeatureList.g:118:3: ( rule__Attribute__NameAssignment )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment()); 
            // InternalMyFeatureList.g:119:3: ( rule__Attribute__NameAssignment )
            // InternalMyFeatureList.g:119:4: rule__Attribute__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCondition"
    // InternalMyFeatureList.g:128:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:129:1: ( ruleCondition EOF )
            // InternalMyFeatureList.g:130:1: ruleCondition EOF
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
    // InternalMyFeatureList.g:137:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:141:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalMyFeatureList.g:142:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalMyFeatureList.g:142:2: ( ( rule__Condition__Group__0 ) )
            // InternalMyFeatureList.g:143:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalMyFeatureList.g:144:3: ( rule__Condition__Group__0 )
            // InternalMyFeatureList.g:144:4: rule__Condition__Group__0
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


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyFeatureList.g:153:1: entryRuleDotExpression : ruleDotExpression EOF ;
    public final void entryRuleDotExpression() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:154:1: ( ruleDotExpression EOF )
            // InternalMyFeatureList.g:155:1: ruleDotExpression EOF
            {
             before(grammarAccess.getDotExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleDotExpression();

            state._fsp--;

             after(grammarAccess.getDotExpressionRule()); 
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
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalMyFeatureList.g:162:1: ruleDotExpression : ( ( rule__DotExpression__Group__0 ) ) ;
    public final void ruleDotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:166:2: ( ( ( rule__DotExpression__Group__0 ) ) )
            // InternalMyFeatureList.g:167:2: ( ( rule__DotExpression__Group__0 ) )
            {
            // InternalMyFeatureList.g:167:2: ( ( rule__DotExpression__Group__0 ) )
            // InternalMyFeatureList.g:168:3: ( rule__DotExpression__Group__0 )
            {
             before(grammarAccess.getDotExpressionAccess().getGroup()); 
            // InternalMyFeatureList.g:169:3: ( rule__DotExpression__Group__0 )
            // InternalMyFeatureList.g:169:4: rule__DotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleConceptRef"
    // InternalMyFeatureList.g:178:1: entryRuleConceptRef : ruleConceptRef EOF ;
    public final void entryRuleConceptRef() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:179:1: ( ruleConceptRef EOF )
            // InternalMyFeatureList.g:180:1: ruleConceptRef EOF
            {
             before(grammarAccess.getConceptRefRule()); 
            pushFollow(FOLLOW_1);
            ruleConceptRef();

            state._fsp--;

             after(grammarAccess.getConceptRefRule()); 
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
    // $ANTLR end "entryRuleConceptRef"


    // $ANTLR start "ruleConceptRef"
    // InternalMyFeatureList.g:187:1: ruleConceptRef : ( ( rule__ConceptRef__Group__0 ) ) ;
    public final void ruleConceptRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:191:2: ( ( ( rule__ConceptRef__Group__0 ) ) )
            // InternalMyFeatureList.g:192:2: ( ( rule__ConceptRef__Group__0 ) )
            {
            // InternalMyFeatureList.g:192:2: ( ( rule__ConceptRef__Group__0 ) )
            // InternalMyFeatureList.g:193:3: ( rule__ConceptRef__Group__0 )
            {
             before(grammarAccess.getConceptRefAccess().getGroup()); 
            // InternalMyFeatureList.g:194:3: ( rule__ConceptRef__Group__0 )
            // InternalMyFeatureList.g:194:4: rule__ConceptRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConceptRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConceptRef"


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:203:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:204:1: ( ruleFeature EOF )
            // InternalMyFeatureList.g:205:1: ruleFeature EOF
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
    // InternalMyFeatureList.g:212:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:216:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalMyFeatureList.g:217:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalMyFeatureList.g:217:2: ( ( rule__Feature__Group__0 ) )
            // InternalMyFeatureList.g:218:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalMyFeatureList.g:219:3: ( rule__Feature__Group__0 )
            // InternalMyFeatureList.g:219:4: rule__Feature__Group__0
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
    // InternalMyFeatureList.g:228:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:232:1: ( ( ( rule__Verb__Alternatives ) ) )
            // InternalMyFeatureList.g:233:2: ( ( rule__Verb__Alternatives ) )
            {
            // InternalMyFeatureList.g:233:2: ( ( rule__Verb__Alternatives ) )
            // InternalMyFeatureList.g:234:3: ( rule__Verb__Alternatives )
            {
             before(grammarAccess.getVerbAccess().getAlternatives()); 
            // InternalMyFeatureList.g:235:3: ( rule__Verb__Alternatives )
            // InternalMyFeatureList.g:235:4: rule__Verb__Alternatives
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


    // $ANTLR start "rule__Condition__Alternatives_1"
    // InternalMyFeatureList.g:243:1: rule__Condition__Alternatives_1 : ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:247:1: ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<=' ) | ( '<' ) )
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
                    // InternalMyFeatureList.g:248:2: ( '>' )
                    {
                    // InternalMyFeatureList.g:248:2: ( '>' )
                    // InternalMyFeatureList.g:249:3: '>'
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:254:2: ( '>=' )
                    {
                    // InternalMyFeatureList.g:254:2: ( '>=' )
                    // InternalMyFeatureList.g:255:3: '>='
                    {
                     before(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:260:2: ( '=' )
                    {
                    // InternalMyFeatureList.g:260:2: ( '=' )
                    // InternalMyFeatureList.g:261:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_1_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:266:2: ( '<=' )
                    {
                    // InternalMyFeatureList.g:266:2: ( '<=' )
                    // InternalMyFeatureList.g:267:3: '<='
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_1_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyFeatureList.g:272:2: ( '<' )
                    {
                    // InternalMyFeatureList.g:272:2: ( '<' )
                    // InternalMyFeatureList.g:273:3: '<'
                    {
                     before(grammarAccess.getConditionAccess().getLessThanSignKeyword_1_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getLessThanSignKeyword_1_4()); 

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
    // $ANTLR end "rule__Condition__Alternatives_1"


    // $ANTLR start "rule__Verb__Alternatives"
    // InternalMyFeatureList.g:282:1: rule__Verb__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:286:1: ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) )
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
                    // InternalMyFeatureList.g:287:2: ( ( 'Add' ) )
                    {
                    // InternalMyFeatureList.g:287:2: ( ( 'Add' ) )
                    // InternalMyFeatureList.g:288:3: ( 'Add' )
                    {
                     before(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalMyFeatureList.g:289:3: ( 'Add' )
                    // InternalMyFeatureList.g:289:4: 'Add'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:293:2: ( ( 'Remove' ) )
                    {
                    // InternalMyFeatureList.g:293:2: ( ( 'Remove' ) )
                    // InternalMyFeatureList.g:294:3: ( 'Remove' )
                    {
                     before(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // InternalMyFeatureList.g:295:3: ( 'Remove' )
                    // InternalMyFeatureList.g:295:4: 'Remove'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:299:2: ( ( 'Update' ) )
                    {
                    // InternalMyFeatureList.g:299:2: ( ( 'Update' ) )
                    // InternalMyFeatureList.g:300:3: ( 'Update' )
                    {
                     before(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // InternalMyFeatureList.g:301:3: ( 'Update' )
                    // InternalMyFeatureList.g:301:4: 'Update'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:305:2: ( ( 'Display' ) )
                    {
                    // InternalMyFeatureList.g:305:2: ( ( 'Display' ) )
                    // InternalMyFeatureList.g:306:3: ( 'Display' )
                    {
                     before(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); 
                    // InternalMyFeatureList.g:307:3: ( 'Display' )
                    // InternalMyFeatureList.g:307:4: 'Display'
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
    // InternalMyFeatureList.g:315:1: rule__FeatureList__Group__0 : rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 ;
    public final void rule__FeatureList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:319:1: ( rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 )
            // InternalMyFeatureList.g:320:2: rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1
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
    // InternalMyFeatureList.g:327:1: rule__FeatureList__Group__0__Impl : ( ( rule__FeatureList__ConceptAssignment_0 )* ) ;
    public final void rule__FeatureList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:331:1: ( ( ( rule__FeatureList__ConceptAssignment_0 )* ) )
            // InternalMyFeatureList.g:332:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            {
            // InternalMyFeatureList.g:332:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            // InternalMyFeatureList.g:333:2: ( rule__FeatureList__ConceptAssignment_0 )*
            {
             before(grammarAccess.getFeatureListAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:334:2: ( rule__FeatureList__ConceptAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFeatureList.g:334:3: rule__FeatureList__ConceptAssignment_0
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
    // InternalMyFeatureList.g:342:1: rule__FeatureList__Group__1 : rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 ;
    public final void rule__FeatureList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:346:1: ( rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2 )
            // InternalMyFeatureList.g:347:2: rule__FeatureList__Group__1__Impl rule__FeatureList__Group__2
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
    // InternalMyFeatureList.g:354:1: rule__FeatureList__Group__1__Impl : ( 'features' ) ;
    public final void rule__FeatureList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:358:1: ( ( 'features' ) )
            // InternalMyFeatureList.g:359:1: ( 'features' )
            {
            // InternalMyFeatureList.g:359:1: ( 'features' )
            // InternalMyFeatureList.g:360:2: 'features'
            {
             before(grammarAccess.getFeatureListAccess().getFeaturesKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFeatureListAccess().getFeaturesKeyword_1()); 

            }


            }

        }
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
    // InternalMyFeatureList.g:369:1: rule__FeatureList__Group__2 : rule__FeatureList__Group__2__Impl ;
    public final void rule__FeatureList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:373:1: ( rule__FeatureList__Group__2__Impl )
            // InternalMyFeatureList.g:374:2: rule__FeatureList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__2__Impl();

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
    // InternalMyFeatureList.g:380:1: rule__FeatureList__Group__2__Impl : ( ( ( rule__FeatureList__FeatureAssignment_2 ) ) ( ( rule__FeatureList__FeatureAssignment_2 )* ) ) ;
    public final void rule__FeatureList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:384:1: ( ( ( ( rule__FeatureList__FeatureAssignment_2 ) ) ( ( rule__FeatureList__FeatureAssignment_2 )* ) ) )
            // InternalMyFeatureList.g:385:1: ( ( ( rule__FeatureList__FeatureAssignment_2 ) ) ( ( rule__FeatureList__FeatureAssignment_2 )* ) )
            {
            // InternalMyFeatureList.g:385:1: ( ( ( rule__FeatureList__FeatureAssignment_2 ) ) ( ( rule__FeatureList__FeatureAssignment_2 )* ) )
            // InternalMyFeatureList.g:386:2: ( ( rule__FeatureList__FeatureAssignment_2 ) ) ( ( rule__FeatureList__FeatureAssignment_2 )* )
            {
            // InternalMyFeatureList.g:386:2: ( ( rule__FeatureList__FeatureAssignment_2 ) )
            // InternalMyFeatureList.g:387:3: ( rule__FeatureList__FeatureAssignment_2 )
            {
             before(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); 
            // InternalMyFeatureList.g:388:3: ( rule__FeatureList__FeatureAssignment_2 )
            // InternalMyFeatureList.g:388:4: rule__FeatureList__FeatureAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__FeatureList__FeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); 

            }

            // InternalMyFeatureList.g:391:2: ( ( rule__FeatureList__FeatureAssignment_2 )* )
            // InternalMyFeatureList.g:392:3: ( rule__FeatureList__FeatureAssignment_2 )*
            {
             before(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); 
            // InternalMyFeatureList.g:393:3: ( rule__FeatureList__FeatureAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyFeatureList.g:393:4: rule__FeatureList__FeatureAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FeatureList__FeatureAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getFeatureAssignment_2()); 

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


    // $ANTLR start "rule__Concept__Group__0"
    // InternalMyFeatureList.g:403:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:407:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalMyFeatureList.g:408:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyFeatureList.g:415:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:419:1: ( ( 'concept' ) )
            // InternalMyFeatureList.g:420:1: ( 'concept' )
            {
            // InternalMyFeatureList.g:420:1: ( 'concept' )
            // InternalMyFeatureList.g:421:2: 'concept'
            {
             before(grammarAccess.getConceptAccess().getConceptKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyFeatureList.g:430:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:434:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalMyFeatureList.g:435:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyFeatureList.g:442:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:446:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:447:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:447:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalMyFeatureList.g:448:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:449:2: ( rule__Concept__NameAssignment_1 )
            // InternalMyFeatureList.g:449:3: rule__Concept__NameAssignment_1
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
    // InternalMyFeatureList.g:457:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl rule__Concept__Group__3 ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:461:1: ( rule__Concept__Group__2__Impl rule__Concept__Group__3 )
            // InternalMyFeatureList.g:462:2: rule__Concept__Group__2__Impl rule__Concept__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Concept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group__3();

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
    // InternalMyFeatureList.g:469:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__AttributesAssignment_2 )* ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:473:1: ( ( ( rule__Concept__AttributesAssignment_2 )* ) )
            // InternalMyFeatureList.g:474:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            {
            // InternalMyFeatureList.g:474:1: ( ( rule__Concept__AttributesAssignment_2 )* )
            // InternalMyFeatureList.g:475:2: ( rule__Concept__AttributesAssignment_2 )*
            {
             before(grammarAccess.getConceptAccess().getAttributesAssignment_2()); 
            // InternalMyFeatureList.g:476:2: ( rule__Concept__AttributesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFeatureList.g:476:3: rule__Concept__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Concept__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "rule__Concept__Group__3"
    // InternalMyFeatureList.g:484:1: rule__Concept__Group__3 : rule__Concept__Group__3__Impl ;
    public final void rule__Concept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:488:1: ( rule__Concept__Group__3__Impl )
            // InternalMyFeatureList.g:489:2: rule__Concept__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group__3__Impl();

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
    // $ANTLR end "rule__Concept__Group__3"


    // $ANTLR start "rule__Concept__Group__3__Impl"
    // InternalMyFeatureList.g:495:1: rule__Concept__Group__3__Impl : ( ( rule__Concept__Group_3__0 )? ) ;
    public final void rule__Concept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:499:1: ( ( ( rule__Concept__Group_3__0 )? ) )
            // InternalMyFeatureList.g:500:1: ( ( rule__Concept__Group_3__0 )? )
            {
            // InternalMyFeatureList.g:500:1: ( ( rule__Concept__Group_3__0 )? )
            // InternalMyFeatureList.g:501:2: ( rule__Concept__Group_3__0 )?
            {
             before(grammarAccess.getConceptAccess().getGroup_3()); 
            // InternalMyFeatureList.g:502:2: ( rule__Concept__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyFeatureList.g:502:3: rule__Concept__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concept__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConceptAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group__3__Impl"


    // $ANTLR start "rule__Concept__Group_3__0"
    // InternalMyFeatureList.g:511:1: rule__Concept__Group_3__0 : rule__Concept__Group_3__0__Impl rule__Concept__Group_3__1 ;
    public final void rule__Concept__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:515:1: ( rule__Concept__Group_3__0__Impl rule__Concept__Group_3__1 )
            // InternalMyFeatureList.g:516:2: rule__Concept__Group_3__0__Impl rule__Concept__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Concept__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group_3__1();

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
    // $ANTLR end "rule__Concept__Group_3__0"


    // $ANTLR start "rule__Concept__Group_3__0__Impl"
    // InternalMyFeatureList.g:523:1: rule__Concept__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Concept__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:527:1: ( ( '[' ) )
            // InternalMyFeatureList.g:528:1: ( '[' )
            {
            // InternalMyFeatureList.g:528:1: ( '[' )
            // InternalMyFeatureList.g:529:2: '['
            {
             before(grammarAccess.getConceptAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group_3__0__Impl"


    // $ANTLR start "rule__Concept__Group_3__1"
    // InternalMyFeatureList.g:538:1: rule__Concept__Group_3__1 : rule__Concept__Group_3__1__Impl rule__Concept__Group_3__2 ;
    public final void rule__Concept__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:542:1: ( rule__Concept__Group_3__1__Impl rule__Concept__Group_3__2 )
            // InternalMyFeatureList.g:543:2: rule__Concept__Group_3__1__Impl rule__Concept__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Concept__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concept__Group_3__2();

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
    // $ANTLR end "rule__Concept__Group_3__1"


    // $ANTLR start "rule__Concept__Group_3__1__Impl"
    // InternalMyFeatureList.g:550:1: rule__Concept__Group_3__1__Impl : ( ( rule__Concept__ConditionAssignment_3_1 ) ) ;
    public final void rule__Concept__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:554:1: ( ( ( rule__Concept__ConditionAssignment_3_1 ) ) )
            // InternalMyFeatureList.g:555:1: ( ( rule__Concept__ConditionAssignment_3_1 ) )
            {
            // InternalMyFeatureList.g:555:1: ( ( rule__Concept__ConditionAssignment_3_1 ) )
            // InternalMyFeatureList.g:556:2: ( rule__Concept__ConditionAssignment_3_1 )
            {
             before(grammarAccess.getConceptAccess().getConditionAssignment_3_1()); 
            // InternalMyFeatureList.g:557:2: ( rule__Concept__ConditionAssignment_3_1 )
            // InternalMyFeatureList.g:557:3: rule__Concept__ConditionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Concept__ConditionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getConditionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group_3__1__Impl"


    // $ANTLR start "rule__Concept__Group_3__2"
    // InternalMyFeatureList.g:565:1: rule__Concept__Group_3__2 : rule__Concept__Group_3__2__Impl ;
    public final void rule__Concept__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:569:1: ( rule__Concept__Group_3__2__Impl )
            // InternalMyFeatureList.g:570:2: rule__Concept__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Group_3__2__Impl();

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
    // $ANTLR end "rule__Concept__Group_3__2"


    // $ANTLR start "rule__Concept__Group_3__2__Impl"
    // InternalMyFeatureList.g:576:1: rule__Concept__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Concept__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:580:1: ( ( ']' ) )
            // InternalMyFeatureList.g:581:1: ( ']' )
            {
            // InternalMyFeatureList.g:581:1: ( ']' )
            // InternalMyFeatureList.g:582:2: ']'
            {
             before(grammarAccess.getConceptAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConceptAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Group_3__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMyFeatureList.g:592:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:596:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMyFeatureList.g:597:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalMyFeatureList.g:604:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__AttributeAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:608:1: ( ( ( rule__Condition__AttributeAssignment_0 ) ) )
            // InternalMyFeatureList.g:609:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            {
            // InternalMyFeatureList.g:609:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            // InternalMyFeatureList.g:610:2: ( rule__Condition__AttributeAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 
            // InternalMyFeatureList.g:611:2: ( rule__Condition__AttributeAssignment_0 )
            // InternalMyFeatureList.g:611:3: rule__Condition__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 

            }


            }

        }
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
    // InternalMyFeatureList.g:619:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:623:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalMyFeatureList.g:624:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // InternalMyFeatureList.g:631:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:635:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // InternalMyFeatureList.g:636:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // InternalMyFeatureList.g:636:1: ( ( rule__Condition__Alternatives_1 ) )
            // InternalMyFeatureList.g:637:2: ( rule__Condition__Alternatives_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            // InternalMyFeatureList.g:638:2: ( rule__Condition__Alternatives_1 )
            // InternalMyFeatureList.g:638:3: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Condition__Group__2"
    // InternalMyFeatureList.g:646:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:650:1: ( rule__Condition__Group__2__Impl )
            // InternalMyFeatureList.g:651:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalMyFeatureList.g:657:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:661:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // InternalMyFeatureList.g:662:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // InternalMyFeatureList.g:662:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // InternalMyFeatureList.g:663:2: ( rule__Condition__ValueAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            // InternalMyFeatureList.g:664:2: ( rule__Condition__ValueAssignment_2 )
            // InternalMyFeatureList.g:664:3: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__DotExpression__Group__0"
    // InternalMyFeatureList.g:673:1: rule__DotExpression__Group__0 : rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 ;
    public final void rule__DotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:677:1: ( rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 )
            // InternalMyFeatureList.g:678:2: rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DotExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__1();

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
    // $ANTLR end "rule__DotExpression__Group__0"


    // $ANTLR start "rule__DotExpression__Group__0__Impl"
    // InternalMyFeatureList.g:685:1: rule__DotExpression__Group__0__Impl : ( ruleConceptRef ) ;
    public final void rule__DotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:689:1: ( ( ruleConceptRef ) )
            // InternalMyFeatureList.g:690:1: ( ruleConceptRef )
            {
            // InternalMyFeatureList.g:690:1: ( ruleConceptRef )
            // InternalMyFeatureList.g:691:2: ruleConceptRef
            {
             before(grammarAccess.getDotExpressionAccess().getConceptRefParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConceptRef();

            state._fsp--;

             after(grammarAccess.getDotExpressionAccess().getConceptRefParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__Group__0__Impl"


    // $ANTLR start "rule__DotExpression__Group__1"
    // InternalMyFeatureList.g:700:1: rule__DotExpression__Group__1 : rule__DotExpression__Group__1__Impl ;
    public final void rule__DotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:704:1: ( rule__DotExpression__Group__1__Impl )
            // InternalMyFeatureList.g:705:2: rule__DotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__1__Impl();

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
    // $ANTLR end "rule__DotExpression__Group__1"


    // $ANTLR start "rule__DotExpression__Group__1__Impl"
    // InternalMyFeatureList.g:711:1: rule__DotExpression__Group__1__Impl : ( ( rule__DotExpression__Group_1__0 )* ) ;
    public final void rule__DotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:715:1: ( ( ( rule__DotExpression__Group_1__0 )* ) )
            // InternalMyFeatureList.g:716:1: ( ( rule__DotExpression__Group_1__0 )* )
            {
            // InternalMyFeatureList.g:716:1: ( ( rule__DotExpression__Group_1__0 )* )
            // InternalMyFeatureList.g:717:2: ( rule__DotExpression__Group_1__0 )*
            {
             before(grammarAccess.getDotExpressionAccess().getGroup_1()); 
            // InternalMyFeatureList.g:718:2: ( rule__DotExpression__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyFeatureList.g:718:3: rule__DotExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DotExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDotExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__Group__1__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__0"
    // InternalMyFeatureList.g:727:1: rule__DotExpression__Group_1__0 : rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 ;
    public final void rule__DotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:731:1: ( rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 )
            // InternalMyFeatureList.g:732:2: rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DotExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__1();

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
    // $ANTLR end "rule__DotExpression__Group_1__0"


    // $ANTLR start "rule__DotExpression__Group_1__0__Impl"
    // InternalMyFeatureList.g:739:1: rule__DotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:743:1: ( ( () ) )
            // InternalMyFeatureList.g:744:1: ( () )
            {
            // InternalMyFeatureList.g:744:1: ( () )
            // InternalMyFeatureList.g:745:2: ()
            {
             before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 
            // InternalMyFeatureList.g:746:2: ()
            // InternalMyFeatureList.g:746:3: 
            {
            }

             after(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__1"
    // InternalMyFeatureList.g:754:1: rule__DotExpression__Group_1__1 : rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 ;
    public final void rule__DotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:758:1: ( rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 )
            // InternalMyFeatureList.g:759:2: rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__DotExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__2();

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
    // $ANTLR end "rule__DotExpression__Group_1__1"


    // $ANTLR start "rule__DotExpression__Group_1__1__Impl"
    // InternalMyFeatureList.g:766:1: rule__DotExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__DotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:770:1: ( ( '.' ) )
            // InternalMyFeatureList.g:771:1: ( '.' )
            {
            // InternalMyFeatureList.g:771:1: ( '.' )
            // InternalMyFeatureList.g:772:2: '.'
            {
             before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__2"
    // InternalMyFeatureList.g:781:1: rule__DotExpression__Group_1__2 : rule__DotExpression__Group_1__2__Impl ;
    public final void rule__DotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:785:1: ( rule__DotExpression__Group_1__2__Impl )
            // InternalMyFeatureList.g:786:2: rule__DotExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__DotExpression__Group_1__2"


    // $ANTLR start "rule__DotExpression__Group_1__2__Impl"
    // InternalMyFeatureList.g:792:1: rule__DotExpression__Group_1__2__Impl : ( ( rule__DotExpression__TailAssignment_1_2 ) ) ;
    public final void rule__DotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:796:1: ( ( ( rule__DotExpression__TailAssignment_1_2 ) ) )
            // InternalMyFeatureList.g:797:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            {
            // InternalMyFeatureList.g:797:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            // InternalMyFeatureList.g:798:2: ( rule__DotExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 
            // InternalMyFeatureList.g:799:2: ( rule__DotExpression__TailAssignment_1_2 )
            // InternalMyFeatureList.g:799:3: rule__DotExpression__TailAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__TailAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConceptRef__Group__0"
    // InternalMyFeatureList.g:808:1: rule__ConceptRef__Group__0 : rule__ConceptRef__Group__0__Impl rule__ConceptRef__Group__1 ;
    public final void rule__ConceptRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:812:1: ( rule__ConceptRef__Group__0__Impl rule__ConceptRef__Group__1 )
            // InternalMyFeatureList.g:813:2: rule__ConceptRef__Group__0__Impl rule__ConceptRef__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ConceptRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConceptRef__Group__1();

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
    // $ANTLR end "rule__ConceptRef__Group__0"


    // $ANTLR start "rule__ConceptRef__Group__0__Impl"
    // InternalMyFeatureList.g:820:1: rule__ConceptRef__Group__0__Impl : ( () ) ;
    public final void rule__ConceptRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:824:1: ( ( () ) )
            // InternalMyFeatureList.g:825:1: ( () )
            {
            // InternalMyFeatureList.g:825:1: ( () )
            // InternalMyFeatureList.g:826:2: ()
            {
             before(grammarAccess.getConceptRefAccess().getConceptRefAction_0()); 
            // InternalMyFeatureList.g:827:2: ()
            // InternalMyFeatureList.g:827:3: 
            {
            }

             after(grammarAccess.getConceptRefAccess().getConceptRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptRef__Group__0__Impl"


    // $ANTLR start "rule__ConceptRef__Group__1"
    // InternalMyFeatureList.g:835:1: rule__ConceptRef__Group__1 : rule__ConceptRef__Group__1__Impl ;
    public final void rule__ConceptRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:839:1: ( rule__ConceptRef__Group__1__Impl )
            // InternalMyFeatureList.g:840:2: rule__ConceptRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConceptRef__Group__1__Impl();

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
    // $ANTLR end "rule__ConceptRef__Group__1"


    // $ANTLR start "rule__ConceptRef__Group__1__Impl"
    // InternalMyFeatureList.g:846:1: rule__ConceptRef__Group__1__Impl : ( ( rule__ConceptRef__ConceptAssignment_1 ) ) ;
    public final void rule__ConceptRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:850:1: ( ( ( rule__ConceptRef__ConceptAssignment_1 ) ) )
            // InternalMyFeatureList.g:851:1: ( ( rule__ConceptRef__ConceptAssignment_1 ) )
            {
            // InternalMyFeatureList.g:851:1: ( ( rule__ConceptRef__ConceptAssignment_1 ) )
            // InternalMyFeatureList.g:852:2: ( rule__ConceptRef__ConceptAssignment_1 )
            {
             before(grammarAccess.getConceptRefAccess().getConceptAssignment_1()); 
            // InternalMyFeatureList.g:853:2: ( rule__ConceptRef__ConceptAssignment_1 )
            // InternalMyFeatureList.g:853:3: rule__ConceptRef__ConceptAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConceptRef__ConceptAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptRefAccess().getConceptAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptRef__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalMyFeatureList.g:862:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:866:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalMyFeatureList.g:867:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyFeatureList.g:874:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__VerbAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:878:1: ( ( ( rule__Feature__VerbAssignment_0 ) ) )
            // InternalMyFeatureList.g:879:1: ( ( rule__Feature__VerbAssignment_0 ) )
            {
            // InternalMyFeatureList.g:879:1: ( ( rule__Feature__VerbAssignment_0 ) )
            // InternalMyFeatureList.g:880:2: ( rule__Feature__VerbAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getVerbAssignment_0()); 
            // InternalMyFeatureList.g:881:2: ( rule__Feature__VerbAssignment_0 )
            // InternalMyFeatureList.g:881:3: rule__Feature__VerbAssignment_0
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
    // InternalMyFeatureList.g:889:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:893:1: ( rule__Feature__Group__1__Impl )
            // InternalMyFeatureList.g:894:2: rule__Feature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__1__Impl();

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
    // InternalMyFeatureList.g:900:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__RefAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:904:1: ( ( ( rule__Feature__RefAssignment_1 ) ) )
            // InternalMyFeatureList.g:905:1: ( ( rule__Feature__RefAssignment_1 ) )
            {
            // InternalMyFeatureList.g:905:1: ( ( rule__Feature__RefAssignment_1 ) )
            // InternalMyFeatureList.g:906:2: ( rule__Feature__RefAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getRefAssignment_1()); 
            // InternalMyFeatureList.g:907:2: ( rule__Feature__RefAssignment_1 )
            // InternalMyFeatureList.g:907:3: rule__Feature__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getRefAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__FeatureList__ConceptAssignment_0"
    // InternalMyFeatureList.g:916:1: rule__FeatureList__ConceptAssignment_0 : ( ruleConcept ) ;
    public final void rule__FeatureList__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:920:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:921:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:921:2: ( ruleConcept )
            // InternalMyFeatureList.g:922:3: ruleConcept
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


    // $ANTLR start "rule__FeatureList__FeatureAssignment_2"
    // InternalMyFeatureList.g:931:1: rule__FeatureList__FeatureAssignment_2 : ( ruleFeature ) ;
    public final void rule__FeatureList__FeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:935:1: ( ( ruleFeature ) )
            // InternalMyFeatureList.g:936:2: ( ruleFeature )
            {
            // InternalMyFeatureList.g:936:2: ( ruleFeature )
            // InternalMyFeatureList.g:937:3: ruleFeature
            {
             before(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__FeatureAssignment_2"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalMyFeatureList.g:946:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:950:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:951:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:951:2: ( RULE_ID )
            // InternalMyFeatureList.g:952:3: RULE_ID
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
    // InternalMyFeatureList.g:961:1: rule__Concept__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Concept__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:965:1: ( ( ruleAttribute ) )
            // InternalMyFeatureList.g:966:2: ( ruleAttribute )
            {
            // InternalMyFeatureList.g:966:2: ( ruleAttribute )
            // InternalMyFeatureList.g:967:3: ruleAttribute
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


    // $ANTLR start "rule__Concept__ConditionAssignment_3_1"
    // InternalMyFeatureList.g:976:1: rule__Concept__ConditionAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__Concept__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:980:1: ( ( ruleCondition ) )
            // InternalMyFeatureList.g:981:2: ( ruleCondition )
            {
            // InternalMyFeatureList.g:981:2: ( ruleCondition )
            // InternalMyFeatureList.g:982:3: ruleCondition
            {
             before(grammarAccess.getConceptAccess().getConditionConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConceptAccess().getConditionConditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__ConditionAssignment_3_1"


    // $ANTLR start "rule__Attribute__NameAssignment"
    // InternalMyFeatureList.g:991:1: rule__Attribute__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:995:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:996:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:996:2: ( RULE_ID )
            // InternalMyFeatureList.g:997:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment"


    // $ANTLR start "rule__Condition__AttributeAssignment_0"
    // InternalMyFeatureList.g:1006:1: rule__Condition__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1010:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1011:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1011:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1012:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalMyFeatureList.g:1013:3: ( RULE_ID )
            // InternalMyFeatureList.g:1014:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getAttributeAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__AttributeAssignment_0"


    // $ANTLR start "rule__Condition__ValueAssignment_2"
    // InternalMyFeatureList.g:1025:1: rule__Condition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1029:1: ( ( RULE_INT ) )
            // InternalMyFeatureList.g:1030:2: ( RULE_INT )
            {
            // InternalMyFeatureList.g:1030:2: ( RULE_INT )
            // InternalMyFeatureList.g:1031:3: RULE_INT
            {
             before(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_2"


    // $ANTLR start "rule__DotExpression__TailAssignment_1_2"
    // InternalMyFeatureList.g:1040:1: rule__DotExpression__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DotExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1044:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1045:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1045:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1046:3: ( RULE_ID )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAttributeCrossReference_1_2_0()); 
            // InternalMyFeatureList.g:1047:3: ( RULE_ID )
            // InternalMyFeatureList.g:1048:4: RULE_ID
            {
             before(grammarAccess.getDotExpressionAccess().getTailAttributeIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDotExpressionAccess().getTailAttributeIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getDotExpressionAccess().getTailAttributeCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__TailAssignment_1_2"


    // $ANTLR start "rule__ConceptRef__ConceptAssignment_1"
    // InternalMyFeatureList.g:1059:1: rule__ConceptRef__ConceptAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConceptRef__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1063:1: ( ( ( RULE_ID ) ) )
            // InternalMyFeatureList.g:1064:2: ( ( RULE_ID ) )
            {
            // InternalMyFeatureList.g:1064:2: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:1065:3: ( RULE_ID )
            {
             before(grammarAccess.getConceptRefAccess().getConceptConceptCrossReference_1_0()); 
            // InternalMyFeatureList.g:1066:3: ( RULE_ID )
            // InternalMyFeatureList.g:1067:4: RULE_ID
            {
             before(grammarAccess.getConceptRefAccess().getConceptConceptIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConceptRefAccess().getConceptConceptIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConceptRefAccess().getConceptConceptCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptRef__ConceptAssignment_1"


    // $ANTLR start "rule__Feature__VerbAssignment_0"
    // InternalMyFeatureList.g:1078:1: rule__Feature__VerbAssignment_0 : ( ruleVerb ) ;
    public final void rule__Feature__VerbAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1082:1: ( ( ruleVerb ) )
            // InternalMyFeatureList.g:1083:2: ( ruleVerb )
            {
            // InternalMyFeatureList.g:1083:2: ( ruleVerb )
            // InternalMyFeatureList.g:1084:3: ruleVerb
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


    // $ANTLR start "rule__Feature__RefAssignment_1"
    // InternalMyFeatureList.g:1093:1: rule__Feature__RefAssignment_1 : ( ruleDotExpression ) ;
    public final void rule__Feature__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:1097:1: ( ( ruleDotExpression ) )
            // InternalMyFeatureList.g:1098:2: ( ruleDotExpression )
            {
            // InternalMyFeatureList.g:1098:2: ( ruleDotExpression )
            // InternalMyFeatureList.g:1099:3: ruleDotExpression
            {
             before(grammarAccess.getFeatureAccess().getRefDotExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDotExpression();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getRefDotExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__RefAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});

}