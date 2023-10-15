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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'features'", "'concept'", "'['", "']'", "'>'", "'>='", "'='", "'<='", "'<'", "'.'", "'Add'", "'Remove'", "'Update'", "'Display'"
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
    // InternalMyFeatureList.g:72:1: ruleFeatureList returns [EObject current=null] : ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'features' ( (lv_feature_2_0= ruleFeature ) )+ ) ;
    public final EObject ruleFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concept_0_0 = null;

        EObject lv_feature_2_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:78:2: ( ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'features' ( (lv_feature_2_0= ruleFeature ) )+ ) )
            // InternalMyFeatureList.g:79:2: ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'features' ( (lv_feature_2_0= ruleFeature ) )+ )
            {
            // InternalMyFeatureList.g:79:2: ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'features' ( (lv_feature_2_0= ruleFeature ) )+ )
            // InternalMyFeatureList.g:80:3: ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'features' ( (lv_feature_2_0= ruleFeature ) )+
            {
            // InternalMyFeatureList.g:80:3: ( (lv_concept_0_0= ruleConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
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

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureListAccess().getFeaturesKeyword_1());
            		
            // InternalMyFeatureList.g:103:3: ( (lv_feature_2_0= ruleFeature ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=21 && LA2_0<=24)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyFeatureList.g:104:4: (lv_feature_2_0= ruleFeature )
            	    {
            	    // InternalMyFeatureList.g:104:4: (lv_feature_2_0= ruleFeature )
            	    // InternalMyFeatureList.g:105:5: lv_feature_2_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_feature_2_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_2_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalMyFeatureList.g:126:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalMyFeatureList.g:126:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalMyFeatureList.g:127:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalMyFeatureList.g:133:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* (otherlv_3= '[' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:139:2: ( (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* (otherlv_3= '[' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ']' )? ) )
            // InternalMyFeatureList.g:140:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* (otherlv_3= '[' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ']' )? )
            {
            // InternalMyFeatureList.g:140:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* (otherlv_3= '[' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ']' )? )
            // InternalMyFeatureList.g:141:3: otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* (otherlv_3= '[' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ']' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
            		
            // InternalMyFeatureList.g:145:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyFeatureList.g:146:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyFeatureList.g:146:4: (lv_name_1_0= RULE_ID )
            // InternalMyFeatureList.g:147:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalMyFeatureList.g:163:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFeatureList.g:164:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyFeatureList.g:164:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyFeatureList.g:165:5: lv_attributes_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getConceptAccess().getAttributesAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConceptRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyFeatureList.g:182:3: (otherlv_3= '[' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyFeatureList.g:183:4: otherlv_3= '[' ( (lv_condition_4_0= ruleCondition ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getConceptAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalMyFeatureList.g:187:4: ( (lv_condition_4_0= ruleCondition ) )
                    // InternalMyFeatureList.g:188:5: (lv_condition_4_0= ruleCondition )
                    {
                    // InternalMyFeatureList.g:188:5: (lv_condition_4_0= ruleCondition )
                    // InternalMyFeatureList.g:189:6: lv_condition_4_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConceptAccess().getConditionConditionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_condition_4_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConceptRule());
                    						}
                    						add(
                    							current,
                    							"condition",
                    							lv_condition_4_0,
                    							"my.xtext.featurelist.myfeaturelist.MyFeatureList.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getConceptAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

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


    // $ANTLR start "entryRuleAttribute"
    // InternalMyFeatureList.g:215:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyFeatureList.g:215:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyFeatureList.g:216:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyFeatureList.g:222:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:228:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyFeatureList.g:229:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyFeatureList.g:229:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyFeatureList.g:230:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyFeatureList.g:230:3: (lv_name_0_0= RULE_ID )
            // InternalMyFeatureList.g:231:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAttributeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCondition"
    // InternalMyFeatureList.g:250:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyFeatureList.g:250:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyFeatureList.g:251:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyFeatureList.g:257:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '=' | otherlv_4= '<=' | otherlv_5= '<' ) ( (lv_value_6_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:263:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '=' | otherlv_4= '<=' | otherlv_5= '<' ) ( (lv_value_6_0= RULE_INT ) ) ) )
            // InternalMyFeatureList.g:264:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '=' | otherlv_4= '<=' | otherlv_5= '<' ) ( (lv_value_6_0= RULE_INT ) ) )
            {
            // InternalMyFeatureList.g:264:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '=' | otherlv_4= '<=' | otherlv_5= '<' ) ( (lv_value_6_0= RULE_INT ) ) )
            // InternalMyFeatureList.g:265:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '=' | otherlv_4= '<=' | otherlv_5= '<' ) ( (lv_value_6_0= RULE_INT ) )
            {
            // InternalMyFeatureList.g:265:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyFeatureList.g:266:4: (otherlv_0= RULE_ID )
            {
            // InternalMyFeatureList.g:266:4: (otherlv_0= RULE_ID )
            // InternalMyFeatureList.g:267:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getAttributeAttributeCrossReference_0_0());
            				

            }


            }

            // InternalMyFeatureList.g:278:3: (otherlv_1= '>' | otherlv_2= '>=' | otherlv_3= '=' | otherlv_4= '<=' | otherlv_5= '<' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
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
                    // InternalMyFeatureList.g:279:4: otherlv_1= '>'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:284:4: otherlv_2= '>='
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:289:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getEqualsSignKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:294:4: otherlv_4= '<='
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyFeatureList.g:299:4: otherlv_5= '<'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getLessThanSignKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalMyFeatureList.g:304:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMyFeatureList.g:305:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMyFeatureList.g:305:4: (lv_value_6_0= RULE_INT )
            // InternalMyFeatureList.g:306:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_6_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyFeatureList.g:326:1: entryRuleDotExpression returns [EObject current=null] : iv_ruleDotExpression= ruleDotExpression EOF ;
    public final EObject entryRuleDotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotExpression = null;


        try {
            // InternalMyFeatureList.g:326:54: (iv_ruleDotExpression= ruleDotExpression EOF )
            // InternalMyFeatureList.g:327:2: iv_ruleDotExpression= ruleDotExpression EOF
            {
             newCompositeNode(grammarAccess.getDotExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDotExpression=ruleDotExpression();

            state._fsp--;

             current =iv_ruleDotExpression; 
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
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalMyFeatureList.g:333:1: ruleDotExpression returns [EObject current=null] : (this_ConceptRef_0= ruleConceptRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ConceptRef_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:339:2: ( (this_ConceptRef_0= ruleConceptRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyFeatureList.g:340:2: (this_ConceptRef_0= ruleConceptRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyFeatureList.g:340:2: (this_ConceptRef_0= ruleConceptRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyFeatureList.g:341:3: this_ConceptRef_0= ruleConceptRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getDotExpressionAccess().getConceptRefParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_ConceptRef_0=ruleConceptRef();

            state._fsp--;


            			current = this_ConceptRef_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyFeatureList.g:349:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFeatureList.g:350:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMyFeatureList.g:350:4: ()
            	    // InternalMyFeatureList.g:351:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalMyFeatureList.g:361:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyFeatureList.g:362:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyFeatureList.g:362:5: (otherlv_3= RULE_ID )
            	    // InternalMyFeatureList.g:363:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDotExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_3, grammarAccess.getDotExpressionAccess().getTailAttributeCrossReference_1_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleConceptRef"
    // InternalMyFeatureList.g:379:1: entryRuleConceptRef returns [EObject current=null] : iv_ruleConceptRef= ruleConceptRef EOF ;
    public final EObject entryRuleConceptRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptRef = null;


        try {
            // InternalMyFeatureList.g:379:51: (iv_ruleConceptRef= ruleConceptRef EOF )
            // InternalMyFeatureList.g:380:2: iv_ruleConceptRef= ruleConceptRef EOF
            {
             newCompositeNode(grammarAccess.getConceptRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptRef=ruleConceptRef();

            state._fsp--;

             current =iv_ruleConceptRef; 
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
    // $ANTLR end "entryRuleConceptRef"


    // $ANTLR start "ruleConceptRef"
    // InternalMyFeatureList.g:386:1: ruleConceptRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleConceptRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:392:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyFeatureList.g:393:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyFeatureList.g:393:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMyFeatureList.g:394:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMyFeatureList.g:394:3: ()
            // InternalMyFeatureList.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConceptRefAccess().getConceptRefAction_0(),
            					current);
            			

            }

            // InternalMyFeatureList.g:401:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyFeatureList.g:402:4: (otherlv_1= RULE_ID )
            {
            // InternalMyFeatureList.g:402:4: (otherlv_1= RULE_ID )
            // InternalMyFeatureList.g:403:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getConceptRefAccess().getConceptConceptCrossReference_1_0());
            				

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
    // $ANTLR end "ruleConceptRef"


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:418:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyFeatureList.g:418:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyFeatureList.g:419:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalMyFeatureList.g:425:1: ruleFeature returns [EObject current=null] : ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_ref_1_0= ruleDotExpression ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Enumerator lv_verb_0_0 = null;

        EObject lv_ref_1_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:431:2: ( ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_ref_1_0= ruleDotExpression ) ) ) )
            // InternalMyFeatureList.g:432:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_ref_1_0= ruleDotExpression ) ) )
            {
            // InternalMyFeatureList.g:432:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (lv_ref_1_0= ruleDotExpression ) ) )
            // InternalMyFeatureList.g:433:3: ( (lv_verb_0_0= ruleVerb ) ) ( (lv_ref_1_0= ruleDotExpression ) )
            {
            // InternalMyFeatureList.g:433:3: ( (lv_verb_0_0= ruleVerb ) )
            // InternalMyFeatureList.g:434:4: (lv_verb_0_0= ruleVerb )
            {
            // InternalMyFeatureList.g:434:4: (lv_verb_0_0= ruleVerb )
            // InternalMyFeatureList.g:435:5: lv_verb_0_0= ruleVerb
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_verb_0_0=ruleVerb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					add(
            						current,
            						"verb",
            						lv_verb_0_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Verb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFeatureList.g:452:3: ( (lv_ref_1_0= ruleDotExpression ) )
            // InternalMyFeatureList.g:453:4: (lv_ref_1_0= ruleDotExpression )
            {
            // InternalMyFeatureList.g:453:4: (lv_ref_1_0= ruleDotExpression )
            // InternalMyFeatureList.g:454:5: lv_ref_1_0= ruleDotExpression
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getRefDotExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_1_0=ruleDotExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.DotExpression");
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
    // InternalMyFeatureList.g:475:1: ruleVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) ;
    public final Enumerator ruleVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:481:2: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) )
            // InternalMyFeatureList.g:482:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            {
            // InternalMyFeatureList.g:482:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyFeatureList.g:483:3: (enumLiteral_0= 'Add' )
                    {
                    // InternalMyFeatureList.g:483:3: (enumLiteral_0= 'Add' )
                    // InternalMyFeatureList.g:484:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:491:3: (enumLiteral_1= 'Remove' )
                    {
                    // InternalMyFeatureList.g:491:3: (enumLiteral_1= 'Remove' )
                    // InternalMyFeatureList.g:492:4: enumLiteral_1= 'Remove'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:499:3: (enumLiteral_2= 'Update' )
                    {
                    // InternalMyFeatureList.g:499:3: (enumLiteral_2= 'Update' )
                    // InternalMyFeatureList.g:500:4: enumLiteral_2= 'Update'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:507:3: (enumLiteral_3= 'Display' )
                    {
                    // InternalMyFeatureList.g:507:3: (enumLiteral_3= 'Display' )
                    // InternalMyFeatureList.g:508:4: enumLiteral_3= 'Display'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});

}