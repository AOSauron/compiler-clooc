// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-03-17 15:40:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "CLASS", "VARDEC", "METHODDEC", "METHODARGS", "AFFECT", "IF", "FOR", "ANONYMOUSBLOCK", "WRITE", "READ", "RETURN", "EXPR", "NEW", "METHODCALLING", "THIS", "THEN", "SUPER", "INT", "STRING", "ARG", "BLOCK", "DO", "ELSE", "IDFC", "IDF", "STRING_CST", "INT_CST", "ESC_SEQ", "WS", "COMMENT", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'+'", "'-'", "'*'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'.'"
    };
    public static final int EOF=-1;
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
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int PROGRAM=4;
    public static final int CLASS=5;
    public static final int VARDEC=6;
    public static final int METHODDEC=7;
    public static final int METHODARGS=8;
    public static final int AFFECT=9;
    public static final int IF=10;
    public static final int FOR=11;
    public static final int ANONYMOUSBLOCK=12;
    public static final int WRITE=13;
    public static final int READ=14;
    public static final int RETURN=15;
    public static final int EXPR=16;
    public static final int NEW=17;
    public static final int METHODCALLING=18;
    public static final int THIS=19;
    public static final int THEN=20;
    public static final int SUPER=21;
    public static final int INT=22;
    public static final int STRING=23;
    public static final int ARG=24;
    public static final int BLOCK=25;
    public static final int DO=26;
    public static final int ELSE=27;
    public static final int IDFC=28;
    public static final int IDF=29;
    public static final int STRING_CST=30;
    public static final int INT_CST=31;
    public static final int ESC_SEQ=32;
    public static final int WS=33;
    public static final int COMMENT=34;
    public static final int UNICODE_ESC=35;
    public static final int OCTAL_ESC=36;
    public static final int HEX_DIGIT=37;

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
    // Looc.g:49:1: program : ( class_decl )* ( decl_ins )* -> ^( PROGRAM ( class_decl )* ( decl_ins )* ) ;
    public final LoocParser.program_return program() throws RecognitionException {
        LoocParser.program_return retval = new LoocParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.class_decl_return class_decl1 = null;

        LoocParser.decl_ins_return decl_ins2 = null;


        RewriteRuleSubtreeStream stream_decl_ins=new RewriteRuleSubtreeStream(adaptor,"rule decl_ins");
        RewriteRuleSubtreeStream stream_class_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_decl");
        try {
            // Looc.g:49:8: ( ( class_decl )* ( decl_ins )* -> ^( PROGRAM ( class_decl )* ( decl_ins )* ) )
            // Looc.g:49:12: ( class_decl )* ( decl_ins )*
            {
            // Looc.g:49:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:49:13: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program203);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Looc.g:49:26: ( decl_ins )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDF||LA2_0==43||LA2_0==49||LA2_0==53||LA2_0==57||LA2_0==60||(LA2_0>=63 && LA2_0<=65)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:49:26: decl_ins
            	    {
            	    pushFollow(FOLLOW_decl_ins_in_program207);
            	    decl_ins2=decl_ins();

            	    state._fsp--;

            	    stream_decl_ins.add(decl_ins2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: decl_ins, class_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:36: -> ^( PROGRAM ( class_decl )* ( decl_ins )* )
            {
                // Looc.g:49:39: ^( PROGRAM ( class_decl )* ( decl_ins )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // Looc.g:49:49: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // Looc.g:49:63: ( decl_ins )*
                while ( stream_decl_ins.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl_ins.nextTree());

                }
                stream_decl_ins.reset();

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
    // Looc.g:51:1: class_decl : 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC ( IDFC )? class_item_decl ) ;
    public final LoocParser.class_decl_return class_decl() throws RecognitionException {
        LoocParser.class_decl_return retval = new LoocParser.class_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal3=null;
        Token IDFC4=null;
        Token string_literal5=null;
        Token IDFC6=null;
        Token char_literal7=null;
        Token char_literal8=null;
        Token char_literal10=null;
        LoocParser.class_item_decl_return class_item_decl9 = null;


        CommonTree string_literal3_tree=null;
        CommonTree IDFC4_tree=null;
        CommonTree string_literal5_tree=null;
        CommonTree IDFC6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try {
            // Looc.g:51:11: ( 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC ( IDFC )? class_item_decl ) )
            // Looc.g:51:15: 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')'
            {
            string_literal3=(Token)match(input,38,FOLLOW_38_in_class_decl231);  
            stream_38.add(string_literal3);

            IDFC4=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl233);  
            stream_IDFC.add(IDFC4);

            // Looc.g:51:28: ( 'inherit' IDFC )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Looc.g:51:29: 'inherit' IDFC
                    {
                    string_literal5=(Token)match(input,39,FOLLOW_39_in_class_decl236);  
                    stream_39.add(string_literal5);

                    IDFC6=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl238);  
                    stream_IDFC.add(IDFC6);


                    }
                    break;

            }

            char_literal7=(Token)match(input,40,FOLLOW_40_in_class_decl242);  
            stream_40.add(char_literal7);

            char_literal8=(Token)match(input,41,FOLLOW_41_in_class_decl244);  
            stream_41.add(char_literal8);

            pushFollow(FOLLOW_class_item_decl_in_class_decl246);
            class_item_decl9=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl9.getTree());
            char_literal10=(Token)match(input,42,FOLLOW_42_in_class_decl248);  
            stream_42.add(char_literal10);



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
            // 51:74: -> ^( CLASS IDFC ( IDFC )? class_item_decl )
            {
                // Looc.g:51:77: ^( CLASS IDFC ( IDFC )? class_item_decl )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS, "CLASS"), root_1);

                adaptor.addChild(root_1, stream_IDFC.nextNode());
                // Looc.g:51:90: ( IDFC )?
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
    // Looc.g:53:1: class_item_decl : ( decl )* -> ^( BLOCK ( decl )* ) ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.decl_return decl11 = null;


        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // Looc.g:53:16: ( ( decl )* -> ^( BLOCK ( decl )* ) )
            // Looc.g:53:20: ( decl )*
            {
            // Looc.g:53:20: ( decl )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==43||LA4_0==48) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Looc.g:53:20: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_class_item_decl272);
            	    decl11=decl();

            	    state._fsp--;

            	    stream_decl.add(decl11.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            // AST REWRITE
            // elements: decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:26: -> ^( BLOCK ( decl )* )
            {
                // Looc.g:53:29: ^( BLOCK ( decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // Looc.g:53:37: ( decl )*
                while ( stream_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_decl.nextTree());

                }
                stream_decl.reset();

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

    public static class decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // Looc.g:55:1: decl : ( var_decl | method_decl );
    public final LoocParser.decl_return decl() throws RecognitionException {
        LoocParser.decl_return retval = new LoocParser.decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;



        try {
            // Looc.g:55:5: ( var_decl | method_decl )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43) ) {
                alt5=1;
            }
            else if ( (LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Looc.g:55:9: var_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_var_decl_in_decl291);
                    var_decl12=var_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, var_decl12.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:56:9: method_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_method_decl_in_decl301);
                    method_decl13=method_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, method_decl13.getTree());

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
    // $ANTLR end "decl"

    public static class decl_ins_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_ins"
    // Looc.g:59:1: decl_ins : ( var_decl | instruction );
    public final LoocParser.decl_ins_return decl_ins() throws RecognitionException {
        LoocParser.decl_ins_return retval = new LoocParser.decl_ins_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.var_decl_return var_decl14 = null;

        LoocParser.instruction_return instruction15 = null;



        try {
            // Looc.g:59:9: ( var_decl | instruction )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( (LA6_0==IDF||LA6_0==49||LA6_0==53||LA6_0==57||LA6_0==60||(LA6_0>=63 && LA6_0<=65)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Looc.g:59:13: var_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_var_decl_in_decl_ins315);
                    var_decl14=var_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, var_decl14.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:60:13: instruction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instruction_in_decl_ins329);
                    instruction15=instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction15.getTree());

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
    // $ANTLR end "decl_ins"

    public static class var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // Looc.g:63:1: var_decl : 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) ;
    public final LoocParser.var_decl_return var_decl() throws RecognitionException {
        LoocParser.var_decl_return retval = new LoocParser.var_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal16=null;
        Token IDF17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        LoocParser.type_return type19 = null;


        CommonTree string_literal16_tree=null;
        CommonTree IDF17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:63:9: ( 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) )
            // Looc.g:63:13: 'var' IDF ':' type ';'
            {
            string_literal16=(Token)match(input,43,FOLLOW_43_in_var_decl347);  
            stream_43.add(string_literal16);

            IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl349);  
            stream_IDF.add(IDF17);

            char_literal18=(Token)match(input,44,FOLLOW_44_in_var_decl351);  
            stream_44.add(char_literal18);

            pushFollow(FOLLOW_type_in_var_decl353);
            type19=type();

            state._fsp--;

            stream_type.add(type19.getTree());
            char_literal20=(Token)match(input,45,FOLLOW_45_in_var_decl355);  
            stream_45.add(char_literal20);



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
            // 63:36: -> ^( VARDEC IDF type )
            {
                // Looc.g:63:39: ^( VARDEC IDF type )
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
    // Looc.g:65:1: type : ( IDFC -> ^( IDFC ) | 'int' -> ^( INT ) | 'string' -> ^( STRING ) );
    public final LoocParser.type_return type() throws RecognitionException {
        LoocParser.type_return retval = new LoocParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDFC21=null;
        Token string_literal22=null;
        Token string_literal23=null;

        CommonTree IDFC21_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree string_literal23_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");

        try {
            // Looc.g:65:5: ( IDFC -> ^( IDFC ) | 'int' -> ^( INT ) | 'string' -> ^( STRING ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case IDFC:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case 47:
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
                    // Looc.g:65:9: IDFC
                    {
                    IDFC21=(Token)match(input,IDFC,FOLLOW_IDFC_in_type374);  
                    stream_IDFC.add(IDFC21);



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
                    // 65:14: -> ^( IDFC )
                    {
                        // Looc.g:65:17: ^( IDFC )
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
                    // Looc.g:66:9: 'int'
                    {
                    string_literal22=(Token)match(input,46,FOLLOW_46_in_type390);  
                    stream_46.add(string_literal22);



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
                    // 66:15: -> ^( INT )
                    {
                        // Looc.g:66:18: ^( INT )
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
                    // Looc.g:67:9: 'string'
                    {
                    string_literal23=(Token)match(input,47,FOLLOW_47_in_type406);  
                    stream_47.add(string_literal23);



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
                    // 67:18: -> ^( STRING )
                    {
                        // Looc.g:67:21: ^( STRING )
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
    // Looc.g:70:1: method_decl : 'method' IDF '(' ( method_args )? ')' ( ':' type )? '{' ( decl_ins )* '}' -> ^( METHODDEC IDF ( method_args )? ( type )? ^( BLOCK ( decl_ins )* ) ) ;
    public final LoocParser.method_decl_return method_decl() throws RecognitionException {
        LoocParser.method_decl_return retval = new LoocParser.method_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal24=null;
        Token IDF25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal31=null;
        Token char_literal33=null;
        LoocParser.method_args_return method_args27 = null;

        LoocParser.type_return type30 = null;

        LoocParser.decl_ins_return decl_ins32 = null;


        CommonTree string_literal24_tree=null;
        CommonTree IDF25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_decl_ins=new RewriteRuleSubtreeStream(adaptor,"rule decl_ins");
        RewriteRuleSubtreeStream stream_method_args=new RewriteRuleSubtreeStream(adaptor,"rule method_args");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:70:12: ( 'method' IDF '(' ( method_args )? ')' ( ':' type )? '{' ( decl_ins )* '}' -> ^( METHODDEC IDF ( method_args )? ( type )? ^( BLOCK ( decl_ins )* ) ) )
            // Looc.g:70:16: 'method' IDF '(' ( method_args )? ')' ( ':' type )? '{' ( decl_ins )* '}'
            {
            string_literal24=(Token)match(input,48,FOLLOW_48_in_method_decl426);  
            stream_48.add(string_literal24);

            IDF25=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl428);  
            stream_IDF.add(IDF25);

            char_literal26=(Token)match(input,41,FOLLOW_41_in_method_decl430);  
            stream_41.add(char_literal26);

            // Looc.g:70:33: ( method_args )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDF) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Looc.g:70:33: method_args
                    {
                    pushFollow(FOLLOW_method_args_in_method_decl432);
                    method_args27=method_args();

                    state._fsp--;

                    stream_method_args.add(method_args27.getTree());

                    }
                    break;

            }

            char_literal28=(Token)match(input,42,FOLLOW_42_in_method_decl435);  
            stream_42.add(char_literal28);

            // Looc.g:70:50: ( ':' type )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Looc.g:70:51: ':' type
                    {
                    char_literal29=(Token)match(input,44,FOLLOW_44_in_method_decl438);  
                    stream_44.add(char_literal29);

                    pushFollow(FOLLOW_type_in_method_decl440);
                    type30=type();

                    state._fsp--;

                    stream_type.add(type30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,49,FOLLOW_49_in_method_decl444);  
            stream_49.add(char_literal31);

            // Looc.g:70:66: ( decl_ins )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDF||LA10_0==43||LA10_0==49||LA10_0==53||LA10_0==57||LA10_0==60||(LA10_0>=63 && LA10_0<=65)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Looc.g:70:66: decl_ins
            	    {
            	    pushFollow(FOLLOW_decl_ins_in_method_decl446);
            	    decl_ins32=decl_ins();

            	    state._fsp--;

            	    stream_decl_ins.add(decl_ins32.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            char_literal33=(Token)match(input,50,FOLLOW_50_in_method_decl449);  
            stream_50.add(char_literal33);



            // AST REWRITE
            // elements: method_args, decl_ins, type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 70:80: -> ^( METHODDEC IDF ( method_args )? ( type )? ^( BLOCK ( decl_ins )* ) )
            {
                // Looc.g:70:83: ^( METHODDEC IDF ( method_args )? ( type )? ^( BLOCK ( decl_ins )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODDEC, "METHODDEC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Looc.g:70:99: ( method_args )?
                if ( stream_method_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_args.nextTree());

                }
                stream_method_args.reset();
                // Looc.g:70:112: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // Looc.g:70:118: ^( BLOCK ( decl_ins )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // Looc.g:70:126: ( decl_ins )*
                while ( stream_decl_ins.hasNext() ) {
                    adaptor.addChild(root_2, stream_decl_ins.nextTree());

                }
                stream_decl_ins.reset();

                adaptor.addChild(root_1, root_2);
                }

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
    // Looc.g:73:1: method_args : IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARGS ^( ARG IDF type ) ( ^( ARG IDF type ) )* ) ;
    public final LoocParser.method_args_return method_args() throws RecognitionException {
        LoocParser.method_args_return retval = new LoocParser.method_args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token IDF38=null;
        Token char_literal39=null;
        LoocParser.type_return type36 = null;

        LoocParser.type_return type40 = null;


        CommonTree IDF34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree IDF38_tree=null;
        CommonTree char_literal39_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:73:12: ( IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARGS ^( ARG IDF type ) ( ^( ARG IDF type ) )* ) )
            // Looc.g:73:16: IDF ':' type ( ',' IDF ':' type )*
            {
            IDF34=(Token)match(input,IDF,FOLLOW_IDF_in_method_args481);  
            stream_IDF.add(IDF34);

            char_literal35=(Token)match(input,44,FOLLOW_44_in_method_args483);  
            stream_44.add(char_literal35);

            pushFollow(FOLLOW_type_in_method_args485);
            type36=type();

            state._fsp--;

            stream_type.add(type36.getTree());
            // Looc.g:73:29: ( ',' IDF ':' type )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Looc.g:73:30: ',' IDF ':' type
            	    {
            	    char_literal37=(Token)match(input,51,FOLLOW_51_in_method_args488);  
            	    stream_51.add(char_literal37);

            	    IDF38=(Token)match(input,IDF,FOLLOW_IDF_in_method_args490);  
            	    stream_IDF.add(IDF38);

            	    char_literal39=(Token)match(input,44,FOLLOW_44_in_method_args492);  
            	    stream_44.add(char_literal39);

            	    pushFollow(FOLLOW_type_in_method_args494);
            	    type40=type();

            	    state._fsp--;

            	    stream_type.add(type40.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: type, type, IDF, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:49: -> ^( METHODARGS ^( ARG IDF type ) ( ^( ARG IDF type ) )* )
            {
                // Looc.g:73:52: ^( METHODARGS ^( ARG IDF type ) ( ^( ARG IDF type ) )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODARGS, "METHODARGS"), root_1);

                // Looc.g:73:65: ^( ARG IDF type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, "ARG"), root_2);

                adaptor.addChild(root_2, stream_IDF.nextNode());
                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Looc.g:73:81: ( ^( ARG IDF type ) )*
                while ( stream_type.hasNext()||stream_IDF.hasNext() ) {
                    // Looc.g:73:81: ^( ARG IDF type )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, "ARG"), root_2);

                    adaptor.addChild(root_2, stream_IDF.nextNode());
                    adaptor.addChild(root_2, stream_type.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_type.reset();
                stream_IDF.reset();

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
    // Looc.g:75:1: instruction : ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' (a+= instruction )+ ( 'else' (b+= instruction )+ )? 'fi' -> ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ^( DO ( instruction )+ ) ) | '{' ( decl_ins )* '}' -> ^( ANONYMOUSBLOCK ( decl_ins )* ) | 'do' expression ';' -> ^( DO expression ) | print | read | returnstate );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF41=null;
        Token string_literal42=null;
        Token char_literal44=null;
        Token string_literal45=null;
        Token string_literal47=null;
        Token string_literal48=null;
        Token string_literal49=null;
        Token string_literal50=null;
        Token IDF51=null;
        Token string_literal52=null;
        Token string_literal54=null;
        Token string_literal56=null;
        Token string_literal58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token string_literal62=null;
        Token char_literal64=null;
        List list_a=null;
        List list_b=null;
        LoocParser.affectation_return affectation43 = null;

        LoocParser.expression_return expression46 = null;

        LoocParser.expression_return expression53 = null;

        LoocParser.expression_return expression55 = null;

        LoocParser.instruction_return instruction57 = null;

        LoocParser.decl_ins_return decl_ins60 = null;

        LoocParser.expression_return expression63 = null;

        LoocParser.print_return print65 = null;

        LoocParser.read_return read66 = null;

        LoocParser.returnstate_return returnstate67 = null;

        RuleReturnScope a = null;
        RuleReturnScope b = null;
        CommonTree IDF41_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree string_literal45_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree IDF51_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal64_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_decl_ins=new RewriteRuleSubtreeStream(adaptor,"rule decl_ins");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_affectation=new RewriteRuleSubtreeStream(adaptor,"rule affectation");
        try {
            // Looc.g:75:12: ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' (a+= instruction )+ ( 'else' (b+= instruction )+ )? 'fi' -> ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ^( DO ( instruction )+ ) ) | '{' ( decl_ins )* '}' -> ^( ANONYMOUSBLOCK ( decl_ins )* ) | 'do' expression ';' -> ^( DO expression ) | print | read | returnstate )
            int alt17=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt17=1;
                }
                break;
            case 53:
                {
                alt17=2;
                }
                break;
            case 57:
                {
                alt17=3;
                }
                break;
            case 49:
                {
                alt17=4;
                }
                break;
            case 60:
                {
                alt17=5;
                }
                break;
            case 63:
                {
                alt17=6;
                }
                break;
            case 64:
                {
                alt17=7;
                }
                break;
            case 65:
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
                    // Looc.g:75:16: IDF ':=' affectation ';'
                    {
                    IDF41=(Token)match(input,IDF,FOLLOW_IDF_in_instruction528);  
                    stream_IDF.add(IDF41);

                    string_literal42=(Token)match(input,52,FOLLOW_52_in_instruction530);  
                    stream_52.add(string_literal42);

                    pushFollow(FOLLOW_affectation_in_instruction532);
                    affectation43=affectation();

                    state._fsp--;

                    stream_affectation.add(affectation43.getTree());
                    char_literal44=(Token)match(input,45,FOLLOW_45_in_instruction534);  
                    stream_45.add(char_literal44);



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
                    // 75:41: -> ^( AFFECT IDF affectation )
                    {
                        // Looc.g:75:44: ^( AFFECT IDF affectation )
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
                    // Looc.g:76:16: 'if' expression 'then' (a+= instruction )+ ( 'else' (b+= instruction )+ )? 'fi'
                    {
                    string_literal45=(Token)match(input,53,FOLLOW_53_in_instruction561);  
                    stream_53.add(string_literal45);

                    pushFollow(FOLLOW_expression_in_instruction563);
                    expression46=expression();

                    state._fsp--;

                    stream_expression.add(expression46.getTree());
                    string_literal47=(Token)match(input,54,FOLLOW_54_in_instruction565);  
                    stream_54.add(string_literal47);

                    // Looc.g:76:40: (a+= instruction )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==IDF||LA12_0==49||LA12_0==53||LA12_0==57||LA12_0==60||(LA12_0>=63 && LA12_0<=65)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Looc.g:76:40: a+= instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction569);
                    	    a=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(a.getTree());
                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // Looc.g:76:55: ( 'else' (b+= instruction )+ )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==55) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Looc.g:76:56: 'else' (b+= instruction )+
                            {
                            string_literal48=(Token)match(input,55,FOLLOW_55_in_instruction573);  
                            stream_55.add(string_literal48);

                            // Looc.g:76:64: (b+= instruction )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==IDF||LA13_0==49||LA13_0==53||LA13_0==57||LA13_0==60||(LA13_0>=63 && LA13_0<=65)) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // Looc.g:76:64: b+= instruction
                            	    {
                            	    pushFollow(FOLLOW_instruction_in_instruction577);
                            	    b=instruction();

                            	    state._fsp--;

                            	    stream_instruction.add(b.getTree());
                            	    if (list_b==null) list_b=new ArrayList();
                            	    list_b.add(b.getTree());


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


                            }
                            break;

                    }

                    string_literal49=(Token)match(input,56,FOLLOW_56_in_instruction582);  
                    stream_56.add(string_literal49);



                    // AST REWRITE
                    // elements: a, b, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: a, b
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"token b",list_b);
                    root_0 = (CommonTree)adaptor.nil();
                    // 76:86: -> ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? )
                    {
                        // Looc.g:76:89: ^( IF expression ^( THEN ( $a)+ ) ( ^( ELSE ( $b)+ ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // Looc.g:76:105: ^( THEN ( $a)+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THEN, "THEN"), root_2);

                        if ( !(stream_a.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_a.hasNext() ) {
                            adaptor.addChild(root_2, stream_a.nextTree());

                        }
                        stream_a.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // Looc.g:76:117: ( ^( ELSE ( $b)+ ) )?
                        if ( stream_b.hasNext() ) {
                            // Looc.g:76:117: ^( ELSE ( $b)+ )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);

                            if ( !(stream_b.hasNext()) ) {
                                throw new RewriteEarlyExitException();
                            }
                            while ( stream_b.hasNext() ) {
                                adaptor.addChild(root_2, stream_b.nextTree());

                            }
                            stream_b.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_b.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:77:16: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    string_literal50=(Token)match(input,57,FOLLOW_57_in_instruction624);  
                    stream_57.add(string_literal50);

                    IDF51=(Token)match(input,IDF,FOLLOW_IDF_in_instruction626);  
                    stream_IDF.add(IDF51);

                    string_literal52=(Token)match(input,58,FOLLOW_58_in_instruction628);  
                    stream_58.add(string_literal52);

                    pushFollow(FOLLOW_expression_in_instruction630);
                    expression53=expression();

                    state._fsp--;

                    stream_expression.add(expression53.getTree());
                    string_literal54=(Token)match(input,59,FOLLOW_59_in_instruction632);  
                    stream_59.add(string_literal54);

                    pushFollow(FOLLOW_expression_in_instruction634);
                    expression55=expression();

                    state._fsp--;

                    stream_expression.add(expression55.getTree());
                    string_literal56=(Token)match(input,60,FOLLOW_60_in_instruction636);  
                    stream_60.add(string_literal56);

                    // Looc.g:77:63: ( instruction )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDF||LA15_0==49||LA15_0==53||LA15_0==57||LA15_0==60||(LA15_0>=63 && LA15_0<=65)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Looc.g:77:63: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction638);
                    	    instruction57=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction57.getTree());

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

                    string_literal58=(Token)match(input,61,FOLLOW_61_in_instruction641);  
                    stream_61.add(string_literal58);



                    // AST REWRITE
                    // elements: expression, IDF, expression, instruction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:82: -> ^( FOR IDF expression expression ^( DO ( instruction )+ ) )
                    {
                        // Looc.g:77:85: ^( FOR IDF expression expression ^( DO ( instruction )+ ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // Looc.g:77:117: ^( DO ( instruction )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);

                        if ( !(stream_instruction.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_instruction.hasNext() ) {
                            adaptor.addChild(root_2, stream_instruction.nextTree());

                        }
                        stream_instruction.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Looc.g:78:16: '{' ( decl_ins )* '}'
                    {
                    char_literal59=(Token)match(input,49,FOLLOW_49_in_instruction677);  
                    stream_49.add(char_literal59);

                    // Looc.g:78:20: ( decl_ins )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==IDF||LA16_0==43||LA16_0==49||LA16_0==53||LA16_0==57||LA16_0==60||(LA16_0>=63 && LA16_0<=65)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Looc.g:78:20: decl_ins
                    	    {
                    	    pushFollow(FOLLOW_decl_ins_in_instruction679);
                    	    decl_ins60=decl_ins();

                    	    state._fsp--;

                    	    stream_decl_ins.add(decl_ins60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    char_literal61=(Token)match(input,50,FOLLOW_50_in_instruction682);  
                    stream_50.add(char_literal61);



                    // AST REWRITE
                    // elements: decl_ins
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 78:34: -> ^( ANONYMOUSBLOCK ( decl_ins )* )
                    {
                        // Looc.g:78:37: ^( ANONYMOUSBLOCK ( decl_ins )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANONYMOUSBLOCK, "ANONYMOUSBLOCK"), root_1);

                        // Looc.g:78:54: ( decl_ins )*
                        while ( stream_decl_ins.hasNext() ) {
                            adaptor.addChild(root_1, stream_decl_ins.nextTree());

                        }
                        stream_decl_ins.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Looc.g:79:16: 'do' expression ';'
                    {
                    string_literal62=(Token)match(input,60,FOLLOW_60_in_instruction711);  
                    stream_60.add(string_literal62);

                    pushFollow(FOLLOW_expression_in_instruction713);
                    expression63=expression();

                    state._fsp--;

                    stream_expression.add(expression63.getTree());
                    char_literal64=(Token)match(input,45,FOLLOW_45_in_instruction715);  
                    stream_45.add(char_literal64);



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
                    // 79:36: -> ^( DO expression )
                    {
                        // Looc.g:79:39: ^( DO expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Looc.g:80:16: print
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instruction743);
                    print65=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print65.getTree());

                    }
                    break;
                case 7 :
                    // Looc.g:81:16: read
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_read_in_instruction760);
                    read66=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read66.getTree());

                    }
                    break;
                case 8 :
                    // Looc.g:82:16: returnstate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_returnstate_in_instruction777);
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
    // Looc.g:85:1: affectation : ( expression | 'nil' );
    public final LoocParser.affectation_return affectation() throws RecognitionException {
        LoocParser.affectation_return retval = new LoocParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal69=null;
        LoocParser.expression_return expression68 = null;


        CommonTree string_literal69_tree=null;

        try {
            // Looc.g:85:12: ( expression | 'nil' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=IDF && LA18_0<=INT_CST)||LA18_0==41||(LA18_0>=66 && LA18_0<=68)||LA18_0==70) ) {
                alt18=1;
            }
            else if ( (LA18_0==62) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Looc.g:85:16: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_affectation798);
                    expression68=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression68.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:86:16: 'nil'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal69=(Token)match(input,62,FOLLOW_62_in_affectation815); 
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
    // Looc.g:89:1: print : 'write' expression ';' -> ^( WRITE expression ) ;
    public final LoocParser.print_return print() throws RecognitionException {
        LoocParser.print_return retval = new LoocParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal70=null;
        Token char_literal72=null;
        LoocParser.expression_return expression71 = null;


        CommonTree string_literal70_tree=null;
        CommonTree char_literal72_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:89:6: ( 'write' expression ';' -> ^( WRITE expression ) )
            // Looc.g:89:10: 'write' expression ';'
            {
            string_literal70=(Token)match(input,63,FOLLOW_63_in_print836);  
            stream_63.add(string_literal70);

            pushFollow(FOLLOW_expression_in_print838);
            expression71=expression();

            state._fsp--;

            stream_expression.add(expression71.getTree());
            char_literal72=(Token)match(input,45,FOLLOW_45_in_print840);  
            stream_45.add(char_literal72);



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
            // 89:33: -> ^( WRITE expression )
            {
                // Looc.g:89:36: ^( WRITE expression )
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
    // Looc.g:91:1: read : 'read' IDF ';' -> ^( READ IDF ) ;
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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");

        try {
            // Looc.g:91:5: ( 'read' IDF ';' -> ^( READ IDF ) )
            // Looc.g:91:9: 'read' IDF ';'
            {
            string_literal73=(Token)match(input,64,FOLLOW_64_in_read857);  
            stream_64.add(string_literal73);

            IDF74=(Token)match(input,IDF,FOLLOW_IDF_in_read859);  
            stream_IDF.add(IDF74);

            char_literal75=(Token)match(input,45,FOLLOW_45_in_read861);  
            stream_45.add(char_literal75);



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
            // 91:24: -> ^( READ IDF )
            {
                // Looc.g:91:27: ^( READ IDF )
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
    // Looc.g:93:1: returnstate : 'return' '(' expression ')' ';' -> ^( RETURN expression ) ;
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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:93:12: ( 'return' '(' expression ')' ';' -> ^( RETURN expression ) )
            // Looc.g:93:16: 'return' '(' expression ')' ';'
            {
            string_literal76=(Token)match(input,65,FOLLOW_65_in_returnstate878);  
            stream_65.add(string_literal76);

            char_literal77=(Token)match(input,41,FOLLOW_41_in_returnstate880);  
            stream_41.add(char_literal77);

            pushFollow(FOLLOW_expression_in_returnstate882);
            expression78=expression();

            state._fsp--;

            stream_expression.add(expression78.getTree());
            char_literal79=(Token)match(input,42,FOLLOW_42_in_returnstate884);  
            stream_42.add(char_literal79);

            char_literal80=(Token)match(input,45,FOLLOW_45_in_returnstate886);  
            stream_45.add(char_literal80);



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
            // 93:48: -> ^( RETURN expression )
            {
                // Looc.g:93:51: ^( RETURN expression )
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
    // Looc.g:95:1: expression : ( 'this' expressionbis -> ^( THIS ( expressionbis )? ) | 'super' expressionbis -> ^( SUPER ( expressionbis )? ) | STRING_CST expressionbis -> ^( STRING_CST ( expressionbis )? ) | 'new' IDFC expressionbis -> ^( NEW IDFC ( expressionbis )? ) | exprio1 expressionbis -> exprio1 ( expressionbis )? );
    public final LoocParser.expression_return expression() throws RecognitionException {
        LoocParser.expression_return retval = new LoocParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal81=null;
        Token string_literal83=null;
        Token STRING_CST85=null;
        Token string_literal87=null;
        Token IDFC88=null;
        LoocParser.expressionbis_return expressionbis82 = null;

        LoocParser.expressionbis_return expressionbis84 = null;

        LoocParser.expressionbis_return expressionbis86 = null;

        LoocParser.expressionbis_return expressionbis89 = null;

        LoocParser.exprio1_return exprio190 = null;

        LoocParser.expressionbis_return expressionbis91 = null;


        CommonTree string_literal81_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree STRING_CST85_tree=null;
        CommonTree string_literal87_tree=null;
        CommonTree IDFC88_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_STRING_CST=new RewriteRuleTokenStream(adaptor,"token STRING_CST");
        RewriteRuleSubtreeStream stream_exprio1=new RewriteRuleSubtreeStream(adaptor,"rule exprio1");
        RewriteRuleSubtreeStream stream_expressionbis=new RewriteRuleSubtreeStream(adaptor,"rule expressionbis");
        try {
            // Looc.g:95:11: ( 'this' expressionbis -> ^( THIS ( expressionbis )? ) | 'super' expressionbis -> ^( SUPER ( expressionbis )? ) | STRING_CST expressionbis -> ^( STRING_CST ( expressionbis )? ) | 'new' IDFC expressionbis -> ^( NEW IDFC ( expressionbis )? ) | exprio1 expressionbis -> exprio1 ( expressionbis )? )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt19=1;
                }
                break;
            case 67:
                {
                alt19=2;
                }
                break;
            case STRING_CST:
                {
                alt19=3;
                }
                break;
            case 68:
                {
                alt19=4;
                }
                break;
            case IDF:
            case INT_CST:
            case 41:
            case 70:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // Looc.g:95:15: 'this' expressionbis
                    {
                    string_literal81=(Token)match(input,66,FOLLOW_66_in_expression903);  
                    stream_66.add(string_literal81);

                    pushFollow(FOLLOW_expressionbis_in_expression905);
                    expressionbis82=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis82.getTree());


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
                    // 95:36: -> ^( THIS ( expressionbis )? )
                    {
                        // Looc.g:95:39: ^( THIS ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THIS, "THIS"), root_1);

                        // Looc.g:95:46: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:96:15: 'super' expressionbis
                    {
                    string_literal83=(Token)match(input,67,FOLLOW_67_in_expression930);  
                    stream_67.add(string_literal83);

                    pushFollow(FOLLOW_expressionbis_in_expression932);
                    expressionbis84=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis84.getTree());


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
                    // 96:37: -> ^( SUPER ( expressionbis )? )
                    {
                        // Looc.g:96:40: ^( SUPER ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER, "SUPER"), root_1);

                        // Looc.g:96:48: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:97:15: STRING_CST expressionbis
                    {
                    STRING_CST85=(Token)match(input,STRING_CST,FOLLOW_STRING_CST_in_expression957);  
                    stream_STRING_CST.add(STRING_CST85);

                    pushFollow(FOLLOW_expressionbis_in_expression959);
                    expressionbis86=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis86.getTree());


                    // AST REWRITE
                    // elements: STRING_CST, expressionbis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:40: -> ^( STRING_CST ( expressionbis )? )
                    {
                        // Looc.g:97:43: ^( STRING_CST ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_STRING_CST.nextNode(), root_1);

                        // Looc.g:97:56: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Looc.g:98:15: 'new' IDFC expressionbis
                    {
                    string_literal87=(Token)match(input,68,FOLLOW_68_in_expression984);  
                    stream_68.add(string_literal87);

                    IDFC88=(Token)match(input,IDFC,FOLLOW_IDFC_in_expression986);  
                    stream_IDFC.add(IDFC88);

                    pushFollow(FOLLOW_expressionbis_in_expression988);
                    expressionbis89=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis89.getTree());


                    // AST REWRITE
                    // elements: IDFC, expressionbis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:40: -> ^( NEW IDFC ( expressionbis )? )
                    {
                        // Looc.g:98:43: ^( NEW IDFC ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_IDFC.nextNode());
                        // Looc.g:98:54: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Looc.g:99:15: exprio1 expressionbis
                    {
                    pushFollow(FOLLOW_exprio1_in_expression1015);
                    exprio190=exprio1();

                    state._fsp--;

                    stream_exprio1.add(exprio190.getTree());
                    pushFollow(FOLLOW_expressionbis_in_expression1017);
                    expressionbis91=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis91.getTree());


                    // AST REWRITE
                    // elements: expressionbis, exprio1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:37: -> exprio1 ( expressionbis )?
                    {
                        adaptor.addChild(root_0, stream_exprio1.nextTree());
                        // Looc.g:99:49: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_0, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

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

    public static class exprio1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprio1"
    // Looc.g:102:1: exprio1 : exprio2 ( '+' exprio2 | '-' exprio2 )* ;
    public final LoocParser.exprio1_return exprio1() throws RecognitionException {
        LoocParser.exprio1_return retval = new LoocParser.exprio1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal93=null;
        Token char_literal95=null;
        LoocParser.exprio2_return exprio292 = null;

        LoocParser.exprio2_return exprio294 = null;

        LoocParser.exprio2_return exprio296 = null;


        CommonTree char_literal93_tree=null;
        CommonTree char_literal95_tree=null;

        try {
            // Looc.g:102:9: ( exprio2 ( '+' exprio2 | '-' exprio2 )* )
            // Looc.g:102:11: exprio2 ( '+' exprio2 | '-' exprio2 )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exprio2_in_exprio11044);
            exprio292=exprio2();

            state._fsp--;

            adaptor.addChild(root_0, exprio292.getTree());
            // Looc.g:102:19: ( '+' exprio2 | '-' exprio2 )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==69) ) {
                    alt20=1;
                }
                else if ( (LA20_0==70) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // Looc.g:102:21: '+' exprio2
            	    {
            	    char_literal93=(Token)match(input,69,FOLLOW_69_in_exprio11048); 
            	    char_literal93_tree = (CommonTree)adaptor.create(char_literal93);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal93_tree, root_0);

            	    pushFollow(FOLLOW_exprio2_in_exprio11051);
            	    exprio294=exprio2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio294.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Looc.g:102:36: '-' exprio2
            	    {
            	    char_literal95=(Token)match(input,70,FOLLOW_70_in_exprio11055); 
            	    char_literal95_tree = (CommonTree)adaptor.create(char_literal95);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal95_tree, root_0);

            	    pushFollow(FOLLOW_exprio2_in_exprio11058);
            	    exprio296=exprio2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio296.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "exprio1"

    public static class exprio2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprio2"
    // Looc.g:104:1: exprio2 : exprio4 ( '*' exprio4 )* ;
    public final LoocParser.exprio2_return exprio2() throws RecognitionException {
        LoocParser.exprio2_return retval = new LoocParser.exprio2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal98=null;
        LoocParser.exprio4_return exprio497 = null;

        LoocParser.exprio4_return exprio499 = null;


        CommonTree char_literal98_tree=null;

        try {
            // Looc.g:104:9: ( exprio4 ( '*' exprio4 )* )
            // Looc.g:104:11: exprio4 ( '*' exprio4 )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exprio4_in_exprio21069);
            exprio497=exprio4();

            state._fsp--;

            adaptor.addChild(root_0, exprio497.getTree());
            // Looc.g:104:19: ( '*' exprio4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==71) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Looc.g:104:21: '*' exprio4
            	    {
            	    char_literal98=(Token)match(input,71,FOLLOW_71_in_exprio21073); 
            	    char_literal98_tree = (CommonTree)adaptor.create(char_literal98);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal98_tree, root_0);

            	    pushFollow(FOLLOW_exprio4_in_exprio21076);
            	    exprio499=exprio4();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio499.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "exprio2"

    public static class exprio4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprio4"
    // Looc.g:106:1: exprio4 : exprio7 ( '==' exprio7 | '!=' exprio7 | '<' exprio7 | '<=' exprio7 | '>' exprio7 | '>=' exprio7 )* ;
    public final LoocParser.exprio4_return exprio4() throws RecognitionException {
        LoocParser.exprio4_return retval = new LoocParser.exprio4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal101=null;
        Token string_literal103=null;
        Token char_literal105=null;
        Token string_literal107=null;
        Token char_literal109=null;
        Token string_literal111=null;
        LoocParser.exprio7_return exprio7100 = null;

        LoocParser.exprio7_return exprio7102 = null;

        LoocParser.exprio7_return exprio7104 = null;

        LoocParser.exprio7_return exprio7106 = null;

        LoocParser.exprio7_return exprio7108 = null;

        LoocParser.exprio7_return exprio7110 = null;

        LoocParser.exprio7_return exprio7112 = null;


        CommonTree string_literal101_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree string_literal111_tree=null;

        try {
            // Looc.g:106:9: ( exprio7 ( '==' exprio7 | '!=' exprio7 | '<' exprio7 | '<=' exprio7 | '>' exprio7 | '>=' exprio7 )* )
            // Looc.g:106:11: exprio7 ( '==' exprio7 | '!=' exprio7 | '<' exprio7 | '<=' exprio7 | '>' exprio7 | '>=' exprio7 )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exprio7_in_exprio41087);
            exprio7100=exprio7();

            state._fsp--;

            adaptor.addChild(root_0, exprio7100.getTree());
            // Looc.g:106:19: ( '==' exprio7 | '!=' exprio7 | '<' exprio7 | '<=' exprio7 | '>' exprio7 | '>=' exprio7 )*
            loop22:
            do {
                int alt22=7;
                switch ( input.LA(1) ) {
                case 72:
                    {
                    alt22=1;
                    }
                    break;
                case 73:
                    {
                    alt22=2;
                    }
                    break;
                case 74:
                    {
                    alt22=3;
                    }
                    break;
                case 75:
                    {
                    alt22=4;
                    }
                    break;
                case 76:
                    {
                    alt22=5;
                    }
                    break;
                case 77:
                    {
                    alt22=6;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // Looc.g:106:21: '==' exprio7
            	    {
            	    string_literal101=(Token)match(input,72,FOLLOW_72_in_exprio41091); 
            	    string_literal101_tree = (CommonTree)adaptor.create(string_literal101);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal101_tree, root_0);

            	    pushFollow(FOLLOW_exprio7_in_exprio41094);
            	    exprio7102=exprio7();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio7102.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Looc.g:106:37: '!=' exprio7
            	    {
            	    string_literal103=(Token)match(input,73,FOLLOW_73_in_exprio41098); 
            	    string_literal103_tree = (CommonTree)adaptor.create(string_literal103);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal103_tree, root_0);

            	    pushFollow(FOLLOW_exprio7_in_exprio41101);
            	    exprio7104=exprio7();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio7104.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Looc.g:106:53: '<' exprio7
            	    {
            	    char_literal105=(Token)match(input,74,FOLLOW_74_in_exprio41105); 
            	    char_literal105_tree = (CommonTree)adaptor.create(char_literal105);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal105_tree, root_0);

            	    pushFollow(FOLLOW_exprio7_in_exprio41108);
            	    exprio7106=exprio7();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio7106.getTree());

            	    }
            	    break;
            	case 4 :
            	    // Looc.g:106:68: '<=' exprio7
            	    {
            	    string_literal107=(Token)match(input,75,FOLLOW_75_in_exprio41112); 
            	    string_literal107_tree = (CommonTree)adaptor.create(string_literal107);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal107_tree, root_0);

            	    pushFollow(FOLLOW_exprio7_in_exprio41115);
            	    exprio7108=exprio7();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio7108.getTree());

            	    }
            	    break;
            	case 5 :
            	    // Looc.g:106:84: '>' exprio7
            	    {
            	    char_literal109=(Token)match(input,76,FOLLOW_76_in_exprio41119); 
            	    char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal109_tree, root_0);

            	    pushFollow(FOLLOW_exprio7_in_exprio41122);
            	    exprio7110=exprio7();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio7110.getTree());

            	    }
            	    break;
            	case 6 :
            	    // Looc.g:106:99: '>=' exprio7
            	    {
            	    string_literal111=(Token)match(input,77,FOLLOW_77_in_exprio41126); 
            	    string_literal111_tree = (CommonTree)adaptor.create(string_literal111);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal111_tree, root_0);

            	    pushFollow(FOLLOW_exprio7_in_exprio41129);
            	    exprio7112=exprio7();

            	    state._fsp--;

            	    adaptor.addChild(root_0, exprio7112.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "exprio4"

    public static class exprio7_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprio7"
    // Looc.g:108:1: exprio7 : ( '-' )? exprio8 ;
    public final LoocParser.exprio7_return exprio7() throws RecognitionException {
        LoocParser.exprio7_return retval = new LoocParser.exprio7_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal113=null;
        LoocParser.exprio8_return exprio8114 = null;


        CommonTree char_literal113_tree=null;

        try {
            // Looc.g:108:9: ( ( '-' )? exprio8 )
            // Looc.g:108:11: ( '-' )? exprio8
            {
            root_0 = (CommonTree)adaptor.nil();

            // Looc.g:108:11: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==70) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Looc.g:108:12: '-'
                    {
                    char_literal113=(Token)match(input,70,FOLLOW_70_in_exprio71141); 
                    char_literal113_tree = (CommonTree)adaptor.create(char_literal113);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal113_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_exprio8_in_exprio71146);
            exprio8114=exprio8();

            state._fsp--;

            adaptor.addChild(root_0, exprio8114.getTree());

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
    // $ANTLR end "exprio7"

    public static class exprio8_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprio8"
    // Looc.g:110:1: exprio8 : ( INT_CST -> ^( INT_CST ) | IDF -> IDF | '(' expression ')' -> expression );
    public final LoocParser.exprio8_return exprio8() throws RecognitionException {
        LoocParser.exprio8_return retval = new LoocParser.exprio8_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT_CST115=null;
        Token IDF116=null;
        Token char_literal117=null;
        Token char_literal119=null;
        LoocParser.expression_return expression118 = null;


        CommonTree INT_CST115_tree=null;
        CommonTree IDF116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree char_literal119_tree=null;
        RewriteRuleTokenStream stream_INT_CST=new RewriteRuleTokenStream(adaptor,"token INT_CST");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:110:9: ( INT_CST -> ^( INT_CST ) | IDF -> IDF | '(' expression ')' -> expression )
            int alt24=3;
            switch ( input.LA(1) ) {
            case INT_CST:
                {
                alt24=1;
                }
                break;
            case IDF:
                {
                alt24=2;
                }
                break;
            case 41:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // Looc.g:110:11: INT_CST
                    {
                    INT_CST115=(Token)match(input,INT_CST,FOLLOW_INT_CST_in_exprio81155);  
                    stream_INT_CST.add(INT_CST115);



                    // AST REWRITE
                    // elements: INT_CST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 110:19: -> ^( INT_CST )
                    {
                        // Looc.g:110:22: ^( INT_CST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_INT_CST.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:111:11: IDF
                    {
                    IDF116=(Token)match(input,IDF,FOLLOW_IDF_in_exprio81173);  
                    stream_IDF.add(IDF116);



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
                    // 111:15: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:112:11: '(' expression ')'
                    {
                    char_literal117=(Token)match(input,41,FOLLOW_41_in_exprio81189);  
                    stream_41.add(char_literal117);

                    pushFollow(FOLLOW_expression_in_exprio81191);
                    expression118=expression();

                    state._fsp--;

                    stream_expression.add(expression118.getTree());
                    char_literal119=(Token)match(input,42,FOLLOW_42_in_exprio81193);  
                    stream_42.add(char_literal119);



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
                    // 112:30: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

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
    // $ANTLR end "exprio8"

    public static class expressionbis_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionbis"
    // Looc.g:115:1: expressionbis : ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis -> ^( METHODCALLING IDF ( ^( METHODARGS ( expression )* ) )? ( expressionbis )? ) | );
    public final LoocParser.expressionbis_return expressionbis() throws RecognitionException {
        LoocParser.expressionbis_return retval = new LoocParser.expressionbis_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal120=null;
        Token IDF121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Token char_literal126=null;
        LoocParser.expression_return expression123 = null;

        LoocParser.expression_return expression125 = null;

        LoocParser.expressionbis_return expressionbis127 = null;


        CommonTree char_literal120_tree=null;
        CommonTree IDF121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal126_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionbis=new RewriteRuleSubtreeStream(adaptor,"rule expressionbis");
        try {
            // Looc.g:115:14: ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis -> ^( METHODCALLING IDF ( ^( METHODARGS ( expression )* ) )? ( expressionbis )? ) | )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==78) ) {
                alt27=1;
            }
            else if ( (LA27_0==42||LA27_0==45||LA27_0==51||LA27_0==54||(LA27_0>=59 && LA27_0<=60)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // Looc.g:115:18: '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis
                    {
                    char_literal120=(Token)match(input,78,FOLLOW_78_in_expressionbis1215);  
                    stream_78.add(char_literal120);

                    IDF121=(Token)match(input,IDF,FOLLOW_IDF_in_expressionbis1218);  
                    stream_IDF.add(IDF121);

                    char_literal122=(Token)match(input,41,FOLLOW_41_in_expressionbis1220);  
                    stream_41.add(char_literal122);

                    // Looc.g:115:31: ( expression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=IDF && LA25_0<=INT_CST)||LA25_0==41||(LA25_0>=66 && LA25_0<=68)||LA25_0==70) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Looc.g:115:32: expression
                            {
                            pushFollow(FOLLOW_expression_in_expressionbis1223);
                            expression123=expression();

                            state._fsp--;

                            stream_expression.add(expression123.getTree());

                            }
                            break;

                    }

                    // Looc.g:115:45: ( ',' expression )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==51) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Looc.g:115:46: ',' expression
                    	    {
                    	    char_literal124=(Token)match(input,51,FOLLOW_51_in_expressionbis1228);  
                    	    stream_51.add(char_literal124);

                    	    pushFollow(FOLLOW_expression_in_expressionbis1230);
                    	    expression125=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression125.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    char_literal126=(Token)match(input,42,FOLLOW_42_in_expressionbis1234);  
                    stream_42.add(char_literal126);

                    pushFollow(FOLLOW_expressionbis_in_expressionbis1236);
                    expressionbis127=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis127.getTree());


                    // AST REWRITE
                    // elements: IDF, expressionbis, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:81: -> ^( METHODCALLING IDF ( ^( METHODARGS ( expression )* ) )? ( expressionbis )? )
                    {
                        // Looc.g:115:84: ^( METHODCALLING IDF ( ^( METHODARGS ( expression )* ) )? ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODCALLING, "METHODCALLING"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Looc.g:115:104: ( ^( METHODARGS ( expression )* ) )?
                        if ( stream_expression.hasNext() ) {
                            // Looc.g:115:104: ^( METHODARGS ( expression )* )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODARGS, "METHODARGS"), root_2);

                            // Looc.g:115:118: ( expression )*
                            while ( stream_expression.hasNext() ) {
                                adaptor.addChild(root_2, stream_expression.nextTree());

                            }
                            stream_expression.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        // Looc.g:115:134: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_1, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:117:15: 
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
    // $ANTLR end "expressionbis"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_decl_in_program203 = new BitSet(new long[]{0x9222084020000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_decl_ins_in_program207 = new BitSet(new long[]{0x9222080020000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_38_in_class_decl231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl233 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_class_decl236 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl238 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_class_decl242 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_class_decl244 = new BitSet(new long[]{0x00010C0000000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl246 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_class_decl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_class_item_decl272 = new BitSet(new long[]{0x0001080000000002L});
    public static final BitSet FOLLOW_var_decl_in_decl291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_decl_in_decl301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_decl_ins315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_decl_ins329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_var_decl347 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDF_in_var_decl349 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_var_decl351 = new BitSet(new long[]{0x0000C00010000000L});
    public static final BitSet FOLLOW_type_in_var_decl353 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_var_decl355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDFC_in_type374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_type390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_type406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_method_decl426 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDF_in_method_decl428 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_method_decl430 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_method_args_in_method_decl432 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_method_decl435 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_44_in_method_decl438 = new BitSet(new long[]{0x0000C00010000000L});
    public static final BitSet FOLLOW_type_in_method_decl440 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_method_decl444 = new BitSet(new long[]{0x9226080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_decl_ins_in_method_decl446 = new BitSet(new long[]{0x9226080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_50_in_method_decl449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args481 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_method_args483 = new BitSet(new long[]{0x0000C00010000000L});
    public static final BitSet FOLLOW_type_in_method_args485 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_method_args488 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDF_in_method_args490 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_method_args492 = new BitSet(new long[]{0x0000C00010000000L});
    public static final BitSet FOLLOW_type_in_method_args494 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_IDF_in_instruction528 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_instruction530 = new BitSet(new long[]{0x40000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_affectation_in_instruction532 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_instruction534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_instruction561 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_instruction563 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_instruction565 = new BitSet(new long[]{0x9222080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instruction_in_instruction569 = new BitSet(new long[]{0x93A2080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_55_in_instruction573 = new BitSet(new long[]{0x9222080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instruction_in_instruction577 = new BitSet(new long[]{0x9322080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_56_in_instruction582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_instruction624 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDF_in_instruction626 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction628 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_instruction630 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_instruction632 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_instruction634 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_instruction636 = new BitSet(new long[]{0x9222080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_instruction_in_instruction638 = new BitSet(new long[]{0xB222080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_61_in_instruction641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_instruction677 = new BitSet(new long[]{0x9226080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_decl_ins_in_instruction679 = new BitSet(new long[]{0x9226080020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_50_in_instruction682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_instruction711 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_instruction713 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_instruction715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstate_in_instruction777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_affectation798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_affectation815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_print836 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_print838 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_print840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_read857 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDF_in_read859 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_read861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_returnstate878 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_returnstate880 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_returnstate882 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_returnstate884 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_returnstate886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_expression903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expressionbis_in_expression905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_expression930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expressionbis_in_expression932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_CST_in_expression957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expressionbis_in_expression959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression984 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDFC_in_expression986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expressionbis_in_expression988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprio1_in_expression1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expressionbis_in_expression1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprio2_in_exprio11044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_exprio11048 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio2_in_exprio11051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_70_in_exprio11055 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio2_in_exprio11058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_exprio4_in_exprio21069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_exprio21073 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio4_in_exprio21076 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_exprio7_in_exprio41087 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_72_in_exprio41091 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio7_in_exprio41094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_73_in_exprio41098 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio7_in_exprio41101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_74_in_exprio41105 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio7_in_exprio41108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_75_in_exprio41112 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio7_in_exprio41115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_76_in_exprio41119 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio7_in_exprio41122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_77_in_exprio41126 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio7_in_exprio41129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003F00L});
    public static final BitSet FOLLOW_70_in_exprio71141 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprio8_in_exprio71146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_CST_in_exprio81155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exprio81173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_exprio81189 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_exprio81191 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_exprio81193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_expressionbis1215 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDF_in_expressionbis1218 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_expressionbis1220 = new BitSet(new long[]{0x00080600E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_expressionbis1223 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_51_in_expressionbis1228 = new BitSet(new long[]{0x00000200E0000000L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_expressionbis1230 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_42_in_expressionbis1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expressionbis_in_expressionbis1236 = new BitSet(new long[]{0x0000000000000002L});

}