package org.molymer.conf.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.molymer.conf.services.ConfigDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'{'", "'appName'", "'='", "'mainClass'", "'srcFolder'", "'outFolder'", "'generators'", "'['", "']'", "'}'", "':'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConfigDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g"; }



     	private ConfigDslGrammarAccess grammarAccess;
     	
        public InternalConfigDslParser(TokenStream input, ConfigDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Config";	
       	}
       	
       	@Override
       	protected ConfigDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfig"
    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:67:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:68:2: (iv_ruleConfig= ruleConfig EOF )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:69:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig75);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig85); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:76:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'appName' otherlv_3= '=' ( (lv_appName_4_0= RULE_STRING ) ) otherlv_5= 'mainClass' otherlv_6= '=' ( (lv_mainClass_7_0= RULE_STRING ) ) otherlv_8= 'srcFolder' otherlv_9= '=' ( (lv_srcFolder_10_0= RULE_STRING ) ) otherlv_11= 'outFolder' otherlv_12= '=' ( (lv_outFolder_13_0= RULE_STRING ) ) otherlv_14= 'generators' otherlv_15= '{' (otherlv_16= '[' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ']' )? ( (lv_generators_19_0= ruleGenerator ) )+ otherlv_20= '}' otherlv_21= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_appName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_mainClass_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_srcFolder_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_outFolder_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_generators_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:79:28: ( (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'appName' otherlv_3= '=' ( (lv_appName_4_0= RULE_STRING ) ) otherlv_5= 'mainClass' otherlv_6= '=' ( (lv_mainClass_7_0= RULE_STRING ) ) otherlv_8= 'srcFolder' otherlv_9= '=' ( (lv_srcFolder_10_0= RULE_STRING ) ) otherlv_11= 'outFolder' otherlv_12= '=' ( (lv_outFolder_13_0= RULE_STRING ) ) otherlv_14= 'generators' otherlv_15= '{' (otherlv_16= '[' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ']' )? ( (lv_generators_19_0= ruleGenerator ) )+ otherlv_20= '}' otherlv_21= '}' ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:80:1: (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'appName' otherlv_3= '=' ( (lv_appName_4_0= RULE_STRING ) ) otherlv_5= 'mainClass' otherlv_6= '=' ( (lv_mainClass_7_0= RULE_STRING ) ) otherlv_8= 'srcFolder' otherlv_9= '=' ( (lv_srcFolder_10_0= RULE_STRING ) ) otherlv_11= 'outFolder' otherlv_12= '=' ( (lv_outFolder_13_0= RULE_STRING ) ) otherlv_14= 'generators' otherlv_15= '{' (otherlv_16= '[' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ']' )? ( (lv_generators_19_0= ruleGenerator ) )+ otherlv_20= '}' otherlv_21= '}' )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:80:1: (otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'appName' otherlv_3= '=' ( (lv_appName_4_0= RULE_STRING ) ) otherlv_5= 'mainClass' otherlv_6= '=' ( (lv_mainClass_7_0= RULE_STRING ) ) otherlv_8= 'srcFolder' otherlv_9= '=' ( (lv_srcFolder_10_0= RULE_STRING ) ) otherlv_11= 'outFolder' otherlv_12= '=' ( (lv_outFolder_13_0= RULE_STRING ) ) otherlv_14= 'generators' otherlv_15= '{' (otherlv_16= '[' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ']' )? ( (lv_generators_19_0= ruleGenerator ) )+ otherlv_20= '}' otherlv_21= '}' )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:80:3: otherlv_0= 'config' otherlv_1= '{' otherlv_2= 'appName' otherlv_3= '=' ( (lv_appName_4_0= RULE_STRING ) ) otherlv_5= 'mainClass' otherlv_6= '=' ( (lv_mainClass_7_0= RULE_STRING ) ) otherlv_8= 'srcFolder' otherlv_9= '=' ( (lv_srcFolder_10_0= RULE_STRING ) ) otherlv_11= 'outFolder' otherlv_12= '=' ( (lv_outFolder_13_0= RULE_STRING ) ) otherlv_14= 'generators' otherlv_15= '{' (otherlv_16= '[' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ']' )? ( (lv_generators_19_0= ruleGenerator ) )+ otherlv_20= '}' otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleConfig122); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleConfig134); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleConfig146); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getAppNameKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleConfig158); 

                	newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getEqualsSignKeyword_3());
                
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:96:1: ( (lv_appName_4_0= RULE_STRING ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:97:1: (lv_appName_4_0= RULE_STRING )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:97:1: (lv_appName_4_0= RULE_STRING )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:98:3: lv_appName_4_0= RULE_STRING
            {
            lv_appName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfig175); 

            			newLeafNode(lv_appName_4_0, grammarAccess.getConfigAccess().getAppNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"appName",
                    		lv_appName_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleConfig192); 

                	newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getMainClassKeyword_5());
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleConfig204); 

                	newLeafNode(otherlv_6, grammarAccess.getConfigAccess().getEqualsSignKeyword_6());
                
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:122:1: ( (lv_mainClass_7_0= RULE_STRING ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:123:1: (lv_mainClass_7_0= RULE_STRING )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:123:1: (lv_mainClass_7_0= RULE_STRING )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:124:3: lv_mainClass_7_0= RULE_STRING
            {
            lv_mainClass_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfig221); 

            			newLeafNode(lv_mainClass_7_0, grammarAccess.getConfigAccess().getMainClassSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mainClass",
                    		lv_mainClass_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleConfig238); 

                	newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getSrcFolderKeyword_8());
                
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleConfig250); 

                	newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getEqualsSignKeyword_9());
                
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:148:1: ( (lv_srcFolder_10_0= RULE_STRING ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:149:1: (lv_srcFolder_10_0= RULE_STRING )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:149:1: (lv_srcFolder_10_0= RULE_STRING )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:150:3: lv_srcFolder_10_0= RULE_STRING
            {
            lv_srcFolder_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfig267); 

            			newLeafNode(lv_srcFolder_10_0, grammarAccess.getConfigAccess().getSrcFolderSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"srcFolder",
                    		lv_srcFolder_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleConfig284); 

                	newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getOutFolderKeyword_11());
                
            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleConfig296); 

                	newLeafNode(otherlv_12, grammarAccess.getConfigAccess().getEqualsSignKeyword_12());
                
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:174:1: ( (lv_outFolder_13_0= RULE_STRING ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:175:1: (lv_outFolder_13_0= RULE_STRING )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:175:1: (lv_outFolder_13_0= RULE_STRING )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:176:3: lv_outFolder_13_0= RULE_STRING
            {
            lv_outFolder_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfig313); 

            			newLeafNode(lv_outFolder_13_0, grammarAccess.getConfigAccess().getOutFolderSTRINGTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"outFolder",
                    		lv_outFolder_13_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleConfig330); 

                	newLeafNode(otherlv_14, grammarAccess.getConfigAccess().getGeneratorsKeyword_14());
                
            otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleConfig342); 

                	newLeafNode(otherlv_15, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_15());
                
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:200:1: (otherlv_16= '[' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:200:3: otherlv_16= '[' ( (otherlv_17= RULE_ID ) )+ otherlv_18= ']'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleConfig355); 

                        	newLeafNode(otherlv_16, grammarAccess.getConfigAccess().getLeftSquareBracketKeyword_16_0());
                        
                    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:204:1: ( (otherlv_17= RULE_ID ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:205:1: (otherlv_17= RULE_ID )
                    	    {
                    	    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:205:1: (otherlv_17= RULE_ID )
                    	    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:206:3: otherlv_17= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConfigRule());
                    	    	        }
                    	            
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfig375); 

                    	    		newLeafNode(otherlv_17, grammarAccess.getConfigAccess().getSelectorsGeneratorCrossReference_16_1_0()); 
                    	    	

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

                    otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleConfig388); 

                        	newLeafNode(otherlv_18, grammarAccess.getConfigAccess().getRightSquareBracketKeyword_16_2());
                        

                    }
                    break;

            }

            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:221:3: ( (lv_generators_19_0= ruleGenerator ) )+
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
            	    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:222:1: (lv_generators_19_0= ruleGenerator )
            	    {
            	    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:222:1: (lv_generators_19_0= ruleGenerator )
            	    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:223:3: lv_generators_19_0= ruleGenerator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigAccess().getGeneratorsGeneratorParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGenerator_in_ruleConfig411);
            	    lv_generators_19_0=ruleGenerator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"generators",
            	            		lv_generators_19_0, 
            	            		"Generator");
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

            otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleConfig424); 

                	newLeafNode(otherlv_20, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_18());
                
            otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleConfig436); 

                	newLeafNode(otherlv_21, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_19());
                

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleGenerator"
    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:255:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:256:2: (iv_ruleGenerator= ruleGenerator EOF )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:257:2: iv_ruleGenerator= ruleGenerator EOF
            {
             newCompositeNode(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_ruleGenerator_in_entryRuleGenerator472);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;

             current =iv_ruleGenerator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerator482); 

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
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:264:1: ruleGenerator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_bundle_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_genClass_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bundle_2_0=null;
        Token otherlv_3=null;
        Token lv_genClass_4_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:267:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_bundle_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_genClass_4_0= RULE_STRING ) ) ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:268:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_bundle_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_genClass_4_0= RULE_STRING ) ) )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:268:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_bundle_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_genClass_4_0= RULE_STRING ) ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:268:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_bundle_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_genClass_4_0= RULE_STRING ) )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:268:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:269:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:269:1: (lv_name_0_0= RULE_ID )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:270:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator524); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneratorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleGenerator541); 

                	newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getEqualsSignKeyword_1());
                
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:290:1: ( (lv_bundle_2_0= RULE_STRING ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:291:1: (lv_bundle_2_0= RULE_STRING )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:291:1: (lv_bundle_2_0= RULE_STRING )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:292:3: lv_bundle_2_0= RULE_STRING
            {
            lv_bundle_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenerator558); 

            			newLeafNode(lv_bundle_2_0, grammarAccess.getGeneratorAccess().getBundleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneratorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bundle",
                    		lv_bundle_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleGenerator575); 

                	newLeafNode(otherlv_3, grammarAccess.getGeneratorAccess().getColonKeyword_3());
                
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:312:1: ( (lv_genClass_4_0= RULE_STRING ) )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:313:1: (lv_genClass_4_0= RULE_STRING )
            {
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:313:1: (lv_genClass_4_0= RULE_STRING )
            // ../org.molymer.conf/src-gen/org/molymer/conf/parser/antlr/internal/InternalConfigDsl.g:314:3: lv_genClass_4_0= RULE_STRING
            {
            lv_genClass_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenerator592); 

            			newLeafNode(lv_genClass_4_0, grammarAccess.getGeneratorAccess().getGenClassSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneratorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"genClass",
                    		lv_genClass_4_0, 
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
    // $ANTLR end "ruleGenerator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConfig122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConfig134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConfig146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfig158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfig175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConfig192 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfig204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfig221 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConfig238 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfig250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfig267 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConfig284 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfig296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfig313 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConfig330 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConfig342 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleConfig355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfig375 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_20_in_ruleConfig388 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleConfig411 = new BitSet(new long[]{0x0000000000280020L});
    public static final BitSet FOLLOW_21_in_ruleConfig424 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConfig436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator524 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGenerator541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenerator558 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGenerator575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenerator592 = new BitSet(new long[]{0x0000000000000002L});

}