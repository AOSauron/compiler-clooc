// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-01-26 14:01:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "CLASS", "ITEMDEC", "VARDEC", "METHODDEC", "METHODARG", "AFFECT", "IF", "FOR", "GROUP", "WRITE", "READ", "RETURN", "EXPR", "NEW", "METHODCALLING", "THIS", "SUPER", "NEG", "VIDE", "INT", "STRING", "IDFC", "IDF", "CSTE_ENT", "CSTE_CHAINE", "ESC_SEQ", "WS", "COMMENT", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'-'", "'.'", "'+'", "'*'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
    };
    public static final int EOF=-1;
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
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
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
    public static final int THIS=20;
    public static final int SUPER=21;
    public static final int NEG=22;
    public static final int VIDE=23;
    public static final int INT=24;
    public static final int STRING=25;
    public static final int IDFC=26;
    public static final int IDF=27;
    public static final int CSTE_ENT=28;
    public static final int CSTE_CHAINE=29;
    public static final int ESC_SEQ=30;
    public static final int WS=31;
    public static final int COMMENT=32;
    public static final int UNICODE_ESC=33;
    public static final int OCTAL_ESC=34;
    public static final int HEX_DIGIT=35;

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
    // Looc.g:40:1: program : ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ ) ;
    public final LoocParser.program_return program() throws RecognitionException {
        LoocParser.program_return retval = new LoocParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.class_decl_return class_decl1 = null;

        LoocParser.var_decl_return var_decl2 = null;

        LoocParser.instruction_return instruction3 = null;


        RewriteRuleSubtreeStream stream_class_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_decl");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:40:8: ( ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ ) )
            // Looc.g:40:12: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // Looc.g:40:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:40:13: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program192);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Looc.g:40:26: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==41) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:40:27: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_program197);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Looc.g:40:38: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==47||LA3_0==51||LA3_0==55||LA3_0==58||(LA3_0>=61 && LA3_0<=63)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:40:39: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_program202);
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
            // elements: var_decl, instruction, class_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 40:53: -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ )
            {
                // Looc.g:40:56: ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // Looc.g:40:66: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // Looc.g:40:80: ( var_decl )*
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
    // Looc.g:42:1: class_decl : 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC ( IDFC )? class_item_decl ) ;
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
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try {
            // Looc.g:42:11: ( 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC ( IDFC )? class_item_decl ) )
            // Looc.g:42:15: 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')'
            {
            string_literal4=(Token)match(input,36,FOLLOW_36_in_class_decl234);  
            stream_36.add(string_literal4);

            IDFC5=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl236);  
            stream_IDFC.add(IDFC5);

            // Looc.g:42:28: ( 'inherit' IDFC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Looc.g:42:29: 'inherit' IDFC
                    {
                    string_literal6=(Token)match(input,37,FOLLOW_37_in_class_decl239);  
                    stream_37.add(string_literal6);

                    IDFC7=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl241);  
                    stream_IDFC.add(IDFC7);


                    }
                    break;

            }

            char_literal8=(Token)match(input,38,FOLLOW_38_in_class_decl245);  
            stream_38.add(char_literal8);

            char_literal9=(Token)match(input,39,FOLLOW_39_in_class_decl247);  
            stream_39.add(char_literal9);

            pushFollow(FOLLOW_class_item_decl_in_class_decl249);
            class_item_decl10=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl10.getTree());
            char_literal11=(Token)match(input,40,FOLLOW_40_in_class_decl251);  
            stream_40.add(char_literal11);



            // AST REWRITE
            // elements: class_item_decl, IDFC, IDFC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 42:74: -> ^( CLASS IDFC ( IDFC )? class_item_decl )
            {
                // Looc.g:42:77: ^( CLASS IDFC ( IDFC )? class_item_decl )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS, "CLASS"), root_1);

                adaptor.addChild(root_1, stream_IDFC.nextNode());
                // Looc.g:42:90: ( IDFC )?
                if ( stream_IDFC.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDFC.nextNode());

                }
                stream_IDFC.reset();
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
    // Looc.g:44:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( ITEMDEC ( var_decl )* ( method_decl )* ) ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;


        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        try {
            // Looc.g:44:16: ( ( var_decl )* ( method_decl )* -> ^( ITEMDEC ( var_decl )* ( method_decl )* ) )
            // Looc.g:44:20: ( var_decl )* ( method_decl )*
            {
            // Looc.g:44:20: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==41) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:44:21: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl276);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Looc.g:44:32: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==46) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:44:33: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl281);
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
            // elements: method_decl, var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 44:47: -> ^( ITEMDEC ( var_decl )* ( method_decl )* )
            {
                // Looc.g:44:50: ^( ITEMDEC ( var_decl )* ( method_decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEMDEC, "ITEMDEC"), root_1);

                // Looc.g:44:60: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                // Looc.g:44:72: ( method_decl )*
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
    // Looc.g:46:1: var_decl : 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) ;
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
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:46:9: ( 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) )
            // Looc.g:46:13: 'var' IDF ':' type ';'
            {
            string_literal14=(Token)match(input,41,FOLLOW_41_in_var_decl308);  
            stream_41.add(string_literal14);

            IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl310);  
            stream_IDF.add(IDF15);

            char_literal16=(Token)match(input,42,FOLLOW_42_in_var_decl312);  
            stream_42.add(char_literal16);

            pushFollow(FOLLOW_type_in_var_decl314);
            type17=type();

            state._fsp--;

            stream_type.add(type17.getTree());
            char_literal18=(Token)match(input,43,FOLLOW_43_in_var_decl316);  
            stream_43.add(char_literal18);



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
            // 46:36: -> ^( VARDEC IDF type )
            {
                // Looc.g:46:39: ^( VARDEC IDF type )
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
    // Looc.g:48:1: type : ( IDFC -> ^( IDFC ) | 'int' -> ^( INT ) | 'string' -> ^( STRING ) );
    public final LoocParser.type_return type() throws RecognitionException {
        LoocParser.type_return retval = new LoocParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDFC19=null;
        Token string_literal20=null;
        Token string_literal21=null;

        CommonTree IDFC19_tree=null;
        CommonTree string_literal20_tree=null;
        CommonTree string_literal21_tree=null;
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

        try {
            // Looc.g:48:5: ( IDFC -> ^( IDFC ) | 'int' -> ^( INT ) | 'string' -> ^( STRING ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case IDFC:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 45:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // Looc.g:48:9: IDFC
                    {
                    IDFC19=(Token)match(input,IDFC,FOLLOW_IDFC_in_type335);  
                    stream_IDFC.add(IDFC19);



                    // AST REWRITE
                    // elements: IDFC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 48:14: -> ^( IDFC )
                    {
                        // Looc.g:48:17: ^( IDFC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IDFC.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:49:9: 'int'
                    {
                    string_literal20=(Token)match(input,44,FOLLOW_44_in_type351);  
                    stream_44.add(string_literal20);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 49:15: -> ^( INT )
                    {
                        // Looc.g:49:18: ^( INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INT, "INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:50:9: 'string'
                    {
                    string_literal21=(Token)match(input,45,FOLLOW_45_in_type367);  
                    stream_45.add(string_literal21);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 50:18: -> ^( STRING )
                    {
                        // Looc.g:50:21: ^( STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, "STRING"), root_1);

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
    // $ANTLR end "type"

    public static class method_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // Looc.g:53:1: method_decl : 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ ) ;
    public final LoocParser.method_decl_return method_decl() throws RecognitionException {
        LoocParser.method_decl_return retval = new LoocParser.method_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal22=null;
        Token IDF23=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal32=null;
        LoocParser.method_args_return method_args25 = null;

        LoocParser.type_return type28 = null;

        LoocParser.var_decl_return var_decl30 = null;

        LoocParser.instruction_return instruction31 = null;


        CommonTree string_literal22_tree=null;
        CommonTree IDF23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_method_args=new RewriteRuleSubtreeStream(adaptor,"rule method_args");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:53:12: ( 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ ) )
            // Looc.g:53:16: 'method' IDF '(' ( method_args )* ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}'
            {
            string_literal22=(Token)match(input,46,FOLLOW_46_in_method_decl387);  
            stream_46.add(string_literal22);

            IDF23=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl389);  
            stream_IDF.add(IDF23);

            char_literal24=(Token)match(input,39,FOLLOW_39_in_method_decl391);  
            stream_39.add(char_literal24);

            // Looc.g:53:33: ( method_args )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDF) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Looc.g:53:34: method_args
            	    {
            	    pushFollow(FOLLOW_method_args_in_method_decl394);
            	    method_args25=method_args();

            	    state._fsp--;

            	    stream_method_args.add(method_args25.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal26=(Token)match(input,40,FOLLOW_40_in_method_decl398);  
            stream_40.add(char_literal26);

            // Looc.g:53:52: ( ':' type )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Looc.g:53:53: ':' type
                    {
                    char_literal27=(Token)match(input,42,FOLLOW_42_in_method_decl401);  
                    stream_42.add(char_literal27);

                    pushFollow(FOLLOW_type_in_method_decl403);
                    type28=type();

                    state._fsp--;

                    stream_type.add(type28.getTree());

                    }
                    break;

            }

            char_literal29=(Token)match(input,47,FOLLOW_47_in_method_decl407);  
            stream_47.add(char_literal29);

            // Looc.g:53:68: ( var_decl )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Looc.g:53:69: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_method_decl410);
            	    var_decl30=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl30.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // Looc.g:53:80: ( instruction )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDF||LA11_0==47||LA11_0==51||LA11_0==55||LA11_0==58||(LA11_0>=61 && LA11_0<=63)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Looc.g:53:81: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_method_decl415);
            	    instruction31=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction31.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            char_literal32=(Token)match(input,48,FOLLOW_48_in_method_decl419);  
            stream_48.add(char_literal32);



            // AST REWRITE
            // elements: var_decl, type, IDF, instruction, method_args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:99: -> ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ )
            {
                // Looc.g:53:102: ^( METHODDEC IDF method_args type ( var_decl )* ( instruction )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODDEC, "METHODDEC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_method_args.nextTree());
                adaptor.addChild(root_1, stream_type.nextTree());
                // Looc.g:53:135: ( var_decl )*
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
    // Looc.g:55:1: method_args : IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARG IDF type ( IDF type )* ) ;
    public final LoocParser.method_args_return method_args() throws RecognitionException {
        LoocParser.method_args_return retval = new LoocParser.method_args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token IDF37=null;
        Token char_literal38=null;
        LoocParser.type_return type35 = null;

        LoocParser.type_return type39 = null;


        CommonTree IDF33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree IDF37_tree=null;
        CommonTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:55:12: ( IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARG IDF type ( IDF type )* ) )
            // Looc.g:55:16: IDF ':' type ( ',' IDF ':' type )*
            {
            IDF33=(Token)match(input,IDF,FOLLOW_IDF_in_method_args450);  
            stream_IDF.add(IDF33);

            char_literal34=(Token)match(input,42,FOLLOW_42_in_method_args452);  
            stream_42.add(char_literal34);

            pushFollow(FOLLOW_type_in_method_args454);
            type35=type();

            state._fsp--;

            stream_type.add(type35.getTree());
            // Looc.g:55:29: ( ',' IDF ':' type )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==49) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Looc.g:55:30: ',' IDF ':' type
            	    {
            	    char_literal36=(Token)match(input,49,FOLLOW_49_in_method_args457);  
            	    stream_49.add(char_literal36);

            	    IDF37=(Token)match(input,IDF,FOLLOW_IDF_in_method_args459);  
            	    stream_IDF.add(IDF37);

            	    char_literal38=(Token)match(input,42,FOLLOW_42_in_method_args461);  
            	    stream_42.add(char_literal38);

            	    pushFollow(FOLLOW_type_in_method_args463);
            	    type39=type();

            	    state._fsp--;

            	    stream_type.add(type39.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: IDF, IDF, type, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 55:49: -> ^( METHODARG IDF type ( IDF type )* )
            {
                // Looc.g:55:52: ^( METHODARG IDF type ( IDF type )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODARG, "METHODARG"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());
                // Looc.g:55:73: ( IDF type )*
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
    // Looc.g:57:1: instruction : ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' -> ^( IF expression instruction ( instruction )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ( instruction )+ ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( GROUP ( var_decl )* ( instruction )+ ) | 'do' expression ';' | print | read | returnstate );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF40=null;
        Token string_literal41=null;
        Token char_literal43=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token IDF52=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token string_literal59=null;
        Token char_literal60=null;
        Token char_literal63=null;
        Token string_literal64=null;
        Token char_literal66=null;
        LoocParser.affectation_return affectation42 = null;

        LoocParser.expression_return expression45 = null;

        LoocParser.instruction_return instruction47 = null;

        LoocParser.instruction_return instruction49 = null;

        LoocParser.expression_return expression54 = null;

        LoocParser.expression_return expression56 = null;

        LoocParser.instruction_return instruction58 = null;

        LoocParser.var_decl_return var_decl61 = null;

        LoocParser.instruction_return instruction62 = null;

        LoocParser.expression_return expression65 = null;

        LoocParser.print_return print67 = null;

        LoocParser.read_return read68 = null;

        LoocParser.returnstate_return returnstate69 = null;


        CommonTree IDF40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree IDF52_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree string_literal57_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_affectation=new RewriteRuleSubtreeStream(adaptor,"rule affectation");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:57:12: ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' instruction ( 'else' instruction )? 'fi' -> ^( IF expression instruction ( instruction )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ( instruction )+ ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( GROUP ( var_decl )* ( instruction )+ ) | 'do' expression ';' | print | read | returnstate )
            int alt17=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt17=1;
                }
                break;
            case 51:
                {
                alt17=2;
                }
                break;
            case 55:
                {
                alt17=3;
                }
                break;
            case 47:
                {
                alt17=4;
                }
                break;
            case 58:
                {
                alt17=5;
                }
                break;
            case 61:
                {
                alt17=6;
                }
                break;
            case 62:
                {
                alt17=7;
                }
                break;
            case 63:
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
                    // Looc.g:57:16: IDF ':=' affectation ';'
                    {
                    IDF40=(Token)match(input,IDF,FOLLOW_IDF_in_instruction491);  
                    stream_IDF.add(IDF40);

                    string_literal41=(Token)match(input,50,FOLLOW_50_in_instruction493);  
                    stream_50.add(string_literal41);

                    pushFollow(FOLLOW_affectation_in_instruction495);
                    affectation42=affectation();

                    state._fsp--;

                    stream_affectation.add(affectation42.getTree());
                    char_literal43=(Token)match(input,43,FOLLOW_43_in_instruction497);  
                    stream_43.add(char_literal43);



                    // AST REWRITE
                    // elements: affectation, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 57:41: -> ^( AFFECT IDF affectation )
                    {
                        // Looc.g:57:44: ^( AFFECT IDF affectation )
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
                    // Looc.g:58:16: 'if' expression 'then' instruction ( 'else' instruction )? 'fi'
                    {
                    string_literal44=(Token)match(input,51,FOLLOW_51_in_instruction524);  
                    stream_51.add(string_literal44);

                    pushFollow(FOLLOW_expression_in_instruction526);
                    expression45=expression();

                    state._fsp--;

                    stream_expression.add(expression45.getTree());
                    string_literal46=(Token)match(input,52,FOLLOW_52_in_instruction528);  
                    stream_52.add(string_literal46);

                    pushFollow(FOLLOW_instruction_in_instruction530);
                    instruction47=instruction();

                    state._fsp--;

                    stream_instruction.add(instruction47.getTree());
                    // Looc.g:58:51: ( 'else' instruction )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==53) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Looc.g:58:52: 'else' instruction
                            {
                            string_literal48=(Token)match(input,53,FOLLOW_53_in_instruction533);  
                            stream_53.add(string_literal48);

                            pushFollow(FOLLOW_instruction_in_instruction535);
                            instruction49=instruction();

                            state._fsp--;

                            stream_instruction.add(instruction49.getTree());

                            }
                            break;

                    }

                    string_literal50=(Token)match(input,54,FOLLOW_54_in_instruction539);  
                    stream_54.add(string_literal50);



                    // AST REWRITE
                    // elements: instruction, expression, instruction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 58:78: -> ^( IF expression instruction ( instruction )? )
                    {
                        // Looc.g:58:81: ^( IF expression instruction ( instruction )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_instruction.nextTree());
                        // Looc.g:58:109: ( instruction )?
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
                    // Looc.g:59:16: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    string_literal51=(Token)match(input,55,FOLLOW_55_in_instruction571);  
                    stream_55.add(string_literal51);

                    IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_instruction573);  
                    stream_IDF.add(IDF52);

                    string_literal53=(Token)match(input,56,FOLLOW_56_in_instruction575);  
                    stream_56.add(string_literal53);

                    pushFollow(FOLLOW_expression_in_instruction577);
                    expression54=expression();

                    state._fsp--;

                    stream_expression.add(expression54.getTree());
                    string_literal55=(Token)match(input,57,FOLLOW_57_in_instruction579);  
                    stream_57.add(string_literal55);

                    pushFollow(FOLLOW_expression_in_instruction581);
                    expression56=expression();

                    state._fsp--;

                    stream_expression.add(expression56.getTree());
                    string_literal57=(Token)match(input,58,FOLLOW_58_in_instruction583);  
                    stream_58.add(string_literal57);

                    // Looc.g:59:63: ( instruction )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==IDF||LA14_0==47||LA14_0==51||LA14_0==55||LA14_0==58||(LA14_0>=61 && LA14_0<=63)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Looc.g:59:64: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction586);
                    	    instruction58=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction58.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    string_literal59=(Token)match(input,59,FOLLOW_59_in_instruction590);  
                    stream_59.add(string_literal59);



                    // AST REWRITE
                    // elements: instruction, IDF, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 59:84: -> ^( FOR IDF expression expression ( instruction )+ )
                    {
                        // Looc.g:59:87: ^( FOR IDF expression expression ( instruction )+ )
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
                    // Looc.g:60:16: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    char_literal60=(Token)match(input,47,FOLLOW_47_in_instruction624);  
                    stream_47.add(char_literal60);

                    // Looc.g:60:20: ( var_decl )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==41) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Looc.g:60:21: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction627);
                    	    var_decl61=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // Looc.g:60:32: ( instruction )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==IDF||LA16_0==47||LA16_0==51||LA16_0==55||LA16_0==58||(LA16_0>=61 && LA16_0<=63)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Looc.g:60:33: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction632);
                    	    instruction62=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    char_literal63=(Token)match(input,48,FOLLOW_48_in_instruction636);  
                    stream_48.add(char_literal63);



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
                    // 60:51: -> ^( GROUP ( var_decl )* ( instruction )+ )
                    {
                        // Looc.g:60:54: ^( GROUP ( var_decl )* ( instruction )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUP, "GROUP"), root_1);

                        // Looc.g:60:62: ( var_decl )*
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
                    // Looc.g:61:16: 'do' expression ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal64=(Token)match(input,58,FOLLOW_58_in_instruction669); 
                    string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
                    adaptor.addChild(root_0, string_literal64_tree);

                    pushFollow(FOLLOW_expression_in_instruction671);
                    expression65=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression65.getTree());
                    char_literal66=(Token)match(input,43,FOLLOW_43_in_instruction673); 
                    char_literal66_tree = (CommonTree)adaptor.create(char_literal66);
                    adaptor.addChild(root_0, char_literal66_tree);


                    }
                    break;
                case 6 :
                    // Looc.g:62:16: print
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instruction690);
                    print67=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print67.getTree());

                    }
                    break;
                case 7 :
                    // Looc.g:63:16: read
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_read_in_instruction707);
                    read68=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read68.getTree());

                    }
                    break;
                case 8 :
                    // Looc.g:64:16: returnstate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_returnstate_in_instruction724);
                    returnstate69=returnstate();

                    state._fsp--;

                    adaptor.addChild(root_0, returnstate69.getTree());

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
    // Looc.g:67:1: affectation : ( expression | 'nil' );
    public final LoocParser.affectation_return affectation() throws RecognitionException {
        LoocParser.affectation_return retval = new LoocParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal71=null;
        LoocParser.expression_return expression70 = null;


        CommonTree string_literal71_tree=null;

        try {
            // Looc.g:67:12: ( expression | 'nil' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=IDF && LA18_0<=CSTE_CHAINE)||LA18_0==39||(LA18_0>=64 && LA18_0<=67)) ) {
                alt18=1;
            }
            else if ( (LA18_0==60) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Looc.g:67:16: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_affectation745);
                    expression70=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression70.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:68:16: 'nil'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal71=(Token)match(input,60,FOLLOW_60_in_affectation762); 
                    string_literal71_tree = (CommonTree)adaptor.create(string_literal71);
                    adaptor.addChild(root_0, string_literal71_tree);


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
    // Looc.g:71:1: print : 'write' expression ';' -> ^( WRITE expression ) ;
    public final LoocParser.print_return print() throws RecognitionException {
        LoocParser.print_return retval = new LoocParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal72=null;
        Token char_literal74=null;
        LoocParser.expression_return expression73 = null;


        CommonTree string_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:71:6: ( 'write' expression ';' -> ^( WRITE expression ) )
            // Looc.g:71:10: 'write' expression ';'
            {
            string_literal72=(Token)match(input,61,FOLLOW_61_in_print783);  
            stream_61.add(string_literal72);

            pushFollow(FOLLOW_expression_in_print785);
            expression73=expression();

            state._fsp--;

            stream_expression.add(expression73.getTree());
            char_literal74=(Token)match(input,43,FOLLOW_43_in_print787);  
            stream_43.add(char_literal74);



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
            // 71:33: -> ^( WRITE expression )
            {
                // Looc.g:71:36: ^( WRITE expression )
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
    // Looc.g:73:1: read : 'read' IDF ';' -> ^( READ IDF ) ;
    public final LoocParser.read_return read() throws RecognitionException {
        LoocParser.read_return retval = new LoocParser.read_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal75=null;
        Token IDF76=null;
        Token char_literal77=null;

        CommonTree string_literal75_tree=null;
        CommonTree IDF76_tree=null;
        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");

        try {
            // Looc.g:73:5: ( 'read' IDF ';' -> ^( READ IDF ) )
            // Looc.g:73:9: 'read' IDF ';'
            {
            string_literal75=(Token)match(input,62,FOLLOW_62_in_read804);  
            stream_62.add(string_literal75);

            IDF76=(Token)match(input,IDF,FOLLOW_IDF_in_read806);  
            stream_IDF.add(IDF76);

            char_literal77=(Token)match(input,43,FOLLOW_43_in_read808);  
            stream_43.add(char_literal77);



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
            // 73:24: -> ^( READ IDF )
            {
                // Looc.g:73:27: ^( READ IDF )
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
    // Looc.g:75:1: returnstate : 'return' '(' expression ')' ';' -> ^( RETURN expression ) ;
    public final LoocParser.returnstate_return returnstate() throws RecognitionException {
        LoocParser.returnstate_return retval = new LoocParser.returnstate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal82=null;
        LoocParser.expression_return expression80 = null;


        CommonTree string_literal78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree char_literal82_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:75:12: ( 'return' '(' expression ')' ';' -> ^( RETURN expression ) )
            // Looc.g:75:16: 'return' '(' expression ')' ';'
            {
            string_literal78=(Token)match(input,63,FOLLOW_63_in_returnstate825);  
            stream_63.add(string_literal78);

            char_literal79=(Token)match(input,39,FOLLOW_39_in_returnstate827);  
            stream_39.add(char_literal79);

            pushFollow(FOLLOW_expression_in_returnstate829);
            expression80=expression();

            state._fsp--;

            stream_expression.add(expression80.getTree());
            char_literal81=(Token)match(input,40,FOLLOW_40_in_returnstate831);  
            stream_40.add(char_literal81);

            char_literal82=(Token)match(input,43,FOLLOW_43_in_returnstate833);  
            stream_43.add(char_literal82);



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
            // 75:48: -> ^( RETURN expression )
            {
                // Looc.g:75:51: ^( RETURN expression )
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
    // Looc.g:79:1: expression : ( IDF expressionbis -> ^( EXPR IDF expressionbis ) | 'this' expressionbis -> ^( THIS expressionbis ) | 'super' expressionbis -> ^( SUPER expressionbis ) | CSTE_ENT expressionbis -> ^( EXPR CSTE_ENT expressionbis ) | CSTE_CHAINE expressionbis -> ^( EXPR CSTE_CHAINE expressionbis ) | 'new' IDFC expressionbis -> ^( NEW IDFC expressionbis ) | '(' expression ')' expressionbis -> ^( EXPR expression expressionbis ) | '-' expression expressionbis -> ^( NEG expression expressionbis ) );
    public final LoocParser.expression_return expression() throws RecognitionException {
        LoocParser.expression_return retval = new LoocParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF83=null;
        Token string_literal85=null;
        Token string_literal87=null;
        Token CSTE_ENT89=null;
        Token CSTE_CHAINE91=null;
        Token string_literal93=null;
        Token IDFC94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal100=null;
        LoocParser.expressionbis_return expressionbis84 = null;

        LoocParser.expressionbis_return expressionbis86 = null;

        LoocParser.expressionbis_return expressionbis88 = null;

        LoocParser.expressionbis_return expressionbis90 = null;

        LoocParser.expressionbis_return expressionbis92 = null;

        LoocParser.expressionbis_return expressionbis95 = null;

        LoocParser.expression_return expression97 = null;

        LoocParser.expressionbis_return expressionbis99 = null;

        LoocParser.expression_return expression101 = null;

        LoocParser.expressionbis_return expressionbis102 = null;


        CommonTree IDF83_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree string_literal87_tree=null;
        CommonTree CSTE_ENT89_tree=null;
        CommonTree CSTE_CHAINE91_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree IDFC94_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_CSTE_ENT=new RewriteRuleTokenStream(adaptor,"token CSTE_ENT");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_CSTE_CHAINE=new RewriteRuleTokenStream(adaptor,"token CSTE_CHAINE");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionbis=new RewriteRuleSubtreeStream(adaptor,"rule expressionbis");
        try {
            // Looc.g:79:11: ( IDF expressionbis -> ^( EXPR IDF expressionbis ) | 'this' expressionbis -> ^( THIS expressionbis ) | 'super' expressionbis -> ^( SUPER expressionbis ) | CSTE_ENT expressionbis -> ^( EXPR CSTE_ENT expressionbis ) | CSTE_CHAINE expressionbis -> ^( EXPR CSTE_CHAINE expressionbis ) | 'new' IDFC expressionbis -> ^( NEW IDFC expressionbis ) | '(' expression ')' expressionbis -> ^( EXPR expression expressionbis ) | '-' expression expressionbis -> ^( NEG expression expressionbis ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt19=1;
                }
                break;
            case 64:
                {
                alt19=2;
                }
                break;
            case 65:
                {
                alt19=3;
                }
                break;
            case CSTE_ENT:
                {
                alt19=4;
                }
                break;
            case CSTE_CHAINE:
                {
                alt19=5;
                }
                break;
            case 66:
                {
                alt19=6;
                }
                break;
            case 39:
                {
                alt19=7;
                }
                break;
            case 67:
                {
                alt19=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // Looc.g:79:15: IDF expressionbis
                    {
                    IDF83=(Token)match(input,IDF,FOLLOW_IDF_in_expression853);  
                    stream_IDF.add(IDF83);

                    pushFollow(FOLLOW_expressionbis_in_expression855);
                    expressionbis84=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis84.getTree());


                    // AST REWRITE
                    // elements: expressionbis, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 79:33: -> ^( EXPR IDF expressionbis )
                    {
                        // Looc.g:79:36: ^( EXPR IDF expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:80:15: 'this' expressionbis
                    {
                    string_literal85=(Token)match(input,64,FOLLOW_64_in_expression881);  
                    stream_64.add(string_literal85);

                    pushFollow(FOLLOW_expressionbis_in_expression883);
                    expressionbis86=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis86.getTree());


                    // AST REWRITE
                    // elements: expressionbis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:36: -> ^( THIS expressionbis )
                    {
                        // Looc.g:80:39: ^( THIS expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THIS, "THIS"), root_1);

                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:81:15: 'super' expressionbis
                    {
                    string_literal87=(Token)match(input,65,FOLLOW_65_in_expression907);  
                    stream_65.add(string_literal87);

                    pushFollow(FOLLOW_expressionbis_in_expression909);
                    expressionbis88=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis88.getTree());


                    // AST REWRITE
                    // elements: expressionbis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 81:37: -> ^( SUPER expressionbis )
                    {
                        // Looc.g:81:40: ^( SUPER expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER, "SUPER"), root_1);

                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Looc.g:82:15: CSTE_ENT expressionbis
                    {
                    CSTE_ENT89=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression933);  
                    stream_CSTE_ENT.add(CSTE_ENT89);

                    pushFollow(FOLLOW_expressionbis_in_expression935);
                    expressionbis90=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis90.getTree());


                    // AST REWRITE
                    // elements: expressionbis, CSTE_ENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:38: -> ^( EXPR CSTE_ENT expressionbis )
                    {
                        // Looc.g:82:41: ^( EXPR CSTE_ENT expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_CSTE_ENT.nextNode());
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Looc.g:83:15: CSTE_CHAINE expressionbis
                    {
                    CSTE_CHAINE91=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_expression961);  
                    stream_CSTE_CHAINE.add(CSTE_CHAINE91);

                    pushFollow(FOLLOW_expressionbis_in_expression963);
                    expressionbis92=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis92.getTree());


                    // AST REWRITE
                    // elements: expressionbis, CSTE_CHAINE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:41: -> ^( EXPR CSTE_CHAINE expressionbis )
                    {
                        // Looc.g:83:44: ^( EXPR CSTE_CHAINE expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_CSTE_CHAINE.nextNode());
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Looc.g:84:15: 'new' IDFC expressionbis
                    {
                    string_literal93=(Token)match(input,66,FOLLOW_66_in_expression989);  
                    stream_66.add(string_literal93);

                    IDFC94=(Token)match(input,IDFC,FOLLOW_IDFC_in_expression991);  
                    stream_IDFC.add(IDFC94);

                    pushFollow(FOLLOW_expressionbis_in_expression993);
                    expressionbis95=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis95.getTree());


                    // AST REWRITE
                    // elements: expressionbis, IDFC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:40: -> ^( NEW IDFC expressionbis )
                    {
                        // Looc.g:84:43: ^( NEW IDFC expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_IDFC.nextNode());
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // Looc.g:85:15: '(' expression ')' expressionbis
                    {
                    char_literal96=(Token)match(input,39,FOLLOW_39_in_expression1019);  
                    stream_39.add(char_literal96);

                    pushFollow(FOLLOW_expression_in_expression1021);
                    expression97=expression();

                    state._fsp--;

                    stream_expression.add(expression97.getTree());
                    char_literal98=(Token)match(input,40,FOLLOW_40_in_expression1023);  
                    stream_40.add(char_literal98);

                    pushFollow(FOLLOW_expressionbis_in_expression1025);
                    expressionbis99=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis99.getTree());


                    // AST REWRITE
                    // elements: expressionbis, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:48: -> ^( EXPR expression expressionbis )
                    {
                        // Looc.g:85:51: ^( EXPR expression expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // Looc.g:86:15: '-' expression expressionbis
                    {
                    char_literal100=(Token)match(input,67,FOLLOW_67_in_expression1051);  
                    stream_67.add(char_literal100);

                    pushFollow(FOLLOW_expression_in_expression1053);
                    expression101=expression();

                    state._fsp--;

                    stream_expression.add(expression101.getTree());
                    pushFollow(FOLLOW_expressionbis_in_expression1055);
                    expressionbis102=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis102.getTree());


                    // AST REWRITE
                    // elements: expression, expressionbis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:44: -> ^( NEG expression expressionbis )
                    {
                        // Looc.g:86:47: ^( NEG expression expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEG, "NEG"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

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

    public static class expressionbis_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionbis"
    // Looc.g:89:1: expressionbis : ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis -> ^( METHODCALLING IDF ( expression )+ expressionbis ) | oper expression expressionbis -> ^( oper expression expressionbis ) | -> VIDE );
    public final LoocParser.expressionbis_return expressionbis() throws RecognitionException {
        LoocParser.expressionbis_return retval = new LoocParser.expressionbis_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal103=null;
        Token IDF104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Token char_literal109=null;
        LoocParser.expression_return expression106 = null;

        LoocParser.expression_return expression108 = null;

        LoocParser.expressionbis_return expressionbis110 = null;

        LoocParser.oper_return oper111 = null;

        LoocParser.expression_return expression112 = null;

        LoocParser.expressionbis_return expressionbis113 = null;


        CommonTree char_literal103_tree=null;
        CommonTree IDF104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_oper=new RewriteRuleSubtreeStream(adaptor,"rule oper");
        RewriteRuleSubtreeStream stream_expressionbis=new RewriteRuleSubtreeStream(adaptor,"rule expressionbis");
        try {
            // Looc.g:89:14: ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis -> ^( METHODCALLING IDF ( expression )+ expressionbis ) | oper expression expressionbis -> ^( oper expression expressionbis ) | -> VIDE )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt22=1;
                }
                break;
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt22=2;
                }
                break;
            case 40:
            case 43:
            case 49:
            case 52:
            case 57:
            case 58:
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
                    // Looc.g:89:18: '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis
                    {
                    char_literal103=(Token)match(input,68,FOLLOW_68_in_expressionbis1085);  
                    stream_68.add(char_literal103);

                    IDF104=(Token)match(input,IDF,FOLLOW_IDF_in_expressionbis1087);  
                    stream_IDF.add(IDF104);

                    char_literal105=(Token)match(input,39,FOLLOW_39_in_expressionbis1089);  
                    stream_39.add(char_literal105);

                    // Looc.g:89:30: ( expression )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=IDF && LA20_0<=CSTE_CHAINE)||LA20_0==39||(LA20_0>=64 && LA20_0<=67)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Looc.g:89:31: expression
                            {
                            pushFollow(FOLLOW_expression_in_expressionbis1092);
                            expression106=expression();

                            state._fsp--;

                            stream_expression.add(expression106.getTree());

                            }
                            break;

                    }

                    // Looc.g:89:44: ( ',' expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==49) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Looc.g:89:45: ',' expression
                    	    {
                    	    char_literal107=(Token)match(input,49,FOLLOW_49_in_expressionbis1097);  
                    	    stream_49.add(char_literal107);

                    	    pushFollow(FOLLOW_expression_in_expressionbis1099);
                    	    expression108=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression108.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    char_literal109=(Token)match(input,40,FOLLOW_40_in_expressionbis1103);  
                    stream_40.add(char_literal109);

                    pushFollow(FOLLOW_expressionbis_in_expressionbis1105);
                    expressionbis110=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis110.getTree());


                    // AST REWRITE
                    // elements: expression, IDF, expressionbis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:80: -> ^( METHODCALLING IDF ( expression )+ expressionbis )
                    {
                        // Looc.g:89:83: ^( METHODCALLING IDF ( expression )+ expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODCALLING, "METHODCALLING"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:90:19: oper expression expressionbis
                    {
                    pushFollow(FOLLOW_oper_in_expressionbis1140);
                    oper111=oper();

                    state._fsp--;

                    stream_oper.add(oper111.getTree());
                    pushFollow(FOLLOW_expression_in_expressionbis1142);
                    expression112=expression();

                    state._fsp--;

                    stream_expression.add(expression112.getTree());
                    pushFollow(FOLLOW_expressionbis_in_expressionbis1144);
                    expressionbis113=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis113.getTree());


                    // AST REWRITE
                    // elements: expressionbis, oper, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 90:49: -> ^( oper expression expressionbis )
                    {
                        // Looc.g:90:52: ^( oper expression expressionbis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_oper.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:91:36: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:36: -> VIDE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(VIDE, "VIDE"));

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
    // $ANTLR end "expressionbis"

    public static class oper_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // Looc.g:94:1: oper : ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' );
    public final LoocParser.oper_return oper() throws RecognitionException {
        LoocParser.oper_return retval = new LoocParser.oper_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set114=null;

        CommonTree set114_tree=null;

        try {
            // Looc.g:94:5: ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' )
            // Looc.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set114=(Token)input.LT(1);
            if ( input.LA(1)==67||(input.LA(1)>=69 && input.LA(1)<=76) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set114));
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


 

    public static final BitSet FOLLOW_class_decl_in_program192 = new BitSet(new long[]{0xE488821008000000L});
    public static final BitSet FOLLOW_var_decl_in_program197 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_instruction_in_program202 = new BitSet(new long[]{0xE488820008000002L});
    public static final BitSet FOLLOW_36_in_class_decl234 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl236 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_class_decl239 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl241 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_class_decl245 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_class_decl247 = new BitSet(new long[]{0x0000430000000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl249 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_class_decl251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl276 = new BitSet(new long[]{0x0000420000000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl281 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_41_in_var_decl308 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_var_decl310 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_var_decl312 = new BitSet(new long[]{0x0000300004000000L});
    public static final BitSet FOLLOW_type_in_var_decl314 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_var_decl316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDFC_in_type335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_type351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_type367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_method_decl387 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_method_decl389 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_method_decl391 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_method_args_in_method_decl394 = new BitSet(new long[]{0x0000010008000000L});
    public static final BitSet FOLLOW_40_in_method_decl398 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_42_in_method_decl401 = new BitSet(new long[]{0x0000300004000000L});
    public static final BitSet FOLLOW_type_in_method_decl403 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_method_decl407 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_var_decl_in_method_decl410 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_instruction_in_method_decl415 = new BitSet(new long[]{0xE489820008000000L});
    public static final BitSet FOLLOW_48_in_method_decl419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args450 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_method_args452 = new BitSet(new long[]{0x0000300004000000L});
    public static final BitSet FOLLOW_type_in_method_args454 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_method_args457 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_method_args459 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_method_args461 = new BitSet(new long[]{0x0000300004000000L});
    public static final BitSet FOLLOW_type_in_method_args463 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_IDF_in_instruction491 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_instruction493 = new BitSet(new long[]{0x1000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_affectation_in_instruction495 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_instruction497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_instruction524 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_instruction526 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_instruction528 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_instruction_in_instruction530 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_instruction533 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_instruction_in_instruction535 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_instruction539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_instruction571 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_instruction573 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_instruction575 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_instruction577 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_instruction579 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_instruction581 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction583 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_instruction_in_instruction586 = new BitSet(new long[]{0xEC88820008000000L});
    public static final BitSet FOLLOW_59_in_instruction590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_instruction624 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_var_decl_in_instruction627 = new BitSet(new long[]{0xE488820008000000L});
    public static final BitSet FOLLOW_instruction_in_instruction632 = new BitSet(new long[]{0xE489820008000000L});
    public static final BitSet FOLLOW_48_in_instruction636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_instruction669 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_instruction671 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_instruction673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstate_in_instruction724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_affectation745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_affectation762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_print783 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_print785 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_print787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_read804 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_read806 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_read808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_returnstate825 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_returnstate827 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_returnstate829 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_returnstate831 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_returnstate833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expression853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_expression881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_expression907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_expression961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_expression989 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_IDFC_in_expression991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_expression1019 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression1021 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expression1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_expression1051 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expression1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expression1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expressionbis1085 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_expressionbis1087 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_expressionbis1089 = new BitSet(new long[]{0x0002018038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expressionbis1092 = new BitSet(new long[]{0x0002010000000000L});
    public static final BitSet FOLLOW_49_in_expressionbis1097 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expressionbis1099 = new BitSet(new long[]{0x0002010000000000L});
    public static final BitSet FOLLOW_40_in_expressionbis1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expressionbis1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expressionbis1140 = new BitSet(new long[]{0x0000008038000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expressionbis1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF8L});
    public static final BitSet FOLLOW_expressionbis_in_expressionbis1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_oper0 = new BitSet(new long[]{0x0000000000000002L});

}