// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-01-21 16:31:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LoocLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDFC=4;
    public static final int IDF=5;
    public static final int CSTE_CHAINE=6;
    public static final int CSTE_ENT=7;
    public static final int ESC_SEQ=8;
    public static final int WS=9;
    public static final int COMMENT=10;
    public static final int UNICODE_ESC=11;
    public static final int OCTAL_ESC=12;
    public static final int HEX_DIGIT=13;

    // delegates
    // delegators

    public LoocLexer() {;} 
    public LoocLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LoocLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Looc.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:3:7: ( 'class' )
            // Looc.g:3:9: 'class'
            {
            match("class"); 


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
            // Looc.g:4:7: ( 'inherit' )
            // Looc.g:4:9: 'inherit'
            {
            match("inherit"); 


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
            // Looc.g:5:7: ( '=' )
            // Looc.g:5:9: '='
            {
            match('='); 

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
            // Looc.g:6:7: ( '(' )
            // Looc.g:6:9: '('
            {
            match('('); 

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
            // Looc.g:7:7: ( ')' )
            // Looc.g:7:9: ')'
            {
            match(')'); 

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
            // Looc.g:8:7: ( 'var' )
            // Looc.g:8:9: 'var'
            {
            match("var"); 


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
            // Looc.g:9:7: ( ':' )
            // Looc.g:9:9: ':'
            {
            match(':'); 

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
            // Looc.g:10:7: ( ';' )
            // Looc.g:10:9: ';'
            {
            match(';'); 

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
            // Looc.g:11:7: ( 'int' )
            // Looc.g:11:9: 'int'
            {
            match("int"); 


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
            // Looc.g:12:7: ( 'string' )
            // Looc.g:12:9: 'string'
            {
            match("string"); 


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
            // Looc.g:13:7: ( 'method' )
            // Looc.g:13:9: 'method'
            {
            match("method"); 


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
            // Looc.g:14:7: ( '{' )
            // Looc.g:14:9: '{'
            {
            match('{'); 

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
            // Looc.g:15:7: ( '}' )
            // Looc.g:15:9: '}'
            {
            match('}'); 

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
            // Looc.g:16:7: ( ',' )
            // Looc.g:16:9: ','
            {
            match(','); 

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
            // Looc.g:17:7: ( ':=' )
            // Looc.g:17:9: ':='
            {
            match(":="); 


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
            // Looc.g:18:7: ( 'if' )
            // Looc.g:18:9: 'if'
            {
            match("if"); 


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
            // Looc.g:19:7: ( 'then' )
            // Looc.g:19:9: 'then'
            {
            match("then"); 


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
            // Looc.g:20:7: ( 'else' )
            // Looc.g:20:9: 'else'
            {
            match("else"); 


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
            // Looc.g:21:7: ( 'fi' )
            // Looc.g:21:9: 'fi'
            {
            match("fi"); 


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
            // Looc.g:22:7: ( 'for' )
            // Looc.g:22:9: 'for'
            {
            match("for"); 


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
            // Looc.g:23:7: ( 'in' )
            // Looc.g:23:9: 'in'
            {
            match("in"); 


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
            // Looc.g:24:7: ( '..' )
            // Looc.g:24:9: '..'
            {
            match(".."); 


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
            // Looc.g:25:7: ( 'do' )
            // Looc.g:25:9: 'do'
            {
            match("do"); 


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
            // Looc.g:26:7: ( 'end' )
            // Looc.g:26:9: 'end'
            {
            match("end"); 


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
            // Looc.g:27:7: ( '.' )
            // Looc.g:27:9: '.'
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
            // Looc.g:28:7: ( 'nil' )
            // Looc.g:28:9: 'nil'
            {
            match("nil"); 


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
            // Looc.g:29:7: ( 'write' )
            // Looc.g:29:9: 'write'
            {
            match("write"); 


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
            // Looc.g:30:7: ( 'read' )
            // Looc.g:30:9: 'read'
            {
            match("read"); 


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
            // Looc.g:31:7: ( 'return' )
            // Looc.g:31:9: 'return'
            {
            match("return"); 


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
            // Looc.g:32:7: ( 'this' )
            // Looc.g:32:9: 'this'
            {
            match("this"); 


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
            // Looc.g:33:7: ( 'super' )
            // Looc.g:33:9: 'super'
            {
            match("super"); 


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
            // Looc.g:34:7: ( 'new' )
            // Looc.g:34:9: 'new'
            {
            match("new"); 


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
            // Looc.g:35:7: ( '-' )
            // Looc.g:35:9: '-'
            {
            match('-'); 

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
            // Looc.g:36:7: ( '+' )
            // Looc.g:36:9: '+'
            {
            match('+'); 

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
            // Looc.g:37:7: ( '*' )
            // Looc.g:37:9: '*'
            {
            match('*'); 

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
            // Looc.g:38:7: ( '<' )
            // Looc.g:38:9: '<'
            {
            match('<'); 

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
            // Looc.g:39:7: ( '<=' )
            // Looc.g:39:9: '<='
            {
            match("<="); 


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
            // Looc.g:40:7: ( '>' )
            // Looc.g:40:9: '>'
            {
            match('>'); 

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
            // Looc.g:41:7: ( '>=' )
            // Looc.g:41:9: '>='
            {
            match(">="); 


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
            // Looc.g:42:7: ( '==' )
            // Looc.g:42:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:43:7: ( '!=' )
            // Looc.g:43:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "IDFC"
    public final void mIDFC() throws RecognitionException {
        try {
            int _type = IDFC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:80:5: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Looc.g:80:9: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // Looc.g:80:9: ( 'A' .. 'Z' )
            // Looc.g:80:10: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            // Looc.g:80:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:
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
    // $ANTLR end "IDFC"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:82:4: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Looc.g:82:8: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // Looc.g:82:8: ( 'a' .. 'z' )
            // Looc.g:82:9: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // Looc.g:82:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF"

    // $ANTLR start "CSTE_ENT"
    public final void mCSTE_ENT() throws RecognitionException {
        try {
            int _type = CSTE_ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:110:9: ( ( '0' .. '9' )+ )
            // Looc.g:110:13: ( '0' .. '9' )+
            {
            // Looc.g:110:13: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:110:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_ENT"

    // $ANTLR start "CSTE_CHAINE"
    public final void mCSTE_CHAINE() throws RecognitionException {
        try {
            int _type = CSTE_CHAINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:112:12: ( '\"' ( ESC_SEQ | ~ ( '\\r' | '\\n' | '\"' | '\\\\' ) )+ '\"' )
            // Looc.g:112:16: '\"' ( ESC_SEQ | ~ ( '\\r' | '\\n' | '\"' | '\\\\' ) )+ '\"'
            {
            match('\"'); 
            // Looc.g:112:20: ( ESC_SEQ | ~ ( '\\r' | '\\n' | '\"' | '\\\\' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // Looc.g:112:21: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // Looc.g:112:31: ~ ( '\\r' | '\\n' | '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_CHAINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:114:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // Looc.g:114:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // Looc.g:114:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Looc.g:116:8: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Looc.g:116:12: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // Looc.g:116:17: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:116:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // Looc.g:118:17: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt7=1;
                    }
                    break;
                case 'u':
                    {
                    alt7=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Looc.g:118:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // Looc.g:119:21: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // Looc.g:120:21: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // Looc.g:123:19: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>='0' && LA8_1<='3')) ) {
                    int LA8_2 = input.LA(3);

                    if ( ((LA8_2>='0' && LA8_2<='7')) ) {
                        int LA8_4 = input.LA(4);

                        if ( ((LA8_4>='0' && LA8_4<='7')) ) {
                            alt8=1;
                        }
                        else {
                            alt8=2;}
                    }
                    else {
                        alt8=3;}
                }
                else if ( ((LA8_1>='4' && LA8_1<='7')) ) {
                    int LA8_3 = input.LA(3);

                    if ( ((LA8_3>='0' && LA8_3<='7')) ) {
                        alt8=2;
                    }
                    else {
                        alt8=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Looc.g:123:23: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Looc.g:123:28: ( '0' .. '3' )
                    // Looc.g:123:29: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // Looc.g:123:38: ( '0' .. '7' )
                    // Looc.g:123:39: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Looc.g:123:48: ( '0' .. '7' )
                    // Looc.g:123:49: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // Looc.g:124:23: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Looc.g:124:28: ( '0' .. '7' )
                    // Looc.g:124:29: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Looc.g:124:38: ( '0' .. '7' )
                    // Looc.g:124:39: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // Looc.g:125:23: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Looc.g:125:28: ( '0' .. '7' )
                    // Looc.g:125:29: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // Looc.g:128:21: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // Looc.g:128:25: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // Looc.g:130:19: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Looc.g:130:23: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    public void mTokens() throws RecognitionException {
        // Looc.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | IDFC | IDF | CSTE_ENT | CSTE_CHAINE | WS | COMMENT )
        int alt9=47;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // Looc.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // Looc.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // Looc.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // Looc.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // Looc.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // Looc.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // Looc.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // Looc.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // Looc.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // Looc.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // Looc.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // Looc.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // Looc.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // Looc.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // Looc.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // Looc.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // Looc.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // Looc.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // Looc.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // Looc.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // Looc.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // Looc.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // Looc.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // Looc.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // Looc.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // Looc.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // Looc.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // Looc.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // Looc.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // Looc.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // Looc.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // Looc.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // Looc.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // Looc.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // Looc.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // Looc.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // Looc.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // Looc.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // Looc.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // Looc.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // Looc.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // Looc.g:1:256: IDFC
                {
                mIDFC(); 

                }
                break;
            case 43 :
                // Looc.g:1:261: IDF
                {
                mIDF(); 

                }
                break;
            case 44 :
                // Looc.g:1:265: CSTE_ENT
                {
                mCSTE_ENT(); 

                }
                break;
            case 45 :
                // Looc.g:1:274: CSTE_CHAINE
                {
                mCSTE_CHAINE(); 

                }
                break;
            case 46 :
                // Looc.g:1:286: WS
                {
                mWS(); 

                }
                break;
            case 47 :
                // Looc.g:1:289: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\2\35\1\46\2\uffff\1\35\1\51\1\uffff\2\35\3\uffff\3\35\1"+
        "\63\4\35\3\uffff\1\72\1\74\7\uffff\1\35\1\100\1\101\2\uffff\1\35"+
        "\2\uffff\6\35\1\112\1\35\2\uffff\1\114\4\35\4\uffff\2\35\1\124\2"+
        "\uffff\1\125\6\35\1\134\1\uffff\1\135\1\uffff\1\136\1\137\5\35\2"+
        "\uffff\3\35\1\150\1\151\1\152\4\uffff\1\35\1\154\1\35\1\156\2\35"+
        "\1\161\1\35\3\uffff\1\163\1\uffff\1\35\1\uffff\1\35\1\166\1\uffff"+
        "\1\167\1\uffff\1\170\1\171\4\uffff";
    static final String DFA9_eofS =
        "\172\uffff";
    static final String DFA9_minS =
        "\1\11\1\154\1\146\1\75\2\uffff\1\141\1\75\1\uffff\1\164\1\145\3"+
        "\uffff\1\150\1\154\1\151\1\56\1\157\1\145\1\162\1\145\3\uffff\2"+
        "\75\7\uffff\1\141\2\60\2\uffff\1\162\2\uffff\1\162\1\160\1\164\1"+
        "\145\1\163\1\144\1\60\1\162\2\uffff\1\60\1\154\1\167\1\151\1\141"+
        "\4\uffff\1\163\1\145\1\60\2\uffff\1\60\1\151\1\145\1\150\1\156\1"+
        "\163\1\145\1\60\1\uffff\1\60\1\uffff\2\60\1\164\1\144\1\165\1\163"+
        "\1\162\2\uffff\1\156\1\162\1\157\3\60\4\uffff\1\145\1\60\1\162\1"+
        "\60\1\151\1\147\1\60\1\144\3\uffff\1\60\1\uffff\1\156\1\uffff\1"+
        "\164\1\60\1\uffff\1\60\1\uffff\2\60\4\uffff";
    static final String DFA9_maxS =
        "\1\175\1\154\1\156\1\75\2\uffff\1\141\1\75\1\uffff\1\165\1\145\3"+
        "\uffff\1\150\1\156\1\157\1\56\1\157\1\151\1\162\1\145\3\uffff\2"+
        "\75\7\uffff\1\141\2\172\2\uffff\1\162\2\uffff\1\162\1\160\1\164"+
        "\1\151\1\163\1\144\1\172\1\162\2\uffff\1\172\1\154\1\167\1\151\1"+
        "\164\4\uffff\1\163\1\145\1\172\2\uffff\1\172\1\151\1\145\1\150\1"+
        "\156\1\163\1\145\1\172\1\uffff\1\172\1\uffff\2\172\1\164\1\144\1"+
        "\165\1\163\1\162\2\uffff\1\156\1\162\1\157\3\172\4\uffff\1\145\1"+
        "\172\1\162\1\172\1\151\1\147\1\172\1\144\3\uffff\1\172\1\uffff\1"+
        "\156\1\uffff\1\164\1\172\1\uffff\1\172\1\uffff\2\172\4\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\4\1\5\2\uffff\1\10\2\uffff\1\14\1\15\1\16\10\uffff\1"+
        "\41\1\42\1\43\2\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\3\uffff"+
        "\1\50\1\3\1\uffff\1\17\1\7\10\uffff\1\26\1\31\5\uffff\1\45\1\44"+
        "\1\47\1\46\3\uffff\1\25\1\20\10\uffff\1\23\1\uffff\1\27\7\uffff"+
        "\1\11\1\6\6\uffff\1\30\1\24\1\32\1\40\10\uffff\1\21\1\36\1\22\1"+
        "\uffff\1\34\1\uffff\1\1\2\uffff\1\37\1\uffff\1\33\2\uffff\1\12\1"+
        "\13\1\35\1\2";
    static final String DFA9_specialS =
        "\172\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\33\1\37\5\uffff\1\4\1\5\1"+
            "\30\1\27\1\15\1\26\1\21\1\41\12\36\1\7\1\10\1\31\1\3\1\32\2"+
            "\uffff\32\34\6\uffff\2\35\1\1\1\22\1\17\1\20\2\35\1\2\3\35\1"+
            "\12\1\23\3\35\1\25\1\11\1\16\1\35\1\6\1\24\3\35\1\13\1\uffff"+
            "\1\14",
            "\1\42",
            "\1\44\7\uffff\1\43",
            "\1\45",
            "",
            "",
            "\1\47",
            "\1\50",
            "",
            "\1\52\1\53",
            "\1\54",
            "",
            "",
            "",
            "\1\55",
            "\1\56\1\uffff\1\57",
            "\1\60\5\uffff\1\61",
            "\1\62",
            "\1\64",
            "\1\66\3\uffff\1\65",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "\1\71",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35\1\76\13\35\1"+
            "\77\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\3\uffff\1\107",
            "\1\110",
            "\1\111",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\113",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120\22\uffff\1\121",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "\1\153",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\155",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\157",
            "\1\160",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\162",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\164",
            "",
            "\1\165",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | IDFC | IDF | CSTE_ENT | CSTE_CHAINE | WS | COMMENT );";
        }
    }
 

}