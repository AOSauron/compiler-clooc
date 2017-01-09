// $ANTLR 3.3 Nov 30, 2010 12:50:56 Arbre_Liste.g 2017-01-09 11:09:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Arbre_ListeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "'.'", "')'", "'nil'"
    };
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int INT=4;
    public static final int WS=5;

    // delegates
    // delegators


        public Arbre_ListeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Arbre_ListeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Arbre_ListeParser.tokenNames; }
    public String getGrammarFileName() { return "Arbre_Liste.g"; }



    // $ANTLR start "prog"
    // Arbre_Liste.g:7:1: prog : a ;
    public final void prog() throws RecognitionException {
        try {
            // Arbre_Liste.g:7:5: ( a )
            // Arbre_Liste.g:7:9: a
            {
            pushFollow(FOLLOW_a_in_prog21);
            a();

            state._fsp--;


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
    // $ANTLR end "prog"


    // $ANTLR start "a"
    // Arbre_Liste.g:9:1: a : ( v | '(' a x );
    public final void a() throws RecognitionException {
        try {
            // Arbre_Liste.g:9:3: ( v | '(' a x )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==INT||LA1_0==9) ) {
                alt1=1;
            }
            else if ( (LA1_0==6) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // Arbre_Liste.g:9:5: v
                    {
                    pushFollow(FOLLOW_v_in_a37);
                    v();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Arbre_Liste.g:10:4: '(' a x
                    {
                    match(input,6,FOLLOW_6_in_a43); 
                    pushFollow(FOLLOW_a_in_a45);
                    a();

                    state._fsp--;

                    pushFollow(FOLLOW_x_in_a47);
                    x();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "a"


    // $ANTLR start "x"
    // Arbre_Liste.g:14:1: x : ( '.' a ')' | s ')' );
    public final void x() throws RecognitionException {
        try {
            // Arbre_Liste.g:14:3: ( '.' a ')' | s ')' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==7) ) {
                alt2=1;
            }
            else if ( (LA2_0==8) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Arbre_Liste.g:14:5: '.' a ')'
                    {
                    match(input,7,FOLLOW_7_in_x60); 
                    pushFollow(FOLLOW_a_in_x62);
                    a();

                    state._fsp--;

                    match(input,8,FOLLOW_8_in_x64); 

                    }
                    break;
                case 2 :
                    // Arbre_Liste.g:15:4: s ')'
                    {
                    pushFollow(FOLLOW_s_in_x69);
                    s();

                    state._fsp--;

                    match(input,8,FOLLOW_8_in_x71); 

                    }
                    break;

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
    // $ANTLR end "x"


    // $ANTLR start "s"
    // Arbre_Liste.g:19:1: s : ( '.' a s | );
    public final void s() throws RecognitionException {
        try {
            // Arbre_Liste.g:19:3: ( '.' a s | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==7) ) {
                alt3=1;
            }
            else if ( (LA3_0==8) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Arbre_Liste.g:19:5: '.' a s
                    {
                    match(input,7,FOLLOW_7_in_s83); 
                    pushFollow(FOLLOW_a_in_s85);
                    a();

                    state._fsp--;

                    pushFollow(FOLLOW_s_in_s87);
                    s();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Arbre_Liste.g:21:3: 
                    {
                    }
                    break;

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
    // $ANTLR end "s"


    // $ANTLR start "v"
    // Arbre_Liste.g:23:1: v : ( INT | 'nil' );
    public final void v() throws RecognitionException {
        try {
            // Arbre_Liste.g:23:3: ( INT | 'nil' )
            // Arbre_Liste.g:
            {
            if ( input.LA(1)==INT||input.LA(1)==9 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "v"

    // Delegated rules


 

    public static final BitSet FOLLOW_a_in_prog21 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_v_in_a37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_a43 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_a_in_a45 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_x_in_a47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_x60 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_a_in_x62 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_x64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_s_in_x69 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_x71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_s83 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_a_in_s85 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_s_in_s87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_v0 = new BitSet(new long[]{0x0000000000000002L});

}