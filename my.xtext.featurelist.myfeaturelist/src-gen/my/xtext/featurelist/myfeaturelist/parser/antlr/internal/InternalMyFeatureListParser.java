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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'constraints'", "'keys'", "'features'", "'concept'", "'>'", "'>='", "'='", "'<='", "'<'", "'.'", "'Add'", "'Remove'", "'Update'", "'Display'"
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
    // InternalMyFeatureList.g:72:1: ruleFeatureList returns [EObject current=null] : ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraint_2_0= ruleConstraint ) )+ otherlv_3= 'keys' ( (lv_key_4_0= ruleKey ) )+ otherlv_5= 'features' ( (lv_feature_6_0= ruleFeature ) )+ ) ;
    public final EObject ruleFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_concept_0_0 = null;

        EObject lv_constraint_2_0 = null;

        EObject lv_key_4_0 = null;

        EObject lv_feature_6_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:78:2: ( ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraint_2_0= ruleConstraint ) )+ otherlv_3= 'keys' ( (lv_key_4_0= ruleKey ) )+ otherlv_5= 'features' ( (lv_feature_6_0= ruleFeature ) )+ ) )
            // InternalMyFeatureList.g:79:2: ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraint_2_0= ruleConstraint ) )+ otherlv_3= 'keys' ( (lv_key_4_0= ruleKey ) )+ otherlv_5= 'features' ( (lv_feature_6_0= ruleFeature ) )+ )
            {
            // InternalMyFeatureList.g:79:2: ( ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraint_2_0= ruleConstraint ) )+ otherlv_3= 'keys' ( (lv_key_4_0= ruleKey ) )+ otherlv_5= 'features' ( (lv_feature_6_0= ruleFeature ) )+ )
            // InternalMyFeatureList.g:80:3: ( (lv_concept_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraint_2_0= ruleConstraint ) )+ otherlv_3= 'keys' ( (lv_key_4_0= ruleKey ) )+ otherlv_5= 'features' ( (lv_feature_6_0= ruleFeature ) )+
            {
            // InternalMyFeatureList.g:80:3: ( (lv_concept_0_0= ruleConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
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

            			newLeafNode(otherlv_1, grammarAccess.getFeatureListAccess().getConstraintsKeyword_1());
            		
            // InternalMyFeatureList.g:103:3: ( (lv_constraint_2_0= ruleConstraint ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyFeatureList.g:104:4: (lv_constraint_2_0= ruleConstraint )
            	    {
            	    // InternalMyFeatureList.g:104:4: (lv_constraint_2_0= ruleConstraint )
            	    // InternalMyFeatureList.g:105:5: lv_constraint_2_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getConstraintConstraintParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_constraint_2_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraint",
            	    						lv_constraint_2_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Constraint");
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

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureListAccess().getKeysKeyword_3());
            		
            // InternalMyFeatureList.g:126:3: ( (lv_key_4_0= ruleKey ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFeatureList.g:127:4: (lv_key_4_0= ruleKey )
            	    {
            	    // InternalMyFeatureList.g:127:4: (lv_key_4_0= ruleKey )
            	    // InternalMyFeatureList.g:128:5: lv_key_4_0= ruleKey
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getKeyKeyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_key_4_0=ruleKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"key",
            	    						lv_key_4_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Key");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getFeatureListAccess().getFeaturesKeyword_5());
            		
            // InternalMyFeatureList.g:149:3: ( (lv_feature_6_0= ruleFeature ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyFeatureList.g:150:4: (lv_feature_6_0= ruleFeature )
            	    {
            	    // InternalMyFeatureList.g:150:4: (lv_feature_6_0= ruleFeature )
            	    // InternalMyFeatureList.g:151:5: lv_feature_6_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getFeatureFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_feature_6_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_6_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalMyFeatureList.g:172:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalMyFeatureList.g:172:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalMyFeatureList.g:173:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalMyFeatureList.g:179:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:185:2: ( (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) )
            // InternalMyFeatureList.g:186:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            {
            // InternalMyFeatureList.g:186:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            // InternalMyFeatureList.g:187:3: otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
            		
            // InternalMyFeatureList.g:191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyFeatureList.g:192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyFeatureList.g:192:4: (lv_name_1_0= RULE_ID )
            // InternalMyFeatureList.g:193:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalMyFeatureList.g:209:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFeatureList.g:210:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyFeatureList.g:210:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyFeatureList.g:211:5: lv_attributes_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getConceptAccess().getAttributesAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop5;
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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyFeatureList.g:232:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyFeatureList.g:232:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyFeatureList.g:233:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyFeatureList.g:239:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:245:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyFeatureList.g:246:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyFeatureList.g:246:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyFeatureList.g:247:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyFeatureList.g:247:3: ( (lv_type_0_0= ruleType ) )
            // InternalMyFeatureList.g:248:4: (lv_type_0_0= ruleType )
            {
            // InternalMyFeatureList.g:248:4: (lv_type_0_0= ruleType )
            // InternalMyFeatureList.g:249:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFeatureList.g:266:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyFeatureList.g:267:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyFeatureList.g:267:4: (lv_name_1_0= RULE_ID )
            // InternalMyFeatureList.g:268:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMyFeatureList.g:288:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyFeatureList.g:288:45: (iv_ruleType= ruleType EOF )
            // InternalMyFeatureList.g:289:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyFeatureList.g:295:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:301:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyFeatureList.g:302:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyFeatureList.g:302:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyFeatureList.g:303:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyFeatureList.g:303:3: (lv_name_0_0= RULE_ID )
            // InternalMyFeatureList.g:304:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCondition"
    // InternalMyFeatureList.g:323:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyFeatureList.g:323:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyFeatureList.g:324:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyFeatureList.g:330:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:336:2: ( ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalMyFeatureList.g:337:2: ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalMyFeatureList.g:337:2: ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) )
            // InternalMyFeatureList.g:338:3: (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) )
            {
            // InternalMyFeatureList.g:338:3: (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyFeatureList.g:339:4: otherlv_0= '>'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:344:4: otherlv_1= '>='
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:349:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:354:4: otherlv_3= '<='
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyFeatureList.g:359:4: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLessThanSignKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalMyFeatureList.g:364:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalMyFeatureList.g:365:4: (lv_value_5_0= RULE_INT )
            {
            // InternalMyFeatureList.g:365:4: (lv_value_5_0= RULE_INT )
            // InternalMyFeatureList.g:366:5: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
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


    // $ANTLR start "entryRuleConstraint"
    // InternalMyFeatureList.g:386:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyFeatureList.g:386:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyFeatureList.g:387:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMyFeatureList.g:393:1: ruleConstraint returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:399:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ) )
            // InternalMyFeatureList.g:400:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) )
            {
            // InternalMyFeatureList.g:400:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) )
            // InternalMyFeatureList.g:401:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) )
            {
            // InternalMyFeatureList.g:401:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyFeatureList.g:402:4: (otherlv_0= RULE_ID )
            {
            // InternalMyFeatureList.g:402:4: (otherlv_0= RULE_ID )
            // InternalMyFeatureList.g:403:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalMyFeatureList.g:414:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyFeatureList.g:415:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getFullStopKeyword_1_0());
            			
            // InternalMyFeatureList.g:419:4: ( (otherlv_2= RULE_ID ) )
            // InternalMyFeatureList.g:420:5: (otherlv_2= RULE_ID )
            {
            // InternalMyFeatureList.g:420:5: (otherlv_2= RULE_ID )
            // InternalMyFeatureList.g:421:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConstraintRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            						newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getAttributeAttributeCrossReference_1_1_0());
            					

            }


            }


            }

            // InternalMyFeatureList.g:433:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalMyFeatureList.g:434:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalMyFeatureList.g:434:4: (lv_condition_3_0= ruleCondition )
            // InternalMyFeatureList.g:435:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					add(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Condition");
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleKey"
    // InternalMyFeatureList.g:456:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalMyFeatureList.g:456:44: (iv_ruleKey= ruleKey EOF )
            // InternalMyFeatureList.g:457:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
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
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalMyFeatureList.g:463:1: ruleKey returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:469:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalMyFeatureList.g:470:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalMyFeatureList.g:470:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyFeatureList.g:471:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyFeatureList.g:471:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyFeatureList.g:472:4: (otherlv_0= RULE_ID )
            {
            // InternalMyFeatureList.g:472:4: (otherlv_0= RULE_ID )
            // InternalMyFeatureList.g:473:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalMyFeatureList.g:484:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyFeatureList.g:485:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getKeyAccess().getFullStopKeyword_1_0());
            			
            // InternalMyFeatureList.g:489:4: ( (otherlv_2= RULE_ID ) )
            // InternalMyFeatureList.g:490:5: (otherlv_2= RULE_ID )
            {
            // InternalMyFeatureList.g:490:5: (otherlv_2= RULE_ID )
            // InternalMyFeatureList.g:491:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getKeyRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            						newLeafNode(otherlv_2, grammarAccess.getKeyAccess().getAttributeAttributeCrossReference_1_1_0());
            					

            }


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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:507:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyFeatureList.g:507:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyFeatureList.g:508:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalMyFeatureList.g:514:1: ruleFeature returns [EObject current=null] : ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_verb_0_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:520:2: ( ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalMyFeatureList.g:521:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalMyFeatureList.g:521:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? )
            // InternalMyFeatureList.g:522:3: ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )?
            {
            // InternalMyFeatureList.g:522:3: ( (lv_verb_0_0= ruleVerb ) )
            // InternalMyFeatureList.g:523:4: (lv_verb_0_0= ruleVerb )
            {
            // InternalMyFeatureList.g:523:4: (lv_verb_0_0= ruleVerb )
            // InternalMyFeatureList.g:524:5: lv_verb_0_0= ruleVerb
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_verb_0_0=ruleVerb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"verb",
            						lv_verb_0_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Verb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyFeatureList.g:541:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyFeatureList.g:542:4: (otherlv_1= RULE_ID )
            {
            // InternalMyFeatureList.g:542:4: (otherlv_1= RULE_ID )
            // InternalMyFeatureList.g:543:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0());
            				

            }


            }

            // InternalMyFeatureList.g:554:3: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyFeatureList.g:555:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFullStopKeyword_2_0());
                    			
                    // InternalMyFeatureList.g:559:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyFeatureList.g:560:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyFeatureList.g:560:5: (otherlv_3= RULE_ID )
                    // InternalMyFeatureList.g:561:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getAttributeAttributeCrossReference_2_1_0());
                    					

                    }


                    }


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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "ruleVerb"
    // InternalMyFeatureList.g:577:1: ruleVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) ;
    public final Enumerator ruleVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:583:2: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) )
            // InternalMyFeatureList.g:584:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            {
            // InternalMyFeatureList.g:584:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyFeatureList.g:585:3: (enumLiteral_0= 'Add' )
                    {
                    // InternalMyFeatureList.g:585:3: (enumLiteral_0= 'Add' )
                    // InternalMyFeatureList.g:586:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:593:3: (enumLiteral_1= 'Remove' )
                    {
                    // InternalMyFeatureList.g:593:3: (enumLiteral_1= 'Remove' )
                    // InternalMyFeatureList.g:594:4: enumLiteral_1= 'Remove'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:601:3: (enumLiteral_2= 'Update' )
                    {
                    // InternalMyFeatureList.g:601:3: (enumLiteral_2= 'Update' )
                    // InternalMyFeatureList.g:602:4: enumLiteral_2= 'Update'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:609:3: (enumLiteral_3= 'Display' )
                    {
                    // InternalMyFeatureList.g:609:3: (enumLiteral_3= 'Display' )
                    // InternalMyFeatureList.g:610:4: enumLiteral_3= 'Display'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});

}