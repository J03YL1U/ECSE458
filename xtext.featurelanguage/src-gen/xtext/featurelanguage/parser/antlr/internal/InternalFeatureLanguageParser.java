package xtext.featurelanguage.parser.antlr.internal;

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
import xtext.featurelanguage.services.FeatureLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MULTIPLICITY", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'constraints'", "'keys'", "'properties'", "'features'", "'concept'", "'{'", "'}'", "'.'", "'root'", "'lazy'", "'Add'", "'Remove'", "'Update'", "'Display'", "'unique'", "'autounique'", "'index'", "'>'", "'>='", "'='", "'<='", "'<'"
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

        public InternalFeatureLanguageParser(TokenStream input, FeatureLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FeatureLanguage";
       	}

       	@Override
       	protected FeatureLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFeatureLanguage"
    // InternalFeatureLanguage.g:65:1: entryRuleFeatureLanguage returns [EObject current=null] : iv_ruleFeatureLanguage= ruleFeatureLanguage EOF ;
    public final EObject entryRuleFeatureLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureLanguage = null;


        try {
            // InternalFeatureLanguage.g:65:56: (iv_ruleFeatureLanguage= ruleFeatureLanguage EOF )
            // InternalFeatureLanguage.g:66:2: iv_ruleFeatureLanguage= ruleFeatureLanguage EOF
            {
             newCompositeNode(grammarAccess.getFeatureLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureLanguage=ruleFeatureLanguage();

            state._fsp--;

             current =iv_ruleFeatureLanguage; 
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
    // $ANTLR end "entryRuleFeatureLanguage"


    // $ANTLR start "ruleFeatureLanguage"
    // InternalFeatureLanguage.g:72:1: ruleFeatureLanguage returns [EObject current=null] : ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* ) ;
    public final EObject ruleFeatureLanguage() throws RecognitionException {
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
            // InternalFeatureLanguage.g:78:2: ( ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* ) )
            // InternalFeatureLanguage.g:79:2: ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* )
            {
            // InternalFeatureLanguage.g:79:2: ( ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )* )
            // InternalFeatureLanguage.g:80:3: ( (lv_concepts_0_0= ruleConcept ) )* otherlv_1= 'constraints' ( (lv_constraints_2_0= ruleConstraint ) )* otherlv_3= 'keys' ( (lv_keys_4_0= ruleKey ) )* otherlv_5= 'properties' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= 'features' ( (lv_features_8_0= ruleFeature ) )*
            {
            // InternalFeatureLanguage.g:80:3: ( (lv_concepts_0_0= ruleConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureLanguage.g:81:4: (lv_concepts_0_0= ruleConcept )
            	    {
            	    // InternalFeatureLanguage.g:81:4: (lv_concepts_0_0= ruleConcept )
            	    // InternalFeatureLanguage.g:82:5: lv_concepts_0_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureLanguageAccess().getConceptsConceptParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_concepts_0_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concepts",
            	    						lv_concepts_0_0,
            	    						"xtext.featurelanguage.FeatureLanguage.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureLanguageAccess().getConstraintsKeyword_1());
            		
            // InternalFeatureLanguage.g:103:3: ( (lv_constraints_2_0= ruleConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFeatureLanguage.g:104:4: (lv_constraints_2_0= ruleConstraint )
            	    {
            	    // InternalFeatureLanguage.g:104:4: (lv_constraints_2_0= ruleConstraint )
            	    // InternalFeatureLanguage.g:105:5: lv_constraints_2_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureLanguageAccess().getConstraintsConstraintParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_constraints_2_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_2_0,
            	    						"xtext.featurelanguage.FeatureLanguage.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureLanguageAccess().getKeysKeyword_3());
            		
            // InternalFeatureLanguage.g:126:3: ( (lv_keys_4_0= ruleKey ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFeatureLanguage.g:127:4: (lv_keys_4_0= ruleKey )
            	    {
            	    // InternalFeatureLanguage.g:127:4: (lv_keys_4_0= ruleKey )
            	    // InternalFeatureLanguage.g:128:5: lv_keys_4_0= ruleKey
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureLanguageAccess().getKeysKeyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_keys_4_0=ruleKey();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"keys",
            	    						lv_keys_4_0,
            	    						"xtext.featurelanguage.FeatureLanguage.Key");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFeatureLanguageAccess().getPropertiesKeyword_5());
            		
            // InternalFeatureLanguage.g:149:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFeatureLanguage.g:150:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalFeatureLanguage.g:150:4: (lv_properties_6_0= ruleProperty )
            	    // InternalFeatureLanguage.g:151:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureLanguageAccess().getPropertiesPropertyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"xtext.featurelanguage.FeatureLanguage.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getFeatureLanguageAccess().getFeaturesKeyword_7());
            		
            // InternalFeatureLanguage.g:172:3: ( (lv_features_8_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=22 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFeatureLanguage.g:173:4: (lv_features_8_0= ruleFeature )
            	    {
            	    // InternalFeatureLanguage.g:173:4: (lv_features_8_0= ruleFeature )
            	    // InternalFeatureLanguage.g:174:5: lv_features_8_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureLanguageAccess().getFeaturesFeatureParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_8_0,
            	    						"xtext.featurelanguage.FeatureLanguage.Feature");
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
    // $ANTLR end "ruleFeatureLanguage"


    // $ANTLR start "entryRuleConcept"
    // InternalFeatureLanguage.g:195:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalFeatureLanguage.g:195:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalFeatureLanguage.g:196:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalFeatureLanguage.g:202:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_characteristics_2_0= ruleCharacteristic ) )* ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_characteristics_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureLanguage.g:208:2: ( (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_characteristics_2_0= ruleCharacteristic ) )* ) )
            // InternalFeatureLanguage.g:209:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_characteristics_2_0= ruleCharacteristic ) )* )
            {
            // InternalFeatureLanguage.g:209:2: (otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_characteristics_2_0= ruleCharacteristic ) )* )
            // InternalFeatureLanguage.g:210:3: otherlv_0= 'concept' ( (lv_name_1_0= RULE_ID ) ) ( (lv_characteristics_2_0= ruleCharacteristic ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getConceptKeyword_0());
            		
            // InternalFeatureLanguage.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLanguage.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLanguage.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLanguage.g:216:5: lv_name_1_0= RULE_ID
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

            // InternalFeatureLanguage.g:232:3: ( (lv_characteristics_2_0= ruleCharacteristic ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFeatureLanguage.g:233:4: (lv_characteristics_2_0= ruleCharacteristic )
            	    {
            	    // InternalFeatureLanguage.g:233:4: (lv_characteristics_2_0= ruleCharacteristic )
            	    // InternalFeatureLanguage.g:234:5: lv_characteristics_2_0= ruleCharacteristic
            	    {

            	    					newCompositeNode(grammarAccess.getConceptAccess().getCharacteristicsCharacteristicParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_characteristics_2_0=ruleCharacteristic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConceptRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characteristics",
            	    						lv_characteristics_2_0,
            	    						"xtext.featurelanguage.FeatureLanguage.Characteristic");
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


    // $ANTLR start "entryRuleCharacteristic"
    // InternalFeatureLanguage.g:255:1: entryRuleCharacteristic returns [EObject current=null] : iv_ruleCharacteristic= ruleCharacteristic EOF ;
    public final EObject entryRuleCharacteristic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristic = null;


        try {
            // InternalFeatureLanguage.g:255:55: (iv_ruleCharacteristic= ruleCharacteristic EOF )
            // InternalFeatureLanguage.g:256:2: iv_ruleCharacteristic= ruleCharacteristic EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristic=ruleCharacteristic();

            state._fsp--;

             current =iv_ruleCharacteristic; 
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
    // $ANTLR end "entryRuleCharacteristic"


    // $ANTLR start "ruleCharacteristic"
    // InternalFeatureLanguage.g:262:1: ruleCharacteristic returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) ) | (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' ) )? ) ;
    public final EObject ruleCharacteristic() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_multiplicity_2_0=null;
        Token otherlv_3=null;
        Token lv_literals_4_0=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalFeatureLanguage.g:268:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) ) | (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' ) )? ) )
            // InternalFeatureLanguage.g:269:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) ) | (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' ) )? )
            {
            // InternalFeatureLanguage.g:269:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) ) | (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' ) )? )
            // InternalFeatureLanguage.g:270:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) ) | (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' ) )?
            {
            // InternalFeatureLanguage.g:270:3: ( (lv_type_0_0= ruleType ) )
            // InternalFeatureLanguage.g:271:4: (lv_type_0_0= ruleType )
            {
            // InternalFeatureLanguage.g:271:4: (lv_type_0_0= ruleType )
            // InternalFeatureLanguage.g:272:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getCharacteristicAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacteristicRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"xtext.featurelanguage.FeatureLanguage.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLanguage.g:289:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFeatureLanguage.g:290:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFeatureLanguage.g:290:4: (lv_name_1_0= RULE_ID )
            // InternalFeatureLanguage.g:291:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCharacteristicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFeatureLanguage.g:307:3: ( ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) ) | (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_MULTIPLICITY) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureLanguage.g:308:4: ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )
                    {
                    // InternalFeatureLanguage.g:308:4: ( (lv_multiplicity_2_0= RULE_MULTIPLICITY ) )
                    // InternalFeatureLanguage.g:309:5: (lv_multiplicity_2_0= RULE_MULTIPLICITY )
                    {
                    // InternalFeatureLanguage.g:309:5: (lv_multiplicity_2_0= RULE_MULTIPLICITY )
                    // InternalFeatureLanguage.g:310:6: lv_multiplicity_2_0= RULE_MULTIPLICITY
                    {
                    lv_multiplicity_2_0=(Token)match(input,RULE_MULTIPLICITY,FOLLOW_2); 

                    						newLeafNode(lv_multiplicity_2_0, grammarAccess.getCharacteristicAccess().getMultiplicityMULTIPLICITYTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCharacteristicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_2_0,
                    							"xtext.featurelanguage.FeatureLanguage.MULTIPLICITY");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:327:4: (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' )
                    {
                    // InternalFeatureLanguage.g:327:4: (otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}' )
                    // InternalFeatureLanguage.g:328:5: otherlv_3= '{' ( (lv_literals_4_0= RULE_STRING ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getCharacteristicAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalFeatureLanguage.g:332:5: ( (lv_literals_4_0= RULE_STRING ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFeatureLanguage.g:333:6: (lv_literals_4_0= RULE_STRING )
                    	    {
                    	    // InternalFeatureLanguage.g:333:6: (lv_literals_4_0= RULE_STRING )
                    	    // InternalFeatureLanguage.g:334:7: lv_literals_4_0= RULE_STRING
                    	    {
                    	    lv_literals_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    							newLeafNode(lv_literals_4_0, grammarAccess.getCharacteristicAccess().getLiteralsSTRINGTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCharacteristicRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"literals",
                    	    								lv_literals_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getCharacteristicAccess().getRightCurlyBracketKeyword_2_1_2());
                    				

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
    // $ANTLR end "ruleCharacteristic"


    // $ANTLR start "entryRuleType"
    // InternalFeatureLanguage.g:360:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalFeatureLanguage.g:360:45: (iv_ruleType= ruleType EOF )
            // InternalFeatureLanguage.g:361:2: iv_ruleType= ruleType EOF
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
    // InternalFeatureLanguage.g:367:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFeatureLanguage.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFeatureLanguage.g:374:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFeatureLanguage.g:374:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFeatureLanguage.g:375:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFeatureLanguage.g:375:3: (lv_name_0_0= RULE_ID )
            // InternalFeatureLanguage.g:376:4: lv_name_0_0= RULE_ID
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
    // InternalFeatureLanguage.g:395:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalFeatureLanguage.g:395:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalFeatureLanguage.g:396:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalFeatureLanguage.g:402:1: ruleCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalFeatureLanguage.g:408:2: ( ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalFeatureLanguage.g:409:2: ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalFeatureLanguage.g:409:2: ( ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_value_1_0= RULE_INT ) ) )
            // InternalFeatureLanguage.g:410:3: ( (lv_operator_0_0= ruleComparisonOperator ) ) ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalFeatureLanguage.g:410:3: ( (lv_operator_0_0= ruleComparisonOperator ) )
            // InternalFeatureLanguage.g:411:4: (lv_operator_0_0= ruleComparisonOperator )
            {
            // InternalFeatureLanguage.g:411:4: (lv_operator_0_0= ruleComparisonOperator )
            // InternalFeatureLanguage.g:412:5: lv_operator_0_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_operator_0_0=ruleComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"xtext.featurelanguage.FeatureLanguage.ComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLanguage.g:429:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalFeatureLanguage.g:430:4: (lv_value_1_0= RULE_INT )
            {
            // InternalFeatureLanguage.g:430:4: (lv_value_1_0= RULE_INT )
            // InternalFeatureLanguage.g:431:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
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
    // InternalFeatureLanguage.g:451:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalFeatureLanguage.g:451:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalFeatureLanguage.g:452:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalFeatureLanguage.g:458:1: ruleConstraint returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errorMsg_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_errorMsg_4_0=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalFeatureLanguage.g:464:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errorMsg_4_0= RULE_STRING ) ) ) )
            // InternalFeatureLanguage.g:465:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errorMsg_4_0= RULE_STRING ) ) )
            {
            // InternalFeatureLanguage.g:465:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errorMsg_4_0= RULE_STRING ) ) )
            // InternalFeatureLanguage.g:466:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_condition_3_0= ruleCondition ) ) ( (lv_errorMsg_4_0= RULE_STRING ) )
            {
            // InternalFeatureLanguage.g:466:3: ( (otherlv_0= RULE_ID ) )
            // InternalFeatureLanguage.g:467:4: (otherlv_0= RULE_ID )
            {
            // InternalFeatureLanguage.g:467:4: (otherlv_0= RULE_ID )
            // InternalFeatureLanguage.g:468:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalFeatureLanguage.g:479:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalFeatureLanguage.g:480:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getFullStopKeyword_1_0());
            			
            // InternalFeatureLanguage.g:484:4: ( (otherlv_2= RULE_ID ) )
            // InternalFeatureLanguage.g:485:5: (otherlv_2= RULE_ID )
            {
            // InternalFeatureLanguage.g:485:5: (otherlv_2= RULE_ID )
            // InternalFeatureLanguage.g:486:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getConstraintRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            						newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getCharacteristicCharacteristicCrossReference_1_1_0());
            					

            }


            }


            }

            // InternalFeatureLanguage.g:498:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalFeatureLanguage.g:499:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalFeatureLanguage.g:499:4: (lv_condition_3_0= ruleCondition )
            // InternalFeatureLanguage.g:500:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"xtext.featurelanguage.FeatureLanguage.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLanguage.g:517:3: ( (lv_errorMsg_4_0= RULE_STRING ) )
            // InternalFeatureLanguage.g:518:4: (lv_errorMsg_4_0= RULE_STRING )
            {
            // InternalFeatureLanguage.g:518:4: (lv_errorMsg_4_0= RULE_STRING )
            // InternalFeatureLanguage.g:519:5: lv_errorMsg_4_0= RULE_STRING
            {
            lv_errorMsg_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_errorMsg_4_0, grammarAccess.getConstraintAccess().getErrorMsgSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"errorMsg",
            						lv_errorMsg_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // InternalFeatureLanguage.g:539:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalFeatureLanguage.g:539:44: (iv_ruleKey= ruleKey EOF )
            // InternalFeatureLanguage.g:540:2: iv_ruleKey= ruleKey EOF
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
    // InternalFeatureLanguage.g:546:1: ruleKey returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyType_3_0= ruleKeyType ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_keyType_3_0 = null;



        	enterRule();

        try {
            // InternalFeatureLanguage.g:552:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyType_3_0= ruleKeyType ) ) ) )
            // InternalFeatureLanguage.g:553:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyType_3_0= ruleKeyType ) ) )
            {
            // InternalFeatureLanguage.g:553:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyType_3_0= ruleKeyType ) ) )
            // InternalFeatureLanguage.g:554:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyType_3_0= ruleKeyType ) )
            {
            // InternalFeatureLanguage.g:554:3: ( (otherlv_0= RULE_ID ) )
            // InternalFeatureLanguage.g:555:4: (otherlv_0= RULE_ID )
            {
            // InternalFeatureLanguage.g:555:4: (otherlv_0= RULE_ID )
            // InternalFeatureLanguage.g:556:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getKeyAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalFeatureLanguage.g:567:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalFeatureLanguage.g:568:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getKeyAccess().getFullStopKeyword_1_0());
            			
            // InternalFeatureLanguage.g:572:4: ( (otherlv_2= RULE_ID ) )
            // InternalFeatureLanguage.g:573:5: (otherlv_2= RULE_ID )
            {
            // InternalFeatureLanguage.g:573:5: (otherlv_2= RULE_ID )
            // InternalFeatureLanguage.g:574:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getKeyRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            						newLeafNode(otherlv_2, grammarAccess.getKeyAccess().getCharacteristicCharacteristicCrossReference_1_1_0());
            					

            }


            }


            }

            // InternalFeatureLanguage.g:586:3: ( (lv_keyType_3_0= ruleKeyType ) )
            // InternalFeatureLanguage.g:587:4: (lv_keyType_3_0= ruleKeyType )
            {
            // InternalFeatureLanguage.g:587:4: (lv_keyType_3_0= ruleKeyType )
            // InternalFeatureLanguage.g:588:5: lv_keyType_3_0= ruleKeyType
            {

            					newCompositeNode(grammarAccess.getKeyAccess().getKeyTypeKeyTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_keyType_3_0=ruleKeyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyRule());
            					}
            					set(
            						current,
            						"keyType",
            						lv_keyType_3_0,
            						"xtext.featurelanguage.FeatureLanguage.KeyType");
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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleConceptProperty"
    // InternalFeatureLanguage.g:609:1: entryRuleConceptProperty returns [EObject current=null] : iv_ruleConceptProperty= ruleConceptProperty EOF ;
    public final EObject entryRuleConceptProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptProperty = null;


        try {
            // InternalFeatureLanguage.g:609:56: (iv_ruleConceptProperty= ruleConceptProperty EOF )
            // InternalFeatureLanguage.g:610:2: iv_ruleConceptProperty= ruleConceptProperty EOF
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
    // InternalFeatureLanguage.g:616:1: ruleConceptProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_isRoot_1_0= 'root' ) ) ) ;
    public final EObject ruleConceptProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isRoot_1_0=null;


        	enterRule();

        try {
            // InternalFeatureLanguage.g:622:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_isRoot_1_0= 'root' ) ) ) )
            // InternalFeatureLanguage.g:623:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_isRoot_1_0= 'root' ) ) )
            {
            // InternalFeatureLanguage.g:623:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_isRoot_1_0= 'root' ) ) )
            // InternalFeatureLanguage.g:624:3: ( (otherlv_0= RULE_ID ) ) ( (lv_isRoot_1_0= 'root' ) )
            {
            // InternalFeatureLanguage.g:624:3: ( (otherlv_0= RULE_ID ) )
            // InternalFeatureLanguage.g:625:4: (otherlv_0= RULE_ID )
            {
            // InternalFeatureLanguage.g:625:4: (otherlv_0= RULE_ID )
            // InternalFeatureLanguage.g:626:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getConceptPropertyAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalFeatureLanguage.g:637:3: ( (lv_isRoot_1_0= 'root' ) )
            // InternalFeatureLanguage.g:638:4: (lv_isRoot_1_0= 'root' )
            {
            // InternalFeatureLanguage.g:638:4: (lv_isRoot_1_0= 'root' )
            // InternalFeatureLanguage.g:639:5: lv_isRoot_1_0= 'root'
            {
            lv_isRoot_1_0=(Token)match(input,20,FOLLOW_2); 

            					newLeafNode(lv_isRoot_1_0, grammarAccess.getConceptPropertyAccess().getIsRootRootKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptPropertyRule());
            					}
            					setWithLastConsumed(current, "isRoot", lv_isRoot_1_0 != null, "root");
            				

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
    // $ANTLR end "ruleConceptProperty"


    // $ANTLR start "entryRuleCharacteristicProperty"
    // InternalFeatureLanguage.g:655:1: entryRuleCharacteristicProperty returns [EObject current=null] : iv_ruleCharacteristicProperty= ruleCharacteristicProperty EOF ;
    public final EObject entryRuleCharacteristicProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacteristicProperty = null;


        try {
            // InternalFeatureLanguage.g:655:63: (iv_ruleCharacteristicProperty= ruleCharacteristicProperty EOF )
            // InternalFeatureLanguage.g:656:2: iv_ruleCharacteristicProperty= ruleCharacteristicProperty EOF
            {
             newCompositeNode(grammarAccess.getCharacteristicPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacteristicProperty=ruleCharacteristicProperty();

            state._fsp--;

             current =iv_ruleCharacteristicProperty; 
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
    // $ANTLR end "entryRuleCharacteristicProperty"


    // $ANTLR start "ruleCharacteristicProperty"
    // InternalFeatureLanguage.g:662:1: ruleCharacteristicProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_isLazy_3_0= 'lazy' ) ) ) ;
    public final EObject ruleCharacteristicProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isLazy_3_0=null;


        	enterRule();

        try {
            // InternalFeatureLanguage.g:668:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_isLazy_3_0= 'lazy' ) ) ) )
            // InternalFeatureLanguage.g:669:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_isLazy_3_0= 'lazy' ) ) )
            {
            // InternalFeatureLanguage.g:669:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_isLazy_3_0= 'lazy' ) ) )
            // InternalFeatureLanguage.g:670:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ( (lv_isLazy_3_0= 'lazy' ) )
            {
            // InternalFeatureLanguage.g:670:3: ( (otherlv_0= RULE_ID ) )
            // InternalFeatureLanguage.g:671:4: (otherlv_0= RULE_ID )
            {
            // InternalFeatureLanguage.g:671:4: (otherlv_0= RULE_ID )
            // InternalFeatureLanguage.g:672:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getCharacteristicPropertyAccess().getConceptConceptCrossReference_0_0());
            				

            }


            }

            // InternalFeatureLanguage.g:683:3: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalFeatureLanguage.g:684:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getCharacteristicPropertyAccess().getFullStopKeyword_1_0());
            			
            // InternalFeatureLanguage.g:688:4: ( (otherlv_2= RULE_ID ) )
            // InternalFeatureLanguage.g:689:5: (otherlv_2= RULE_ID )
            {
            // InternalFeatureLanguage.g:689:5: (otherlv_2= RULE_ID )
            // InternalFeatureLanguage.g:690:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCharacteristicPropertyRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_2, grammarAccess.getCharacteristicPropertyAccess().getCharacteristicCharacteristicCrossReference_1_1_0());
            					

            }


            }


            }

            // InternalFeatureLanguage.g:702:3: ( (lv_isLazy_3_0= 'lazy' ) )
            // InternalFeatureLanguage.g:703:4: (lv_isLazy_3_0= 'lazy' )
            {
            // InternalFeatureLanguage.g:703:4: (lv_isLazy_3_0= 'lazy' )
            // InternalFeatureLanguage.g:704:5: lv_isLazy_3_0= 'lazy'
            {
            lv_isLazy_3_0=(Token)match(input,21,FOLLOW_2); 

            					newLeafNode(lv_isLazy_3_0, grammarAccess.getCharacteristicPropertyAccess().getIsLazyLazyKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacteristicPropertyRule());
            					}
            					setWithLastConsumed(current, "isLazy", lv_isLazy_3_0 != null, "lazy");
            				

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
    // $ANTLR end "ruleCharacteristicProperty"


    // $ANTLR start "entryRuleProperty"
    // InternalFeatureLanguage.g:720:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalFeatureLanguage.g:720:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalFeatureLanguage.g:721:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalFeatureLanguage.g:727:1: ruleProperty returns [EObject current=null] : (this_ConceptProperty_0= ruleConceptProperty | this_CharacteristicProperty_1= ruleCharacteristicProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptProperty_0 = null;

        EObject this_CharacteristicProperty_1 = null;



        	enterRule();

        try {
            // InternalFeatureLanguage.g:733:2: ( (this_ConceptProperty_0= ruleConceptProperty | this_CharacteristicProperty_1= ruleCharacteristicProperty ) )
            // InternalFeatureLanguage.g:734:2: (this_ConceptProperty_0= ruleConceptProperty | this_CharacteristicProperty_1= ruleCharacteristicProperty )
            {
            // InternalFeatureLanguage.g:734:2: (this_ConceptProperty_0= ruleConceptProperty | this_CharacteristicProperty_1= ruleCharacteristicProperty )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==20) ) {
                    alt9=1;
                }
                else if ( (LA9_1==19) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureLanguage.g:735:3: this_ConceptProperty_0= ruleConceptProperty
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
                    // InternalFeatureLanguage.g:744:3: this_CharacteristicProperty_1= ruleCharacteristicProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getCharacteristicPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacteristicProperty_1=ruleCharacteristicProperty();

                    state._fsp--;


                    			current = this_CharacteristicProperty_1;
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
    // InternalFeatureLanguage.g:756:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalFeatureLanguage.g:756:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalFeatureLanguage.g:757:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalFeatureLanguage.g:763:1: ruleFeature returns [EObject current=null] : ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_verb_0_0 = null;



        	enterRule();

        try {
            // InternalFeatureLanguage.g:769:2: ( ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalFeatureLanguage.g:770:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalFeatureLanguage.g:770:2: ( ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )? )
            // InternalFeatureLanguage.g:771:3: ( (lv_verb_0_0= ruleVerb ) ) ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )?
            {
            // InternalFeatureLanguage.g:771:3: ( (lv_verb_0_0= ruleVerb ) )
            // InternalFeatureLanguage.g:772:4: (lv_verb_0_0= ruleVerb )
            {
            // InternalFeatureLanguage.g:772:4: (lv_verb_0_0= ruleVerb )
            // InternalFeatureLanguage.g:773:5: lv_verb_0_0= ruleVerb
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
            						"xtext.featurelanguage.FeatureLanguage.Verb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFeatureLanguage.g:790:3: ( (otherlv_1= RULE_ID ) )
            // InternalFeatureLanguage.g:791:4: (otherlv_1= RULE_ID )
            {
            // InternalFeatureLanguage.g:791:4: (otherlv_1= RULE_ID )
            // InternalFeatureLanguage.g:792:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getConceptConceptCrossReference_1_0());
            				

            }


            }

            // InternalFeatureLanguage.g:803:3: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureLanguage.g:804:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFullStopKeyword_2_0());
                    			
                    // InternalFeatureLanguage.g:808:4: ( (otherlv_3= RULE_ID ) )
                    // InternalFeatureLanguage.g:809:5: (otherlv_3= RULE_ID )
                    {
                    // InternalFeatureLanguage.g:809:5: (otherlv_3= RULE_ID )
                    // InternalFeatureLanguage.g:810:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getCharacteristicCharacteristicCrossReference_2_1_0());
                    					

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
    // InternalFeatureLanguage.g:826:1: ruleVerb returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) ;
    public final Enumerator ruleVerb() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFeatureLanguage.g:832:2: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) ) )
            // InternalFeatureLanguage.g:833:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            {
            // InternalFeatureLanguage.g:833:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Remove' ) | (enumLiteral_2= 'Update' ) | (enumLiteral_3= 'Display' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFeatureLanguage.g:834:3: (enumLiteral_0= 'Add' )
                    {
                    // InternalFeatureLanguage.g:834:3: (enumLiteral_0= 'Add' )
                    // InternalFeatureLanguage.g:835:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVerbAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:842:3: (enumLiteral_1= 'Remove' )
                    {
                    // InternalFeatureLanguage.g:842:3: (enumLiteral_1= 'Remove' )
                    // InternalFeatureLanguage.g:843:4: enumLiteral_1= 'Remove'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVerbAccess().getRemoveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLanguage.g:850:3: (enumLiteral_2= 'Update' )
                    {
                    // InternalFeatureLanguage.g:850:3: (enumLiteral_2= 'Update' )
                    // InternalFeatureLanguage.g:851:4: enumLiteral_2= 'Update'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVerbAccess().getUpdateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLanguage.g:858:3: (enumLiteral_3= 'Display' )
                    {
                    // InternalFeatureLanguage.g:858:3: (enumLiteral_3= 'Display' )
                    // InternalFeatureLanguage.g:859:4: enumLiteral_3= 'Display'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "ruleKeyType"
    // InternalFeatureLanguage.g:869:1: ruleKeyType returns [Enumerator current=null] : ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'autounique' ) | (enumLiteral_2= 'index' ) ) ;
    public final Enumerator ruleKeyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFeatureLanguage.g:875:2: ( ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'autounique' ) | (enumLiteral_2= 'index' ) ) )
            // InternalFeatureLanguage.g:876:2: ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'autounique' ) | (enumLiteral_2= 'index' ) )
            {
            // InternalFeatureLanguage.g:876:2: ( (enumLiteral_0= 'unique' ) | (enumLiteral_1= 'autounique' ) | (enumLiteral_2= 'index' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFeatureLanguage.g:877:3: (enumLiteral_0= 'unique' )
                    {
                    // InternalFeatureLanguage.g:877:3: (enumLiteral_0= 'unique' )
                    // InternalFeatureLanguage.g:878:4: enumLiteral_0= 'unique'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getKeyTypeAccess().getUniqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKeyTypeAccess().getUniqueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:885:3: (enumLiteral_1= 'autounique' )
                    {
                    // InternalFeatureLanguage.g:885:3: (enumLiteral_1= 'autounique' )
                    // InternalFeatureLanguage.g:886:4: enumLiteral_1= 'autounique'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getKeyTypeAccess().getAutouniqueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKeyTypeAccess().getAutouniqueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLanguage.g:893:3: (enumLiteral_2= 'index' )
                    {
                    // InternalFeatureLanguage.g:893:3: (enumLiteral_2= 'index' )
                    // InternalFeatureLanguage.g:894:4: enumLiteral_2= 'index'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getKeyTypeAccess().getIndexEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getKeyTypeAccess().getIndexEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleKeyType"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFeatureLanguage.g:904:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '<' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalFeatureLanguage.g:910:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '<' ) ) )
            // InternalFeatureLanguage.g:911:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '<' ) )
            {
            // InternalFeatureLanguage.g:911:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '<' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            case 33:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalFeatureLanguage.g:912:3: (enumLiteral_0= '>' )
                    {
                    // InternalFeatureLanguage.g:912:3: (enumLiteral_0= '>' )
                    // InternalFeatureLanguage.g:913:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGreaterThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getGreaterThanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureLanguage.g:920:3: (enumLiteral_1= '>=' )
                    {
                    // InternalFeatureLanguage.g:920:3: (enumLiteral_1= '>=' )
                    // InternalFeatureLanguage.g:921:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThanOrEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureLanguage.g:928:3: (enumLiteral_2= '=' )
                    {
                    // InternalFeatureLanguage.g:928:3: (enumLiteral_2= '=' )
                    // InternalFeatureLanguage.g:929:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureLanguage.g:936:3: (enumLiteral_3= '<=' )
                    {
                    // InternalFeatureLanguage.g:936:3: (enumLiteral_3= '<=' )
                    // InternalFeatureLanguage.g:937:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLessThanOrEqualEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalFeatureLanguage.g:944:3: (enumLiteral_4= '<' )
                    {
                    // InternalFeatureLanguage.g:944:3: (enumLiteral_4= '<' )
                    // InternalFeatureLanguage.g:945:4: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLessThanEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleComparisonOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L});

}