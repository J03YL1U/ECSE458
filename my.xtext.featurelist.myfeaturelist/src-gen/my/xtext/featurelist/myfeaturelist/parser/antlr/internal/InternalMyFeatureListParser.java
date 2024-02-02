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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MULTIPLICITY", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'constraints'", "'keys'", "'properties'", "'features'", "'concept'", "'>'", "'>='", "'='", "'<='", "'<'", "'.'", "'unique'", "'autounique'", "'root'", "'lazy'", "'Add'", "'Remove'", "'Update'", "'Display'"
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
    public static final int T__30=30;
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
    // InternalMyFeatureList.g:72:1: ruleFeatureList returns [EObject current=null] : ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* ) ;
    public final EObject ruleFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_concepts_0_0 = null;

        EObject lv_constraints_2_0 = null;

        EObject lv_keys_4_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:78:2: ( ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* ) )
            // InternalMyFeatureList.g:79:2: ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* )
            {
            // InternalMyFeatureList.g:79:2: ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* )
            // InternalMyFeatureList.g:80:3: ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )*
            {
            // InternalMyFeatureList.g:80:3: ( (lv_concepts_0_0= ruleConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyFeatureList.g:81:4: (lv_concepts_0_0= ruleConcept )
            	    {
            	    // InternalMyFeatureList.g:81:4: (lv_concepts_0_0= ruleConcept )
            	    // InternalMyFeatureList.g:82:5: lv_concepts_0_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getConceptsConceptParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_concepts_0_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concepts",
            	    						lv_concepts_0_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureListAccess().getConstraintsKeyword_1());
            		
            // InternalMyFeatureList.g:103:3: ( (lv_constraints_2_0= ruleConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyFeatureList.g:104:4: (lv_constraints_2_0= ruleConstraint )
            	    {
            	    // InternalMyFeatureList.g:104:4: (lv_constraints_2_0= ruleConstraint )
            	    // InternalMyFeatureList.g:105:5: lv_constraints_2_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getConstraintsConstraintParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_constraints_2_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_2_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureListAccess().getKeysKeyword_3());
            		
            // InternalMyFeatureList.g:126:3: ( (lv_keys_4_0= ruleKey ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyFeatureList.g:127:4: (lv_keys_4_0= ruleKey )
            	    {
            	    // InternalMyFeatureList.g:127:4: (lv_keys_4_0= ruleKey )
            	    // InternalMyFeatureList.g:128:5: lv_keys_4_0= ruleKey
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getKeysKeyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_keys_4_0=ruleKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"keys",
            	    						lv_keys_4_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Key");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFeatureListAccess().getPropertiesKeyword_5());
            		
            // InternalMyFeatureList.g:149:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyFeatureList.g:150:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalMyFeatureList.g:150:4: (lv_properties_6_0= ruleProperty )
            	    // InternalMyFeatureList.g:151:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getPropertiesPropertyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getFeatureListAccess().getFeaturesKeyword_7());
            		
            // InternalMyFeatureList.g:172:3: ( (lv_features_8_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=27 && LA5_0<=30)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyFeatureList.g:173:4: (lv_features_8_0= ruleFeature )
            	    {
            	    // InternalMyFeatureList.g:173:4: (lv_features_8_0= ruleFeature )
            	    // InternalMyFeatureList.g:174:5: lv_features_8_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureListAccess().getFeaturesFeatureParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_8_0,
            	    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.Feature");
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
    // $ANTLR end "ruleFeatureList"


    // $ANTLR start "entryRuleConcept"
    // InternalMyFeatureList.g:195:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalMyFeatureList.g:195:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalMyFeatureList.g:196:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalMyFeatureList.g:202:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:208:2: ( (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) )
            // InternalMyFeatureList.g:209:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            {
            // InternalMyFeatureList.g:209:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            // InternalMyFeatureList.g:210:3: otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
            		
            // InternalMyFeatureList.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyFeatureList.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyFeatureList.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalMyFeatureList.g:216:5: lv_name_1_0= RULE_ID
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

            // InternalMyFeatureList.g:232:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyFeatureList.g:233:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyFeatureList.g:233:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyFeatureList.g:234:5: lv_attributes_2_0= ruleAttribute
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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyFeatureList.g:255:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyFeatureList.g:255:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyFeatureList.g:256:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyFeatureList.g:262:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_multiplicity_2_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:268:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )? ) )
            // InternalMyFeatureList.g:269:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )? )
            {
            // InternalMyFeatureList.g:269:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )? )
            // InternalMyFeatureList.g:270:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )?
            {
            // InternalMyFeatureList.g:270:3: ( (lv_type_0_0= ruleType ) )
            // InternalMyFeatureList.g:271:4: (lv_type_0_0= ruleType )
            {
            // InternalMyFeatureList.g:271:4: (lv_type_0_0= ruleType )
            // InternalMyFeatureList.g:272:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalMyFeatureList.g:289:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyFeatureList.g:290:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyFeatureList.g:290:4: (lv_name_1_0= RULE_ID )
            // InternalMyFeatureList.g:291:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalMyFeatureList.g:307:3: ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_MULTIPLICITY) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyFeatureList.g:308:4: (lv_multiplicity_2_0= RULE_MULTIPLICITY )
                    {
                    // InternalMyFeatureList.g:308:4: (lv_multiplicity_2_0= RULE_MULTIPLICITY )
                    // InternalMyFeatureList.g:309:5: lv_multiplicity_2_0= RULE_MULTIPLICITY
                    {
                    lv_multiplicity_2_0=(Token)match(input,RULE_MULTIPLICITY,FOLLOW_2); 

                    					newLeafNode(lv_multiplicity_2_0, grammarAccess.getAttributeAccess().getMultiplicityMULTIPLICITYTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_2_0,
                    						"my.xtext.featurelist.myfeaturelist.MyFeatureList.MULTIPLICITY");
                    				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMyFeatureList.g:329:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyFeatureList.g:329:45: (iv_ruleType= ruleType EOF )
            // InternalMyFeatureList.g:330:2: iv_ruleType= ruleType EOF
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
    // InternalMyFeatureList.g:336:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:342:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyFeatureList.g:343:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyFeatureList.g:343:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyFeatureList.g:344:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyFeatureList.g:344:3: (lv_name_0_0= RULE_ID )
            // InternalMyFeatureList.g:345:4: lv_name_0_0= RULE_ID
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
    // InternalMyFeatureList.g:364:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyFeatureList.g:364:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyFeatureList.g:365:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyFeatureList.g:371:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) ) ;
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
            // InternalMyFeatureList.g:377:2: ( ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalMyFeatureList.g:378:2: ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalMyFeatureList.g:378:2: ( (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) ) )
            // InternalMyFeatureList.g:379:3: (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' ) ( (lv_value_5_0= RULE_INT ) )
            {
            // InternalMyFeatureList.g:379:3: (otherlv_0= '>' | otherlv_1= '>=' | otherlv_2= '=' | otherlv_3= '<=' | otherlv_4= '<' )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyFeatureList.g:380:4: otherlv_0= '>'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:385:4: otherlv_1= '>='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getGreaterThanSignEqualsSignKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:390:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getEqualsSignKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:395:4: otherlv_3= '<='
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLessThanSignEqualsSignKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyFeatureList.g:400:4: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLessThanSignKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalMyFeatureList.g:405:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalMyFeatureList.g:406:4: (lv_value_5_0= RULE_INT )
            {
            // InternalMyFeatureList.g:406:4: (lv_value_5_0= RULE_INT )
            // InternalMyFeatureList.g:407:5: lv_value_5_0= RULE_INT
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


    // $ANTLR start "entryRuleErrorMsg"
    // InternalMyFeatureList.g:427:1: entryRuleErrorMsg returns [String current=null] : iv_ruleErrorMsg= ruleErrorMsg EOF ;
    public final String entryRuleErrorMsg() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleErrorMsg = null;


        try {
            // InternalMyFeatureList.g:427:48: (iv_ruleErrorMsg= ruleErrorMsg EOF )
            // InternalMyFeatureList.g:428:2: iv_ruleErrorMsg= ruleErrorMsg EOF
            {
             newCompositeNode(grammarAccess.getErrorMsgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorMsg=ruleErrorMsg();

            state._fsp--;

             current =iv_ruleErrorMsg.getText(); 
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
    // $ANTLR end "entryRuleErrorMsg"


    // $ANTLR start "ruleErrorMsg"
    // InternalMyFeatureList.g:434:1: ruleErrorMsg returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleErrorMsg() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:440:2: (this_STRING_0= RULE_STRING )
            // InternalMyFeatureList.g:441:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getErrorMsgAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleErrorMsg"


    // $ANTLR start "entryRuleConstraint"
    // InternalMyFeatureList.g:451:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMyFeatureList.g:451:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMyFeatureList.g:452:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalMyFeatureList.g:458:1: ruleConstraint returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errormsg_4_0= ruleErrorMsg ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;

        AntlrDatatypeRuleToken lv_errormsg_4_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:464:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errormsg_4_0= ruleErrorMsg ) ) ) )
            // InternalMyFeatureList.g:465:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errormsg_4_0= ruleErrorMsg ) ) )
            {
            // InternalMyFeatureList.g:465:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errormsg_4_0= ruleErrorMsg ) ) )
            // InternalMyFeatureList.g:466:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errormsg_4_0= ruleErrorMsg ) )
            {
            // InternalMyFeatureList.g:466:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyFeatureList.g:467:4: (otherlv_0= RULE_ID )
            {
            // InternalMyFeatureList.g:467:4: (otherlv_0= RULE_ID )
            // InternalMyFeatureList.g:468:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalMyFeatureList.g:479:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyFeatureList.g:480:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getFullStopKeyword_1_0());
            			
            // InternalMyFeatureList.g:484:4: ( (otherlv_2= RULE_ID ) )
            // InternalMyFeatureList.g:485:5: (otherlv_2= RULE_ID )
            {
            // InternalMyFeatureList.g:485:5: (otherlv_2= RULE_ID )
            // InternalMyFeatureList.g:486:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConstraintRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            						newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getAttributeAttributeCrossReference_1_1_0());
            					

            }


            }


            }

            // InternalMyFeatureList.g:498:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalMyFeatureList.g:499:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalMyFeatureList.g:499:4: (lv_condition_3_0= ruleCondition )
            // InternalMyFeatureList.g:500:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalMyFeatureList.g:517:3: ( (lv_errormsg_4_0= ruleErrorMsg ) )
            // InternalMyFeatureList.g:518:4: (lv_errormsg_4_0= ruleErrorMsg )
            {
            // InternalMyFeatureList.g:518:4: (lv_errormsg_4_0= ruleErrorMsg )
            // InternalMyFeatureList.g:519:5: lv_errormsg_4_0= ruleErrorMsg
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getErrormsgErrorMsgParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_errormsg_4_0=ruleErrorMsg();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					add(
            						current,
            						"errormsg",
            						lv_errormsg_4_0,
            						"my.xtext.featurelist.myfeaturelist.MyFeatureList.ErrorMsg");
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
    // InternalMyFeatureList.g:540:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalMyFeatureList.g:540:44: (iv_ruleKey= ruleKey EOF )
            // InternalMyFeatureList.g:541:2: iv_ruleKey= ruleKey EOF
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
    // InternalMyFeatureList.g:547:1: ruleKey returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'unique' | otherlv_4= 'autounique' ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:553:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'unique' | otherlv_4= 'autounique' ) ) )
            // InternalMyFeatureList.g:554:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'unique' | otherlv_4= 'autounique' ) )
            {
            // InternalMyFeatureList.g:554:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'unique' | otherlv_4= 'autounique' ) )
            // InternalMyFeatureList.g:555:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'unique' | otherlv_4= 'autounique' )
            {
            // InternalMyFeatureList.g:555:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyFeatureList.g:556:4: (otherlv_0= RULE_ID )
            {
            // InternalMyFeatureList.g:556:4: (otherlv_0= RULE_ID )
            // InternalMyFeatureList.g:557:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalMyFeatureList.g:568:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyFeatureList.g:569:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getKeyAccess().getFullStopKeyword_1_0());
            			
            // InternalMyFeatureList.g:573:4: ( (otherlv_2= RULE_ID ) )
            // InternalMyFeatureList.g:574:5: (otherlv_2= RULE_ID )
            {
            // InternalMyFeatureList.g:574:5: (otherlv_2= RULE_ID )
            // InternalMyFeatureList.g:575:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getKeyRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            						newLeafNode(otherlv_2, grammarAccess.getKeyAccess().getAttributeAttributeCrossReference_1_1_0());
            					

            }


            }


            }

            // InternalMyFeatureList.g:587:3: (otherlv_3= 'unique' | otherlv_4= 'autounique' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyFeatureList.g:588:4: otherlv_3= 'unique'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getKeyAccess().getUniqueKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:593:4: otherlv_4= 'autounique'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getKeyAccess().getAutouniqueKeyword_2_1());
                    			

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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleConceptProperty"
    // InternalMyFeatureList.g:602:1: entryRuleConceptProperty returns [EObject current=null] : iv_ruleConceptProperty= ruleConceptProperty EOF ;
    public final EObject entryRuleConceptProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptProperty = null;


        try {
            // InternalMyFeatureList.g:602:56: (iv_ruleConceptProperty= ruleConceptProperty EOF )
            // InternalMyFeatureList.g:603:2: iv_ruleConceptProperty= ruleConceptProperty EOF
            {
             newCompositeNode(grammarAccess.getConceptPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptProperty=ruleConceptProperty();

            state._fsp--;

             current =iv_ruleConceptProperty; 
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
    // $ANTLR end "entryRuleConceptProperty"


    // $ANTLR start "ruleConceptProperty"
    // InternalMyFeatureList.g:609:1: ruleConceptProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'root' ) ;
    public final EObject ruleConceptProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:615:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'root' ) )
            // InternalMyFeatureList.g:616:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'root' )
            {
            // InternalMyFeatureList.g:616:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'root' )
            // InternalMyFeatureList.g:617:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'root'
            {
            // InternalMyFeatureList.g:617:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyFeatureList.g:618:4: (otherlv_0= RULE_ID )
            {
            // InternalMyFeatureList.g:618:4: (otherlv_0= RULE_ID )
            // InternalMyFeatureList.g:619:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getConceptPropertyAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getConceptPropertyAccess().getRootKeyword_1());
            		

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
    // $ANTLR end "ruleConceptProperty"


    // $ANTLR start "entryRuleAttributeProperty"
    // InternalMyFeatureList.g:638:1: entryRuleAttributeProperty returns [EObject current=null] : iv_ruleAttributeProperty= ruleAttributeProperty EOF ;
    public final EObject entryRuleAttributeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeProperty = null;


        try {
            // InternalMyFeatureList.g:638:58: (iv_ruleAttributeProperty= ruleAttributeProperty EOF )
            // InternalMyFeatureList.g:639:2: iv_ruleAttributeProperty= ruleAttributeProperty EOF
            {
             newCompositeNode(grammarAccess.getAttributePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeProperty=ruleAttributeProperty();

            state._fsp--;

             current =iv_ruleAttributeProperty; 
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
    // $ANTLR end "entryRuleAttributeProperty"


    // $ANTLR start "ruleAttributeProperty"
    // InternalMyFeatureList.g:645:1: ruleAttributeProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'lazy' ) ;
    public final EObject ruleAttributeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:651:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'lazy' ) )
            // InternalMyFeatureList.g:652:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'lazy' )
            {
            // InternalMyFeatureList.g:652:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'lazy' )
            // InternalMyFeatureList.g:653:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'lazy'
            {
            // InternalMyFeatureList.g:653:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyFeatureList.g:654:4: (otherlv_0= RULE_ID )
            {
            // InternalMyFeatureList.g:654:4: (otherlv_0= RULE_ID )
            // InternalMyFeatureList.g:655:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributePropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributePropertyAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalMyFeatureList.g:666:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyFeatureList.g:667:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getAttributePropertyAccess().getFullStopKeyword_1_0());
            			
            // InternalMyFeatureList.g:671:4: ( (otherlv_2= RULE_ID ) )
            // InternalMyFeatureList.g:672:5: (otherlv_2= RULE_ID )
            {
            // InternalMyFeatureList.g:672:5: (otherlv_2= RULE_ID )
            // InternalMyFeatureList.g:673:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAttributePropertyRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            						newLeafNode(otherlv_2, grammarAccess.getAttributePropertyAccess().getAttributeAttributeCrossReference_1_1_0());
            					

            }


            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributePropertyAccess().getLazyKeyword_2());
            		

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
    // $ANTLR end "ruleAttributeProperty"


    // $ANTLR start "entryRuleProperty"
    // InternalMyFeatureList.g:693:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMyFeatureList.g:693:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMyFeatureList.g:694:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMyFeatureList.g:700:1: ruleProperty returns [EObject current=null] : (this_ConceptProperty_0= ruleConceptProperty | this_AttributeProperty_1= ruleAttributeProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptProperty_0 = null;

        EObject this_AttributeProperty_1 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:706:2: ( (this_ConceptProperty_0= ruleConceptProperty | this_AttributeProperty_1= ruleAttributeProperty ) )
            // InternalMyFeatureList.g:707:2: (this_ConceptProperty_0= ruleConceptProperty | this_AttributeProperty_1= ruleAttributeProperty )
            {
            // InternalMyFeatureList.g:707:2: (this_ConceptProperty_0= ruleConceptProperty | this_AttributeProperty_1= ruleAttributeProperty )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==22) ) {
                    alt10=2;
                }
                else if ( (LA10_1==25) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyFeatureList.g:708:3: this_ConceptProperty_0= ruleConceptProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getConceptPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptProperty_0=ruleConceptProperty();

                    state._fsp--;


                    			current = this_ConceptProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:717:3: this_AttributeProperty_1= ruleAttributeProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getAttributePropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeProperty_1=ruleAttributeProperty();

                    state._fsp--;


                    			current = this_AttributeProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleFeature"
    // InternalMyFeatureList.g:729:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyFeatureList.g:729:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyFeatureList.g:730:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalMyFeatureList.g:736:1: ruleFeature returns [EObject current=null] : ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_verb_0_0 = null;



        	enterRule();

        try {
            // InternalMyFeatureList.g:742:2: ( ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalMyFeatureList.g:743:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalMyFeatureList.g:743:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? )
            // InternalMyFeatureList.g:744:3: ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )?
            {
            // InternalMyFeatureList.g:744:3: ( (lv_verb_0_0= ruleVerb ) )
            // InternalMyFeatureList.g:745:4: (lv_verb_0_0= ruleVerb )
            {
            // InternalMyFeatureList.g:745:4: (lv_verb_0_0= ruleVerb )
            // InternalMyFeatureList.g:746:5: lv_verb_0_0= ruleVerb
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getVerbVerbEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalMyFeatureList.g:763:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyFeatureList.g:764:4: (otherlv_1= RULE_ID )
            {
            // InternalMyFeatureList.g:764:4: (otherlv_1= RULE_ID )
            // InternalMyFeatureList.g:765:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0());
            				

            }


            }

            // InternalMyFeatureList.g:776:3: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyFeatureList.g:777:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFullStopKeyword_2_0());
                    			
                    // InternalMyFeatureList.g:781:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyFeatureList.g:782:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyFeatureList.g:782:5: (otherlv_3= RULE_ID )
                    // InternalMyFeatureList.g:783:6: otherlv_3= RULE_ID
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
    // InternalMyFeatureList.g:799:1: ruleVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) ;
    public final Enumerator ruleVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyFeatureList.g:805:2: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) )
            // InternalMyFeatureList.g:806:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            {
            // InternalMyFeatureList.g:806:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyFeatureList.g:807:3: (enumLiteral_0= 'Add' )
                    {
                    // InternalMyFeatureList.g:807:3: (enumLiteral_0= 'Add' )
                    // InternalMyFeatureList.g:808:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyFeatureList.g:815:3: (enumLiteral_1= 'Remove' )
                    {
                    // InternalMyFeatureList.g:815:3: (enumLiteral_1= 'Remove' )
                    // InternalMyFeatureList.g:816:4: enumLiteral_1= 'Remove'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyFeatureList.g:823:3: (enumLiteral_2= 'Update' )
                    {
                    // InternalMyFeatureList.g:823:3: (enumLiteral_2= 'Update' )
                    // InternalMyFeatureList.g:824:4: enumLiteral_2= 'Update'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyFeatureList.g:831:3: (enumLiteral_3= 'Display' )
                    {
                    // InternalMyFeatureList.g:831:3: (enumLiteral_3= 'Display' )
                    // InternalMyFeatureList.g:832:4: enumLiteral_3= 'Display'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});

}