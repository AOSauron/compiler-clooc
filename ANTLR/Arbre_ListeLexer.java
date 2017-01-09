// $ANTLR 3.3 Nov 30, 2010 12:50:56 Arbre_Liste.g 2017-01-09 11:09:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Arbre_ListeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int INT=4;
    public static final int WS=5;

    // delegates
    // delegators

    public Arbre_ListeLexer() {;} 
    public Arbre_ListeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Arbre_ListeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Arbre_Liste.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Arbre_Liste.g:3:6: ( '(' )
            // Arbre_Liste.g:3:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Arbre_Liste.g:4:6: ( '.' )
            // Arbre_Liste.g:4:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Arbre_Liste.g:5:6: ( ')' )
            // Arbre_Liste.g:5:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Arbre_Liste.g:6:6: ( 'nil' )
            // Arbre_Liste.g:6:8: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Arbre_Liste.g:27:5: ( ( '0' .. '9' )+ )
            // Arbre_Liste.g:27:9: ( '0' .. '9' )+
            {
            // Arbre_Liste.g:27:9: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Arbre_Liste.g:27:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Arbre_Liste.g:28:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // Arbre_Liste.g:28:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // Arbre_Liste.g:28:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Arbre_Liste.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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

    public void mTokens() throws RecognitionException {
        // Arbre_Liste.g:1:8: ( T__6 | T__7 | T__8 | T__9 | INT | WS )
        int alt3=6;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt3=1;
            }
            break;
        case '.':
            {
            alt3=2;
            }
            break;
        case ')':
            {
            alt3=3;
            }
            break;
        case 'n':
            {
            alt3=4;
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
        case '8':
        case '9':
            {
            alt3=5;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // Arbre_Liste.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // Arbre_Liste.g:1:15: T__7
                {
                mT__7(); 

                }
                break;
            case 3 :
                // Arbre_Liste.g:1:20: T__8
                {
                mT__8(); 

                }
                break;
            case 4 :
                // Arbre_Liste.g:1:25: T__9
                {
                mT__9(); 

                }
                break;
            case 5 :
                // Arbre_Liste.g:1:30: INT
                {
                mINT(); 

                }
                break;
            case 6 :
                // Arbre_Liste.g:1:34: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}