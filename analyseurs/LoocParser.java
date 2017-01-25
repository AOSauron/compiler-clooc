// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-01-25 13:30:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDFC", "IDF", "CSTE_ENT", "CSTE_CHAINE", "ESC_SEQ", "WS", "COMMENT", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'-'", "'.'", "'+'", "'*'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
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
    public static final int CSTE_ENT=6;
    public static final int CSTE_CHAINE=7;
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


      /* AST */
      class Arbre {
        private String noeud;
        private Arbre gauche, droite;
        private static final int ind = 4;

        public Arbre(String n) {
          noeud = n;
          droite = gauche = null;
        }
        public Arbre(String n, Arbre g, Arbre d) {
          noeud= n;
          gauche = g;
          droite = d;
        }
        public Arbre setGauche(Arbre g) {
          gauche = g;
          return this;
        }
        public Arbre setDroite(Arbre d) {
          droite = d;
          return this;
        }
        public String toString() {
          if (gauche == null && droite == null) {
            return " " + noeud;
          }
          StringBuffer s = new StringBuffer("("+noeud);
          s.append(gauche == null ? "()" : gauche.toString());
          s.append(droite == null ? "()" : droite.toString());
          s.append(")");
          return s.toString();
        }
        private void idente(StringBuffer s, int lvl) {
          for (int i = 0; i<ind*lvl; i++) {
            s.append(" ");
          }
        }
        public String prettyPrint(int lvl) {
          StringBuffer s = new StringBuffer();
          idente(s, lvl);
          s.append(noeud+"\n");
          if (gauche == null && droite == null) {
            return s.toString();
          }
          s.append(gauche == null ? "\n" : gauche.prettyPrint(lvl+1));
          s.append(droite == null ? "\n" : droite.prettyPrint(lvl+1));
          return s.toString();
        }
      }
     


    // $ANTLR start "program"
    // Looc.g:65:1: program : ( class_decl )* ( var_decl )* ( instruction )+ ;
    public final void program() throws RecognitionException {
        try {
            // Looc.g:65:8: ( ( class_decl )* ( var_decl )* ( instruction )+ )
            // Looc.g:65:12: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // Looc.g:65:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:65:13: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program46);
            	    class_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Looc.g:65:26: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:65:27: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_program51);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Looc.g:65:38: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==25||LA3_0==29||LA3_0==33||LA3_0==36||(LA3_0>=39 && LA3_0<=41)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:65:39: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_program56);
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
    // Looc.g:67:1: class_decl : 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' ;
    public final void class_decl() throws RecognitionException {
        try {
            // Looc.g:67:11: ( 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' )
            // Looc.g:67:15: 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')'
            {
            match(input,14,FOLLOW_14_in_class_decl68); 
            match(input,IDFC,FOLLOW_IDFC_in_class_decl70); 
            // Looc.g:67:28: ( 'inherit' IDFC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Looc.g:67:29: 'inherit' IDFC
                    {
                    match(input,15,FOLLOW_15_in_class_decl73); 
                    match(input,IDFC,FOLLOW_IDFC_in_class_decl75); 

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_class_decl79); 
            match(input,17,FOLLOW_17_in_class_decl81); 
            pushFollow(FOLLOW_class_item_decl_in_class_decl83);
            class_item_decl();

            state._fsp--;

            match(input,18,FOLLOW_18_in_class_decl85); 

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
    // Looc.g:69:1: class_item_decl : ( var_decl )* ( method_decl )* ;
    public final void class_item_decl() throws RecognitionException {
        try {
            // Looc.g:69:16: ( ( var_decl )* ( method_decl )* )
            // Looc.g:69:20: ( var_decl )* ( method_decl )*
            {
            // Looc.g:69:20: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:69:21: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl96);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Looc.g:69:32: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:69:33: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl101);
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
    // Looc.g:71:1: var_decl : 'var' IDF ':' type ';' ;
    public final void var_decl() throws RecognitionException {
        try {
            // Looc.g:71:9: ( 'var' IDF ':' type ';' )
            // Looc.g:71:13: 'var' IDF ':' type ';'
            {
            match(input,19,FOLLOW_19_in_var_decl113); 
            match(input,IDF,FOLLOW_IDF_in_var_decl115); 
            match(input,20,FOLLOW_20_in_var_decl117); 
            pushFollow(FOLLOW_type_in_var_decl119);
            type();

            state._fsp--;

            match(input,21,FOLLOW_21_in_var_decl121); 

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
    // Looc.g:73:1: type : ( IDFC | 'int' | 'string' );
    public final void type() throws RecognitionException {
        try {
            // Looc.g:73:5: ( IDFC | 'int' | 'string' )
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
    // Looc.g:78:1: method_decl : 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' ;
    public final void method_decl() throws RecognitionException {
        try {
            // Looc.g:78:12: ( 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' )
            // Looc.g:78:16: 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}'
            {
            match(input,24,FOLLOW_24_in_method_decl184); 
            match(input,IDF,FOLLOW_IDF_in_method_decl186); 
            match(input,17,FOLLOW_17_in_method_decl188); 
            // Looc.g:78:33: ( method_args )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDF) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Looc.g:78:34: method_args
            	    {
            	    pushFollow(FOLLOW_method_args_in_method_decl191);
            	    method_args();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_method_decl195); 
            // Looc.g:78:52: ( ':' type )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Looc.g:78:53: ':' type
                    {
                    match(input,20,FOLLOW_20_in_method_decl198); 
                    pushFollow(FOLLOW_type_in_method_decl200);
                    type();

                    state._fsp--;


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_method_decl204); 
            // Looc.g:78:68: ( var_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Looc.g:78:69: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_method_decl207);
            	    var_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // Looc.g:78:80: ( instruction )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDF||LA10_0==25||LA10_0==29||LA10_0==33||LA10_0==36||(LA10_0>=39 && LA10_0<=41)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Looc.g:78:81: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_method_decl212);
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

            match(input,26,FOLLOW_26_in_method_decl216); 

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
    // Looc.g:80:1: method_args : IDF ':' type ( ',' IDF ':' type )* ;
    public final void method_args() throws RecognitionException {
        try {
            // Looc.g:80:12: ( IDF ':' type ( ',' IDF ':' type )* )
            // Looc.g:80:16: IDF ':' type ( ',' IDF ':' type )*
            {
            match(input,IDF,FOLLOW_IDF_in_method_args226); 
            match(input,20,FOLLOW_20_in_method_args228); 
            pushFollow(FOLLOW_type_in_method_args230);
            type();

            state._fsp--;

            // Looc.g:80:29: ( ',' IDF ':' type )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Looc.g:80:30: ',' IDF ':' type
            	    {
            	    match(input,27,FOLLOW_27_in_method_args233); 
            	    match(input,IDF,FOLLOW_IDF_in_method_args235); 
            	    match(input,20,FOLLOW_20_in_method_args237); 
            	    pushFollow(FOLLOW_type_in_method_args239);
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
    // Looc.g:82:1: instruction : ( IDF ':=' affectation ';' | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression ';' | print | read | returnstate );
    public final void instruction() throws RecognitionException {
        try {
            // Looc.g:82:12: ( IDF ':=' affectation ';' | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression ';' | print | read | returnstate )
            int alt16=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            case 39:
                {
                alt16=6;
                }
                break;
            case 40:
                {
                alt16=7;
                }
                break;
            case 41:
                {
                alt16=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // Looc.g:82:16: IDF ':=' affectation ';'
                    {
                    match(input,IDF,FOLLOW_IDF_in_instruction251); 
                    match(input,28,FOLLOW_28_in_instruction253); 
                    pushFollow(FOLLOW_affectation_in_instruction255);
                    affectation();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_instruction257); 

                    }
                    break;
                case 2 :
                    // Looc.g:83:16: 'if' expression 'then' instruction ( 'else' instruction )? 'fi'
                    {
                    match(input,29,FOLLOW_29_in_instruction274); 
                    pushFollow(FOLLOW_expression_in_instruction276);
                    expression();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_instruction278); 
                    pushFollow(FOLLOW_instruction_in_instruction280);
                    instruction();

                    state._fsp--;

                    // Looc.g:83:51: ( 'else' instruction )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Looc.g:83:52: 'else' instruction
                            {
                            match(input,31,FOLLOW_31_in_instruction283); 
                            pushFollow(FOLLOW_instruction_in_instruction285);
                            instruction();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_instruction289); 

                    }
                    break;
                case 3 :
                    // Looc.g:84:16: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    match(input,33,FOLLOW_33_in_instruction306); 
                    match(input,IDF,FOLLOW_IDF_in_instruction308); 
                    match(input,34,FOLLOW_34_in_instruction310); 
                    pushFollow(FOLLOW_expression_in_instruction312);
                    expression();

                    state._fsp--;

                    match(input,35,FOLLOW_35_in_instruction314); 
                    pushFollow(FOLLOW_expression_in_instruction316);
                    expression();

                    state._fsp--;

                    match(input,36,FOLLOW_36_in_instruction318); 
                    // Looc.g:84:63: ( instruction )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IDF||LA13_0==25||LA13_0==29||LA13_0==33||LA13_0==36||(LA13_0>=39 && LA13_0<=41)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Looc.g:84:64: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction321);
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

                    match(input,37,FOLLOW_37_in_instruction325); 

                    }
                    break;
                case 4 :
                    // Looc.g:85:16: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    match(input,25,FOLLOW_25_in_instruction342); 
                    // Looc.g:85:20: ( var_decl )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Looc.g:85:21: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction345);
                    	    var_decl();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // Looc.g:85:32: ( instruction )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==25||LA15_0==29||LA15_0==33||LA15_0==36||(LA15_0>=39 && LA15_0<=41)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Looc.g:85:33: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction350);
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

                    match(input,26,FOLLOW_26_in_instruction354); 

                    }
                    break;
                case 5 :
                    // Looc.g:86:16: 'do' expression ';'
                    {
                    match(input,36,FOLLOW_36_in_instruction371); 
                    pushFollow(FOLLOW_expression_in_instruction373);
                    expression();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_instruction375); 

                    }
                    break;
                case 6 :
                    // Looc.g:87:16: print
                    {
                    pushFollow(FOLLOW_print_in_instruction392);
                    print();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // Looc.g:88:16: read
                    {
                    pushFollow(FOLLOW_read_in_instruction409);
                    read();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // Looc.g:89:16: returnstate
                    {
                    pushFollow(FOLLOW_returnstate_in_instruction426);
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
    // Looc.g:92:1: affectation : ( expression | 'nil' );
    public final void affectation() throws RecognitionException {
        try {
            // Looc.g:92:12: ( expression | 'nil' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=IDF && LA17_0<=CSTE_CHAINE)||LA17_0==17||(LA17_0>=42 && LA17_0<=45)) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // Looc.g:92:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_affectation447);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Looc.g:93:16: 'nil'
                    {
                    match(input,38,FOLLOW_38_in_affectation464); 

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
    // Looc.g:96:1: print : 'write' expression ';' ;
    public final void print() throws RecognitionException {
        try {
            // Looc.g:96:6: ( 'write' expression ';' )
            // Looc.g:96:10: 'write' expression ';'
            {
            match(input,39,FOLLOW_39_in_print485); 
            pushFollow(FOLLOW_expression_in_print487);
            expression();

            state._fsp--;

            match(input,21,FOLLOW_21_in_print489); 

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


    // $ANTLR start "read"
    // Looc.g:98:1: read : 'read' IDF ';' ;
    public final void read() throws RecognitionException {
        try {
            // Looc.g:98:5: ( 'read' IDF ';' )
            // Looc.g:98:9: 'read' IDF ';'
            {
            match(input,40,FOLLOW_40_in_read499); 
            match(input,IDF,FOLLOW_IDF_in_read501); 
            match(input,21,FOLLOW_21_in_read503); 

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
    // Looc.g:100:1: returnstate : 'return' '(' expression ')' ';' ;
    public final void returnstate() throws RecognitionException {
        try {
            // Looc.g:100:12: ( 'return' '(' expression ')' ';' )
            // Looc.g:100:16: 'return' '(' expression ')' ';'
            {
            match(input,41,FOLLOW_41_in_returnstate513); 
            match(input,17,FOLLOW_17_in_returnstate515); 
            pushFollow(FOLLOW_expression_in_returnstate517);
            expression();

            state._fsp--;

            match(input,18,FOLLOW_18_in_returnstate519); 
            match(input,21,FOLLOW_21_in_returnstate521); 

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
    // Looc.g:104:1: expression : ( IDF expression_bis | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis | CSTE_CHAINE expression_bis | 'new' IDFC expression_bis | '(' expression ')' expression_bis | '-' expression expression_bis );
    public final void expression() throws RecognitionException {
        try {
            // Looc.g:104:11: ( IDF expression_bis | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis | CSTE_CHAINE expression_bis | 'new' IDFC expression_bis | '(' expression ')' expression_bis | '-' expression expression_bis )
            int alt18=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case CSTE_ENT:
                {
                alt18=4;
                }
                break;
            case CSTE_CHAINE:
                {
                alt18=5;
                }
                break;
            case 44:
                {
                alt18=6;
                }
                break;
            case 17:
                {
                alt18=7;
                }
                break;
            case 45:
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
                    // Looc.g:104:15: IDF expression_bis
                    {
                    match(input,IDF,FOLLOW_IDF_in_expression534); 
                    pushFollow(FOLLOW_expression_bis_in_expression536);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Looc.g:105:15: 'this' expression_bis
                    {
                    match(input,42,FOLLOW_42_in_expression552); 
                    pushFollow(FOLLOW_expression_bis_in_expression554);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Looc.g:106:15: 'super' expression_bis
                    {
                    match(input,43,FOLLOW_43_in_expression570); 
                    pushFollow(FOLLOW_expression_bis_in_expression572);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Looc.g:107:15: CSTE_ENT expression_bis
                    {
                    match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression588); 
                    pushFollow(FOLLOW_expression_bis_in_expression590);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // Looc.g:108:15: CSTE_CHAINE expression_bis
                    {
                    match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_expression606); 
                    pushFollow(FOLLOW_expression_bis_in_expression608);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Looc.g:109:15: 'new' IDFC expression_bis
                    {
                    match(input,44,FOLLOW_44_in_expression624); 
                    match(input,IDFC,FOLLOW_IDFC_in_expression626); 
                    pushFollow(FOLLOW_expression_bis_in_expression628);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // Looc.g:110:15: '(' expression ')' expression_bis
                    {
                    match(input,17,FOLLOW_17_in_expression644); 
                    pushFollow(FOLLOW_expression_in_expression646);
                    expression();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_expression648); 
                    pushFollow(FOLLOW_expression_bis_in_expression650);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // Looc.g:111:15: '-' expression expression_bis
                    {
                    match(input,45,FOLLOW_45_in_expression666); 
                    pushFollow(FOLLOW_expression_in_expression668);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_bis_in_expression670);
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
    // Looc.g:114:1: expression_bis : ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expression_bis | oper expression expression_bis | );
    public final void expression_bis() throws RecognitionException {
        try {
            // Looc.g:114:15: ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expression_bis | oper expression expression_bis | )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt21=1;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt21=2;
                }
                break;
            case 18:
            case 21:
            case 27:
            case 30:
            case 35:
            case 36:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // Looc.g:114:19: '.' IDF '(' ( expression )? ( ',' expression )* ')' expression_bis
                    {
                    match(input,46,FOLLOW_46_in_expression_bis690); 
                    match(input,IDF,FOLLOW_IDF_in_expression_bis692); 
                    match(input,17,FOLLOW_17_in_expression_bis694); 
                    // Looc.g:114:31: ( expression )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=IDF && LA19_0<=CSTE_CHAINE)||LA19_0==17||(LA19_0>=42 && LA19_0<=45)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Looc.g:114:32: expression
                            {
                            pushFollow(FOLLOW_expression_in_expression_bis697);
                            expression();

                            state._fsp--;


                            }
                            break;

                    }

                    // Looc.g:114:45: ( ',' expression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Looc.g:114:46: ',' expression
                    	    {
                    	    match(input,27,FOLLOW_27_in_expression_bis702); 
                    	    pushFollow(FOLLOW_expression_in_expression_bis704);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_expression_bis708); 
                    pushFollow(FOLLOW_expression_bis_in_expression_bis710);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Looc.g:115:19: oper expression expression_bis
                    {
                    pushFollow(FOLLOW_oper_in_expression_bis730);
                    oper();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression_bis732);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_bis_in_expression_bis734);
                    expression_bis();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Looc.g:117:15: 
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
    // Looc.g:119:1: oper : ( '+' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' );
    public final void oper() throws RecognitionException {
        try {
            // Looc.g:119:5: ( '+' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' )
            // Looc.g:
            {
            if ( (input.LA(1)>=47 && input.LA(1)<=54) ) {
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


 

    public static final BitSet FOLLOW_class_decl_in_program46 = new BitSet(new long[]{0x0000039222084020L});
    public static final BitSet FOLLOW_var_decl_in_program51 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_instruction_in_program56 = new BitSet(new long[]{0x0000039222080022L});
    public static final BitSet FOLLOW_14_in_class_decl68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDFC_in_class_decl70 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_class_decl73 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDFC_in_class_decl75 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_class_decl79 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_class_decl81 = new BitSet(new long[]{0x00000000010C0000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl83 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_class_decl85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl96 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl101 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19_in_var_decl113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_var_decl115 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_var_decl117 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_var_decl119 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_var_decl121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_method_decl184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_decl186 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_method_decl188 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_method_args_in_method_decl191 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_method_decl195 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_method_decl198 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_decl200 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_method_decl204 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_var_decl_in_method_decl207 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_instruction_in_method_decl212 = new BitSet(new long[]{0x0000039226080020L});
    public static final BitSet FOLLOW_26_in_method_decl216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args226 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_args228 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_args230 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_method_args233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_args235 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_args237 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_type_in_method_args239 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_IDF_in_instruction251 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_instruction253 = new BitSet(new long[]{0x00003C40000200E0L});
    public static final BitSet FOLLOW_affectation_in_instruction255 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instruction257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_instruction274 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_instruction276 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_instruction278 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction280 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_instruction283 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction285 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_instruction289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_instruction306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction308 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_instruction310 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_instruction312 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_instruction314 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_instruction316 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_instruction318 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction321 = new BitSet(new long[]{0x000003B222080020L});
    public static final BitSet FOLLOW_37_in_instruction325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_instruction342 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_var_decl_in_instruction345 = new BitSet(new long[]{0x0000039222080020L});
    public static final BitSet FOLLOW_instruction_in_instruction350 = new BitSet(new long[]{0x0000039226080020L});
    public static final BitSet FOLLOW_26_in_instruction354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_instruction371 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_instruction373 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_instruction375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstate_in_instruction426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_affectation447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_affectation464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_print485 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_print487 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_print489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_read499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_read501 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_read503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_returnstate513 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_returnstate515 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_returnstate517 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_returnstate519 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_returnstate521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expression534 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_expression552 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_expression570 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression588 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_expression606 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_expression624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDFC_in_expression626 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expression644 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_expression646 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expression648 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_expression666 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_expression668 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_expression_bis690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_expression_bis692 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_expression_bis694 = new BitSet(new long[]{0x00003C00080600E0L});
    public static final BitSet FOLLOW_expression_in_expression_bis697 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27_in_expression_bis702 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_expression_bis704 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_expression_bis708 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expression_bis730 = new BitSet(new long[]{0x00003C00000200E0L});
    public static final BitSet FOLLOW_expression_in_expression_bis732 = new BitSet(new long[]{0x007FC00000000000L});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_oper0 = new BitSet(new long[]{0x0000000000000002L});

}