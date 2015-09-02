package org.molymer.conf.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.molymer.conf.services.ConfigDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'{'", "'appName'", "'='", "'mainClass'", "'srcFolder'", "'outFolder'", "'generators'", "'}'", "'['", "']'", "':'"
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
    public String getGrammarFileName() { return "../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g"; }


     
     	private ConfigDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ConfigDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleConfig"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:60:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:61:1: ( ruleConfig EOF )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:62:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig61);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig68); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:69:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:73:2: ( ( ( rule__Config__Group__0 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:74:1: ( ( rule__Config__Group__0 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:74:1: ( ( rule__Config__Group__0 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:75:1: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:76:1: ( rule__Config__Group__0 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:76:2: rule__Config__Group__0
            {
            pushFollow(FOLLOW_rule__Config__Group__0_in_ruleConfig94);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleGenerator"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:88:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:89:1: ( ruleGenerator EOF )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:90:1: ruleGenerator EOF
            {
             before(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_ruleGenerator_in_entryRuleGenerator121);
            ruleGenerator();

            state._fsp--;

             after(grammarAccess.getGeneratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerator128); 

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
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:97:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:101:2: ( ( ( rule__Generator__Group__0 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:102:1: ( ( rule__Generator__Group__0 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:102:1: ( ( rule__Generator__Group__0 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:103:1: ( rule__Generator__Group__0 )
            {
             before(grammarAccess.getGeneratorAccess().getGroup()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:104:1: ( rule__Generator__Group__0 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:104:2: rule__Generator__Group__0
            {
            pushFollow(FOLLOW_rule__Generator__Group__0_in_ruleGenerator154);
            rule__Generator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getGroup()); 

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
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "rule__Config__Group__0"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:120:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:124:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:125:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__0190);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__1_in_rule__Config__Group__0193);
            rule__Config__Group__1();

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
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:132:1: rule__Config__Group__0__Impl : ( 'config' ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:136:1: ( ( 'config' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:137:1: ( 'config' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:137:1: ( 'config' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:138:1: 'config'
            {
             before(grammarAccess.getConfigAccess().getConfigKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Config__Group__0__Impl221); 
             after(grammarAccess.getConfigAccess().getConfigKeyword_0()); 

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
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:151:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:155:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:156:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1252);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1255);
            rule__Config__Group__2();

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
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:163:1: rule__Config__Group__1__Impl : ( '{' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:167:1: ( ( '{' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:168:1: ( '{' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:168:1: ( '{' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:169:1: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Config__Group__1__Impl283); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:182:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:186:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:187:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2314);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2317);
            rule__Config__Group__3();

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
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:194:1: rule__Config__Group__2__Impl : ( 'appName' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:198:1: ( ( 'appName' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:199:1: ( 'appName' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:199:1: ( 'appName' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:200:1: 'appName'
            {
             before(grammarAccess.getConfigAccess().getAppNameKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Config__Group__2__Impl345); 
             after(grammarAccess.getConfigAccess().getAppNameKeyword_2()); 

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
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:213:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:217:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:218:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3376);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3379);
            rule__Config__Group__4();

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
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:225:1: rule__Config__Group__3__Impl : ( '=' ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:229:1: ( ( '=' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:230:1: ( '=' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:230:1: ( '=' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:231:1: '='
            {
             before(grammarAccess.getConfigAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Config__Group__3__Impl407); 
             after(grammarAccess.getConfigAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:244:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:248:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:249:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4438);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4441);
            rule__Config__Group__5();

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
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:256:1: rule__Config__Group__4__Impl : ( ( rule__Config__AppNameAssignment_4 ) ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:260:1: ( ( ( rule__Config__AppNameAssignment_4 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:261:1: ( ( rule__Config__AppNameAssignment_4 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:261:1: ( ( rule__Config__AppNameAssignment_4 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:262:1: ( rule__Config__AppNameAssignment_4 )
            {
             before(grammarAccess.getConfigAccess().getAppNameAssignment_4()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:263:1: ( rule__Config__AppNameAssignment_4 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:263:2: rule__Config__AppNameAssignment_4
            {
            pushFollow(FOLLOW_rule__Config__AppNameAssignment_4_in_rule__Config__Group__4__Impl468);
            rule__Config__AppNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getAppNameAssignment_4()); 

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
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:273:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:277:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:278:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5498);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__6_in_rule__Config__Group__5501);
            rule__Config__Group__6();

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
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:285:1: rule__Config__Group__5__Impl : ( 'mainClass' ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:289:1: ( ( 'mainClass' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:290:1: ( 'mainClass' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:290:1: ( 'mainClass' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:291:1: 'mainClass'
            {
             before(grammarAccess.getConfigAccess().getMainClassKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Config__Group__5__Impl529); 
             after(grammarAccess.getConfigAccess().getMainClassKeyword_5()); 

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
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:304:1: rule__Config__Group__6 : rule__Config__Group__6__Impl rule__Config__Group__7 ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:308:1: ( rule__Config__Group__6__Impl rule__Config__Group__7 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:309:2: rule__Config__Group__6__Impl rule__Config__Group__7
            {
            pushFollow(FOLLOW_rule__Config__Group__6__Impl_in_rule__Config__Group__6560);
            rule__Config__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__7_in_rule__Config__Group__6563);
            rule__Config__Group__7();

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
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:316:1: rule__Config__Group__6__Impl : ( '=' ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:320:1: ( ( '=' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:321:1: ( '=' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:321:1: ( '=' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:322:1: '='
            {
             before(grammarAccess.getConfigAccess().getEqualsSignKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Config__Group__6__Impl591); 
             after(grammarAccess.getConfigAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Config__Group__7"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:335:1: rule__Config__Group__7 : rule__Config__Group__7__Impl rule__Config__Group__8 ;
    public final void rule__Config__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:339:1: ( rule__Config__Group__7__Impl rule__Config__Group__8 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:340:2: rule__Config__Group__7__Impl rule__Config__Group__8
            {
            pushFollow(FOLLOW_rule__Config__Group__7__Impl_in_rule__Config__Group__7622);
            rule__Config__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__8_in_rule__Config__Group__7625);
            rule__Config__Group__8();

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
    // $ANTLR end "rule__Config__Group__7"


    // $ANTLR start "rule__Config__Group__7__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:347:1: rule__Config__Group__7__Impl : ( ( rule__Config__MainClassAssignment_7 ) ) ;
    public final void rule__Config__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:351:1: ( ( ( rule__Config__MainClassAssignment_7 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:352:1: ( ( rule__Config__MainClassAssignment_7 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:352:1: ( ( rule__Config__MainClassAssignment_7 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:353:1: ( rule__Config__MainClassAssignment_7 )
            {
             before(grammarAccess.getConfigAccess().getMainClassAssignment_7()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:354:1: ( rule__Config__MainClassAssignment_7 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:354:2: rule__Config__MainClassAssignment_7
            {
            pushFollow(FOLLOW_rule__Config__MainClassAssignment_7_in_rule__Config__Group__7__Impl652);
            rule__Config__MainClassAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMainClassAssignment_7()); 

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
    // $ANTLR end "rule__Config__Group__7__Impl"


    // $ANTLR start "rule__Config__Group__8"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:364:1: rule__Config__Group__8 : rule__Config__Group__8__Impl rule__Config__Group__9 ;
    public final void rule__Config__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:368:1: ( rule__Config__Group__8__Impl rule__Config__Group__9 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:369:2: rule__Config__Group__8__Impl rule__Config__Group__9
            {
            pushFollow(FOLLOW_rule__Config__Group__8__Impl_in_rule__Config__Group__8682);
            rule__Config__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__9_in_rule__Config__Group__8685);
            rule__Config__Group__9();

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
    // $ANTLR end "rule__Config__Group__8"


    // $ANTLR start "rule__Config__Group__8__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:376:1: rule__Config__Group__8__Impl : ( 'srcFolder' ) ;
    public final void rule__Config__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:380:1: ( ( 'srcFolder' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:381:1: ( 'srcFolder' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:381:1: ( 'srcFolder' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:382:1: 'srcFolder'
            {
             before(grammarAccess.getConfigAccess().getSrcFolderKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__Config__Group__8__Impl713); 
             after(grammarAccess.getConfigAccess().getSrcFolderKeyword_8()); 

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
    // $ANTLR end "rule__Config__Group__8__Impl"


    // $ANTLR start "rule__Config__Group__9"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:395:1: rule__Config__Group__9 : rule__Config__Group__9__Impl rule__Config__Group__10 ;
    public final void rule__Config__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:399:1: ( rule__Config__Group__9__Impl rule__Config__Group__10 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:400:2: rule__Config__Group__9__Impl rule__Config__Group__10
            {
            pushFollow(FOLLOW_rule__Config__Group__9__Impl_in_rule__Config__Group__9744);
            rule__Config__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__10_in_rule__Config__Group__9747);
            rule__Config__Group__10();

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
    // $ANTLR end "rule__Config__Group__9"


    // $ANTLR start "rule__Config__Group__9__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:407:1: rule__Config__Group__9__Impl : ( '=' ) ;
    public final void rule__Config__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:411:1: ( ( '=' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:412:1: ( '=' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:412:1: ( '=' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:413:1: '='
            {
             before(grammarAccess.getConfigAccess().getEqualsSignKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__Config__Group__9__Impl775); 
             after(grammarAccess.getConfigAccess().getEqualsSignKeyword_9()); 

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
    // $ANTLR end "rule__Config__Group__9__Impl"


    // $ANTLR start "rule__Config__Group__10"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:426:1: rule__Config__Group__10 : rule__Config__Group__10__Impl rule__Config__Group__11 ;
    public final void rule__Config__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:430:1: ( rule__Config__Group__10__Impl rule__Config__Group__11 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:431:2: rule__Config__Group__10__Impl rule__Config__Group__11
            {
            pushFollow(FOLLOW_rule__Config__Group__10__Impl_in_rule__Config__Group__10806);
            rule__Config__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__11_in_rule__Config__Group__10809);
            rule__Config__Group__11();

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
    // $ANTLR end "rule__Config__Group__10"


    // $ANTLR start "rule__Config__Group__10__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:438:1: rule__Config__Group__10__Impl : ( ( rule__Config__SrcFolderAssignment_10 ) ) ;
    public final void rule__Config__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:442:1: ( ( ( rule__Config__SrcFolderAssignment_10 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:443:1: ( ( rule__Config__SrcFolderAssignment_10 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:443:1: ( ( rule__Config__SrcFolderAssignment_10 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:444:1: ( rule__Config__SrcFolderAssignment_10 )
            {
             before(grammarAccess.getConfigAccess().getSrcFolderAssignment_10()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:445:1: ( rule__Config__SrcFolderAssignment_10 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:445:2: rule__Config__SrcFolderAssignment_10
            {
            pushFollow(FOLLOW_rule__Config__SrcFolderAssignment_10_in_rule__Config__Group__10__Impl836);
            rule__Config__SrcFolderAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getSrcFolderAssignment_10()); 

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
    // $ANTLR end "rule__Config__Group__10__Impl"


    // $ANTLR start "rule__Config__Group__11"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:455:1: rule__Config__Group__11 : rule__Config__Group__11__Impl rule__Config__Group__12 ;
    public final void rule__Config__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:459:1: ( rule__Config__Group__11__Impl rule__Config__Group__12 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:460:2: rule__Config__Group__11__Impl rule__Config__Group__12
            {
            pushFollow(FOLLOW_rule__Config__Group__11__Impl_in_rule__Config__Group__11866);
            rule__Config__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__12_in_rule__Config__Group__11869);
            rule__Config__Group__12();

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
    // $ANTLR end "rule__Config__Group__11"


    // $ANTLR start "rule__Config__Group__11__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:467:1: rule__Config__Group__11__Impl : ( 'outFolder' ) ;
    public final void rule__Config__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:471:1: ( ( 'outFolder' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:472:1: ( 'outFolder' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:472:1: ( 'outFolder' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:473:1: 'outFolder'
            {
             before(grammarAccess.getConfigAccess().getOutFolderKeyword_11()); 
            match(input,17,FOLLOW_17_in_rule__Config__Group__11__Impl897); 
             after(grammarAccess.getConfigAccess().getOutFolderKeyword_11()); 

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
    // $ANTLR end "rule__Config__Group__11__Impl"


    // $ANTLR start "rule__Config__Group__12"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:486:1: rule__Config__Group__12 : rule__Config__Group__12__Impl rule__Config__Group__13 ;
    public final void rule__Config__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:490:1: ( rule__Config__Group__12__Impl rule__Config__Group__13 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:491:2: rule__Config__Group__12__Impl rule__Config__Group__13
            {
            pushFollow(FOLLOW_rule__Config__Group__12__Impl_in_rule__Config__Group__12928);
            rule__Config__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__13_in_rule__Config__Group__12931);
            rule__Config__Group__13();

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
    // $ANTLR end "rule__Config__Group__12"


    // $ANTLR start "rule__Config__Group__12__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:498:1: rule__Config__Group__12__Impl : ( '=' ) ;
    public final void rule__Config__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:502:1: ( ( '=' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:503:1: ( '=' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:503:1: ( '=' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:504:1: '='
            {
             before(grammarAccess.getConfigAccess().getEqualsSignKeyword_12()); 
            match(input,14,FOLLOW_14_in_rule__Config__Group__12__Impl959); 
             after(grammarAccess.getConfigAccess().getEqualsSignKeyword_12()); 

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
    // $ANTLR end "rule__Config__Group__12__Impl"


    // $ANTLR start "rule__Config__Group__13"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:517:1: rule__Config__Group__13 : rule__Config__Group__13__Impl rule__Config__Group__14 ;
    public final void rule__Config__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:521:1: ( rule__Config__Group__13__Impl rule__Config__Group__14 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:522:2: rule__Config__Group__13__Impl rule__Config__Group__14
            {
            pushFollow(FOLLOW_rule__Config__Group__13__Impl_in_rule__Config__Group__13990);
            rule__Config__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__14_in_rule__Config__Group__13993);
            rule__Config__Group__14();

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
    // $ANTLR end "rule__Config__Group__13"


    // $ANTLR start "rule__Config__Group__13__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:529:1: rule__Config__Group__13__Impl : ( ( rule__Config__OutFolderAssignment_13 ) ) ;
    public final void rule__Config__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:533:1: ( ( ( rule__Config__OutFolderAssignment_13 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:534:1: ( ( rule__Config__OutFolderAssignment_13 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:534:1: ( ( rule__Config__OutFolderAssignment_13 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:535:1: ( rule__Config__OutFolderAssignment_13 )
            {
             before(grammarAccess.getConfigAccess().getOutFolderAssignment_13()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:536:1: ( rule__Config__OutFolderAssignment_13 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:536:2: rule__Config__OutFolderAssignment_13
            {
            pushFollow(FOLLOW_rule__Config__OutFolderAssignment_13_in_rule__Config__Group__13__Impl1020);
            rule__Config__OutFolderAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getOutFolderAssignment_13()); 

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
    // $ANTLR end "rule__Config__Group__13__Impl"


    // $ANTLR start "rule__Config__Group__14"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:546:1: rule__Config__Group__14 : rule__Config__Group__14__Impl rule__Config__Group__15 ;
    public final void rule__Config__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:550:1: ( rule__Config__Group__14__Impl rule__Config__Group__15 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:551:2: rule__Config__Group__14__Impl rule__Config__Group__15
            {
            pushFollow(FOLLOW_rule__Config__Group__14__Impl_in_rule__Config__Group__141050);
            rule__Config__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__15_in_rule__Config__Group__141053);
            rule__Config__Group__15();

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
    // $ANTLR end "rule__Config__Group__14"


    // $ANTLR start "rule__Config__Group__14__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:558:1: rule__Config__Group__14__Impl : ( 'generators' ) ;
    public final void rule__Config__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:562:1: ( ( 'generators' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:563:1: ( 'generators' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:563:1: ( 'generators' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:564:1: 'generators'
            {
             before(grammarAccess.getConfigAccess().getGeneratorsKeyword_14()); 
            match(input,18,FOLLOW_18_in_rule__Config__Group__14__Impl1081); 
             after(grammarAccess.getConfigAccess().getGeneratorsKeyword_14()); 

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
    // $ANTLR end "rule__Config__Group__14__Impl"


    // $ANTLR start "rule__Config__Group__15"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:577:1: rule__Config__Group__15 : rule__Config__Group__15__Impl rule__Config__Group__16 ;
    public final void rule__Config__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:581:1: ( rule__Config__Group__15__Impl rule__Config__Group__16 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:582:2: rule__Config__Group__15__Impl rule__Config__Group__16
            {
            pushFollow(FOLLOW_rule__Config__Group__15__Impl_in_rule__Config__Group__151112);
            rule__Config__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__16_in_rule__Config__Group__151115);
            rule__Config__Group__16();

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
    // $ANTLR end "rule__Config__Group__15"


    // $ANTLR start "rule__Config__Group__15__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:589:1: rule__Config__Group__15__Impl : ( '{' ) ;
    public final void rule__Config__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:593:1: ( ( '{' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:594:1: ( '{' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:594:1: ( '{' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:595:1: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,12,FOLLOW_12_in_rule__Config__Group__15__Impl1143); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Config__Group__15__Impl"


    // $ANTLR start "rule__Config__Group__16"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:608:1: rule__Config__Group__16 : rule__Config__Group__16__Impl rule__Config__Group__17 ;
    public final void rule__Config__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:612:1: ( rule__Config__Group__16__Impl rule__Config__Group__17 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:613:2: rule__Config__Group__16__Impl rule__Config__Group__17
            {
            pushFollow(FOLLOW_rule__Config__Group__16__Impl_in_rule__Config__Group__161174);
            rule__Config__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__17_in_rule__Config__Group__161177);
            rule__Config__Group__17();

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
    // $ANTLR end "rule__Config__Group__16"


    // $ANTLR start "rule__Config__Group__16__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:620:1: rule__Config__Group__16__Impl : ( ( rule__Config__Group_16__0 )? ) ;
    public final void rule__Config__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:624:1: ( ( ( rule__Config__Group_16__0 )? ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:625:1: ( ( rule__Config__Group_16__0 )? )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:625:1: ( ( rule__Config__Group_16__0 )? )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:626:1: ( rule__Config__Group_16__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_16()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:627:1: ( rule__Config__Group_16__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:627:2: rule__Config__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__Config__Group_16__0_in_rule__Config__Group__16__Impl1204);
                    rule__Config__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_16()); 

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
    // $ANTLR end "rule__Config__Group__16__Impl"


    // $ANTLR start "rule__Config__Group__17"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:637:1: rule__Config__Group__17 : rule__Config__Group__17__Impl rule__Config__Group__18 ;
    public final void rule__Config__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:641:1: ( rule__Config__Group__17__Impl rule__Config__Group__18 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:642:2: rule__Config__Group__17__Impl rule__Config__Group__18
            {
            pushFollow(FOLLOW_rule__Config__Group__17__Impl_in_rule__Config__Group__171235);
            rule__Config__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__18_in_rule__Config__Group__171238);
            rule__Config__Group__18();

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
    // $ANTLR end "rule__Config__Group__17"


    // $ANTLR start "rule__Config__Group__17__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:649:1: rule__Config__Group__17__Impl : ( ( ( rule__Config__GeneratorsAssignment_17 ) ) ( ( rule__Config__GeneratorsAssignment_17 )* ) ) ;
    public final void rule__Config__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:653:1: ( ( ( ( rule__Config__GeneratorsAssignment_17 ) ) ( ( rule__Config__GeneratorsAssignment_17 )* ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:654:1: ( ( ( rule__Config__GeneratorsAssignment_17 ) ) ( ( rule__Config__GeneratorsAssignment_17 )* ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:654:1: ( ( ( rule__Config__GeneratorsAssignment_17 ) ) ( ( rule__Config__GeneratorsAssignment_17 )* ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:655:1: ( ( rule__Config__GeneratorsAssignment_17 ) ) ( ( rule__Config__GeneratorsAssignment_17 )* )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:655:1: ( ( rule__Config__GeneratorsAssignment_17 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:656:1: ( rule__Config__GeneratorsAssignment_17 )
            {
             before(grammarAccess.getConfigAccess().getGeneratorsAssignment_17()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:657:1: ( rule__Config__GeneratorsAssignment_17 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:657:2: rule__Config__GeneratorsAssignment_17
            {
            pushFollow(FOLLOW_rule__Config__GeneratorsAssignment_17_in_rule__Config__Group__17__Impl1267);
            rule__Config__GeneratorsAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGeneratorsAssignment_17()); 

            }

            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:660:1: ( ( rule__Config__GeneratorsAssignment_17 )* )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:661:1: ( rule__Config__GeneratorsAssignment_17 )*
            {
             before(grammarAccess.getConfigAccess().getGeneratorsAssignment_17()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:662:1: ( rule__Config__GeneratorsAssignment_17 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:662:2: rule__Config__GeneratorsAssignment_17
            	    {
            	    pushFollow(FOLLOW_rule__Config__GeneratorsAssignment_17_in_rule__Config__Group__17__Impl1279);
            	    rule__Config__GeneratorsAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getGeneratorsAssignment_17()); 

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
    // $ANTLR end "rule__Config__Group__17__Impl"


    // $ANTLR start "rule__Config__Group__18"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:673:1: rule__Config__Group__18 : rule__Config__Group__18__Impl rule__Config__Group__19 ;
    public final void rule__Config__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:677:1: ( rule__Config__Group__18__Impl rule__Config__Group__19 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:678:2: rule__Config__Group__18__Impl rule__Config__Group__19
            {
            pushFollow(FOLLOW_rule__Config__Group__18__Impl_in_rule__Config__Group__181312);
            rule__Config__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group__19_in_rule__Config__Group__181315);
            rule__Config__Group__19();

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
    // $ANTLR end "rule__Config__Group__18"


    // $ANTLR start "rule__Config__Group__18__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:685:1: rule__Config__Group__18__Impl : ( '}' ) ;
    public final void rule__Config__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:689:1: ( ( '}' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:690:1: ( '}' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:690:1: ( '}' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:691:1: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_18()); 
            match(input,19,FOLLOW_19_in_rule__Config__Group__18__Impl1343); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_18()); 

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
    // $ANTLR end "rule__Config__Group__18__Impl"


    // $ANTLR start "rule__Config__Group__19"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:704:1: rule__Config__Group__19 : rule__Config__Group__19__Impl ;
    public final void rule__Config__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:708:1: ( rule__Config__Group__19__Impl )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:709:2: rule__Config__Group__19__Impl
            {
            pushFollow(FOLLOW_rule__Config__Group__19__Impl_in_rule__Config__Group__191374);
            rule__Config__Group__19__Impl();

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
    // $ANTLR end "rule__Config__Group__19"


    // $ANTLR start "rule__Config__Group__19__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:715:1: rule__Config__Group__19__Impl : ( '}' ) ;
    public final void rule__Config__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:719:1: ( ( '}' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:720:1: ( '}' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:720:1: ( '}' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:721:1: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_19()); 
            match(input,19,FOLLOW_19_in_rule__Config__Group__19__Impl1402); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__Config__Group__19__Impl"


    // $ANTLR start "rule__Config__Group_16__0"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:774:1: rule__Config__Group_16__0 : rule__Config__Group_16__0__Impl rule__Config__Group_16__1 ;
    public final void rule__Config__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:778:1: ( rule__Config__Group_16__0__Impl rule__Config__Group_16__1 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:779:2: rule__Config__Group_16__0__Impl rule__Config__Group_16__1
            {
            pushFollow(FOLLOW_rule__Config__Group_16__0__Impl_in_rule__Config__Group_16__01473);
            rule__Config__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group_16__1_in_rule__Config__Group_16__01476);
            rule__Config__Group_16__1();

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
    // $ANTLR end "rule__Config__Group_16__0"


    // $ANTLR start "rule__Config__Group_16__0__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:786:1: rule__Config__Group_16__0__Impl : ( '[' ) ;
    public final void rule__Config__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:790:1: ( ( '[' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:791:1: ( '[' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:791:1: ( '[' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:792:1: '['
            {
             before(grammarAccess.getConfigAccess().getLeftSquareBracketKeyword_16_0()); 
            match(input,20,FOLLOW_20_in_rule__Config__Group_16__0__Impl1504); 
             after(grammarAccess.getConfigAccess().getLeftSquareBracketKeyword_16_0()); 

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
    // $ANTLR end "rule__Config__Group_16__0__Impl"


    // $ANTLR start "rule__Config__Group_16__1"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:805:1: rule__Config__Group_16__1 : rule__Config__Group_16__1__Impl rule__Config__Group_16__2 ;
    public final void rule__Config__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:809:1: ( rule__Config__Group_16__1__Impl rule__Config__Group_16__2 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:810:2: rule__Config__Group_16__1__Impl rule__Config__Group_16__2
            {
            pushFollow(FOLLOW_rule__Config__Group_16__1__Impl_in_rule__Config__Group_16__11535);
            rule__Config__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Config__Group_16__2_in_rule__Config__Group_16__11538);
            rule__Config__Group_16__2();

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
    // $ANTLR end "rule__Config__Group_16__1"


    // $ANTLR start "rule__Config__Group_16__1__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:817:1: rule__Config__Group_16__1__Impl : ( ( ( rule__Config__SelectorsAssignment_16_1 ) ) ( ( rule__Config__SelectorsAssignment_16_1 )* ) ) ;
    public final void rule__Config__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:821:1: ( ( ( ( rule__Config__SelectorsAssignment_16_1 ) ) ( ( rule__Config__SelectorsAssignment_16_1 )* ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:822:1: ( ( ( rule__Config__SelectorsAssignment_16_1 ) ) ( ( rule__Config__SelectorsAssignment_16_1 )* ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:822:1: ( ( ( rule__Config__SelectorsAssignment_16_1 ) ) ( ( rule__Config__SelectorsAssignment_16_1 )* ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:823:1: ( ( rule__Config__SelectorsAssignment_16_1 ) ) ( ( rule__Config__SelectorsAssignment_16_1 )* )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:823:1: ( ( rule__Config__SelectorsAssignment_16_1 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:824:1: ( rule__Config__SelectorsAssignment_16_1 )
            {
             before(grammarAccess.getConfigAccess().getSelectorsAssignment_16_1()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:825:1: ( rule__Config__SelectorsAssignment_16_1 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:825:2: rule__Config__SelectorsAssignment_16_1
            {
            pushFollow(FOLLOW_rule__Config__SelectorsAssignment_16_1_in_rule__Config__Group_16__1__Impl1567);
            rule__Config__SelectorsAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getSelectorsAssignment_16_1()); 

            }

            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:828:1: ( ( rule__Config__SelectorsAssignment_16_1 )* )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:829:1: ( rule__Config__SelectorsAssignment_16_1 )*
            {
             before(grammarAccess.getConfigAccess().getSelectorsAssignment_16_1()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:830:1: ( rule__Config__SelectorsAssignment_16_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:830:2: rule__Config__SelectorsAssignment_16_1
            	    {
            	    pushFollow(FOLLOW_rule__Config__SelectorsAssignment_16_1_in_rule__Config__Group_16__1__Impl1579);
            	    rule__Config__SelectorsAssignment_16_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getSelectorsAssignment_16_1()); 

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
    // $ANTLR end "rule__Config__Group_16__1__Impl"


    // $ANTLR start "rule__Config__Group_16__2"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:841:1: rule__Config__Group_16__2 : rule__Config__Group_16__2__Impl ;
    public final void rule__Config__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:845:1: ( rule__Config__Group_16__2__Impl )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:846:2: rule__Config__Group_16__2__Impl
            {
            pushFollow(FOLLOW_rule__Config__Group_16__2__Impl_in_rule__Config__Group_16__21612);
            rule__Config__Group_16__2__Impl();

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
    // $ANTLR end "rule__Config__Group_16__2"


    // $ANTLR start "rule__Config__Group_16__2__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:852:1: rule__Config__Group_16__2__Impl : ( ']' ) ;
    public final void rule__Config__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:856:1: ( ( ']' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:857:1: ( ']' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:857:1: ( ']' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:858:1: ']'
            {
             before(grammarAccess.getConfigAccess().getRightSquareBracketKeyword_16_2()); 
            match(input,21,FOLLOW_21_in_rule__Config__Group_16__2__Impl1640); 
             after(grammarAccess.getConfigAccess().getRightSquareBracketKeyword_16_2()); 

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
    // $ANTLR end "rule__Config__Group_16__2__Impl"


    // $ANTLR start "rule__Generator__Group__0"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:877:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:881:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:882:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__01677);
            rule__Generator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__01680);
            rule__Generator__Group__1();

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
    // $ANTLR end "rule__Generator__Group__0"


    // $ANTLR start "rule__Generator__Group__0__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:889:1: rule__Generator__Group__0__Impl : ( ( rule__Generator__NameAssignment_0 ) ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:893:1: ( ( ( rule__Generator__NameAssignment_0 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:894:1: ( ( rule__Generator__NameAssignment_0 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:894:1: ( ( rule__Generator__NameAssignment_0 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:895:1: ( rule__Generator__NameAssignment_0 )
            {
             before(grammarAccess.getGeneratorAccess().getNameAssignment_0()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:896:1: ( rule__Generator__NameAssignment_0 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:896:2: rule__Generator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Generator__NameAssignment_0_in_rule__Generator__Group__0__Impl1707);
            rule__Generator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Generator__Group__0__Impl"


    // $ANTLR start "rule__Generator__Group__1"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:906:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:910:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:911:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__11737);
            rule__Generator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__11740);
            rule__Generator__Group__2();

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
    // $ANTLR end "rule__Generator__Group__1"


    // $ANTLR start "rule__Generator__Group__1__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:918:1: rule__Generator__Group__1__Impl : ( '=' ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:922:1: ( ( '=' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:923:1: ( '=' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:923:1: ( '=' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:924:1: '='
            {
             before(grammarAccess.getGeneratorAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Generator__Group__1__Impl1768); 
             after(grammarAccess.getGeneratorAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Generator__Group__1__Impl"


    // $ANTLR start "rule__Generator__Group__2"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:937:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:941:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:942:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__21799);
            rule__Generator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__21802);
            rule__Generator__Group__3();

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
    // $ANTLR end "rule__Generator__Group__2"


    // $ANTLR start "rule__Generator__Group__2__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:949:1: rule__Generator__Group__2__Impl : ( ( rule__Generator__BundleAssignment_2 ) ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:953:1: ( ( ( rule__Generator__BundleAssignment_2 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:954:1: ( ( rule__Generator__BundleAssignment_2 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:954:1: ( ( rule__Generator__BundleAssignment_2 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:955:1: ( rule__Generator__BundleAssignment_2 )
            {
             before(grammarAccess.getGeneratorAccess().getBundleAssignment_2()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:956:1: ( rule__Generator__BundleAssignment_2 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:956:2: rule__Generator__BundleAssignment_2
            {
            pushFollow(FOLLOW_rule__Generator__BundleAssignment_2_in_rule__Generator__Group__2__Impl1829);
            rule__Generator__BundleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getBundleAssignment_2()); 

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
    // $ANTLR end "rule__Generator__Group__2__Impl"


    // $ANTLR start "rule__Generator__Group__3"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:966:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:970:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:971:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__31859);
            rule__Generator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__31862);
            rule__Generator__Group__4();

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
    // $ANTLR end "rule__Generator__Group__3"


    // $ANTLR start "rule__Generator__Group__3__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:978:1: rule__Generator__Group__3__Impl : ( ':' ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:982:1: ( ( ':' ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:983:1: ( ':' )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:983:1: ( ':' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:984:1: ':'
            {
             before(grammarAccess.getGeneratorAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Generator__Group__3__Impl1890); 
             after(grammarAccess.getGeneratorAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Generator__Group__3__Impl"


    // $ANTLR start "rule__Generator__Group__4"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:997:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1001:1: ( rule__Generator__Group__4__Impl )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1002:2: rule__Generator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__41921);
            rule__Generator__Group__4__Impl();

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
    // $ANTLR end "rule__Generator__Group__4"


    // $ANTLR start "rule__Generator__Group__4__Impl"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1008:1: rule__Generator__Group__4__Impl : ( ( rule__Generator__GenClassAssignment_4 ) ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1012:1: ( ( ( rule__Generator__GenClassAssignment_4 ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1013:1: ( ( rule__Generator__GenClassAssignment_4 ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1013:1: ( ( rule__Generator__GenClassAssignment_4 ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1014:1: ( rule__Generator__GenClassAssignment_4 )
            {
             before(grammarAccess.getGeneratorAccess().getGenClassAssignment_4()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1015:1: ( rule__Generator__GenClassAssignment_4 )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1015:2: rule__Generator__GenClassAssignment_4
            {
            pushFollow(FOLLOW_rule__Generator__GenClassAssignment_4_in_rule__Generator__Group__4__Impl1948);
            rule__Generator__GenClassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getGenClassAssignment_4()); 

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
    // $ANTLR end "rule__Generator__Group__4__Impl"


    // $ANTLR start "rule__Config__AppNameAssignment_4"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1038:1: rule__Config__AppNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Config__AppNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1042:1: ( ( RULE_STRING ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1043:1: ( RULE_STRING )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1043:1: ( RULE_STRING )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1044:1: RULE_STRING
            {
             before(grammarAccess.getConfigAccess().getAppNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Config__AppNameAssignment_41995); 
             after(grammarAccess.getConfigAccess().getAppNameSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Config__AppNameAssignment_4"


    // $ANTLR start "rule__Config__MainClassAssignment_7"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1053:1: rule__Config__MainClassAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Config__MainClassAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1057:1: ( ( RULE_STRING ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1058:1: ( RULE_STRING )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1058:1: ( RULE_STRING )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1059:1: RULE_STRING
            {
             before(grammarAccess.getConfigAccess().getMainClassSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Config__MainClassAssignment_72026); 
             after(grammarAccess.getConfigAccess().getMainClassSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Config__MainClassAssignment_7"


    // $ANTLR start "rule__Config__SrcFolderAssignment_10"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1068:1: rule__Config__SrcFolderAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Config__SrcFolderAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1072:1: ( ( RULE_STRING ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1073:1: ( RULE_STRING )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1073:1: ( RULE_STRING )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1074:1: RULE_STRING
            {
             before(grammarAccess.getConfigAccess().getSrcFolderSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Config__SrcFolderAssignment_102057); 
             after(grammarAccess.getConfigAccess().getSrcFolderSTRINGTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Config__SrcFolderAssignment_10"


    // $ANTLR start "rule__Config__OutFolderAssignment_13"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1083:1: rule__Config__OutFolderAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Config__OutFolderAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1087:1: ( ( RULE_STRING ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1088:1: ( RULE_STRING )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1088:1: ( RULE_STRING )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1089:1: RULE_STRING
            {
             before(grammarAccess.getConfigAccess().getOutFolderSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Config__OutFolderAssignment_132088); 
             after(grammarAccess.getConfigAccess().getOutFolderSTRINGTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__Config__OutFolderAssignment_13"


    // $ANTLR start "rule__Config__SelectorsAssignment_16_1"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1098:1: rule__Config__SelectorsAssignment_16_1 : ( ( RULE_ID ) ) ;
    public final void rule__Config__SelectorsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1102:1: ( ( ( RULE_ID ) ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1103:1: ( ( RULE_ID ) )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1103:1: ( ( RULE_ID ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1104:1: ( RULE_ID )
            {
             before(grammarAccess.getConfigAccess().getSelectorsGeneratorCrossReference_16_1_0()); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1105:1: ( RULE_ID )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1106:1: RULE_ID
            {
             before(grammarAccess.getConfigAccess().getSelectorsGeneratorIDTerminalRuleCall_16_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Config__SelectorsAssignment_16_12123); 
             after(grammarAccess.getConfigAccess().getSelectorsGeneratorIDTerminalRuleCall_16_1_0_1()); 

            }

             after(grammarAccess.getConfigAccess().getSelectorsGeneratorCrossReference_16_1_0()); 

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
    // $ANTLR end "rule__Config__SelectorsAssignment_16_1"


    // $ANTLR start "rule__Config__GeneratorsAssignment_17"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1117:1: rule__Config__GeneratorsAssignment_17 : ( ruleGenerator ) ;
    public final void rule__Config__GeneratorsAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1121:1: ( ( ruleGenerator ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1122:1: ( ruleGenerator )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1122:1: ( ruleGenerator )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1123:1: ruleGenerator
            {
             before(grammarAccess.getConfigAccess().getGeneratorsGeneratorParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleGenerator_in_rule__Config__GeneratorsAssignment_172158);
            ruleGenerator();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getGeneratorsGeneratorParserRuleCall_17_0()); 

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
    // $ANTLR end "rule__Config__GeneratorsAssignment_17"


    // $ANTLR start "rule__Generator__NameAssignment_0"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1132:1: rule__Generator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Generator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1136:1: ( ( RULE_ID ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1137:1: ( RULE_ID )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1137:1: ( RULE_ID )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1138:1: RULE_ID
            {
             before(grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__NameAssignment_02189); 
             after(grammarAccess.getGeneratorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Generator__NameAssignment_0"


    // $ANTLR start "rule__Generator__BundleAssignment_2"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1147:1: rule__Generator__BundleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Generator__BundleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1151:1: ( ( RULE_STRING ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1152:1: ( RULE_STRING )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1152:1: ( RULE_STRING )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1153:1: RULE_STRING
            {
             before(grammarAccess.getGeneratorAccess().getBundleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Generator__BundleAssignment_22220); 
             after(grammarAccess.getGeneratorAccess().getBundleSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Generator__BundleAssignment_2"


    // $ANTLR start "rule__Generator__GenClassAssignment_4"
    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1162:1: rule__Generator__GenClassAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Generator__GenClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1166:1: ( ( RULE_STRING ) )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1167:1: ( RULE_STRING )
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1167:1: ( RULE_STRING )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1168:1: RULE_STRING
            {
             before(grammarAccess.getGeneratorAccess().getGenClassSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Generator__GenClassAssignment_42251); 
             after(grammarAccess.getGeneratorAccess().getGenClassSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Generator__GenClassAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__0_in_ruleConfig94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0_in_ruleGenerator154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__0__Impl_in_rule__Config__Group__0190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Config__Group__1_in_rule__Config__Group__0193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Config__Group__0__Impl221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__1__Impl_in_rule__Config__Group__1252 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Config__Group__2_in_rule__Config__Group__1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Config__Group__1__Impl283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__2__Impl_in_rule__Config__Group__2314 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Config__Group__3_in_rule__Config__Group__2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Config__Group__2__Impl345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__3__Impl_in_rule__Config__Group__3376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Config__Group__4_in_rule__Config__Group__3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Config__Group__3__Impl407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__4__Impl_in_rule__Config__Group__4438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Config__Group__5_in_rule__Config__Group__4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__AppNameAssignment_4_in_rule__Config__Group__4__Impl468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__5__Impl_in_rule__Config__Group__5498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Config__Group__6_in_rule__Config__Group__5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Config__Group__5__Impl529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__6__Impl_in_rule__Config__Group__6560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Config__Group__7_in_rule__Config__Group__6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Config__Group__6__Impl591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__7__Impl_in_rule__Config__Group__7622 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Config__Group__8_in_rule__Config__Group__7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__MainClassAssignment_7_in_rule__Config__Group__7__Impl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__8__Impl_in_rule__Config__Group__8682 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Config__Group__9_in_rule__Config__Group__8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Config__Group__8__Impl713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__9__Impl_in_rule__Config__Group__9744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Config__Group__10_in_rule__Config__Group__9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Config__Group__9__Impl775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__10__Impl_in_rule__Config__Group__10806 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Config__Group__11_in_rule__Config__Group__10809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__SrcFolderAssignment_10_in_rule__Config__Group__10__Impl836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__11__Impl_in_rule__Config__Group__11866 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Config__Group__12_in_rule__Config__Group__11869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Config__Group__11__Impl897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__12__Impl_in_rule__Config__Group__12928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Config__Group__13_in_rule__Config__Group__12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Config__Group__12__Impl959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__13__Impl_in_rule__Config__Group__13990 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Config__Group__14_in_rule__Config__Group__13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__OutFolderAssignment_13_in_rule__Config__Group__13__Impl1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__14__Impl_in_rule__Config__Group__141050 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Config__Group__15_in_rule__Config__Group__141053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Config__Group__14__Impl1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__15__Impl_in_rule__Config__Group__151112 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Config__Group__16_in_rule__Config__Group__151115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Config__Group__15__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__16__Impl_in_rule__Config__Group__161174 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Config__Group__17_in_rule__Config__Group__161177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_16__0_in_rule__Config__Group__16__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__17__Impl_in_rule__Config__Group__171235 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Config__Group__18_in_rule__Config__Group__171238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__GeneratorsAssignment_17_in_rule__Config__Group__17__Impl1267 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_rule__Config__GeneratorsAssignment_17_in_rule__Config__Group__17__Impl1279 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_rule__Config__Group__18__Impl_in_rule__Config__Group__181312 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Config__Group__19_in_rule__Config__Group__181315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Config__Group__18__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group__19__Impl_in_rule__Config__Group__191374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Config__Group__19__Impl1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_16__0__Impl_in_rule__Config__Group_16__01473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Config__Group_16__1_in_rule__Config__Group_16__01476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Config__Group_16__0__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__Group_16__1__Impl_in_rule__Config__Group_16__11535 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Config__Group_16__2_in_rule__Config__Group_16__11538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Config__SelectorsAssignment_16_1_in_rule__Config__Group_16__1__Impl1567 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Config__SelectorsAssignment_16_1_in_rule__Config__Group_16__1__Impl1579 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Config__Group_16__2__Impl_in_rule__Config__Group_16__21612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Config__Group_16__2__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__01677 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__01680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__NameAssignment_0_in_rule__Generator__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__11737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__11740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Generator__Group__1__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__21799 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__21802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__BundleAssignment_2_in_rule__Generator__Group__2__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__31859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__31862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Generator__Group__3__Impl1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__41921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__GenClassAssignment_4_in_rule__Generator__Group__4__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Config__AppNameAssignment_41995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Config__MainClassAssignment_72026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Config__SrcFolderAssignment_102057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Config__OutFolderAssignment_132088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Config__SelectorsAssignment_16_12123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__Config__GeneratorsAssignment_172158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__NameAssignment_02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Generator__BundleAssignment_22220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Generator__GenClassAssignment_42251 = new BitSet(new long[]{0x0000000000000002L});

}