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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Add'", "'Remove'", "'Update'", "'Display'", "'concept'", "'feature'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:103:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalMyFeatureList.g:104:1: ( ruleFeature EOF )
            // InternalMyFeatureList.g:105:1: ruleFeature EOF
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
    // InternalMyFeatureList.g:112:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:116:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalMyFeatureList.g:117:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalMyFeatureList.g:117:2: ( ( rule__Feature__Group__0 ) )
            // InternalMyFeatureList.g:118:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalMyFeatureList.g:119:3: ( rule__Feature__Group__0 )
            // InternalMyFeatureList.g:119:4: rule__Feature__Group__0
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
    // InternalMyFeatureList.g:128:1: ruleVerb : ( ( rule__Verb__Alternatives ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:132:1: ( ( ( rule__Verb__Alternatives ) ) )
            // InternalMyFeatureList.g:133:2: ( ( rule__Verb__Alternatives ) )
            {
            // InternalMyFeatureList.g:133:2: ( ( rule__Verb__Alternatives ) )
            // InternalMyFeatureList.g:134:3: ( rule__Verb__Alternatives )
            {
             before(grammarAccess.getVerbAccess().getAlternatives()); 
            // InternalMyFeatureList.g:135:3: ( rule__Verb__Alternatives )
            // InternalMyFeatureList.g:135:4: rule__Verb__Alternatives
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


    // $ANTLR start "rule__Verb__Alternatives"
    // InternalMyFeatureList.g:143:1: rule__Verb__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) );
    public final void rule__Verb__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:147:1: ( ( ( 'Add' ) ) | ( ( 'Remove' ) ) | ( ( 'Update' ) ) | ( ( 'Display' ) ) )
            int alt1=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyFeatureList.g:148:2: ( ( 'Add' ) )
                    {
                    // InternalMyFeatureList.g:148:2: ( ( 'Add' ) )
                    // InternalMyFeatureList.g:149:3: ( 'Add' )
                    {
                     before(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalMyFeatureList.g:150:3: ( 'Add' )
                    // InternalMyFeatureList.g:150:4: 'Add'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:154:2: ( ( 'Remove' ) )
                    {
                    // InternalMyFeatureList.g:154:2: ( ( 'Remove' ) )
                    // InternalMyFeatureList.g:155:3: ( 'Remove' )
                    {
                     before(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // InternalMyFeatureList.g:156:3: ( 'Remove' )
                    // InternalMyFeatureList.g:156:4: 'Remove'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:160:2: ( ( 'Update' ) )
                    {
                    // InternalMyFeatureList.g:160:2: ( ( 'Update' ) )
                    // InternalMyFeatureList.g:161:3: ( 'Update' )
                    {
                     before(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // InternalMyFeatureList.g:162:3: ( 'Update' )
                    // InternalMyFeatureList.g:162:4: 'Update'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:166:2: ( ( 'Display' ) )
                    {
                    // InternalMyFeatureList.g:166:2: ( ( 'Display' ) )
                    // InternalMyFeatureList.g:167:3: ( 'Display' )
                    {
                     before(grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3()); 
                    // InternalMyFeatureList.g:168:3: ( 'Display' )
                    // InternalMyFeatureList.g:168:4: 'Display'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalMyFeatureList.g:176:1: rule__FeatureList__Group__0 : rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 ;
    public final void rule__FeatureList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:180:1: ( rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1 )
            // InternalMyFeatureList.g:181:2: rule__FeatureList__Group__0__Impl rule__FeatureList__Group__1
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
    // InternalMyFeatureList.g:188:1: rule__FeatureList__Group__0__Impl : ( ( rule__FeatureList__ConceptAssignment_0 )* ) ;
    public final void rule__FeatureList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:192:1: ( ( ( rule__FeatureList__ConceptAssignment_0 )* ) )
            // InternalMyFeatureList.g:193:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            {
            // InternalMyFeatureList.g:193:1: ( ( rule__FeatureList__ConceptAssignment_0 )* )
            // InternalMyFeatureList.g:194:2: ( rule__FeatureList__ConceptAssignment_0 )*
            {
             before(grammarAccess.getFeatureListAccess().getConceptAssignment_0()); 
            // InternalMyFeatureList.g:195:2: ( rule__FeatureList__ConceptAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyFeatureList.g:195:3: rule__FeatureList__ConceptAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FeatureList__ConceptAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalMyFeatureList.g:203:1: rule__FeatureList__Group__1 : rule__FeatureList__Group__1__Impl ;
    public final void rule__FeatureList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:207:1: ( rule__FeatureList__Group__1__Impl )
            // InternalMyFeatureList.g:208:2: rule__FeatureList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureList__Group__1__Impl();

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
    // InternalMyFeatureList.g:214:1: rule__FeatureList__Group__1__Impl : ( ( rule__FeatureList__FeatureAssignment_1 )* ) ;
    public final void rule__FeatureList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:218:1: ( ( ( rule__FeatureList__FeatureAssignment_1 )* ) )
            // InternalMyFeatureList.g:219:1: ( ( rule__FeatureList__FeatureAssignment_1 )* )
            {
            // InternalMyFeatureList.g:219:1: ( ( rule__FeatureList__FeatureAssignment_1 )* )
            // InternalMyFeatureList.g:220:2: ( rule__FeatureList__FeatureAssignment_1 )*
            {
             before(grammarAccess.getFeatureListAccess().getFeatureAssignment_1()); 
            // InternalMyFeatureList.g:221:2: ( rule__FeatureList__FeatureAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFeatureList.g:221:3: rule__FeatureList__FeatureAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__FeatureList__FeatureAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFeatureListAccess().getFeatureAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Concept__Group__0"
    // InternalMyFeatureList.g:230:1: rule__Concept__Group__0 : rule__Concept__Group__0__Impl rule__Concept__Group__1 ;
    public final void rule__Concept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:234:1: ( rule__Concept__Group__0__Impl rule__Concept__Group__1 )
            // InternalMyFeatureList.g:235:2: rule__Concept__Group__0__Impl rule__Concept__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyFeatureList.g:242:1: rule__Concept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__Concept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:246:1: ( ( 'concept' ) )
            // InternalMyFeatureList.g:247:1: ( 'concept' )
            {
            // InternalMyFeatureList.g:247:1: ( 'concept' )
            // InternalMyFeatureList.g:248:2: 'concept'
            {
             before(grammarAccess.getConceptAccess().getConceptKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyFeatureList.g:257:1: rule__Concept__Group__1 : rule__Concept__Group__1__Impl rule__Concept__Group__2 ;
    public final void rule__Concept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:261:1: ( rule__Concept__Group__1__Impl rule__Concept__Group__2 )
            // InternalMyFeatureList.g:262:2: rule__Concept__Group__1__Impl rule__Concept__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyFeatureList.g:269:1: rule__Concept__Group__1__Impl : ( ( rule__Concept__NameAssignment_1 ) ) ;
    public final void rule__Concept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:273:1: ( ( ( rule__Concept__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:274:1: ( ( rule__Concept__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:274:1: ( ( rule__Concept__NameAssignment_1 ) )
            // InternalMyFeatureList.g:275:2: ( rule__Concept__NameAssignment_1 )
            {
             before(grammarAccess.getConceptAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:276:2: ( rule__Concept__NameAssignment_1 )
            // InternalMyFeatureList.g:276:3: rule__Concept__NameAssignment_1
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
    // InternalMyFeatureList.g:284:1: rule__Concept__Group__2 : rule__Concept__Group__2__Impl ;
    public final void rule__Concept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:288:1: ( rule__Concept__Group__2__Impl )
            // InternalMyFeatureList.g:289:2: rule__Concept__Group__2__Impl
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
    // InternalMyFeatureList.g:295:1: rule__Concept__Group__2__Impl : ( ( rule__Concept__AttributesAssignment_2 ) ) ;
    public final void rule__Concept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:299:1: ( ( ( rule__Concept__AttributesAssignment_2 ) ) )
            // InternalMyFeatureList.g:300:1: ( ( rule__Concept__AttributesAssignment_2 ) )
            {
            // InternalMyFeatureList.g:300:1: ( ( rule__Concept__AttributesAssignment_2 ) )
            // InternalMyFeatureList.g:301:2: ( rule__Concept__AttributesAssignment_2 )
            {
             before(grammarAccess.getConceptAccess().getAttributesAssignment_2()); 
            // InternalMyFeatureList.g:302:2: ( rule__Concept__AttributesAssignment_2 )
            // InternalMyFeatureList.g:302:3: rule__Concept__AttributesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Concept__AttributesAssignment_2();

            state._fsp--;


            }

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


    // $ANTLR start "rule__Feature__Group__0"
    // InternalMyFeatureList.g:311:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:315:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalMyFeatureList.g:316:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyFeatureList.g:323:1: rule__Feature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:327:1: ( ( 'feature' ) )
            // InternalMyFeatureList.g:328:1: ( 'feature' )
            {
            // InternalMyFeatureList.g:328:1: ( 'feature' )
            // InternalMyFeatureList.g:329:2: 'feature'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
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
    // InternalMyFeatureList.g:338:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:342:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalMyFeatureList.g:343:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyFeatureList.g:350:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:354:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalMyFeatureList.g:355:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalMyFeatureList.g:355:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalMyFeatureList.g:356:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalMyFeatureList.g:357:2: ( rule__Feature__NameAssignment_1 )
            // InternalMyFeatureList.g:357:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyFeatureList.g:365:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:369:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalMyFeatureList.g:370:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

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
    // InternalMyFeatureList.g:377:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__VerbAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:381:1: ( ( ( rule__Feature__VerbAssignment_2 ) ) )
            // InternalMyFeatureList.g:382:1: ( ( rule__Feature__VerbAssignment_2 ) )
            {
            // InternalMyFeatureList.g:382:1: ( ( rule__Feature__VerbAssignment_2 ) )
            // InternalMyFeatureList.g:383:2: ( rule__Feature__VerbAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getVerbAssignment_2()); 
            // InternalMyFeatureList.g:384:2: ( rule__Feature__VerbAssignment_2 )
            // InternalMyFeatureList.g:384:3: rule__Feature__VerbAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__VerbAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getVerbAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__Group__3"
    // InternalMyFeatureList.g:392:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:396:1: ( rule__Feature__Group__3__Impl )
            // InternalMyFeatureList.g:397:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalMyFeatureList.g:403:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__ConceptAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:407:1: ( ( ( rule__Feature__ConceptAssignment_3 ) ) )
            // InternalMyFeatureList.g:408:1: ( ( rule__Feature__ConceptAssignment_3 ) )
            {
            // InternalMyFeatureList.g:408:1: ( ( rule__Feature__ConceptAssignment_3 ) )
            // InternalMyFeatureList.g:409:2: ( rule__Feature__ConceptAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getConceptAssignment_3()); 
            // InternalMyFeatureList.g:410:2: ( rule__Feature__ConceptAssignment_3 )
            // InternalMyFeatureList.g:410:3: rule__Feature__ConceptAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__ConceptAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getConceptAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__FeatureList__ConceptAssignment_0"
    // InternalMyFeatureList.g:419:1: rule__FeatureList__ConceptAssignment_0 : ( ruleConcept ) ;
    public final void rule__FeatureList__ConceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:423:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:424:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:424:2: ( ruleConcept )
            // InternalMyFeatureList.g:425:3: ruleConcept
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


    // $ANTLR start "rule__FeatureList__FeatureAssignment_1"
    // InternalMyFeatureList.g:434:1: rule__FeatureList__FeatureAssignment_1 : ( ruleFeature ) ;
    public final void rule__FeatureList__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:438:1: ( ( ruleFeature ) )
            // InternalMyFeatureList.g:439:2: ( ruleFeature )
            {
            // InternalMyFeatureList.g:439:2: ( ruleFeature )
            // InternalMyFeatureList.g:440:3: ruleFeature
            {
             before(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureList__FeatureAssignment_1"


    // $ANTLR start "rule__Concept__NameAssignment_1"
    // InternalMyFeatureList.g:449:1: rule__Concept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:453:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:454:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:454:2: ( RULE_ID )
            // InternalMyFeatureList.g:455:3: RULE_ID
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
    // InternalMyFeatureList.g:464:1: rule__Concept__AttributesAssignment_2 : ( ruleConcept ) ;
    public final void rule__Concept__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:468:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:469:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:469:2: ( ruleConcept )
            // InternalMyFeatureList.g:470:3: ruleConcept
            {
             before(grammarAccess.getConceptAccess().getAttributesConceptParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptAccess().getAttributesConceptParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalMyFeatureList.g:479:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:483:1: ( ( RULE_ID ) )
            // InternalMyFeatureList.g:484:2: ( RULE_ID )
            {
            // InternalMyFeatureList.g:484:2: ( RULE_ID )
            // InternalMyFeatureList.g:485:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__VerbAssignment_2"
    // InternalMyFeatureList.g:494:1: rule__Feature__VerbAssignment_2 : ( ruleVerb ) ;
    public final void rule__Feature__VerbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:498:1: ( ( ruleVerb ) )
            // InternalMyFeatureList.g:499:2: ( ruleVerb )
            {
            // InternalMyFeatureList.g:499:2: ( ruleVerb )
            // InternalMyFeatureList.g:500:3: ruleVerb
            {
             before(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVerb();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__VerbAssignment_2"


    // $ANTLR start "rule__Feature__ConceptAssignment_3"
    // InternalMyFeatureList.g:509:1: rule__Feature__ConceptAssignment_3 : ( ruleConcept ) ;
    public final void rule__Feature__ConceptAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyFeatureList.g:513:1: ( ( ruleConcept ) )
            // InternalMyFeatureList.g:514:2: ( ruleConcept )
            {
            // InternalMyFeatureList.g:514:2: ( ruleConcept )
            // InternalMyFeatureList.g:515:3: ruleConcept
            {
             before(grammarAccess.getFeatureAccess().getConceptConceptParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getConceptConceptParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ConceptAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000007800L});

}