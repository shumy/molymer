package org.molymer.ui.contentassist.antlr.internal; 

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
import org.molymer.services.ModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalModelDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_PATTERN_STRING", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_END_LINE", "RULE_ANY_OTHER", "'--<'", "'#string'", "'#integer'", "'#double'", "'#int-range'", "'#format-range'", "'import'", "'package'", "'{'", "'}'", "'datatype'", "'entity'", "'group'", "':parent->'", "':childs-<'", "':'", "'-->'", "'-'", "'-<'", "'['", "']'", "'annotation'", "'?'", "'-HIDDEN-'", "'..'", "'.'", "'.*'", "'@regex'", "'@date'", "'@number'", "'*'", "'#group'", "'#package'", "'#datatype'", "'#annotation'", "'#entity'", "'#property'", "'#reference'", "'#reference-list'", "'#parent'", "'#child'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_END_LINE=11;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_PATTERN_STRING=6;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalModelDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g"; }


     
     	private ModelDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ModelDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:62:1: ( ruleModel EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:77:1: ( rule__Model__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:90:1: ( ruleImport EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:105:1: ( rule__Import__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleElement"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:117:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:118:1: ( ruleElement EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:119:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement187);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:126:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:130:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:131:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:131:1: ( ( rule__Element__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:132:1: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:133:1: ( rule__Element__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:133:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement220);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:145:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:146:1: ( ruleType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:147:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType247);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:154:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:158:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:159:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:159:1: ( ( rule__Type__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:160:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:161:1: ( rule__Type__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:161:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType280);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePackage"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:173:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:174:1: ( rulePackage EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:175:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage307);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage314); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:182:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:186:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:187:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:187:1: ( ( rule__Package__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:188:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:189:1: ( rule__Package__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:189:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage340);
            rule__Package__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getGroup()); 
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleDataType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:201:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:202:1: ( ruleDataType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:203:1: ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType367);
            ruleDataType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:210:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:214:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:215:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:215:1: ( ( rule__DataType__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:216:1: ( rule__DataType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:217:1: ( rule__DataType__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:217:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType400);
            rule__DataType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDataTypeField"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:229:1: entryRuleDataTypeField : ruleDataTypeField EOF ;
    public final void entryRuleDataTypeField() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:230:1: ( ruleDataTypeField EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:231:1: ruleDataTypeField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeField_in_entryRuleDataTypeField427);
            ruleDataTypeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeField434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDataTypeField"


    // $ANTLR start "ruleDataTypeField"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:238:1: ruleDataTypeField : ( ( rule__DataTypeField__Alternatives ) ) ;
    public final void ruleDataTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:242:2: ( ( ( rule__DataTypeField__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:243:1: ( ( rule__DataTypeField__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:243:1: ( ( rule__DataTypeField__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:244:1: ( rule__DataTypeField__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:245:1: ( rule__DataTypeField__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:245:2: rule__DataTypeField__Alternatives
            {
            pushFollow(FOLLOW_rule__DataTypeField__Alternatives_in_ruleDataTypeField460);
            rule__DataTypeField__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDataTypeField"


    // $ANTLR start "entryRulePatternType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:257:1: entryRulePatternType : rulePatternType EOF ;
    public final void entryRulePatternType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:258:1: ( rulePatternType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:259:1: rulePatternType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeRule()); 
            }
            pushFollow(FOLLOW_rulePatternType_in_entryRulePatternType487);
            rulePatternType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternType494); if (state.failed) return ;

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
    // $ANTLR end "entryRulePatternType"


    // $ANTLR start "rulePatternType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:266:1: rulePatternType : ( ( rule__PatternType__Alternatives ) ) ;
    public final void rulePatternType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:270:2: ( ( ( rule__PatternType__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:271:1: ( ( rule__PatternType__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:271:1: ( ( rule__PatternType__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:272:1: ( rule__PatternType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:273:1: ( rule__PatternType__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:273:2: rule__PatternType__Alternatives
            {
            pushFollow(FOLLOW_rule__PatternType__Alternatives_in_rulePatternType520);
            rule__PatternType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeAccess().getAlternatives()); 
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
    // $ANTLR end "rulePatternType"


    // $ANTLR start "entryRuleEntity"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:285:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:286:1: ( ruleEntity EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:287:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity547);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:294:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:298:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:299:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:299:1: ( ( rule__Entity__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:300:1: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:301:1: ( rule__Entity__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:301:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity580);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityGroup"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:313:1: entryRuleEntityGroup : ruleEntityGroup EOF ;
    public final void entryRuleEntityGroup() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:314:1: ( ruleEntityGroup EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:315:1: ruleEntityGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupRule()); 
            }
            pushFollow(FOLLOW_ruleEntityGroup_in_entryRuleEntityGroup607);
            ruleEntityGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityGroup614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityGroup"


    // $ANTLR start "ruleEntityGroup"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:322:1: ruleEntityGroup : ( ( rule__EntityGroup__Group__0 ) ) ;
    public final void ruleEntityGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:326:2: ( ( ( rule__EntityGroup__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:327:1: ( ( rule__EntityGroup__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:327:1: ( ( rule__EntityGroup__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:328:1: ( rule__EntityGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:329:1: ( rule__EntityGroup__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:329:2: rule__EntityGroup__Group__0
            {
            pushFollow(FOLLOW_rule__EntityGroup__Group__0_in_ruleEntityGroup640);
            rule__EntityGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getGroup()); 
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
    // $ANTLR end "ruleEntityGroup"


    // $ANTLR start "entryRuleEntityElements"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:341:1: entryRuleEntityElements : ruleEntityElements EOF ;
    public final void entryRuleEntityElements() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:342:1: ( ruleEntityElements EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:343:1: ruleEntityElements EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsRule()); 
            }
            pushFollow(FOLLOW_ruleEntityElements_in_entryRuleEntityElements667);
            ruleEntityElements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityElements674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityElements"


    // $ANTLR start "ruleEntityElements"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:350:1: ruleEntityElements : ( ( rule__EntityElements__Group__0 ) ) ;
    public final void ruleEntityElements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:354:2: ( ( ( rule__EntityElements__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:355:1: ( ( rule__EntityElements__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:355:1: ( ( rule__EntityElements__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:356:1: ( rule__EntityElements__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:357:1: ( rule__EntityElements__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:357:2: rule__EntityElements__Group__0
            {
            pushFollow(FOLLOW_rule__EntityElements__Group__0_in_ruleEntityElements700);
            rule__EntityElements__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsAccess().getGroup()); 
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
    // $ANTLR end "ruleEntityElements"


    // $ANTLR start "entryRuleContainer"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:369:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:370:1: ( ruleContainer EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:371:1: ruleContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerRule()); 
            }
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer727);
            ruleContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:378:1: ruleContainer : ( ( rule__Container__Alternatives ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:382:2: ( ( ( rule__Container__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:383:1: ( ( rule__Container__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:383:1: ( ( rule__Container__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:384:1: ( rule__Container__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:385:1: ( rule__Container__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:385:2: rule__Container__Alternatives
            {
            pushFollow(FOLLOW_rule__Container__Alternatives_in_ruleContainer760);
            rule__Container__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerAccess().getAlternatives()); 
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleField"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:397:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:398:1: ( ruleField EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:399:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField787);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:406:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:410:2: ( ( ( rule__Field__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:411:1: ( ( rule__Field__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:411:1: ( ( rule__Field__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:412:1: ( rule__Field__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:413:1: ( rule__Field__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:413:2: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_in_ruleField820);
            rule__Field__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAlternatives()); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleParent"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:425:1: entryRuleParent : ruleParent EOF ;
    public final void entryRuleParent() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:426:1: ( ruleParent EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:427:1: ruleParent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentRule()); 
            }
            pushFollow(FOLLOW_ruleParent_in_entryRuleParent847);
            ruleParent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParent854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:434:1: ruleParent : ( ( rule__Parent__Group__0 ) ) ;
    public final void ruleParent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:438:2: ( ( ( rule__Parent__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:439:1: ( ( rule__Parent__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:439:1: ( ( rule__Parent__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:440:1: ( rule__Parent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:441:1: ( rule__Parent__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:441:2: rule__Parent__Group__0
            {
            pushFollow(FOLLOW_rule__Parent__Group__0_in_ruleParent880);
            rule__Parent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentAccess().getGroup()); 
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
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleChild"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:453:1: entryRuleChild : ruleChild EOF ;
    public final void entryRuleChild() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:454:1: ( ruleChild EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:455:1: ruleChild EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildRule()); 
            }
            pushFollow(FOLLOW_ruleChild_in_entryRuleChild907);
            ruleChild();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChild914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:462:1: ruleChild : ( ( rule__Child__Group__0 ) ) ;
    public final void ruleChild() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:466:2: ( ( ( rule__Child__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:467:1: ( ( rule__Child__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:467:1: ( ( rule__Child__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:468:1: ( rule__Child__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:469:1: ( rule__Child__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:469:2: rule__Child__Group__0
            {
            pushFollow(FOLLOW_rule__Child__Group__0_in_ruleChild940);
            rule__Child__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildAccess().getGroup()); 
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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:481:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:482:1: ( ruleProperty EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:483:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty967);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:490:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:494:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:495:1: ( ( rule__Property__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:495:1: ( ( rule__Property__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:496:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:497:1: ( rule__Property__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:497:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1000);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleReference"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:509:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:510:1: ( ruleReference EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:511:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1027);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:518:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:522:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:523:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:523:1: ( ( rule__Reference__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:524:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:525:1: ( rule__Reference__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:525:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1060);
            rule__Reference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleReferenceList"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:537:1: entryRuleReferenceList : ruleReferenceList EOF ;
    public final void entryRuleReferenceList() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:538:1: ( ruleReferenceList EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:539:1: ruleReferenceList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceList_in_entryRuleReferenceList1087);
            ruleReferenceList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceList1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferenceList"


    // $ANTLR start "ruleReferenceList"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:546:1: ruleReferenceList : ( ( rule__ReferenceList__Group__0 ) ) ;
    public final void ruleReferenceList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:550:2: ( ( ( rule__ReferenceList__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:551:1: ( ( rule__ReferenceList__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:551:1: ( ( rule__ReferenceList__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:552:1: ( rule__ReferenceList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:553:1: ( rule__ReferenceList__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:553:2: rule__ReferenceList__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group__0_in_ruleReferenceList1120);
            rule__ReferenceList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getGroup()); 
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
    // $ANTLR end "ruleReferenceList"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:565:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:566:1: ( ruleAnnotation EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:567:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1147);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:574:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:578:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:579:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:579:1: ( ( rule__Annotation__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:580:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:581:1: ( rule__Annotation__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:581:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1180);
            rule__Annotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup()); 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationMandatoryProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:593:1: entryRuleAnnotationMandatoryProperty : ruleAnnotationMandatoryProperty EOF ;
    public final void entryRuleAnnotationMandatoryProperty() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:594:1: ( ruleAnnotationMandatoryProperty EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:595:1: ruleAnnotationMandatoryProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationMandatoryProperty_in_entryRuleAnnotationMandatoryProperty1207);
            ruleAnnotationMandatoryProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationMandatoryProperty1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotationMandatoryProperty"


    // $ANTLR start "ruleAnnotationMandatoryProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:602:1: ruleAnnotationMandatoryProperty : ( ( rule__AnnotationMandatoryProperty__Group__0 ) ) ;
    public final void ruleAnnotationMandatoryProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:606:2: ( ( ( rule__AnnotationMandatoryProperty__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:607:1: ( ( rule__AnnotationMandatoryProperty__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:607:1: ( ( rule__AnnotationMandatoryProperty__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:608:1: ( rule__AnnotationMandatoryProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:609:1: ( rule__AnnotationMandatoryProperty__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:609:2: rule__AnnotationMandatoryProperty__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group__0_in_ruleAnnotationMandatoryProperty1240);
            rule__AnnotationMandatoryProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleAnnotationMandatoryProperty"


    // $ANTLR start "entryRuleAnnotationOptionalProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:621:1: entryRuleAnnotationOptionalProperty : ruleAnnotationOptionalProperty EOF ;
    public final void entryRuleAnnotationOptionalProperty() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:622:1: ( ruleAnnotationOptionalProperty EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:623:1: ruleAnnotationOptionalProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationOptionalProperty_in_entryRuleAnnotationOptionalProperty1267);
            ruleAnnotationOptionalProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationOptionalProperty1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotationOptionalProperty"


    // $ANTLR start "ruleAnnotationOptionalProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:630:1: ruleAnnotationOptionalProperty : ( ( rule__AnnotationOptionalProperty__Group__0 ) ) ;
    public final void ruleAnnotationOptionalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:634:2: ( ( ( rule__AnnotationOptionalProperty__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:635:1: ( ( rule__AnnotationOptionalProperty__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:635:1: ( ( rule__AnnotationOptionalProperty__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:636:1: ( rule__AnnotationOptionalProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:637:1: ( rule__AnnotationOptionalProperty__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:637:2: rule__AnnotationOptionalProperty__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__0_in_ruleAnnotationOptionalProperty1300);
            rule__AnnotationOptionalProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleAnnotationOptionalProperty"


    // $ANTLR start "entryRuleAnnotationGroup"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:649:1: entryRuleAnnotationGroup : ruleAnnotationGroup EOF ;
    public final void entryRuleAnnotationGroup() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:650:1: ( ruleAnnotationGroup EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:651:1: ruleAnnotationGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationGroupRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_entryRuleAnnotationGroup1327);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationGroupRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationGroup1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotationGroup"


    // $ANTLR start "ruleAnnotationGroup"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:658:1: ruleAnnotationGroup : ( ( rule__AnnotationGroup__Group__0 ) ) ;
    public final void ruleAnnotationGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:662:2: ( ( ( rule__AnnotationGroup__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:663:1: ( ( rule__AnnotationGroup__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:663:1: ( ( rule__AnnotationGroup__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:664:1: ( rule__AnnotationGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationGroupAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:665:1: ( rule__AnnotationGroup__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:665:2: rule__AnnotationGroup__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationGroup__Group__0_in_ruleAnnotationGroup1360);
            rule__AnnotationGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationGroupAccess().getGroup()); 
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
    // $ANTLR end "ruleAnnotationGroup"


    // $ANTLR start "entryRuleAnnotationInstance"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:677:1: entryRuleAnnotationInstance : ruleAnnotationInstance EOF ;
    public final void entryRuleAnnotationInstance() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:678:1: ( ruleAnnotationInstance EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:679:1: ruleAnnotationInstance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationInstance_in_entryRuleAnnotationInstance1387);
            ruleAnnotationInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationInstance1394); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotationInstance"


    // $ANTLR start "ruleAnnotationInstance"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:686:1: ruleAnnotationInstance : ( ( rule__AnnotationInstance__Group__0 ) ) ;
    public final void ruleAnnotationInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:690:2: ( ( ( rule__AnnotationInstance__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:691:1: ( ( rule__AnnotationInstance__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:691:1: ( ( rule__AnnotationInstance__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:692:1: ( rule__AnnotationInstance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:693:1: ( rule__AnnotationInstance__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:693:2: rule__AnnotationInstance__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__Group__0_in_ruleAnnotationInstance1420);
            rule__AnnotationInstance__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getGroup()); 
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
    // $ANTLR end "ruleAnnotationInstance"


    // $ANTLR start "entryRuleAnnotationHiddenProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:705:1: entryRuleAnnotationHiddenProperty : ruleAnnotationHiddenProperty EOF ;
    public final void entryRuleAnnotationHiddenProperty() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:706:1: ( ruleAnnotationHiddenProperty EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:707:1: ruleAnnotationHiddenProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationHiddenProperty_in_entryRuleAnnotationHiddenProperty1447);
            ruleAnnotationHiddenProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationHiddenProperty1454); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotationHiddenProperty"


    // $ANTLR start "ruleAnnotationHiddenProperty"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:714:1: ruleAnnotationHiddenProperty : ( ( rule__AnnotationHiddenProperty__Group__0 ) ) ;
    public final void ruleAnnotationHiddenProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:718:2: ( ( ( rule__AnnotationHiddenProperty__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:719:1: ( ( rule__AnnotationHiddenProperty__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:719:1: ( ( rule__AnnotationHiddenProperty__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:720:1: ( rule__AnnotationHiddenProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:721:1: ( rule__AnnotationHiddenProperty__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:721:2: rule__AnnotationHiddenProperty__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationHiddenProperty__Group__0_in_ruleAnnotationHiddenProperty1480);
            rule__AnnotationHiddenProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyAccess().getGroup()); 
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
    // $ANTLR end "ruleAnnotationHiddenProperty"


    // $ANTLR start "entryRuleAnnotationValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:733:1: entryRuleAnnotationValue : ruleAnnotationValue EOF ;
    public final void entryRuleAnnotationValue() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:734:1: ( ruleAnnotationValue EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:735:1: ruleAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationValueRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue1507);
            ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValue1514); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotationValue"


    // $ANTLR start "ruleAnnotationValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:742:1: ruleAnnotationValue : ( ( rule__AnnotationValue__Alternatives ) ) ;
    public final void ruleAnnotationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:746:2: ( ( ( rule__AnnotationValue__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:747:1: ( ( rule__AnnotationValue__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:747:1: ( ( rule__AnnotationValue__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:748:1: ( rule__AnnotationValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationValueAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:749:1: ( rule__AnnotationValue__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:749:2: rule__AnnotationValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AnnotationValue__Alternatives_in_ruleAnnotationValue1540);
            rule__AnnotationValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAnnotationValue"


    // $ANTLR start "entryRuleGroupType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:763:1: entryRuleGroupType : ruleGroupType EOF ;
    public final void entryRuleGroupType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:764:1: ( ruleGroupType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:765:1: ruleGroupType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupTypeRule()); 
            }
            pushFollow(FOLLOW_ruleGroupType_in_entryRuleGroupType1569);
            ruleGroupType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupType1576); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGroupType"


    // $ANTLR start "ruleGroupType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:772:1: ruleGroupType : ( ( rule__GroupType__Group__0 ) ) ;
    public final void ruleGroupType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:776:2: ( ( ( rule__GroupType__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:777:1: ( ( rule__GroupType__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:777:1: ( ( rule__GroupType__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:778:1: ( rule__GroupType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupTypeAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:779:1: ( rule__GroupType__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:779:2: rule__GroupType__Group__0
            {
            pushFollow(FOLLOW_rule__GroupType__Group__0_in_ruleGroupType1602);
            rule__GroupType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleGroupType"


    // $ANTLR start "entryRulePackageType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:791:1: entryRulePackageType : rulePackageType EOF ;
    public final void entryRulePackageType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:792:1: ( rulePackageType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:793:1: rulePackageType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageTypeRule()); 
            }
            pushFollow(FOLLOW_rulePackageType_in_entryRulePackageType1629);
            rulePackageType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageType1636); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackageType"


    // $ANTLR start "rulePackageType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:800:1: rulePackageType : ( ( rule__PackageType__TypeAssignment ) ) ;
    public final void rulePackageType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:804:2: ( ( ( rule__PackageType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:805:1: ( ( rule__PackageType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:805:1: ( ( rule__PackageType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:806:1: ( rule__PackageType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:807:1: ( rule__PackageType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:807:2: rule__PackageType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__PackageType__TypeAssignment_in_rulePackageType1662);
            rule__PackageType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "rulePackageType"


    // $ANTLR start "entryRuleDataTypeType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:819:1: entryRuleDataTypeType : ruleDataTypeType EOF ;
    public final void entryRuleDataTypeType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:820:1: ( ruleDataTypeType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:821:1: ruleDataTypeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeType_in_entryRuleDataTypeType1689);
            ruleDataTypeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeType1696); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDataTypeType"


    // $ANTLR start "ruleDataTypeType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:828:1: ruleDataTypeType : ( ( rule__DataTypeType__TypeAssignment ) ) ;
    public final void ruleDataTypeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:832:2: ( ( ( rule__DataTypeType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:833:1: ( ( rule__DataTypeType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:833:1: ( ( rule__DataTypeType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:834:1: ( rule__DataTypeType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:835:1: ( rule__DataTypeType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:835:2: rule__DataTypeType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__DataTypeType__TypeAssignment_in_ruleDataTypeType1722);
            rule__DataTypeType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleDataTypeType"


    // $ANTLR start "entryRuleAnnotationType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:847:1: entryRuleAnnotationType : ruleAnnotationType EOF ;
    public final void entryRuleAnnotationType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:848:1: ( ruleAnnotationType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:849:1: ruleAnnotationType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType1749);
            ruleAnnotationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType1756); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotationType"


    // $ANTLR start "ruleAnnotationType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:856:1: ruleAnnotationType : ( ( rule__AnnotationType__TypeAssignment ) ) ;
    public final void ruleAnnotationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:860:2: ( ( ( rule__AnnotationType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:861:1: ( ( rule__AnnotationType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:861:1: ( ( rule__AnnotationType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:862:1: ( rule__AnnotationType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:863:1: ( rule__AnnotationType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:863:2: rule__AnnotationType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__AnnotationType__TypeAssignment_in_ruleAnnotationType1782);
            rule__AnnotationType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleAnnotationType"


    // $ANTLR start "entryRuleEntityType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:875:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:876:1: ( ruleEntityType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:877:1: ruleEntityType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType1809);
            ruleEntityType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType1816); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:884:1: ruleEntityType : ( ( rule__EntityType__TypeAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:888:2: ( ( ( rule__EntityType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:889:1: ( ( rule__EntityType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:889:1: ( ( rule__EntityType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:890:1: ( rule__EntityType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:891:1: ( rule__EntityType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:891:2: rule__EntityType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__EntityType__TypeAssignment_in_ruleEntityType1842);
            rule__EntityType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRulePropertyType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:903:1: entryRulePropertyType : rulePropertyType EOF ;
    public final void entryRulePropertyType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:904:1: ( rulePropertyType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:905:1: rulePropertyType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyTypeRule()); 
            }
            pushFollow(FOLLOW_rulePropertyType_in_entryRulePropertyType1869);
            rulePropertyType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyType1876); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:912:1: rulePropertyType : ( ( rule__PropertyType__TypeAssignment ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:916:2: ( ( ( rule__PropertyType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:917:1: ( ( rule__PropertyType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:917:1: ( ( rule__PropertyType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:918:1: ( rule__PropertyType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:919:1: ( rule__PropertyType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:919:2: rule__PropertyType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__PropertyType__TypeAssignment_in_rulePropertyType1902);
            rule__PropertyType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleReferenceType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:931:1: entryRuleReferenceType : ruleReferenceType EOF ;
    public final void entryRuleReferenceType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:932:1: ( ruleReferenceType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:933:1: ruleReferenceType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceTypeRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceType_in_entryRuleReferenceType1929);
            ruleReferenceType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceType1936); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferenceType"


    // $ANTLR start "ruleReferenceType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:940:1: ruleReferenceType : ( ( rule__ReferenceType__TypeAssignment ) ) ;
    public final void ruleReferenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:944:2: ( ( ( rule__ReferenceType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:945:1: ( ( rule__ReferenceType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:945:1: ( ( rule__ReferenceType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:946:1: ( rule__ReferenceType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:947:1: ( rule__ReferenceType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:947:2: rule__ReferenceType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ReferenceType__TypeAssignment_in_ruleReferenceType1962);
            rule__ReferenceType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleReferenceType"


    // $ANTLR start "entryRuleReferenceListType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:959:1: entryRuleReferenceListType : ruleReferenceListType EOF ;
    public final void entryRuleReferenceListType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:960:1: ( ruleReferenceListType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:961:1: ruleReferenceListType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListTypeRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceListType_in_entryRuleReferenceListType1989);
            ruleReferenceListType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceListType1996); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferenceListType"


    // $ANTLR start "ruleReferenceListType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:968:1: ruleReferenceListType : ( ( rule__ReferenceListType__TypeAssignment ) ) ;
    public final void ruleReferenceListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:972:2: ( ( ( rule__ReferenceListType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:973:1: ( ( rule__ReferenceListType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:973:1: ( ( rule__ReferenceListType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:974:1: ( rule__ReferenceListType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:975:1: ( rule__ReferenceListType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:975:2: rule__ReferenceListType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ReferenceListType__TypeAssignment_in_ruleReferenceListType2022);
            rule__ReferenceListType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleReferenceListType"


    // $ANTLR start "entryRuleParentType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:987:1: entryRuleParentType : ruleParentType EOF ;
    public final void entryRuleParentType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:988:1: ( ruleParentType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:989:1: ruleParentType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentTypeRule()); 
            }
            pushFollow(FOLLOW_ruleParentType_in_entryRuleParentType2049);
            ruleParentType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentType2056); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParentType"


    // $ANTLR start "ruleParentType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:996:1: ruleParentType : ( ( rule__ParentType__TypeAssignment ) ) ;
    public final void ruleParentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1000:2: ( ( ( rule__ParentType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1001:1: ( ( rule__ParentType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1001:1: ( ( rule__ParentType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1002:1: ( rule__ParentType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1003:1: ( rule__ParentType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1003:2: rule__ParentType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ParentType__TypeAssignment_in_ruleParentType2082);
            rule__ParentType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleParentType"


    // $ANTLR start "entryRuleChildType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1015:1: entryRuleChildType : ruleChildType EOF ;
    public final void entryRuleChildType() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1016:1: ( ruleChildType EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1017:1: ruleChildType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildTypeRule()); 
            }
            pushFollow(FOLLOW_ruleChildType_in_entryRuleChildType2109);
            ruleChildType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildType2116); if (state.failed) return ;

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
    // $ANTLR end "entryRuleChildType"


    // $ANTLR start "ruleChildType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1024:1: ruleChildType : ( ( rule__ChildType__TypeAssignment ) ) ;
    public final void ruleChildType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1028:2: ( ( ( rule__ChildType__TypeAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1029:1: ( ( rule__ChildType__TypeAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1029:1: ( ( rule__ChildType__TypeAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1030:1: ( rule__ChildType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildTypeAccess().getTypeAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1031:1: ( rule__ChildType__TypeAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1031:2: rule__ChildType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ChildType__TypeAssignment_in_ruleChildType2142);
            rule__ChildType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleChildType"


    // $ANTLR start "entryRuleAnnoTypes"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1043:1: entryRuleAnnoTypes : ruleAnnoTypes EOF ;
    public final void entryRuleAnnoTypes() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1044:1: ( ruleAnnoTypes EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1045:1: ruleAnnoTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnoTypesRule()); 
            }
            pushFollow(FOLLOW_ruleAnnoTypes_in_entryRuleAnnoTypes2169);
            ruleAnnoTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnoTypesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnoTypes2176); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnoTypes"


    // $ANTLR start "ruleAnnoTypes"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1052:1: ruleAnnoTypes : ( ( rule__AnnoTypes__Alternatives ) ) ;
    public final void ruleAnnoTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1056:2: ( ( ( rule__AnnoTypes__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1057:1: ( ( rule__AnnoTypes__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1057:1: ( ( rule__AnnoTypes__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1058:1: ( rule__AnnoTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnoTypesAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1059:1: ( rule__AnnoTypes__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1059:2: rule__AnnoTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__AnnoTypes__Alternatives_in_ruleAnnoTypes2202);
            rule__AnnoTypes__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnoTypesAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAnnoTypes"


    // $ANTLR start "entryRuleStringValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1071:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1072:1: ( ruleStringValue EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1073:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2229);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue2236); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1080:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1084:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1085:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1085:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1086:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1087:1: ( rule__StringValue__ValueAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1087:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue2262);
            rule__StringValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntegerValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1099:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1100:1: ( ruleIntegerValue EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1101:1: ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue2289);
            ruleIntegerValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue2296); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1108:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1112:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1113:1: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1113:1: ( ( rule__IntegerValue__ValueAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1114:1: ( rule__IntegerValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1115:1: ( rule__IntegerValue__ValueAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1115:2: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue2322);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleDoubleValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1127:1: entryRuleDoubleValue : ruleDoubleValue EOF ;
    public final void entryRuleDoubleValue() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1128:1: ( ruleDoubleValue EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1129:1: ruleDoubleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue2349);
            ruleDoubleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleValue2356); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1136:1: ruleDoubleValue : ( ( rule__DoubleValue__ValueAssignment ) ) ;
    public final void ruleDoubleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1140:2: ( ( ( rule__DoubleValue__ValueAssignment ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1141:1: ( ( rule__DoubleValue__ValueAssignment ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1141:1: ( ( rule__DoubleValue__ValueAssignment ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1142:1: ( rule__DoubleValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueAccess().getValueAssignment()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1143:1: ( rule__DoubleValue__ValueAssignment )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1143:2: rule__DoubleValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DoubleValue__ValueAssignment_in_ruleDoubleValue2382);
            rule__DoubleValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleValueAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleRangeValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1155:1: entryRuleRangeValue : ruleRangeValue EOF ;
    public final void entryRuleRangeValue() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1159:1: ( ruleRangeValue EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1160:1: ruleRangeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueRule()); 
            }
            pushFollow(FOLLOW_ruleRangeValue_in_entryRuleRangeValue2414);
            ruleRangeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeValue2421); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleRangeValue"


    // $ANTLR start "ruleRangeValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1170:1: ruleRangeValue : ( ( rule__RangeValue__Group__0 ) ) ;
    public final void ruleRangeValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1175:2: ( ( ( rule__RangeValue__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1176:1: ( ( rule__RangeValue__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1176:1: ( ( rule__RangeValue__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1177:1: ( rule__RangeValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1178:1: ( rule__RangeValue__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1178:2: rule__RangeValue__Group__0
            {
            pushFollow(FOLLOW_rule__RangeValue__Group__0_in_ruleRangeValue2451);
            rule__RangeValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleRangeValue"


    // $ANTLR start "entryRuleFormatRangeValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1191:1: entryRuleFormatRangeValue : ruleFormatRangeValue EOF ;
    public final void entryRuleFormatRangeValue() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1195:1: ( ruleFormatRangeValue EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1196:1: ruleFormatRangeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRangeValueRule()); 
            }
            pushFollow(FOLLOW_ruleFormatRangeValue_in_entryRuleFormatRangeValue2483);
            ruleFormatRangeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRangeValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormatRangeValue2490); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFormatRangeValue"


    // $ANTLR start "ruleFormatRangeValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1206:1: ruleFormatRangeValue : ( ( rule__FormatRangeValue__Group__0 ) ) ;
    public final void ruleFormatRangeValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1211:2: ( ( ( rule__FormatRangeValue__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1212:1: ( ( rule__FormatRangeValue__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1212:1: ( ( rule__FormatRangeValue__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1213:1: ( rule__FormatRangeValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRangeValueAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1214:1: ( rule__FormatRangeValue__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1214:2: rule__FormatRangeValue__Group__0
            {
            pushFollow(FOLLOW_rule__FormatRangeValue__Group__0_in_ruleFormatRangeValue2520);
            rule__FormatRangeValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRangeValueAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFormatRangeValue"


    // $ANTLR start "entryRuleValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1227:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1228:1: ( ruleValue EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1229:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2547);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1236:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1240:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1241:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1241:1: ( ( rule__Value__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1242:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1243:1: ( rule__Value__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1243:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue2580);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleInteger"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1255:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1256:1: ( ruleInteger EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1257:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger2607);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger2614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1264:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1268:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1269:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1269:1: ( ( rule__Integer__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1270:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1271:1: ( rule__Integer__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1271:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger2640);
            rule__Integer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getGroup()); 
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1283:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1284:1: ( ruleDouble EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1285:1: ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble2667);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble2674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1292:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1296:2: ( ( ( rule__Double__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1297:1: ( ( rule__Double__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1297:1: ( ( rule__Double__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1298:1: ( rule__Double__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1299:1: ( rule__Double__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1299:2: rule__Double__Group__0
            {
            pushFollow(FOLLOW_rule__Double__Group__0_in_ruleDouble2700);
            rule__Double__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getGroup()); 
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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1311:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1312:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1313:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2727);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1320:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1324:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1325:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1325:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1326:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1327:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1327:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2760);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1339:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1340:1: ( ruleQualifiedName EOF )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1341:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2787);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1348:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1352:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1353:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1353:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1354:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1355:1: ( rule__QualifiedName__Group__0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1355:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2820);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleValueType"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1368:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1372:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1373:1: ( ( rule__ValueType__Alternatives ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1373:1: ( ( rule__ValueType__Alternatives ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1374:1: ( rule__ValueType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1375:1: ( rule__ValueType__Alternatives )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1375:2: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueType__Alternatives_in_ruleValueType2857);
            rule__ValueType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1386:1: rule__Element__Alternatives : ( ( ruleType ) | ( ruleAnnotation ) | ( rulePackage ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1390:1: ( ( ruleType ) | ( ruleAnnotation ) | ( rulePackage ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1_InternalModelDsl()) ) {
                    alt1=1;
                }
                else if ( (synpred2_InternalModelDsl()) ) {
                    alt1=2;
                }
                else if ( (true) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1391:1: ( ruleType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1391:1: ( ruleType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1392:1: ruleType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleType_in_rule__Element__Alternatives2892);
                    ruleType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1397:6: ( ruleAnnotation )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1397:6: ( ruleAnnotation )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1398:1: ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_rule__Element__Alternatives2909);
                    ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1403:6: ( rulePackage )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1403:6: ( rulePackage )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1404:1: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getPackageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_rulePackage_in_rule__Element__Alternatives2926);
                    rulePackage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getPackageParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1414:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1418:1: ( ( ruleEntity ) | ( ruleDataType ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred3_InternalModelDsl()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1419:1: ( ruleEntity )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1419:1: ( ruleEntity )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1420:1: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives2958);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1425:6: ( ruleDataType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1425:6: ( ruleDataType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1426:1: ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives2975);
                    ruleDataType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DataTypeField__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1436:1: rule__DataTypeField__Alternatives : ( ( ( rule__DataTypeField__Group_0__0 ) ) | ( ( rule__DataTypeField__TypeAssignment_1 ) ) );
    public final void rule__DataTypeField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1440:1: ( ( ( rule__DataTypeField__Group_0__0 ) ) | ( ( rule__DataTypeField__TypeAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=40 && LA3_0<=42)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1441:1: ( ( rule__DataTypeField__Group_0__0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1441:1: ( ( rule__DataTypeField__Group_0__0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1442:1: ( rule__DataTypeField__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeFieldAccess().getGroup_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1443:1: ( rule__DataTypeField__Group_0__0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1443:2: rule__DataTypeField__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DataTypeField__Group_0__0_in_rule__DataTypeField__Alternatives3007);
                    rule__DataTypeField__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeFieldAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1447:6: ( ( rule__DataTypeField__TypeAssignment_1 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1447:6: ( ( rule__DataTypeField__TypeAssignment_1 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1448:1: ( rule__DataTypeField__TypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeFieldAccess().getTypeAssignment_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1449:1: ( rule__DataTypeField__TypeAssignment_1 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1449:2: rule__DataTypeField__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DataTypeField__TypeAssignment_1_in_rule__DataTypeField__Alternatives3025);
                    rule__DataTypeField__TypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeFieldAccess().getTypeAssignment_1()); 
                    }

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
    // $ANTLR end "rule__DataTypeField__Alternatives"


    // $ANTLR start "rule__PatternType__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1458:1: rule__PatternType__Alternatives : ( ( ( rule__PatternType__REGEXAssignment_0 ) ) | ( ( rule__PatternType__DATEAssignment_1 ) ) | ( ( rule__PatternType__NUMBERAssignment_2 ) ) );
    public final void rule__PatternType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1462:1: ( ( ( rule__PatternType__REGEXAssignment_0 ) ) | ( ( rule__PatternType__DATEAssignment_1 ) ) | ( ( rule__PatternType__NUMBERAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1463:1: ( ( rule__PatternType__REGEXAssignment_0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1463:1: ( ( rule__PatternType__REGEXAssignment_0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1464:1: ( rule__PatternType__REGEXAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternTypeAccess().getREGEXAssignment_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1465:1: ( rule__PatternType__REGEXAssignment_0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1465:2: rule__PatternType__REGEXAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PatternType__REGEXAssignment_0_in_rule__PatternType__Alternatives3058);
                    rule__PatternType__REGEXAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternTypeAccess().getREGEXAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1469:6: ( ( rule__PatternType__DATEAssignment_1 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1469:6: ( ( rule__PatternType__DATEAssignment_1 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1470:1: ( rule__PatternType__DATEAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternTypeAccess().getDATEAssignment_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1471:1: ( rule__PatternType__DATEAssignment_1 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1471:2: rule__PatternType__DATEAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PatternType__DATEAssignment_1_in_rule__PatternType__Alternatives3076);
                    rule__PatternType__DATEAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternTypeAccess().getDATEAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1475:6: ( ( rule__PatternType__NUMBERAssignment_2 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1475:6: ( ( rule__PatternType__NUMBERAssignment_2 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1476:1: ( rule__PatternType__NUMBERAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternTypeAccess().getNUMBERAssignment_2()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1477:1: ( rule__PatternType__NUMBERAssignment_2 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1477:2: rule__PatternType__NUMBERAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PatternType__NUMBERAssignment_2_in_rule__PatternType__Alternatives3094);
                    rule__PatternType__NUMBERAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternTypeAccess().getNUMBERAssignment_2()); 
                    }

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
    // $ANTLR end "rule__PatternType__Alternatives"


    // $ANTLR start "rule__Container__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1486:1: rule__Container__Alternatives : ( ( ruleParent ) | ( ruleChild ) );
    public final void rule__Container__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1490:1: ( ( ruleParent ) | ( ruleChild ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1491:1: ( ruleParent )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1491:1: ( ruleParent )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1492:1: ruleParent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContainerAccess().getParentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParent_in_rule__Container__Alternatives3127);
                    ruleParent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContainerAccess().getParentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1497:6: ( ruleChild )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1497:6: ( ruleChild )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1498:1: ruleChild
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContainerAccess().getChildParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleChild_in_rule__Container__Alternatives3144);
                    ruleChild();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContainerAccess().getChildParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Container__Alternatives"


    // $ANTLR start "rule__Field__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1508:1: rule__Field__Alternatives : ( ( ruleProperty ) | ( ruleReference ) | ( ruleReferenceList ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1512:1: ( ( ruleProperty ) | ( ruleReference ) | ( ruleReferenceList ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==29) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==28) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 28:
                    {
                    alt6=1;
                    }
                    break;
                case 13:
                case 30:
                    {
                    alt6=3;
                    }
                    break;
                case 29:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1513:1: ( ruleProperty )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1513:1: ( ruleProperty )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1514:1: ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getPropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleProperty_in_rule__Field__Alternatives3176);
                    ruleProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getPropertyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1519:6: ( ruleReference )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1519:6: ( ruleReference )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1520:1: ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReference_in_rule__Field__Alternatives3193);
                    ruleReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1525:6: ( ruleReferenceList )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1525:6: ( ruleReferenceList )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1526:1: ruleReferenceList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getReferenceListParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleReferenceList_in_rule__Field__Alternatives3210);
                    ruleReferenceList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getReferenceListParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Field__Alternatives"


    // $ANTLR start "rule__ReferenceList__Alternatives_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1536:1: rule__ReferenceList__Alternatives_1 : ( ( ( rule__ReferenceList__Group_1_0__0 ) ) | ( '--<' ) );
    public final void rule__ReferenceList__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1540:1: ( ( ( rule__ReferenceList__Group_1_0__0 ) ) | ( '--<' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1541:1: ( ( rule__ReferenceList__Group_1_0__0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1541:1: ( ( rule__ReferenceList__Group_1_0__0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1542:1: ( rule__ReferenceList__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceListAccess().getGroup_1_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1543:1: ( rule__ReferenceList__Group_1_0__0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1543:2: rule__ReferenceList__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ReferenceList__Group_1_0__0_in_rule__ReferenceList__Alternatives_13242);
                    rule__ReferenceList__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceListAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1547:6: ( '--<' )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1547:6: ( '--<' )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1548:1: '--<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceListAccess().getHyphenMinusHyphenMinusLessThanSignKeyword_1_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__ReferenceList__Alternatives_13261); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceListAccess().getHyphenMinusHyphenMinusLessThanSignKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__ReferenceList__Alternatives_1"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Alternatives_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1560:1: rule__AnnotationMandatoryProperty__Alternatives_2 : ( ( ( rule__AnnotationMandatoryProperty__GroupAssignment_2_0 ) ) | ( ( rule__AnnotationMandatoryProperty__Group_2_1__0 ) ) );
    public final void rule__AnnotationMandatoryProperty__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1564:1: ( ( ( rule__AnnotationMandatoryProperty__GroupAssignment_2_0 ) ) | ( ( rule__AnnotationMandatoryProperty__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=14 && LA8_0<=18)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1565:1: ( ( rule__AnnotationMandatoryProperty__GroupAssignment_2_0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1565:1: ( ( rule__AnnotationMandatoryProperty__GroupAssignment_2_0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1566:1: ( rule__AnnotationMandatoryProperty__GroupAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroupAssignment_2_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1567:1: ( rule__AnnotationMandatoryProperty__GroupAssignment_2_0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1567:2: rule__AnnotationMandatoryProperty__GroupAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__GroupAssignment_2_0_in_rule__AnnotationMandatoryProperty__Alternatives_23295);
                    rule__AnnotationMandatoryProperty__GroupAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroupAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1571:6: ( ( rule__AnnotationMandatoryProperty__Group_2_1__0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1571:6: ( ( rule__AnnotationMandatoryProperty__Group_2_1__0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1572:1: ( rule__AnnotationMandatoryProperty__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroup_2_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1573:1: ( rule__AnnotationMandatoryProperty__Group_2_1__0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1573:2: rule__AnnotationMandatoryProperty__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__0_in_rule__AnnotationMandatoryProperty__Alternatives_23313);
                    rule__AnnotationMandatoryProperty__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroup_2_1()); 
                    }

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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Alternatives_2"


    // $ANTLR start "rule__AnnotationOptionalProperty__Alternatives_3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1582:1: rule__AnnotationOptionalProperty__Alternatives_3 : ( ( ( rule__AnnotationOptionalProperty__GroupAssignment_3_0 ) ) | ( ( rule__AnnotationOptionalProperty__Group_3_1__0 ) ) );
    public final void rule__AnnotationOptionalProperty__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1586:1: ( ( ( rule__AnnotationOptionalProperty__GroupAssignment_3_0 ) ) | ( ( rule__AnnotationOptionalProperty__Group_3_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=14 && LA9_0<=18)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1587:1: ( ( rule__AnnotationOptionalProperty__GroupAssignment_3_0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1587:1: ( ( rule__AnnotationOptionalProperty__GroupAssignment_3_0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1588:1: ( rule__AnnotationOptionalProperty__GroupAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationOptionalPropertyAccess().getGroupAssignment_3_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1589:1: ( rule__AnnotationOptionalProperty__GroupAssignment_3_0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1589:2: rule__AnnotationOptionalProperty__GroupAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__AnnotationOptionalProperty__GroupAssignment_3_0_in_rule__AnnotationOptionalProperty__Alternatives_33346);
                    rule__AnnotationOptionalProperty__GroupAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationOptionalPropertyAccess().getGroupAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1593:6: ( ( rule__AnnotationOptionalProperty__Group_3_1__0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1593:6: ( ( rule__AnnotationOptionalProperty__Group_3_1__0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1594:1: ( rule__AnnotationOptionalProperty__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationOptionalPropertyAccess().getGroup_3_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1595:1: ( rule__AnnotationOptionalProperty__Group_3_1__0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1595:2: rule__AnnotationOptionalProperty__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__0_in_rule__AnnotationOptionalProperty__Alternatives_33364);
                    rule__AnnotationOptionalProperty__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationOptionalPropertyAccess().getGroup_3_1()); 
                    }

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
    // $ANTLR end "rule__AnnotationOptionalProperty__Alternatives_3"


    // $ANTLR start "rule__AnnotationValue__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1604:1: rule__AnnotationValue__Alternatives : ( ( ruleValue ) | ( ruleAnnotationGroup ) );
    public final void rule__AnnotationValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1608:1: ( ( ruleValue ) | ( ruleAnnotationGroup ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==RULE_STRING||LA10_0==30||LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1609:1: ( ruleValue )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1609:1: ( ruleValue )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1610:1: ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationValueAccess().getValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleValue_in_rule__AnnotationValue__Alternatives3397);
                    ruleValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationValueAccess().getValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1615:6: ( ruleAnnotationGroup )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1615:6: ( ruleAnnotationGroup )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1616:1: ruleAnnotationGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationValueAccess().getAnnotationGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__AnnotationValue__Alternatives3414);
                    ruleAnnotationGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationValueAccess().getAnnotationGroupParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__AnnotationValue__Alternatives"


    // $ANTLR start "rule__AnnoTypes__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1627:1: rule__AnnoTypes__Alternatives : ( ( ruleGroupType ) | ( rulePackageType ) | ( ruleDataTypeType ) | ( ruleAnnotationType ) | ( ruleEntityType ) | ( rulePropertyType ) | ( ruleReferenceType ) | ( ruleReferenceListType ) | ( ruleParentType ) | ( ruleChildType ) );
    public final void rule__AnnoTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1631:1: ( ( ruleGroupType ) | ( rulePackageType ) | ( ruleDataTypeType ) | ( ruleAnnotationType ) | ( ruleEntityType ) | ( rulePropertyType ) | ( ruleReferenceType ) | ( ruleReferenceListType ) | ( ruleParentType ) | ( ruleChildType ) )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case 45:
                {
                alt11=2;
                }
                break;
            case 46:
                {
                alt11=3;
                }
                break;
            case 47:
                {
                alt11=4;
                }
                break;
            case 48:
                {
                alt11=5;
                }
                break;
            case 49:
                {
                alt11=6;
                }
                break;
            case 50:
                {
                alt11=7;
                }
                break;
            case 51:
                {
                alt11=8;
                }
                break;
            case 52:
                {
                alt11=9;
                }
                break;
            case 53:
                {
                alt11=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1632:1: ( ruleGroupType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1632:1: ( ruleGroupType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1633:1: ruleGroupType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getGroupTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGroupType_in_rule__AnnoTypes__Alternatives3447);
                    ruleGroupType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getGroupTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1638:6: ( rulePackageType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1638:6: ( rulePackageType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1639:1: rulePackageType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getPackageTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePackageType_in_rule__AnnoTypes__Alternatives3464);
                    rulePackageType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getPackageTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1644:6: ( ruleDataTypeType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1644:6: ( ruleDataTypeType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1645:1: ruleDataTypeType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getDataTypeTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleDataTypeType_in_rule__AnnoTypes__Alternatives3481);
                    ruleDataTypeType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getDataTypeTypeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1650:6: ( ruleAnnotationType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1650:6: ( ruleAnnotationType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1651:1: ruleAnnotationType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getAnnotationTypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleAnnotationType_in_rule__AnnoTypes__Alternatives3498);
                    ruleAnnotationType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getAnnotationTypeParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1656:6: ( ruleEntityType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1656:6: ( ruleEntityType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1657:1: ruleEntityType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getEntityTypeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleEntityType_in_rule__AnnoTypes__Alternatives3515);
                    ruleEntityType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getEntityTypeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1662:6: ( rulePropertyType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1662:6: ( rulePropertyType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1663:1: rulePropertyType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getPropertyTypeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_rulePropertyType_in_rule__AnnoTypes__Alternatives3532);
                    rulePropertyType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getPropertyTypeParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1668:6: ( ruleReferenceType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1668:6: ( ruleReferenceType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1669:1: ruleReferenceType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getReferenceTypeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleReferenceType_in_rule__AnnoTypes__Alternatives3549);
                    ruleReferenceType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getReferenceTypeParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1674:6: ( ruleReferenceListType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1674:6: ( ruleReferenceListType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1675:1: ruleReferenceListType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getReferenceListTypeParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleReferenceListType_in_rule__AnnoTypes__Alternatives3566);
                    ruleReferenceListType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getReferenceListTypeParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1680:6: ( ruleParentType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1680:6: ( ruleParentType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1681:1: ruleParentType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getParentTypeParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleParentType_in_rule__AnnoTypes__Alternatives3583);
                    ruleParentType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getParentTypeParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1686:6: ( ruleChildType )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1686:6: ( ruleChildType )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1687:1: ruleChildType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnoTypesAccess().getChildTypeParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_ruleChildType_in_rule__AnnoTypes__Alternatives3600);
                    ruleChildType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnoTypesAccess().getChildTypeParserRuleCall_9()); 
                    }

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
    // $ANTLR end "rule__AnnoTypes__Alternatives"


    // $ANTLR start "rule__RangeValue__Alternatives_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1697:1: rule__RangeValue__Alternatives_0 : ( ( ( rule__RangeValue__FromAssignment_0_0 ) ) | ( ( rule__RangeValue__FromInfAssignment_0_1 ) ) );
    public final void rule__RangeValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1701:1: ( ( ( rule__RangeValue__FromAssignment_0_0 ) ) | ( ( rule__RangeValue__FromInfAssignment_0_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==43) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1702:1: ( ( rule__RangeValue__FromAssignment_0_0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1702:1: ( ( rule__RangeValue__FromAssignment_0_0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1703:1: ( rule__RangeValue__FromAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeValueAccess().getFromAssignment_0_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1704:1: ( rule__RangeValue__FromAssignment_0_0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1704:2: rule__RangeValue__FromAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__RangeValue__FromAssignment_0_0_in_rule__RangeValue__Alternatives_03632);
                    rule__RangeValue__FromAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeValueAccess().getFromAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1708:6: ( ( rule__RangeValue__FromInfAssignment_0_1 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1708:6: ( ( rule__RangeValue__FromInfAssignment_0_1 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1709:1: ( rule__RangeValue__FromInfAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeValueAccess().getFromInfAssignment_0_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1710:1: ( rule__RangeValue__FromInfAssignment_0_1 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1710:2: rule__RangeValue__FromInfAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__RangeValue__FromInfAssignment_0_1_in_rule__RangeValue__Alternatives_03650);
                    rule__RangeValue__FromInfAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeValueAccess().getFromInfAssignment_0_1()); 
                    }

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
    // $ANTLR end "rule__RangeValue__Alternatives_0"


    // $ANTLR start "rule__RangeValue__Alternatives_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1719:1: rule__RangeValue__Alternatives_2 : ( ( ( rule__RangeValue__ToAssignment_2_0 ) ) | ( ( rule__RangeValue__ToInfAssignment_2_1 ) ) );
    public final void rule__RangeValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1723:1: ( ( ( rule__RangeValue__ToAssignment_2_0 ) ) | ( ( rule__RangeValue__ToInfAssignment_2_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==43) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1724:1: ( ( rule__RangeValue__ToAssignment_2_0 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1724:1: ( ( rule__RangeValue__ToAssignment_2_0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1725:1: ( rule__RangeValue__ToAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeValueAccess().getToAssignment_2_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1726:1: ( rule__RangeValue__ToAssignment_2_0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1726:2: rule__RangeValue__ToAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__RangeValue__ToAssignment_2_0_in_rule__RangeValue__Alternatives_23683);
                    rule__RangeValue__ToAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeValueAccess().getToAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1730:6: ( ( rule__RangeValue__ToInfAssignment_2_1 ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1730:6: ( ( rule__RangeValue__ToInfAssignment_2_1 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1731:1: ( rule__RangeValue__ToInfAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeValueAccess().getToInfAssignment_2_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1732:1: ( rule__RangeValue__ToInfAssignment_2_1 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1732:2: rule__RangeValue__ToInfAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__RangeValue__ToInfAssignment_2_1_in_rule__RangeValue__Alternatives_23701);
                    rule__RangeValue__ToInfAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeValueAccess().getToInfAssignment_2_1()); 
                    }

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
    // $ANTLR end "rule__RangeValue__Alternatives_2"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1741:1: rule__Value__Alternatives : ( ( ( ruleStringValue ) ) | ( ruleIntegerValue ) | ( ruleDoubleValue ) | ( ruleRangeValue ) | ( ruleFormatRangeValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1745:1: ( ( ( ruleStringValue ) ) | ( ruleIntegerValue ) | ( ruleDoubleValue ) | ( ruleRangeValue ) | ( ruleFormatRangeValue ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||(LA14_1>=RULE_INT && LA14_1<=RULE_ID)||LA14_1==RULE_STRING||LA14_1==30||(LA14_1>=32 && LA14_1<=33)||LA14_1==36||LA14_1==43) ) {
                    alt14=1;
                }
                else if ( (LA14_1==37) ) {
                    alt14=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 37:
                        {
                        alt14=4;
                        }
                        break;
                    case 38:
                        {
                        alt14=3;
                        }
                        break;
                    case EOF:
                    case RULE_INT:
                    case RULE_ID:
                    case RULE_STRING:
                    case 30:
                    case 32:
                    case 33:
                    case 36:
                    case 43:
                        {
                        alt14=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt14=4;
                    }
                    break;
                case 38:
                    {
                    alt14=3;
                    }
                    break;
                case EOF:
                case RULE_INT:
                case RULE_ID:
                case RULE_STRING:
                case 30:
                case 32:
                case 33:
                case 36:
                case 43:
                    {
                    alt14=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }

                }
                break;
            case 43:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1746:1: ( ( ruleStringValue ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1746:1: ( ( ruleStringValue ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1747:1: ( ruleStringValue )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1748:1: ( ruleStringValue )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1748:3: ruleStringValue
                    {
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives3735);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1752:6: ( ruleIntegerValue )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1752:6: ( ruleIntegerValue )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1753:1: ruleIntegerValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerValue_in_rule__Value__Alternatives3753);
                    ruleIntegerValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1758:6: ( ruleDoubleValue )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1758:6: ( ruleDoubleValue )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1759:1: ruleDoubleValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getDoubleValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleValue_in_rule__Value__Alternatives3770);
                    ruleDoubleValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getDoubleValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1764:6: ( ruleRangeValue )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1764:6: ( ruleRangeValue )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1765:1: ruleRangeValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRangeValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleRangeValue_in_rule__Value__Alternatives3787);
                    ruleRangeValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getRangeValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1770:6: ( ruleFormatRangeValue )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1770:6: ( ruleFormatRangeValue )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1771:1: ruleFormatRangeValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFormatRangeValueParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleFormatRangeValue_in_rule__Value__Alternatives3804);
                    ruleFormatRangeValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getFormatRangeValueParserRuleCall_4()); 
                    }

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__ValueType__Alternatives"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1781:1: rule__ValueType__Alternatives : ( ( ( '#string' ) ) | ( ( '#integer' ) ) | ( ( '#double' ) ) | ( ( '#int-range' ) ) | ( ( '#format-range' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1785:1: ( ( ( '#string' ) ) | ( ( '#integer' ) ) | ( ( '#double' ) ) | ( ( '#int-range' ) ) | ( ( '#format-range' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt15=1;
                }
                break;
            case 15:
                {
                alt15=2;
                }
                break;
            case 16:
                {
                alt15=3;
                }
                break;
            case 17:
                {
                alt15=4;
                }
                break;
            case 18:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1786:1: ( ( '#string' ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1786:1: ( ( '#string' ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1787:1: ( '#string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1788:1: ( '#string' )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1788:3: '#string'
                    {
                    match(input,14,FOLLOW_14_in_rule__ValueType__Alternatives3837); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1793:6: ( ( '#integer' ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1793:6: ( ( '#integer' ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1794:1: ( '#integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1795:1: ( '#integer' )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1795:3: '#integer'
                    {
                    match(input,15,FOLLOW_15_in_rule__ValueType__Alternatives3858); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1800:6: ( ( '#double' ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1800:6: ( ( '#double' ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1801:1: ( '#double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1802:1: ( '#double' )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1802:3: '#double'
                    {
                    match(input,16,FOLLOW_16_in_rule__ValueType__Alternatives3879); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1807:6: ( ( '#int-range' ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1807:6: ( ( '#int-range' ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1808:1: ( '#int-range' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getINT_RANGEEnumLiteralDeclaration_3()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1809:1: ( '#int-range' )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1809:3: '#int-range'
                    {
                    match(input,17,FOLLOW_17_in_rule__ValueType__Alternatives3900); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getINT_RANGEEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1814:6: ( ( '#format-range' ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1814:6: ( ( '#format-range' ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1815:1: ( '#format-range' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getFORMAT_RANGEEnumLiteralDeclaration_4()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1816:1: ( '#format-range' )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1816:3: '#format-range'
                    {
                    match(input,18,FOLLOW_18_in_rule__ValueType__Alternatives3921); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getFORMAT_RANGEEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1828:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1832:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1833:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03954);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03957);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1840:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1844:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1845:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1845:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1846:1: ( rule__Model__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1847:1: ( rule__Model__ImportsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1847:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl3984);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1857:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1861:1: ( rule__Model__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1862:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__14015);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1868:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1872:1: ( ( ( rule__Model__ElementsAssignment_1 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1873:1: ( ( rule__Model__ElementsAssignment_1 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1873:1: ( ( rule__Model__ElementsAssignment_1 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1874:1: ( rule__Model__ElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1875:1: ( rule__Model__ElementsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20||(LA17_0>=23 && LA17_0<=24)||LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1875:2: rule__Model__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl4042);
            	    rule__Model__ElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsAssignment_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1889:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1893:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1894:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04077);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04080);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1901:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1905:1: ( ( 'import' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1906:1: ( 'import' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1906:1: ( 'import' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1907:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl4108); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1920:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1924:1: ( rule__Import__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1925:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14139);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1931:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1935:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1936:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1936:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1937:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1938:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1938:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl4166);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1952:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1956:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1957:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__04200);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__04203);
            rule__Package__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1964:1: rule__Package__Group__0__Impl : ( ( rule__Package__AnnotationsAssignment_0 )* ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1968:1: ( ( ( rule__Package__AnnotationsAssignment_0 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1969:1: ( ( rule__Package__AnnotationsAssignment_0 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1969:1: ( ( rule__Package__AnnotationsAssignment_0 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1970:1: ( rule__Package__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1971:1: ( rule__Package__AnnotationsAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1971:2: rule__Package__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Package__AnnotationsAssignment_0_in_rule__Package__Group__0__Impl4230);
            	    rule__Package__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getAnnotationsAssignment_0()); 
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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1981:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1985:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1986:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__14261);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__14264);
            rule__Package__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1993:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1997:1: ( ( 'package' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1998:1: ( 'package' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1998:1: ( 'package' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1999:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Package__Group__1__Impl4292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2012:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2016:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2017:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__24323);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__24326);
            rule__Package__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2024:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2028:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2029:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2029:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2030:1: ( rule__Package__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2031:1: ( rule__Package__NameAssignment_2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2031:2: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl4353);
            rule__Package__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2041:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2045:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2046:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__34383);
            rule__Package__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__34386);
            rule__Package__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2053:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2057:1: ( ( '{' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2058:1: ( '{' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2058:1: ( '{' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2059:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Package__Group__3__Impl4414); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2072:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2076:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2077:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__44445);
            rule__Package__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__44448);
            rule__Package__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2084:1: rule__Package__Group__4__Impl : ( ( rule__Package__ElementsAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2088:1: ( ( ( rule__Package__ElementsAssignment_4 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2089:1: ( ( rule__Package__ElementsAssignment_4 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2089:1: ( ( rule__Package__ElementsAssignment_4 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2090:1: ( rule__Package__ElementsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAssignment_4()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2091:1: ( rule__Package__ElementsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20||(LA19_0>=23 && LA19_0<=24)||LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2091:2: rule__Package__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Package__ElementsAssignment_4_in_rule__Package__Group__4__Impl4475);
            	    rule__Package__ElementsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsAssignment_4()); 
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
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2101:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2105:1: ( rule__Package__Group__5__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2106:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__54506);
            rule__Package__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2112:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2116:1: ( ( '}' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2117:1: ( '}' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2117:1: ( '}' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2118:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Package__Group__5__Impl4534); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2143:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2147:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2148:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__04577);
            rule__DataType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__04580);
            rule__DataType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2155:1: rule__DataType__Group__0__Impl : ( ( rule__DataType__AnnotationsAssignment_0 )* ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2159:1: ( ( ( rule__DataType__AnnotationsAssignment_0 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2160:1: ( ( rule__DataType__AnnotationsAssignment_0 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2160:1: ( ( rule__DataType__AnnotationsAssignment_0 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2161:1: ( rule__DataType__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2162:1: ( rule__DataType__AnnotationsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2162:2: rule__DataType__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DataType__AnnotationsAssignment_0_in_rule__DataType__Group__0__Impl4607);
            	    rule__DataType__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_0()); 
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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2172:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2176:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2177:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__14638);
            rule__DataType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__14641);
            rule__DataType__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2184:1: rule__DataType__Group__1__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2188:1: ( ( 'datatype' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2189:1: ( 'datatype' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2189:1: ( 'datatype' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2190:1: 'datatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__DataType__Group__1__Impl4669); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_1()); 
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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2203:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2207:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2208:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24700);
            rule__DataType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24703);
            rule__DataType__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2215:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__NameAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2219:1: ( ( ( rule__DataType__NameAssignment_2 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2220:1: ( ( rule__DataType__NameAssignment_2 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2220:1: ( ( rule__DataType__NameAssignment_2 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2221:1: ( rule__DataType__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getNameAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2222:1: ( rule__DataType__NameAssignment_2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2222:2: rule__DataType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl4730);
            rule__DataType__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2232:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2236:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2237:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34760);
            rule__DataType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34763);
            rule__DataType__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2244:1: rule__DataType__Group__3__Impl : ( '{' ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2248:1: ( ( '{' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2249:1: ( '{' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2249:1: ( '{' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2250:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__DataType__Group__3__Impl4791); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2263:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2267:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2268:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44822);
            rule__DataType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__44825);
            rule__DataType__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataType__Group__4"


    // $ANTLR start "rule__DataType__Group__4__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2275:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__FormatedFieldsAssignment_4 )* ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2279:1: ( ( ( rule__DataType__FormatedFieldsAssignment_4 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2280:1: ( ( rule__DataType__FormatedFieldsAssignment_4 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2280:1: ( ( rule__DataType__FormatedFieldsAssignment_4 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2281:1: ( rule__DataType__FormatedFieldsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getFormatedFieldsAssignment_4()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2282:1: ( rule__DataType__FormatedFieldsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=40 && LA21_0<=42)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2282:2: rule__DataType__FormatedFieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DataType__FormatedFieldsAssignment_4_in_rule__DataType__Group__4__Impl4852);
            	    rule__DataType__FormatedFieldsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getFormatedFieldsAssignment_4()); 
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
    // $ANTLR end "rule__DataType__Group__4__Impl"


    // $ANTLR start "rule__DataType__Group__5"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2292:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2296:1: ( rule__DataType__Group__5__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2297:2: rule__DataType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__54883);
            rule__DataType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataType__Group__5"


    // $ANTLR start "rule__DataType__Group__5__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2303:1: rule__DataType__Group__5__Impl : ( '}' ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2307:1: ( ( '}' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2308:1: ( '}' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2308:1: ( '}' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2309:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__DataType__Group__5__Impl4911); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__DataType__Group__5__Impl"


    // $ANTLR start "rule__DataTypeField__Group_0__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2334:1: rule__DataTypeField__Group_0__0 : rule__DataTypeField__Group_0__0__Impl rule__DataTypeField__Group_0__1 ;
    public final void rule__DataTypeField__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2338:1: ( rule__DataTypeField__Group_0__0__Impl rule__DataTypeField__Group_0__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2339:2: rule__DataTypeField__Group_0__0__Impl rule__DataTypeField__Group_0__1
            {
            pushFollow(FOLLOW_rule__DataTypeField__Group_0__0__Impl_in_rule__DataTypeField__Group_0__04954);
            rule__DataTypeField__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DataTypeField__Group_0__1_in_rule__DataTypeField__Group_0__04957);
            rule__DataTypeField__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataTypeField__Group_0__0"


    // $ANTLR start "rule__DataTypeField__Group_0__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2346:1: rule__DataTypeField__Group_0__0__Impl : ( ( rule__DataTypeField__PatternAssignment_0_0 ) ) ;
    public final void rule__DataTypeField__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2350:1: ( ( ( rule__DataTypeField__PatternAssignment_0_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2351:1: ( ( rule__DataTypeField__PatternAssignment_0_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2351:1: ( ( rule__DataTypeField__PatternAssignment_0_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2352:1: ( rule__DataTypeField__PatternAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldAccess().getPatternAssignment_0_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2353:1: ( rule__DataTypeField__PatternAssignment_0_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2353:2: rule__DataTypeField__PatternAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DataTypeField__PatternAssignment_0_0_in_rule__DataTypeField__Group_0__0__Impl4984);
            rule__DataTypeField__PatternAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldAccess().getPatternAssignment_0_0()); 
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
    // $ANTLR end "rule__DataTypeField__Group_0__0__Impl"


    // $ANTLR start "rule__DataTypeField__Group_0__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2363:1: rule__DataTypeField__Group_0__1 : rule__DataTypeField__Group_0__1__Impl ;
    public final void rule__DataTypeField__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2367:1: ( rule__DataTypeField__Group_0__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2368:2: rule__DataTypeField__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DataTypeField__Group_0__1__Impl_in_rule__DataTypeField__Group_0__15014);
            rule__DataTypeField__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DataTypeField__Group_0__1"


    // $ANTLR start "rule__DataTypeField__Group_0__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2374:1: rule__DataTypeField__Group_0__1__Impl : ( ( rule__DataTypeField__FormatAssignment_0_1 ) ) ;
    public final void rule__DataTypeField__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2378:1: ( ( ( rule__DataTypeField__FormatAssignment_0_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2379:1: ( ( rule__DataTypeField__FormatAssignment_0_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2379:1: ( ( rule__DataTypeField__FormatAssignment_0_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2380:1: ( rule__DataTypeField__FormatAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldAccess().getFormatAssignment_0_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2381:1: ( rule__DataTypeField__FormatAssignment_0_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2381:2: rule__DataTypeField__FormatAssignment_0_1
            {
            pushFollow(FOLLOW_rule__DataTypeField__FormatAssignment_0_1_in_rule__DataTypeField__Group_0__1__Impl5041);
            rule__DataTypeField__FormatAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldAccess().getFormatAssignment_0_1()); 
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
    // $ANTLR end "rule__DataTypeField__Group_0__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2395:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2399:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2400:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__05075);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__05078);
            rule__Entity__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2407:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__AnnotationsAssignment_0 )* ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2411:1: ( ( ( rule__Entity__AnnotationsAssignment_0 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2412:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2412:1: ( ( rule__Entity__AnnotationsAssignment_0 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2413:1: ( rule__Entity__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2414:1: ( rule__Entity__AnnotationsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2414:2: rule__Entity__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AnnotationsAssignment_0_in_rule__Entity__Group__0__Impl5105);
            	    rule__Entity__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAnnotationsAssignment_0()); 
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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2424:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2428:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2429:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__15136);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__15139);
            rule__Entity__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2436:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2440:1: ( ( 'entity' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2441:1: ( 'entity' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2441:1: ( 'entity' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2442:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__Entity__Group__1__Impl5167); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2455:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2459:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2460:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__25198);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__25201);
            rule__Entity__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2467:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2471:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2472:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2472:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2473:1: ( rule__Entity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2474:1: ( rule__Entity__NameAssignment_2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2474:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl5228);
            rule__Entity__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2484:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2488:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2489:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__35258);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__35261);
            rule__Entity__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2496:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2500:1: ( ( '{' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2501:1: ( '{' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2501:1: ( '{' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2502:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Entity__Group__3__Impl5289); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2515:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2519:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2520:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__45320);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__45323);
            rule__Entity__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2527:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__ParentAssignment_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2531:1: ( ( ( rule__Entity__ParentAssignment_4 )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2532:1: ( ( rule__Entity__ParentAssignment_4 )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2532:1: ( ( rule__Entity__ParentAssignment_4 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2533:1: ( rule__Entity__ParentAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getParentAssignment_4()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2534:1: ( rule__Entity__ParentAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2534:2: rule__Entity__ParentAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Entity__ParentAssignment_4_in_rule__Entity__Group__4__Impl5350);
                    rule__Entity__ParentAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getParentAssignment_4()); 
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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2544:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2548:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2549:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__55381);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__55384);
            rule__Entity__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2556:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__ElementsAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2560:1: ( ( ( rule__Entity__ElementsAssignment_5 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2561:1: ( ( rule__Entity__ElementsAssignment_5 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2561:1: ( ( rule__Entity__ElementsAssignment_5 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2562:1: ( rule__Entity__ElementsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getElementsAssignment_5()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2563:1: ( rule__Entity__ElementsAssignment_5 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2563:2: rule__Entity__ElementsAssignment_5
            {
            pushFollow(FOLLOW_rule__Entity__ElementsAssignment_5_in_rule__Entity__Group__5__Impl5411);
            rule__Entity__ElementsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getElementsAssignment_5()); 
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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2573:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2577:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2578:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__65441);
            rule__Entity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__65444);
            rule__Entity__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2585:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__GroupsAssignment_6 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2589:1: ( ( ( rule__Entity__GroupsAssignment_6 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2590:1: ( ( rule__Entity__GroupsAssignment_6 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2590:1: ( ( rule__Entity__GroupsAssignment_6 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2591:1: ( rule__Entity__GroupsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroupsAssignment_6()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2592:1: ( rule__Entity__GroupsAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2592:2: rule__Entity__GroupsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Entity__GroupsAssignment_6_in_rule__Entity__Group__6__Impl5471);
            	    rule__Entity__GroupsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroupsAssignment_6()); 
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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2602:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2606:1: ( rule__Entity__Group__7__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2607:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__75502);
            rule__Entity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2613:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2617:1: ( ( '}' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2618:1: ( '}' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2618:1: ( '}' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2619:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,22,FOLLOW_22_in_rule__Entity__Group__7__Impl5530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__EntityGroup__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2648:1: rule__EntityGroup__Group__0 : rule__EntityGroup__Group__0__Impl rule__EntityGroup__Group__1 ;
    public final void rule__EntityGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2652:1: ( rule__EntityGroup__Group__0__Impl rule__EntityGroup__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2653:2: rule__EntityGroup__Group__0__Impl rule__EntityGroup__Group__1
            {
            pushFollow(FOLLOW_rule__EntityGroup__Group__0__Impl_in_rule__EntityGroup__Group__05577);
            rule__EntityGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityGroup__Group__1_in_rule__EntityGroup__Group__05580);
            rule__EntityGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityGroup__Group__0"


    // $ANTLR start "rule__EntityGroup__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2660:1: rule__EntityGroup__Group__0__Impl : ( 'group' ) ;
    public final void rule__EntityGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2664:1: ( ( 'group' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2665:1: ( 'group' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2665:1: ( 'group' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2666:1: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getGroupKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__EntityGroup__Group__0__Impl5608); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getGroupKeyword_0()); 
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
    // $ANTLR end "rule__EntityGroup__Group__0__Impl"


    // $ANTLR start "rule__EntityGroup__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2679:1: rule__EntityGroup__Group__1 : rule__EntityGroup__Group__1__Impl rule__EntityGroup__Group__2 ;
    public final void rule__EntityGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2683:1: ( rule__EntityGroup__Group__1__Impl rule__EntityGroup__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2684:2: rule__EntityGroup__Group__1__Impl rule__EntityGroup__Group__2
            {
            pushFollow(FOLLOW_rule__EntityGroup__Group__1__Impl_in_rule__EntityGroup__Group__15639);
            rule__EntityGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityGroup__Group__2_in_rule__EntityGroup__Group__15642);
            rule__EntityGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityGroup__Group__1"


    // $ANTLR start "rule__EntityGroup__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2691:1: rule__EntityGroup__Group__1__Impl : ( ( rule__EntityGroup__NameAssignment_1 ) ) ;
    public final void rule__EntityGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2695:1: ( ( ( rule__EntityGroup__NameAssignment_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2696:1: ( ( rule__EntityGroup__NameAssignment_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2696:1: ( ( rule__EntityGroup__NameAssignment_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2697:1: ( rule__EntityGroup__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getNameAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2698:1: ( rule__EntityGroup__NameAssignment_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2698:2: rule__EntityGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityGroup__NameAssignment_1_in_rule__EntityGroup__Group__1__Impl5669);
            rule__EntityGroup__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EntityGroup__Group__1__Impl"


    // $ANTLR start "rule__EntityGroup__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2708:1: rule__EntityGroup__Group__2 : rule__EntityGroup__Group__2__Impl rule__EntityGroup__Group__3 ;
    public final void rule__EntityGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2712:1: ( rule__EntityGroup__Group__2__Impl rule__EntityGroup__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2713:2: rule__EntityGroup__Group__2__Impl rule__EntityGroup__Group__3
            {
            pushFollow(FOLLOW_rule__EntityGroup__Group__2__Impl_in_rule__EntityGroup__Group__25699);
            rule__EntityGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityGroup__Group__3_in_rule__EntityGroup__Group__25702);
            rule__EntityGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityGroup__Group__2"


    // $ANTLR start "rule__EntityGroup__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2720:1: rule__EntityGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__EntityGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2724:1: ( ( '{' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2725:1: ( '{' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2725:1: ( '{' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2726:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__EntityGroup__Group__2__Impl5730); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__EntityGroup__Group__2__Impl"


    // $ANTLR start "rule__EntityGroup__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2739:1: rule__EntityGroup__Group__3 : rule__EntityGroup__Group__3__Impl rule__EntityGroup__Group__4 ;
    public final void rule__EntityGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2743:1: ( rule__EntityGroup__Group__3__Impl rule__EntityGroup__Group__4 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2744:2: rule__EntityGroup__Group__3__Impl rule__EntityGroup__Group__4
            {
            pushFollow(FOLLOW_rule__EntityGroup__Group__3__Impl_in_rule__EntityGroup__Group__35761);
            rule__EntityGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityGroup__Group__4_in_rule__EntityGroup__Group__35764);
            rule__EntityGroup__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityGroup__Group__3"


    // $ANTLR start "rule__EntityGroup__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2751:1: rule__EntityGroup__Group__3__Impl : ( ( rule__EntityGroup__ElementsAssignment_3 ) ) ;
    public final void rule__EntityGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2755:1: ( ( ( rule__EntityGroup__ElementsAssignment_3 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2756:1: ( ( rule__EntityGroup__ElementsAssignment_3 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2756:1: ( ( rule__EntityGroup__ElementsAssignment_3 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2757:1: ( rule__EntityGroup__ElementsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getElementsAssignment_3()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2758:1: ( rule__EntityGroup__ElementsAssignment_3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2758:2: rule__EntityGroup__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__EntityGroup__ElementsAssignment_3_in_rule__EntityGroup__Group__3__Impl5791);
            rule__EntityGroup__ElementsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getElementsAssignment_3()); 
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
    // $ANTLR end "rule__EntityGroup__Group__3__Impl"


    // $ANTLR start "rule__EntityGroup__Group__4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2768:1: rule__EntityGroup__Group__4 : rule__EntityGroup__Group__4__Impl ;
    public final void rule__EntityGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2772:1: ( rule__EntityGroup__Group__4__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2773:2: rule__EntityGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EntityGroup__Group__4__Impl_in_rule__EntityGroup__Group__45821);
            rule__EntityGroup__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityGroup__Group__4"


    // $ANTLR start "rule__EntityGroup__Group__4__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2779:1: rule__EntityGroup__Group__4__Impl : ( '}' ) ;
    public final void rule__EntityGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2783:1: ( ( '}' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2784:1: ( '}' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2784:1: ( '}' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2785:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__EntityGroup__Group__4__Impl5849); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__EntityGroup__Group__4__Impl"


    // $ANTLR start "rule__EntityElements__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2808:1: rule__EntityElements__Group__0 : rule__EntityElements__Group__0__Impl rule__EntityElements__Group__1 ;
    public final void rule__EntityElements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2812:1: ( rule__EntityElements__Group__0__Impl rule__EntityElements__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2813:2: rule__EntityElements__Group__0__Impl rule__EntityElements__Group__1
            {
            pushFollow(FOLLOW_rule__EntityElements__Group__0__Impl_in_rule__EntityElements__Group__05890);
            rule__EntityElements__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityElements__Group__1_in_rule__EntityElements__Group__05893);
            rule__EntityElements__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityElements__Group__0"


    // $ANTLR start "rule__EntityElements__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2820:1: rule__EntityElements__Group__0__Impl : ( () ) ;
    public final void rule__EntityElements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2824:1: ( ( () ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2825:1: ( () )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2825:1: ( () )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2826:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsAccess().getEntityElementsAction_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2827:1: ()
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2829:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsAccess().getEntityElementsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityElements__Group__0__Impl"


    // $ANTLR start "rule__EntityElements__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2839:1: rule__EntityElements__Group__1 : rule__EntityElements__Group__1__Impl ;
    public final void rule__EntityElements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2843:1: ( rule__EntityElements__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2844:2: rule__EntityElements__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EntityElements__Group__1__Impl_in_rule__EntityElements__Group__15951);
            rule__EntityElements__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityElements__Group__1"


    // $ANTLR start "rule__EntityElements__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2850:1: rule__EntityElements__Group__1__Impl : ( ( rule__EntityElements__UnorderedGroup_1 ) ) ;
    public final void rule__EntityElements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2854:1: ( ( ( rule__EntityElements__UnorderedGroup_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2855:1: ( ( rule__EntityElements__UnorderedGroup_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2855:1: ( ( rule__EntityElements__UnorderedGroup_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2856:1: ( rule__EntityElements__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2857:1: ( rule__EntityElements__UnorderedGroup_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2857:2: rule__EntityElements__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1_in_rule__EntityElements__Group__1__Impl5978);
            rule__EntityElements__UnorderedGroup_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1()); 
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
    // $ANTLR end "rule__EntityElements__Group__1__Impl"


    // $ANTLR start "rule__Parent__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2871:1: rule__Parent__Group__0 : rule__Parent__Group__0__Impl rule__Parent__Group__1 ;
    public final void rule__Parent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2875:1: ( rule__Parent__Group__0__Impl rule__Parent__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2876:2: rule__Parent__Group__0__Impl rule__Parent__Group__1
            {
            pushFollow(FOLLOW_rule__Parent__Group__0__Impl_in_rule__Parent__Group__06012);
            rule__Parent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parent__Group__1_in_rule__Parent__Group__06015);
            rule__Parent__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parent__Group__0"


    // $ANTLR start "rule__Parent__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2883:1: rule__Parent__Group__0__Impl : ( ':parent->' ) ;
    public final void rule__Parent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2887:1: ( ( ':parent->' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2888:1: ( ':parent->' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2888:1: ( ':parent->' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2889:1: ':parent->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentAccess().getParentKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Parent__Group__0__Impl6043); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentAccess().getParentKeyword_0()); 
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
    // $ANTLR end "rule__Parent__Group__0__Impl"


    // $ANTLR start "rule__Parent__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2902:1: rule__Parent__Group__1 : rule__Parent__Group__1__Impl rule__Parent__Group__2 ;
    public final void rule__Parent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2906:1: ( rule__Parent__Group__1__Impl rule__Parent__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2907:2: rule__Parent__Group__1__Impl rule__Parent__Group__2
            {
            pushFollow(FOLLOW_rule__Parent__Group__1__Impl_in_rule__Parent__Group__16074);
            rule__Parent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parent__Group__2_in_rule__Parent__Group__16077);
            rule__Parent__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parent__Group__1"


    // $ANTLR start "rule__Parent__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2914:1: rule__Parent__Group__1__Impl : ( ( rule__Parent__TypeAssignment_1 ) ) ;
    public final void rule__Parent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2918:1: ( ( ( rule__Parent__TypeAssignment_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2919:1: ( ( rule__Parent__TypeAssignment_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2919:1: ( ( rule__Parent__TypeAssignment_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2920:1: ( rule__Parent__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentAccess().getTypeAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2921:1: ( rule__Parent__TypeAssignment_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2921:2: rule__Parent__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parent__TypeAssignment_1_in_rule__Parent__Group__1__Impl6104);
            rule__Parent__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Parent__Group__1__Impl"


    // $ANTLR start "rule__Parent__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2931:1: rule__Parent__Group__2 : rule__Parent__Group__2__Impl ;
    public final void rule__Parent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2935:1: ( rule__Parent__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2936:2: rule__Parent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parent__Group__2__Impl_in_rule__Parent__Group__26134);
            rule__Parent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parent__Group__2"


    // $ANTLR start "rule__Parent__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2942:1: rule__Parent__Group__2__Impl : ( ( rule__Parent__AnnotationsAssignment_2 )* ) ;
    public final void rule__Parent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2946:1: ( ( ( rule__Parent__AnnotationsAssignment_2 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2947:1: ( ( rule__Parent__AnnotationsAssignment_2 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2947:1: ( ( rule__Parent__AnnotationsAssignment_2 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2948:1: ( rule__Parent__AnnotationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentAccess().getAnnotationsAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2949:1: ( rule__Parent__AnnotationsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2949:2: rule__Parent__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Parent__AnnotationsAssignment_2_in_rule__Parent__Group__2__Impl6161);
            	    rule__Parent__AnnotationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentAccess().getAnnotationsAssignment_2()); 
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
    // $ANTLR end "rule__Parent__Group__2__Impl"


    // $ANTLR start "rule__Child__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2965:1: rule__Child__Group__0 : rule__Child__Group__0__Impl rule__Child__Group__1 ;
    public final void rule__Child__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2969:1: ( rule__Child__Group__0__Impl rule__Child__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2970:2: rule__Child__Group__0__Impl rule__Child__Group__1
            {
            pushFollow(FOLLOW_rule__Child__Group__0__Impl_in_rule__Child__Group__06198);
            rule__Child__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Child__Group__1_in_rule__Child__Group__06201);
            rule__Child__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Child__Group__0"


    // $ANTLR start "rule__Child__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2977:1: rule__Child__Group__0__Impl : ( ':childs-<' ) ;
    public final void rule__Child__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2981:1: ( ( ':childs-<' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2982:1: ( ':childs-<' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2982:1: ( ':childs-<' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2983:1: ':childs-<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildAccess().getChildsKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Child__Group__0__Impl6229); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildAccess().getChildsKeyword_0()); 
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
    // $ANTLR end "rule__Child__Group__0__Impl"


    // $ANTLR start "rule__Child__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:2996:1: rule__Child__Group__1 : rule__Child__Group__1__Impl rule__Child__Group__2 ;
    public final void rule__Child__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3000:1: ( rule__Child__Group__1__Impl rule__Child__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3001:2: rule__Child__Group__1__Impl rule__Child__Group__2
            {
            pushFollow(FOLLOW_rule__Child__Group__1__Impl_in_rule__Child__Group__16260);
            rule__Child__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Child__Group__2_in_rule__Child__Group__16263);
            rule__Child__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Child__Group__1"


    // $ANTLR start "rule__Child__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3008:1: rule__Child__Group__1__Impl : ( ( rule__Child__TypeAssignment_1 ) ) ;
    public final void rule__Child__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3012:1: ( ( ( rule__Child__TypeAssignment_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3013:1: ( ( rule__Child__TypeAssignment_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3013:1: ( ( rule__Child__TypeAssignment_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3014:1: ( rule__Child__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildAccess().getTypeAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3015:1: ( rule__Child__TypeAssignment_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3015:2: rule__Child__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Child__TypeAssignment_1_in_rule__Child__Group__1__Impl6290);
            rule__Child__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Child__Group__1__Impl"


    // $ANTLR start "rule__Child__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3025:1: rule__Child__Group__2 : rule__Child__Group__2__Impl ;
    public final void rule__Child__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3029:1: ( rule__Child__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3030:2: rule__Child__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Child__Group__2__Impl_in_rule__Child__Group__26320);
            rule__Child__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Child__Group__2"


    // $ANTLR start "rule__Child__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3036:1: rule__Child__Group__2__Impl : ( ( rule__Child__AnnotationsAssignment_2 )* ) ;
    public final void rule__Child__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3040:1: ( ( ( rule__Child__AnnotationsAssignment_2 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3041:1: ( ( rule__Child__AnnotationsAssignment_2 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3041:1: ( ( rule__Child__AnnotationsAssignment_2 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3042:1: ( rule__Child__AnnotationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildAccess().getAnnotationsAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3043:1: ( rule__Child__AnnotationsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3043:2: rule__Child__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Child__AnnotationsAssignment_2_in_rule__Child__Group__2__Impl6347);
            	    rule__Child__AnnotationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildAccess().getAnnotationsAssignment_2()); 
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
    // $ANTLR end "rule__Child__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3059:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3063:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3064:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06384);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06387);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3071:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3075:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3076:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3076:1: ( ( rule__Property__NameAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3077:1: ( rule__Property__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3078:1: ( rule__Property__NameAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3078:2: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__0__Impl6414);
            rule__Property__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3088:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3092:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3093:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__16444);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16447);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3100:1: rule__Property__Group__1__Impl : ( ( rule__Property__OptionalAssignment_1 )? ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3104:1: ( ( ( rule__Property__OptionalAssignment_1 )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3105:1: ( ( rule__Property__OptionalAssignment_1 )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3105:1: ( ( rule__Property__OptionalAssignment_1 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3106:1: ( rule__Property__OptionalAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getOptionalAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3107:1: ( rule__Property__OptionalAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3107:2: rule__Property__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Property__OptionalAssignment_1_in_rule__Property__Group__1__Impl6474);
                    rule__Property__OptionalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getOptionalAssignment_1()); 
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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3117:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3121:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3122:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__26505);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26508);
            rule__Property__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3129:1: rule__Property__Group__2__Impl : ( ':' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3133:1: ( ( ':' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3134:1: ( ':' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3134:1: ( ':' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3135:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__Property__Group__2__Impl6536); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3148:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3152:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3153:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__36567);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36570);
            rule__Property__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3160:1: rule__Property__Group__3__Impl : ( ( rule__Property__TypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3164:1: ( ( ( rule__Property__TypeAssignment_3 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3165:1: ( ( rule__Property__TypeAssignment_3 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3165:1: ( ( rule__Property__TypeAssignment_3 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3166:1: ( rule__Property__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3167:1: ( rule__Property__TypeAssignment_3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3167:2: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__3__Impl6597);
            rule__Property__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3177:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3181:1: ( rule__Property__Group__4__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3182:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__46627);
            rule__Property__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3188:1: rule__Property__Group__4__Impl : ( ( rule__Property__AnnotationsAssignment_4 )* ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3192:1: ( ( ( rule__Property__AnnotationsAssignment_4 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3193:1: ( ( rule__Property__AnnotationsAssignment_4 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3193:1: ( ( rule__Property__AnnotationsAssignment_4 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3194:1: ( rule__Property__AnnotationsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAnnotationsAssignment_4()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3195:1: ( rule__Property__AnnotationsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3195:2: rule__Property__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Property__AnnotationsAssignment_4_in_rule__Property__Group__4__Impl6654);
            	    rule__Property__AnnotationsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAnnotationsAssignment_4()); 
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
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3215:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3219:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3220:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__06695);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__06698);
            rule__Reference__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3227:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__NameAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3231:1: ( ( ( rule__Reference__NameAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3232:1: ( ( rule__Reference__NameAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3232:1: ( ( rule__Reference__NameAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3233:1: ( rule__Reference__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getNameAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3234:1: ( rule__Reference__NameAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3234:2: rule__Reference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_0_in_rule__Reference__Group__0__Impl6725);
            rule__Reference__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3244:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3248:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3249:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__16755);
            rule__Reference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__16758);
            rule__Reference__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3256:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__OptionalAssignment_1 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3260:1: ( ( ( rule__Reference__OptionalAssignment_1 )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3261:1: ( ( rule__Reference__OptionalAssignment_1 )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3261:1: ( ( rule__Reference__OptionalAssignment_1 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3262:1: ( rule__Reference__OptionalAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getOptionalAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3263:1: ( rule__Reference__OptionalAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3263:2: rule__Reference__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Reference__OptionalAssignment_1_in_rule__Reference__Group__1__Impl6785);
                    rule__Reference__OptionalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getOptionalAssignment_1()); 
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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3273:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3277:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3278:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__26816);
            rule__Reference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__26819);
            rule__Reference__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3285:1: rule__Reference__Group__2__Impl : ( '-->' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3289:1: ( ( '-->' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3290:1: ( '-->' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3290:1: ( '-->' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3291:1: '-->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Reference__Group__2__Impl6847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3304:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3308:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3309:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__36878);
            rule__Reference__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__36881);
            rule__Reference__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3316:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__EntityAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3320:1: ( ( ( rule__Reference__EntityAssignment_3 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3321:1: ( ( rule__Reference__EntityAssignment_3 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3321:1: ( ( rule__Reference__EntityAssignment_3 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3322:1: ( rule__Reference__EntityAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getEntityAssignment_3()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3323:1: ( rule__Reference__EntityAssignment_3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3323:2: rule__Reference__EntityAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__EntityAssignment_3_in_rule__Reference__Group__3__Impl6908);
            rule__Reference__EntityAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getEntityAssignment_3()); 
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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3333:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3337:1: ( rule__Reference__Group__4__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3338:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__46938);
            rule__Reference__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3344:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__AnnotationsAssignment_4 )* ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3348:1: ( ( ( rule__Reference__AnnotationsAssignment_4 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3349:1: ( ( rule__Reference__AnnotationsAssignment_4 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3349:1: ( ( rule__Reference__AnnotationsAssignment_4 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3350:1: ( rule__Reference__AnnotationsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAnnotationsAssignment_4()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3351:1: ( rule__Reference__AnnotationsAssignment_4 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3351:2: rule__Reference__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Reference__AnnotationsAssignment_4_in_rule__Reference__Group__4__Impl6965);
            	    rule__Reference__AnnotationsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAnnotationsAssignment_4()); 
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
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__ReferenceList__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3371:1: rule__ReferenceList__Group__0 : rule__ReferenceList__Group__0__Impl rule__ReferenceList__Group__1 ;
    public final void rule__ReferenceList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3375:1: ( rule__ReferenceList__Group__0__Impl rule__ReferenceList__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3376:2: rule__ReferenceList__Group__0__Impl rule__ReferenceList__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group__0__Impl_in_rule__ReferenceList__Group__07006);
            rule__ReferenceList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceList__Group__1_in_rule__ReferenceList__Group__07009);
            rule__ReferenceList__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceList__Group__0"


    // $ANTLR start "rule__ReferenceList__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3383:1: rule__ReferenceList__Group__0__Impl : ( ( rule__ReferenceList__NameAssignment_0 ) ) ;
    public final void rule__ReferenceList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3387:1: ( ( ( rule__ReferenceList__NameAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3388:1: ( ( rule__ReferenceList__NameAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3388:1: ( ( rule__ReferenceList__NameAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3389:1: ( rule__ReferenceList__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getNameAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3390:1: ( rule__ReferenceList__NameAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3390:2: rule__ReferenceList__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceList__NameAssignment_0_in_rule__ReferenceList__Group__0__Impl7036);
            rule__ReferenceList__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__ReferenceList__Group__0__Impl"


    // $ANTLR start "rule__ReferenceList__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3400:1: rule__ReferenceList__Group__1 : rule__ReferenceList__Group__1__Impl rule__ReferenceList__Group__2 ;
    public final void rule__ReferenceList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3404:1: ( rule__ReferenceList__Group__1__Impl rule__ReferenceList__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3405:2: rule__ReferenceList__Group__1__Impl rule__ReferenceList__Group__2
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group__1__Impl_in_rule__ReferenceList__Group__17066);
            rule__ReferenceList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceList__Group__2_in_rule__ReferenceList__Group__17069);
            rule__ReferenceList__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceList__Group__1"


    // $ANTLR start "rule__ReferenceList__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3412:1: rule__ReferenceList__Group__1__Impl : ( ( rule__ReferenceList__Alternatives_1 ) ) ;
    public final void rule__ReferenceList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3416:1: ( ( ( rule__ReferenceList__Alternatives_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3417:1: ( ( rule__ReferenceList__Alternatives_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3417:1: ( ( rule__ReferenceList__Alternatives_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3418:1: ( rule__ReferenceList__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getAlternatives_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3419:1: ( rule__ReferenceList__Alternatives_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3419:2: rule__ReferenceList__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ReferenceList__Alternatives_1_in_rule__ReferenceList__Group__1__Impl7096);
            rule__ReferenceList__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__ReferenceList__Group__1__Impl"


    // $ANTLR start "rule__ReferenceList__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3429:1: rule__ReferenceList__Group__2 : rule__ReferenceList__Group__2__Impl rule__ReferenceList__Group__3 ;
    public final void rule__ReferenceList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3433:1: ( rule__ReferenceList__Group__2__Impl rule__ReferenceList__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3434:2: rule__ReferenceList__Group__2__Impl rule__ReferenceList__Group__3
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group__2__Impl_in_rule__ReferenceList__Group__27126);
            rule__ReferenceList__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceList__Group__3_in_rule__ReferenceList__Group__27129);
            rule__ReferenceList__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceList__Group__2"


    // $ANTLR start "rule__ReferenceList__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3441:1: rule__ReferenceList__Group__2__Impl : ( ( rule__ReferenceList__EntityAssignment_2 ) ) ;
    public final void rule__ReferenceList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3445:1: ( ( ( rule__ReferenceList__EntityAssignment_2 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3446:1: ( ( rule__ReferenceList__EntityAssignment_2 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3446:1: ( ( rule__ReferenceList__EntityAssignment_2 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3447:1: ( rule__ReferenceList__EntityAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getEntityAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3448:1: ( rule__ReferenceList__EntityAssignment_2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3448:2: rule__ReferenceList__EntityAssignment_2
            {
            pushFollow(FOLLOW_rule__ReferenceList__EntityAssignment_2_in_rule__ReferenceList__Group__2__Impl7156);
            rule__ReferenceList__EntityAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getEntityAssignment_2()); 
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
    // $ANTLR end "rule__ReferenceList__Group__2__Impl"


    // $ANTLR start "rule__ReferenceList__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3458:1: rule__ReferenceList__Group__3 : rule__ReferenceList__Group__3__Impl ;
    public final void rule__ReferenceList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3462:1: ( rule__ReferenceList__Group__3__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3463:2: rule__ReferenceList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group__3__Impl_in_rule__ReferenceList__Group__37186);
            rule__ReferenceList__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceList__Group__3"


    // $ANTLR start "rule__ReferenceList__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3469:1: rule__ReferenceList__Group__3__Impl : ( ( rule__ReferenceList__AnnotationsAssignment_3 )* ) ;
    public final void rule__ReferenceList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3473:1: ( ( ( rule__ReferenceList__AnnotationsAssignment_3 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3474:1: ( ( rule__ReferenceList__AnnotationsAssignment_3 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3474:1: ( ( rule__ReferenceList__AnnotationsAssignment_3 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3475:1: ( rule__ReferenceList__AnnotationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getAnnotationsAssignment_3()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3476:1: ( rule__ReferenceList__AnnotationsAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3476:2: rule__ReferenceList__AnnotationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ReferenceList__AnnotationsAssignment_3_in_rule__ReferenceList__Group__3__Impl7213);
            	    rule__ReferenceList__AnnotationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getAnnotationsAssignment_3()); 
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
    // $ANTLR end "rule__ReferenceList__Group__3__Impl"


    // $ANTLR start "rule__ReferenceList__Group_1_0__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3494:1: rule__ReferenceList__Group_1_0__0 : rule__ReferenceList__Group_1_0__0__Impl rule__ReferenceList__Group_1_0__1 ;
    public final void rule__ReferenceList__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3498:1: ( rule__ReferenceList__Group_1_0__0__Impl rule__ReferenceList__Group_1_0__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3499:2: rule__ReferenceList__Group_1_0__0__Impl rule__ReferenceList__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group_1_0__0__Impl_in_rule__ReferenceList__Group_1_0__07252);
            rule__ReferenceList__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceList__Group_1_0__1_in_rule__ReferenceList__Group_1_0__07255);
            rule__ReferenceList__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceList__Group_1_0__0"


    // $ANTLR start "rule__ReferenceList__Group_1_0__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3506:1: rule__ReferenceList__Group_1_0__0__Impl : ( '-' ) ;
    public final void rule__ReferenceList__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3510:1: ( ( '-' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3511:1: ( '-' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3511:1: ( '-' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3512:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getHyphenMinusKeyword_1_0_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ReferenceList__Group_1_0__0__Impl7283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getHyphenMinusKeyword_1_0_0()); 
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
    // $ANTLR end "rule__ReferenceList__Group_1_0__0__Impl"


    // $ANTLR start "rule__ReferenceList__Group_1_0__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3525:1: rule__ReferenceList__Group_1_0__1 : rule__ReferenceList__Group_1_0__1__Impl rule__ReferenceList__Group_1_0__2 ;
    public final void rule__ReferenceList__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3529:1: ( rule__ReferenceList__Group_1_0__1__Impl rule__ReferenceList__Group_1_0__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3530:2: rule__ReferenceList__Group_1_0__1__Impl rule__ReferenceList__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group_1_0__1__Impl_in_rule__ReferenceList__Group_1_0__17314);
            rule__ReferenceList__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceList__Group_1_0__2_in_rule__ReferenceList__Group_1_0__17317);
            rule__ReferenceList__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceList__Group_1_0__1"


    // $ANTLR start "rule__ReferenceList__Group_1_0__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3537:1: rule__ReferenceList__Group_1_0__1__Impl : ( ( rule__ReferenceList__ReferenceAssignment_1_0_1 ) ) ;
    public final void rule__ReferenceList__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3541:1: ( ( ( rule__ReferenceList__ReferenceAssignment_1_0_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3542:1: ( ( rule__ReferenceList__ReferenceAssignment_1_0_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3542:1: ( ( rule__ReferenceList__ReferenceAssignment_1_0_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3543:1: ( rule__ReferenceList__ReferenceAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getReferenceAssignment_1_0_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3544:1: ( rule__ReferenceList__ReferenceAssignment_1_0_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3544:2: rule__ReferenceList__ReferenceAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ReferenceList__ReferenceAssignment_1_0_1_in_rule__ReferenceList__Group_1_0__1__Impl7344);
            rule__ReferenceList__ReferenceAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getReferenceAssignment_1_0_1()); 
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
    // $ANTLR end "rule__ReferenceList__Group_1_0__1__Impl"


    // $ANTLR start "rule__ReferenceList__Group_1_0__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3554:1: rule__ReferenceList__Group_1_0__2 : rule__ReferenceList__Group_1_0__2__Impl ;
    public final void rule__ReferenceList__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3558:1: ( rule__ReferenceList__Group_1_0__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3559:2: rule__ReferenceList__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceList__Group_1_0__2__Impl_in_rule__ReferenceList__Group_1_0__27374);
            rule__ReferenceList__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReferenceList__Group_1_0__2"


    // $ANTLR start "rule__ReferenceList__Group_1_0__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3565:1: rule__ReferenceList__Group_1_0__2__Impl : ( '-<' ) ;
    public final void rule__ReferenceList__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3569:1: ( ( '-<' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3570:1: ( '-<' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3570:1: ( '-<' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3571:1: '-<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getHyphenMinusLessThanSignKeyword_1_0_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ReferenceList__Group_1_0__2__Impl7402); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getHyphenMinusLessThanSignKeyword_1_0_2()); 
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
    // $ANTLR end "rule__ReferenceList__Group_1_0__2__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3590:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3594:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3595:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__07439);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__07442);
            rule__Annotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3602:1: rule__Annotation__Group__0__Impl : ( '[' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3606:1: ( ( '[' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3607:1: ( '[' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3607:1: ( '[' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3608:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Annotation__Group__0__Impl7470); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3621:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3625:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3626:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__17501);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__17504);
            rule__Annotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3633:1: rule__Annotation__Group__1__Impl : ( ( ( rule__Annotation__TypesAssignment_1 ) ) ( ( rule__Annotation__TypesAssignment_1 )* ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3637:1: ( ( ( ( rule__Annotation__TypesAssignment_1 ) ) ( ( rule__Annotation__TypesAssignment_1 )* ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3638:1: ( ( ( rule__Annotation__TypesAssignment_1 ) ) ( ( rule__Annotation__TypesAssignment_1 )* ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3638:1: ( ( ( rule__Annotation__TypesAssignment_1 ) ) ( ( rule__Annotation__TypesAssignment_1 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3639:1: ( ( rule__Annotation__TypesAssignment_1 ) ) ( ( rule__Annotation__TypesAssignment_1 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3639:1: ( ( rule__Annotation__TypesAssignment_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3640:1: ( rule__Annotation__TypesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getTypesAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3641:1: ( rule__Annotation__TypesAssignment_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3641:2: rule__Annotation__TypesAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__TypesAssignment_1_in_rule__Annotation__Group__1__Impl7533);
            rule__Annotation__TypesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getTypesAssignment_1()); 
            }

            }

            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3644:1: ( ( rule__Annotation__TypesAssignment_1 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3645:1: ( rule__Annotation__TypesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getTypesAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3646:1: ( rule__Annotation__TypesAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=44 && LA32_0<=53)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3646:2: rule__Annotation__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__TypesAssignment_1_in_rule__Annotation__Group__1__Impl7545);
            	    rule__Annotation__TypesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getTypesAssignment_1()); 
            }

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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3657:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3661:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3662:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__27578);
            rule__Annotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__27581);
            rule__Annotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3669:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__InstancesAssignment_2 )* ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3673:1: ( ( ( rule__Annotation__InstancesAssignment_2 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3674:1: ( ( rule__Annotation__InstancesAssignment_2 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3674:1: ( ( rule__Annotation__InstancesAssignment_2 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3675:1: ( rule__Annotation__InstancesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getInstancesAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3676:1: ( rule__Annotation__InstancesAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3676:2: rule__Annotation__InstancesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__InstancesAssignment_2_in_rule__Annotation__Group__2__Impl7608);
            	    rule__Annotation__InstancesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getInstancesAssignment_2()); 
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
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3686:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3690:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3691:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__37639);
            rule__Annotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__37642);
            rule__Annotation__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3698:1: rule__Annotation__Group__3__Impl : ( ']' ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3702:1: ( ( ']' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3703:1: ( ']' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3703:1: ( ']' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3704:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__Annotation__Group__3__Impl7670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group__4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3717:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl rule__Annotation__Group__5 ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3721:1: ( rule__Annotation__Group__4__Impl rule__Annotation__Group__5 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3722:2: rule__Annotation__Group__4__Impl rule__Annotation__Group__5
            {
            pushFollow(FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__47701);
            rule__Annotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__5_in_rule__Annotation__Group__47704);
            rule__Annotation__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__4"


    // $ANTLR start "rule__Annotation__Group__4__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3729:1: rule__Annotation__Group__4__Impl : ( 'annotation' ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3733:1: ( ( 'annotation' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3734:1: ( 'annotation' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3734:1: ( 'annotation' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3735:1: 'annotation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAnnotationKeyword_4()); 
            }
            match(input,34,FOLLOW_34_in_rule__Annotation__Group__4__Impl7732); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getAnnotationKeyword_4()); 
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
    // $ANTLR end "rule__Annotation__Group__4__Impl"


    // $ANTLR start "rule__Annotation__Group__5"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3748:1: rule__Annotation__Group__5 : rule__Annotation__Group__5__Impl rule__Annotation__Group__6 ;
    public final void rule__Annotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3752:1: ( rule__Annotation__Group__5__Impl rule__Annotation__Group__6 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3753:2: rule__Annotation__Group__5__Impl rule__Annotation__Group__6
            {
            pushFollow(FOLLOW_rule__Annotation__Group__5__Impl_in_rule__Annotation__Group__57763);
            rule__Annotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__6_in_rule__Annotation__Group__57766);
            rule__Annotation__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__5"


    // $ANTLR start "rule__Annotation__Group__5__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3760:1: rule__Annotation__Group__5__Impl : ( ( rule__Annotation__NameAssignment_5 ) ) ;
    public final void rule__Annotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3764:1: ( ( ( rule__Annotation__NameAssignment_5 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3765:1: ( ( rule__Annotation__NameAssignment_5 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3765:1: ( ( rule__Annotation__NameAssignment_5 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3766:1: ( rule__Annotation__NameAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_5()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3767:1: ( rule__Annotation__NameAssignment_5 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3767:2: rule__Annotation__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_5_in_rule__Annotation__Group__5__Impl7793);
            rule__Annotation__NameAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameAssignment_5()); 
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
    // $ANTLR end "rule__Annotation__Group__5__Impl"


    // $ANTLR start "rule__Annotation__Group__6"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3777:1: rule__Annotation__Group__6 : rule__Annotation__Group__6__Impl rule__Annotation__Group__7 ;
    public final void rule__Annotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3781:1: ( rule__Annotation__Group__6__Impl rule__Annotation__Group__7 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3782:2: rule__Annotation__Group__6__Impl rule__Annotation__Group__7
            {
            pushFollow(FOLLOW_rule__Annotation__Group__6__Impl_in_rule__Annotation__Group__67823);
            rule__Annotation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__7_in_rule__Annotation__Group__67826);
            rule__Annotation__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__6"


    // $ANTLR start "rule__Annotation__Group__6__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3789:1: rule__Annotation__Group__6__Impl : ( '{' ) ;
    public final void rule__Annotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3793:1: ( ( '{' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3794:1: ( '{' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3794:1: ( '{' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3795:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,21,FOLLOW_21_in_rule__Annotation__Group__6__Impl7854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Annotation__Group__6__Impl"


    // $ANTLR start "rule__Annotation__Group__7"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3808:1: rule__Annotation__Group__7 : rule__Annotation__Group__7__Impl rule__Annotation__Group__8 ;
    public final void rule__Annotation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3812:1: ( rule__Annotation__Group__7__Impl rule__Annotation__Group__8 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3813:2: rule__Annotation__Group__7__Impl rule__Annotation__Group__8
            {
            pushFollow(FOLLOW_rule__Annotation__Group__7__Impl_in_rule__Annotation__Group__77885);
            rule__Annotation__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__8_in_rule__Annotation__Group__77888);
            rule__Annotation__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__7"


    // $ANTLR start "rule__Annotation__Group__7__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3820:1: rule__Annotation__Group__7__Impl : ( ( rule__Annotation__MandatoriesAssignment_7 )* ) ;
    public final void rule__Annotation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3824:1: ( ( ( rule__Annotation__MandatoriesAssignment_7 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3825:1: ( ( rule__Annotation__MandatoriesAssignment_7 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3825:1: ( ( rule__Annotation__MandatoriesAssignment_7 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3826:1: ( rule__Annotation__MandatoriesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getMandatoriesAssignment_7()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3827:1: ( rule__Annotation__MandatoriesAssignment_7 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==28) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3827:2: rule__Annotation__MandatoriesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__MandatoriesAssignment_7_in_rule__Annotation__Group__7__Impl7915);
            	    rule__Annotation__MandatoriesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getMandatoriesAssignment_7()); 
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
    // $ANTLR end "rule__Annotation__Group__7__Impl"


    // $ANTLR start "rule__Annotation__Group__8"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3837:1: rule__Annotation__Group__8 : rule__Annotation__Group__8__Impl rule__Annotation__Group__9 ;
    public final void rule__Annotation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3841:1: ( rule__Annotation__Group__8__Impl rule__Annotation__Group__9 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3842:2: rule__Annotation__Group__8__Impl rule__Annotation__Group__9
            {
            pushFollow(FOLLOW_rule__Annotation__Group__8__Impl_in_rule__Annotation__Group__87946);
            rule__Annotation__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__9_in_rule__Annotation__Group__87949);
            rule__Annotation__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__8"


    // $ANTLR start "rule__Annotation__Group__8__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3849:1: rule__Annotation__Group__8__Impl : ( ( rule__Annotation__OptionalsAssignment_8 )* ) ;
    public final void rule__Annotation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3853:1: ( ( ( rule__Annotation__OptionalsAssignment_8 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3854:1: ( ( rule__Annotation__OptionalsAssignment_8 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3854:1: ( ( rule__Annotation__OptionalsAssignment_8 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3855:1: ( rule__Annotation__OptionalsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getOptionalsAssignment_8()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3856:1: ( rule__Annotation__OptionalsAssignment_8 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3856:2: rule__Annotation__OptionalsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__OptionalsAssignment_8_in_rule__Annotation__Group__8__Impl7976);
            	    rule__Annotation__OptionalsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getOptionalsAssignment_8()); 
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
    // $ANTLR end "rule__Annotation__Group__8__Impl"


    // $ANTLR start "rule__Annotation__Group__9"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3866:1: rule__Annotation__Group__9 : rule__Annotation__Group__9__Impl ;
    public final void rule__Annotation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3870:1: ( rule__Annotation__Group__9__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3871:2: rule__Annotation__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__9__Impl_in_rule__Annotation__Group__98007);
            rule__Annotation__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Annotation__Group__9"


    // $ANTLR start "rule__Annotation__Group__9__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3877:1: rule__Annotation__Group__9__Impl : ( '}' ) ;
    public final void rule__Annotation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3881:1: ( ( '}' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3882:1: ( '}' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3882:1: ( '}' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3883:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,22,FOLLOW_22_in_rule__Annotation__Group__9__Impl8035); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_9()); 
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
    // $ANTLR end "rule__Annotation__Group__9__Impl"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3916:1: rule__AnnotationMandatoryProperty__Group__0 : rule__AnnotationMandatoryProperty__Group__0__Impl rule__AnnotationMandatoryProperty__Group__1 ;
    public final void rule__AnnotationMandatoryProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3920:1: ( rule__AnnotationMandatoryProperty__Group__0__Impl rule__AnnotationMandatoryProperty__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3921:2: rule__AnnotationMandatoryProperty__Group__0__Impl rule__AnnotationMandatoryProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group__0__Impl_in_rule__AnnotationMandatoryProperty__Group__08086);
            rule__AnnotationMandatoryProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group__1_in_rule__AnnotationMandatoryProperty__Group__08089);
            rule__AnnotationMandatoryProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group__0"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3928:1: rule__AnnotationMandatoryProperty__Group__0__Impl : ( ( rule__AnnotationMandatoryProperty__NameAssignment_0 ) ) ;
    public final void rule__AnnotationMandatoryProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3932:1: ( ( ( rule__AnnotationMandatoryProperty__NameAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3933:1: ( ( rule__AnnotationMandatoryProperty__NameAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3933:1: ( ( rule__AnnotationMandatoryProperty__NameAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3934:1: ( rule__AnnotationMandatoryProperty__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getNameAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3935:1: ( rule__AnnotationMandatoryProperty__NameAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3935:2: rule__AnnotationMandatoryProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__NameAssignment_0_in_rule__AnnotationMandatoryProperty__Group__0__Impl8116);
            rule__AnnotationMandatoryProperty__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group__0__Impl"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3945:1: rule__AnnotationMandatoryProperty__Group__1 : rule__AnnotationMandatoryProperty__Group__1__Impl rule__AnnotationMandatoryProperty__Group__2 ;
    public final void rule__AnnotationMandatoryProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3949:1: ( rule__AnnotationMandatoryProperty__Group__1__Impl rule__AnnotationMandatoryProperty__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3950:2: rule__AnnotationMandatoryProperty__Group__1__Impl rule__AnnotationMandatoryProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group__1__Impl_in_rule__AnnotationMandatoryProperty__Group__18146);
            rule__AnnotationMandatoryProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group__2_in_rule__AnnotationMandatoryProperty__Group__18149);
            rule__AnnotationMandatoryProperty__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group__1"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3957:1: rule__AnnotationMandatoryProperty__Group__1__Impl : ( ':' ) ;
    public final void rule__AnnotationMandatoryProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3961:1: ( ( ':' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3962:1: ( ':' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3962:1: ( ':' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3963:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getColonKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__AnnotationMandatoryProperty__Group__1__Impl8177); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group__1__Impl"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3976:1: rule__AnnotationMandatoryProperty__Group__2 : rule__AnnotationMandatoryProperty__Group__2__Impl ;
    public final void rule__AnnotationMandatoryProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3980:1: ( rule__AnnotationMandatoryProperty__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3981:2: rule__AnnotationMandatoryProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group__2__Impl_in_rule__AnnotationMandatoryProperty__Group__28208);
            rule__AnnotationMandatoryProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group__2"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3987:1: rule__AnnotationMandatoryProperty__Group__2__Impl : ( ( rule__AnnotationMandatoryProperty__Alternatives_2 ) ) ;
    public final void rule__AnnotationMandatoryProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3991:1: ( ( ( rule__AnnotationMandatoryProperty__Alternatives_2 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3992:1: ( ( rule__AnnotationMandatoryProperty__Alternatives_2 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3992:1: ( ( rule__AnnotationMandatoryProperty__Alternatives_2 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3993:1: ( rule__AnnotationMandatoryProperty__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getAlternatives_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3994:1: ( rule__AnnotationMandatoryProperty__Alternatives_2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:3994:2: rule__AnnotationMandatoryProperty__Alternatives_2
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Alternatives_2_in_rule__AnnotationMandatoryProperty__Group__2__Impl8235);
            rule__AnnotationMandatoryProperty__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group__2__Impl"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group_2_1__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4010:1: rule__AnnotationMandatoryProperty__Group_2_1__0 : rule__AnnotationMandatoryProperty__Group_2_1__0__Impl rule__AnnotationMandatoryProperty__Group_2_1__1 ;
    public final void rule__AnnotationMandatoryProperty__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4014:1: ( rule__AnnotationMandatoryProperty__Group_2_1__0__Impl rule__AnnotationMandatoryProperty__Group_2_1__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4015:2: rule__AnnotationMandatoryProperty__Group_2_1__0__Impl rule__AnnotationMandatoryProperty__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__0__Impl_in_rule__AnnotationMandatoryProperty__Group_2_1__08271);
            rule__AnnotationMandatoryProperty__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__1_in_rule__AnnotationMandatoryProperty__Group_2_1__08274);
            rule__AnnotationMandatoryProperty__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group_2_1__0"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group_2_1__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4022:1: rule__AnnotationMandatoryProperty__Group_2_1__0__Impl : ( ( rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0 ) ) ;
    public final void rule__AnnotationMandatoryProperty__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4026:1: ( ( ( rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4027:1: ( ( rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4027:1: ( ( rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4028:1: ( rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getTypeAssignment_2_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4029:1: ( rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4029:2: rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0_in_rule__AnnotationMandatoryProperty__Group_2_1__0__Impl8301);
            rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getTypeAssignment_2_1_0()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group_2_1__0__Impl"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group_2_1__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4039:1: rule__AnnotationMandatoryProperty__Group_2_1__1 : rule__AnnotationMandatoryProperty__Group_2_1__1__Impl ;
    public final void rule__AnnotationMandatoryProperty__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4043:1: ( rule__AnnotationMandatoryProperty__Group_2_1__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4044:2: rule__AnnotationMandatoryProperty__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__1__Impl_in_rule__AnnotationMandatoryProperty__Group_2_1__18331);
            rule__AnnotationMandatoryProperty__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group_2_1__1"


    // $ANTLR start "rule__AnnotationMandatoryProperty__Group_2_1__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4050:1: rule__AnnotationMandatoryProperty__Group_2_1__1__Impl : ( ( rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1 )? ) ;
    public final void rule__AnnotationMandatoryProperty__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4054:1: ( ( ( rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1 )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4055:1: ( ( rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1 )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4055:1: ( ( rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4056:1: ( rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getMultiAssignment_2_1_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4057:1: ( rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4057:2: rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1_in_rule__AnnotationMandatoryProperty__Group_2_1__1__Impl8358);
                    rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getMultiAssignment_2_1_1()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__Group_2_1__1__Impl"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4071:1: rule__AnnotationOptionalProperty__Group__0 : rule__AnnotationOptionalProperty__Group__0__Impl rule__AnnotationOptionalProperty__Group__1 ;
    public final void rule__AnnotationOptionalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4075:1: ( rule__AnnotationOptionalProperty__Group__0__Impl rule__AnnotationOptionalProperty__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4076:2: rule__AnnotationOptionalProperty__Group__0__Impl rule__AnnotationOptionalProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__0__Impl_in_rule__AnnotationOptionalProperty__Group__08393);
            rule__AnnotationOptionalProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__1_in_rule__AnnotationOptionalProperty__Group__08396);
            rule__AnnotationOptionalProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__0"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4083:1: rule__AnnotationOptionalProperty__Group__0__Impl : ( ( rule__AnnotationOptionalProperty__NameAssignment_0 ) ) ;
    public final void rule__AnnotationOptionalProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4087:1: ( ( ( rule__AnnotationOptionalProperty__NameAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4088:1: ( ( rule__AnnotationOptionalProperty__NameAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4088:1: ( ( rule__AnnotationOptionalProperty__NameAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4089:1: ( rule__AnnotationOptionalProperty__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getNameAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4090:1: ( rule__AnnotationOptionalProperty__NameAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4090:2: rule__AnnotationOptionalProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__NameAssignment_0_in_rule__AnnotationOptionalProperty__Group__0__Impl8423);
            rule__AnnotationOptionalProperty__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__0__Impl"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4100:1: rule__AnnotationOptionalProperty__Group__1 : rule__AnnotationOptionalProperty__Group__1__Impl rule__AnnotationOptionalProperty__Group__2 ;
    public final void rule__AnnotationOptionalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4104:1: ( rule__AnnotationOptionalProperty__Group__1__Impl rule__AnnotationOptionalProperty__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4105:2: rule__AnnotationOptionalProperty__Group__1__Impl rule__AnnotationOptionalProperty__Group__2
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__1__Impl_in_rule__AnnotationOptionalProperty__Group__18453);
            rule__AnnotationOptionalProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__2_in_rule__AnnotationOptionalProperty__Group__18456);
            rule__AnnotationOptionalProperty__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__1"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4112:1: rule__AnnotationOptionalProperty__Group__1__Impl : ( '?' ) ;
    public final void rule__AnnotationOptionalProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4116:1: ( ( '?' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4117:1: ( '?' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4117:1: ( '?' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4118:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getQuestionMarkKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__AnnotationOptionalProperty__Group__1__Impl8484); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getQuestionMarkKeyword_1()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__1__Impl"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4131:1: rule__AnnotationOptionalProperty__Group__2 : rule__AnnotationOptionalProperty__Group__2__Impl rule__AnnotationOptionalProperty__Group__3 ;
    public final void rule__AnnotationOptionalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4135:1: ( rule__AnnotationOptionalProperty__Group__2__Impl rule__AnnotationOptionalProperty__Group__3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4136:2: rule__AnnotationOptionalProperty__Group__2__Impl rule__AnnotationOptionalProperty__Group__3
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__2__Impl_in_rule__AnnotationOptionalProperty__Group__28515);
            rule__AnnotationOptionalProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__3_in_rule__AnnotationOptionalProperty__Group__28518);
            rule__AnnotationOptionalProperty__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__2"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4143:1: rule__AnnotationOptionalProperty__Group__2__Impl : ( ':' ) ;
    public final void rule__AnnotationOptionalProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4147:1: ( ( ':' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4148:1: ( ':' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4148:1: ( ':' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4149:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getColonKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__AnnotationOptionalProperty__Group__2__Impl8546); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__2__Impl"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4162:1: rule__AnnotationOptionalProperty__Group__3 : rule__AnnotationOptionalProperty__Group__3__Impl ;
    public final void rule__AnnotationOptionalProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4166:1: ( rule__AnnotationOptionalProperty__Group__3__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4167:2: rule__AnnotationOptionalProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group__3__Impl_in_rule__AnnotationOptionalProperty__Group__38577);
            rule__AnnotationOptionalProperty__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__3"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group__3__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4173:1: rule__AnnotationOptionalProperty__Group__3__Impl : ( ( rule__AnnotationOptionalProperty__Alternatives_3 ) ) ;
    public final void rule__AnnotationOptionalProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4177:1: ( ( ( rule__AnnotationOptionalProperty__Alternatives_3 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4178:1: ( ( rule__AnnotationOptionalProperty__Alternatives_3 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4178:1: ( ( rule__AnnotationOptionalProperty__Alternatives_3 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4179:1: ( rule__AnnotationOptionalProperty__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getAlternatives_3()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4180:1: ( rule__AnnotationOptionalProperty__Alternatives_3 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4180:2: rule__AnnotationOptionalProperty__Alternatives_3
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Alternatives_3_in_rule__AnnotationOptionalProperty__Group__3__Impl8604);
            rule__AnnotationOptionalProperty__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group__3__Impl"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group_3_1__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4198:1: rule__AnnotationOptionalProperty__Group_3_1__0 : rule__AnnotationOptionalProperty__Group_3_1__0__Impl rule__AnnotationOptionalProperty__Group_3_1__1 ;
    public final void rule__AnnotationOptionalProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4202:1: ( rule__AnnotationOptionalProperty__Group_3_1__0__Impl rule__AnnotationOptionalProperty__Group_3_1__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4203:2: rule__AnnotationOptionalProperty__Group_3_1__0__Impl rule__AnnotationOptionalProperty__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__0__Impl_in_rule__AnnotationOptionalProperty__Group_3_1__08642);
            rule__AnnotationOptionalProperty__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__1_in_rule__AnnotationOptionalProperty__Group_3_1__08645);
            rule__AnnotationOptionalProperty__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group_3_1__0"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group_3_1__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4210:1: rule__AnnotationOptionalProperty__Group_3_1__0__Impl : ( ( rule__AnnotationOptionalProperty__TypeAssignment_3_1_0 ) ) ;
    public final void rule__AnnotationOptionalProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4214:1: ( ( ( rule__AnnotationOptionalProperty__TypeAssignment_3_1_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4215:1: ( ( rule__AnnotationOptionalProperty__TypeAssignment_3_1_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4215:1: ( ( rule__AnnotationOptionalProperty__TypeAssignment_3_1_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4216:1: ( rule__AnnotationOptionalProperty__TypeAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getTypeAssignment_3_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4217:1: ( rule__AnnotationOptionalProperty__TypeAssignment_3_1_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4217:2: rule__AnnotationOptionalProperty__TypeAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__TypeAssignment_3_1_0_in_rule__AnnotationOptionalProperty__Group_3_1__0__Impl8672);
            rule__AnnotationOptionalProperty__TypeAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getTypeAssignment_3_1_0()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group_3_1__0__Impl"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group_3_1__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4227:1: rule__AnnotationOptionalProperty__Group_3_1__1 : rule__AnnotationOptionalProperty__Group_3_1__1__Impl ;
    public final void rule__AnnotationOptionalProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4231:1: ( rule__AnnotationOptionalProperty__Group_3_1__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4232:2: rule__AnnotationOptionalProperty__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__1__Impl_in_rule__AnnotationOptionalProperty__Group_3_1__18702);
            rule__AnnotationOptionalProperty__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group_3_1__1"


    // $ANTLR start "rule__AnnotationOptionalProperty__Group_3_1__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4238:1: rule__AnnotationOptionalProperty__Group_3_1__1__Impl : ( ( rule__AnnotationOptionalProperty__MultiAssignment_3_1_1 )? ) ;
    public final void rule__AnnotationOptionalProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4242:1: ( ( ( rule__AnnotationOptionalProperty__MultiAssignment_3_1_1 )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4243:1: ( ( rule__AnnotationOptionalProperty__MultiAssignment_3_1_1 )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4243:1: ( ( rule__AnnotationOptionalProperty__MultiAssignment_3_1_1 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4244:1: ( rule__AnnotationOptionalProperty__MultiAssignment_3_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getMultiAssignment_3_1_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4245:1: ( rule__AnnotationOptionalProperty__MultiAssignment_3_1_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4245:2: rule__AnnotationOptionalProperty__MultiAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__AnnotationOptionalProperty__MultiAssignment_3_1_1_in_rule__AnnotationOptionalProperty__Group_3_1__1__Impl8729);
                    rule__AnnotationOptionalProperty__MultiAssignment_3_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getMultiAssignment_3_1_1()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__Group_3_1__1__Impl"


    // $ANTLR start "rule__AnnotationGroup__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4259:1: rule__AnnotationGroup__Group__0 : rule__AnnotationGroup__Group__0__Impl rule__AnnotationGroup__Group__1 ;
    public final void rule__AnnotationGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4263:1: ( rule__AnnotationGroup__Group__0__Impl rule__AnnotationGroup__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4264:2: rule__AnnotationGroup__Group__0__Impl rule__AnnotationGroup__Group__1
            {
            pushFollow(FOLLOW_rule__AnnotationGroup__Group__0__Impl_in_rule__AnnotationGroup__Group__08764);
            rule__AnnotationGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationGroup__Group__1_in_rule__AnnotationGroup__Group__08767);
            rule__AnnotationGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationGroup__Group__0"


    // $ANTLR start "rule__AnnotationGroup__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4271:1: rule__AnnotationGroup__Group__0__Impl : ( '[' ) ;
    public final void rule__AnnotationGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4275:1: ( ( '[' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4276:1: ( '[' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4276:1: ( '[' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4277:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationGroupAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AnnotationGroup__Group__0__Impl8795); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationGroupAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__AnnotationGroup__Group__0__Impl"


    // $ANTLR start "rule__AnnotationGroup__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4290:1: rule__AnnotationGroup__Group__1 : rule__AnnotationGroup__Group__1__Impl rule__AnnotationGroup__Group__2 ;
    public final void rule__AnnotationGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4294:1: ( rule__AnnotationGroup__Group__1__Impl rule__AnnotationGroup__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4295:2: rule__AnnotationGroup__Group__1__Impl rule__AnnotationGroup__Group__2
            {
            pushFollow(FOLLOW_rule__AnnotationGroup__Group__1__Impl_in_rule__AnnotationGroup__Group__18826);
            rule__AnnotationGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationGroup__Group__2_in_rule__AnnotationGroup__Group__18829);
            rule__AnnotationGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationGroup__Group__1"


    // $ANTLR start "rule__AnnotationGroup__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4302:1: rule__AnnotationGroup__Group__1__Impl : ( ( ( rule__AnnotationGroup__InstancesAssignment_1 ) ) ( ( rule__AnnotationGroup__InstancesAssignment_1 )* ) ) ;
    public final void rule__AnnotationGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4306:1: ( ( ( ( rule__AnnotationGroup__InstancesAssignment_1 ) ) ( ( rule__AnnotationGroup__InstancesAssignment_1 )* ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4307:1: ( ( ( rule__AnnotationGroup__InstancesAssignment_1 ) ) ( ( rule__AnnotationGroup__InstancesAssignment_1 )* ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4307:1: ( ( ( rule__AnnotationGroup__InstancesAssignment_1 ) ) ( ( rule__AnnotationGroup__InstancesAssignment_1 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4308:1: ( ( rule__AnnotationGroup__InstancesAssignment_1 ) ) ( ( rule__AnnotationGroup__InstancesAssignment_1 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4308:1: ( ( rule__AnnotationGroup__InstancesAssignment_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4309:1: ( rule__AnnotationGroup__InstancesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationGroupAccess().getInstancesAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4310:1: ( rule__AnnotationGroup__InstancesAssignment_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4310:2: rule__AnnotationGroup__InstancesAssignment_1
            {
            pushFollow(FOLLOW_rule__AnnotationGroup__InstancesAssignment_1_in_rule__AnnotationGroup__Group__1__Impl8858);
            rule__AnnotationGroup__InstancesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationGroupAccess().getInstancesAssignment_1()); 
            }

            }

            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4313:1: ( ( rule__AnnotationGroup__InstancesAssignment_1 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4314:1: ( rule__AnnotationGroup__InstancesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationGroupAccess().getInstancesAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4315:1: ( rule__AnnotationGroup__InstancesAssignment_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4315:2: rule__AnnotationGroup__InstancesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AnnotationGroup__InstancesAssignment_1_in_rule__AnnotationGroup__Group__1__Impl8870);
            	    rule__AnnotationGroup__InstancesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationGroupAccess().getInstancesAssignment_1()); 
            }

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
    // $ANTLR end "rule__AnnotationGroup__Group__1__Impl"


    // $ANTLR start "rule__AnnotationGroup__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4326:1: rule__AnnotationGroup__Group__2 : rule__AnnotationGroup__Group__2__Impl ;
    public final void rule__AnnotationGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4330:1: ( rule__AnnotationGroup__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4331:2: rule__AnnotationGroup__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationGroup__Group__2__Impl_in_rule__AnnotationGroup__Group__28903);
            rule__AnnotationGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationGroup__Group__2"


    // $ANTLR start "rule__AnnotationGroup__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4337:1: rule__AnnotationGroup__Group__2__Impl : ( ']' ) ;
    public final void rule__AnnotationGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4341:1: ( ( ']' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4342:1: ( ']' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4342:1: ( ']' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4343:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationGroupAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__AnnotationGroup__Group__2__Impl8931); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationGroupAccess().getRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__AnnotationGroup__Group__2__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4362:1: rule__AnnotationInstance__Group__0 : rule__AnnotationInstance__Group__0__Impl rule__AnnotationInstance__Group__1 ;
    public final void rule__AnnotationInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4366:1: ( rule__AnnotationInstance__Group__0__Impl rule__AnnotationInstance__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4367:2: rule__AnnotationInstance__Group__0__Impl rule__AnnotationInstance__Group__1
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__Group__0__Impl_in_rule__AnnotationInstance__Group__08968);
            rule__AnnotationInstance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationInstance__Group__1_in_rule__AnnotationInstance__Group__08971);
            rule__AnnotationInstance__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationInstance__Group__0"


    // $ANTLR start "rule__AnnotationInstance__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4374:1: rule__AnnotationInstance__Group__0__Impl : ( ( rule__AnnotationInstance__AnnotationAssignment_0 ) ) ;
    public final void rule__AnnotationInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4378:1: ( ( ( rule__AnnotationInstance__AnnotationAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4379:1: ( ( rule__AnnotationInstance__AnnotationAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4379:1: ( ( rule__AnnotationInstance__AnnotationAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4380:1: ( rule__AnnotationInstance__AnnotationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getAnnotationAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4381:1: ( rule__AnnotationInstance__AnnotationAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4381:2: rule__AnnotationInstance__AnnotationAssignment_0
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__AnnotationAssignment_0_in_rule__AnnotationInstance__Group__0__Impl8998);
            rule__AnnotationInstance__AnnotationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getAnnotationAssignment_0()); 
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
    // $ANTLR end "rule__AnnotationInstance__Group__0__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4391:1: rule__AnnotationInstance__Group__1 : rule__AnnotationInstance__Group__1__Impl rule__AnnotationInstance__Group__2 ;
    public final void rule__AnnotationInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4395:1: ( rule__AnnotationInstance__Group__1__Impl rule__AnnotationInstance__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4396:2: rule__AnnotationInstance__Group__1__Impl rule__AnnotationInstance__Group__2
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__Group__1__Impl_in_rule__AnnotationInstance__Group__19028);
            rule__AnnotationInstance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationInstance__Group__2_in_rule__AnnotationInstance__Group__19031);
            rule__AnnotationInstance__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationInstance__Group__1"


    // $ANTLR start "rule__AnnotationInstance__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4403:1: rule__AnnotationInstance__Group__1__Impl : ( ( rule__AnnotationInstance__ValuesAssignment_1 )* ) ;
    public final void rule__AnnotationInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4407:1: ( ( ( rule__AnnotationInstance__ValuesAssignment_1 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4408:1: ( ( rule__AnnotationInstance__ValuesAssignment_1 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4408:1: ( ( rule__AnnotationInstance__ValuesAssignment_1 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4409:1: ( rule__AnnotationInstance__ValuesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getValuesAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4410:1: ( rule__AnnotationInstance__ValuesAssignment_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_INT||LA39_0==RULE_STRING||LA39_0==30||LA39_0==32||LA39_0==43) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4410:2: rule__AnnotationInstance__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AnnotationInstance__ValuesAssignment_1_in_rule__AnnotationInstance__Group__1__Impl9058);
            	    rule__AnnotationInstance__ValuesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getValuesAssignment_1()); 
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
    // $ANTLR end "rule__AnnotationInstance__Group__1__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4420:1: rule__AnnotationInstance__Group__2 : rule__AnnotationInstance__Group__2__Impl ;
    public final void rule__AnnotationInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4424:1: ( rule__AnnotationInstance__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4425:2: rule__AnnotationInstance__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__Group__2__Impl_in_rule__AnnotationInstance__Group__29089);
            rule__AnnotationInstance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationInstance__Group__2"


    // $ANTLR start "rule__AnnotationInstance__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4431:1: rule__AnnotationInstance__Group__2__Impl : ( ( rule__AnnotationInstance__Group_2__0 )? ) ;
    public final void rule__AnnotationInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4435:1: ( ( ( rule__AnnotationInstance__Group_2__0 )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4436:1: ( ( rule__AnnotationInstance__Group_2__0 )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4436:1: ( ( rule__AnnotationInstance__Group_2__0 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4437:1: ( rule__AnnotationInstance__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getGroup_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4438:1: ( rule__AnnotationInstance__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4438:2: rule__AnnotationInstance__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AnnotationInstance__Group_2__0_in_rule__AnnotationInstance__Group__2__Impl9116);
                    rule__AnnotationInstance__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getGroup_2()); 
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
    // $ANTLR end "rule__AnnotationInstance__Group__2__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_2__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4454:1: rule__AnnotationInstance__Group_2__0 : rule__AnnotationInstance__Group_2__0__Impl rule__AnnotationInstance__Group_2__1 ;
    public final void rule__AnnotationInstance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4458:1: ( rule__AnnotationInstance__Group_2__0__Impl rule__AnnotationInstance__Group_2__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4459:2: rule__AnnotationInstance__Group_2__0__Impl rule__AnnotationInstance__Group_2__1
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__Group_2__0__Impl_in_rule__AnnotationInstance__Group_2__09153);
            rule__AnnotationInstance__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationInstance__Group_2__1_in_rule__AnnotationInstance__Group_2__09156);
            rule__AnnotationInstance__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationInstance__Group_2__0"


    // $ANTLR start "rule__AnnotationInstance__Group_2__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4466:1: rule__AnnotationInstance__Group_2__0__Impl : ( '-HIDDEN-' ) ;
    public final void rule__AnnotationInstance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4470:1: ( ( '-HIDDEN-' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4471:1: ( '-HIDDEN-' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4471:1: ( '-HIDDEN-' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4472:1: '-HIDDEN-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getHIDDENKeyword_2_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__AnnotationInstance__Group_2__0__Impl9184); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getHIDDENKeyword_2_0()); 
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
    // $ANTLR end "rule__AnnotationInstance__Group_2__0__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_2__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4485:1: rule__AnnotationInstance__Group_2__1 : rule__AnnotationInstance__Group_2__1__Impl rule__AnnotationInstance__Group_2__2 ;
    public final void rule__AnnotationInstance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4489:1: ( rule__AnnotationInstance__Group_2__1__Impl rule__AnnotationInstance__Group_2__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4490:2: rule__AnnotationInstance__Group_2__1__Impl rule__AnnotationInstance__Group_2__2
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__Group_2__1__Impl_in_rule__AnnotationInstance__Group_2__19215);
            rule__AnnotationInstance__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationInstance__Group_2__2_in_rule__AnnotationInstance__Group_2__19218);
            rule__AnnotationInstance__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationInstance__Group_2__1"


    // $ANTLR start "rule__AnnotationInstance__Group_2__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4497:1: rule__AnnotationInstance__Group_2__1__Impl : ( ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 ) ) ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 )* ) ) ;
    public final void rule__AnnotationInstance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4501:1: ( ( ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 ) ) ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 )* ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4502:1: ( ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 ) ) ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 )* ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4502:1: ( ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 ) ) ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4503:1: ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 ) ) ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4503:1: ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4504:1: ( rule__AnnotationInstance__PropertiesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getPropertiesAssignment_2_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4505:1: ( rule__AnnotationInstance__PropertiesAssignment_2_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4505:2: rule__AnnotationInstance__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__PropertiesAssignment_2_1_in_rule__AnnotationInstance__Group_2__1__Impl9247);
            rule__AnnotationInstance__PropertiesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getPropertiesAssignment_2_1()); 
            }

            }

            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4508:1: ( ( rule__AnnotationInstance__PropertiesAssignment_2_1 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4509:1: ( rule__AnnotationInstance__PropertiesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getPropertiesAssignment_2_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4510:1: ( rule__AnnotationInstance__PropertiesAssignment_2_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4510:2: rule__AnnotationInstance__PropertiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__AnnotationInstance__PropertiesAssignment_2_1_in_rule__AnnotationInstance__Group_2__1__Impl9259);
            	    rule__AnnotationInstance__PropertiesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getPropertiesAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__AnnotationInstance__Group_2__1__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_2__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4521:1: rule__AnnotationInstance__Group_2__2 : rule__AnnotationInstance__Group_2__2__Impl ;
    public final void rule__AnnotationInstance__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4525:1: ( rule__AnnotationInstance__Group_2__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4526:2: rule__AnnotationInstance__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationInstance__Group_2__2__Impl_in_rule__AnnotationInstance__Group_2__29292);
            rule__AnnotationInstance__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationInstance__Group_2__2"


    // $ANTLR start "rule__AnnotationInstance__Group_2__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4532:1: rule__AnnotationInstance__Group_2__2__Impl : ( '-HIDDEN-' ) ;
    public final void rule__AnnotationInstance__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4536:1: ( ( '-HIDDEN-' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4537:1: ( '-HIDDEN-' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4537:1: ( '-HIDDEN-' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4538:1: '-HIDDEN-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getHIDDENKeyword_2_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__AnnotationInstance__Group_2__2__Impl9320); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getHIDDENKeyword_2_2()); 
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
    // $ANTLR end "rule__AnnotationInstance__Group_2__2__Impl"


    // $ANTLR start "rule__AnnotationHiddenProperty__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4557:1: rule__AnnotationHiddenProperty__Group__0 : rule__AnnotationHiddenProperty__Group__0__Impl rule__AnnotationHiddenProperty__Group__1 ;
    public final void rule__AnnotationHiddenProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4561:1: ( rule__AnnotationHiddenProperty__Group__0__Impl rule__AnnotationHiddenProperty__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4562:2: rule__AnnotationHiddenProperty__Group__0__Impl rule__AnnotationHiddenProperty__Group__1
            {
            pushFollow(FOLLOW_rule__AnnotationHiddenProperty__Group__0__Impl_in_rule__AnnotationHiddenProperty__Group__09357);
            rule__AnnotationHiddenProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AnnotationHiddenProperty__Group__1_in_rule__AnnotationHiddenProperty__Group__09360);
            rule__AnnotationHiddenProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationHiddenProperty__Group__0"


    // $ANTLR start "rule__AnnotationHiddenProperty__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4569:1: rule__AnnotationHiddenProperty__Group__0__Impl : ( ( rule__AnnotationHiddenProperty__PropertyAssignment_0 ) ) ;
    public final void rule__AnnotationHiddenProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4573:1: ( ( ( rule__AnnotationHiddenProperty__PropertyAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4574:1: ( ( rule__AnnotationHiddenProperty__PropertyAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4574:1: ( ( rule__AnnotationHiddenProperty__PropertyAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4575:1: ( rule__AnnotationHiddenProperty__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyAccess().getPropertyAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4576:1: ( rule__AnnotationHiddenProperty__PropertyAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4576:2: rule__AnnotationHiddenProperty__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__AnnotationHiddenProperty__PropertyAssignment_0_in_rule__AnnotationHiddenProperty__Group__0__Impl9387);
            rule__AnnotationHiddenProperty__PropertyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyAccess().getPropertyAssignment_0()); 
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
    // $ANTLR end "rule__AnnotationHiddenProperty__Group__0__Impl"


    // $ANTLR start "rule__AnnotationHiddenProperty__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4586:1: rule__AnnotationHiddenProperty__Group__1 : rule__AnnotationHiddenProperty__Group__1__Impl ;
    public final void rule__AnnotationHiddenProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4590:1: ( rule__AnnotationHiddenProperty__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4591:2: rule__AnnotationHiddenProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationHiddenProperty__Group__1__Impl_in_rule__AnnotationHiddenProperty__Group__19417);
            rule__AnnotationHiddenProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AnnotationHiddenProperty__Group__1"


    // $ANTLR start "rule__AnnotationHiddenProperty__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4597:1: rule__AnnotationHiddenProperty__Group__1__Impl : ( ( rule__AnnotationHiddenProperty__ValuesAssignment_1 )* ) ;
    public final void rule__AnnotationHiddenProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4601:1: ( ( ( rule__AnnotationHiddenProperty__ValuesAssignment_1 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4602:1: ( ( rule__AnnotationHiddenProperty__ValuesAssignment_1 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4602:1: ( ( rule__AnnotationHiddenProperty__ValuesAssignment_1 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4603:1: ( rule__AnnotationHiddenProperty__ValuesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyAccess().getValuesAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4604:1: ( rule__AnnotationHiddenProperty__ValuesAssignment_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    int LA42_2 = input.LA(2);

                    if ( (synpred59_InternalModelDsl()) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4604:2: rule__AnnotationHiddenProperty__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AnnotationHiddenProperty__ValuesAssignment_1_in_rule__AnnotationHiddenProperty__Group__1__Impl9444);
            	    rule__AnnotationHiddenProperty__ValuesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyAccess().getValuesAssignment_1()); 
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
    // $ANTLR end "rule__AnnotationHiddenProperty__Group__1__Impl"


    // $ANTLR start "rule__GroupType__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4618:1: rule__GroupType__Group__0 : rule__GroupType__Group__0__Impl rule__GroupType__Group__1 ;
    public final void rule__GroupType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4622:1: ( rule__GroupType__Group__0__Impl rule__GroupType__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4623:2: rule__GroupType__Group__0__Impl rule__GroupType__Group__1
            {
            pushFollow(FOLLOW_rule__GroupType__Group__0__Impl_in_rule__GroupType__Group__09479);
            rule__GroupType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GroupType__Group__1_in_rule__GroupType__Group__09482);
            rule__GroupType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__GroupType__Group__0"


    // $ANTLR start "rule__GroupType__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4630:1: rule__GroupType__Group__0__Impl : ( ( rule__GroupType__TypeAssignment_0 ) ) ;
    public final void rule__GroupType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4634:1: ( ( ( rule__GroupType__TypeAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4635:1: ( ( rule__GroupType__TypeAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4635:1: ( ( rule__GroupType__TypeAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4636:1: ( rule__GroupType__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupTypeAccess().getTypeAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4637:1: ( rule__GroupType__TypeAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4637:2: rule__GroupType__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GroupType__TypeAssignment_0_in_rule__GroupType__Group__0__Impl9509);
            rule__GroupType__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupTypeAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__GroupType__Group__0__Impl"


    // $ANTLR start "rule__GroupType__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4647:1: rule__GroupType__Group__1 : rule__GroupType__Group__1__Impl ;
    public final void rule__GroupType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4651:1: ( rule__GroupType__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4652:2: rule__GroupType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupType__Group__1__Impl_in_rule__GroupType__Group__19539);
            rule__GroupType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__GroupType__Group__1"


    // $ANTLR start "rule__GroupType__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4658:1: rule__GroupType__Group__1__Impl : ( ( rule__GroupType__NameAssignment_1 ) ) ;
    public final void rule__GroupType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4662:1: ( ( ( rule__GroupType__NameAssignment_1 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4663:1: ( ( rule__GroupType__NameAssignment_1 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4663:1: ( ( rule__GroupType__NameAssignment_1 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4664:1: ( rule__GroupType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupTypeAccess().getNameAssignment_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4665:1: ( rule__GroupType__NameAssignment_1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4665:2: rule__GroupType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GroupType__NameAssignment_1_in_rule__GroupType__Group__1__Impl9566);
            rule__GroupType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupTypeAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__GroupType__Group__1__Impl"


    // $ANTLR start "rule__RangeValue__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4679:1: rule__RangeValue__Group__0 : rule__RangeValue__Group__0__Impl rule__RangeValue__Group__1 ;
    public final void rule__RangeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4683:1: ( rule__RangeValue__Group__0__Impl rule__RangeValue__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4684:2: rule__RangeValue__Group__0__Impl rule__RangeValue__Group__1
            {
            pushFollow(FOLLOW_rule__RangeValue__Group__0__Impl_in_rule__RangeValue__Group__09600);
            rule__RangeValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RangeValue__Group__1_in_rule__RangeValue__Group__09603);
            rule__RangeValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RangeValue__Group__0"


    // $ANTLR start "rule__RangeValue__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4691:1: rule__RangeValue__Group__0__Impl : ( ( rule__RangeValue__Alternatives_0 ) ) ;
    public final void rule__RangeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4695:1: ( ( ( rule__RangeValue__Alternatives_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4696:1: ( ( rule__RangeValue__Alternatives_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4696:1: ( ( rule__RangeValue__Alternatives_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4697:1: ( rule__RangeValue__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getAlternatives_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4698:1: ( rule__RangeValue__Alternatives_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4698:2: rule__RangeValue__Alternatives_0
            {
            pushFollow(FOLLOW_rule__RangeValue__Alternatives_0_in_rule__RangeValue__Group__0__Impl9630);
            rule__RangeValue__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__RangeValue__Group__0__Impl"


    // $ANTLR start "rule__RangeValue__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4708:1: rule__RangeValue__Group__1 : rule__RangeValue__Group__1__Impl rule__RangeValue__Group__2 ;
    public final void rule__RangeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4712:1: ( rule__RangeValue__Group__1__Impl rule__RangeValue__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4713:2: rule__RangeValue__Group__1__Impl rule__RangeValue__Group__2
            {
            pushFollow(FOLLOW_rule__RangeValue__Group__1__Impl_in_rule__RangeValue__Group__19660);
            rule__RangeValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RangeValue__Group__2_in_rule__RangeValue__Group__19663);
            rule__RangeValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RangeValue__Group__1"


    // $ANTLR start "rule__RangeValue__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4720:1: rule__RangeValue__Group__1__Impl : ( '..' ) ;
    public final void rule__RangeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4724:1: ( ( '..' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4725:1: ( '..' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4725:1: ( '..' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4726:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getFullStopFullStopKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__RangeValue__Group__1__Impl9691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getFullStopFullStopKeyword_1()); 
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
    // $ANTLR end "rule__RangeValue__Group__1__Impl"


    // $ANTLR start "rule__RangeValue__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4739:1: rule__RangeValue__Group__2 : rule__RangeValue__Group__2__Impl ;
    public final void rule__RangeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4743:1: ( rule__RangeValue__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4744:2: rule__RangeValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RangeValue__Group__2__Impl_in_rule__RangeValue__Group__29722);
            rule__RangeValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RangeValue__Group__2"


    // $ANTLR start "rule__RangeValue__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4750:1: rule__RangeValue__Group__2__Impl : ( ( rule__RangeValue__Alternatives_2 ) ) ;
    public final void rule__RangeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4754:1: ( ( ( rule__RangeValue__Alternatives_2 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4755:1: ( ( rule__RangeValue__Alternatives_2 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4755:1: ( ( rule__RangeValue__Alternatives_2 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4756:1: ( rule__RangeValue__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getAlternatives_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4757:1: ( rule__RangeValue__Alternatives_2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4757:2: rule__RangeValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RangeValue__Alternatives_2_in_rule__RangeValue__Group__2__Impl9749);
            rule__RangeValue__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__RangeValue__Group__2__Impl"


    // $ANTLR start "rule__FormatRangeValue__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4773:1: rule__FormatRangeValue__Group__0 : rule__FormatRangeValue__Group__0__Impl rule__FormatRangeValue__Group__1 ;
    public final void rule__FormatRangeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4777:1: ( rule__FormatRangeValue__Group__0__Impl rule__FormatRangeValue__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4778:2: rule__FormatRangeValue__Group__0__Impl rule__FormatRangeValue__Group__1
            {
            pushFollow(FOLLOW_rule__FormatRangeValue__Group__0__Impl_in_rule__FormatRangeValue__Group__09785);
            rule__FormatRangeValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FormatRangeValue__Group__1_in_rule__FormatRangeValue__Group__09788);
            rule__FormatRangeValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FormatRangeValue__Group__0"


    // $ANTLR start "rule__FormatRangeValue__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4785:1: rule__FormatRangeValue__Group__0__Impl : ( ( rule__FormatRangeValue__FromAssignment_0 ) ) ;
    public final void rule__FormatRangeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4789:1: ( ( ( rule__FormatRangeValue__FromAssignment_0 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4790:1: ( ( rule__FormatRangeValue__FromAssignment_0 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4790:1: ( ( rule__FormatRangeValue__FromAssignment_0 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4791:1: ( rule__FormatRangeValue__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRangeValueAccess().getFromAssignment_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4792:1: ( rule__FormatRangeValue__FromAssignment_0 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4792:2: rule__FormatRangeValue__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__FormatRangeValue__FromAssignment_0_in_rule__FormatRangeValue__Group__0__Impl9815);
            rule__FormatRangeValue__FromAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRangeValueAccess().getFromAssignment_0()); 
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
    // $ANTLR end "rule__FormatRangeValue__Group__0__Impl"


    // $ANTLR start "rule__FormatRangeValue__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4802:1: rule__FormatRangeValue__Group__1 : rule__FormatRangeValue__Group__1__Impl rule__FormatRangeValue__Group__2 ;
    public final void rule__FormatRangeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4806:1: ( rule__FormatRangeValue__Group__1__Impl rule__FormatRangeValue__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4807:2: rule__FormatRangeValue__Group__1__Impl rule__FormatRangeValue__Group__2
            {
            pushFollow(FOLLOW_rule__FormatRangeValue__Group__1__Impl_in_rule__FormatRangeValue__Group__19845);
            rule__FormatRangeValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FormatRangeValue__Group__2_in_rule__FormatRangeValue__Group__19848);
            rule__FormatRangeValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FormatRangeValue__Group__1"


    // $ANTLR start "rule__FormatRangeValue__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4814:1: rule__FormatRangeValue__Group__1__Impl : ( '..' ) ;
    public final void rule__FormatRangeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4818:1: ( ( '..' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4819:1: ( '..' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4819:1: ( '..' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4820:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRangeValueAccess().getFullStopFullStopKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__FormatRangeValue__Group__1__Impl9876); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRangeValueAccess().getFullStopFullStopKeyword_1()); 
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
    // $ANTLR end "rule__FormatRangeValue__Group__1__Impl"


    // $ANTLR start "rule__FormatRangeValue__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4833:1: rule__FormatRangeValue__Group__2 : rule__FormatRangeValue__Group__2__Impl ;
    public final void rule__FormatRangeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4837:1: ( rule__FormatRangeValue__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4838:2: rule__FormatRangeValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FormatRangeValue__Group__2__Impl_in_rule__FormatRangeValue__Group__29907);
            rule__FormatRangeValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FormatRangeValue__Group__2"


    // $ANTLR start "rule__FormatRangeValue__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4844:1: rule__FormatRangeValue__Group__2__Impl : ( ( rule__FormatRangeValue__ToAssignment_2 ) ) ;
    public final void rule__FormatRangeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4848:1: ( ( ( rule__FormatRangeValue__ToAssignment_2 ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4849:1: ( ( rule__FormatRangeValue__ToAssignment_2 ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4849:1: ( ( rule__FormatRangeValue__ToAssignment_2 ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4850:1: ( rule__FormatRangeValue__ToAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRangeValueAccess().getToAssignment_2()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4851:1: ( rule__FormatRangeValue__ToAssignment_2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4851:2: rule__FormatRangeValue__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__FormatRangeValue__ToAssignment_2_in_rule__FormatRangeValue__Group__2__Impl9934);
            rule__FormatRangeValue__ToAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRangeValueAccess().getToAssignment_2()); 
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
    // $ANTLR end "rule__FormatRangeValue__Group__2__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4867:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4871:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4872:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__09970);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__09973);
            rule__Integer__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4879:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4883:1: ( ( ( '-' )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4884:1: ( ( '-' )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4884:1: ( ( '-' )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4885:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4886:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4887:2: '-'
                    {
                    match(input,30,FOLLOW_30_in_rule__Integer__Group__0__Impl10002); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4898:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4902:1: ( rule__Integer__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4903:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__110035);
            rule__Integer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4909:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4913:1: ( ( RULE_INT ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4914:1: ( RULE_INT )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4914:1: ( RULE_INT )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4915:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl10062); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4930:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4934:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4935:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__010095);
            rule__Double__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Double__Group__1_in_rule__Double__Group__010098);
            rule__Double__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4942:1: rule__Double__Group__0__Impl : ( ruleInteger ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4946:1: ( ( ruleInteger ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4947:1: ( ruleInteger )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4947:1: ( ruleInteger )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4948:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_rule__Double__Group__0__Impl10125);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0()); 
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
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4959:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4963:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4964:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__110154);
            rule__Double__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Double__Group__2_in_rule__Double__Group__110157);
            rule__Double__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4971:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4975:1: ( ( '.' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4976:1: ( '.' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4976:1: ( '.' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4977:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__Double__Group__1__Impl10185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4990:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4994:1: ( rule__Double__Group__2__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4995:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__210216);
            rule__Double__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5001:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5005:1: ( ( RULE_INT ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5006:1: ( RULE_INT )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5006:1: ( RULE_INT )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5007:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Group__2__Impl10243); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5024:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5028:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5029:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__010278);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__010281);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5036:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5040:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5041:1: ( ruleQualifiedName )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5041:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5042:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl10308);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5053:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5057:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5058:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__110337);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5064:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5068:1: ( ( ( '.*' )? ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5069:1: ( ( '.*' )? )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5069:1: ( ( '.*' )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5070:1: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5071:1: ( '.*' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5072:2: '.*'
                    {
                    match(input,39,FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl10366); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5087:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5091:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5092:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010403);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010406);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5099:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5103:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5104:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5104:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5105:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10433); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5116:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5120:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5121:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110462);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5127:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5131:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5132:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5132:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5133:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5134:1: ( rule__QualifiedName__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==38) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5134:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10489);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5148:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5152:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5153:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010524);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010527);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5160:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5164:1: ( ( '.' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5165:1: ( '.' )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5165:1: ( '.' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5166:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl10555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5179:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5183:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5184:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110586);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5190:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5194:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5195:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5195:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5196:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10613); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EntityElements__UnorderedGroup_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5212:1: rule__EntityElements__UnorderedGroup_1 : ( rule__EntityElements__UnorderedGroup_1__0 )? ;
    public final void rule__EntityElements__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5217:1: ( ( rule__EntityElements__UnorderedGroup_1__0 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5218:2: ( rule__EntityElements__UnorderedGroup_1__0 )?
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5218:2: ( rule__EntityElements__UnorderedGroup_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:0:0: rule__EntityElements__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__0_in_rule__EntityElements__UnorderedGroup_110647);
                    rule__EntityElements__UnorderedGroup_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityElements__UnorderedGroup_1"


    // $ANTLR start "rule__EntityElements__UnorderedGroup_1__Impl"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5228:1: rule__EntityElements__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) ) ) ) ;
    public final void rule__EntityElements__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5233:1: ( ( ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) ) ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5234:3: ( ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) ) ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5234:3: ( ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) ) ) )
            int alt51=4;
            int LA51_0 = input.LA(1);

            if ( LA51_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==35) ) {
                    int LA51_3 = input.LA(3);

                    if ( LA51_3 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
                        alt51=3;
                    }
                    else if ( LA51_3 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 3, input);

                        throw nvae;
                    }
                }
                else if ( LA51_2 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
                    alt51=2;
                }
                else if ( (LA51_2==13||LA51_2==30) && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) ) {
                    alt51=4;
                }
                else if ( LA51_2 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5236:4: ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5236:4: ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5237:5: {...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EntityElements__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5237:111: ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5238:6: ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5244:6: ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5245:6: ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5245:6: ( ( rule__EntityElements__ChildsAssignment_1_0 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5246:7: ( rule__EntityElements__ChildsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getChildsAssignment_1_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5247:7: ( rule__EntityElements__ChildsAssignment_1_0 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5247:8: rule__EntityElements__ChildsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_rule__EntityElements__UnorderedGroup_1__Impl10735);
                    rule__EntityElements__ChildsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getChildsAssignment_1_0()); 
                    }

                    }

                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5250:6: ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5251:7: ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getChildsAssignment_1_0()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5252:7: ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==27) ) {
                            int LA47_1 = input.LA(2);

                            if ( (LA47_1==RULE_ID) ) {
                                int LA47_3 = input.LA(3);

                                if ( (synpred64_InternalModelDsl()) ) {
                                    alt47=1;
                                }


                            }


                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5252:8: ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_rule__EntityElements__UnorderedGroup_1__Impl10779);
                    	    rule__EntityElements__ChildsAssignment_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getChildsAssignment_1_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5258:4: ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5258:4: ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5259:5: {...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EntityElements__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5259:111: ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5260:6: ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5266:6: ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5267:6: ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5267:6: ( ( rule__EntityElements__PropertiesAssignment_1_1 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5268:7: ( rule__EntityElements__PropertiesAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getPropertiesAssignment_1_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5269:7: ( rule__EntityElements__PropertiesAssignment_1_1 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5269:8: rule__EntityElements__PropertiesAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_rule__EntityElements__UnorderedGroup_1__Impl10878);
                    rule__EntityElements__PropertiesAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getPropertiesAssignment_1_1()); 
                    }

                    }

                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5272:6: ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5273:7: ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getPropertiesAssignment_1_1()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5274:7: ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_ID) ) {
                            int LA48_2 = input.LA(2);

                            if ( (LA48_2==35) ) {
                                int LA48_3 = input.LA(3);

                                if ( (LA48_3==28) ) {
                                    int LA48_4 = input.LA(4);

                                    if ( (LA48_4==RULE_ID) ) {
                                        int LA48_5 = input.LA(5);

                                        if ( (synpred66_InternalModelDsl()) ) {
                                            alt48=1;
                                        }


                                    }


                                }


                            }
                            else if ( (LA48_2==28) ) {
                                int LA48_4 = input.LA(3);

                                if ( (LA48_4==RULE_ID) ) {
                                    int LA48_5 = input.LA(4);

                                    if ( (synpred66_InternalModelDsl()) ) {
                                        alt48=1;
                                    }


                                }


                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5274:8: ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1
                    	    {
                    	    pushFollow(FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_rule__EntityElements__UnorderedGroup_1__Impl10922);
                    	    rule__EntityElements__PropertiesAssignment_1_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getPropertiesAssignment_1_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5280:4: ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5280:4: ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5281:5: {...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EntityElements__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2)");
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5281:111: ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5282:6: ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2);
                    selected = true;
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5288:6: ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5289:6: ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5289:6: ( ( rule__EntityElements__ReferencesAssignment_1_2 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5290:7: ( rule__EntityElements__ReferencesAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getReferencesAssignment_1_2()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5291:7: ( rule__EntityElements__ReferencesAssignment_1_2 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5291:8: rule__EntityElements__ReferencesAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_rule__EntityElements__UnorderedGroup_1__Impl11021);
                    rule__EntityElements__ReferencesAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getReferencesAssignment_1_2()); 
                    }

                    }

                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5294:6: ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5295:7: ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getReferencesAssignment_1_2()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5296:7: ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_ID) ) {
                            int LA49_2 = input.LA(2);

                            if ( (LA49_2==35) ) {
                                int LA49_3 = input.LA(3);

                                if ( (LA49_3==29) ) {
                                    int LA49_4 = input.LA(4);

                                    if ( (LA49_4==RULE_ID) ) {
                                        int LA49_5 = input.LA(5);

                                        if ( (synpred68_InternalModelDsl()) ) {
                                            alt49=1;
                                        }


                                    }


                                }


                            }
                            else if ( (LA49_2==29) ) {
                                int LA49_4 = input.LA(3);

                                if ( (LA49_4==RULE_ID) ) {
                                    int LA49_5 = input.LA(4);

                                    if ( (synpred68_InternalModelDsl()) ) {
                                        alt49=1;
                                    }


                                }


                            }


                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5296:8: ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2
                    	    {
                    	    pushFollow(FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_rule__EntityElements__UnorderedGroup_1__Impl11065);
                    	    rule__EntityElements__ReferencesAssignment_1_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getReferencesAssignment_1_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5302:4: ({...}? => ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) ) )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5302:4: ({...}? => ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5303:5: {...}? => ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__EntityElements__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3)");
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5303:111: ( ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5304:6: ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3);
                    selected = true;
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5310:6: ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5311:6: ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) ) ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* )
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5311:6: ( ( rule__EntityElements__ReferenceListsAssignment_1_3 ) )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5312:7: ( rule__EntityElements__ReferenceListsAssignment_1_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getReferenceListsAssignment_1_3()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5313:7: ( rule__EntityElements__ReferenceListsAssignment_1_3 )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5313:8: rule__EntityElements__ReferenceListsAssignment_1_3
                    {
                    pushFollow(FOLLOW_rule__EntityElements__ReferenceListsAssignment_1_3_in_rule__EntityElements__UnorderedGroup_1__Impl11164);
                    rule__EntityElements__ReferenceListsAssignment_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getReferenceListsAssignment_1_3()); 
                    }

                    }

                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5316:6: ( ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )* )
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5317:7: ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityElementsAccess().getReferenceListsAssignment_1_3()); 
                    }
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5318:7: ( ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3 )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_ID) ) {
                            int LA50_2 = input.LA(2);

                            if ( (LA50_2==30) ) {
                                int LA50_3 = input.LA(3);

                                if ( (LA50_3==RULE_ID) ) {
                                    int LA50_5 = input.LA(4);

                                    if ( (LA50_5==31) ) {
                                        int LA50_7 = input.LA(5);

                                        if ( (LA50_7==RULE_ID) ) {
                                            int LA50_6 = input.LA(6);

                                            if ( (synpred70_InternalModelDsl()) ) {
                                                alt50=1;
                                            }


                                        }


                                    }


                                }


                            }
                            else if ( (LA50_2==13) ) {
                                int LA50_4 = input.LA(3);

                                if ( (LA50_4==RULE_ID) ) {
                                    int LA50_6 = input.LA(4);

                                    if ( (synpred70_InternalModelDsl()) ) {
                                        alt50=1;
                                    }


                                }


                            }


                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5318:8: ( rule__EntityElements__ReferenceListsAssignment_1_3 )=> rule__EntityElements__ReferenceListsAssignment_1_3
                    	    {
                    	    pushFollow(FOLLOW_rule__EntityElements__ReferenceListsAssignment_1_3_in_rule__EntityElements__UnorderedGroup_1__Impl11208);
                    	    rule__EntityElements__ReferenceListsAssignment_1_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityElementsAccess().getReferenceListsAssignment_1_3()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityElements__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__EntityElements__UnorderedGroup_1__0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5333:1: rule__EntityElements__UnorderedGroup_1__0 : rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__1 )? ;
    public final void rule__EntityElements__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5337:1: ( rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__1 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5338:2: rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__011274);
            rule__EntityElements__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5339:2: ( rule__EntityElements__UnorderedGroup_1__1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:0:0: rule__EntityElements__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__1_in_rule__EntityElements__UnorderedGroup_1__011277);
                    rule__EntityElements__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__EntityElements__UnorderedGroup_1__0"


    // $ANTLR start "rule__EntityElements__UnorderedGroup_1__1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5346:1: rule__EntityElements__UnorderedGroup_1__1 : rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__2 )? ;
    public final void rule__EntityElements__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5350:1: ( rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__2 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5351:2: rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__111302);
            rule__EntityElements__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5352:2: ( rule__EntityElements__UnorderedGroup_1__2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( LA53_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:0:0: rule__EntityElements__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__2_in_rule__EntityElements__UnorderedGroup_1__111305);
                    rule__EntityElements__UnorderedGroup_1__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__EntityElements__UnorderedGroup_1__1"


    // $ANTLR start "rule__EntityElements__UnorderedGroup_1__2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5359:1: rule__EntityElements__UnorderedGroup_1__2 : rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__3 )? ;
    public final void rule__EntityElements__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5363:1: ( rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__3 )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5364:2: rule__EntityElements__UnorderedGroup_1__Impl ( rule__EntityElements__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__211330);
            rule__EntityElements__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5365:2: ( rule__EntityElements__UnorderedGroup_1__3 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:0:0: rule__EntityElements__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__3_in_rule__EntityElements__UnorderedGroup_1__211333);
                    rule__EntityElements__UnorderedGroup_1__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__EntityElements__UnorderedGroup_1__2"


    // $ANTLR start "rule__EntityElements__UnorderedGroup_1__3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5372:1: rule__EntityElements__UnorderedGroup_1__3 : rule__EntityElements__UnorderedGroup_1__Impl ;
    public final void rule__EntityElements__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5376:1: ( rule__EntityElements__UnorderedGroup_1__Impl )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5377:2: rule__EntityElements__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__311358);
            rule__EntityElements__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EntityElements__UnorderedGroup_1__3"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5392:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5396:1: ( ( ruleImport ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5397:1: ( ruleImport )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5397:1: ( ruleImport )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5398:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011394);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__ElementsAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5407:1: rule__Model__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5411:1: ( ( ruleElement ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5412:1: ( ruleElement )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5412:1: ( ruleElement )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5413:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_111425);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Model__ElementsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5422:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5426:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5427:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5427:1: ( ruleQualifiedNameWithWildcard )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5428:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_111456);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Package__AnnotationsAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5437:1: rule__Package__AnnotationsAssignment_0 : ( ruleAnnotationGroup ) ;
    public final void rule__Package__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5441:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5442:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5442:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5443:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__Package__AnnotationsAssignment_011487);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Package__AnnotationsAssignment_0"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5452:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5456:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5457:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5457:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5458:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_211518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ElementsAssignment_4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5467:1: rule__Package__ElementsAssignment_4 : ( ruleElement ) ;
    public final void rule__Package__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5471:1: ( ( ruleElement ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5472:1: ( ruleElement )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5472:1: ( ruleElement )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5473:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Package__ElementsAssignment_411549);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Package__ElementsAssignment_4"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5482:1: rule__DataType__AnnotationsAssignment_0 : ( ruleAnnotationGroup ) ;
    public final void rule__DataType__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5486:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5487:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5487:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5488:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__DataType__AnnotationsAssignment_011580);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__DataType__AnnotationsAssignment_0"


    // $ANTLR start "rule__DataType__NameAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5497:1: rule__DataType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5501:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5502:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5502:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5503:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_211611); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__DataType__NameAssignment_2"


    // $ANTLR start "rule__DataType__FormatedFieldsAssignment_4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5512:1: rule__DataType__FormatedFieldsAssignment_4 : ( ruleDataTypeField ) ;
    public final void rule__DataType__FormatedFieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5516:1: ( ( ruleDataTypeField ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5517:1: ( ruleDataTypeField )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5517:1: ( ruleDataTypeField )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5518:1: ruleDataTypeField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getFormatedFieldsDataTypeFieldParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleDataTypeField_in_rule__DataType__FormatedFieldsAssignment_411642);
            ruleDataTypeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getFormatedFieldsDataTypeFieldParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__DataType__FormatedFieldsAssignment_4"


    // $ANTLR start "rule__DataTypeField__PatternAssignment_0_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5527:1: rule__DataTypeField__PatternAssignment_0_0 : ( rulePatternType ) ;
    public final void rule__DataTypeField__PatternAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5531:1: ( ( rulePatternType ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5532:1: ( rulePatternType )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5532:1: ( rulePatternType )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5533:1: rulePatternType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldAccess().getPatternPatternTypeParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_rulePatternType_in_rule__DataTypeField__PatternAssignment_0_011673);
            rulePatternType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldAccess().getPatternPatternTypeParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__DataTypeField__PatternAssignment_0_0"


    // $ANTLR start "rule__DataTypeField__FormatAssignment_0_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5542:1: rule__DataTypeField__FormatAssignment_0_1 : ( RULE_PATTERN_STRING ) ;
    public final void rule__DataTypeField__FormatAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5546:1: ( ( RULE_PATTERN_STRING ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5547:1: ( RULE_PATTERN_STRING )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5547:1: ( RULE_PATTERN_STRING )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5548:1: RULE_PATTERN_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldAccess().getFormatPATTERN_STRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_PATTERN_STRING,FOLLOW_RULE_PATTERN_STRING_in_rule__DataTypeField__FormatAssignment_0_111704); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldAccess().getFormatPATTERN_STRINGTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__DataTypeField__FormatAssignment_0_1"


    // $ANTLR start "rule__DataTypeField__TypeAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5557:1: rule__DataTypeField__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataTypeField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5561:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5562:1: ( ( ruleQualifiedName ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5562:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5563:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldAccess().getTypeDataTypeCrossReference_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5564:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5565:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeFieldAccess().getTypeDataTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DataTypeField__TypeAssignment_111739);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldAccess().getTypeDataTypeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeFieldAccess().getTypeDataTypeCrossReference_1_0()); 
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
    // $ANTLR end "rule__DataTypeField__TypeAssignment_1"


    // $ANTLR start "rule__PatternType__REGEXAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5576:1: rule__PatternType__REGEXAssignment_0 : ( ( '@regex' ) ) ;
    public final void rule__PatternType__REGEXAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5580:1: ( ( ( '@regex' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5581:1: ( ( '@regex' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5581:1: ( ( '@regex' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5582:1: ( '@regex' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeAccess().getREGEXRegexKeyword_0_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5583:1: ( '@regex' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5584:1: '@regex'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeAccess().getREGEXRegexKeyword_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__PatternType__REGEXAssignment_011779); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeAccess().getREGEXRegexKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeAccess().getREGEXRegexKeyword_0_0()); 
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
    // $ANTLR end "rule__PatternType__REGEXAssignment_0"


    // $ANTLR start "rule__PatternType__DATEAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5599:1: rule__PatternType__DATEAssignment_1 : ( ( '@date' ) ) ;
    public final void rule__PatternType__DATEAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5603:1: ( ( ( '@date' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5604:1: ( ( '@date' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5604:1: ( ( '@date' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5605:1: ( '@date' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeAccess().getDATEDateKeyword_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5606:1: ( '@date' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5607:1: '@date'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeAccess().getDATEDateKeyword_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__PatternType__DATEAssignment_111823); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeAccess().getDATEDateKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeAccess().getDATEDateKeyword_1_0()); 
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
    // $ANTLR end "rule__PatternType__DATEAssignment_1"


    // $ANTLR start "rule__PatternType__NUMBERAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5622:1: rule__PatternType__NUMBERAssignment_2 : ( ( '@number' ) ) ;
    public final void rule__PatternType__NUMBERAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5626:1: ( ( ( '@number' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5627:1: ( ( '@number' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5627:1: ( ( '@number' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5628:1: ( '@number' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeAccess().getNUMBERNumberKeyword_2_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5629:1: ( '@number' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5630:1: '@number'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternTypeAccess().getNUMBERNumberKeyword_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__PatternType__NUMBERAssignment_211867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeAccess().getNUMBERNumberKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternTypeAccess().getNUMBERNumberKeyword_2_0()); 
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
    // $ANTLR end "rule__PatternType__NUMBERAssignment_2"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5645:1: rule__Entity__AnnotationsAssignment_0 : ( ruleAnnotationGroup ) ;
    public final void rule__Entity__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5649:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5650:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5650:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5651:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__Entity__AnnotationsAssignment_011906);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5660:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5664:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5665:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5665:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5666:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_211937); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__ParentAssignment_4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5675:1: rule__Entity__ParentAssignment_4 : ( ruleParent ) ;
    public final void rule__Entity__ParentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5679:1: ( ( ruleParent ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5680:1: ( ruleParent )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5680:1: ( ruleParent )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5681:1: ruleParent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getParentParentParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleParent_in_rule__Entity__ParentAssignment_411968);
            ruleParent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getParentParentParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Entity__ParentAssignment_4"


    // $ANTLR start "rule__Entity__ElementsAssignment_5"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5690:1: rule__Entity__ElementsAssignment_5 : ( ruleEntityElements ) ;
    public final void rule__Entity__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5694:1: ( ( ruleEntityElements ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5695:1: ( ruleEntityElements )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5695:1: ( ruleEntityElements )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5696:1: ruleEntityElements
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getElementsEntityElementsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleEntityElements_in_rule__Entity__ElementsAssignment_511999);
            ruleEntityElements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getElementsEntityElementsParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Entity__ElementsAssignment_5"


    // $ANTLR start "rule__Entity__GroupsAssignment_6"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5705:1: rule__Entity__GroupsAssignment_6 : ( ruleEntityGroup ) ;
    public final void rule__Entity__GroupsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5709:1: ( ( ruleEntityGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5710:1: ( ruleEntityGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5710:1: ( ruleEntityGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5711:1: ruleEntityGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroupsEntityGroupParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleEntityGroup_in_rule__Entity__GroupsAssignment_612030);
            ruleEntityGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroupsEntityGroupParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Entity__GroupsAssignment_6"


    // $ANTLR start "rule__EntityGroup__NameAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5720:1: rule__EntityGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5724:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5725:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5725:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5726:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityGroup__NameAssignment_112061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EntityGroup__NameAssignment_1"


    // $ANTLR start "rule__EntityGroup__ElementsAssignment_3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5735:1: rule__EntityGroup__ElementsAssignment_3 : ( ruleEntityElements ) ;
    public final void rule__EntityGroup__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5739:1: ( ( ruleEntityElements ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5740:1: ( ruleEntityElements )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5740:1: ( ruleEntityElements )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5741:1: ruleEntityElements
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityGroupAccess().getElementsEntityElementsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEntityElements_in_rule__EntityGroup__ElementsAssignment_312092);
            ruleEntityElements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityGroupAccess().getElementsEntityElementsParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__EntityGroup__ElementsAssignment_3"


    // $ANTLR start "rule__EntityElements__ChildsAssignment_1_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5750:1: rule__EntityElements__ChildsAssignment_1_0 : ( ruleChild ) ;
    public final void rule__EntityElements__ChildsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5754:1: ( ( ruleChild ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5755:1: ( ruleChild )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5755:1: ( ruleChild )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5756:1: ruleChild
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsAccess().getChildsChildParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleChild_in_rule__EntityElements__ChildsAssignment_1_012123);
            ruleChild();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsAccess().getChildsChildParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__EntityElements__ChildsAssignment_1_0"


    // $ANTLR start "rule__EntityElements__PropertiesAssignment_1_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5765:1: rule__EntityElements__PropertiesAssignment_1_1 : ( ruleProperty ) ;
    public final void rule__EntityElements__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5769:1: ( ( ruleProperty ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5770:1: ( ruleProperty )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5770:1: ( ruleProperty )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5771:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsAccess().getPropertiesPropertyParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__EntityElements__PropertiesAssignment_1_112154);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsAccess().getPropertiesPropertyParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__EntityElements__PropertiesAssignment_1_1"


    // $ANTLR start "rule__EntityElements__ReferencesAssignment_1_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5780:1: rule__EntityElements__ReferencesAssignment_1_2 : ( ruleReference ) ;
    public final void rule__EntityElements__ReferencesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5784:1: ( ( ruleReference ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5785:1: ( ruleReference )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5785:1: ( ruleReference )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5786:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsAccess().getReferencesReferenceParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__EntityElements__ReferencesAssignment_1_212185);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsAccess().getReferencesReferenceParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__EntityElements__ReferencesAssignment_1_2"


    // $ANTLR start "rule__EntityElements__ReferenceListsAssignment_1_3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5795:1: rule__EntityElements__ReferenceListsAssignment_1_3 : ( ruleReferenceList ) ;
    public final void rule__EntityElements__ReferenceListsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5799:1: ( ( ruleReferenceList ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5800:1: ( ruleReferenceList )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5800:1: ( ruleReferenceList )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5801:1: ruleReferenceList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityElementsAccess().getReferenceListsReferenceListParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceList_in_rule__EntityElements__ReferenceListsAssignment_1_312216);
            ruleReferenceList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityElementsAccess().getReferenceListsReferenceListParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__EntityElements__ReferenceListsAssignment_1_3"


    // $ANTLR start "rule__Parent__TypeAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5810:1: rule__Parent__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parent__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5814:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5815:1: ( ( ruleQualifiedName ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5815:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5816:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentAccess().getTypeEntityCrossReference_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5817:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5818:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentAccess().getTypeEntityQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Parent__TypeAssignment_112251);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentAccess().getTypeEntityQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentAccess().getTypeEntityCrossReference_1_0()); 
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
    // $ANTLR end "rule__Parent__TypeAssignment_1"


    // $ANTLR start "rule__Parent__AnnotationsAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5829:1: rule__Parent__AnnotationsAssignment_2 : ( ruleAnnotationGroup ) ;
    public final void rule__Parent__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5833:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5834:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5834:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5835:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentAccess().getAnnotationsAnnotationGroupParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__Parent__AnnotationsAssignment_212286);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentAccess().getAnnotationsAnnotationGroupParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Parent__AnnotationsAssignment_2"


    // $ANTLR start "rule__Child__TypeAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5844:1: rule__Child__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Child__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5848:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5849:1: ( ( ruleQualifiedName ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5849:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5850:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildAccess().getTypeEntityCrossReference_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5851:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5852:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildAccess().getTypeEntityQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Child__TypeAssignment_112321);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildAccess().getTypeEntityQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildAccess().getTypeEntityCrossReference_1_0()); 
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
    // $ANTLR end "rule__Child__TypeAssignment_1"


    // $ANTLR start "rule__Child__AnnotationsAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5863:1: rule__Child__AnnotationsAssignment_2 : ( ruleAnnotationGroup ) ;
    public final void rule__Child__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5867:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5868:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5868:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5869:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildAccess().getAnnotationsAnnotationGroupParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__Child__AnnotationsAssignment_212356);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildAccess().getAnnotationsAnnotationGroupParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Child__AnnotationsAssignment_2"


    // $ANTLR start "rule__Property__NameAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5878:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5882:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5883:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5883:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5884:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_012387); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__OptionalAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5893:1: rule__Property__OptionalAssignment_1 : ( ( '?' ) ) ;
    public final void rule__Property__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5897:1: ( ( ( '?' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5898:1: ( ( '?' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5898:1: ( ( '?' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5899:1: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getOptionalQuestionMarkKeyword_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5900:1: ( '?' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5901:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getOptionalQuestionMarkKeyword_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Property__OptionalAssignment_112423); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getOptionalQuestionMarkKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getOptionalQuestionMarkKeyword_1_0()); 
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
    // $ANTLR end "rule__Property__OptionalAssignment_1"


    // $ANTLR start "rule__Property__TypeAssignment_3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5916:1: rule__Property__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5920:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5921:1: ( ( ruleQualifiedName ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5921:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5922:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5923:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5924:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Property__TypeAssignment_312466);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
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
    // $ANTLR end "rule__Property__TypeAssignment_3"


    // $ANTLR start "rule__Property__AnnotationsAssignment_4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5935:1: rule__Property__AnnotationsAssignment_4 : ( ruleAnnotationGroup ) ;
    public final void rule__Property__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5939:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5940:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5940:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5941:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAnnotationsAnnotationGroupParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__Property__AnnotationsAssignment_412501);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAnnotationsAnnotationGroupParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Property__AnnotationsAssignment_4"


    // $ANTLR start "rule__Reference__NameAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5950:1: rule__Reference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5954:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5955:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5955:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5956:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_012532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Reference__NameAssignment_0"


    // $ANTLR start "rule__Reference__OptionalAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5965:1: rule__Reference__OptionalAssignment_1 : ( ( '?' ) ) ;
    public final void rule__Reference__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5969:1: ( ( ( '?' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5970:1: ( ( '?' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5970:1: ( ( '?' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5971:1: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getOptionalQuestionMarkKeyword_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5972:1: ( '?' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5973:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getOptionalQuestionMarkKeyword_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Reference__OptionalAssignment_112568); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getOptionalQuestionMarkKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getOptionalQuestionMarkKeyword_1_0()); 
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
    // $ANTLR end "rule__Reference__OptionalAssignment_1"


    // $ANTLR start "rule__Reference__EntityAssignment_3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5988:1: rule__Reference__EntityAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5992:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5993:1: ( ( ruleQualifiedName ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5993:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5994:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_3_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5995:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5996:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getEntityEntityQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Reference__EntityAssignment_312611);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getEntityEntityQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_3_0()); 
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
    // $ANTLR end "rule__Reference__EntityAssignment_3"


    // $ANTLR start "rule__Reference__AnnotationsAssignment_4"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6007:1: rule__Reference__AnnotationsAssignment_4 : ( ruleAnnotationGroup ) ;
    public final void rule__Reference__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6011:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6012:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6012:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6013:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAnnotationsAnnotationGroupParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__Reference__AnnotationsAssignment_412646);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAnnotationsAnnotationGroupParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Reference__AnnotationsAssignment_4"


    // $ANTLR start "rule__ReferenceList__NameAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6022:1: rule__ReferenceList__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ReferenceList__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6026:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6027:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6027:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6028:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceList__NameAssignment_012677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__ReferenceList__NameAssignment_0"


    // $ANTLR start "rule__ReferenceList__ReferenceAssignment_1_0_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6037:1: rule__ReferenceList__ReferenceAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceList__ReferenceAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6041:1: ( ( ( RULE_ID ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6042:1: ( ( RULE_ID ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6042:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6043:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getReferenceReferenceCrossReference_1_0_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6044:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6045:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getReferenceReferenceIDTerminalRuleCall_1_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceList__ReferenceAssignment_1_0_112712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getReferenceReferenceIDTerminalRuleCall_1_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getReferenceReferenceCrossReference_1_0_1_0()); 
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
    // $ANTLR end "rule__ReferenceList__ReferenceAssignment_1_0_1"


    // $ANTLR start "rule__ReferenceList__EntityAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6056:1: rule__ReferenceList__EntityAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ReferenceList__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6060:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6061:1: ( ( ruleQualifiedName ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6061:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6062:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getEntityEntityCrossReference_2_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6063:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6064:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getEntityEntityQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ReferenceList__EntityAssignment_212751);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getEntityEntityQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getEntityEntityCrossReference_2_0()); 
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
    // $ANTLR end "rule__ReferenceList__EntityAssignment_2"


    // $ANTLR start "rule__ReferenceList__AnnotationsAssignment_3"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6075:1: rule__ReferenceList__AnnotationsAssignment_3 : ( ruleAnnotationGroup ) ;
    public final void rule__ReferenceList__AnnotationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6079:1: ( ( ruleAnnotationGroup ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6080:1: ( ruleAnnotationGroup )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6080:1: ( ruleAnnotationGroup )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6081:1: ruleAnnotationGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListAccess().getAnnotationsAnnotationGroupParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_rule__ReferenceList__AnnotationsAssignment_312786);
            ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListAccess().getAnnotationsAnnotationGroupParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ReferenceList__AnnotationsAssignment_3"


    // $ANTLR start "rule__Annotation__TypesAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6090:1: rule__Annotation__TypesAssignment_1 : ( ruleAnnoTypes ) ;
    public final void rule__Annotation__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6094:1: ( ( ruleAnnoTypes ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6095:1: ( ruleAnnoTypes )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6095:1: ( ruleAnnoTypes )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6096:1: ruleAnnoTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getTypesAnnoTypesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnoTypes_in_rule__Annotation__TypesAssignment_112817);
            ruleAnnoTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getTypesAnnoTypesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Annotation__TypesAssignment_1"


    // $ANTLR start "rule__Annotation__InstancesAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6105:1: rule__Annotation__InstancesAssignment_2 : ( ruleAnnotationInstance ) ;
    public final void rule__Annotation__InstancesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6109:1: ( ( ruleAnnotationInstance ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6110:1: ( ruleAnnotationInstance )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6110:1: ( ruleAnnotationInstance )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6111:1: ruleAnnotationInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getInstancesAnnotationInstanceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationInstance_in_rule__Annotation__InstancesAssignment_212848);
            ruleAnnotationInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getInstancesAnnotationInstanceParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Annotation__InstancesAssignment_2"


    // $ANTLR start "rule__Annotation__NameAssignment_5"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6120:1: rule__Annotation__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Annotation__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6124:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6125:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6125:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6126:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_5_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Annotation__NameAssignment_512879); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__Annotation__NameAssignment_5"


    // $ANTLR start "rule__Annotation__MandatoriesAssignment_7"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6135:1: rule__Annotation__MandatoriesAssignment_7 : ( ruleAnnotationMandatoryProperty ) ;
    public final void rule__Annotation__MandatoriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6139:1: ( ( ruleAnnotationMandatoryProperty ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6140:1: ( ruleAnnotationMandatoryProperty )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6140:1: ( ruleAnnotationMandatoryProperty )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6141:1: ruleAnnotationMandatoryProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getMandatoriesAnnotationMandatoryPropertyParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationMandatoryProperty_in_rule__Annotation__MandatoriesAssignment_712910);
            ruleAnnotationMandatoryProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getMandatoriesAnnotationMandatoryPropertyParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Annotation__MandatoriesAssignment_7"


    // $ANTLR start "rule__Annotation__OptionalsAssignment_8"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6150:1: rule__Annotation__OptionalsAssignment_8 : ( ruleAnnotationOptionalProperty ) ;
    public final void rule__Annotation__OptionalsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6154:1: ( ( ruleAnnotationOptionalProperty ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6155:1: ( ruleAnnotationOptionalProperty )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6155:1: ( ruleAnnotationOptionalProperty )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6156:1: ruleAnnotationOptionalProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getOptionalsAnnotationOptionalPropertyParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationOptionalProperty_in_rule__Annotation__OptionalsAssignment_812941);
            ruleAnnotationOptionalProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getOptionalsAnnotationOptionalPropertyParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__Annotation__OptionalsAssignment_8"


    // $ANTLR start "rule__AnnotationMandatoryProperty__NameAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6165:1: rule__AnnotationMandatoryProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AnnotationMandatoryProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6169:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6170:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6170:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6171:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnnotationMandatoryProperty__NameAssignment_012972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__NameAssignment_0"


    // $ANTLR start "rule__AnnotationMandatoryProperty__GroupAssignment_2_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6180:1: rule__AnnotationMandatoryProperty__GroupAssignment_2_0 : ( ruleGroupType ) ;
    public final void rule__AnnotationMandatoryProperty__GroupAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6184:1: ( ( ruleGroupType ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6185:1: ( ruleGroupType )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6185:1: ( ruleGroupType )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6186:1: ruleGroupType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroupGroupTypeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleGroupType_in_rule__AnnotationMandatoryProperty__GroupAssignment_2_013003);
            ruleGroupType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroupGroupTypeParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__GroupAssignment_2_0"


    // $ANTLR start "rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6195:1: rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0 : ( ruleValueType ) ;
    public final void rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6199:1: ( ( ruleValueType ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6200:1: ( ruleValueType )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6200:1: ( ruleValueType )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6201:1: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getTypeValueTypeEnumRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueType_in_rule__AnnotationMandatoryProperty__TypeAssignment_2_1_013034);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getTypeValueTypeEnumRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0"


    // $ANTLR start "rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6210:1: rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1 : ( ( '*' ) ) ;
    public final void rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6214:1: ( ( ( '*' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6215:1: ( ( '*' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6215:1: ( ( '*' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6216:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getMultiAsteriskKeyword_2_1_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6217:1: ( '*' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6218:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationMandatoryPropertyAccess().getMultiAsteriskKeyword_2_1_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__AnnotationMandatoryProperty__MultiAssignment_2_1_113070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getMultiAsteriskKeyword_2_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationMandatoryPropertyAccess().getMultiAsteriskKeyword_2_1_1_0()); 
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
    // $ANTLR end "rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1"


    // $ANTLR start "rule__AnnotationOptionalProperty__NameAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6233:1: rule__AnnotationOptionalProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AnnotationOptionalProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6237:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6238:1: ( RULE_ID )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6238:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6239:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnnotationOptionalProperty__NameAssignment_013109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__NameAssignment_0"


    // $ANTLR start "rule__AnnotationOptionalProperty__GroupAssignment_3_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6248:1: rule__AnnotationOptionalProperty__GroupAssignment_3_0 : ( ruleGroupType ) ;
    public final void rule__AnnotationOptionalProperty__GroupAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6252:1: ( ( ruleGroupType ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6253:1: ( ruleGroupType )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6253:1: ( ruleGroupType )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6254:1: ruleGroupType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getGroupGroupTypeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleGroupType_in_rule__AnnotationOptionalProperty__GroupAssignment_3_013140);
            ruleGroupType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getGroupGroupTypeParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__GroupAssignment_3_0"


    // $ANTLR start "rule__AnnotationOptionalProperty__TypeAssignment_3_1_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6263:1: rule__AnnotationOptionalProperty__TypeAssignment_3_1_0 : ( ruleValueType ) ;
    public final void rule__AnnotationOptionalProperty__TypeAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6267:1: ( ( ruleValueType ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6268:1: ( ruleValueType )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6268:1: ( ruleValueType )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6269:1: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getTypeValueTypeEnumRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueType_in_rule__AnnotationOptionalProperty__TypeAssignment_3_1_013171);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getTypeValueTypeEnumRuleCall_3_1_0_0()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__TypeAssignment_3_1_0"


    // $ANTLR start "rule__AnnotationOptionalProperty__MultiAssignment_3_1_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6278:1: rule__AnnotationOptionalProperty__MultiAssignment_3_1_1 : ( ( '*' ) ) ;
    public final void rule__AnnotationOptionalProperty__MultiAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6282:1: ( ( ( '*' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6283:1: ( ( '*' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6283:1: ( ( '*' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6284:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getMultiAsteriskKeyword_3_1_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6285:1: ( '*' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6286:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationOptionalPropertyAccess().getMultiAsteriskKeyword_3_1_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__AnnotationOptionalProperty__MultiAssignment_3_1_113207); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getMultiAsteriskKeyword_3_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationOptionalPropertyAccess().getMultiAsteriskKeyword_3_1_1_0()); 
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
    // $ANTLR end "rule__AnnotationOptionalProperty__MultiAssignment_3_1_1"


    // $ANTLR start "rule__AnnotationGroup__InstancesAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6301:1: rule__AnnotationGroup__InstancesAssignment_1 : ( ruleAnnotationInstance ) ;
    public final void rule__AnnotationGroup__InstancesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6305:1: ( ( ruleAnnotationInstance ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6306:1: ( ruleAnnotationInstance )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6306:1: ( ruleAnnotationInstance )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6307:1: ruleAnnotationInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationGroupAccess().getInstancesAnnotationInstanceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationInstance_in_rule__AnnotationGroup__InstancesAssignment_113246);
            ruleAnnotationInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationGroupAccess().getInstancesAnnotationInstanceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__AnnotationGroup__InstancesAssignment_1"


    // $ANTLR start "rule__AnnotationInstance__AnnotationAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6316:1: rule__AnnotationInstance__AnnotationAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AnnotationInstance__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6320:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6321:1: ( ( ruleQualifiedName ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6321:1: ( ( ruleQualifiedName ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6322:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getAnnotationAnnotationCrossReference_0_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6323:1: ( ruleQualifiedName )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6324:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getAnnotationAnnotationQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AnnotationInstance__AnnotationAssignment_013281);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getAnnotationAnnotationQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getAnnotationAnnotationCrossReference_0_0()); 
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
    // $ANTLR end "rule__AnnotationInstance__AnnotationAssignment_0"


    // $ANTLR start "rule__AnnotationInstance__ValuesAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6335:1: rule__AnnotationInstance__ValuesAssignment_1 : ( ruleAnnotationValue ) ;
    public final void rule__AnnotationInstance__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6339:1: ( ( ruleAnnotationValue ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6340:1: ( ruleAnnotationValue )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6340:1: ( ruleAnnotationValue )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6341:1: ruleAnnotationValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getValuesAnnotationValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_rule__AnnotationInstance__ValuesAssignment_113316);
            ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getValuesAnnotationValueParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__AnnotationInstance__ValuesAssignment_1"


    // $ANTLR start "rule__AnnotationInstance__PropertiesAssignment_2_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6350:1: rule__AnnotationInstance__PropertiesAssignment_2_1 : ( ruleAnnotationHiddenProperty ) ;
    public final void rule__AnnotationInstance__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6354:1: ( ( ruleAnnotationHiddenProperty ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6355:1: ( ruleAnnotationHiddenProperty )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6355:1: ( ruleAnnotationHiddenProperty )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6356:1: ruleAnnotationHiddenProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationInstanceAccess().getPropertiesAnnotationHiddenPropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationHiddenProperty_in_rule__AnnotationInstance__PropertiesAssignment_2_113347);
            ruleAnnotationHiddenProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationInstanceAccess().getPropertiesAnnotationHiddenPropertyParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__AnnotationInstance__PropertiesAssignment_2_1"


    // $ANTLR start "rule__AnnotationHiddenProperty__PropertyAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6365:1: rule__AnnotationHiddenProperty__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AnnotationHiddenProperty__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6369:1: ( ( ( RULE_ID ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6370:1: ( ( RULE_ID ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6370:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6371:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyAccess().getPropertyAnnotationPropertyCrossReference_0_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6372:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6373:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyAccess().getPropertyAnnotationPropertyIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnnotationHiddenProperty__PropertyAssignment_013382); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyAccess().getPropertyAnnotationPropertyIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyAccess().getPropertyAnnotationPropertyCrossReference_0_0()); 
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
    // $ANTLR end "rule__AnnotationHiddenProperty__PropertyAssignment_0"


    // $ANTLR start "rule__AnnotationHiddenProperty__ValuesAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6384:1: rule__AnnotationHiddenProperty__ValuesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AnnotationHiddenProperty__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6388:1: ( ( ( RULE_ID ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6389:1: ( ( RULE_ID ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6389:1: ( ( RULE_ID ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6390:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyAccess().getValuesAnnotationValueCrossReference_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6391:1: ( RULE_ID )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6392:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationHiddenPropertyAccess().getValuesAnnotationValueIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnnotationHiddenProperty__ValuesAssignment_113421); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyAccess().getValuesAnnotationValueIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationHiddenPropertyAccess().getValuesAnnotationValueCrossReference_1_0()); 
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
    // $ANTLR end "rule__AnnotationHiddenProperty__ValuesAssignment_1"


    // $ANTLR start "rule__GroupType__TypeAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6403:1: rule__GroupType__TypeAssignment_0 : ( ( '#group' ) ) ;
    public final void rule__GroupType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6407:1: ( ( ( '#group' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6408:1: ( ( '#group' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6408:1: ( ( '#group' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6409:1: ( '#group' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupTypeAccess().getTypeGroupKeyword_0_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6410:1: ( '#group' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6411:1: '#group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupTypeAccess().getTypeGroupKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__GroupType__TypeAssignment_013461); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupTypeAccess().getTypeGroupKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupTypeAccess().getTypeGroupKeyword_0_0()); 
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
    // $ANTLR end "rule__GroupType__TypeAssignment_0"


    // $ANTLR start "rule__GroupType__NameAssignment_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6426:1: rule__GroupType__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GroupType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6430:1: ( ( RULE_STRING ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6431:1: ( RULE_STRING )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6431:1: ( RULE_STRING )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6432:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupTypeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GroupType__NameAssignment_113500); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupTypeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__GroupType__NameAssignment_1"


    // $ANTLR start "rule__PackageType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6441:1: rule__PackageType__TypeAssignment : ( ( '#package' ) ) ;
    public final void rule__PackageType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6445:1: ( ( ( '#package' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6446:1: ( ( '#package' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6446:1: ( ( '#package' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6447:1: ( '#package' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageTypeAccess().getTypePackageKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6448:1: ( '#package' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6449:1: '#package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageTypeAccess().getTypePackageKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__PackageType__TypeAssignment13536); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageTypeAccess().getTypePackageKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageTypeAccess().getTypePackageKeyword_0()); 
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
    // $ANTLR end "rule__PackageType__TypeAssignment"


    // $ANTLR start "rule__DataTypeType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6464:1: rule__DataTypeType__TypeAssignment : ( ( '#datatype' ) ) ;
    public final void rule__DataTypeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6468:1: ( ( ( '#datatype' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6469:1: ( ( '#datatype' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6469:1: ( ( '#datatype' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6470:1: ( '#datatype' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeTypeAccess().getTypeDatatypeKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6471:1: ( '#datatype' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6472:1: '#datatype'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeTypeAccess().getTypeDatatypeKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__DataTypeType__TypeAssignment13580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeTypeAccess().getTypeDatatypeKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeTypeAccess().getTypeDatatypeKeyword_0()); 
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
    // $ANTLR end "rule__DataTypeType__TypeAssignment"


    // $ANTLR start "rule__AnnotationType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6487:1: rule__AnnotationType__TypeAssignment : ( ( '#annotation' ) ) ;
    public final void rule__AnnotationType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6491:1: ( ( ( '#annotation' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6492:1: ( ( '#annotation' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6492:1: ( ( '#annotation' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6493:1: ( '#annotation' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationTypeAccess().getTypeAnnotationKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6494:1: ( '#annotation' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6495:1: '#annotation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationTypeAccess().getTypeAnnotationKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__AnnotationType__TypeAssignment13624); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationTypeAccess().getTypeAnnotationKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationTypeAccess().getTypeAnnotationKeyword_0()); 
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
    // $ANTLR end "rule__AnnotationType__TypeAssignment"


    // $ANTLR start "rule__EntityType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6510:1: rule__EntityType__TypeAssignment : ( ( '#entity' ) ) ;
    public final void rule__EntityType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6514:1: ( ( ( '#entity' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6515:1: ( ( '#entity' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6515:1: ( ( '#entity' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6516:1: ( '#entity' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeAccess().getTypeEntityKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6517:1: ( '#entity' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6518:1: '#entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityTypeAccess().getTypeEntityKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__EntityType__TypeAssignment13668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeAccess().getTypeEntityKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityTypeAccess().getTypeEntityKeyword_0()); 
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
    // $ANTLR end "rule__EntityType__TypeAssignment"


    // $ANTLR start "rule__PropertyType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6533:1: rule__PropertyType__TypeAssignment : ( ( '#property' ) ) ;
    public final void rule__PropertyType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6537:1: ( ( ( '#property' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6538:1: ( ( '#property' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6538:1: ( ( '#property' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6539:1: ( '#property' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyTypeAccess().getTypePropertyKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6540:1: ( '#property' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6541:1: '#property'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyTypeAccess().getTypePropertyKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__PropertyType__TypeAssignment13712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyTypeAccess().getTypePropertyKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyTypeAccess().getTypePropertyKeyword_0()); 
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
    // $ANTLR end "rule__PropertyType__TypeAssignment"


    // $ANTLR start "rule__ReferenceType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6556:1: rule__ReferenceType__TypeAssignment : ( ( '#reference' ) ) ;
    public final void rule__ReferenceType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6560:1: ( ( ( '#reference' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6561:1: ( ( '#reference' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6561:1: ( ( '#reference' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6562:1: ( '#reference' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceTypeAccess().getTypeReferenceKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6563:1: ( '#reference' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6564:1: '#reference'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceTypeAccess().getTypeReferenceKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__ReferenceType__TypeAssignment13756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceTypeAccess().getTypeReferenceKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceTypeAccess().getTypeReferenceKeyword_0()); 
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
    // $ANTLR end "rule__ReferenceType__TypeAssignment"


    // $ANTLR start "rule__ReferenceListType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6579:1: rule__ReferenceListType__TypeAssignment : ( ( '#reference-list' ) ) ;
    public final void rule__ReferenceListType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6583:1: ( ( ( '#reference-list' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6584:1: ( ( '#reference-list' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6584:1: ( ( '#reference-list' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6585:1: ( '#reference-list' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListTypeAccess().getTypeReferenceListKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6586:1: ( '#reference-list' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6587:1: '#reference-list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceListTypeAccess().getTypeReferenceListKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__ReferenceListType__TypeAssignment13800); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListTypeAccess().getTypeReferenceListKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceListTypeAccess().getTypeReferenceListKeyword_0()); 
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
    // $ANTLR end "rule__ReferenceListType__TypeAssignment"


    // $ANTLR start "rule__ParentType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6602:1: rule__ParentType__TypeAssignment : ( ( '#parent' ) ) ;
    public final void rule__ParentType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6606:1: ( ( ( '#parent' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6607:1: ( ( '#parent' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6607:1: ( ( '#parent' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6608:1: ( '#parent' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentTypeAccess().getTypeParentKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6609:1: ( '#parent' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6610:1: '#parent'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentTypeAccess().getTypeParentKeyword_0()); 
            }
            match(input,52,FOLLOW_52_in_rule__ParentType__TypeAssignment13844); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentTypeAccess().getTypeParentKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentTypeAccess().getTypeParentKeyword_0()); 
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
    // $ANTLR end "rule__ParentType__TypeAssignment"


    // $ANTLR start "rule__ChildType__TypeAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6625:1: rule__ChildType__TypeAssignment : ( ( '#child' ) ) ;
    public final void rule__ChildType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6629:1: ( ( ( '#child' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6630:1: ( ( '#child' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6630:1: ( ( '#child' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6631:1: ( '#child' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildTypeAccess().getTypeChildKeyword_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6632:1: ( '#child' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6633:1: '#child'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildTypeAccess().getTypeChildKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__ChildType__TypeAssignment13888); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildTypeAccess().getTypeChildKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildTypeAccess().getTypeChildKeyword_0()); 
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
    // $ANTLR end "rule__ChildType__TypeAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6648:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6652:1: ( ( RULE_STRING ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6653:1: ( RULE_STRING )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6653:1: ( RULE_STRING )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6654:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment13927); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6663:1: rule__IntegerValue__ValueAssignment : ( ruleInteger ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6667:1: ( ( ruleInteger ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6668:1: ( ruleInteger )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6668:1: ( ruleInteger )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6669:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_rule__IntegerValue__ValueAssignment13958);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_0()); 
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
    // $ANTLR end "rule__IntegerValue__ValueAssignment"


    // $ANTLR start "rule__DoubleValue__ValueAssignment"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6678:1: rule__DoubleValue__ValueAssignment : ( ruleDouble ) ;
    public final void rule__DoubleValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6682:1: ( ( ruleDouble ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6683:1: ( ruleDouble )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6683:1: ( ruleDouble )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6684:1: ruleDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueAccess().getValueDoubleParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_rule__DoubleValue__ValueAssignment13989);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleValueAccess().getValueDoubleParserRuleCall_0()); 
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
    // $ANTLR end "rule__DoubleValue__ValueAssignment"


    // $ANTLR start "rule__RangeValue__FromAssignment_0_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6693:1: rule__RangeValue__FromAssignment_0_0 : ( ruleInteger ) ;
    public final void rule__RangeValue__FromAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6697:1: ( ( ruleInteger ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6698:1: ( ruleInteger )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6698:1: ( ruleInteger )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6699:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getFromIntegerParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_rule__RangeValue__FromAssignment_0_014020);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getFromIntegerParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__RangeValue__FromAssignment_0_0"


    // $ANTLR start "rule__RangeValue__FromInfAssignment_0_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6708:1: rule__RangeValue__FromInfAssignment_0_1 : ( ( '*' ) ) ;
    public final void rule__RangeValue__FromInfAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6712:1: ( ( ( '*' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6713:1: ( ( '*' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6713:1: ( ( '*' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6714:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getFromInfAsteriskKeyword_0_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6715:1: ( '*' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6716:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getFromInfAsteriskKeyword_0_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__RangeValue__FromInfAssignment_0_114056); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getFromInfAsteriskKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getFromInfAsteriskKeyword_0_1_0()); 
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
    // $ANTLR end "rule__RangeValue__FromInfAssignment_0_1"


    // $ANTLR start "rule__RangeValue__ToAssignment_2_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6731:1: rule__RangeValue__ToAssignment_2_0 : ( ruleInteger ) ;
    public final void rule__RangeValue__ToAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6735:1: ( ( ruleInteger ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6736:1: ( ruleInteger )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6736:1: ( ruleInteger )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6737:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getToIntegerParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_rule__RangeValue__ToAssignment_2_014095);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getToIntegerParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__RangeValue__ToAssignment_2_0"


    // $ANTLR start "rule__RangeValue__ToInfAssignment_2_1"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6746:1: rule__RangeValue__ToInfAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__RangeValue__ToInfAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6750:1: ( ( ( '*' ) ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6751:1: ( ( '*' ) )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6751:1: ( ( '*' ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6752:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getToInfAsteriskKeyword_2_1_0()); 
            }
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6753:1: ( '*' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6754:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeValueAccess().getToInfAsteriskKeyword_2_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__RangeValue__ToInfAssignment_2_114131); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getToInfAsteriskKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeValueAccess().getToInfAsteriskKeyword_2_1_0()); 
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
    // $ANTLR end "rule__RangeValue__ToInfAssignment_2_1"


    // $ANTLR start "rule__FormatRangeValue__FromAssignment_0"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6769:1: rule__FormatRangeValue__FromAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormatRangeValue__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6773:1: ( ( RULE_STRING ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6774:1: ( RULE_STRING )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6774:1: ( RULE_STRING )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6775:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRangeValueAccess().getFromSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormatRangeValue__FromAssignment_014170); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRangeValueAccess().getFromSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__FormatRangeValue__FromAssignment_0"


    // $ANTLR start "rule__FormatRangeValue__ToAssignment_2"
    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6784:1: rule__FormatRangeValue__ToAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FormatRangeValue__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6788:1: ( ( RULE_STRING ) )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6789:1: ( RULE_STRING )
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6789:1: ( RULE_STRING )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6790:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormatRangeValueAccess().getToSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FormatRangeValue__ToAssignment_214201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormatRangeValueAccess().getToSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__FormatRangeValue__ToAssignment_2"

    // $ANTLR start synpred1_InternalModelDsl
    public final void synpred1_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1391:1: ( ( ruleType ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1391:1: ( ruleType )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1391:1: ( ruleType )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1392:1: ruleType
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleType_in_synpred1_InternalModelDsl2892);
        ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalModelDsl

    // $ANTLR start synpred2_InternalModelDsl
    public final void synpred2_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1397:6: ( ( ruleAnnotation ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1397:6: ( ruleAnnotation )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1397:6: ( ruleAnnotation )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1398:1: ruleAnnotation
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getElementAccess().getAnnotationParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleAnnotation_in_synpred2_InternalModelDsl2909);
        ruleAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalModelDsl

    // $ANTLR start synpred3_InternalModelDsl
    public final void synpred3_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1419:1: ( ( ruleEntity ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1419:1: ( ruleEntity )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1419:1: ( ruleEntity )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1420:1: ruleEntity
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleEntity_in_synpred3_InternalModelDsl2958);
        ruleEntity();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalModelDsl

    // $ANTLR start synpred59_InternalModelDsl
    public final void synpred59_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4604:2: ( rule__AnnotationHiddenProperty__ValuesAssignment_1 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:4604:2: rule__AnnotationHiddenProperty__ValuesAssignment_1
        {
        pushFollow(FOLLOW_rule__AnnotationHiddenProperty__ValuesAssignment_1_in_synpred59_InternalModelDsl9444);
        rule__AnnotationHiddenProperty__ValuesAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalModelDsl

    // $ANTLR start synpred63_InternalModelDsl
    public final void synpred63_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5218:2: ( rule__EntityElements__UnorderedGroup_1__0 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5218:2: rule__EntityElements__UnorderedGroup_1__0
        {
        pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__0_in_synpred63_InternalModelDsl10647);
        rule__EntityElements__UnorderedGroup_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalModelDsl

    // $ANTLR start synpred64_InternalModelDsl
    public final void synpred64_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5252:8: ( rule__EntityElements__ChildsAssignment_1_0 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5252:9: rule__EntityElements__ChildsAssignment_1_0
        {
        pushFollow(FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_synpred64_InternalModelDsl10776);
        rule__EntityElements__ChildsAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalModelDsl

    // $ANTLR start synpred65_InternalModelDsl
    public final void synpred65_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5236:4: ( ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5236:4: ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5236:4: ({...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5237:5: {...}? => ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred65_InternalModelDsl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0)");
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5237:111: ( ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5238:6: ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0);
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5244:6: ( ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5245:6: ( ( rule__EntityElements__ChildsAssignment_1_0 ) ) ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5245:6: ( ( rule__EntityElements__ChildsAssignment_1_0 ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5246:7: ( rule__EntityElements__ChildsAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEntityElementsAccess().getChildsAssignment_1_0()); 
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5247:7: ( rule__EntityElements__ChildsAssignment_1_0 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5247:8: rule__EntityElements__ChildsAssignment_1_0
        {
        pushFollow(FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_synpred65_InternalModelDsl10735);
        rule__EntityElements__ChildsAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5250:6: ( ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )* )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5251:7: ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEntityElementsAccess().getChildsAssignment_1_0()); 
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5252:7: ( ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0 )*
        loop55:
        do {
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==27) && (synpred64_InternalModelDsl())) {
                alt55=1;
            }


            switch (alt55) {
        	case 1 :
        	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5252:8: ( rule__EntityElements__ChildsAssignment_1_0 )=> rule__EntityElements__ChildsAssignment_1_0
        	    {
        	    pushFollow(FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_synpred65_InternalModelDsl10779);
        	    rule__EntityElements__ChildsAssignment_1_0();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop55;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred65_InternalModelDsl

    // $ANTLR start synpred66_InternalModelDsl
    public final void synpred66_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5274:8: ( rule__EntityElements__PropertiesAssignment_1_1 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5274:9: rule__EntityElements__PropertiesAssignment_1_1
        {
        pushFollow(FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_synpred66_InternalModelDsl10919);
        rule__EntityElements__PropertiesAssignment_1_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalModelDsl

    // $ANTLR start synpred67_InternalModelDsl
    public final void synpred67_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5258:4: ( ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5258:4: ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5258:4: ({...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5259:5: {...}? => ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred67_InternalModelDsl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1)");
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5259:111: ( ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5260:6: ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1);
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5266:6: ( ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5267:6: ( ( rule__EntityElements__PropertiesAssignment_1_1 ) ) ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5267:6: ( ( rule__EntityElements__PropertiesAssignment_1_1 ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5268:7: ( rule__EntityElements__PropertiesAssignment_1_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEntityElementsAccess().getPropertiesAssignment_1_1()); 
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5269:7: ( rule__EntityElements__PropertiesAssignment_1_1 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5269:8: rule__EntityElements__PropertiesAssignment_1_1
        {
        pushFollow(FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_synpred67_InternalModelDsl10878);
        rule__EntityElements__PropertiesAssignment_1_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5272:6: ( ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )* )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5273:7: ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEntityElementsAccess().getPropertiesAssignment_1_1()); 
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5274:7: ( ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1 )*
        loop56:
        do {
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) && (synpred66_InternalModelDsl())) {
                alt56=1;
            }


            switch (alt56) {
        	case 1 :
        	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5274:8: ( rule__EntityElements__PropertiesAssignment_1_1 )=> rule__EntityElements__PropertiesAssignment_1_1
        	    {
        	    pushFollow(FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_synpred67_InternalModelDsl10922);
        	    rule__EntityElements__PropertiesAssignment_1_1();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop56;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred67_InternalModelDsl

    // $ANTLR start synpred68_InternalModelDsl
    public final void synpred68_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5296:8: ( rule__EntityElements__ReferencesAssignment_1_2 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5296:9: rule__EntityElements__ReferencesAssignment_1_2
        {
        pushFollow(FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_synpred68_InternalModelDsl11062);
        rule__EntityElements__ReferencesAssignment_1_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalModelDsl

    // $ANTLR start synpred69_InternalModelDsl
    public final void synpred69_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5280:4: ( ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5280:4: ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5280:4: ({...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5281:5: {...}? => ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred69_InternalModelDsl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2)");
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5281:111: ( ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5282:6: ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2);
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5288:6: ( ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5289:6: ( ( rule__EntityElements__ReferencesAssignment_1_2 ) ) ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* )
        {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5289:6: ( ( rule__EntityElements__ReferencesAssignment_1_2 ) )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5290:7: ( rule__EntityElements__ReferencesAssignment_1_2 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEntityElementsAccess().getReferencesAssignment_1_2()); 
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5291:7: ( rule__EntityElements__ReferencesAssignment_1_2 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5291:8: rule__EntityElements__ReferencesAssignment_1_2
        {
        pushFollow(FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_synpred69_InternalModelDsl11021);
        rule__EntityElements__ReferencesAssignment_1_2();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5294:6: ( ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )* )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5295:7: ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEntityElementsAccess().getReferencesAssignment_1_2()); 
        }
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5296:7: ( ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2 )*
        loop57:
        do {
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) && (synpred68_InternalModelDsl())) {
                alt57=1;
            }


            switch (alt57) {
        	case 1 :
        	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5296:8: ( rule__EntityElements__ReferencesAssignment_1_2 )=> rule__EntityElements__ReferencesAssignment_1_2
        	    {
        	    pushFollow(FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_synpred69_InternalModelDsl11065);
        	    rule__EntityElements__ReferencesAssignment_1_2();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop57;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred69_InternalModelDsl

    // $ANTLR start synpred70_InternalModelDsl
    public final void synpred70_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5318:8: ( rule__EntityElements__ReferenceListsAssignment_1_3 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5318:9: rule__EntityElements__ReferenceListsAssignment_1_3
        {
        pushFollow(FOLLOW_rule__EntityElements__ReferenceListsAssignment_1_3_in_synpred70_InternalModelDsl11205);
        rule__EntityElements__ReferenceListsAssignment_1_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalModelDsl

    // $ANTLR start synpred71_InternalModelDsl
    public final void synpred71_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5339:2: ( rule__EntityElements__UnorderedGroup_1__1 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5339:2: rule__EntityElements__UnorderedGroup_1__1
        {
        pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__1_in_synpred71_InternalModelDsl11277);
        rule__EntityElements__UnorderedGroup_1__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalModelDsl

    // $ANTLR start synpred72_InternalModelDsl
    public final void synpred72_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5352:2: ( rule__EntityElements__UnorderedGroup_1__2 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5352:2: rule__EntityElements__UnorderedGroup_1__2
        {
        pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__2_in_synpred72_InternalModelDsl11305);
        rule__EntityElements__UnorderedGroup_1__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalModelDsl

    // $ANTLR start synpred73_InternalModelDsl
    public final void synpred73_InternalModelDsl_fragment() throws RecognitionException {   
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5365:2: ( rule__EntityElements__UnorderedGroup_1__3 )
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:5365:2: rule__EntityElements__UnorderedGroup_1__3
        {
        pushFollow(FOLLOW_rule__EntityElements__UnorderedGroup_1__3_in_synpred73_InternalModelDsl11333);
        rule__EntityElements__UnorderedGroup_1__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalModelDsl

    // Delegated rules

    public final boolean synpred2_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeField_in_entryRuleDataTypeField427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeField434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeField__Alternatives_in_ruleDataTypeField460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternType_in_entryRulePatternType487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternType494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternType__Alternatives_in_rulePatternType520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityGroup_in_entryRuleEntityGroup607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityGroup614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__0_in_ruleEntityGroup640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityElements_in_entryRuleEntityElements667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityElements674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__Group__0_in_ruleEntityElements700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Alternatives_in_ruleContainer760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_in_ruleField820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParent_in_entryRuleParent847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParent854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parent__Group__0_in_ruleParent880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_entryRuleChild907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChild914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Child__Group__0_in_ruleChild940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceList_in_entryRuleReferenceList1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceList1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__0_in_ruleReferenceList1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationMandatoryProperty_in_entryRuleAnnotationMandatoryProperty1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationMandatoryProperty1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group__0_in_ruleAnnotationMandatoryProperty1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationOptionalProperty_in_entryRuleAnnotationOptionalProperty1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationOptionalProperty1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__0_in_ruleAnnotationOptionalProperty1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_entryRuleAnnotationGroup1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationGroup1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__Group__0_in_ruleAnnotationGroup1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationInstance_in_entryRuleAnnotationInstance1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationInstance1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group__0_in_ruleAnnotationInstance1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationHiddenProperty_in_entryRuleAnnotationHiddenProperty1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationHiddenProperty1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationHiddenProperty__Group__0_in_ruleAnnotationHiddenProperty1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValue__Alternatives_in_ruleAnnotationValue1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupType_in_entryRuleGroupType1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupType1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupType__Group__0_in_ruleGroupType1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageType_in_entryRulePackageType1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageType1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageType__TypeAssignment_in_rulePackageType1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeType_in_entryRuleDataTypeType1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeType1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeType__TypeAssignment_in_ruleDataTypeType1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationType__TypeAssignment_in_ruleAnnotationType1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType1809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__TypeAssignment_in_ruleEntityType1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_entryRulePropertyType1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyType1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__TypeAssignment_in_rulePropertyType1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceType_in_entryRuleReferenceType1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceType1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceType__TypeAssignment_in_ruleReferenceType1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceListType_in_entryRuleReferenceListType1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceListType1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceListType__TypeAssignment_in_ruleReferenceListType2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentType_in_entryRuleParentType2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentType2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParentType__TypeAssignment_in_ruleParentType2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildType_in_entryRuleChildType2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildType2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChildType__TypeAssignment_in_ruleChildType2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnoTypes_in_entryRuleAnnoTypes2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnoTypes2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnoTypes__Alternatives_in_ruleAnnoTypes2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_in_ruleIntegerValue2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue2349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleValue__ValueAssignment_in_ruleDoubleValue2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeValue_in_entryRuleRangeValue2414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeValue2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__Group__0_in_ruleRangeValue2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormatRangeValue_in_entryRuleFormatRangeValue2483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormatRangeValue2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__Group__0_in_ruleFormatRangeValue2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger2607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0_in_ruleDouble2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__Alternatives_in_ruleValueType2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Element__Alternatives2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Element__Alternatives2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Element__Alternatives2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeField__Group_0__0_in_rule__DataTypeField__Alternatives3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeField__TypeAssignment_1_in_rule__DataTypeField__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternType__REGEXAssignment_0_in_rule__PatternType__Alternatives3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternType__DATEAssignment_1_in_rule__PatternType__Alternatives3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PatternType__NUMBERAssignment_2_in_rule__PatternType__Alternatives3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParent_in_rule__Container__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_rule__Container__Alternatives3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Field__Alternatives3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Field__Alternatives3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceList_in_rule__Field__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group_1_0__0_in_rule__ReferenceList__Alternatives_13242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ReferenceList__Alternatives_13261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__GroupAssignment_2_0_in_rule__AnnotationMandatoryProperty__Alternatives_23295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__0_in_rule__AnnotationMandatoryProperty__Alternatives_23313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__GroupAssignment_3_0_in_rule__AnnotationOptionalProperty__Alternatives_33346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__0_in_rule__AnnotationOptionalProperty__Alternatives_33364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__AnnotationValue__Alternatives3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__AnnotationValue__Alternatives3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupType_in_rule__AnnoTypes__Alternatives3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageType_in_rule__AnnoTypes__Alternatives3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeType_in_rule__AnnoTypes__Alternatives3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_rule__AnnoTypes__Alternatives3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__AnnoTypes__Alternatives3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_rule__AnnoTypes__Alternatives3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceType_in_rule__AnnoTypes__Alternatives3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceListType_in_rule__AnnoTypes__Alternatives3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentType_in_rule__AnnoTypes__Alternatives3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildType_in_rule__AnnoTypes__Alternatives3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__FromAssignment_0_0_in_rule__RangeValue__Alternatives_03632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__FromInfAssignment_0_1_in_rule__RangeValue__Alternatives_03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__ToAssignment_2_0_in_rule__RangeValue__Alternatives_23683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__ToInfAssignment_2_1_in_rule__RangeValue__Alternatives_23701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_rule__Value__Alternatives3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_rule__Value__Alternatives3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeValue_in_rule__Value__Alternatives3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormatRangeValue_in_rule__Value__Alternatives3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ValueType__Alternatives3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ValueType__Alternatives3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ValueType__Alternatives3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ValueType__Alternatives3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ValueType__Alternatives3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03954 = new BitSet(new long[]{0x0000000101900000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl3984 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__14015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_1_in_rule__Model__Group__1__Impl4042 = new BitSet(new long[]{0x0000000101900002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__04200 = new BitSet(new long[]{0x0000000101900000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__04203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__AnnotationsAssignment_0_in_rule__Package__Group__0__Impl4230 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__14261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__14264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Package__Group__1__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__24323 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__24326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__34383 = new BitSet(new long[]{0x0000000101D00000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__34386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Package__Group__3__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__44445 = new BitSet(new long[]{0x0000000101D00000L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__44448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__ElementsAssignment_4_in_rule__Package__Group__4__Impl4475 = new BitSet(new long[]{0x0000000101900002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__54506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Package__Group__5__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__04577 = new BitSet(new long[]{0x0000000101800000L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__04580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_0_in_rule__DataType__Group__0__Impl4607 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__14638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__14641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Group__1__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24700 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34760 = new BitSet(new long[]{0x0000070000400020L});
    public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataType__Group__3__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44822 = new BitSet(new long[]{0x0000070000400020L});
    public static final BitSet FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__44825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__FormatedFieldsAssignment_4_in_rule__DataType__Group__4__Impl4852 = new BitSet(new long[]{0x0000070000000022L});
    public static final BitSet FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__54883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Group__5__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeField__Group_0__0__Impl_in_rule__DataTypeField__Group_0__04954 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataTypeField__Group_0__1_in_rule__DataTypeField__Group_0__04957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeField__PatternAssignment_0_0_in_rule__DataTypeField__Group_0__0__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeField__Group_0__1__Impl_in_rule__DataTypeField__Group_0__15014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeField__FormatAssignment_0_1_in_rule__DataTypeField__Group_0__1__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__05075 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__05078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_0_in_rule__Entity__Group__0__Impl5105 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__15136 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__15139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group__1__Impl5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__25198 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__25201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__35258 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__35261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__3__Impl5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__45320 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__45323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ParentAssignment_4_in_rule__Entity__Group__4__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__55381 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__55384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ElementsAssignment_5_in_rule__Entity__Group__5__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__65441 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__65444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__GroupsAssignment_6_in_rule__Entity__Group__6__Impl5471 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__75502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group__7__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__0__Impl_in_rule__EntityGroup__Group__05577 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__1_in_rule__EntityGroup__Group__05580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EntityGroup__Group__0__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__1__Impl_in_rule__EntityGroup__Group__15639 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__2_in_rule__EntityGroup__Group__15642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__NameAssignment_1_in_rule__EntityGroup__Group__1__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__2__Impl_in_rule__EntityGroup__Group__25699 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__3_in_rule__EntityGroup__Group__25702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityGroup__Group__2__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__3__Impl_in_rule__EntityGroup__Group__35761 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__4_in_rule__EntityGroup__Group__35764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__ElementsAssignment_3_in_rule__EntityGroup__Group__3__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityGroup__Group__4__Impl_in_rule__EntityGroup__Group__45821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityGroup__Group__4__Impl5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__Group__0__Impl_in_rule__EntityElements__Group__05890 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_rule__EntityElements__Group__1_in_rule__EntityElements__Group__05893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__Group__1__Impl_in_rule__EntityElements__Group__15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1_in_rule__EntityElements__Group__1__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parent__Group__0__Impl_in_rule__Parent__Group__06012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parent__Group__1_in_rule__Parent__Group__06015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Parent__Group__0__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parent__Group__1__Impl_in_rule__Parent__Group__16074 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Parent__Group__2_in_rule__Parent__Group__16077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parent__TypeAssignment_1_in_rule__Parent__Group__1__Impl6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parent__Group__2__Impl_in_rule__Parent__Group__26134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parent__AnnotationsAssignment_2_in_rule__Parent__Group__2__Impl6161 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Child__Group__0__Impl_in_rule__Child__Group__06198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Child__Group__1_in_rule__Child__Group__06201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Child__Group__0__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Child__Group__1__Impl_in_rule__Child__Group__16260 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Child__Group__2_in_rule__Child__Group__16263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Child__TypeAssignment_1_in_rule__Child__Group__1__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Child__Group__2__Impl_in_rule__Child__Group__26320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Child__AnnotationsAssignment_2_in_rule__Child__Group__2__Impl6347 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06384 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__0__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__16444 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__OptionalAssignment_1_in_rule__Property__Group__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__26505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Property__Group__2__Impl6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__36567 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_3_in_rule__Property__Group__3__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__46627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__AnnotationsAssignment_4_in_rule__Property__Group__4__Impl6654 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__06695 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__06698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_0_in_rule__Reference__Group__0__Impl6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__16755 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__16758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OptionalAssignment_1_in_rule__Reference__Group__1__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__26816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__26819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Reference__Group__2__Impl6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__36878 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__36881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__EntityAssignment_3_in_rule__Reference__Group__3__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__46938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__AnnotationsAssignment_4_in_rule__Reference__Group__4__Impl6965 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__0__Impl_in_rule__ReferenceList__Group__07006 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__1_in_rule__ReferenceList__Group__07009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__NameAssignment_0_in_rule__ReferenceList__Group__0__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__1__Impl_in_rule__ReferenceList__Group__17066 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__2_in_rule__ReferenceList__Group__17069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Alternatives_1_in_rule__ReferenceList__Group__1__Impl7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__2__Impl_in_rule__ReferenceList__Group__27126 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__3_in_rule__ReferenceList__Group__27129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__EntityAssignment_2_in_rule__ReferenceList__Group__2__Impl7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group__3__Impl_in_rule__ReferenceList__Group__37186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__AnnotationsAssignment_3_in_rule__ReferenceList__Group__3__Impl7213 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group_1_0__0__Impl_in_rule__ReferenceList__Group_1_0__07252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group_1_0__1_in_rule__ReferenceList__Group_1_0__07255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ReferenceList__Group_1_0__0__Impl7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group_1_0__1__Impl_in_rule__ReferenceList__Group_1_0__17314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group_1_0__2_in_rule__ReferenceList__Group_1_0__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__ReferenceAssignment_1_0_1_in_rule__ReferenceList__Group_1_0__1__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceList__Group_1_0__2__Impl_in_rule__ReferenceList__Group_1_0__27374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ReferenceList__Group_1_0__2__Impl7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__07439 = new BitSet(new long[]{0x003FF00000000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__07442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Annotation__Group__0__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__17501 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__17504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__TypesAssignment_1_in_rule__Annotation__Group__1__Impl7533 = new BitSet(new long[]{0x003FF00000000002L});
    public static final BitSet FOLLOW_rule__Annotation__TypesAssignment_1_in_rule__Annotation__Group__1__Impl7545 = new BitSet(new long[]{0x003FF00000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__27578 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__27581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__InstancesAssignment_2_in_rule__Annotation__Group__2__Impl7608 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__37639 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__4_in_rule__Annotation__Group__37642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Annotation__Group__3__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__4__Impl_in_rule__Annotation__Group__47701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__5_in_rule__Annotation__Group__47704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Annotation__Group__4__Impl7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__5__Impl_in_rule__Annotation__Group__57763 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__6_in_rule__Annotation__Group__57766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_5_in_rule__Annotation__Group__5__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__6__Impl_in_rule__Annotation__Group__67823 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__7_in_rule__Annotation__Group__67826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Annotation__Group__6__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__7__Impl_in_rule__Annotation__Group__77885 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__8_in_rule__Annotation__Group__77888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__MandatoriesAssignment_7_in_rule__Annotation__Group__7__Impl7915 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Annotation__Group__8__Impl_in_rule__Annotation__Group__87946 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__9_in_rule__Annotation__Group__87949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__OptionalsAssignment_8_in_rule__Annotation__Group__8__Impl7976 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Annotation__Group__9__Impl_in_rule__Annotation__Group__98007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Annotation__Group__9__Impl8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group__0__Impl_in_rule__AnnotationMandatoryProperty__Group__08086 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group__1_in_rule__AnnotationMandatoryProperty__Group__08089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__NameAssignment_0_in_rule__AnnotationMandatoryProperty__Group__0__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group__1__Impl_in_rule__AnnotationMandatoryProperty__Group__18146 = new BitSet(new long[]{0x000010000007C000L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group__2_in_rule__AnnotationMandatoryProperty__Group__18149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AnnotationMandatoryProperty__Group__1__Impl8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group__2__Impl_in_rule__AnnotationMandatoryProperty__Group__28208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Alternatives_2_in_rule__AnnotationMandatoryProperty__Group__2__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__0__Impl_in_rule__AnnotationMandatoryProperty__Group_2_1__08271 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__1_in_rule__AnnotationMandatoryProperty__Group_2_1__08274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__TypeAssignment_2_1_0_in_rule__AnnotationMandatoryProperty__Group_2_1__0__Impl8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__Group_2_1__1__Impl_in_rule__AnnotationMandatoryProperty__Group_2_1__18331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationMandatoryProperty__MultiAssignment_2_1_1_in_rule__AnnotationMandatoryProperty__Group_2_1__1__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__0__Impl_in_rule__AnnotationOptionalProperty__Group__08393 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__1_in_rule__AnnotationOptionalProperty__Group__08396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__NameAssignment_0_in_rule__AnnotationOptionalProperty__Group__0__Impl8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__1__Impl_in_rule__AnnotationOptionalProperty__Group__18453 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__2_in_rule__AnnotationOptionalProperty__Group__18456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AnnotationOptionalProperty__Group__1__Impl8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__2__Impl_in_rule__AnnotationOptionalProperty__Group__28515 = new BitSet(new long[]{0x000010000007C000L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__3_in_rule__AnnotationOptionalProperty__Group__28518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AnnotationOptionalProperty__Group__2__Impl8546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group__3__Impl_in_rule__AnnotationOptionalProperty__Group__38577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Alternatives_3_in_rule__AnnotationOptionalProperty__Group__3__Impl8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__0__Impl_in_rule__AnnotationOptionalProperty__Group_3_1__08642 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__1_in_rule__AnnotationOptionalProperty__Group_3_1__08645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__TypeAssignment_3_1_0_in_rule__AnnotationOptionalProperty__Group_3_1__0__Impl8672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__Group_3_1__1__Impl_in_rule__AnnotationOptionalProperty__Group_3_1__18702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationOptionalProperty__MultiAssignment_3_1_1_in_rule__AnnotationOptionalProperty__Group_3_1__1__Impl8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__Group__0__Impl_in_rule__AnnotationGroup__Group__08764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__Group__1_in_rule__AnnotationGroup__Group__08767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AnnotationGroup__Group__0__Impl8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__Group__1__Impl_in_rule__AnnotationGroup__Group__18826 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__Group__2_in_rule__AnnotationGroup__Group__18829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__InstancesAssignment_1_in_rule__AnnotationGroup__Group__1__Impl8858 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__InstancesAssignment_1_in_rule__AnnotationGroup__Group__1__Impl8870 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__AnnotationGroup__Group__2__Impl_in_rule__AnnotationGroup__Group__28903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AnnotationGroup__Group__2__Impl8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group__0__Impl_in_rule__AnnotationInstance__Group__08968 = new BitSet(new long[]{0x0000081140000090L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group__1_in_rule__AnnotationInstance__Group__08971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__AnnotationAssignment_0_in_rule__AnnotationInstance__Group__0__Impl8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group__1__Impl_in_rule__AnnotationInstance__Group__19028 = new BitSet(new long[]{0x0000081140000090L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group__2_in_rule__AnnotationInstance__Group__19031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__ValuesAssignment_1_in_rule__AnnotationInstance__Group__1__Impl9058 = new BitSet(new long[]{0x0000080140000092L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group__2__Impl_in_rule__AnnotationInstance__Group__29089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group_2__0_in_rule__AnnotationInstance__Group__2__Impl9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group_2__0__Impl_in_rule__AnnotationInstance__Group_2__09153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group_2__1_in_rule__AnnotationInstance__Group_2__09156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AnnotationInstance__Group_2__0__Impl9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group_2__1__Impl_in_rule__AnnotationInstance__Group_2__19215 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group_2__2_in_rule__AnnotationInstance__Group_2__19218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__PropertiesAssignment_2_1_in_rule__AnnotationInstance__Group_2__1__Impl9247 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__PropertiesAssignment_2_1_in_rule__AnnotationInstance__Group_2__1__Impl9259 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__AnnotationInstance__Group_2__2__Impl_in_rule__AnnotationInstance__Group_2__29292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AnnotationInstance__Group_2__2__Impl9320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationHiddenProperty__Group__0__Impl_in_rule__AnnotationHiddenProperty__Group__09357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AnnotationHiddenProperty__Group__1_in_rule__AnnotationHiddenProperty__Group__09360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationHiddenProperty__PropertyAssignment_0_in_rule__AnnotationHiddenProperty__Group__0__Impl9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationHiddenProperty__Group__1__Impl_in_rule__AnnotationHiddenProperty__Group__19417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationHiddenProperty__ValuesAssignment_1_in_rule__AnnotationHiddenProperty__Group__1__Impl9444 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__GroupType__Group__0__Impl_in_rule__GroupType__Group__09479 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__GroupType__Group__1_in_rule__GroupType__Group__09482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupType__TypeAssignment_0_in_rule__GroupType__Group__0__Impl9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupType__Group__1__Impl_in_rule__GroupType__Group__19539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupType__NameAssignment_1_in_rule__GroupType__Group__1__Impl9566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__Group__0__Impl_in_rule__RangeValue__Group__09600 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__RangeValue__Group__1_in_rule__RangeValue__Group__09603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__Alternatives_0_in_rule__RangeValue__Group__0__Impl9630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__Group__1__Impl_in_rule__RangeValue__Group__19660 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__RangeValue__Group__2_in_rule__RangeValue__Group__19663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RangeValue__Group__1__Impl9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__Group__2__Impl_in_rule__RangeValue__Group__29722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeValue__Alternatives_2_in_rule__RangeValue__Group__2__Impl9749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__Group__0__Impl_in_rule__FormatRangeValue__Group__09785 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__Group__1_in_rule__FormatRangeValue__Group__09788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__FromAssignment_0_in_rule__FormatRangeValue__Group__0__Impl9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__Group__1__Impl_in_rule__FormatRangeValue__Group__19845 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__Group__2_in_rule__FormatRangeValue__Group__19848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FormatRangeValue__Group__1__Impl9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__Group__2__Impl_in_rule__FormatRangeValue__Group__29907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatRangeValue__ToAssignment_2_in_rule__FormatRangeValue__Group__2__Impl9934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__09970 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__09973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Integer__Group__0__Impl10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__110035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__010095 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Double__Group__1_in_rule__Double__Group__010098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Double__Group__0__Impl10125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__110154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Double__Group__2_in_rule__Double__Group__110157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Double__Group__1__Impl10185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__210216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Group__2__Impl10243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__010278 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__010281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl10308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__110337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedNameWithWildcard__Group__1__Impl10366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010403 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10489 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__0_in_rule__EntityElements__UnorderedGroup_110647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_rule__EntityElements__UnorderedGroup_1__Impl10735 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_rule__EntityElements__UnorderedGroup_1__Impl10779 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_rule__EntityElements__UnorderedGroup_1__Impl10878 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_rule__EntityElements__UnorderedGroup_1__Impl10922 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_rule__EntityElements__UnorderedGroup_1__Impl11021 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_rule__EntityElements__UnorderedGroup_1__Impl11065 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferenceListsAssignment_1_3_in_rule__EntityElements__UnorderedGroup_1__Impl11164 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferenceListsAssignment_1_3_in_rule__EntityElements__UnorderedGroup_1__Impl11208 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__011274 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__1_in_rule__EntityElements__UnorderedGroup_1__011277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__111302 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__2_in_rule__EntityElements__UnorderedGroup_1__111305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__211330 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__3_in_rule__EntityElements__UnorderedGroup_1__211333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__Impl_in_rule__EntityElements__UnorderedGroup_1__311358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_111425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_111456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__Package__AnnotationsAssignment_011487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_211518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Package__ElementsAssignment_411549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__DataType__AnnotationsAssignment_011580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_211611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeField_in_rule__DataType__FormatedFieldsAssignment_411642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternType_in_rule__DataTypeField__PatternAssignment_0_011673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATTERN_STRING_in_rule__DataTypeField__FormatAssignment_0_111704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DataTypeField__TypeAssignment_111739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PatternType__REGEXAssignment_011779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PatternType__DATEAssignment_111823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PatternType__NUMBERAssignment_211867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__Entity__AnnotationsAssignment_011906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_211937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParent_in_rule__Entity__ParentAssignment_411968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityElements_in_rule__Entity__ElementsAssignment_511999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityGroup_in_rule__Entity__GroupsAssignment_612030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityGroup__NameAssignment_112061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityElements_in_rule__EntityGroup__ElementsAssignment_312092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_rule__EntityElements__ChildsAssignment_1_012123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__EntityElements__PropertiesAssignment_1_112154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__EntityElements__ReferencesAssignment_1_212185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceList_in_rule__EntityElements__ReferenceListsAssignment_1_312216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Parent__TypeAssignment_112251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__Parent__AnnotationsAssignment_212286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Child__TypeAssignment_112321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__Child__AnnotationsAssignment_212356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_012387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Property__OptionalAssignment_112423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Property__TypeAssignment_312466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__Property__AnnotationsAssignment_412501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_012532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Reference__OptionalAssignment_112568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Reference__EntityAssignment_312611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__Reference__AnnotationsAssignment_412646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceList__NameAssignment_012677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceList__ReferenceAssignment_1_0_112712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ReferenceList__EntityAssignment_212751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rule__ReferenceList__AnnotationsAssignment_312786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnoTypes_in_rule__Annotation__TypesAssignment_112817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationInstance_in_rule__Annotation__InstancesAssignment_212848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Annotation__NameAssignment_512879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationMandatoryProperty_in_rule__Annotation__MandatoriesAssignment_712910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationOptionalProperty_in_rule__Annotation__OptionalsAssignment_812941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationMandatoryProperty__NameAssignment_012972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupType_in_rule__AnnotationMandatoryProperty__GroupAssignment_2_013003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__AnnotationMandatoryProperty__TypeAssignment_2_1_013034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AnnotationMandatoryProperty__MultiAssignment_2_1_113070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationOptionalProperty__NameAssignment_013109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupType_in_rule__AnnotationOptionalProperty__GroupAssignment_3_013140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__AnnotationOptionalProperty__TypeAssignment_3_1_013171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AnnotationOptionalProperty__MultiAssignment_3_1_113207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationInstance_in_rule__AnnotationGroup__InstancesAssignment_113246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AnnotationInstance__AnnotationAssignment_013281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_rule__AnnotationInstance__ValuesAssignment_113316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationHiddenProperty_in_rule__AnnotationInstance__PropertiesAssignment_2_113347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationHiddenProperty__PropertyAssignment_013382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationHiddenProperty__ValuesAssignment_113421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__GroupType__TypeAssignment_013461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GroupType__NameAssignment_113500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__PackageType__TypeAssignment13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DataTypeType__TypeAssignment13580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AnnotationType__TypeAssignment13624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EntityType__TypeAssignment13668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PropertyType__TypeAssignment13712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ReferenceType__TypeAssignment13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ReferenceListType__TypeAssignment13800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ParentType__TypeAssignment13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ChildType__TypeAssignment13888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment13927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__IntegerValue__ValueAssignment13958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__DoubleValue__ValueAssignment13989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__RangeValue__FromAssignment_0_014020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RangeValue__FromInfAssignment_0_114056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__RangeValue__ToAssignment_2_014095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RangeValue__ToInfAssignment_2_114131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormatRangeValue__FromAssignment_014170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FormatRangeValue__ToAssignment_214201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_synpred1_InternalModelDsl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_synpred2_InternalModelDsl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_synpred3_InternalModelDsl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationHiddenProperty__ValuesAssignment_1_in_synpred59_InternalModelDsl9444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__0_in_synpred63_InternalModelDsl10647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_synpred64_InternalModelDsl10776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_synpred65_InternalModelDsl10735 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__EntityElements__ChildsAssignment_1_0_in_synpred65_InternalModelDsl10779 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_synpred66_InternalModelDsl10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_synpred67_InternalModelDsl10878 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__PropertiesAssignment_1_1_in_synpred67_InternalModelDsl10922 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_synpred68_InternalModelDsl11062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_synpred69_InternalModelDsl11021 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferencesAssignment_1_2_in_synpred69_InternalModelDsl11065 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__EntityElements__ReferenceListsAssignment_1_3_in_synpred70_InternalModelDsl11205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__1_in_synpred71_InternalModelDsl11277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__2_in_synpred72_InternalModelDsl11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityElements__UnorderedGroup_1__3_in_synpred73_InternalModelDsl11333 = new BitSet(new long[]{0x0000000000000002L});

}
