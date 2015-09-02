package org.molymer.conf.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigDslLexer extends Lexer {
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

    public InternalConfigDslLexer() {;} 
    public InternalConfigDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalConfigDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:11:7: ( 'config' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:11:9: 'config'
            {
            match("config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:12:7: ( '{' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:13:7: ( 'appName' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:13:9: 'appName'
            {
            match("appName"); 


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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:14:7: ( '=' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:14:9: '='
            {
            match('='); 

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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:15:7: ( 'mainClass' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:15:9: 'mainClass'
            {
            match("mainClass"); 


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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:16:7: ( 'srcFolder' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:16:9: 'srcFolder'
            {
            match("srcFolder"); 


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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:17:7: ( 'outFolder' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:17:9: 'outFolder'
            {
            match("outFolder"); 


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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:18:7: ( 'generators' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:18:9: 'generators'
            {
            match("generators"); 


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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:19:7: ( '}' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:19:9: '}'
            {
            match('}'); 

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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:20:7: ( '[' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:20:9: '['
            {
            match('['); 

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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:21:7: ( ']' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:21:9: ']'
            {
            match(']'); 

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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:22:7: ( ':' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1178:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1178:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1178:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1178:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1178:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop1;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1180:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1180:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1180:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1180:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1180:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:
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
            	    break loop3;
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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1182:10: ( ( '0' .. '9' )+ )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1182:12: ( '0' .. '9' )+
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1182:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1182:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1184:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1184:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1184:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1184:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);

            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:41: ( '\\r' )? '\\n'
                    {
                    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1186:41: '\\r'
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
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1188:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1188:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1188:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1190:16: ( . )
            // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1190:18: .
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
        // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=19;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:82: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:94: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:111: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:127: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.molymer.conf.ui/src-gen/org/molymer/conf/ui/contentassist/antlr/internal/InternalConfigDsl.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\25\1\uffff\1\25\1\uffff\4\25\4\uffff\2\23\2\uffff\1"+
        "\23\2\uffff\1\25\2\uffff\1\25\1\uffff\4\25\11\uffff\22\25\1\76\5"+
        "\25\1\uffff\1\104\4\25\1\uffff\4\25\1\115\1\116\1\117\1\25\3\uffff"+
        "\1\121\1\uffff";
    static final String DFA10_eofS =
        "\122\uffff";
    static final String DFA10_minS =
        "\1\0\1\157\1\uffff\1\160\1\uffff\1\141\1\162\1\165\1\145\4\uffff"+
        "\1\0\1\101\2\uffff\1\52\2\uffff\1\156\2\uffff\1\160\1\uffff\1\151"+
        "\1\143\1\164\1\156\11\uffff\1\146\1\116\1\156\2\106\1\145\1\151"+
        "\1\141\1\103\2\157\1\162\1\147\1\155\3\154\1\141\1\60\1\145\1\141"+
        "\2\144\1\164\1\uffff\1\60\1\163\2\145\1\157\1\uffff\1\163\3\162"+
        "\3\60\1\163\3\uffff\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\157\1\uffff\1\160\1\uffff\1\141\1\162\1\165\1\145\4"+
        "\uffff\1\uffff\1\172\2\uffff\1\57\2\uffff\1\156\2\uffff\1\160\1"+
        "\uffff\1\151\1\143\1\164\1\156\11\uffff\1\146\1\116\1\156\2\106"+
        "\1\145\1\151\1\141\1\103\2\157\1\162\1\147\1\155\3\154\1\141\1\172"+
        "\1\145\1\141\2\144\1\164\1\uffff\1\172\1\163\2\145\1\157\1\uffff"+
        "\1\163\3\162\3\172\1\163\3\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\4\uffff\1\11\1\12\1\13\1\14\2\uffff\1"+
        "\16\1\17\1\uffff\1\22\1\23\1\uffff\1\16\1\2\1\uffff\1\4\4\uffff"+
        "\1\11\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1\22\30\uffff\1\1\5\uffff"+
        "\1\3\10\uffff\1\5\1\6\1\7\1\uffff\1\10";
    static final String DFA10_specialS =
        "\1\0\14\uffff\1\1\104\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\15\14\23\1\21\12\20"+
            "\1\14\2\23\1\4\3\23\32\17\1\12\1\23\1\13\1\16\1\17\1\23\1\3"+
            "\1\17\1\1\3\17\1\10\5\17\1\5\1\17\1\7\3\17\1\6\7\17\1\2\1\23"+
            "\1\11\uff82\23",
            "\1\24",
            "",
            "\1\27",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "",
            "",
            "\0\41",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "\1\46",
            "",
            "",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\120",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='c') ) {s = 1;}

                        else if ( (LA10_0=='{') ) {s = 2;}

                        else if ( (LA10_0=='a') ) {s = 3;}

                        else if ( (LA10_0=='=') ) {s = 4;}

                        else if ( (LA10_0=='m') ) {s = 5;}

                        else if ( (LA10_0=='s') ) {s = 6;}

                        else if ( (LA10_0=='o') ) {s = 7;}

                        else if ( (LA10_0=='g') ) {s = 8;}

                        else if ( (LA10_0=='}') ) {s = 9;}

                        else if ( (LA10_0=='[') ) {s = 10;}

                        else if ( (LA10_0==']') ) {s = 11;}

                        else if ( (LA10_0==':') ) {s = 12;}

                        else if ( (LA10_0=='\"') ) {s = 13;}

                        else if ( (LA10_0=='^') ) {s = 14;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||LA10_0=='b'||(LA10_0>='d' && LA10_0<='f')||(LA10_0>='h' && LA10_0<='l')||LA10_0=='n'||(LA10_0>='p' && LA10_0<='r')||(LA10_0>='t' && LA10_0<='z')) ) {s = 15;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 16;}

                        else if ( (LA10_0=='/') ) {s = 17;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 18;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='.')||(LA10_0>=';' && LA10_0<='<')||(LA10_0>='>' && LA10_0<='@')||LA10_0=='\\'||LA10_0=='`'||LA10_0=='|'||(LA10_0>='~' && LA10_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_13 = input.LA(1);

                        s = -1;
                        if ( ((LA10_13>='\u0000' && LA10_13<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}