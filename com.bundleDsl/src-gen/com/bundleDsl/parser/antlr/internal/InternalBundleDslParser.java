package com.bundleDsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.bundleDsl.services.BundleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBundleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bundle'", "'{'", "'}'", "'Car'", "'('", "'type'", "'used'", "')'", "'='", "'Service'", "'for'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalBundleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBundleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBundleDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g"; }



     	private BundleDslGrammarAccess grammarAccess;
     	
        public InternalBundleDslParser(TokenStream input, BundleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected BundleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_bundle_0_0= ruleBundle ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_bundle_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:79:28: ( ( (lv_bundle_0_0= ruleBundle ) ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:80:1: ( (lv_bundle_0_0= ruleBundle ) )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:80:1: ( (lv_bundle_0_0= ruleBundle ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:81:1: (lv_bundle_0_0= ruleBundle )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:81:1: (lv_bundle_0_0= ruleBundle )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:82:3: lv_bundle_0_0= ruleBundle
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getBundleBundleParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBundle_in_ruleModel130);
            lv_bundle_0_0=ruleBundle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"bundle",
                    		lv_bundle_0_0, 
                    		"Bundle");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBundle"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:106:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:107:2: (iv_ruleBundle= ruleBundle EOF )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:108:2: iv_ruleBundle= ruleBundle EOF
            {
             newCompositeNode(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle165);
            iv_ruleBundle=ruleBundle();

            state._fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle175); 

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
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:115:1: ruleBundle returns [EObject current=null] : (otherlv_0= 'Bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cars_3_0= ruleCar ) )+ ( (lv_services_4_0= ruleService ) )* otherlv_5= '}' ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_cars_3_0 = null;

        EObject lv_services_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:118:28: ( (otherlv_0= 'Bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cars_3_0= ruleCar ) )+ ( (lv_services_4_0= ruleService ) )* otherlv_5= '}' ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:119:1: (otherlv_0= 'Bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cars_3_0= ruleCar ) )+ ( (lv_services_4_0= ruleService ) )* otherlv_5= '}' )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:119:1: (otherlv_0= 'Bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cars_3_0= ruleCar ) )+ ( (lv_services_4_0= ruleService ) )* otherlv_5= '}' )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:119:3: otherlv_0= 'Bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cars_3_0= ruleCar ) )+ ( (lv_services_4_0= ruleService ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleBundle212); 

                	newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:124:1: (lv_name_1_0= RULE_ID )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBundle229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBundleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBundle246); 

                	newLeafNode(otherlv_2, grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:145:1: ( (lv_cars_3_0= ruleCar ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:146:1: (lv_cars_3_0= ruleCar )
            	    {
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:146:1: (lv_cars_3_0= ruleCar )
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:147:3: lv_cars_3_0= ruleCar
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleAccess().getCarsCarParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCar_in_ruleBundle267);
            	    lv_cars_3_0=ruleCar();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cars",
            	            		lv_cars_3_0, 
            	            		"Car");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:163:3: ( (lv_services_4_0= ruleService ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:164:1: (lv_services_4_0= ruleService )
            	    {
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:164:1: (lv_services_4_0= ruleService )
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:165:3: lv_services_4_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleAccess().getServicesServiceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleBundle289);
            	    lv_services_4_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_4_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleBundle302); 

                	newLeafNode(otherlv_5, grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleCar"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:193:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:194:2: (iv_ruleCar= ruleCar EOF )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:195:2: iv_ruleCar= ruleCar EOF
            {
             newCompositeNode(grammarAccess.getCarRule()); 
            pushFollow(FOLLOW_ruleCar_in_entryRuleCar338);
            iv_ruleCar=ruleCar();

            state._fsp--;

             current =iv_ruleCar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCar348); 

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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:202:1: ruleCar returns [EObject current=null] : (otherlv_0= 'Car' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) ( (lv_used_5_0= 'used' ) )? otherlv_6= ')' otherlv_7= '{' ( (lv_extras_8_0= ruleExtra ) )+ otherlv_9= '}' ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token lv_used_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_extras_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:205:28: ( (otherlv_0= 'Car' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) ( (lv_used_5_0= 'used' ) )? otherlv_6= ')' otherlv_7= '{' ( (lv_extras_8_0= ruleExtra ) )+ otherlv_9= '}' ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:206:1: (otherlv_0= 'Car' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) ( (lv_used_5_0= 'used' ) )? otherlv_6= ')' otherlv_7= '{' ( (lv_extras_8_0= ruleExtra ) )+ otherlv_9= '}' )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:206:1: (otherlv_0= 'Car' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) ( (lv_used_5_0= 'used' ) )? otherlv_6= ')' otherlv_7= '{' ( (lv_extras_8_0= ruleExtra ) )+ otherlv_9= '}' )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:206:3: otherlv_0= 'Car' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) ( (lv_used_5_0= 'used' ) )? otherlv_6= ')' otherlv_7= '{' ( (lv_extras_8_0= ruleExtra ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleCar385); 

                	newLeafNode(otherlv_0, grammarAccess.getCarAccess().getCarKeyword_0());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:210:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:211:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:211:1: (lv_name_1_0= RULE_ID )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:212:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCar402); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCarAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCar419); 

                	newLeafNode(otherlv_2, grammarAccess.getCarAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleCar431); 

                	newLeafNode(otherlv_3, grammarAccess.getCarAccess().getTypeKeyword_3());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:236:1: ( (lv_type_4_0= RULE_STRING ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:237:1: (lv_type_4_0= RULE_STRING )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:237:1: (lv_type_4_0= RULE_STRING )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:238:3: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCar448); 

            			newLeafNode(lv_type_4_0, grammarAccess.getCarAccess().getTypeSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:254:2: ( (lv_used_5_0= 'used' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:255:1: (lv_used_5_0= 'used' )
                    {
                    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:255:1: (lv_used_5_0= 'used' )
                    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:256:3: lv_used_5_0= 'used'
                    {
                    lv_used_5_0=(Token)match(input,17,FOLLOW_17_in_ruleCar471); 

                            newLeafNode(lv_used_5_0, grammarAccess.getCarAccess().getUsedUsedKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCarRule());
                    	        }
                           		setWithLastConsumed(current, "used", true, "used");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleCar497); 

                	newLeafNode(otherlv_6, grammarAccess.getCarAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleCar509); 

                	newLeafNode(otherlv_7, grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_7());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:277:1: ( (lv_extras_8_0= ruleExtra ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:278:1: (lv_extras_8_0= ruleExtra )
            	    {
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:278:1: (lv_extras_8_0= ruleExtra )
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:279:3: lv_extras_8_0= ruleExtra
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCarAccess().getExtrasExtraParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtra_in_ruleCar530);
            	    lv_extras_8_0=ruleExtra();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extras",
            	            		lv_extras_8_0, 
            	            		"Extra");
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

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleCar543); 

                	newLeafNode(otherlv_9, grammarAccess.getCarAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleExtra"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:307:1: entryRuleExtra returns [EObject current=null] : iv_ruleExtra= ruleExtra EOF ;
    public final EObject entryRuleExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtra = null;


        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:308:2: (iv_ruleExtra= ruleExtra EOF )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:309:2: iv_ruleExtra= ruleExtra EOF
            {
             newCompositeNode(grammarAccess.getExtraRule()); 
            pushFollow(FOLLOW_ruleExtra_in_entryRuleExtra579);
            iv_ruleExtra=ruleExtra();

            state._fsp--;

             current =iv_ruleExtra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtra589); 

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
    // $ANTLR end "entryRuleExtra"


    // $ANTLR start "ruleExtra"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:316:1: ruleExtra returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleExtra() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:319:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:320:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_description_2_0= RULE_STRING ) )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:320:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:321:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:321:1: (lv_name_0_0= RULE_ID )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:322:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtra631); 

            			newLeafNode(lv_name_0_0, grammarAccess.getExtraAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtraRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleExtra648); 

                	newLeafNode(otherlv_1, grammarAccess.getExtraAccess().getEqualsSignKeyword_1());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:342:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:343:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:343:1: (lv_description_2_0= RULE_STRING )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:344:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExtra665); 

            			newLeafNode(lv_description_2_0, grammarAccess.getExtraAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtraRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleExtra"


    // $ANTLR start "entryRuleService"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:368:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:369:2: (iv_ruleService= ruleService EOF )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:370:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService706);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService716); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:377:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'for' ( (lv_carExtras_3_0= ruleCarExtra ) )+ ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_carExtras_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:380:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'for' ( (lv_carExtras_3_0= ruleCarExtra ) )+ ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:381:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'for' ( (lv_carExtras_3_0= ruleCarExtra ) )+ )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:381:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'for' ( (lv_carExtras_3_0= ruleCarExtra ) )+ )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:381:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'for' ( (lv_carExtras_3_0= ruleCarExtra ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleService753); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:385:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:386:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:386:1: (lv_name_1_0= RULE_STRING )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:387:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleService770); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleService787); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getForKeyword_2());
                
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:407:1: ( (lv_carExtras_3_0= ruleCarExtra ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:408:1: (lv_carExtras_3_0= ruleCarExtra )
            	    {
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:408:1: (lv_carExtras_3_0= ruleCarExtra )
            	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:409:3: lv_carExtras_3_0= ruleCarExtra
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getCarExtrasCarExtraParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCarExtra_in_ruleService808);
            	    lv_carExtras_3_0=ruleCarExtra();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"carExtras",
            	            		lv_carExtras_3_0, 
            	            		"CarExtra");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleCarExtra"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:433:1: entryRuleCarExtra returns [EObject current=null] : iv_ruleCarExtra= ruleCarExtra EOF ;
    public final EObject entryRuleCarExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarExtra = null;


        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:434:2: (iv_ruleCarExtra= ruleCarExtra EOF )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:435:2: iv_ruleCarExtra= ruleCarExtra EOF
            {
             newCompositeNode(grammarAccess.getCarExtraRule()); 
            pushFollow(FOLLOW_ruleCarExtra_in_entryRuleCarExtra845);
            iv_ruleCarExtra=ruleCarExtra();

            state._fsp--;

             current =iv_ruleCarExtra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCarExtra855); 

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
    // $ANTLR end "entryRuleCarExtra"


    // $ANTLR start "ruleCarExtra"
    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:442:1: ruleCarExtra returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? ) ;
    public final EObject ruleCarExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:445:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:446:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:446:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:446:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )?
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:446:2: ( (otherlv_0= RULE_ID ) )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:447:1: (otherlv_0= RULE_ID )
            {
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:447:1: (otherlv_0= RULE_ID )
            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:448:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCarExtraRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCarExtra900); 

            		newLeafNode(otherlv_0, grammarAccess.getCarExtraAccess().getCarCarCrossReference_0_0()); 
            	

            }


            }

            // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:459:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:459:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleCarExtra913); 

                        	newLeafNode(otherlv_1, grammarAccess.getCarExtraAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:463:1: ( (otherlv_2= RULE_ID ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:464:1: (otherlv_2= RULE_ID )
                    	    {
                    	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:464:1: (otherlv_2= RULE_ID )
                    	    // ../com.bundleDsl/src-gen/com/bundleDsl/parser/antlr/internal/InternalBundleDsl.g:465:3: otherlv_2= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCarExtraRule());
                    	    	        }
                    	            
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCarExtra933); 

                    	    		newLeafNode(otherlv_2, grammarAccess.getCarExtraAccess().getExtrasExtraCrossReference_1_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCarExtra946); 

                        	newLeafNode(otherlv_3, grammarAccess.getCarExtraAccess().getRightParenthesisKeyword_1_2());
                        

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
    // $ANTLR end "ruleCarExtra"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBundle212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBundle229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBundle246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleCar_in_ruleBundle267 = new BitSet(new long[]{0x0000000000106000L});
    public static final BitSet FOLLOW_ruleService_in_ruleBundle289 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleBundle302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCar_in_entryRuleCar338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCar348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCar385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCar402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCar419 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCar431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCar448 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleCar471 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCar497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCar509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExtra_in_ruleCar530 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleCar543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtra_in_entryRuleExtra579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtra589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtra631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExtra648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExtra665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleService753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleService770 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleService787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCarExtra_in_ruleService808 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleCarExtra_in_entryRuleCarExtra845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCarExtra855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCarExtra900 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleCarExtra913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCarExtra933 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleCarExtra946 = new BitSet(new long[]{0x0000000000000002L});

}