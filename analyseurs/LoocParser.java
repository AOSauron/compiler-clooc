// $ANTLR 3.3 Nov 30, 2010 12:50:56 analyseurs/Looc.g 2017-01-13 03:34:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDFC", "IDF", "CSTE_CHAINE", "CSTE_ENT", "ESC_SEQ", "WS", "COMMENT", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'do'", "'end'", "'.'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'-'", "'+'", "'*'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
    };
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


        public LoocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LoocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LoocParser.tokenNames; }
    public String getGrammarFileName() { return "analyseurs/Looc.g"; }



    // $ANTLR start "program"
    // analyseurs/Looc.g:12:1: program : ( class_decl )* ( var_decl )* ( instruction )+ ;
    public final void program() throws RecognitionException {
        try {
            // analyseurs/Looc.g:12:8: ( ( class_decl )* ( var_decl )* ( instruction )+ )
            // analyseurs/Looc.g:12:12: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // analyseurs/Looc.g:12:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // analyseurs/Looc.g:12:13: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program39);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // analyseurs/Looc.g:12:26: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // analyseurs/Looc.g:12:27: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_program44);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // analyseurs/Looc.g:12:38: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==25||LA3_0==29||LA3_0==33||LA3_0==35||(LA3_0>=39 && LA3_0<=41)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // analyseurs/Looc.g:12:39: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_program49);
            	    instruction();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "class_decl"
    // analyseurs/Looc.g:14:1: class_decl : 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' ;
    public final void class_decl() throws RecognitionException {
        try {
            // analyseurs/Looc.g:14:11: ( 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' )
            // analyseurs/Looc.g:14:15: 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')'
            {
            match(input,14,FOLLOW_14_in_class_decl61); 
            match(input,IDFC,FOLLOW_IDFC_in_class_decl63); 
            // analyseurs/Looc.g:14:28: ( 'inherit' IDFC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // analyseurs/Looc.g:14:29: 'inherit' IDFC
                    {
                    match(input,15,FOLLOW_15_in_class_decl66); 
                    match(input,IDFC,FOLLOW_IDFC_in_class_decl68); 

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_class_decl72); 
            match(input,17,FOLLOW_17_in_class_decl74); 
            pushFollow(FOLLOW_class_item_decl_in_class_decl76);
            class_item_decl();

            state._fsp--;

            match(input,18,FOLLOW_18_in_class_decl78); 

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
    // $ANTLR end "class_decl"


    // $ANTLR start "class_item_decl"
    // analyseurs/Looc.g:16:1: class_item_decl : ( var_decl )* ( method_decl )* ;
    public final void class_item_decl() throws RecognitionException {
        try {
            // analyseurs/Looc.g:16:16: ( ( var_decl )* ( method_decl )* )
            // analyseurs/Looc.g:16:20: ( var_decl )* ( method_decl )*
            {
            // analyseurs/Looc.g:16:20: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // analyseurs/Looc.g:16:21: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl89);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // analyseurs/Looc.g:16:32: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // analyseurs/Looc.g:16:33: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl94);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "class_item_decl"


    // $ANTLR start "var_decl"
    // analyseurs/Looc.g:18:1: var_decl : 'var' IDF ':' type ';' ;
    public final void var_decl() throws RecognitionException {
        try {
            // analyseurs/Looc.g:18:9: ( 'var' IDF ':' type ';' )
            // analyseurs/Looc.g:18:13: 'var' IDF ':' type ';'
            {
            match(input,19,FOLLOW_19_in_var_decl106); 
            match(input,IDF,FOLLOW_IDF_in_var_decl108); 
            match(input,20,FOLLOW_20_in_var_decl110); 
            pushFollow(FOLLOW_type_in_var_decl112);
            type();

            state._fsp--;

            match(input,21,FOLLOW_21_in_var_decl114); 

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
    // $ANTLR end "var_decl"


    // $ANTLR start "type"
    // analyseurs/Looc.g:20:1: type : ( IDFC | 'int' | 'string' );
    public final void type() throws RecognitionException {
        try {
            // analyseurs/Looc.g:20:5: ( IDFC | 'int' | 'string' )
            // analyseurs/Looc.g:
            {
            if ( input.LA(1)==IDFC||(input.LA(1)>=22 && input.LA(1)<=23) ) {
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
    // $ANTLR end "type"


    // $ANTLR start "method_decl"
    // analyseurs/Looc.g:25:1: method_decl : 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' ;
    public final void method_decl() throws RecognitionException {
        try {
            // analyseurs/Looc.g:25:12: ( 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' )
            // analyseurs/Looc.g:25:16: 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}'
            {
            match(input,24,FOLLOW_24_in_method_decl158); 
            match(input,IDF,FOLLOW_IDF_in_method_decl160); 
            match(input,17,FOLLOW_17_in_method_decl162); 
            // analyseurs/Looc.g:25:33: ( method_args )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDF) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // analyseurs/Looc.g:25:34: method_args
            	    {
            	    pushFollow(FOLLOW_method_args_in_method_decl165);
            	    method_args();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_method_decl169); 
            // analyseurs/Looc.g:25:52: ( ':' type )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // analyseurs/Looc.g:25:53: ':' type
                    {
                    match(input,20,FOLLOW_20_in_method_decl172); 
                    pushFollow(FOLLOW_type_in_method_decl174);
                    type();

                    state._fsp--;


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_method_decl178); 
            // analyseurs/Looc.g:25:68: ( var_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // analyseurs/Looc.g:25:69: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_method_decl181);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // analyseurs/Looc.g:25:80: ( instruction )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDF||LA10_0==25||LA10_0==29||LA10_0==33||LA10_0==35||(LA10_0>=39 && LA10_0<=41)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // analyseurs/Looc.g:25:81: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_method_decl186);
            	    instruction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match(input,26,FOLLOW_26_in_method_decl190); 

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
    // $ANTLR end "method_decl"


    // $ANTLR start "method_args"
    // analyseurs/Looc.g:27:1: method_args : IDF ':' type ( ',' IDF ':' type )* ;
    public final void method_args() throws RecognitionException {
        try {
            // analyseurs/Looc.g:27:12: ( IDF ':' type ( ',' IDF ':' type )* )
            // analyseurs/Looc.g:27:16: IDF ':' type ( ',' IDF ':' type )*
            {
            match(input,IDF,FOLLOW_IDF_in_method_args200); 
            match(input,20,FOLLOW_20_in_method_args202); 
            pushFollow(FOLLOW_type_in_method_args204);
            type();

            state._fsp--;

            // analyseurs/Looc.g:27:29: ( ',' IDF ':' type )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // analyseurs/Looc.g:27:30: ',' IDF ':' type
            	    {
            	    match(input,27,FOLLOW_27_in_method_args207); 
            	    match(input,IDF,FOLLOW_IDF_in_method_args209); 
            	    match(input,20,FOLLOW_20_in_method_args211); 
            	    pushFollow(FOLLOW_type_in_method_args213);
            	    type();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "method_args"


    // $ANTLR start "instruction"
    // analyseurs/Looc.g:29:1: instruction : ( IDF ':=' affectation ';' | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression '.' IDF '(' expression ( ',' expression )* ')' ';' | print | read | return );
    public final void instruction() throws RecognitionException {
        try {
            // analyseurs/Looc.g:29:12: ( IDF ':=' affectation ';' | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression '.' IDF '(' expression ( ',' expression )* ')' ';' | print | read | return )
            int alt17=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 33:
                {
                alt17=3;
                }
                break;
            case 25:
                {
                alt17=4;
                }
                break;
            case 35:
                {
                alt17=5;
                }
                break;
            case 39:
                {
                alt17=6;
                }
                break;
            case 40:
                {
                alt17=7;
                }
                break;
            case 41:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // analyseurs/Looc.g:29:16: IDF ':=' affectation ';'
                    {
                    match(input,IDF,FOLLOW_IDF_in_instruction225); 
                    match(input,28,FOLLOW_28_in_instruction227); 
                    pushFollow(FOLLOW_affectation_in_instruction229);
                    affectation();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_instruction231); 

                    }
                    break;
                case 2 :
                    // analyseurs/Looc.g:30:16: 'if' expression 'then' instruction ( 'else' instruction )? 'fi'
                    {
                    match(input,29,FOLLOW_29_in_instruction248); 
                    pushFollow(FOLLOW_expression_in_instruction250);
                    expression();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_instruction252); 
                    pushFollow(FOLLOW_instruction_in_instruction254);
                    instruction();

                    state._fsp--;

                    // analyseurs/Looc.g:30:51: ( 'else' instruction )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // analyseurs/Looc.g:30:52: 'else' instruction
                            {
                            match(input,31,FOLLOW_31_in_instruction257); 
                            pushFollow(FOLLOW_instruction_in_instruction259);
                            instruction();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_instruction263); 

                    }
                    break;
                case 3 :
                    // analyseurs/Looc.g:31:16: 'for' IDF 'in' expression 'do' ( instruction )+ 'end'
                    {
                    match(input,33,FOLLOW_33_in_instruction280); 
                    match(input,IDF,FOLLOW_IDF_in_instruction282); 
                    match(input,34,FOLLOW_34_in_instruction284); 
                    pushFollow(FOLLOW_expression_in_instruction286);
                    expression();

                    state._fsp--;

                    match(input,35,FOLLOW_35_in_instruction288); 
                    // analyseurs/Looc.g:31:47: ( instruction )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IDF||LA13_0==25||LA13_0==29||LA13_0==33||LA13_0==35||(LA13_0>=39 && LA13_0<=41)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // analyseurs/Looc.g:31:48: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction291);
                    	    instruction();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    match(input,36,FOLLOW_36_in_instruction295); 

                    }
                    break;
                case 4 :
                    // analyseurs/Looc.g:32:16: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    match(input,25,FOLLOW_25_in_instruction316); 
                    // analyseurs/Looc.g:32:20: ( var_decl )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // analyseurs/Looc.g:32:21: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction319);
                    	    var_decl();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // analyseurs/Looc.g:32:32: ( instruction )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==25||LA15_0==29||LA15_0==33||LA15_0==35||(LA15_0>=39 && LA15_0<=41)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // analyseurs/Looc.g:32:33: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction324);
                    	    instruction();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    match(input,26,FOLLOW_26_in_instruction328); 

                    }
                    break;
                case 5 :
                    // analyseurs/Looc.g:33:16: 'do' expression '.' IDF '(' expression ( ',' expression )* ')' ';'
                    {
                    match(input,35,FOLLOW_35_in_instruction345); 
                    pushFollow(FOLLOW_expression_in_instruction347);
                    expression();

                    state._fsp--;

                    match(input,37,FOLLOW_37_in_instruction349); 
                    match(input,IDF,FOLLOW_IDF_in_instruction351); 
                    match(input,17,FOLLOW_17_in_instruction353); 
                    pushFollow(FOLLOW_expression_in_instruction355);
                    expression();

                    state._fsp--;

                    // analyseurs/Looc.g:33:55: ( ',' expression )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // analyseurs/Looc.g:33:56: ',' expression
                    	    {
                    	    match(input,27,FOLLOW_27_in_instruction358); 
                    	    pushFollow(FOLLOW_expression_in_instruction360);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_instruction364); 
                    match(input,21,FOLLOW_21_in_instruction366); 

                    }
                    break;
                case 6 :
                    // analyseurs/Looc.g:34:16: print
                    {
                    pushFollow(FOLLOW_print_in_instruction383);
                    print();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // analyseurs/Looc.g:35:16: read
                    {
                    pushFollow(FOLLOW_read_in_instruction400);
                    read();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // analyseurs/Looc.g:36:16: return
                    {
                    pushFollow(FOLLOW_return_in_instruction417);
                    return();

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
    // $ANTLR end "instruction"


    // $ANTLR start "affectation"
    // analyseurs/Looc.g:39:1: affectation : ( expression | 'nil' );
    public final void affectation() throws RecognitionException {
        try {
            // analyseurs/Looc.g:39:12: ( expression | 'nil' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDF||LA18_0==CSTE_ENT||LA18_0==17||(LA18_0>=42 && LA18_0<=45)) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // analyseurs/Looc.g:39:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_affectation438);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // analyseurs/Looc.g:40:16: 'nil'
                    {
                    match(input,38,FOLLOW_38_in_affectation455); 

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
    // $ANTLR end "affectation"


    // $ANTLR start "print"
    // analyseurs/Looc.g:43:1: print : 'write' strprint ';' ;
    public final void print() throws RecognitionException {
        try {
            // analyseurs/Looc.g:43:6: ( 'write' strprint ';' )
            // analyseurs/Looc.g:43:10: 'write' strprint ';'
            {
            match(input,39,FOLLOW_39_in_print476); 
            pushFollow(FOLLOW_strprint_in_print478);
            strprint();

            state._fsp--;

            match(input,21,FOLLOW_21_in_print480); 

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
    // $ANTLR end "print"


    // $ANTLR start "strprint"
    // analyseurs/Looc.g:45:1: strprint : ( expression | CSTE_CHAINE );
    public final void strprint() throws RecognitionException {
        try {
            // analyseurs/Looc.g:45:9: ( expression | CSTE_CHAINE )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDF||LA19_0==CSTE_ENT||LA19_0==17||(LA19_0>=42 && LA19_0<=45)) ) {
                alt19=1;
            }
            else if ( (LA19_0==CSTE_CHAINE) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // analyseurs/Looc.g:45:13: expression
                    {
                    pushFollow(FOLLOW_expression_in_strprint490);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // analyseurs/Looc.g:46:13: CSTE_CHAINE
                    {
                    match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_strprint504); 

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
    // $ANTLR end "strprint"


    // $ANTLR start "read"
    // analyseurs/Looc.g:49:1: read : 'read' IDF ';' ;
    public final void read() throws RecognitionException {
        try {
            // analyseurs/Looc.g:49:5: ( 'read' IDF ';' )
            // analyseurs/Looc.g:49:9: 'read' IDF ';'
            {
            match(input,40,FOLLOW_40_in_read522); 
            match(input,IDF,FOLLOW_IDF_in_read524); 
            match(input,21,FOLLOW_21_in_read526); 

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
    // $ANTLR end "read"


    // $ANTLR start "return"
    // analyseurs/Looc.g:51:1: return : 'return' '(' expression ')' ';' ;
    public final void return() throws RecognitionException {
        try {
            // analyseurs/Looc.g:51:7: ( 'return' '(' expression ')' ';' )
            // analyseurs/Looc.g:51:11: 'return' '(' expression ')' ';'
            {
            match(input,41,FOLLOW_41_in_return536); 
            match(input,17,FOLLOW_17_in_return538); 
            pushFollow(FOLLOW_expression_in_return540);
            expression();

            state._fsp--;

            match(input,18,FOLLOW_18_in_return542); 
            match(input,21,FOLLOW_21_in_return544); 

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
    // $ANTLR end "return"


    // $ANTLR start "expression"
    // analyseurs/Looc.g:55:1: expression : ( IDF expression_bis | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis | 'new' IDFC expression_bis | '(' expression ')' expression_bis | '-' expression expression_bis );
    public final void expression() throws RecognitionException {
        try {
            // analyseurs/Looc.g:55:11: ( IDF expression_bis | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis | 'new' IDFC expression_bis | '(' expression ')' expression_bis | '-' expression expression_bis )
            int alt20=7;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt20=1;
                }
                break;
            case 42:
                {
                alt20=2;
                }
                break;
            case 43:
                {
                alt20=3;
                }
                break;
            case CSTE_ENT:
                {
                alt20=4;
                }
                break;
            case 44:
                {
                alt20=5;
                }
                break;
            case 17:
                {
                alt20=6;
                }
                break;
            case 45:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // analyseurs/Looc.g:55:15: IDF expression_bis
                    {
                    match(input,IDF,FOLLOW_IDF_in_expression557); 
                    pushFollow(FOLLOW_expression_bis_in_expression559);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // analyseurs/Looc.g:56:15: 'this' expression_bis
                    {
                    match(input,42,FOLLOW_42_in_expression575); 
                    pushFollow(FOLLOW_expression_bis_in_expression577);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // analyseurs/Looc.g:57:15: 'super' expression_bis
                    {
                    match(input,43,FOLLOW_43_in_expression593); 
                    pushFollow(FOLLOW_expression_bis_in_expression595);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // analyseurs/Looc.g:58:15: CSTE_ENT expression_bis
                    {
                    match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression611); 
                    pushFollow(FOLLOW_expression_bis_in_expression613);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // analyseurs/Looc.g:59:15: 'new' IDFC expression_bis
                    {
                    match(input,44,FOLLOW_44_in_expression629); 
                    match(input,IDFC,FOLLOW_IDFC_in_expression631); 
                    pushFollow(FOLLOW_expression_bis_in_expression633);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // analyseurs/Looc.g:60:15: '(' expression ')' expression_bis
                    {
                    match(input,17,FOLLOW_17_in_expression649); 
                    pushFollow(FOLLOW_expression_in_expression651);
                    expression();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_expression653); 
                    pushFollow(FOLLOW_expression_bis_in_expression655);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // analyseurs/Looc.g:61:15: '-' expression expression_bis
                    {
                    match(input,45,FOLLOW_45_in_expression671); 
                    pushFollow(FOLLOW_expression_in_expression673);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_bis_in_expression675);
                    expression_bis();

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
    // $ANTLR end "expression"


    // $ANTLR start "expression_bis"
    // analyseurs/Looc.g:64:1: expression_bis : ( '.' IDF '(' expression ( ',' expression )* ')' expression_bis | oper expression expression_bis | );
    public final void expression_bis() throws RecognitionException {
        try {
            // analyseurs/Looc.g:64:15: ( '.' IDF '(' expression ( ',' expression )* ')' expression_bis | oper expression expression_bis | )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt22=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt22=2;
                }
                break;
            case 18:
            case 21:
            case 27:
            case 30:
            case 35:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // analyseurs/Looc.g:64:19: '.' IDF '(' expression ( ',' expression )* ')' expression_bis
                    {
                    match(input,37,FOLLOW_37_in_expression_bis695); 
                    match(input,IDF,FOLLOW_IDF_in_expression_bis697); 
                    match(input,17,FOLLOW_17_in_expression_bis699); 
                    pushFollow(FOLLOW_expression_in_expression_bis701);
                    expression();

                    state._fsp--;

                    // analyseurs/Looc.g:64:42: ( ',' expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==27) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // analyseurs/Looc.g:64:43: ',' expression
                    	    {
                    	    match(input,27,FOLLOW_27_in_expression_bis704); 
                    	    pushFollow(FOLLOW_expression_in_expression_bis706);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_expression_bis710); 
                    pushFollow(FOLLOW_expression_bis_in_expression_bis712);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // analyseurs/Looc.g:65:20: oper expression expression_bis
                    {
                    pushFollow(FOLLOW_oper_in_expression_bis733);
                    oper();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression_bis735);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_bis_in_expression_bis737);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // analyseurs/Looc.g:67:15: 
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
    // $ANTLR end "expression_bis"


    // $ANTLR start "oper"
    // analyseurs/Looc.g:69:1: oper : ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' );
    public final void oper() throws RecognitionException {
        try {
            // analyseurs/Looc.g:69:5: ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' )
            // analyseurs/Looc.g:
            {
            if ( (input.LA(1)>=45 && input.LA(1)<=53) ) {
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
    // $ANTLR end "oper"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_decl_in_program39 = new BitSet(new long[]{0x0000038A22084020L});
    public static final BitSet FOLLOW_var_decl_in_program44 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_instruction_in_program49 = new BitSet(new long[]{0x0000038A22080022L});
    public static final BitSet FOLLOW_14_in_class_decl61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDFC_in_class_decl63 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_class_decl66 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDFC_in_class_decl68 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_class_decl72 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_class_decl74 = new BitSet(new long[]{0x00000000010C0000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl76 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_class_decl78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl89 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl94 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19_in_var_decl106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_var_decl108 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_var_decl110 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_var_decl112 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_var_decl114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_method_decl158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_decl160 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_method_decl162 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_method_args_in_method_decl165 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_method_decl169 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_method_decl172 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_decl174 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_method_decl178 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_var_decl_in_method_decl181 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_instruction_in_method_decl186 = new BitSet(new long[]{0x0000038A26080020L});
    public static final BitSet FOLLOW_26_in_method_decl190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args200 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_args202 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_args204 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_method_args207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_args209 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_args211 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_args213 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_IDF_in_instruction225 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instruction227 = new BitSet(new long[]{0x00003C40000200A0L});
    public static final BitSet FOLLOW_affectation_in_instruction229 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instruction231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_instruction248 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction250 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_instruction252 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_instruction_in_instruction254 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_instruction257 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_instruction_in_instruction259 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_instruction263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_instruction280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction282 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_instruction284 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction286 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_instruction288 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_instruction_in_instruction291 = new BitSet(new long[]{0x0000039A22080020L});
    public static final BitSet FOLLOW_36_in_instruction295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_instruction316 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_var_decl_in_instruction319 = new BitSet(new long[]{0x0000038A22080020L});
    public static final BitSet FOLLOW_instruction_in_instruction324 = new BitSet(new long[]{0x0000038A26080020L});
    public static final BitSet FOLLOW_26_in_instruction328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_instruction345 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction347 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instruction349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_instruction353 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction355 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_instruction358 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction360 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_instruction364 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instruction366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_in_instruction417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_affectation438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_affectation455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_print476 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_strprint_in_print478 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_print480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_strprint490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_strprint504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_read522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_read524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_read526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_return536 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_return538 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_return540 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_return542 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_return544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expression557 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_expression575 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_expression593 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression611 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_expression629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDFC_in_expression631 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expression649 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_expression651 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expression653 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_expression671 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_expression673 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_expression_bis695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_expression_bis697 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_expression_bis699 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_expression_bis701 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_expression_bis704 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_expression_bis706 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_expression_bis710 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expression_bis733 = new BitSet(new long[]{0x00003C00000200A0L});
    public static final BitSet FOLLOW_expression_in_expression_bis735 = new BitSet(new long[]{0x003FE02000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_oper0 = new BitSet(new long[]{0x0000000000000002L});

}