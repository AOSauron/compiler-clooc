// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-01-21 15:38:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDFC", "IDF", "CSTE_CHAINE", "CSTE_ENT", "ESC_SEQ", "WS", "COMMENT", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'.'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'-'", "'+'", "'*'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
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


        public LoocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LoocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LoocParser.tokenNames; }
    public String getGrammarFileName() { return "Looc.g"; }



    // $ANTLR start "program"
    // Looc.g:12:1: program : ( class_decl )* ( var_decl )* ( instruction )+ ;
    public final void program() throws RecognitionException {
        try {
            // Looc.g:12:8: ( ( class_decl )* ( var_decl )* ( instruction )+ )
            // Looc.g:12:12: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // Looc.g:12:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:12:13: class_decl
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

            // Looc.g:12:26: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:12:27: var_decl
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

            // Looc.g:12:38: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==25||LA3_0==29||LA3_0==33||LA3_0==36||(LA3_0>=40 && LA3_0<=42)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:12:39: instruction
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
    // Looc.g:14:1: class_decl : 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' ;
    public final void class_decl() throws RecognitionException {
        try {
            // Looc.g:14:11: ( 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' )
            // Looc.g:14:15: 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')'
            {
            match(input,14,FOLLOW_14_in_class_decl61); 
            match(input,IDFC,FOLLOW_IDFC_in_class_decl63); 
            // Looc.g:14:28: ( 'inherit' IDFC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Looc.g:14:29: 'inherit' IDFC
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
    // Looc.g:16:1: class_item_decl : ( var_decl )* ( method_decl )* ;
    public final void class_item_decl() throws RecognitionException {
        try {
            // Looc.g:16:16: ( ( var_decl )* ( method_decl )* )
            // Looc.g:16:20: ( var_decl )* ( method_decl )*
            {
            // Looc.g:16:20: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:16:21: var_decl
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

            // Looc.g:16:32: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:16:33: method_decl
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
    // Looc.g:18:1: var_decl : 'var' IDF ':' type ';' ;
    public final void var_decl() throws RecognitionException {
        try {
            // Looc.g:18:9: ( 'var' IDF ':' type ';' )
            // Looc.g:18:13: 'var' IDF ':' type ';'
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
    // Looc.g:20:1: type : ( IDFC | 'int' | 'string' );
    public final void type() throws RecognitionException {
        try {
            // Looc.g:20:5: ( IDFC | 'int' | 'string' )
            // Looc.g:
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
    // Looc.g:25:1: method_decl : 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' ;
    public final void method_decl() throws RecognitionException {
        try {
            // Looc.g:25:12: ( 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' )
            // Looc.g:25:16: 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}'
            {
            match(input,24,FOLLOW_24_in_method_decl158); 
            match(input,IDF,FOLLOW_IDF_in_method_decl160); 
            match(input,17,FOLLOW_17_in_method_decl162); 
            // Looc.g:25:33: ( method_args )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDF) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Looc.g:25:34: method_args
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
            // Looc.g:25:52: ( ':' type )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Looc.g:25:53: ':' type
                    {
                    match(input,20,FOLLOW_20_in_method_decl172); 
                    pushFollow(FOLLOW_type_in_method_decl174);
                    type();

                    state._fsp--;


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_method_decl178); 
            // Looc.g:25:68: ( var_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Looc.g:25:69: var_decl
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

            // Looc.g:25:80: ( instruction )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDF||LA10_0==25||LA10_0==29||LA10_0==33||LA10_0==36||(LA10_0>=40 && LA10_0<=42)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Looc.g:25:81: instruction
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
    // Looc.g:27:1: method_args : IDF ':' type ( ',' IDF ':' type )* ;
    public final void method_args() throws RecognitionException {
        try {
            // Looc.g:27:12: ( IDF ':' type ( ',' IDF ':' type )* )
            // Looc.g:27:16: IDF ':' type ( ',' IDF ':' type )*
            {
            match(input,IDF,FOLLOW_IDF_in_method_args200); 
            match(input,20,FOLLOW_20_in_method_args202); 
            pushFollow(FOLLOW_type_in_method_args204);
            type();

            state._fsp--;

            // Looc.g:27:29: ( ',' IDF ':' type )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Looc.g:27:30: ',' IDF ':' type
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
    // Looc.g:29:1: instruction : ( IDF ':=' affectation ';' | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression '.' IDF '(' ( expression )? ( ',' expression )* ')' ';' | print | read | returnstate );
    public final void instruction() throws RecognitionException {
        try {
            // Looc.g:29:12: ( IDF ':=' affectation ';' | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression '.' IDF '(' ( expression )? ( ',' expression )* ')' ';' | print | read | returnstate )
            int alt18=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 25:
                {
                alt18=4;
                }
                break;
            case 36:
                {
                alt18=5;
                }
                break;
            case 40:
                {
                alt18=6;
                }
                break;
            case 41:
                {
                alt18=7;
                }
                break;
            case 42:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // Looc.g:29:16: IDF ':=' affectation ';'
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
                    // Looc.g:30:16: 'if' expression 'then' instruction ( 'else' instruction )? 'fi'
                    {
                    match(input,29,FOLLOW_29_in_instruction248); 
                    pushFollow(FOLLOW_expression_in_instruction250);
                    expression();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_instruction252); 
                    pushFollow(FOLLOW_instruction_in_instruction254);
                    instruction();

                    state._fsp--;

                    // Looc.g:30:51: ( 'else' instruction )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Looc.g:30:52: 'else' instruction
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
                    // Looc.g:31:16: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    match(input,33,FOLLOW_33_in_instruction280); 
                    match(input,IDF,FOLLOW_IDF_in_instruction282); 
                    match(input,34,FOLLOW_34_in_instruction284); 
                    pushFollow(FOLLOW_expression_in_instruction286);
                    expression();

                    state._fsp--;

                    match(input,35,FOLLOW_35_in_instruction288); 
                    pushFollow(FOLLOW_expression_in_instruction290);
                    expression();

                    state._fsp--;

                    match(input,36,FOLLOW_36_in_instruction292); 
                    // Looc.g:31:63: ( instruction )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IDF||LA13_0==25||LA13_0==29||LA13_0==33||LA13_0==36||(LA13_0>=40 && LA13_0<=42)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Looc.g:31:64: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction295);
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

                    match(input,37,FOLLOW_37_in_instruction299); 

                    }
                    break;
                case 4 :
                    // Looc.g:32:16: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    match(input,25,FOLLOW_25_in_instruction320); 
                    // Looc.g:32:20: ( var_decl )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Looc.g:32:21: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction323);
                    	    var_decl();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // Looc.g:32:32: ( instruction )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==25||LA15_0==29||LA15_0==33||LA15_0==36||(LA15_0>=40 && LA15_0<=42)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Looc.g:32:33: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction328);
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

                    match(input,26,FOLLOW_26_in_instruction332); 

                    }
                    break;
                case 5 :
                    // Looc.g:33:16: 'do' expression '.' IDF '(' ( expression )? ( ',' expression )* ')' ';'
                    {
                    match(input,36,FOLLOW_36_in_instruction349); 
                    pushFollow(FOLLOW_expression_in_instruction351);
                    expression();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_instruction353); 
                    match(input,IDF,FOLLOW_IDF_in_instruction355); 
                    match(input,17,FOLLOW_17_in_instruction357); 
                    // Looc.g:33:44: ( expression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==IDF||LA16_0==CSTE_ENT||LA16_0==17||(LA16_0>=43 && LA16_0<=46)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Looc.g:33:45: expression
                            {
                            pushFollow(FOLLOW_expression_in_instruction360);
                            expression();

                            state._fsp--;


                            }
                            break;

                    }

                    // Looc.g:33:58: ( ',' expression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Looc.g:33:59: ',' expression
                    	    {
                    	    match(input,27,FOLLOW_27_in_instruction365); 
                    	    pushFollow(FOLLOW_expression_in_instruction367);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_instruction371); 
                    match(input,21,FOLLOW_21_in_instruction373); 

                    }
                    break;
                case 6 :
                    // Looc.g:34:16: print
                    {
                    pushFollow(FOLLOW_print_in_instruction390);
                    print();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // Looc.g:35:16: read
                    {
                    pushFollow(FOLLOW_read_in_instruction407);
                    read();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // Looc.g:36:16: returnstate
                    {
                    pushFollow(FOLLOW_returnstate_in_instruction424);
                    returnstate();

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
    // Looc.g:39:1: affectation : ( expression | 'nil' );
    public final void affectation() throws RecognitionException {
        try {
            // Looc.g:39:12: ( expression | 'nil' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDF||LA19_0==CSTE_ENT||LA19_0==17||(LA19_0>=43 && LA19_0<=46)) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Looc.g:39:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_affectation445);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Looc.g:40:16: 'nil'
                    {
                    match(input,39,FOLLOW_39_in_affectation462); 

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
    // Looc.g:43:1: print : 'write' strprint ';' ;
    public final void print() throws RecognitionException {
        try {
            // Looc.g:43:6: ( 'write' strprint ';' )
            // Looc.g:43:10: 'write' strprint ';'
            {
            match(input,40,FOLLOW_40_in_print483); 
            pushFollow(FOLLOW_strprint_in_print485);
            strprint();

            state._fsp--;

            match(input,21,FOLLOW_21_in_print487); 

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
    // Looc.g:45:1: strprint : ( expression | CSTE_CHAINE );
    public final void strprint() throws RecognitionException {
        try {
            // Looc.g:45:9: ( expression | CSTE_CHAINE )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDF||LA20_0==CSTE_ENT||LA20_0==17||(LA20_0>=43 && LA20_0<=46)) ) {
                alt20=1;
            }
            else if ( (LA20_0==CSTE_CHAINE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // Looc.g:45:13: expression
                    {
                    pushFollow(FOLLOW_expression_in_strprint497);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Looc.g:46:13: CSTE_CHAINE
                    {
                    match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_strprint511); 

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
    // Looc.g:49:1: read : 'read' IDF ';' ;
    public final void read() throws RecognitionException {
        try {
            // Looc.g:49:5: ( 'read' IDF ';' )
            // Looc.g:49:9: 'read' IDF ';'
            {
            match(input,41,FOLLOW_41_in_read529); 
            match(input,IDF,FOLLOW_IDF_in_read531); 
            match(input,21,FOLLOW_21_in_read533); 

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


    // $ANTLR start "returnstate"
    // Looc.g:51:1: returnstate : 'return' '(' expression ')' ';' ;
    public final void returnstate() throws RecognitionException {
        try {
            // Looc.g:51:12: ( 'return' '(' expression ')' ';' )
            // Looc.g:51:16: 'return' '(' expression ')' ';'
            {
            match(input,42,FOLLOW_42_in_returnstate543); 
            match(input,17,FOLLOW_17_in_returnstate545); 
            pushFollow(FOLLOW_expression_in_returnstate547);
            expression();

            state._fsp--;

            match(input,18,FOLLOW_18_in_returnstate549); 
            match(input,21,FOLLOW_21_in_returnstate551); 

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
    // $ANTLR end "returnstate"


    // $ANTLR start "expression"
    // Looc.g:55:1: expression : ( IDF expression_bis | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis | 'new' IDFC expression_bis | '(' expression ')' expression_bis | '-' expression expression_bis );
    public final void expression() throws RecognitionException {
        try {
            // Looc.g:55:11: ( IDF expression_bis | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis | 'new' IDFC expression_bis | '(' expression ')' expression_bis | '-' expression expression_bis )
            int alt21=7;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                alt21=2;
                }
                break;
            case 44:
                {
                alt21=3;
                }
                break;
            case CSTE_ENT:
                {
                alt21=4;
                }
                break;
            case 45:
                {
                alt21=5;
                }
                break;
            case 17:
                {
                alt21=6;
                }
                break;
            case 46:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // Looc.g:55:15: IDF expression_bis
                    {
                    match(input,IDF,FOLLOW_IDF_in_expression564); 
                    pushFollow(FOLLOW_expression_bis_in_expression566);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Looc.g:56:15: 'this' expression_bis
                    {
                    match(input,43,FOLLOW_43_in_expression582); 
                    pushFollow(FOLLOW_expression_bis_in_expression584);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Looc.g:57:15: 'super' expression_bis
                    {
                    match(input,44,FOLLOW_44_in_expression600); 
                    pushFollow(FOLLOW_expression_bis_in_expression602);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Looc.g:58:15: CSTE_ENT expression_bis
                    {
                    match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression618); 
                    pushFollow(FOLLOW_expression_bis_in_expression620);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // Looc.g:59:15: 'new' IDFC expression_bis
                    {
                    match(input,45,FOLLOW_45_in_expression636); 
                    match(input,IDFC,FOLLOW_IDFC_in_expression638); 
                    pushFollow(FOLLOW_expression_bis_in_expression640);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Looc.g:60:15: '(' expression ')' expression_bis
                    {
                    match(input,17,FOLLOW_17_in_expression656); 
                    pushFollow(FOLLOW_expression_in_expression658);
                    expression();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_expression660); 
                    pushFollow(FOLLOW_expression_bis_in_expression662);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // Looc.g:61:15: '-' expression expression_bis
                    {
                    match(input,46,FOLLOW_46_in_expression678); 
                    pushFollow(FOLLOW_expression_in_expression680);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_bis_in_expression682);
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
    // Looc.g:64:1: expression_bis : ( '.' IDF '(' expression ( ',' expression )* ')' expression_bis | oper expression expression_bis | );
    public final void expression_bis() throws RecognitionException {
        try {
            // Looc.g:64:15: ( '.' IDF '(' expression ( ',' expression )* ')' expression_bis | oper expression expression_bis | )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt23=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt23=2;
                }
                break;
            case 18:
            case 21:
            case 27:
            case 30:
            case 35:
            case 36:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // Looc.g:64:19: '.' IDF '(' expression ( ',' expression )* ')' expression_bis
                    {
                    match(input,38,FOLLOW_38_in_expression_bis702); 
                    match(input,IDF,FOLLOW_IDF_in_expression_bis704); 
                    match(input,17,FOLLOW_17_in_expression_bis706); 
                    pushFollow(FOLLOW_expression_in_expression_bis708);
                    expression();

                    state._fsp--;

                    // Looc.g:64:42: ( ',' expression )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==27) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Looc.g:64:43: ',' expression
                    	    {
                    	    match(input,27,FOLLOW_27_in_expression_bis711); 
                    	    pushFollow(FOLLOW_expression_in_expression_bis713);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_expression_bis717); 
                    pushFollow(FOLLOW_expression_bis_in_expression_bis719);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Looc.g:65:19: oper expression expression_bis
                    {
                    pushFollow(FOLLOW_oper_in_expression_bis739);
                    oper();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression_bis741);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_bis_in_expression_bis743);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Looc.g:67:15: 
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
    // Looc.g:69:1: oper : ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' );
    public final void oper() throws RecognitionException {
        try {
            // Looc.g:69:5: ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' )
            // Looc.g:
            {
            if ( (input.LA(1)>=46 && input.LA(1)<=54) ) {
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


 

    public static final BitSet FOLLOW_class_decl_in_program39 = new BitSet(new long[]{0x0000071222084020L});
    public static final BitSet FOLLOW_var_decl_in_program44 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_instruction_in_program49 = new BitSet(new long[]{0x0000071222080022L});
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
    public static final BitSet FOLLOW_25_in_method_decl178 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_var_decl_in_method_decl181 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_instruction_in_method_decl186 = new BitSet(new long[]{0x0000071226080020L});
    public static final BitSet FOLLOW_26_in_method_decl190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args200 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_args202 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_args204 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_method_args207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_args209 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_args211 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_args213 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_IDF_in_instruction225 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instruction227 = new BitSet(new long[]{0x00007880000200A0L});
    public static final BitSet FOLLOW_affectation_in_instruction229 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instruction231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_instruction248 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction250 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_instruction252 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction254 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_instruction257 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction259 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_instruction263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_instruction280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction282 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_instruction284 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction286 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_instruction288 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction290 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_instruction292 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction295 = new BitSet(new long[]{0x0000073222080020L});
    public static final BitSet FOLLOW_37_in_instruction299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_instruction320 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_var_decl_in_instruction323 = new BitSet(new long[]{0x0000071222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction328 = new BitSet(new long[]{0x0000071226080020L});
    public static final BitSet FOLLOW_26_in_instruction332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_instruction349 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction351 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_instruction353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction355 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_instruction357 = new BitSet(new long[]{0x00007800080600A0L});
    public static final BitSet FOLLOW_expression_in_instruction360 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_instruction365 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_instruction367 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_instruction371 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instruction373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstate_in_instruction424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_affectation445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_affectation462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_print483 = new BitSet(new long[]{0x00007800000200E0L});
    public static final BitSet FOLLOW_strprint_in_print485 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_print487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_strprint497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_strprint511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_read529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_read531 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_read533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_returnstate543 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_returnstate545 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_returnstate547 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_returnstate549 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_returnstate551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expression564 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_expression582 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_expression600 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression618 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_expression636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDFC_in_expression638 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expression656 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_expression658 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expression660 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_expression678 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_expression680 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_expression_bis702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_expression_bis704 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_expression_bis706 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_expression_bis708 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_expression_bis711 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_expression_bis713 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_expression_bis717 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expression_bis739 = new BitSet(new long[]{0x00007800000200A0L});
    public static final BitSet FOLLOW_expression_in_expression_bis741 = new BitSet(new long[]{0x007FC04000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_oper0 = new BitSet(new long[]{0x0000000000000002L});

}