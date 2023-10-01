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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyFeatureListParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'concept'", "'feature'", "'Add'", "'Remove'", "'Update'", "'Display'"
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




    // $ANTLR start "entryRuleFeatureList"
    // InternalMyFeatureList.g:65:1: entryRuleFeatureList returns [EObject current=null] : iv_ruleFeatureList= ruleFeatureList EOF ;
    public final EObject entryRuleFeatureList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureList = null;


        try {
            // InternalMyFeatureList.g:65:52: (iv_ruleFeatureList= ruleFeatureList EOF )
            // InternalMyFeatureList.g:66:2: iv_ruleFeatureList= ruleFeatureList EOF
            {
             newCompositeNode(grammarAccess.getFeatureListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureList=ruleFeatureList();

            state._fsp--;

             current =iv_ruleFeatureList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureList"


    // $ANTLR start "ruleFeatureList"
    // InternalMyFeatureList.g:72:1: ruleFeatureList returns [EObject current=null] : ( ( (lv_concept_0_0= ruleConcept ) )* ( (lv_feature_1_0= ruleFeature ) )* ) ;
    public final EObject ruleFeatureList() throws RecognitionException {
        EObject current = null;

        EObject lv_concept_0_0 = null;

        EObject lv_feature_1_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:78:2: ( ( ( (lv_concept_0_0= ruleConcept ) )* ( (lv_feature_1_0= ruleFeature ) )* ) )
            // InternalMyFeatureList.g:79:2: ( ( (lv_concept_0_0= ruleConcept ) )* ( (lv_feature_1_0= ruleFeature ) )* )
            {
            // InternalMyFeatureList.g:79:2: ( ( (lv_concept_0_0= ruleConcept ) )* ( (lv_feature_1_0= ruleFeature ) )* )
            // InternalMyFeatureList.g:80:3: ( (lv_concept_0_0= ruleConcept ) )* ( (lv_feature_1_0= ruleFeature ) )*
            {
            // InternalMyFeatureList.g:80:3: ( (lv_concept_0_0= ruleConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyFeatureList.g:81:4: (lv_concept_0_0= ruleConcept )
            	    {
            	    // InternalMyFeatureList.g:81:4: (lv_concept_0_0= ruleConcept )
            	    // InternalMyFeatureList.g:82:5: lv_concept_0_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getConceptConceptParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_concept_0_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concept",
            	    						lv_concept_0_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyFeatureList.g:99:3: ( (lv_feature_1_0= ruleFeature ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyFeatureList.g:100:4: (lv_feature_1_0= ruleFeature )
            	    {
            	    // InternalMyFeatureList.g:100:4: (lv_feature_1_0= ruleFeature )
            	    // InternalMyFeatureList.g:101:5: lv_feature_1_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_feature_1_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_1_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureList"


    // $ANTLR start "entryRuleConcept"
    // InternalMyFeatureList.g:122:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalMyFeatureList.g:122:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalMyFeatureList.g:123:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalMyFeatureList.g:129:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleConcept ) ) ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:135:2: ( (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleConcept ) ) ) )
            // InternalMyFeatureList.g:136:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleConcept ) ) )
            {
            // InternalMyFeatureList.g:136:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleConcept ) ) )
            // InternalMyFeatureList.g:137:3: otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleConcept ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
            		
            // InternalMyFeatureList.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyFeatureList.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyFeatureList.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalMyFeatureList.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyFeatureList.g:159:3: ( (lv_attributes_2_0= ruleConcept ) )
            // InternalMyFeatureList.g:160:4: (lv_attributes_2_0= ruleConcept )
            {
            // InternalMyFeatureList.g:160:4: (lv_attributes_2_0= ruleConcept )
            // InternalMyFeatureList.g:161:5: lv_attributes_2_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getConceptAccess().getAttributesConceptParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributes_2_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConceptRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_2_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:182:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyFeatureList.g:182:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyFeatureList.g:183:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyFeatureList.g:189:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_verb_2_0= ruleVerb ) ) ( (lv_concept_3_0= ruleConcept ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Enumerator lv_verb_2_0 = null;

        EObject lv_concept_3_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:195:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_verb_2_0= ruleVerb ) ) ( (lv_concept_3_0= ruleConcept ) ) ) )
            // InternalMyFeatureList.g:196:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_verb_2_0= ruleVerb ) ) ( (lv_concept_3_0= ruleConcept ) ) )
            {
            // InternalMyFeatureList.g:196:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_verb_2_0= ruleVerb ) ) ( (lv_concept_3_0= ruleConcept ) ) )
            // InternalMyFeatureList.g:197:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) ( (lv_verb_2_0= ruleVerb ) ) ( (lv_concept_3_0= ruleConcept ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalMyFeatureList.g:201:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyFeatureList.g:202:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyFeatureList.g:202:4: (lv_name_1_0= RULE_ID )
            // InternalMyFeatureList.g:203:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyFeatureList.g:219:3: ( (lv_verb_2_0= ruleVerb ) )
            // InternalMyFeatureList.g:220:4: (lv_verb_2_0= ruleVerb )
            {
            // InternalMyFeatureList.g:220:4: (lv_verb_2_0= ruleVerb )
            // InternalMyFeatureList.g:221:5: lv_verb_2_0= ruleVerb
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_verb_2_0=ruleVerb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"verb",
            						lv_verb_2_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Verb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFeatureList.g:238:3: ( (lv_concept_3_0= ruleConcept ) )
            // InternalMyFeatureList.g:239:4: (lv_concept_3_0= ruleConcept )
            {
            // InternalMyFeatureList.g:239:4: (lv_concept_3_0= ruleConcept )
            // InternalMyFeatureList.g:240:5: lv_concept_3_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getConceptConceptParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_concept_3_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"concept",
            						lv_concept_3_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "ruleVerb"
    // InternalMyFeatureList.g:261:1: ruleVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) ;
    public final Enumerator ruleVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:267:2: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) )
            // InternalMyFeatureList.g:268:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            {
            // InternalMyFeatureList.g:268:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
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
                    // InternalMyFeatureList.g:269:3: (enumLiteral_0= 'Add' )
                    {
                    // InternalMyFeatureList.g:269:3: (enumLiteral_0= 'Add' )
                    // InternalMyFeatureList.g:270:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:277:3: (enumLiteral_1= 'Remove' )
                    {
                    // InternalMyFeatureList.g:277:3: (enumLiteral_1= 'Remove' )
                    // InternalMyFeatureList.g:278:4: enumLiteral_1= 'Remove'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:285:3: (enumLiteral_2= 'Update' )
                    {
                    // InternalMyFeatureList.g:285:3: (enumLiteral_2= 'Update' )
                    // InternalMyFeatureList.g:286:4: enumLiteral_2= 'Update'
                    {
                    enumLiteral_2=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:293:3: (enumLiteral_3= 'Display' )
                    {
                    // InternalMyFeatureList.g:293:3: (enumLiteral_3= 'Display' )
                    // InternalMyFeatureList.g:294:4: enumLiteral_3= 'Display'
                    {
                    enumLiteral_3=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVerbAccess().getDisplayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerb"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001E000L});

}