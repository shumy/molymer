package org.molymer.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.molymer.services.ModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalModelDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PATTERN_STRING", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_END_LINE", "RULE_ANY_OTHER", "'import'", "'package'", "'{'", "'}'", "'datatype'", "'@regex'", "'@date'", "'@number'", "'entity'", "'group'", "':parent->'", "':childs-<'", "'?'", "':'", "'-->'", "'-'", "'-<'", "'--<'", "'['", "']'", "'annotation'", "'*'", "'-HIDDEN-'", "'#group'", "'#package'", "'#datatype'", "'#annotation'", "'#entity'", "'#property'", "'#reference'", "'#reference-list'", "'#parent'", "'#child'", "'..'", "'.'", "'.*'", "'#string'", "'#integer'", "'#double'", "'#int-range'", "'#format-range'"
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
    public static final int RULE_PATTERN_STRING=5;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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
    public String getGrammarFileName() { return "../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ModelDslGrammarAccess grammarAccess;
     	
        public InternalModelDslParser(TokenStream input, ModelDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ModelDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:75:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:76:2: (iv_ruleModel= ruleModel EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:77:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (state.failed) return current;

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
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:84:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:87:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:88:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:88:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:88:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )*
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:88:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:89:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:89:1: (lv_imports_0_0= ruleImport )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:90:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel137);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:106:3: ( (lv_elements_1_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==17||LA2_0==21||LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:107:1: (lv_elements_1_0= ruleElement )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:107:1: (lv_elements_1_0= ruleElement )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:108:3: lv_elements_1_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel159);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:132:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:133:2: (iv_ruleImport= ruleImport EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:134:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport196);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport206); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:141:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:144:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:145:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:145:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:145:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:149:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:150:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:150:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:151:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport264);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleElement"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:175:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:176:2: (iv_ruleElement= ruleElement EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:177:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement300);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement310); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:184:1: ruleElement returns [EObject current=null] : (this_Type_0= ruleType | this_Annotation_1= ruleAnnotation | this_Package_2= rulePackage ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_Package_2 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:187:28: ( (this_Type_0= ruleType | this_Annotation_1= ruleAnnotation | this_Package_2= rulePackage ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:188:1: (this_Type_0= ruleType | this_Annotation_1= ruleAnnotation | this_Package_2= rulePackage )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:188:1: (this_Type_0= ruleType | this_Annotation_1= ruleAnnotation | this_Package_2= rulePackage )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred3_InternalModelDsl()) ) {
                    alt3=1;
                }
                else if ( (synpred4_InternalModelDsl()) ) {
                    alt3=2;
                }
                else if ( (true) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 21:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:189:2: this_Type_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleElement360);
                    this_Type_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Type_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:202:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElement390);
                    this_Annotation_1=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Annotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:215:2: this_Package_2= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getPackageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleElement420);
                    this_Package_2=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Package_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:234:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:235:2: (iv_ruleType= ruleType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:236:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType455);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType465); if (state.failed) return current;

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
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:243:1: ruleType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:246:28: ( (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:247:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:247:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred5_InternalModelDsl()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:248:2: this_Entity_0= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleType515);
                    this_Entity_0=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entity_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:261:2: this_DataType_1= ruleDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataType_in_ruleType545);
                    this_DataType_1=ruleDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePackage"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:280:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:281:2: (iv_rulePackage= rulePackage EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:282:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage580);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage590); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:289:1: rulePackage returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:292:28: ( ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:293:1: ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:293:1: ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:293:2: ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}'
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:293:2: ( (lv_annotations_0_0= ruleAnnotationGroup ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:294:1: (lv_annotations_0_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:294:1: (lv_annotations_0_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:295:3: lv_annotations_0_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_rulePackage636);
            	    lv_annotations_0_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePackage649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:315:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:316:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:316:1: (lv_name_2_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:317:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePackage683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:337:1: ( (lv_elements_4_0= ruleElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14||LA6_0==17||LA6_0==21||LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:338:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:338:1: (lv_elements_4_0= ruleElement )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:339:3: lv_elements_4_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_rulePackage704);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_4_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulePackage717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleDataType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:367:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:368:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:369:2: iv_ruleDataType= ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType753);
            iv_ruleDataType=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType763); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:376:1: ruleDataType returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_formatedFields_4_0= ruleDataTypeField ) )* otherlv_5= '}' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_formatedFields_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:379:28: ( ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_formatedFields_4_0= ruleDataTypeField ) )* otherlv_5= '}' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:380:1: ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_formatedFields_4_0= ruleDataTypeField ) )* otherlv_5= '}' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:380:1: ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_formatedFields_4_0= ruleDataTypeField ) )* otherlv_5= '}' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:380:2: ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'datatype' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_formatedFields_4_0= ruleDataTypeField ) )* otherlv_5= '}'
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:380:2: ( (lv_annotations_0_0= ruleAnnotationGroup ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:381:1: (lv_annotations_0_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:381:1: (lv_annotations_0_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:382:3: lv_annotations_0_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleDataType809);
            	    lv_annotations_0_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDataType822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getDatatypeKeyword_1());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:402:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:403:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:403:1: (lv_name_2_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:404:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDataType856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:424:1: ( (lv_formatedFields_4_0= ruleDataTypeField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=18 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:425:1: (lv_formatedFields_4_0= ruleDataTypeField )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:425:1: (lv_formatedFields_4_0= ruleDataTypeField )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:426:3: lv_formatedFields_4_0= ruleDataTypeField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataTypeAccess().getFormatedFieldsDataTypeFieldParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDataTypeField_in_ruleDataType877);
            	    lv_formatedFields_4_0=ruleDataTypeField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"formatedFields",
            	              		lv_formatedFields_4_0, 
            	              		"DataTypeField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDataType890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDataTypeField"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:454:1: entryRuleDataTypeField returns [EObject current=null] : iv_ruleDataTypeField= ruleDataTypeField EOF ;
    public final EObject entryRuleDataTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeField = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:455:2: (iv_ruleDataTypeField= ruleDataTypeField EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:456:2: iv_ruleDataTypeField= ruleDataTypeField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeFieldRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeField_in_entryRuleDataTypeField926);
            iv_ruleDataTypeField=ruleDataTypeField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeField936); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeField"


    // $ANTLR start "ruleDataTypeField"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:463:1: ruleDataTypeField returns [EObject current=null] : ( ( ( (lv_pattern_0_0= rulePatternType ) ) ( (lv_format_1_0= RULE_PATTERN_STRING ) ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDataTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_format_1_0=null;
        EObject lv_pattern_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:466:28: ( ( ( ( (lv_pattern_0_0= rulePatternType ) ) ( (lv_format_1_0= RULE_PATTERN_STRING ) ) ) | ( ( ruleQualifiedName ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:467:1: ( ( ( (lv_pattern_0_0= rulePatternType ) ) ( (lv_format_1_0= RULE_PATTERN_STRING ) ) ) | ( ( ruleQualifiedName ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:467:1: ( ( ( (lv_pattern_0_0= rulePatternType ) ) ( (lv_format_1_0= RULE_PATTERN_STRING ) ) ) | ( ( ruleQualifiedName ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=18 && LA9_0<=20)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:467:2: ( ( (lv_pattern_0_0= rulePatternType ) ) ( (lv_format_1_0= RULE_PATTERN_STRING ) ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:467:2: ( ( (lv_pattern_0_0= rulePatternType ) ) ( (lv_format_1_0= RULE_PATTERN_STRING ) ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:467:3: ( (lv_pattern_0_0= rulePatternType ) ) ( (lv_format_1_0= RULE_PATTERN_STRING ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:467:3: ( (lv_pattern_0_0= rulePatternType ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:468:1: (lv_pattern_0_0= rulePatternType )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:468:1: (lv_pattern_0_0= rulePatternType )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:469:3: lv_pattern_0_0= rulePatternType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeFieldAccess().getPatternPatternTypeParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePatternType_in_ruleDataTypeField983);
                    lv_pattern_0_0=rulePatternType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataTypeFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"pattern",
                              		lv_pattern_0_0, 
                              		"PatternType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:485:2: ( (lv_format_1_0= RULE_PATTERN_STRING ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:486:1: (lv_format_1_0= RULE_PATTERN_STRING )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:486:1: (lv_format_1_0= RULE_PATTERN_STRING )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:487:3: lv_format_1_0= RULE_PATTERN_STRING
                    {
                    lv_format_1_0=(Token)match(input,RULE_PATTERN_STRING,FOLLOW_RULE_PATTERN_STRING_in_ruleDataTypeField1000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_format_1_0, grammarAccess.getDataTypeFieldAccess().getFormatPATTERN_STRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeFieldRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"format",
                              		lv_format_1_0, 
                              		"PATTERN_STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:504:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:504:6: ( ( ruleQualifiedName ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:505:1: ( ruleQualifiedName )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:505:1: ( ruleQualifiedName )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:506:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeFieldRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataTypeFieldAccess().getTypeDataTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataTypeField1039);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataTypeField"


    // $ANTLR start "entryRulePatternType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:530:1: entryRulePatternType returns [EObject current=null] : iv_rulePatternType= rulePatternType EOF ;
    public final EObject entryRulePatternType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:531:2: (iv_rulePatternType= rulePatternType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:532:2: iv_rulePatternType= rulePatternType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternTypeRule()); 
            }
            pushFollow(FOLLOW_rulePatternType_in_entryRulePatternType1075);
            iv_rulePatternType=rulePatternType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternType1085); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternType"


    // $ANTLR start "rulePatternType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:539:1: rulePatternType returns [EObject current=null] : ( ( (lv_REGEX_0_0= '@regex' ) ) | ( (lv_DATE_1_0= '@date' ) ) | ( (lv_NUMBER_2_0= '@number' ) ) ) ;
    public final EObject rulePatternType() throws RecognitionException {
        EObject current = null;

        Token lv_REGEX_0_0=null;
        Token lv_DATE_1_0=null;
        Token lv_NUMBER_2_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:542:28: ( ( ( (lv_REGEX_0_0= '@regex' ) ) | ( (lv_DATE_1_0= '@date' ) ) | ( (lv_NUMBER_2_0= '@number' ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:543:1: ( ( (lv_REGEX_0_0= '@regex' ) ) | ( (lv_DATE_1_0= '@date' ) ) | ( (lv_NUMBER_2_0= '@number' ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:543:1: ( ( (lv_REGEX_0_0= '@regex' ) ) | ( (lv_DATE_1_0= '@date' ) ) | ( (lv_NUMBER_2_0= '@number' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:543:2: ( (lv_REGEX_0_0= '@regex' ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:543:2: ( (lv_REGEX_0_0= '@regex' ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:544:1: (lv_REGEX_0_0= '@regex' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:544:1: (lv_REGEX_0_0= '@regex' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:545:3: lv_REGEX_0_0= '@regex'
                    {
                    lv_REGEX_0_0=(Token)match(input,18,FOLLOW_18_in_rulePatternType1128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_REGEX_0_0, grammarAccess.getPatternTypeAccess().getREGEXRegexKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPatternTypeRule());
                      	        }
                             		setWithLastConsumed(current, "REGEX", lv_REGEX_0_0, "@regex");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:559:6: ( (lv_DATE_1_0= '@date' ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:559:6: ( (lv_DATE_1_0= '@date' ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:560:1: (lv_DATE_1_0= '@date' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:560:1: (lv_DATE_1_0= '@date' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:561:3: lv_DATE_1_0= '@date'
                    {
                    lv_DATE_1_0=(Token)match(input,19,FOLLOW_19_in_rulePatternType1165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_DATE_1_0, grammarAccess.getPatternTypeAccess().getDATEDateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPatternTypeRule());
                      	        }
                             		setWithLastConsumed(current, "DATE", lv_DATE_1_0, "@date");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:575:6: ( (lv_NUMBER_2_0= '@number' ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:575:6: ( (lv_NUMBER_2_0= '@number' ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:576:1: (lv_NUMBER_2_0= '@number' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:576:1: (lv_NUMBER_2_0= '@number' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:577:3: lv_NUMBER_2_0= '@number'
                    {
                    lv_NUMBER_2_0=(Token)match(input,20,FOLLOW_20_in_rulePatternType1202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_NUMBER_2_0, grammarAccess.getPatternTypeAccess().getNUMBERNumberKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPatternTypeRule());
                      	        }
                             		setWithLastConsumed(current, "NUMBER", lv_NUMBER_2_0, "@number");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePatternType"


    // $ANTLR start "entryRuleEntity"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:598:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:599:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:600:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1251);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1261); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:607:1: ruleEntity returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parent_4_0= ruleParent ) )? ( (lv_elements_5_0= ruleEntityElements ) ) ( (lv_groups_6_0= ruleEntityGroup ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parent_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_groups_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:610:28: ( ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parent_4_0= ruleParent ) )? ( (lv_elements_5_0= ruleEntityElements ) ) ( (lv_groups_6_0= ruleEntityGroup ) )* otherlv_7= '}' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:611:1: ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parent_4_0= ruleParent ) )? ( (lv_elements_5_0= ruleEntityElements ) ) ( (lv_groups_6_0= ruleEntityGroup ) )* otherlv_7= '}' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:611:1: ( ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parent_4_0= ruleParent ) )? ( (lv_elements_5_0= ruleEntityElements ) ) ( (lv_groups_6_0= ruleEntityGroup ) )* otherlv_7= '}' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:611:2: ( (lv_annotations_0_0= ruleAnnotationGroup ) )* otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_parent_4_0= ruleParent ) )? ( (lv_elements_5_0= ruleEntityElements ) ) ( (lv_groups_6_0= ruleEntityGroup ) )* otherlv_7= '}'
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:611:2: ( (lv_annotations_0_0= ruleAnnotationGroup ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:612:1: (lv_annotations_0_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:612:1: (lv_annotations_0_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:613:3: lv_annotations_0_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationGroupParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleEntity1307);
            	    lv_annotations_0_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleEntity1320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:633:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:634:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:634:1: (lv_name_2_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:635:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEntity1354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:655:1: ( (lv_parent_4_0= ruleParent ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:656:1: (lv_parent_4_0= ruleParent )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:656:1: (lv_parent_4_0= ruleParent )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:657:3: lv_parent_4_0= ruleParent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntityAccess().getParentParentParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParent_in_ruleEntity1375);
                    lv_parent_4_0=ruleParent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"parent",
                              		lv_parent_4_0, 
                              		"Parent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:673:3: ( (lv_elements_5_0= ruleEntityElements ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:674:1: (lv_elements_5_0= ruleEntityElements )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:674:1: (lv_elements_5_0= ruleEntityElements )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:675:3: lv_elements_5_0= ruleEntityElements
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityAccess().getElementsEntityElementsParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEntityElements_in_ruleEntity1397);
            lv_elements_5_0=ruleEntityElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntityRule());
              	        }
                     		set(
                     			current, 
                     			"elements",
                      		lv_elements_5_0, 
                      		"EntityElements");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:691:2: ( (lv_groups_6_0= ruleEntityGroup ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:692:1: (lv_groups_6_0= ruleEntityGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:692:1: (lv_groups_6_0= ruleEntityGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:693:3: lv_groups_6_0= ruleEntityGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getGroupsEntityGroupParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEntityGroup_in_ruleEntity1418);
            	    lv_groups_6_0=ruleEntityGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"groups",
            	              		lv_groups_6_0, 
            	              		"EntityGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleEntity1431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityGroup"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:721:1: entryRuleEntityGroup returns [EObject current=null] : iv_ruleEntityGroup= ruleEntityGroup EOF ;
    public final EObject entryRuleEntityGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityGroup = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:722:2: (iv_ruleEntityGroup= ruleEntityGroup EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:723:2: iv_ruleEntityGroup= ruleEntityGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityGroupRule()); 
            }
            pushFollow(FOLLOW_ruleEntityGroup_in_entryRuleEntityGroup1467);
            iv_ruleEntityGroup=ruleEntityGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityGroup1477); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntityGroup"


    // $ANTLR start "ruleEntityGroup"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:730:1: ruleEntityGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntityElements ) ) otherlv_4= '}' ) ;
    public final EObject ruleEntityGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:733:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntityElements ) ) otherlv_4= '}' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:734:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntityElements ) ) otherlv_4= '}' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:734:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntityElements ) ) otherlv_4= '}' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:734:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEntityElements ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEntityGroup1514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntityGroupAccess().getGroupKeyword_0());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:738:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:739:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:739:1: (lv_name_1_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:740:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityGroup1531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEntityGroupAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityGroupRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntityGroup1548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEntityGroupAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:760:1: ( (lv_elements_3_0= ruleEntityElements ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:761:1: (lv_elements_3_0= ruleEntityElements )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:761:1: (lv_elements_3_0= ruleEntityElements )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:762:3: lv_elements_3_0= ruleEntityElements
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityGroupAccess().getElementsEntityElementsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEntityElements_in_ruleEntityGroup1569);
            lv_elements_3_0=ruleEntityElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntityGroupRule());
              	        }
                     		set(
                     			current, 
                     			"elements",
                      		lv_elements_3_0, 
                      		"EntityElements");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEntityGroup1581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEntityGroupAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEntityGroup"


    // $ANTLR start "entryRuleEntityElements"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:790:1: entryRuleEntityElements returns [EObject current=null] : iv_ruleEntityElements= ruleEntityElements EOF ;
    public final EObject entryRuleEntityElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityElements = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getEntityElementsAccess().getUnorderedGroup_1()
        		);
        	
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:796:2: (iv_ruleEntityElements= ruleEntityElements EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:797:2: iv_ruleEntityElements= ruleEntityElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityElementsRule()); 
            }
            pushFollow(FOLLOW_ruleEntityElements_in_entryRuleEntityElements1623);
            iv_ruleEntityElements=ruleEntityElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityElements; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityElements1633); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleEntityElements"


    // $ANTLR start "ruleEntityElements"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:807:1: ruleEntityElements returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) ) ) ) ;
    public final EObject ruleEntityElements() throws RecognitionException {
        EObject current = null;

        EObject lv_childs_2_0 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_references_4_0 = null;

        EObject lv_referenceLists_5_0 = null;


         enterRule(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getEntityElementsAccess().getUnorderedGroup_1()
        		);
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:813:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:814:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:814:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:814:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:814:2: ()
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:815:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntityElementsAccess().getEntityElementsAction_0(),
                          current);
                  
            }

            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:823:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:825:1: ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:825:1: ( ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:826:2: ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:829:2: ( ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:830:3: ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )*
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:830:3: ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )*
            loop18:
            do {
                int alt18=5;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
                    alt18=1;
                }
                else if ( (LA18_0==RULE_ID) ) {
                    int LA18_3 = input.LA(2);

                    if ( (LA18_3==25) ) {
                        int LA18_4 = input.LA(3);

                        if ( LA18_4 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
                            alt18=2;
                        }
                        else if ( LA18_4 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
                            alt18=3;
                        }


                    }
                    else if ( LA18_3 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
                        alt18=2;
                    }
                    else if ( LA18_3 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) ) {
                        alt18=4;
                    }
                    else if ( LA18_3 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) ) {
                        alt18=4;
                    }
                    else if ( LA18_3 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
                        alt18=3;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:832:4: ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:832:4: ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:833:5: {...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEntityElements", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:833:111: ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:834:6: ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0);
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:6: ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==24) ) {
            	            int LA14_2 = input.LA(2);

            	            if ( ((synpred16_InternalModelDsl()&&(true))) ) {
            	                alt14=1;
            	            }


            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:7: {...}? => ( (lv_childs_2_0= ruleChild ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleEntityElements", "true");
            	    	    }
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:16: ( (lv_childs_2_0= ruleChild ) )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:838:1: (lv_childs_2_0= ruleChild )
            	    	    {
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:838:1: (lv_childs_2_0= ruleChild )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:839:3: lv_childs_2_0= ruleChild
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getChildsChildParserRuleCall_1_0_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleChild_in_ruleEntityElements1740);
            	    	    lv_childs_2_0=ruleChild();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getEntityElementsRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"childs",
            	    	              		lv_childs_2_0, 
            	    	              		"Child");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:862:4: ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:862:4: ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:863:5: {...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEntityElements", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:863:111: ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:864:6: ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1);
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:6: ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==RULE_ID) ) {
            	            int LA15_2 = input.LA(2);

            	            if ( ((synpred18_InternalModelDsl()&&(true))) ) {
            	                alt15=1;
            	            }


            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:7: {...}? => ( (lv_properties_3_0= ruleProperty ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleEntityElements", "true");
            	    	    }
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:16: ( (lv_properties_3_0= ruleProperty ) )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:868:1: (lv_properties_3_0= ruleProperty )
            	    	    {
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:868:1: (lv_properties_3_0= ruleProperty )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:869:3: lv_properties_3_0= ruleProperty
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getPropertiesPropertyParserRuleCall_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleProperty_in_ruleEntityElements1816);
            	    	    lv_properties_3_0=ruleProperty();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getEntityElementsRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"properties",
            	    	              		lv_properties_3_0, 
            	    	              		"Property");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:892:4: ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:892:4: ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:893:5: {...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEntityElements", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:893:111: ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:894:6: ({...}? => ( (lv_references_4_0= ruleReference ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2);
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:6: ({...}? => ( (lv_references_4_0= ruleReference ) ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_ID) ) {
            	            int LA16_2 = input.LA(2);

            	            if ( ((synpred20_InternalModelDsl()&&(true))) ) {
            	                alt16=1;
            	            }


            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:7: {...}? => ( (lv_references_4_0= ruleReference ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleEntityElements", "true");
            	    	    }
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:16: ( (lv_references_4_0= ruleReference ) )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:898:1: (lv_references_4_0= ruleReference )
            	    	    {
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:898:1: (lv_references_4_0= ruleReference )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:899:3: lv_references_4_0= ruleReference
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getReferencesReferenceParserRuleCall_1_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleReference_in_ruleEntityElements1892);
            	    	    lv_references_4_0=ruleReference();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getEntityElementsRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"references",
            	    	              		lv_references_4_0, 
            	    	              		"Reference");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:922:4: ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:922:4: ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:923:5: {...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleEntityElements", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:923:111: ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:924:6: ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3);
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:6: ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==RULE_ID) ) {
            	            int LA17_2 = input.LA(2);

            	            if ( ((synpred22_InternalModelDsl()&&(true))) ) {
            	                alt17=1;
            	            }


            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:7: {...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleEntityElements", "true");
            	    	    }
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:16: ( (lv_referenceLists_5_0= ruleReferenceList ) )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:928:1: (lv_referenceLists_5_0= ruleReferenceList )
            	    	    {
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:928:1: (lv_referenceLists_5_0= ruleReferenceList )
            	    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:929:3: lv_referenceLists_5_0= ruleReferenceList
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getReferenceListsReferenceListParserRuleCall_1_3_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleReferenceList_in_ruleEntityElements1968);
            	    	    lv_referenceLists_5_0=ruleReferenceList();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getEntityElementsRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"referenceLists",
            	    	              		lv_referenceLists_5_0, 
            	    	              		"ReferenceList");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1());

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleEntityElements"


    // $ANTLR start "entryRuleContainer"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:970:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:971:2: (iv_ruleContainer= ruleContainer EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:972:2: iv_ruleContainer= ruleContainer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerRule()); 
            }
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer2049);
            iv_ruleContainer=ruleContainer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer2059); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:979:1: ruleContainer returns [EObject current=null] : (this_Parent_0= ruleParent | this_Child_1= ruleChild ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Parent_0 = null;

        EObject this_Child_1 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:982:28: ( (this_Parent_0= ruleParent | this_Child_1= ruleChild ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:983:1: (this_Parent_0= ruleParent | this_Child_1= ruleChild )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:983:1: (this_Parent_0= ruleParent | this_Child_1= ruleChild )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            else if ( (LA19_0==24) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:984:2: this_Parent_0= ruleParent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContainerAccess().getParentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParent_in_ruleContainer2109);
                    this_Parent_0=ruleParent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parent_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:997:2: this_Child_1= ruleChild
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getContainerAccess().getChildParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleChild_in_ruleContainer2139);
                    this_Child_1=ruleChild();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Child_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleField"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1016:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1017:2: (iv_ruleField= ruleField EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1018:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField2174);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField2184); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1025:1: ruleField returns [EObject current=null] : (this_Property_0= ruleProperty | this_Reference_1= ruleReference | this_ReferenceList_2= ruleReferenceList ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_Property_0 = null;

        EObject this_Reference_1 = null;

        EObject this_ReferenceList_2 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1028:28: ( (this_Property_0= ruleProperty | this_Reference_1= ruleReference | this_ReferenceList_2= ruleReferenceList ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1029:1: (this_Property_0= ruleProperty | this_Reference_1= ruleReference | this_ReferenceList_2= ruleReferenceList )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1029:1: (this_Property_0= ruleProperty | this_Reference_1= ruleReference | this_ReferenceList_2= ruleReferenceList )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==27) ) {
                        alt20=2;
                    }
                    else if ( (LA20_2==26) ) {
                        alt20=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt20=1;
                    }
                    break;
                case 28:
                case 30:
                    {
                    alt20=3;
                    }
                    break;
                case 27:
                    {
                    alt20=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1030:2: this_Property_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccess().getPropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleField2234);
                    this_Property_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Property_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1043:2: this_Reference_1= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccess().getReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleField2264);
                    this_Reference_1=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Reference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1056:2: this_ReferenceList_2= ruleReferenceList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccess().getReferenceListParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceList_in_ruleField2294);
                    this_ReferenceList_2=ruleReferenceList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceList_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleParent"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1075:1: entryRuleParent returns [EObject current=null] : iv_ruleParent= ruleParent EOF ;
    public final EObject entryRuleParent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParent = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1076:2: (iv_ruleParent= ruleParent EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1077:2: iv_ruleParent= ruleParent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentRule()); 
            }
            pushFollow(FOLLOW_ruleParent_in_entryRuleParent2329);
            iv_ruleParent=ruleParent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParent2339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParent"


    // $ANTLR start "ruleParent"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1084:1: ruleParent returns [EObject current=null] : (otherlv_0= ':parent->' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* ) ;
    public final EObject ruleParent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_annotations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1087:28: ( (otherlv_0= ':parent->' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1088:1: (otherlv_0= ':parent->' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1088:1: (otherlv_0= ':parent->' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1088:3: otherlv_0= ':parent->' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleParent2376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParentAccess().getParentKeyword_0());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1092:1: ( ( ruleQualifiedName ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1093:1: ( ruleQualifiedName )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1093:1: ( ruleQualifiedName )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1094:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParentAccess().getTypeEntityCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleParent2403);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1110:2: ( (lv_annotations_2_0= ruleAnnotationGroup ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1111:1: (lv_annotations_2_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1111:1: (lv_annotations_2_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1112:3: lv_annotations_2_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParentAccess().getAnnotationsAnnotationGroupParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleParent2424);
            	    lv_annotations_2_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_2_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParent"


    // $ANTLR start "entryRuleChild"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1136:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1137:2: (iv_ruleChild= ruleChild EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1138:2: iv_ruleChild= ruleChild EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildRule()); 
            }
            pushFollow(FOLLOW_ruleChild_in_entryRuleChild2461);
            iv_ruleChild=ruleChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChild; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChild2471); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1145:1: ruleChild returns [EObject current=null] : (otherlv_0= ':childs-<' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_annotations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1148:28: ( (otherlv_0= ':childs-<' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1149:1: (otherlv_0= ':childs-<' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1149:1: (otherlv_0= ':childs-<' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1149:3: otherlv_0= ':childs-<' ( ( ruleQualifiedName ) ) ( (lv_annotations_2_0= ruleAnnotationGroup ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleChild2508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getChildAccess().getChildsKeyword_0());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1153:1: ( ( ruleQualifiedName ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1154:1: ( ruleQualifiedName )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1154:1: ( ruleQualifiedName )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1155:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getChildRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChildAccess().getTypeEntityCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleChild2535);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1171:2: ( (lv_annotations_2_0= ruleAnnotationGroup ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1172:1: (lv_annotations_2_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1172:1: (lv_annotations_2_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1173:3: lv_annotations_2_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getChildAccess().getAnnotationsAnnotationGroupParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleChild2556);
            	    lv_annotations_2_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getChildRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_2_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleProperty"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1197:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1198:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1199:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2593);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2603); if (state.failed) return current;

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
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1206:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1209:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1210:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1210:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1210:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )*
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1210:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1211:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1211:1: (lv_name_0_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1212:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1228:2: ( (lv_optional_1_0= '?' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1229:1: (lv_optional_1_0= '?' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1229:1: (lv_optional_1_0= '?' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1230:3: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,25,FOLLOW_25_in_ruleProperty2668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_1_0, grammarAccess.getPropertyAccess().getOptionalQuestionMarkKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "?");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleProperty2694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1247:1: ( ( ruleQualifiedName ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1248:1: ( ruleQualifiedName )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1248:1: ( ruleQualifiedName )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1249:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProperty2721);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1265:2: ( (lv_annotations_4_0= ruleAnnotationGroup ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1266:1: (lv_annotations_4_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1266:1: (lv_annotations_4_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1267:3: lv_annotations_4_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertyAccess().getAnnotationsAnnotationGroupParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleProperty2742);
            	    lv_annotations_4_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_4_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleReference"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1291:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1292:2: (iv_ruleReference= ruleReference EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1293:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference2779);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference2789); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1300:1: ruleReference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '-->' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1303:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '-->' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1304:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '-->' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1304:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '-->' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1304:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '-->' ( ( ruleQualifiedName ) ) ( (lv_annotations_4_0= ruleAnnotationGroup ) )*
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1304:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1305:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1305:1: (lv_name_0_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1306:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference2831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1322:2: ( (lv_optional_1_0= '?' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1323:1: (lv_optional_1_0= '?' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1323:1: (lv_optional_1_0= '?' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1324:3: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,25,FOLLOW_25_in_ruleReference2854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_1_0, grammarAccess.getReferenceAccess().getOptionalQuestionMarkKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "?");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleReference2880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1341:1: ( ( ruleQualifiedName ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1342:1: ( ruleQualifiedName )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1342:1: ( ruleQualifiedName )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1343:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReference2907);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1359:2: ( (lv_annotations_4_0= ruleAnnotationGroup ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1360:1: (lv_annotations_4_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1360:1: (lv_annotations_4_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1361:3: lv_annotations_4_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getAnnotationsAnnotationGroupParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleReference2928);
            	    lv_annotations_4_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_4_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleReferenceList"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1385:1: entryRuleReferenceList returns [EObject current=null] : iv_ruleReferenceList= ruleReferenceList EOF ;
    public final EObject entryRuleReferenceList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceList = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1386:2: (iv_ruleReferenceList= ruleReferenceList EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1387:2: iv_ruleReferenceList= ruleReferenceList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceListRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceList_in_entryRuleReferenceList2965);
            iv_ruleReferenceList=ruleReferenceList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceList2975); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceList"


    // $ANTLR start "ruleReferenceList"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1394:1: ruleReferenceList returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' ) | otherlv_4= '--<' ) ( ( ruleQualifiedName ) ) ( (lv_annotations_6_0= ruleAnnotationGroup ) )* ) ;
    public final EObject ruleReferenceList() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1397:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' ) | otherlv_4= '--<' ) ( ( ruleQualifiedName ) ) ( (lv_annotations_6_0= ruleAnnotationGroup ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1398:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' ) | otherlv_4= '--<' ) ( ( ruleQualifiedName ) ) ( (lv_annotations_6_0= ruleAnnotationGroup ) )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1398:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' ) | otherlv_4= '--<' ) ( ( ruleQualifiedName ) ) ( (lv_annotations_6_0= ruleAnnotationGroup ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1398:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' ) | otherlv_4= '--<' ) ( ( ruleQualifiedName ) ) ( (lv_annotations_6_0= ruleAnnotationGroup ) )*
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1398:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1399:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1399:1: (lv_name_0_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1400:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceList3017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getReferenceListAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1416:2: ( (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' ) | otherlv_4= '--<' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            else if ( (LA27_0==30) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1416:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1416:3: (otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1416:5: otherlv_1= '-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '-<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleReferenceList3036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceListAccess().getHyphenMinusKeyword_1_0_0());
                          
                    }
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1420:1: ( (otherlv_2= RULE_ID ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1421:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1421:1: (otherlv_2= RULE_ID )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1422:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceListRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceList3060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getReferenceListAccess().getReferenceReferenceCrossReference_1_0_1_0()); 
                      	
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleReferenceList3072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceListAccess().getHyphenMinusLessThanSignKeyword_1_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1441:7: otherlv_4= '--<'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleReferenceList3091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReferenceListAccess().getHyphenMinusHyphenMinusLessThanSignKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1445:2: ( ( ruleQualifiedName ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1446:1: ( ruleQualifiedName )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1446:1: ( ruleQualifiedName )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1447:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceListRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceListAccess().getEntityEntityCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReferenceList3119);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1463:2: ( (lv_annotations_6_0= ruleAnnotationGroup ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1464:1: (lv_annotations_6_0= ruleAnnotationGroup )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1464:1: (lv_annotations_6_0= ruleAnnotationGroup )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1465:3: lv_annotations_6_0= ruleAnnotationGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceListAccess().getAnnotationsAnnotationGroupParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleReferenceList3140);
            	    lv_annotations_6_0=ruleAnnotationGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_6_0, 
            	              		"AnnotationGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReferenceList"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1489:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1490:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1491:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation3177);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation3187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1498:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '[' ( (lv_types_1_0= ruleAnnoTypes ) )+ ( (lv_instances_2_0= ruleAnnotationInstance ) )* otherlv_3= ']' otherlv_4= 'annotation' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_mandatories_7_0= ruleAnnotationMandatoryProperty ) )* ( (lv_optionals_8_0= ruleAnnotationOptionalProperty ) )* otherlv_9= '}' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_types_1_0 = null;

        EObject lv_instances_2_0 = null;

        EObject lv_mandatories_7_0 = null;

        EObject lv_optionals_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1501:28: ( (otherlv_0= '[' ( (lv_types_1_0= ruleAnnoTypes ) )+ ( (lv_instances_2_0= ruleAnnotationInstance ) )* otherlv_3= ']' otherlv_4= 'annotation' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_mandatories_7_0= ruleAnnotationMandatoryProperty ) )* ( (lv_optionals_8_0= ruleAnnotationOptionalProperty ) )* otherlv_9= '}' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1502:1: (otherlv_0= '[' ( (lv_types_1_0= ruleAnnoTypes ) )+ ( (lv_instances_2_0= ruleAnnotationInstance ) )* otherlv_3= ']' otherlv_4= 'annotation' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_mandatories_7_0= ruleAnnotationMandatoryProperty ) )* ( (lv_optionals_8_0= ruleAnnotationOptionalProperty ) )* otherlv_9= '}' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1502:1: (otherlv_0= '[' ( (lv_types_1_0= ruleAnnoTypes ) )+ ( (lv_instances_2_0= ruleAnnotationInstance ) )* otherlv_3= ']' otherlv_4= 'annotation' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_mandatories_7_0= ruleAnnotationMandatoryProperty ) )* ( (lv_optionals_8_0= ruleAnnotationOptionalProperty ) )* otherlv_9= '}' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1502:3: otherlv_0= '[' ( (lv_types_1_0= ruleAnnoTypes ) )+ ( (lv_instances_2_0= ruleAnnotationInstance ) )* otherlv_3= ']' otherlv_4= 'annotation' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_mandatories_7_0= ruleAnnotationMandatoryProperty ) )* ( (lv_optionals_8_0= ruleAnnotationOptionalProperty ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAnnotation3224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1506:1: ( (lv_types_1_0= ruleAnnoTypes ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=36 && LA29_0<=45)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1507:1: (lv_types_1_0= ruleAnnoTypes )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1507:1: (lv_types_1_0= ruleAnnoTypes )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1508:3: lv_types_1_0= ruleAnnoTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getTypesAnnoTypesParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnoTypes_in_ruleAnnotation3245);
            	    lv_types_1_0=ruleAnnoTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_1_0, 
            	              		"AnnoTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1524:3: ( (lv_instances_2_0= ruleAnnotationInstance ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1525:1: (lv_instances_2_0= ruleAnnotationInstance )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1525:1: (lv_instances_2_0= ruleAnnotationInstance )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1526:3: lv_instances_2_0= ruleAnnotationInstance
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getInstancesAnnotationInstanceParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationInstance_in_ruleAnnotation3267);
            	    lv_instances_2_0=ruleAnnotationInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instances",
            	              		lv_instances_2_0, 
            	              		"AnnotationInstance");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleAnnotation3280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getRightSquareBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleAnnotation3292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getAnnotationKeyword_4());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1550:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1551:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1551:1: (lv_name_5_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1552:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation3309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleAnnotation3326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1572:1: ( (lv_mandatories_7_0= ruleAnnotationMandatoryProperty ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==26) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1573:1: (lv_mandatories_7_0= ruleAnnotationMandatoryProperty )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1573:1: (lv_mandatories_7_0= ruleAnnotationMandatoryProperty )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1574:3: lv_mandatories_7_0= ruleAnnotationMandatoryProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getMandatoriesAnnotationMandatoryPropertyParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationMandatoryProperty_in_ruleAnnotation3347);
            	    lv_mandatories_7_0=ruleAnnotationMandatoryProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mandatories",
            	              		lv_mandatories_7_0, 
            	              		"AnnotationMandatoryProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1590:3: ( (lv_optionals_8_0= ruleAnnotationOptionalProperty ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1591:1: (lv_optionals_8_0= ruleAnnotationOptionalProperty )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1591:1: (lv_optionals_8_0= ruleAnnotationOptionalProperty )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1592:3: lv_optionals_8_0= ruleAnnotationOptionalProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getOptionalsAnnotationOptionalPropertyParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationOptionalProperty_in_ruleAnnotation3369);
            	    lv_optionals_8_0=ruleAnnotationOptionalProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"optionals",
            	              		lv_optionals_8_0, 
            	              		"AnnotationOptionalProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleAnnotation3382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationMandatoryProperty"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1620:1: entryRuleAnnotationMandatoryProperty returns [EObject current=null] : iv_ruleAnnotationMandatoryProperty= ruleAnnotationMandatoryProperty EOF ;
    public final EObject entryRuleAnnotationMandatoryProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationMandatoryProperty = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1621:2: (iv_ruleAnnotationMandatoryProperty= ruleAnnotationMandatoryProperty EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1622:2: iv_ruleAnnotationMandatoryProperty= ruleAnnotationMandatoryProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationMandatoryPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationMandatoryProperty_in_entryRuleAnnotationMandatoryProperty3418);
            iv_ruleAnnotationMandatoryProperty=ruleAnnotationMandatoryProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationMandatoryProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationMandatoryProperty3428); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationMandatoryProperty"


    // $ANTLR start "ruleAnnotationMandatoryProperty"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1629:1: ruleAnnotationMandatoryProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_group_2_0= ruleGroupType ) ) | ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? ) ) ) ;
    public final EObject ruleAnnotationMandatoryProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_multi_4_0=null;
        EObject lv_group_2_0 = null;

        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1632:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_group_2_0= ruleGroupType ) ) | ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1633:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_group_2_0= ruleGroupType ) ) | ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1633:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_group_2_0= ruleGroupType ) ) | ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1633:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_group_2_0= ruleGroupType ) ) | ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1633:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1634:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1634:1: (lv_name_0_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1635:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationMandatoryProperty3470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAnnotationMandatoryPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationMandatoryPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAnnotationMandatoryProperty3487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotationMandatoryPropertyAccess().getColonKeyword_1());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1655:1: ( ( (lv_group_2_0= ruleGroupType ) ) | ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=49 && LA34_0<=53)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1655:2: ( (lv_group_2_0= ruleGroupType ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1655:2: ( (lv_group_2_0= ruleGroupType ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1656:1: (lv_group_2_0= ruleGroupType )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1656:1: (lv_group_2_0= ruleGroupType )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1657:3: lv_group_2_0= ruleGroupType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationMandatoryPropertyAccess().getGroupGroupTypeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupType_in_ruleAnnotationMandatoryProperty3509);
                    lv_group_2_0=ruleGroupType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationMandatoryPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"group",
                              		lv_group_2_0, 
                              		"GroupType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1674:6: ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1674:6: ( ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )? )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1674:7: ( (lv_type_3_0= ruleValueType ) ) ( (lv_multi_4_0= '*' ) )?
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1674:7: ( (lv_type_3_0= ruleValueType ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1675:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1675:1: (lv_type_3_0= ruleValueType )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1676:3: lv_type_3_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationMandatoryPropertyAccess().getTypeValueTypeEnumRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleAnnotationMandatoryProperty3537);
                    lv_type_3_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationMandatoryPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1692:2: ( (lv_multi_4_0= '*' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==34) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1693:1: (lv_multi_4_0= '*' )
                            {
                            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1693:1: (lv_multi_4_0= '*' )
                            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1694:3: lv_multi_4_0= '*'
                            {
                            lv_multi_4_0=(Token)match(input,34,FOLLOW_34_in_ruleAnnotationMandatoryProperty3555); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_multi_4_0, grammarAccess.getAnnotationMandatoryPropertyAccess().getMultiAsteriskKeyword_2_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationMandatoryPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "multi", true, "*");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationMandatoryProperty"


    // $ANTLR start "entryRuleAnnotationOptionalProperty"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1715:1: entryRuleAnnotationOptionalProperty returns [EObject current=null] : iv_ruleAnnotationOptionalProperty= ruleAnnotationOptionalProperty EOF ;
    public final EObject entryRuleAnnotationOptionalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationOptionalProperty = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1716:2: (iv_ruleAnnotationOptionalProperty= ruleAnnotationOptionalProperty EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1717:2: iv_ruleAnnotationOptionalProperty= ruleAnnotationOptionalProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationOptionalPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationOptionalProperty_in_entryRuleAnnotationOptionalProperty3607);
            iv_ruleAnnotationOptionalProperty=ruleAnnotationOptionalProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationOptionalProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationOptionalProperty3617); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationOptionalProperty"


    // $ANTLR start "ruleAnnotationOptionalProperty"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1724:1: ruleAnnotationOptionalProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '?' otherlv_2= ':' ( ( (lv_group_3_0= ruleGroupType ) ) | ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? ) ) ) ;
    public final EObject ruleAnnotationOptionalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_multi_5_0=null;
        EObject lv_group_3_0 = null;

        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1727:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '?' otherlv_2= ':' ( ( (lv_group_3_0= ruleGroupType ) ) | ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1728:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '?' otherlv_2= ':' ( ( (lv_group_3_0= ruleGroupType ) ) | ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1728:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '?' otherlv_2= ':' ( ( (lv_group_3_0= ruleGroupType ) ) | ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1728:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '?' otherlv_2= ':' ( ( (lv_group_3_0= ruleGroupType ) ) | ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1728:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1729:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1729:1: (lv_name_0_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1730:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationOptionalProperty3659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAnnotationOptionalPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationOptionalPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAnnotationOptionalProperty3676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotationOptionalPropertyAccess().getQuestionMarkKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleAnnotationOptionalProperty3688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAnnotationOptionalPropertyAccess().getColonKeyword_2());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1754:1: ( ( (lv_group_3_0= ruleGroupType ) ) | ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=49 && LA36_0<=53)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1754:2: ( (lv_group_3_0= ruleGroupType ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1754:2: ( (lv_group_3_0= ruleGroupType ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1755:1: (lv_group_3_0= ruleGroupType )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1755:1: (lv_group_3_0= ruleGroupType )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1756:3: lv_group_3_0= ruleGroupType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationOptionalPropertyAccess().getGroupGroupTypeParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupType_in_ruleAnnotationOptionalProperty3710);
                    lv_group_3_0=ruleGroupType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationOptionalPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"group",
                              		lv_group_3_0, 
                              		"GroupType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1773:6: ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1773:6: ( ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )? )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1773:7: ( (lv_type_4_0= ruleValueType ) ) ( (lv_multi_5_0= '*' ) )?
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1773:7: ( (lv_type_4_0= ruleValueType ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1774:1: (lv_type_4_0= ruleValueType )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1774:1: (lv_type_4_0= ruleValueType )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1775:3: lv_type_4_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationOptionalPropertyAccess().getTypeValueTypeEnumRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleAnnotationOptionalProperty3738);
                    lv_type_4_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationOptionalPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_4_0, 
                              		"ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1791:2: ( (lv_multi_5_0= '*' ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==34) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1792:1: (lv_multi_5_0= '*' )
                            {
                            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1792:1: (lv_multi_5_0= '*' )
                            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1793:3: lv_multi_5_0= '*'
                            {
                            lv_multi_5_0=(Token)match(input,34,FOLLOW_34_in_ruleAnnotationOptionalProperty3756); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_multi_5_0, grammarAccess.getAnnotationOptionalPropertyAccess().getMultiAsteriskKeyword_3_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationOptionalPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "multi", true, "*");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationOptionalProperty"


    // $ANTLR start "entryRuleAnnotationGroup"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1814:1: entryRuleAnnotationGroup returns [EObject current=null] : iv_ruleAnnotationGroup= ruleAnnotationGroup EOF ;
    public final EObject entryRuleAnnotationGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationGroup = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1815:2: (iv_ruleAnnotationGroup= ruleAnnotationGroup EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1816:2: iv_ruleAnnotationGroup= ruleAnnotationGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationGroupRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationGroup_in_entryRuleAnnotationGroup3808);
            iv_ruleAnnotationGroup=ruleAnnotationGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationGroup3818); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationGroup"


    // $ANTLR start "ruleAnnotationGroup"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1823:1: ruleAnnotationGroup returns [EObject current=null] : (otherlv_0= '[' ( (lv_instances_1_0= ruleAnnotationInstance ) )+ otherlv_2= ']' ) ;
    public final EObject ruleAnnotationGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_instances_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1826:28: ( (otherlv_0= '[' ( (lv_instances_1_0= ruleAnnotationInstance ) )+ otherlv_2= ']' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1827:1: (otherlv_0= '[' ( (lv_instances_1_0= ruleAnnotationInstance ) )+ otherlv_2= ']' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1827:1: (otherlv_0= '[' ( (lv_instances_1_0= ruleAnnotationInstance ) )+ otherlv_2= ']' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1827:3: otherlv_0= '[' ( (lv_instances_1_0= ruleAnnotationInstance ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAnnotationGroup3855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationGroupAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1831:1: ( (lv_instances_1_0= ruleAnnotationInstance ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1832:1: (lv_instances_1_0= ruleAnnotationInstance )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1832:1: (lv_instances_1_0= ruleAnnotationInstance )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1833:3: lv_instances_1_0= ruleAnnotationInstance
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationGroupAccess().getInstancesAnnotationInstanceParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationInstance_in_ruleAnnotationGroup3876);
            	    lv_instances_1_0=ruleAnnotationInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instances",
            	              		lv_instances_1_0, 
            	              		"AnnotationInstance");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleAnnotationGroup3889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAnnotationGroupAccess().getRightSquareBracketKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationGroup"


    // $ANTLR start "entryRuleAnnotationInstance"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1861:1: entryRuleAnnotationInstance returns [EObject current=null] : iv_ruleAnnotationInstance= ruleAnnotationInstance EOF ;
    public final EObject entryRuleAnnotationInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationInstance = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1862:2: (iv_ruleAnnotationInstance= ruleAnnotationInstance EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1863:2: iv_ruleAnnotationInstance= ruleAnnotationInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationInstance_in_entryRuleAnnotationInstance3925);
            iv_ruleAnnotationInstance=ruleAnnotationInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationInstance3935); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationInstance"


    // $ANTLR start "ruleAnnotationInstance"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1870:1: ruleAnnotationInstance returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_values_1_0= ruleAnnotationValue ) )* (otherlv_2= '-HIDDEN-' ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+ otherlv_4= '-HIDDEN-' )? ) ;
    public final EObject ruleAnnotationInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1873:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_values_1_0= ruleAnnotationValue ) )* (otherlv_2= '-HIDDEN-' ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+ otherlv_4= '-HIDDEN-' )? ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1874:1: ( ( ( ruleQualifiedName ) ) ( (lv_values_1_0= ruleAnnotationValue ) )* (otherlv_2= '-HIDDEN-' ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+ otherlv_4= '-HIDDEN-' )? )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1874:1: ( ( ( ruleQualifiedName ) ) ( (lv_values_1_0= ruleAnnotationValue ) )* (otherlv_2= '-HIDDEN-' ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+ otherlv_4= '-HIDDEN-' )? )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1874:2: ( ( ruleQualifiedName ) ) ( (lv_values_1_0= ruleAnnotationValue ) )* (otherlv_2= '-HIDDEN-' ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+ otherlv_4= '-HIDDEN-' )?
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1874:2: ( ( ruleQualifiedName ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1875:1: ( ruleQualifiedName )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1875:1: ( ruleQualifiedName )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1876:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationInstanceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationInstanceAccess().getAnnotationAnnotationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotationInstance3987);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1892:2: ( (lv_values_1_0= ruleAnnotationValue ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_INT)||LA38_0==28||LA38_0==31||LA38_0==34) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1893:1: (lv_values_1_0= ruleAnnotationValue )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1893:1: (lv_values_1_0= ruleAnnotationValue )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1894:3: lv_values_1_0= ruleAnnotationValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationInstanceAccess().getValuesAnnotationValueParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotationValue_in_ruleAnnotationInstance4008);
            	    lv_values_1_0=ruleAnnotationValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_1_0, 
            	              		"AnnotationValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1910:3: (otherlv_2= '-HIDDEN-' ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+ otherlv_4= '-HIDDEN-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1910:5: otherlv_2= '-HIDDEN-' ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+ otherlv_4= '-HIDDEN-'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleAnnotationInstance4022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationInstanceAccess().getHIDDENKeyword_2_0());
                          
                    }
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1914:1: ( (lv_properties_3_0= ruleAnnotationHiddenProperty ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1915:1: (lv_properties_3_0= ruleAnnotationHiddenProperty )
                    	    {
                    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1915:1: (lv_properties_3_0= ruleAnnotationHiddenProperty )
                    	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1916:3: lv_properties_3_0= ruleAnnotationHiddenProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationInstanceAccess().getPropertiesAnnotationHiddenPropertyParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationHiddenProperty_in_ruleAnnotationInstance4043);
                    	    lv_properties_3_0=ruleAnnotationHiddenProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationInstanceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_3_0, 
                    	              		"AnnotationHiddenProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleAnnotationInstance4056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAnnotationInstanceAccess().getHIDDENKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationInstance"


    // $ANTLR start "entryRuleAnnotationHiddenProperty"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1944:1: entryRuleAnnotationHiddenProperty returns [EObject current=null] : iv_ruleAnnotationHiddenProperty= ruleAnnotationHiddenProperty EOF ;
    public final EObject entryRuleAnnotationHiddenProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationHiddenProperty = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1945:2: (iv_ruleAnnotationHiddenProperty= ruleAnnotationHiddenProperty EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1946:2: iv_ruleAnnotationHiddenProperty= ruleAnnotationHiddenProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationHiddenPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationHiddenProperty_in_entryRuleAnnotationHiddenProperty4094);
            iv_ruleAnnotationHiddenProperty=ruleAnnotationHiddenProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationHiddenProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationHiddenProperty4104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationHiddenProperty"


    // $ANTLR start "ruleAnnotationHiddenProperty"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1953:1: ruleAnnotationHiddenProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )* ) ;
    public final EObject ruleAnnotationHiddenProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1956:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1957:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1957:1: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1957:2: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )*
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1957:2: ( (otherlv_0= RULE_ID ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1958:1: (otherlv_0= RULE_ID )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1958:1: (otherlv_0= RULE_ID )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1959:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationHiddenPropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationHiddenProperty4153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAnnotationHiddenPropertyAccess().getPropertyAnnotationPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1973:2: ( (otherlv_1= RULE_ID ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred47_InternalModelDsl()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1974:1: (otherlv_1= RULE_ID )
            	    {
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1974:1: (otherlv_1= RULE_ID )
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1975:3: otherlv_1= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAnnotationHiddenPropertyRule());
            	      	        }
            	              
            	    }
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationHiddenProperty4177); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_1, grammarAccess.getAnnotationHiddenPropertyAccess().getValuesAnnotationValueCrossReference_1_0()); 
            	      	
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationHiddenProperty"


    // $ANTLR start "entryRuleAnnotationValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1997:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1998:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1999:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValueRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4214);
            iv_ruleAnnotationValue=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValue4224); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationValue"


    // $ANTLR start "ruleAnnotationValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2006:1: ruleAnnotationValue returns [EObject current=null] : (this_Value_0= ruleValue | this_AnnotationGroup_1= ruleAnnotationGroup ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        EObject this_AnnotationGroup_1 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2009:28: ( (this_Value_0= ruleValue | this_AnnotationGroup_1= ruleAnnotationGroup ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2010:1: (this_Value_0= ruleValue | this_AnnotationGroup_1= ruleAnnotationGroup )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2010:1: (this_Value_0= ruleValue | this_AnnotationGroup_1= ruleAnnotationGroup )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_INT)||LA42_0==28||LA42_0==34) ) {
                alt42=1;
            }
            else if ( (LA42_0==31) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2011:2: this_Value_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationValueAccess().getValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAnnotationValue4274);
                    this_Value_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Value_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2024:2: this_AnnotationGroup_1= ruleAnnotationGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationValueAccess().getAnnotationGroupParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotationGroup_in_ruleAnnotationValue4304);
                    this_AnnotationGroup_1=ruleAnnotationGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnnotationGroup_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationValue"


    // $ANTLR start "entryRuleGroupType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2045:1: entryRuleGroupType returns [EObject current=null] : iv_ruleGroupType= ruleGroupType EOF ;
    public final EObject entryRuleGroupType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2046:2: (iv_ruleGroupType= ruleGroupType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2047:2: iv_ruleGroupType= ruleGroupType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupTypeRule()); 
            }
            pushFollow(FOLLOW_ruleGroupType_in_entryRuleGroupType4341);
            iv_ruleGroupType=ruleGroupType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupType4351); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroupType"


    // $ANTLR start "ruleGroupType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2054:1: ruleGroupType returns [EObject current=null] : ( ( (lv_type_0_0= '#group' ) ) ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2057:28: ( ( ( (lv_type_0_0= '#group' ) ) ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2058:1: ( ( (lv_type_0_0= '#group' ) ) ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2058:1: ( ( (lv_type_0_0= '#group' ) ) ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2058:2: ( (lv_type_0_0= '#group' ) ) ( (lv_name_1_0= RULE_STRING ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2058:2: ( (lv_type_0_0= '#group' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2059:1: (lv_type_0_0= '#group' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2059:1: (lv_type_0_0= '#group' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2060:3: lv_type_0_0= '#group'
            {
            lv_type_0_0=(Token)match(input,36,FOLLOW_36_in_ruleGroupType4394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getGroupTypeAccess().getTypeGroupKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGroupTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#group");
              	    
            }

            }


            }

            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2073:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2074:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2074:1: (lv_name_1_0= RULE_STRING )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2075:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGroupType4424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGroupTypeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGroupTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroupType"


    // $ANTLR start "entryRulePackageType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2099:1: entryRulePackageType returns [EObject current=null] : iv_rulePackageType= rulePackageType EOF ;
    public final EObject entryRulePackageType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2100:2: (iv_rulePackageType= rulePackageType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2101:2: iv_rulePackageType= rulePackageType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageTypeRule()); 
            }
            pushFollow(FOLLOW_rulePackageType_in_entryRulePackageType4465);
            iv_rulePackageType=rulePackageType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageType4475); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageType"


    // $ANTLR start "rulePackageType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2108:1: rulePackageType returns [EObject current=null] : ( (lv_type_0_0= '#package' ) ) ;
    public final EObject rulePackageType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2111:28: ( ( (lv_type_0_0= '#package' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2112:1: ( (lv_type_0_0= '#package' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2112:1: ( (lv_type_0_0= '#package' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2113:1: (lv_type_0_0= '#package' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2113:1: (lv_type_0_0= '#package' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2114:3: lv_type_0_0= '#package'
            {
            lv_type_0_0=(Token)match(input,37,FOLLOW_37_in_rulePackageType4517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getPackageTypeAccess().getTypePackageKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#package");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackageType"


    // $ANTLR start "entryRuleDataTypeType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2135:1: entryRuleDataTypeType returns [EObject current=null] : iv_ruleDataTypeType= ruleDataTypeType EOF ;
    public final EObject entryRuleDataTypeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2136:2: (iv_ruleDataTypeType= ruleDataTypeType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2137:2: iv_ruleDataTypeType= ruleDataTypeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeType_in_entryRuleDataTypeType4565);
            iv_ruleDataTypeType=ruleDataTypeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeType4575); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeType"


    // $ANTLR start "ruleDataTypeType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2144:1: ruleDataTypeType returns [EObject current=null] : ( (lv_type_0_0= '#datatype' ) ) ;
    public final EObject ruleDataTypeType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2147:28: ( ( (lv_type_0_0= '#datatype' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2148:1: ( (lv_type_0_0= '#datatype' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2148:1: ( (lv_type_0_0= '#datatype' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2149:1: (lv_type_0_0= '#datatype' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2149:1: (lv_type_0_0= '#datatype' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2150:3: lv_type_0_0= '#datatype'
            {
            lv_type_0_0=(Token)match(input,38,FOLLOW_38_in_ruleDataTypeType4617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getDataTypeTypeAccess().getTypeDatatypeKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataTypeTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#datatype");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataTypeType"


    // $ANTLR start "entryRuleAnnotationType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2171:1: entryRuleAnnotationType returns [EObject current=null] : iv_ruleAnnotationType= ruleAnnotationType EOF ;
    public final EObject entryRuleAnnotationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2172:2: (iv_ruleAnnotationType= ruleAnnotationType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2173:2: iv_ruleAnnotationType= ruleAnnotationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType4665);
            iv_ruleAnnotationType=ruleAnnotationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationType4675); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationType"


    // $ANTLR start "ruleAnnotationType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2180:1: ruleAnnotationType returns [EObject current=null] : ( (lv_type_0_0= '#annotation' ) ) ;
    public final EObject ruleAnnotationType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2183:28: ( ( (lv_type_0_0= '#annotation' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2184:1: ( (lv_type_0_0= '#annotation' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2184:1: ( (lv_type_0_0= '#annotation' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2185:1: (lv_type_0_0= '#annotation' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2185:1: (lv_type_0_0= '#annotation' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2186:3: lv_type_0_0= '#annotation'
            {
            lv_type_0_0=(Token)match(input,39,FOLLOW_39_in_ruleAnnotationType4717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getAnnotationTypeAccess().getTypeAnnotationKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#annotation");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotationType"


    // $ANTLR start "entryRuleEntityType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2207:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2208:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2209:2: iv_ruleEntityType= ruleEntityType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType4765);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType4775); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2216:1: ruleEntityType returns [EObject current=null] : ( (lv_type_0_0= '#entity' ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2219:28: ( ( (lv_type_0_0= '#entity' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2220:1: ( (lv_type_0_0= '#entity' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2220:1: ( (lv_type_0_0= '#entity' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2221:1: (lv_type_0_0= '#entity' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2221:1: (lv_type_0_0= '#entity' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2222:3: lv_type_0_0= '#entity'
            {
            lv_type_0_0=(Token)match(input,40,FOLLOW_40_in_ruleEntityType4817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getEntityTypeAccess().getTypeEntityKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#entity");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRulePropertyType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2243:1: entryRulePropertyType returns [EObject current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final EObject entryRulePropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2244:2: (iv_rulePropertyType= rulePropertyType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2245:2: iv_rulePropertyType= rulePropertyType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyTypeRule()); 
            }
            pushFollow(FOLLOW_rulePropertyType_in_entryRulePropertyType4865);
            iv_rulePropertyType=rulePropertyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyType4875); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2252:1: rulePropertyType returns [EObject current=null] : ( (lv_type_0_0= '#property' ) ) ;
    public final EObject rulePropertyType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2255:28: ( ( (lv_type_0_0= '#property' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2256:1: ( (lv_type_0_0= '#property' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2256:1: ( (lv_type_0_0= '#property' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2257:1: (lv_type_0_0= '#property' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2257:1: (lv_type_0_0= '#property' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2258:3: lv_type_0_0= '#property'
            {
            lv_type_0_0=(Token)match(input,41,FOLLOW_41_in_rulePropertyType4917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getPropertyTypeAccess().getTypePropertyKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#property");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleReferenceType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2279:1: entryRuleReferenceType returns [EObject current=null] : iv_ruleReferenceType= ruleReferenceType EOF ;
    public final EObject entryRuleReferenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2280:2: (iv_ruleReferenceType= ruleReferenceType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2281:2: iv_ruleReferenceType= ruleReferenceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceTypeRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceType_in_entryRuleReferenceType4965);
            iv_ruleReferenceType=ruleReferenceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceType4975); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceType"


    // $ANTLR start "ruleReferenceType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2288:1: ruleReferenceType returns [EObject current=null] : ( (lv_type_0_0= '#reference' ) ) ;
    public final EObject ruleReferenceType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2291:28: ( ( (lv_type_0_0= '#reference' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2292:1: ( (lv_type_0_0= '#reference' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2292:1: ( (lv_type_0_0= '#reference' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2293:1: (lv_type_0_0= '#reference' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2293:1: (lv_type_0_0= '#reference' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2294:3: lv_type_0_0= '#reference'
            {
            lv_type_0_0=(Token)match(input,42,FOLLOW_42_in_ruleReferenceType5017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getReferenceTypeAccess().getTypeReferenceKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#reference");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReferenceType"


    // $ANTLR start "entryRuleReferenceListType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2315:1: entryRuleReferenceListType returns [EObject current=null] : iv_ruleReferenceListType= ruleReferenceListType EOF ;
    public final EObject entryRuleReferenceListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceListType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2316:2: (iv_ruleReferenceListType= ruleReferenceListType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2317:2: iv_ruleReferenceListType= ruleReferenceListType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceListTypeRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceListType_in_entryRuleReferenceListType5065);
            iv_ruleReferenceListType=ruleReferenceListType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceListType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceListType5075); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceListType"


    // $ANTLR start "ruleReferenceListType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2324:1: ruleReferenceListType returns [EObject current=null] : ( (lv_type_0_0= '#reference-list' ) ) ;
    public final EObject ruleReferenceListType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2327:28: ( ( (lv_type_0_0= '#reference-list' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2328:1: ( (lv_type_0_0= '#reference-list' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2328:1: ( (lv_type_0_0= '#reference-list' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2329:1: (lv_type_0_0= '#reference-list' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2329:1: (lv_type_0_0= '#reference-list' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2330:3: lv_type_0_0= '#reference-list'
            {
            lv_type_0_0=(Token)match(input,43,FOLLOW_43_in_ruleReferenceListType5117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getReferenceListTypeAccess().getTypeReferenceListKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceListTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#reference-list");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReferenceListType"


    // $ANTLR start "entryRuleParentType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2351:1: entryRuleParentType returns [EObject current=null] : iv_ruleParentType= ruleParentType EOF ;
    public final EObject entryRuleParentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2352:2: (iv_ruleParentType= ruleParentType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2353:2: iv_ruleParentType= ruleParentType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentTypeRule()); 
            }
            pushFollow(FOLLOW_ruleParentType_in_entryRuleParentType5165);
            iv_ruleParentType=ruleParentType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentType5175); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentType"


    // $ANTLR start "ruleParentType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2360:1: ruleParentType returns [EObject current=null] : ( (lv_type_0_0= '#parent' ) ) ;
    public final EObject ruleParentType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2363:28: ( ( (lv_type_0_0= '#parent' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2364:1: ( (lv_type_0_0= '#parent' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2364:1: ( (lv_type_0_0= '#parent' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2365:1: (lv_type_0_0= '#parent' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2365:1: (lv_type_0_0= '#parent' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2366:3: lv_type_0_0= '#parent'
            {
            lv_type_0_0=(Token)match(input,44,FOLLOW_44_in_ruleParentType5217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getParentTypeAccess().getTypeParentKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParentTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#parent");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParentType"


    // $ANTLR start "entryRuleChildType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2387:1: entryRuleChildType returns [EObject current=null] : iv_ruleChildType= ruleChildType EOF ;
    public final EObject entryRuleChildType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildType = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2388:2: (iv_ruleChildType= ruleChildType EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2389:2: iv_ruleChildType= ruleChildType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildTypeRule()); 
            }
            pushFollow(FOLLOW_ruleChildType_in_entryRuleChildType5265);
            iv_ruleChildType=ruleChildType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildType5275); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChildType"


    // $ANTLR start "ruleChildType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2396:1: ruleChildType returns [EObject current=null] : ( (lv_type_0_0= '#child' ) ) ;
    public final EObject ruleChildType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2399:28: ( ( (lv_type_0_0= '#child' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2400:1: ( (lv_type_0_0= '#child' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2400:1: ( (lv_type_0_0= '#child' ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2401:1: (lv_type_0_0= '#child' )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2401:1: (lv_type_0_0= '#child' )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2402:3: lv_type_0_0= '#child'
            {
            lv_type_0_0=(Token)match(input,45,FOLLOW_45_in_ruleChildType5317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getChildTypeAccess().getTypeChildKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getChildTypeRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "#child");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleChildType"


    // $ANTLR start "entryRuleAnnoTypes"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2423:1: entryRuleAnnoTypes returns [EObject current=null] : iv_ruleAnnoTypes= ruleAnnoTypes EOF ;
    public final EObject entryRuleAnnoTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnoTypes = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2424:2: (iv_ruleAnnoTypes= ruleAnnoTypes EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2425:2: iv_ruleAnnoTypes= ruleAnnoTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnoTypesRule()); 
            }
            pushFollow(FOLLOW_ruleAnnoTypes_in_entryRuleAnnoTypes5365);
            iv_ruleAnnoTypes=ruleAnnoTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnoTypes; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnoTypes5375); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnoTypes"


    // $ANTLR start "ruleAnnoTypes"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2432:1: ruleAnnoTypes returns [EObject current=null] : (this_GroupType_0= ruleGroupType | this_PackageType_1= rulePackageType | this_DataTypeType_2= ruleDataTypeType | this_AnnotationType_3= ruleAnnotationType | this_EntityType_4= ruleEntityType | this_PropertyType_5= rulePropertyType | this_ReferenceType_6= ruleReferenceType | this_ReferenceListType_7= ruleReferenceListType | this_ParentType_8= ruleParentType | this_ChildType_9= ruleChildType ) ;
    public final EObject ruleAnnoTypes() throws RecognitionException {
        EObject current = null;

        EObject this_GroupType_0 = null;

        EObject this_PackageType_1 = null;

        EObject this_DataTypeType_2 = null;

        EObject this_AnnotationType_3 = null;

        EObject this_EntityType_4 = null;

        EObject this_PropertyType_5 = null;

        EObject this_ReferenceType_6 = null;

        EObject this_ReferenceListType_7 = null;

        EObject this_ParentType_8 = null;

        EObject this_ChildType_9 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2435:28: ( (this_GroupType_0= ruleGroupType | this_PackageType_1= rulePackageType | this_DataTypeType_2= ruleDataTypeType | this_AnnotationType_3= ruleAnnotationType | this_EntityType_4= ruleEntityType | this_PropertyType_5= rulePropertyType | this_ReferenceType_6= ruleReferenceType | this_ReferenceListType_7= ruleReferenceListType | this_ParentType_8= ruleParentType | this_ChildType_9= ruleChildType ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2436:1: (this_GroupType_0= ruleGroupType | this_PackageType_1= rulePackageType | this_DataTypeType_2= ruleDataTypeType | this_AnnotationType_3= ruleAnnotationType | this_EntityType_4= ruleEntityType | this_PropertyType_5= rulePropertyType | this_ReferenceType_6= ruleReferenceType | this_ReferenceListType_7= ruleReferenceListType | this_ParentType_8= ruleParentType | this_ChildType_9= ruleChildType )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2436:1: (this_GroupType_0= ruleGroupType | this_PackageType_1= rulePackageType | this_DataTypeType_2= ruleDataTypeType | this_AnnotationType_3= ruleAnnotationType | this_EntityType_4= ruleEntityType | this_PropertyType_5= rulePropertyType | this_ReferenceType_6= ruleReferenceType | this_ReferenceListType_7= ruleReferenceListType | this_ParentType_8= ruleParentType | this_ChildType_9= ruleChildType )
            int alt43=10;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt43=1;
                }
                break;
            case 37:
                {
                alt43=2;
                }
                break;
            case 38:
                {
                alt43=3;
                }
                break;
            case 39:
                {
                alt43=4;
                }
                break;
            case 40:
                {
                alt43=5;
                }
                break;
            case 41:
                {
                alt43=6;
                }
                break;
            case 42:
                {
                alt43=7;
                }
                break;
            case 43:
                {
                alt43=8;
                }
                break;
            case 44:
                {
                alt43=9;
                }
                break;
            case 45:
                {
                alt43=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2437:2: this_GroupType_0= ruleGroupType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getGroupTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroupType_in_ruleAnnoTypes5425);
                    this_GroupType_0=ruleGroupType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GroupType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2450:2: this_PackageType_1= rulePackageType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getPackageTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackageType_in_ruleAnnoTypes5455);
                    this_PackageType_1=rulePackageType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PackageType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2463:2: this_DataTypeType_2= ruleDataTypeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getDataTypeTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeType_in_ruleAnnoTypes5485);
                    this_DataTypeType_2=ruleDataTypeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataTypeType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2476:2: this_AnnotationType_3= ruleAnnotationType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getAnnotationTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotationType_in_ruleAnnoTypes5515);
                    this_AnnotationType_3=ruleAnnotationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnnotationType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2489:2: this_EntityType_4= ruleEntityType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getEntityTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntityType_in_ruleAnnoTypes5545);
                    this_EntityType_4=ruleEntityType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntityType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2502:2: this_PropertyType_5= rulePropertyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getPropertyTypeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyType_in_ruleAnnoTypes5575);
                    this_PropertyType_5=rulePropertyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyType_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2515:2: this_ReferenceType_6= ruleReferenceType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getReferenceTypeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceType_in_ruleAnnoTypes5605);
                    this_ReferenceType_6=ruleReferenceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceType_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2528:2: this_ReferenceListType_7= ruleReferenceListType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getReferenceListTypeParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceListType_in_ruleAnnoTypes5635);
                    this_ReferenceListType_7=ruleReferenceListType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceListType_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2541:2: this_ParentType_8= ruleParentType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getParentTypeParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParentType_in_ruleAnnoTypes5665);
                    this_ParentType_8=ruleParentType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParentType_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2554:2: this_ChildType_9= ruleChildType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnoTypesAccess().getChildTypeParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleChildType_in_ruleAnnoTypes5695);
                    this_ChildType_9=ruleChildType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ChildType_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnoTypes"


    // $ANTLR start "entryRuleStringValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2573:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2574:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2575:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue5730);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue5740); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2582:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2585:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2586:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2586:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2587:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2587:1: (lv_value_0_0= RULE_STRING )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2588:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue5781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntegerValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2612:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2613:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2614:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue5821);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerValue5831); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2621:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleInteger ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2624:28: ( ( (lv_value_0_0= ruleInteger ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2625:1: ( (lv_value_0_0= ruleInteger ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2625:1: ( (lv_value_0_0= ruleInteger ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2626:1: (lv_value_0_0= ruleInteger )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2626:1: (lv_value_0_0= ruleInteger )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2627:3: lv_value_0_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleIntegerValue5876);
            lv_value_0_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Integer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleDoubleValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2651:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2652:2: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2653:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleValueRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue5911);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleValue5921); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2660:1: ruleDoubleValue returns [EObject current=null] : ( (lv_value_0_0= ruleDouble ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2663:28: ( ( (lv_value_0_0= ruleDouble ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2664:1: ( (lv_value_0_0= ruleDouble ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2664:1: ( (lv_value_0_0= ruleDouble ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2665:1: (lv_value_0_0= ruleDouble )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2665:1: (lv_value_0_0= ruleDouble )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2666:3: lv_value_0_0= ruleDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoubleValueAccess().getValueDoubleParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDouble_in_ruleDoubleValue5966);
            lv_value_0_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoubleValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Double");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleRangeValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2690:1: entryRuleRangeValue returns [EObject current=null] : iv_ruleRangeValue= ruleRangeValue EOF ;
    public final EObject entryRuleRangeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2694:2: (iv_ruleRangeValue= ruleRangeValue EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2695:2: iv_ruleRangeValue= ruleRangeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeValueRule()); 
            }
            pushFollow(FOLLOW_ruleRangeValue_in_entryRuleRangeValue6007);
            iv_ruleRangeValue=ruleRangeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeValue6017); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRangeValue"


    // $ANTLR start "ruleRangeValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2705:1: ruleRangeValue returns [EObject current=null] : ( ( ( (lv_from_0_0= ruleInteger ) ) | ( (lv_fromInf_1_0= '*' ) ) ) otherlv_2= '..' ( ( (lv_to_3_0= ruleInteger ) ) | ( (lv_toInf_4_0= '*' ) ) ) ) ;
    public final EObject ruleRangeValue() throws RecognitionException {
        EObject current = null;

        Token lv_fromInf_1_0=null;
        Token otherlv_2=null;
        Token lv_toInf_4_0=null;
        AntlrDatatypeRuleToken lv_from_0_0 = null;

        AntlrDatatypeRuleToken lv_to_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2709:28: ( ( ( ( (lv_from_0_0= ruleInteger ) ) | ( (lv_fromInf_1_0= '*' ) ) ) otherlv_2= '..' ( ( (lv_to_3_0= ruleInteger ) ) | ( (lv_toInf_4_0= '*' ) ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2710:1: ( ( ( (lv_from_0_0= ruleInteger ) ) | ( (lv_fromInf_1_0= '*' ) ) ) otherlv_2= '..' ( ( (lv_to_3_0= ruleInteger ) ) | ( (lv_toInf_4_0= '*' ) ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2710:1: ( ( ( (lv_from_0_0= ruleInteger ) ) | ( (lv_fromInf_1_0= '*' ) ) ) otherlv_2= '..' ( ( (lv_to_3_0= ruleInteger ) ) | ( (lv_toInf_4_0= '*' ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2710:2: ( ( (lv_from_0_0= ruleInteger ) ) | ( (lv_fromInf_1_0= '*' ) ) ) otherlv_2= '..' ( ( (lv_to_3_0= ruleInteger ) ) | ( (lv_toInf_4_0= '*' ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2710:2: ( ( (lv_from_0_0= ruleInteger ) ) | ( (lv_fromInf_1_0= '*' ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT||LA44_0==28) ) {
                alt44=1;
            }
            else if ( (LA44_0==34) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2710:3: ( (lv_from_0_0= ruleInteger ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2710:3: ( (lv_from_0_0= ruleInteger ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2711:1: (lv_from_0_0= ruleInteger )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2711:1: (lv_from_0_0= ruleInteger )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2712:3: lv_from_0_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRangeValueAccess().getFromIntegerParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleRangeValue6068);
                    lv_from_0_0=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRangeValueRule());
                      	        }
                             		set(
                             			current, 
                             			"from",
                              		lv_from_0_0, 
                              		"Integer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2729:6: ( (lv_fromInf_1_0= '*' ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2729:6: ( (lv_fromInf_1_0= '*' ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2730:1: (lv_fromInf_1_0= '*' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2730:1: (lv_fromInf_1_0= '*' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2731:3: lv_fromInf_1_0= '*'
                    {
                    lv_fromInf_1_0=(Token)match(input,34,FOLLOW_34_in_ruleRangeValue6092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_fromInf_1_0, grammarAccess.getRangeValueAccess().getFromInfAsteriskKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRangeValueRule());
                      	        }
                             		setWithLastConsumed(current, "fromInf", true, "*");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleRangeValue6118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeValueAccess().getFullStopFullStopKeyword_1());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2748:1: ( ( (lv_to_3_0= ruleInteger ) ) | ( (lv_toInf_4_0= '*' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT||LA45_0==28) ) {
                alt45=1;
            }
            else if ( (LA45_0==34) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2748:2: ( (lv_to_3_0= ruleInteger ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2748:2: ( (lv_to_3_0= ruleInteger ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2749:1: (lv_to_3_0= ruleInteger )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2749:1: (lv_to_3_0= ruleInteger )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2750:3: lv_to_3_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRangeValueAccess().getToIntegerParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleRangeValue6140);
                    lv_to_3_0=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRangeValueRule());
                      	        }
                             		set(
                             			current, 
                             			"to",
                              		lv_to_3_0, 
                              		"Integer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2767:6: ( (lv_toInf_4_0= '*' ) )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2767:6: ( (lv_toInf_4_0= '*' ) )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2768:1: (lv_toInf_4_0= '*' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2768:1: (lv_toInf_4_0= '*' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2769:3: lv_toInf_4_0= '*'
                    {
                    lv_toInf_4_0=(Token)match(input,34,FOLLOW_34_in_ruleRangeValue6164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_toInf_4_0, grammarAccess.getRangeValueAccess().getToInfAsteriskKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRangeValueRule());
                      	        }
                             		setWithLastConsumed(current, "toInf", true, "*");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRangeValue"


    // $ANTLR start "entryRuleFormatRangeValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2793:1: entryRuleFormatRangeValue returns [EObject current=null] : iv_ruleFormatRangeValue= ruleFormatRangeValue EOF ;
    public final EObject entryRuleFormatRangeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatRangeValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2797:2: (iv_ruleFormatRangeValue= ruleFormatRangeValue EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2798:2: iv_ruleFormatRangeValue= ruleFormatRangeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormatRangeValueRule()); 
            }
            pushFollow(FOLLOW_ruleFormatRangeValue_in_entryRuleFormatRangeValue6224);
            iv_ruleFormatRangeValue=ruleFormatRangeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormatRangeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormatRangeValue6234); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFormatRangeValue"


    // $ANTLR start "ruleFormatRangeValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2808:1: ruleFormatRangeValue returns [EObject current=null] : ( ( (lv_from_0_0= RULE_STRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFormatRangeValue() throws RecognitionException {
        EObject current = null;

        Token lv_from_0_0=null;
        Token otherlv_1=null;
        Token lv_to_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2812:28: ( ( ( (lv_from_0_0= RULE_STRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_STRING ) ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2813:1: ( ( (lv_from_0_0= RULE_STRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_STRING ) ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2813:1: ( ( (lv_from_0_0= RULE_STRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_STRING ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2813:2: ( (lv_from_0_0= RULE_STRING ) ) otherlv_1= '..' ( (lv_to_2_0= RULE_STRING ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2813:2: ( (lv_from_0_0= RULE_STRING ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2814:1: (lv_from_0_0= RULE_STRING )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2814:1: (lv_from_0_0= RULE_STRING )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2815:3: lv_from_0_0= RULE_STRING
            {
            lv_from_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormatRangeValue6280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_from_0_0, grammarAccess.getFormatRangeValueAccess().getFromSTRINGTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormatRangeValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"from",
                      		lv_from_0_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleFormatRangeValue6297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFormatRangeValueAccess().getFullStopFullStopKeyword_1());
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2835:1: ( (lv_to_2_0= RULE_STRING ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2836:1: (lv_to_2_0= RULE_STRING )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2836:1: (lv_to_2_0= RULE_STRING )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2837:3: lv_to_2_0= RULE_STRING
            {
            lv_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFormatRangeValue6314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_to_2_0, grammarAccess.getFormatRangeValueAccess().getToSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormatRangeValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"to",
                      		lv_to_2_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFormatRangeValue"


    // $ANTLR start "entryRuleValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2864:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2865:2: (iv_ruleValue= ruleValue EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2866:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue6359);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue6369); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2873:1: ruleValue returns [EObject current=null] : ( ( ( ruleStringValue )=>this_StringValue_0= ruleStringValue ) | this_IntegerValue_1= ruleIntegerValue | this_DoubleValue_2= ruleDoubleValue | this_RangeValue_3= ruleRangeValue | this_FormatRangeValue_4= ruleFormatRangeValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_DoubleValue_2 = null;

        EObject this_RangeValue_3 = null;

        EObject this_FormatRangeValue_4 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2876:28: ( ( ( ( ruleStringValue )=>this_StringValue_0= ruleStringValue ) | this_IntegerValue_1= ruleIntegerValue | this_DoubleValue_2= ruleDoubleValue | this_RangeValue_3= ruleRangeValue | this_FormatRangeValue_4= ruleFormatRangeValue ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2877:1: ( ( ( ruleStringValue )=>this_StringValue_0= ruleStringValue ) | this_IntegerValue_1= ruleIntegerValue | this_DoubleValue_2= ruleDoubleValue | this_RangeValue_3= ruleRangeValue | this_FormatRangeValue_4= ruleFormatRangeValue )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2877:1: ( ( ( ruleStringValue )=>this_StringValue_0= ruleStringValue ) | this_IntegerValue_1= ruleIntegerValue | this_DoubleValue_2= ruleDoubleValue | this_RangeValue_3= ruleRangeValue | this_FormatRangeValue_4= ruleFormatRangeValue )
            int alt46=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==EOF||LA46_1==RULE_ID||(LA46_1>=RULE_STRING && LA46_1<=RULE_INT)||LA46_1==28||(LA46_1>=31 && LA46_1<=32)||(LA46_1>=34 && LA46_1<=35)) ) {
                    alt46=1;
                }
                else if ( (LA46_1==46) ) {
                    alt46=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 46:
                        {
                        alt46=4;
                        }
                        break;
                    case 47:
                        {
                        alt46=3;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_STRING:
                    case RULE_INT:
                    case 28:
                    case 31:
                    case 32:
                    case 34:
                    case 35:
                        {
                        alt46=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 46:
                    {
                    alt46=4;
                    }
                    break;
                case 47:
                    {
                    alt46=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case 28:
                case 31:
                case 32:
                case 34:
                case 35:
                    {
                    alt46=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 3, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                alt46=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2877:2: ( ( ruleStringValue )=>this_StringValue_0= ruleStringValue )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2877:2: ( ( ruleStringValue )=>this_StringValue_0= ruleStringValue )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2877:3: ( ruleStringValue )=>this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleValue6425);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2891:2: this_IntegerValue_1= ruleIntegerValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerValue_in_ruleValue6456);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2904:2: this_DoubleValue_2= ruleDoubleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getDoubleValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleValue_in_ruleValue6486);
                    this_DoubleValue_2=ruleDoubleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2917:2: this_RangeValue_3= ruleRangeValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRangeValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRangeValue_in_ruleValue6516);
                    this_RangeValue_3=ruleRangeValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RangeValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2930:2: this_FormatRangeValue_4= ruleFormatRangeValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getFormatRangeValueParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFormatRangeValue_in_ruleValue6546);
                    this_FormatRangeValue_4=ruleFormatRangeValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FormatRangeValue_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleInteger"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2949:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2950:2: (iv_ruleInteger= ruleInteger EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2951:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger6582);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger6593); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2958:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2961:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2962:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2962:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2962:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2962:2: (kw= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2963:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleInteger6632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger6649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2983:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2984:2: (iv_ruleDouble= ruleDouble EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2985:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble6695);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble6706); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2992:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2995:28: ( (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2996:1: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2996:1: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:2997:5: this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInteger_in_ruleDouble6753);
            this_Integer_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Integer_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,47,FOLLOW_47_in_ruleDouble6771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble6786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3028:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3029:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3030:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard6832);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard6843); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3037:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3040:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3041:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3041:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3042:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6890);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3052:1: (kw= '.*' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==48) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3053:2: kw= '.*'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleQualifiedNameWithWildcard6909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3066:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3067:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3068:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6952);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName6963); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3075:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3078:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3079:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3079:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3079:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3086:1: (kw= '.' this_ID_2= RULE_ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==47) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3087:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47_in_ruleQualifiedName7022); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7037); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleValueType"
    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3107:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= '#string' ) | (enumLiteral_1= '#integer' ) | (enumLiteral_2= '#double' ) | (enumLiteral_3= '#int-range' ) | (enumLiteral_4= '#format-range' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3109:28: ( ( (enumLiteral_0= '#string' ) | (enumLiteral_1= '#integer' ) | (enumLiteral_2= '#double' ) | (enumLiteral_3= '#int-range' ) | (enumLiteral_4= '#format-range' ) ) )
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3110:1: ( (enumLiteral_0= '#string' ) | (enumLiteral_1= '#integer' ) | (enumLiteral_2= '#double' ) | (enumLiteral_3= '#int-range' ) | (enumLiteral_4= '#format-range' ) )
            {
            // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3110:1: ( (enumLiteral_0= '#string' ) | (enumLiteral_1= '#integer' ) | (enumLiteral_2= '#double' ) | (enumLiteral_3= '#int-range' ) | (enumLiteral_4= '#format-range' ) )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt50=1;
                }
                break;
            case 50:
                {
                alt50=2;
                }
                break;
            case 51:
                {
                alt50=3;
                }
                break;
            case 52:
                {
                alt50=4;
                }
                break;
            case 53:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3110:2: (enumLiteral_0= '#string' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3110:2: (enumLiteral_0= '#string' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3110:4: enumLiteral_0= '#string'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleValueType7098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3116:6: (enumLiteral_1= '#integer' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3116:6: (enumLiteral_1= '#integer' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3116:8: enumLiteral_1= '#integer'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleValueType7115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3122:6: (enumLiteral_2= '#double' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3122:6: (enumLiteral_2= '#double' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3122:8: enumLiteral_2= '#double'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_51_in_ruleValueType7132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3128:6: (enumLiteral_3= '#int-range' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3128:6: (enumLiteral_3= '#int-range' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3128:8: enumLiteral_3= '#int-range'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_52_in_ruleValueType7149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINT_RANGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINT_RANGEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3134:6: (enumLiteral_4= '#format-range' )
                    {
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3134:6: (enumLiteral_4= '#format-range' )
                    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:3134:8: enumLiteral_4= '#format-range'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_53_in_ruleValueType7166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFORMAT_RANGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFORMAT_RANGEEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValueType"

    // $ANTLR start synpred3_InternalModelDsl
    public final void synpred3_InternalModelDsl_fragment() throws RecognitionException {   
        EObject this_Type_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:189:2: (this_Type_0= ruleType )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:189:2: this_Type_0= ruleType
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleType_in_synpred3_InternalModelDsl360);
        this_Type_0=ruleType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalModelDsl

    // $ANTLR start synpred4_InternalModelDsl
    public final void synpred4_InternalModelDsl_fragment() throws RecognitionException {   
        EObject this_Annotation_1 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:202:2: (this_Annotation_1= ruleAnnotation )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:202:2: this_Annotation_1= ruleAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAnnotation_in_synpred4_InternalModelDsl390);
        this_Annotation_1=ruleAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalModelDsl

    // $ANTLR start synpred5_InternalModelDsl
    public final void synpred5_InternalModelDsl_fragment() throws RecognitionException {   
        EObject this_Entity_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:248:2: (this_Entity_0= ruleEntity )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:248:2: this_Entity_0= ruleEntity
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEntity_in_synpred5_InternalModelDsl515);
        this_Entity_0=ruleEntity();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalModelDsl

    // $ANTLR start synpred16_InternalModelDsl
    public final void synpred16_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_childs_2_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:7: ({...}? => ( (lv_childs_2_0= ruleChild ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:7: {...}? => ( (lv_childs_2_0= ruleChild ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred16_InternalModelDsl", "true");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:16: ( (lv_childs_2_0= ruleChild ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:838:1: (lv_childs_2_0= ruleChild )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:838:1: (lv_childs_2_0= ruleChild )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:839:3: lv_childs_2_0= ruleChild
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEntityElementsAccess().getChildsChildParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleChild_in_synpred16_InternalModelDsl1740);
        lv_childs_2_0=ruleChild();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalModelDsl

    // $ANTLR start synpred17_InternalModelDsl
    public final void synpred17_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_childs_2_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:832:4: ( ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:832:4: ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:832:4: ({...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:833:5: {...}? => ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalModelDsl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0)");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:833:111: ( ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+ )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:834:6: ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 0);
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:6: ({...}? => ( (lv_childs_2_0= ruleChild ) ) )+
        int cnt51=0;
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==24) && ((true))) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:7: {...}? => ( (lv_childs_2_0= ruleChild ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred17_InternalModelDsl", "true");
        	    }
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:837:16: ( (lv_childs_2_0= ruleChild ) )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:838:1: (lv_childs_2_0= ruleChild )
        	    {
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:838:1: (lv_childs_2_0= ruleChild )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:839:3: lv_childs_2_0= ruleChild
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getChildsChildParserRuleCall_1_0_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleChild_in_synpred17_InternalModelDsl1740);
        	    lv_childs_2_0=ruleChild();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt51 >= 1 ) break loop51;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(51, input);
                    throw eee;
            }
            cnt51++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalModelDsl

    // $ANTLR start synpred18_InternalModelDsl
    public final void synpred18_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_properties_3_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:7: ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:7: {...}? => ( (lv_properties_3_0= ruleProperty ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred18_InternalModelDsl", "true");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:16: ( (lv_properties_3_0= ruleProperty ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:868:1: (lv_properties_3_0= ruleProperty )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:868:1: (lv_properties_3_0= ruleProperty )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:869:3: lv_properties_3_0= ruleProperty
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEntityElementsAccess().getPropertiesPropertyParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProperty_in_synpred18_InternalModelDsl1816);
        lv_properties_3_0=ruleProperty();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalModelDsl

    // $ANTLR start synpred19_InternalModelDsl
    public final void synpred19_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_properties_3_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:862:4: ( ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:862:4: ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:862:4: ({...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:863:5: {...}? => ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred19_InternalModelDsl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1)");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:863:111: ( ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+ )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:864:6: ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 1);
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:6: ({...}? => ( (lv_properties_3_0= ruleProperty ) ) )+
        int cnt52=0;
        loop52:
        do {
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) && ((true))) {
                alt52=1;
            }


            switch (alt52) {
        	case 1 :
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:7: {...}? => ( (lv_properties_3_0= ruleProperty ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred19_InternalModelDsl", "true");
        	    }
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:867:16: ( (lv_properties_3_0= ruleProperty ) )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:868:1: (lv_properties_3_0= ruleProperty )
        	    {
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:868:1: (lv_properties_3_0= ruleProperty )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:869:3: lv_properties_3_0= ruleProperty
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getPropertiesPropertyParserRuleCall_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleProperty_in_synpred19_InternalModelDsl1816);
        	    lv_properties_3_0=ruleProperty();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt52 >= 1 ) break loop52;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(52, input);
                    throw eee;
            }
            cnt52++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred19_InternalModelDsl

    // $ANTLR start synpred20_InternalModelDsl
    public final void synpred20_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_references_4_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:7: ({...}? => ( (lv_references_4_0= ruleReference ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:7: {...}? => ( (lv_references_4_0= ruleReference ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred20_InternalModelDsl", "true");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:16: ( (lv_references_4_0= ruleReference ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:898:1: (lv_references_4_0= ruleReference )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:898:1: (lv_references_4_0= ruleReference )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:899:3: lv_references_4_0= ruleReference
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEntityElementsAccess().getReferencesReferenceParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleReference_in_synpred20_InternalModelDsl1892);
        lv_references_4_0=ruleReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalModelDsl

    // $ANTLR start synpred21_InternalModelDsl
    public final void synpred21_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_references_4_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:892:4: ( ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:892:4: ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:892:4: ({...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:893:5: {...}? => ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred21_InternalModelDsl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2)");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:893:111: ( ({...}? => ( (lv_references_4_0= ruleReference ) ) )+ )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:894:6: ({...}? => ( (lv_references_4_0= ruleReference ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 2);
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:6: ({...}? => ( (lv_references_4_0= ruleReference ) ) )+
        int cnt53=0;
        loop53:
        do {
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) && ((true))) {
                alt53=1;
            }


            switch (alt53) {
        	case 1 :
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:7: {...}? => ( (lv_references_4_0= ruleReference ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred21_InternalModelDsl", "true");
        	    }
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:897:16: ( (lv_references_4_0= ruleReference ) )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:898:1: (lv_references_4_0= ruleReference )
        	    {
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:898:1: (lv_references_4_0= ruleReference )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:899:3: lv_references_4_0= ruleReference
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getReferencesReferenceParserRuleCall_1_2_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleReference_in_synpred21_InternalModelDsl1892);
        	    lv_references_4_0=ruleReference();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt53 >= 1 ) break loop53;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(53, input);
                    throw eee;
            }
            cnt53++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalModelDsl

    // $ANTLR start synpred22_InternalModelDsl
    public final void synpred22_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_referenceLists_5_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:7: ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:7: {...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred22_InternalModelDsl", "true");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:16: ( (lv_referenceLists_5_0= ruleReferenceList ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:928:1: (lv_referenceLists_5_0= ruleReferenceList )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:928:1: (lv_referenceLists_5_0= ruleReferenceList )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:929:3: lv_referenceLists_5_0= ruleReferenceList
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEntityElementsAccess().getReferenceListsReferenceListParserRuleCall_1_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleReferenceList_in_synpred22_InternalModelDsl1968);
        lv_referenceLists_5_0=ruleReferenceList();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalModelDsl

    // $ANTLR start synpred23_InternalModelDsl
    public final void synpred23_InternalModelDsl_fragment() throws RecognitionException {   
        EObject lv_referenceLists_5_0 = null;


        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:922:4: ( ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:922:4: ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:922:4: ({...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:923:5: {...}? => ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred23_InternalModelDsl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3)");
        }
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:923:111: ( ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+ )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:924:6: ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getEntityElementsAccess().getUnorderedGroup_1(), 3);
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:6: ({...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) ) )+
        int cnt54=0;
        loop54:
        do {
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) && ((true))) {
                alt54=1;
            }


            switch (alt54) {
        	case 1 :
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:7: {...}? => ( (lv_referenceLists_5_0= ruleReferenceList ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred23_InternalModelDsl", "true");
        	    }
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:927:16: ( (lv_referenceLists_5_0= ruleReferenceList ) )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:928:1: (lv_referenceLists_5_0= ruleReferenceList )
        	    {
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:928:1: (lv_referenceLists_5_0= ruleReferenceList )
        	    // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:929:3: lv_referenceLists_5_0= ruleReferenceList
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getEntityElementsAccess().getReferenceListsReferenceListParserRuleCall_1_3_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleReferenceList_in_synpred23_InternalModelDsl1968);
        	    lv_referenceLists_5_0=ruleReferenceList();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt54 >= 1 ) break loop54;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(54, input);
                    throw eee;
            }
            cnt54++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalModelDsl

    // $ANTLR start synpred47_InternalModelDsl
    public final void synpred47_InternalModelDsl_fragment() throws RecognitionException {   
        Token otherlv_1=null;

        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1974:1: ( (otherlv_1= RULE_ID ) )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1974:1: (otherlv_1= RULE_ID )
        {
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1974:1: (otherlv_1= RULE_ID )
        // ../org.molymer/src-gen/org/molymer/parser/antlr/internal/InternalModelDsl.g:1975:3: otherlv_1= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred47_InternalModelDsl4177); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred47_InternalModelDsl

    // Delegated rules

    public final boolean synpred22_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalModelDsl_fragment(); // can never throw exception
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
    public final boolean synpred47_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalModelDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalModelDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel137 = new BitSet(new long[]{0x0000000080226002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel159 = new BitSet(new long[]{0x0000000080224002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleElement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleElement420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_rulePackage636 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_14_in_rulePackage649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage666 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackage683 = new BitSet(new long[]{0x0000000080234000L});
    public static final BitSet FOLLOW_ruleElement_in_rulePackage704 = new BitSet(new long[]{0x0000000080234000L});
    public static final BitSet FOLLOW_16_in_rulePackage717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleDataType809 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_ruleDataType822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType839 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataType856 = new BitSet(new long[]{0x00000000001D0010L});
    public static final BitSet FOLLOW_ruleDataTypeField_in_ruleDataType877 = new BitSet(new long[]{0x00000000001D0010L});
    public static final BitSet FOLLOW_16_in_ruleDataType890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeField_in_entryRuleDataTypeField926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeField936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternType_in_ruleDataTypeField983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_PATTERN_STRING_in_ruleDataTypeField1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataTypeField1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternType_in_entryRulePatternType1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternType1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePatternType1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePatternType1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePatternType1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleEntity1307 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleEntity1320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1354 = new BitSet(new long[]{0x0000000001C10010L});
    public static final BitSet FOLLOW_ruleParent_in_ruleEntity1375 = new BitSet(new long[]{0x0000000001410010L});
    public static final BitSet FOLLOW_ruleEntityElements_in_ruleEntity1397 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_ruleEntityGroup_in_ruleEntity1418 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_ruleEntity1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityGroup_in_entryRuleEntityGroup1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityGroup1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEntityGroup1514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityGroup1531 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntityGroup1548 = new BitSet(new long[]{0x0000000001010010L});
    public static final BitSet FOLLOW_ruleEntityElements_in_ruleEntityGroup1569 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEntityGroup1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityElements_in_entryRuleEntityElements1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityElements1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_ruleEntityElements1740 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntityElements1816 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_ruleReference_in_ruleEntityElements1892 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_ruleReferenceList_in_ruleEntityElements1968 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParent_in_ruleContainer2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_ruleContainer2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleField2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleField2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceList_in_ruleField2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParent_in_entryRuleParent2329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParent2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParent2376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParent2403 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleParent2424 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleChild_in_entryRuleChild2461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChild2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleChild2508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleChild2535 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleChild2556 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2645 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleProperty2668 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProperty2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProperty2721 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleProperty2742 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference2831 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_25_in_ruleReference2854 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReference2880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReference2907 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleReference2928 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleReferenceList_in_entryRuleReferenceList2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceList2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceList3017 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_28_in_ruleReferenceList3036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceList3060 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleReferenceList3072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30_in_ruleReferenceList3091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReferenceList3119 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleReferenceList3140 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation3177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAnnotation3224 = new BitSet(new long[]{0x00003FF000000000L});
    public static final BitSet FOLLOW_ruleAnnoTypes_in_ruleAnnotation3245 = new BitSet(new long[]{0x00003FF100000010L});
    public static final BitSet FOLLOW_ruleAnnotationInstance_in_ruleAnnotation3267 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleAnnotation3280 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAnnotation3292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation3309 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation3326 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAnnotationMandatoryProperty_in_ruleAnnotation3347 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAnnotationOptionalProperty_in_ruleAnnotation3369 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleAnnotation3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationMandatoryProperty_in_entryRuleAnnotationMandatoryProperty3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationMandatoryProperty3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationMandatoryProperty3470 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAnnotationMandatoryProperty3487 = new BitSet(new long[]{0x003E001000000000L});
    public static final BitSet FOLLOW_ruleGroupType_in_ruleAnnotationMandatoryProperty3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleAnnotationMandatoryProperty3537 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleAnnotationMandatoryProperty3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationOptionalProperty_in_entryRuleAnnotationOptionalProperty3607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationOptionalProperty3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationOptionalProperty3659 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAnnotationOptionalProperty3676 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAnnotationOptionalProperty3688 = new BitSet(new long[]{0x003E001000000000L});
    public static final BitSet FOLLOW_ruleGroupType_in_ruleAnnotationOptionalProperty3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleAnnotationOptionalProperty3738 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleAnnotationOptionalProperty3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_entryRuleAnnotationGroup3808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationGroup3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAnnotationGroup3855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationInstance_in_ruleAnnotationGroup3876 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleAnnotationGroup3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationInstance_in_entryRuleAnnotationInstance3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationInstance3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationInstance3987 = new BitSet(new long[]{0x0000000C900000C2L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationInstance4008 = new BitSet(new long[]{0x0000000C900000C2L});
    public static final BitSet FOLLOW_35_in_ruleAnnotationInstance4022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotationHiddenProperty_in_ruleAnnotationInstance4043 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_ruleAnnotationInstance4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationHiddenProperty_in_entryRuleAnnotationHiddenProperty4094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationHiddenProperty4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationHiddenProperty4153 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationHiddenProperty4177 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAnnotationValue4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationGroup_in_ruleAnnotationValue4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupType_in_entryRuleGroupType4341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupType4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleGroupType4394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGroupType4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageType_in_entryRulePackageType4465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageType4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePackageType4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeType_in_entryRuleDataTypeType4565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeType4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataTypeType4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_entryRuleAnnotationType4665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationType4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAnnotationType4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType4765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntityType4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_entryRulePropertyType4865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyType4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePropertyType4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceType_in_entryRuleReferenceType4965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceType4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleReferenceType5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceListType_in_entryRuleReferenceListType5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceListType5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleReferenceListType5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentType_in_entryRuleParentType5165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentType5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParentType5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildType_in_entryRuleChildType5265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildType5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleChildType5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnoTypes_in_entryRuleAnnoTypes5365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnoTypes5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupType_in_ruleAnnoTypes5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageType_in_ruleAnnoTypes5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeType_in_ruleAnnoTypes5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationType_in_ruleAnnoTypes5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleAnnoTypes5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_ruleAnnoTypes5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceType_in_ruleAnnoTypes5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceListType_in_ruleAnnoTypes5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentType_in_ruleAnnoTypes5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildType_in_ruleAnnoTypes5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue5730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue5821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleIntegerValue5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue5911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDoubleValue5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeValue_in_entryRuleRangeValue6007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeValue6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleRangeValue6068 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34_in_ruleRangeValue6092 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRangeValue6118 = new BitSet(new long[]{0x0000000410000080L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleRangeValue6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRangeValue6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormatRangeValue_in_entryRuleFormatRangeValue6224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormatRangeValue6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormatRangeValue6280 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFormatRangeValue6297 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFormatRangeValue6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue6359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleValue6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerValue_in_ruleValue6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleValue_in_ruleValue6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeValue_in_ruleValue6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormatRangeValue_in_ruleValue6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger6582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInteger6632 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble6695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleDouble6753 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDouble6771 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard6832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6890 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleQualifiedNameWithWildcard6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7003 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleQualifiedName7022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7037 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleValueType7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleValueType7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_synpred3_InternalModelDsl360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_synpred4_InternalModelDsl390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_synpred5_InternalModelDsl515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_synpred16_InternalModelDsl1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChild_in_synpred17_InternalModelDsl1740 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleProperty_in_synpred18_InternalModelDsl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_synpred19_InternalModelDsl1816 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleReference_in_synpred20_InternalModelDsl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_synpred21_InternalModelDsl1892 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleReferenceList_in_synpred22_InternalModelDsl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceList_in_synpred23_InternalModelDsl1968 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred47_InternalModelDsl4177 = new BitSet(new long[]{0x0000000000000002L});

}
