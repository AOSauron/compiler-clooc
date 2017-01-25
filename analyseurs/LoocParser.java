// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-01-25 20:11:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "CLASS", "ITEMDEC", "VARDEC", "METHODDEC", "METHODARG", "AFFECT", "IF", "FOR", "GROUP", "WRITE", "READ", "RETURN", "EXPR", "NEW", "METHODCALLING", "IDFC", "IDF", "CSTE_ENT", "CSTE_CHAINE", "ESC_SEQ", "WS", "COMMENT", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'-'", "'.'", "'+'", "'*'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
    };
    public static final int EOF=-1;
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int PROGRAM=4;
    public static final int CLASS=5;
    public static final int ITEMDEC=6;
    public static final int VARDEC=7;
    public static final int METHODDEC=8;
    public static final int METHODARG=9;
    public static final int AFFECT=10;
    public static final int IF=11;
    public static final int FOR=12;
    public static final int GROUP=13;
    public static final int WRITE=14;
    public static final int READ=15;
    public static final int RETURN=16;
    public static final int EXPR=17;
    public static final int NEW=18;
    public static final int METHODCALLING=19;
    public static final int IDFC=20;
    public static final int IDF=21;
    public static final int CSTE_ENT=22;
    public static final int CSTE_CHAINE=23;
    public static final int ESC_SEQ=24;
    public static final int WS=25;
    public static final int COMMENT=26;
    public static final int UNICODE_ESC=27;
    public static final int OCTAL_ESC=28;
    public static final int HEX_DIGIT=29;

    // delegates
    // delegators


        public LoocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LoocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LoocParser.tokenNames; }
    public String getGrammarFileName() { return "Looc.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Looc.g:34:1: program : ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ ) ;
    public final LoocParser.program_return program() throws RecognitionException {
        LoocParser.program_return retval = new LoocParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.class_decl_return class_decl1 = null;

        LoocParser.var_decl_return var_decl2 = null;

        LoocParser.instruction_return instruction3 = null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_class_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:34:8: ( ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ ) )
            // Looc.g:34:12: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // Looc.g:34:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:34:13: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program155);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Looc.g:34:26: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:34:27: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_program160);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Looc.g:34:38: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==41||LA3_0==45||LA3_0==49||LA3_0==52||(LA3_0>=55 && LA3_0<=57)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:34:39: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_program165);
            	    instruction3=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction3.getTree());

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



            // AST REWRITE
            // elements: instruction, var_decl, class_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 34:53: -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ )
            {
                // Looc.g:34:56: ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // Looc.g:34:66: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // Looc.g:34:80: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class class_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // Looc.g:36:1: class_decl : 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC IDFC class_item_decl ) ;
    public final LoocParser.class_decl_return class_decl() throws RecognitionException {
        LoocParser.class_decl_return retval = new LoocParser.class_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal4=null;
        Token IDFC5=null;
        Token string_literal6=null;
        Token IDFC7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        LoocParser.class_item_decl_return class_item_decl10 = null;


        CommonTree string_literal4_tree=null;
        CommonTree IDFC5_tree=null;
        CommonTree string_literal6_tree=null;
        CommonTree IDFC7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try {
            // Looc.g:36:11: ( 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC IDFC class_item_decl ) )
            // Looc.g:36:15: 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')'
            {
            string_literal4=(Token)match(input,30,FOLLOW_30_in_class_decl197);  
            stream_30.add(string_literal4);

            IDFC5=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl199);  
            stream_IDFC.add(IDFC5);

            // Looc.g:36:28: ( 'inherit' IDFC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Looc.g:36:29: 'inherit' IDFC
                    {
                    string_literal6=(Token)match(input,31,FOLLOW_31_in_class_decl202);  
                    stream_31.add(string_literal6);

                    IDFC7=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl204);  
                    stream_IDFC.add(IDFC7);


                    }
                    break;

            }

            char_literal8=(Token)match(input,32,FOLLOW_32_in_class_decl208);  
            stream_32.add(char_literal8);

            char_literal9=(Token)match(input,33,FOLLOW_33_in_class_decl210);  
            stream_33.add(char_literal9);

            pushFollow(FOLLOW_class_item_decl_in_class_decl212);
            class_item_decl10=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl10.getTree());
            char_literal11=(Token)match(input,34,FOLLOW_34_in_class_decl214);  
            stream_34.add(char_literal11);



            // AST REWRITE
            // elements: IDFC, IDFC, class_item_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:74: -> ^( CLASS IDFC IDFC class_item_decl )
            {
                // Looc.g:36:77: ^( CLASS IDFC IDFC class_item_decl )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS, "CLASS"), root_1);

                adaptor.addChild(root_1, stream_IDFC.nextNode());
                adaptor.addChild(root_1, stream_IDFC.nextNode());
                adaptor.addChild(root_1, stream_class_item_decl.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_item_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_item_decl"
    // Looc.g:38:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( ITEMDEC ( var_decl )* ( method_decl )* ) ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:38:16: ( ( var_decl )* ( method_decl )* -> ^( ITEMDEC ( var_decl )* ( method_decl )* ) )
            // Looc.g:38:20: ( var_decl )* ( method_decl )*
            {
            // Looc.g:38:20: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:38:21: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl236);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Looc.g:38:32: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:38:33: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl241);
            	    method_decl13=method_decl();

            	    state._fsp--;

            	    stream_method_decl.add(method_decl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: var_decl, method_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 38:47: -> ^( ITEMDEC ( var_decl )* ( method_decl )* )
            {
                // Looc.g:38:50: ^( ITEMDEC ( var_decl )* ( method_decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEMDEC, "ITEMDEC"), root_1);

                // Looc.g:38:60: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                // Looc.g:38:72: ( method_decl )*
                while ( stream_method_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_decl.nextTree());

                }
                stream_method_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_item_decl"

    public static class var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // Looc.g:40:1: var_decl : 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) ;
    public final LoocParser.var_decl_return var_decl() throws RecognitionException {
        LoocParser.var_decl_return retval = new LoocParser.var_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal14=null;
        Token IDF15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        LoocParser.type_return type17 = null;


        CommonTree string_literal14_tree=null;
        CommonTree IDF15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:40:9: ( 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) )
            // Looc.g:40:13: 'var' IDF ':' type ';'
            {
            string_literal14=(Token)match(input,35,FOLLOW_35_in_var_decl268);  
            stream_35.add(string_literal14);

            IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl270);  
            stream_IDF.add(IDF15);

            char_literal16=(Token)match(input,36,FOLLOW_36_in_var_decl272);  
            stream_36.add(char_literal16);

            pushFollow(FOLLOW_type_in_var_decl274);
            type17=type();

            state._fsp--;

            stream_type.add(type17.getTree());
            char_literal18=(Token)match(input,37,FOLLOW_37_in_var_decl276);  
            stream_37.add(char_literal18);



            // AST REWRITE
            // elements: IDF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 40:36: -> ^( VARDEC IDF type )
            {
                // Looc.g:40:39: ^( VARDEC IDF type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARDEC, "VARDEC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Looc.g:42:1: type : ( IDFC | 'int' | 'string' );
    public final LoocParser.type_return type() throws RecognitionException {
        LoocParser.type_return retval = new LoocParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set19=null;

        CommonTree set19_tree=null;

        try {
            // Looc.g:42:5: ( IDFC | 'int' | 'string' )
            // Looc.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set19=(Token)input.LT(1);
            if ( input.LA(1)==IDFC||(input.LA(1)>=38 && input.LA(1)<=39) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set19));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class method_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // Looc.g:47:1: method_decl : 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ ) ;
    public final LoocParser.method_decl_return method_decl() throws RecognitionException {
        LoocParser.method_decl_return retval = new LoocParser.method_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal20=null;
        Token IDF21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal30=null;
        LoocParser.method_args_return method_args23 = null;

        LoocParser.type_return type26 = null;

        LoocParser.var_decl_return var_decl28 = null;

        LoocParser.instruction_return instruction29 = null;


        CommonTree string_literal20_tree=null;
        CommonTree IDF21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_method_args=new RewriteRuleSubtreeStream(adaptor,"rule method_args");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:47:12: ( 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ ) )
            // Looc.g:47:16: 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}'
            {
            string_literal20=(Token)match(input,40,FOLLOW_40_in_method_decl345);  
            stream_40.add(string_literal20);

            IDF21=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl347);  
            stream_IDF.add(IDF21);

            char_literal22=(Token)match(input,33,FOLLOW_33_in_method_decl349);  
            stream_33.add(char_literal22);

            // Looc.g:47:33: ( method_args )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDF) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Looc.g:47:34: method_args
            	    {
            	    pushFollow(FOLLOW_method_args_in_method_decl352);
            	    method_args23=method_args();

            	    state._fsp--;

            	    stream_method_args.add(method_args23.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal24=(Token)match(input,34,FOLLOW_34_in_method_decl356);  
            stream_34.add(char_literal24);

            // Looc.g:47:52: ( ':' type )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Looc.g:47:53: ':' type
                    {
                    char_literal25=(Token)match(input,36,FOLLOW_36_in_method_decl359);  
                    stream_36.add(char_literal25);

                    pushFollow(FOLLOW_type_in_method_decl361);
                    type26=type();

                    state._fsp--;

                    stream_type.add(type26.getTree());

                    }
                    break;

            }

            char_literal27=(Token)match(input,41,FOLLOW_41_in_method_decl365);  
            stream_41.add(char_literal27);

            // Looc.g:47:68: ( var_decl )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Looc.g:47:69: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_method_decl368);
            	    var_decl28=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl28.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // Looc.g:47:80: ( instruction )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDF||LA10_0==41||LA10_0==45||LA10_0==49||LA10_0==52||(LA10_0>=55 && LA10_0<=57)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Looc.g:47:81: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_method_decl373);
            	    instruction29=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction29.getTree());

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

            char_literal30=(Token)match(input,42,FOLLOW_42_in_method_decl377);  
            stream_42.add(char_literal30);



            // AST REWRITE
            // elements: var_decl, IDF, instruction, method_args, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 47:99: -> ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ )
            {
                // Looc.g:47:102: ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODDEC, "METHODDEC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_method_args.nextTree());
                adaptor.addChild(root_1, stream_type.nextTree());
                // Looc.g:47:135: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_decl"

    public static class method_args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_args"
    // Looc.g:49:1: method_args : IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARG IDF type ( IDF type )* ) ;
    public final LoocParser.method_args_return method_args() throws RecognitionException {
        LoocParser.method_args_return retval = new LoocParser.method_args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token IDF35=null;
        Token char_literal36=null;
        LoocParser.type_return type33 = null;

        LoocParser.type_return type37 = null;


        CommonTree IDF31_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree IDF35_tree=null;
        CommonTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:49:12: ( IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARG IDF type ( IDF type )* ) )
            // Looc.g:49:16: IDF ':' type ( ',' IDF ':' type )*
            {
            IDF31=(Token)match(input,IDF,FOLLOW_IDF_in_method_args408);  
            stream_IDF.add(IDF31);

            char_literal32=(Token)match(input,36,FOLLOW_36_in_method_args410);  
            stream_36.add(char_literal32);

            pushFollow(FOLLOW_type_in_method_args412);
            type33=type();

            state._fsp--;

            stream_type.add(type33.getTree());
            // Looc.g:49:29: ( ',' IDF ':' type )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Looc.g:49:30: ',' IDF ':' type
            	    {
            	    char_literal34=(Token)match(input,43,FOLLOW_43_in_method_args415);  
            	    stream_43.add(char_literal34);

            	    IDF35=(Token)match(input,IDF,FOLLOW_IDF_in_method_args417);  
            	    stream_IDF.add(IDF35);

            	    char_literal36=(Token)match(input,36,FOLLOW_36_in_method_args419);  
            	    stream_36.add(char_literal36);

            	    pushFollow(FOLLOW_type_in_method_args421);
            	    type37=type();

            	    state._fsp--;

            	    stream_type.add(type37.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: IDF, type, IDF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:49: -> ^( METHODARG IDF type ( IDF type )* )
            {
                // Looc.g:49:52: ^( METHODARG IDF type ( IDF type )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODARG, "METHODARG"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());
                // Looc.g:49:73: ( IDF type )*
                while ( stream_IDF.hasNext()||stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDF.nextNode());
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_IDF.reset();
                stream_type.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_args"

    public static class instruction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // Looc.g:51:1: instruction : ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' -> ^( IF expression instruction ( instruction )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ( instruction )+ ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( GROUP ( var_decl )* ( instruction )+ ) | 'do' expression ';' | print | read | returnstate );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF38=null;
        Token string_literal39=null;
        Token char_literal41=null;
        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal49=null;
        Token IDF50=null;
        Token string_literal51=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token char_literal58=null;
        Token char_literal61=null;
        Token string_literal62=null;
        Token char_literal64=null;
        LoocParser.affectation_return affectation40 = null;

        LoocParser.expression_return expression43 = null;

        LoocParser.instruction_return instruction45 = null;

        LoocParser.instruction_return instruction47 = null;

        LoocParser.expression_return expression52 = null;

        LoocParser.expression_return expression54 = null;

        LoocParser.instruction_return instruction56 = null;

        LoocParser.var_decl_return var_decl59 = null;

        LoocParser.instruction_return instruction60 = null;

        LoocParser.expression_return expression63 = null;

        LoocParser.print_return print65 = null;

        LoocParser.read_return read66 = null;

        LoocParser.returnstate_return returnstate67 = null;


        CommonTree IDF38_tree=null;
        CommonTree string_literal39_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree IDF50_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree string_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal64_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_affectation=new RewriteRuleSubtreeStream(adaptor,"rule affectation");
        try {
            // Looc.g:51:12: ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' -> ^( IF expression instruction ( instruction )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ( instruction )+ ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( GROUP ( var_decl )* ( instruction )+ ) | 'do' expression ';' | print | read | returnstate )
            int alt16=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt16=1;
                }
                break;
            case 45:
                {
                alt16=2;
                }
                break;
            case 49:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            case 52:
                {
                alt16=5;
                }
                break;
            case 55:
                {
                alt16=6;
                }
                break;
            case 56:
                {
                alt16=7;
                }
                break;
            case 57:
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
                    // Looc.g:51:16: IDF ':=' affectation ';'
                    {
                    IDF38=(Token)match(input,IDF,FOLLOW_IDF_in_instruction449);  
                    stream_IDF.add(IDF38);

                    string_literal39=(Token)match(input,44,FOLLOW_44_in_instruction451);  
                    stream_44.add(string_literal39);

                    pushFollow(FOLLOW_affectation_in_instruction453);
                    affectation40=affectation();

                    state._fsp--;

                    stream_affectation.add(affectation40.getTree());
                    char_literal41=(Token)match(input,37,FOLLOW_37_in_instruction455);  
                    stream_37.add(char_literal41);



                    // AST REWRITE
                    // elements: IDF, affectation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 51:41: -> ^( AFFECT IDF affectation )
                    {
                        // Looc.g:51:44: ^( AFFECT IDF affectation )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AFFECT, "AFFECT"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_affectation.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:52:16: 'if' expression 'then' instruction ( 'else' instruction )? 'fi'
                    {
                    string_literal42=(Token)match(input,45,FOLLOW_45_in_instruction482);  
                    stream_45.add(string_literal42);

                    pushFollow(FOLLOW_expression_in_instruction484);
                    expression43=expression();

                    state._fsp--;

                    stream_expression.add(expression43.getTree());
                    string_literal44=(Token)match(input,46,FOLLOW_46_in_instruction486);  
                    stream_46.add(string_literal44);

                    pushFollow(FOLLOW_instruction_in_instruction488);
                    instruction45=instruction();

                    state._fsp--;

                    stream_instruction.add(instruction45.getTree());
                    // Looc.g:52:51: ( 'else' instruction )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==47) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Looc.g:52:52: 'else' instruction
                            {
                            string_literal46=(Token)match(input,47,FOLLOW_47_in_instruction491);  
                            stream_47.add(string_literal46);

                            pushFollow(FOLLOW_instruction_in_instruction493);
                            instruction47=instruction();

                            state._fsp--;

                            stream_instruction.add(instruction47.getTree());

                            }
                            break;

                    }

                    string_literal48=(Token)match(input,48,FOLLOW_48_in_instruction497);  
                    stream_48.add(string_literal48);



                    // AST REWRITE
                    // elements: instruction, instruction, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 52:78: -> ^( IF expression instruction ( instruction )? )
                    {
                        // Looc.g:52:81: ^( IF expression instruction ( instruction )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_instruction.nextTree());
                        // Looc.g:52:109: ( instruction )?
                        if ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_1, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:53:16: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    string_literal49=(Token)match(input,49,FOLLOW_49_in_instruction529);  
                    stream_49.add(string_literal49);

                    IDF50=(Token)match(input,IDF,FOLLOW_IDF_in_instruction531);  
                    stream_IDF.add(IDF50);

                    string_literal51=(Token)match(input,50,FOLLOW_50_in_instruction533);  
                    stream_50.add(string_literal51);

                    pushFollow(FOLLOW_expression_in_instruction535);
                    expression52=expression();

                    state._fsp--;

                    stream_expression.add(expression52.getTree());
                    string_literal53=(Token)match(input,51,FOLLOW_51_in_instruction537);  
                    stream_51.add(string_literal53);

                    pushFollow(FOLLOW_expression_in_instruction539);
                    expression54=expression();

                    state._fsp--;

                    stream_expression.add(expression54.getTree());
                    string_literal55=(Token)match(input,52,FOLLOW_52_in_instruction541);  
                    stream_52.add(string_literal55);

                    // Looc.g:53:63: ( instruction )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IDF||LA13_0==41||LA13_0==45||LA13_0==49||LA13_0==52||(LA13_0>=55 && LA13_0<=57)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Looc.g:53:64: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction544);
                    	    instruction56=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction56.getTree());

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

                    string_literal57=(Token)match(input,53,FOLLOW_53_in_instruction548);  
                    stream_53.add(string_literal57);



                    // AST REWRITE
                    // elements: IDF, instruction, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 53:84: -> ^( FOR IDF expression expression ( instruction )+ )
                    {
                        // Looc.g:53:87: ^( FOR IDF expression expression ( instruction )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_1, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Looc.g:54:16: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    char_literal58=(Token)match(input,41,FOLLOW_41_in_instruction582);  
                    stream_41.add(char_literal58);

                    // Looc.g:54:20: ( var_decl )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==35) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Looc.g:54:21: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction585);
                    	    var_decl59=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl59.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // Looc.g:54:32: ( instruction )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==41||LA15_0==45||LA15_0==49||LA15_0==52||(LA15_0>=55 && LA15_0<=57)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Looc.g:54:33: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction590);
                    	    instruction60=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction60.getTree());

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

                    char_literal61=(Token)match(input,42,FOLLOW_42_in_instruction594);  
                    stream_42.add(char_literal61);



                    // AST REWRITE
                    // elements: instruction, var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 54:51: -> ^( GROUP ( var_decl )* ( instruction )+ )
                    {
                        // Looc.g:54:54: ^( GROUP ( var_decl )* ( instruction )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUP, "GROUP"), root_1);

                        // Looc.g:54:62: ( var_decl )*
                        while ( stream_var_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_var_decl.nextTree());

                        }
                        stream_var_decl.reset();
                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_1, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Looc.g:55:16: 'do' expression ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal62=(Token)match(input,52,FOLLOW_52_in_instruction627); 
                    string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
                    adaptor.addChild(root_0, string_literal62_tree);

                    pushFollow(FOLLOW_expression_in_instruction629);
                    expression63=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression63.getTree());
                    char_literal64=(Token)match(input,37,FOLLOW_37_in_instruction631); 
                    char_literal64_tree = (CommonTree)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);


                    }
                    break;
                case 6 :
                    // Looc.g:56:16: print
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instruction648);
                    print65=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print65.getTree());

                    }
                    break;
                case 7 :
                    // Looc.g:57:16: read
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_read_in_instruction665);
                    read66=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read66.getTree());

                    }
                    break;
                case 8 :
                    // Looc.g:58:16: returnstate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_returnstate_in_instruction682);
                    returnstate67=returnstate();

                    state._fsp--;

                    adaptor.addChild(root_0, returnstate67.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction"

    public static class affectation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // Looc.g:61:1: affectation : ( expression | 'nil' );
    public final LoocParser.affectation_return affectation() throws RecognitionException {
        LoocParser.affectation_return retval = new LoocParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal69=null;
        LoocParser.expression_return expression68 = null;


        CommonTree string_literal69_tree=null;

        try {
            // Looc.g:61:12: ( expression | 'nil' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=IDF && LA17_0<=CSTE_CHAINE)||LA17_0==33||(LA17_0>=58 && LA17_0<=61)) ) {
                alt17=1;
            }
            else if ( (LA17_0==54) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // Looc.g:61:16: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_affectation703);
                    expression68=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression68.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:62:16: 'nil'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal69=(Token)match(input,54,FOLLOW_54_in_affectation720); 
                    string_literal69_tree = (CommonTree)adaptor.create(string_literal69);
                    adaptor.addChild(root_0, string_literal69_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "affectation"

    public static class print_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // Looc.g:65:1: print : 'write' expression ';' -> ^( WRITE expression ) ;
    public final LoocParser.print_return print() throws RecognitionException {
        LoocParser.print_return retval = new LoocParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal70=null;
        Token char_literal72=null;
        LoocParser.expression_return expression71 = null;


        CommonTree string_literal70_tree=null;
        CommonTree char_literal72_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:65:6: ( 'write' expression ';' -> ^( WRITE expression ) )
            // Looc.g:65:10: 'write' expression ';'
            {
            string_literal70=(Token)match(input,55,FOLLOW_55_in_print741);  
            stream_55.add(string_literal70);

            pushFollow(FOLLOW_expression_in_print743);
            expression71=expression();

            state._fsp--;

            stream_expression.add(expression71.getTree());
            char_literal72=(Token)match(input,37,FOLLOW_37_in_print745);  
            stream_37.add(char_literal72);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 65:33: -> ^( WRITE expression )
            {
                // Looc.g:65:36: ^( WRITE expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WRITE, "WRITE"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print"

    public static class read_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // Looc.g:67:1: read : 'read' IDF ';' -> ^( READ IDF ) ;
    public final LoocParser.read_return read() throws RecognitionException {
        LoocParser.read_return retval = new LoocParser.read_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal73=null;
        Token IDF74=null;
        Token char_literal75=null;

        CommonTree string_literal73_tree=null;
        CommonTree IDF74_tree=null;
        CommonTree char_literal75_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");

        try {
            // Looc.g:67:5: ( 'read' IDF ';' -> ^( READ IDF ) )
            // Looc.g:67:9: 'read' IDF ';'
            {
            string_literal73=(Token)match(input,56,FOLLOW_56_in_read762);  
            stream_56.add(string_literal73);

            IDF74=(Token)match(input,IDF,FOLLOW_IDF_in_read764);  
            stream_IDF.add(IDF74);

            char_literal75=(Token)match(input,37,FOLLOW_37_in_read766);  
            stream_37.add(char_literal75);



            // AST REWRITE
            // elements: IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:24: -> ^( READ IDF )
            {
                // Looc.g:67:27: ^( READ IDF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ, "READ"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "read"

    public static class returnstate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnstate"
    // Looc.g:69:1: returnstate : 'return' '(' expression ')' ';' -> ^( RETURN expression ) ;
    public final LoocParser.returnstate_return returnstate() throws RecognitionException {
        LoocParser.returnstate_return retval = new LoocParser.returnstate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal80=null;
        LoocParser.expression_return expression78 = null;


        CommonTree string_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal80_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:69:12: ( 'return' '(' expression ')' ';' -> ^( RETURN expression ) )
            // Looc.g:69:16: 'return' '(' expression ')' ';'
            {
            string_literal76=(Token)match(input,57,FOLLOW_57_in_returnstate783);  
            stream_57.add(string_literal76);

            char_literal77=(Token)match(input,33,FOLLOW_33_in_returnstate785);  
            stream_33.add(char_literal77);

            pushFollow(FOLLOW_expression_in_returnstate787);
            expression78=expression();

            state._fsp--;

            stream_expression.add(expression78.getTree());
            char_literal79=(Token)match(input,34,FOLLOW_34_in_returnstate789);  
            stream_34.add(char_literal79);

            char_literal80=(Token)match(input,37,FOLLOW_37_in_returnstate791);  
            stream_37.add(char_literal80);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:48: -> ^( RETURN expression )
            {
                // Looc.g:69:51: ^( RETURN expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnstate"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Looc.g:73:1: expression : ( IDF expression_bis -> ^( EXPR IDF expression_bis ) | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis -> ^( EXPR CSTE_ENT expression_bis ) | CSTE_CHAINE expression_bis -> ^( EXPR CSTE_CHAINE expression_bis ) | 'new' IDFC expression_bis -> ^( NEW IDFC expression_bis ) | '(' expression ')' expression_bis -> ^( EXPR expression expression_bis ) | '-' expression expression_bis -> ^( '-' expression expression_bis ) );
    public final LoocParser.expression_return expression() throws RecognitionException {
        LoocParser.expression_return retval = new LoocParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF81=null;
        Token string_literal83=null;
        Token string_literal85=null;
        Token CSTE_ENT87=null;
        Token CSTE_CHAINE89=null;
        Token string_literal91=null;
        Token IDFC92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        LoocParser.expression_bis_return expression_bis82 = null;

        LoocParser.expression_bis_return expression_bis84 = null;

        LoocParser.expression_bis_return expression_bis86 = null;

        LoocParser.expression_bis_return expression_bis88 = null;

        LoocParser.expression_bis_return expression_bis90 = null;

        LoocParser.expression_bis_return expression_bis93 = null;

        LoocParser.expression_return expression95 = null;

        LoocParser.expression_bis_return expression_bis97 = null;

        LoocParser.expression_return expression99 = null;

        LoocParser.expression_bis_return expression_bis100 = null;


        CommonTree IDF81_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree CSTE_ENT87_tree=null;
        CommonTree CSTE_CHAINE89_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree IDFC92_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_CSTE_CHAINE=new RewriteRuleTokenStream(adaptor,"token CSTE_CHAINE");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_CSTE_ENT=new RewriteRuleTokenStream(adaptor,"token CSTE_ENT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expression_bis=new RewriteRuleSubtreeStream(adaptor,"rule expression_bis");
        try {
            // Looc.g:73:11: ( IDF expression_bis -> ^( EXPR IDF expression_bis ) | 'this' expression_bis | 'super' expression_bis | CSTE_ENT expression_bis -> ^( EXPR CSTE_ENT expression_bis ) | CSTE_CHAINE expression_bis -> ^( EXPR CSTE_CHAINE expression_bis ) | 'new' IDFC expression_bis -> ^( NEW IDFC expression_bis ) | '(' expression ')' expression_bis -> ^( EXPR expression expression_bis ) | '-' expression expression_bis -> ^( '-' expression expression_bis ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt18=1;
                }
                break;
            case 58:
                {
                alt18=2;
                }
                break;
            case 59:
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
            case 60:
                {
                alt18=6;
                }
                break;
            case 33:
                {
                alt18=7;
                }
                break;
            case 61:
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
                    // Looc.g:73:15: IDF expression_bis
                    {
                    IDF81=(Token)match(input,IDF,FOLLOW_IDF_in_expression811);  
                    stream_IDF.add(IDF81);

                    pushFollow(FOLLOW_expression_bis_in_expression813);
                    expression_bis82=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis82.getTree());


                    // AST REWRITE
                    // elements: IDF, expression_bis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:34: -> ^( EXPR IDF expression_bis )
                    {
                        // Looc.g:73:37: ^( EXPR IDF expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:74:15: 'this' expression_bis
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal83=(Token)match(input,58,FOLLOW_58_in_expression839); 
                    string_literal83_tree = (CommonTree)adaptor.create(string_literal83);
                    adaptor.addChild(root_0, string_literal83_tree);

                    pushFollow(FOLLOW_expression_bis_in_expression841);
                    expression_bis84=expression_bis();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_bis84.getTree());

                    }
                    break;
                case 3 :
                    // Looc.g:75:15: 'super' expression_bis
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal85=(Token)match(input,59,FOLLOW_59_in_expression857); 
                    string_literal85_tree = (CommonTree)adaptor.create(string_literal85);
                    adaptor.addChild(root_0, string_literal85_tree);

                    pushFollow(FOLLOW_expression_bis_in_expression859);
                    expression_bis86=expression_bis();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_bis86.getTree());

                    }
                    break;
                case 4 :
                    // Looc.g:76:15: CSTE_ENT expression_bis
                    {
                    CSTE_ENT87=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression875);  
                    stream_CSTE_ENT.add(CSTE_ENT87);

                    pushFollow(FOLLOW_expression_bis_in_expression877);
                    expression_bis88=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis88.getTree());


                    // AST REWRITE
                    // elements: CSTE_ENT, expression_bis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 76:39: -> ^( EXPR CSTE_ENT expression_bis )
                    {
                        // Looc.g:76:42: ^( EXPR CSTE_ENT expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_CSTE_ENT.nextNode());
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Looc.g:77:15: CSTE_CHAINE expression_bis
                    {
                    CSTE_CHAINE89=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_expression903);  
                    stream_CSTE_CHAINE.add(CSTE_CHAINE89);

                    pushFollow(FOLLOW_expression_bis_in_expression905);
                    expression_bis90=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis90.getTree());


                    // AST REWRITE
                    // elements: CSTE_CHAINE, expression_bis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:42: -> ^( EXPR CSTE_CHAINE expression_bis )
                    {
                        // Looc.g:77:45: ^( EXPR CSTE_CHAINE expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_CSTE_CHAINE.nextNode());
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Looc.g:78:15: 'new' IDFC expression_bis
                    {
                    string_literal91=(Token)match(input,60,FOLLOW_60_in_expression931);  
                    stream_60.add(string_literal91);

                    IDFC92=(Token)match(input,IDFC,FOLLOW_IDFC_in_expression933);  
                    stream_IDFC.add(IDFC92);

                    pushFollow(FOLLOW_expression_bis_in_expression935);
                    expression_bis93=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis93.getTree());


                    // AST REWRITE
                    // elements: expression_bis, IDFC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 78:41: -> ^( NEW IDFC expression_bis )
                    {
                        // Looc.g:78:44: ^( NEW IDFC expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_IDFC.nextNode());
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // Looc.g:79:15: '(' expression ')' expression_bis
                    {
                    char_literal94=(Token)match(input,33,FOLLOW_33_in_expression961);  
                    stream_33.add(char_literal94);

                    pushFollow(FOLLOW_expression_in_expression963);
                    expression95=expression();

                    state._fsp--;

                    stream_expression.add(expression95.getTree());
                    char_literal96=(Token)match(input,34,FOLLOW_34_in_expression965);  
                    stream_34.add(char_literal96);

                    pushFollow(FOLLOW_expression_bis_in_expression967);
                    expression_bis97=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis97.getTree());


                    // AST REWRITE
                    // elements: expression, expression_bis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 79:49: -> ^( EXPR expression expression_bis )
                    {
                        // Looc.g:79:52: ^( EXPR expression expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // Looc.g:80:15: '-' expression expression_bis
                    {
                    char_literal98=(Token)match(input,61,FOLLOW_61_in_expression993);  
                    stream_61.add(char_literal98);

                    pushFollow(FOLLOW_expression_in_expression995);
                    expression99=expression();

                    state._fsp--;

                    stream_expression.add(expression99.getTree());
                    pushFollow(FOLLOW_expression_bis_in_expression997);
                    expression_bis100=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis100.getTree());


                    // AST REWRITE
                    // elements: expression, 61, expression_bis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:45: -> ^( '-' expression expression_bis )
                    {
                        // Looc.g:80:48: ^( '-' expression expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_61.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expression_bis_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_bis"
    // Looc.g:83:1: expression_bis : ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expression_bis -> ^( METHODCALLING IDF ( expression )* expression_bis ) | oper expression expression_bis -> ^( oper expression expression_bis ) | );
    public final LoocParser.expression_bis_return expression_bis() throws RecognitionException {
        LoocParser.expression_bis_return retval = new LoocParser.expression_bis_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal101=null;
        Token IDF102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        LoocParser.expression_return expression104 = null;

        LoocParser.expression_return expression106 = null;

        LoocParser.expression_bis_return expression_bis108 = null;

        LoocParser.oper_return oper109 = null;

        LoocParser.expression_return expression110 = null;

        LoocParser.expression_bis_return expression_bis111 = null;


        CommonTree char_literal101_tree=null;
        CommonTree IDF102_tree=null;
        CommonTree char_literal103_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expression_bis=new RewriteRuleSubtreeStream(adaptor,"rule expression_bis");
        RewriteRuleSubtreeStream stream_oper=new RewriteRuleSubtreeStream(adaptor,"rule oper");
        try {
            // Looc.g:83:15: ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expression_bis -> ^( METHODCALLING IDF ( expression )* expression_bis ) | oper expression expression_bis -> ^( oper expression expression_bis ) | )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt21=1;
                }
                break;
            case 61:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt21=2;
                }
                break;
            case 34:
            case 37:
            case 43:
            case 46:
            case 51:
            case 52:
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
                    // Looc.g:83:19: '.' IDF '(' ( expression )? ( ',' expression )* ')' expression_bis
                    {
                    char_literal101=(Token)match(input,62,FOLLOW_62_in_expression_bis1027);  
                    stream_62.add(char_literal101);

                    IDF102=(Token)match(input,IDF,FOLLOW_IDF_in_expression_bis1029);  
                    stream_IDF.add(IDF102);

                    char_literal103=(Token)match(input,33,FOLLOW_33_in_expression_bis1031);  
                    stream_33.add(char_literal103);

                    // Looc.g:83:31: ( expression )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=IDF && LA19_0<=CSTE_CHAINE)||LA19_0==33||(LA19_0>=58 && LA19_0<=61)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Looc.g:83:32: expression
                            {
                            pushFollow(FOLLOW_expression_in_expression_bis1034);
                            expression104=expression();

                            state._fsp--;

                            stream_expression.add(expression104.getTree());

                            }
                            break;

                    }

                    // Looc.g:83:45: ( ',' expression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==43) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Looc.g:83:46: ',' expression
                    	    {
                    	    char_literal105=(Token)match(input,43,FOLLOW_43_in_expression_bis1039);  
                    	    stream_43.add(char_literal105);

                    	    pushFollow(FOLLOW_expression_in_expression_bis1041);
                    	    expression106=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    char_literal107=(Token)match(input,34,FOLLOW_34_in_expression_bis1045);  
                    stream_34.add(char_literal107);

                    pushFollow(FOLLOW_expression_bis_in_expression_bis1047);
                    expression_bis108=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis108.getTree());


                    // AST REWRITE
                    // elements: expression_bis, IDF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:82: -> ^( METHODCALLING IDF ( expression )* expression_bis )
                    {
                        // Looc.g:83:85: ^( METHODCALLING IDF ( expression )* expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODCALLING, "METHODCALLING"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Looc.g:83:123: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:84:19: oper expression expression_bis
                    {
                    pushFollow(FOLLOW_oper_in_expression_bis1084);
                    oper109=oper();

                    state._fsp--;

                    stream_oper.add(oper109.getTree());
                    pushFollow(FOLLOW_expression_in_expression_bis1086);
                    expression110=expression();

                    state._fsp--;

                    stream_expression.add(expression110.getTree());
                    pushFollow(FOLLOW_expression_bis_in_expression_bis1088);
                    expression_bis111=expression_bis();

                    state._fsp--;

                    stream_expression_bis.add(expression_bis111.getTree());


                    // AST REWRITE
                    // elements: oper, expression, expression_bis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:50: -> ^( oper expression expression_bis )
                    {
                        // Looc.g:84:53: ^( oper expression expression_bis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_oper.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression_bis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:86:15: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression_bis"

    public static class oper_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // Looc.g:88:1: oper : ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' );
    public final LoocParser.oper_return oper() throws RecognitionException {
        LoocParser.oper_return retval = new LoocParser.oper_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set112=null;

        CommonTree set112_tree=null;

        try {
            // Looc.g:88:5: ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' )
            // Looc.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set112=(Token)input.LT(1);
            if ( input.LA(1)==61||(input.LA(1)>=63 && input.LA(1)<=70) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set112));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oper"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_decl_in_program155 = new BitSet(new long[]{0x0392220840200000L});
    public static final BitSet FOLLOW_var_decl_in_program160 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_instruction_in_program165 = new BitSet(new long[]{0x0392220800200002L});
    public static final BitSet FOLLOW_30_in_class_decl197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl199 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_class_decl202 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl204 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_class_decl208 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_class_decl210 = new BitSet(new long[]{0x0000010C00000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl212 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_class_decl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl236 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl241 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_35_in_var_decl268 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDF_in_var_decl270 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_var_decl272 = new BitSet(new long[]{0x000000C000100000L});
    public static final BitSet FOLLOW_type_in_var_decl274 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_var_decl276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_method_decl345 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDF_in_method_decl347 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_method_decl349 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_method_args_in_method_decl352 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_34_in_method_decl356 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_36_in_method_decl359 = new BitSet(new long[]{0x000000C000100000L});
    public static final BitSet FOLLOW_type_in_method_decl361 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_method_decl365 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_var_decl_in_method_decl368 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_instruction_in_method_decl373 = new BitSet(new long[]{0x0392260800200000L});
    public static final BitSet FOLLOW_42_in_method_decl377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args408 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_method_args410 = new BitSet(new long[]{0x000000C000100000L});
    public static final BitSet FOLLOW_type_in_method_args412 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_method_args415 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDF_in_method_args417 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_method_args419 = new BitSet(new long[]{0x000000C000100000L});
    public static final BitSet FOLLOW_type_in_method_args421 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_IDF_in_instruction449 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_instruction451 = new BitSet(new long[]{0x3C40000200E00000L});
    public static final BitSet FOLLOW_affectation_in_instruction453 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instruction455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_instruction482 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_instruction484 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_instruction486 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_instruction_in_instruction488 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_instruction491 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_instruction_in_instruction493 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_instruction497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_instruction529 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDF_in_instruction531 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instruction533 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_instruction535 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_instruction537 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_instruction539 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_instruction541 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_instruction_in_instruction544 = new BitSet(new long[]{0x03B2220800200000L});
    public static final BitSet FOLLOW_53_in_instruction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_instruction582 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_var_decl_in_instruction585 = new BitSet(new long[]{0x0392220800200000L});
    public static final BitSet FOLLOW_instruction_in_instruction590 = new BitSet(new long[]{0x0392260800200000L});
    public static final BitSet FOLLOW_42_in_instruction594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_instruction627 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_instruction629 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_instruction631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstate_in_instruction682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_affectation703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_affectation720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_print741 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_print743 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_print745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_read762 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDF_in_read764 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_read766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_returnstate783 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_returnstate785 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_returnstate787 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_returnstate789 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_returnstate791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expression811 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expression839 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expression857 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression875 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_expression903 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_expression931 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IDFC_in_expression933 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_expression961 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_expression963 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_expression965 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_expression993 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_expression995 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_expression_bis1027 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDF_in_expression_bis1029 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_expression_bis1031 = new BitSet(new long[]{0x3C00080600E00000L});
    public static final BitSet FOLLOW_expression_in_expression_bis1034 = new BitSet(new long[]{0x0000080400000000L});
    public static final BitSet FOLLOW_43_in_expression_bis1039 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_expression_bis1041 = new BitSet(new long[]{0x0000080400000000L});
    public static final BitSet FOLLOW_34_in_expression_bis1045 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expression_bis1084 = new BitSet(new long[]{0x3C00000200E00000L});
    public static final BitSet FOLLOW_expression_in_expression_bis1086 = new BitSet(new long[]{0xE000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_expression_bis_in_expression_bis1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_oper0 = new BitSet(new long[]{0x0000000000000002L});

}