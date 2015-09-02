package org.molymer.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelDslLexer extends Lexer {
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

    public InternalModelDslLexer() {;} 
    public InternalModelDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalModelDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:11:7: ( '--<' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:11:9: '--<'
            {
            match("--<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:12:7: ( '#string' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:12:9: '#string'
            {
            match("#string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:13:7: ( '#integer' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:13:9: '#integer'
            {
            match("#integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:14:7: ( '#double' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:14:9: '#double'
            {
            match("#double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:15:7: ( '#int-range' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:15:9: '#int-range'
            {
            match("#int-range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:16:7: ( '#format-range' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:16:9: '#format-range'
            {
            match("#format-range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:17:7: ( 'import' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:17:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:18:7: ( 'package' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:18:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:19:7: ( '{' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:19:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:20:7: ( '}' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:21:7: ( 'datatype' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:21:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:22:7: ( 'entity' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:22:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:23:7: ( 'group' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:23:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:24:7: ( ':parent->' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:24:9: ':parent->'
            {
            match(":parent->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:25:7: ( ':childs-<' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:25:9: ':childs-<'
            {
            match(":childs-<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:26:7: ( ':' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:27:7: ( '-->' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:27:9: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:28:7: ( '-' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:29:7: ( '-<' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:29:9: '-<'
            {
            match("-<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:30:7: ( '[' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:31:7: ( ']' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:32:7: ( 'annotation' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:32:9: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:33:7: ( '?' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:33:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:34:7: ( '-HIDDEN-' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:34:9: '-HIDDEN-'
            {
            match("-HIDDEN-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:35:7: ( '..' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:35:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:36:7: ( '.' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:36:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:37:7: ( '.*' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:37:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:38:7: ( '@regex' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:38:9: '@regex'
            {
            match("@regex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:39:7: ( '@date' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:39:9: '@date'
            {
            match("@date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:40:7: ( '@number' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:40:9: '@number'
            {
            match("@number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:41:7: ( '*' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:41:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:42:7: ( '#group' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:42:9: '#group'
            {
            match("#group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:43:7: ( '#package' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:43:9: '#package'
            {
            match("#package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:44:7: ( '#datatype' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:44:9: '#datatype'
            {
            match("#datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:45:7: ( '#annotation' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:45:9: '#annotation'
            {
            match("#annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:46:7: ( '#entity' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:46:9: '#entity'
            {
            match("#entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:47:7: ( '#property' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:47:9: '#property'
            {
            match("#property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:48:7: ( '#reference' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:48:9: '#reference'
            {
            match("#reference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:49:7: ( '#reference-list' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:49:9: '#reference-list'
            {
            match("#reference-list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:50:7: ( '#parent' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:50:9: '#parent'
            {
            match("#parent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:51:7: ( '#child' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:51:9: '#child'
            {
            match("#child"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6800:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6800:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6800:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6802:10: ( ( '0' .. '9' )+ )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6802:12: ( '0' .. '9' )+
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6802:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6802:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6804:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6804:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6804:24: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6804:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:41: ( '\\r' )? '\\n'
                    {
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6806:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6808:9: ( ( ' ' | '\\t' )+ )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6808:11: ( ' ' | '\\t' )+
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6808:11: ( ' ' | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_END_LINE"
    public final void mRULE_END_LINE() throws RecognitionException {
        try {
            int _type = RULE_END_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6810:15: ( ( '\\r' )? '\\n' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6810:17: ( '\\r' )? '\\n'
            {
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6810:17: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6810:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_LINE"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6812:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6812:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6812:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6812:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6812:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_PATTERN_STRING"
    public final void mRULE_PATTERN_STRING() throws RecognitionException {
        try {
            int _type = RULE_PATTERN_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6814:21: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6814:23: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6814:28: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6814:29: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6814:36: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATTERN_STRING"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6816:16: ( . )
            // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:6816:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_END_LINE | RULE_STRING | RULE_PATTERN_STRING | RULE_ANY_OTHER )
        int alt11=50;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:256: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:264: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:273: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:289: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:305: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:313: RULE_END_LINE
                {
                mRULE_END_LINE(); 

                }
                break;
            case 48 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:327: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:339: RULE_PATTERN_STRING
                {
                mRULE_PATTERN_STRING(); 

                }
                break;
            case 50 :
                // ../org.molymer.ui/src-gen/org/molymer/ui/contentassist/antlr/internal/InternalModelDsl.g:1:359: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\36\1\32\2\52\2\uffff\3\52\1\63\2\uffff\1\52\1\uffff"+
        "\1\72\1\32\3\uffff\1\32\1\uffff\1\32\1\uffff\2\32\17\uffff\1\52"+
        "\1\uffff\1\52\2\uffff\3\52\5\uffff\1\52\27\uffff\6\52\4\uffff\6"+
        "\52\3\uffff\4\52\1\154\1\52\1\uffff\1\157\2\52\1\162\1\uffff\1\52"+
        "\2\uffff\1\165\1\52\1\uffff\1\52\2\uffff\1\171\1\52\2\uffff\1\52"+
        "\1\176\1\177\3\uffff";
    static final String DFA11_eofS =
        "\u0080\uffff";
    static final String DFA11_minS =
        "\1\0\1\55\1\141\1\155\1\141\2\uffff\1\141\1\156\1\162\1\143\2\uffff"+
        "\1\156\1\uffff\1\52\1\144\3\uffff\1\52\1\uffff\1\12\1\uffff\2\0"+
        "\1\uffff\1\74\4\uffff\1\156\1\141\2\uffff\1\141\2\uffff\1\145\1"+
        "\uffff\1\160\1\uffff\1\143\2\uffff\2\164\1\157\5\uffff\1\156\21"+
        "\uffff\1\164\2\uffff\1\143\1\uffff\1\146\1\157\1\153\1\141\1\151"+
        "\1\165\1\157\1\55\2\uffff\1\145\1\162\1\141\2\164\1\160\1\164\2"+
        "\uffff\1\162\1\164\1\147\2\171\1\60\1\141\1\145\1\60\1\145\1\160"+
        "\1\60\1\uffff\1\164\1\156\1\uffff\1\60\1\145\1\uffff\1\151\1\143"+
        "\1\uffff\1\60\1\157\1\145\1\uffff\1\156\1\55\1\60\3\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\110\1\163\1\155\1\141\2\uffff\1\141\1\156\1\162\1\160"+
        "\2\uffff\1\156\1\uffff\1\56\1\162\3\uffff\1\57\1\uffff\1\12\1\uffff"+
        "\2\uffff\1\uffff\1\76\4\uffff\1\156\1\157\2\uffff\1\162\2\uffff"+
        "\1\145\1\uffff\1\160\1\uffff\1\143\2\uffff\2\164\1\157\5\uffff\1"+
        "\156\21\uffff\1\164\2\uffff\1\162\1\uffff\1\146\1\157\1\153\1\141"+
        "\1\151\1\165\1\157\1\145\2\uffff\1\145\1\162\1\141\2\164\1\160\1"+
        "\164\2\uffff\1\162\1\164\1\147\2\171\1\172\1\141\1\145\1\172\1\145"+
        "\1\160\1\172\1\uffff\1\164\1\156\1\uffff\1\172\1\145\1\uffff\1\151"+
        "\1\143\1\uffff\1\172\1\157\1\145\1\uffff\1\156\1\55\1\172\3\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\11\1\12\4\uffff\1\24\1\25\1\uffff\1\27\2\uffff\1\37"+
        "\1\52\1\53\1\uffff\1\56\1\uffff\1\57\2\uffff\1\62\1\uffff\1\23\1"+
        "\30\1\22\1\2\2\uffff\1\6\1\40\1\uffff\1\43\1\44\1\uffff\1\51\1\uffff"+
        "\1\52\1\uffff\1\11\1\12\3\uffff\1\16\1\17\1\20\1\24\1\25\1\uffff"+
        "\1\27\1\31\1\33\1\32\1\34\1\35\1\36\1\37\1\53\1\54\1\55\1\56\1\57"+
        "\1\60\1\61\1\1\1\21\1\uffff\1\4\1\42\1\uffff\1\45\10\uffff\1\41"+
        "\1\50\7\uffff\1\3\1\5\14\uffff\1\15\2\uffff\1\7\2\uffff\1\14\2\uffff"+
        "\1\10\3\uffff\1\13\3\uffff\1\47\1\46\1\26";
    static final String DFA11_specialS =
        "\1\0\27\uffff\1\2\1\1\146\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\32\1\25\1\27\2\32\1\26\22\32\1\25\1\32\1\30\1\2\3\32\1"+
            "\31\2\32\1\21\2\32\1\1\1\17\1\24\12\23\1\12\4\32\1\16\1\20\32"+
            "\22\1\13\1\32\1\14\3\32\1\15\2\22\1\7\1\10\1\22\1\11\1\22\1"+
            "\3\6\22\1\4\12\22\1\5\1\32\1\6\uff82\32",
            "\1\33\16\uffff\1\34\13\uffff\1\35",
            "\1\45\1\uffff\1\50\1\41\1\46\1\42\1\43\1\uffff\1\40\6\uffff"+
            "\1\44\1\uffff\1\47\1\37",
            "\1\51",
            "\1\53",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62\14\uffff\1\61",
            "",
            "",
            "\1\66",
            "",
            "\1\71\3\uffff\1\70",
            "\1\74\11\uffff\1\75\3\uffff\1\73",
            "",
            "",
            "",
            "\1\100\4\uffff\1\101",
            "",
            "\1\103",
            "",
            "\0\104",
            "\0\105",
            "",
            "\1\106\1\uffff\1\107",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\112\15\uffff\1\111",
            "",
            "",
            "\1\113\20\uffff\1\114",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "",
            "\1\117",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "",
            "",
            "\1\125\16\uffff\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\67\uffff\1\136",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\155",
            "\1\156",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\160",
            "\1\161",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\163",
            "\1\164",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_END_LINE | RULE_STRING | RULE_PATTERN_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='-') ) {s = 1;}

                        else if ( (LA11_0=='#') ) {s = 2;}

                        else if ( (LA11_0=='i') ) {s = 3;}

                        else if ( (LA11_0=='p') ) {s = 4;}

                        else if ( (LA11_0=='{') ) {s = 5;}

                        else if ( (LA11_0=='}') ) {s = 6;}

                        else if ( (LA11_0=='d') ) {s = 7;}

                        else if ( (LA11_0=='e') ) {s = 8;}

                        else if ( (LA11_0=='g') ) {s = 9;}

                        else if ( (LA11_0==':') ) {s = 10;}

                        else if ( (LA11_0=='[') ) {s = 11;}

                        else if ( (LA11_0==']') ) {s = 12;}

                        else if ( (LA11_0=='a') ) {s = 13;}

                        else if ( (LA11_0=='?') ) {s = 14;}

                        else if ( (LA11_0=='.') ) {s = 15;}

                        else if ( (LA11_0=='@') ) {s = 16;}

                        else if ( (LA11_0=='*') ) {s = 17;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='b' && LA11_0<='c')||LA11_0=='f'||LA11_0=='h'||(LA11_0>='j' && LA11_0<='o')||(LA11_0>='q' && LA11_0<='z')) ) {s = 18;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 19;}

                        else if ( (LA11_0=='/') ) {s = 20;}

                        else if ( (LA11_0=='\t'||LA11_0==' ') ) {s = 21;}

                        else if ( (LA11_0=='\r') ) {s = 22;}

                        else if ( (LA11_0=='\n') ) {s = 23;}

                        else if ( (LA11_0=='\"') ) {s = 24;}

                        else if ( (LA11_0=='\'') ) {s = 25;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='$' && LA11_0<='&')||(LA11_0>='(' && LA11_0<=')')||(LA11_0>='+' && LA11_0<=',')||(LA11_0>=';' && LA11_0<='>')||LA11_0=='\\'||(LA11_0>='^' && LA11_0<='`')||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_25 = input.LA(1);

                        s = -1;
                        if ( ((LA11_25>='\u0000' && LA11_25<='\uFFFF')) ) {s = 69;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_24 = input.LA(1);

                        s = -1;
                        if ( ((LA11_24>='\u0000' && LA11_24<='\uFFFF')) ) {s = 68;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}