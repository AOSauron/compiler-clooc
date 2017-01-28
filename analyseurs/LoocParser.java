// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-01-28 19:35:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "CLASS", "VARDEC", "METHODDEC", "METHODARG", "AFFECT", "IF", "FOR", "GROUP", "WRITE", "READ", "RETURN", "EXPR", "NEW", "METHODCALLING", "THIS", "SUPER", "NEG", "VIDE", "INT", "STRING", "ARG", "BLOCK", "DO", "ELSE", "IDFC", "IDF", "CSTE_ENT", "CSTE_CHAINE", "ESC_SEQ", "WS", "COMMENT", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'nil'", "'write'", "'read'", "'return'", "'this'", "'super'", "'new'", "'-'", "'.'", "'+'", "'*'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
    };
    public static final int EOF=-1;
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
    public static final int T__79=79;
    public static final int PROGRAM=4;
    public static final int CLASS=5;
    public static final int VARDEC=6;
    public static final int METHODDEC=7;
    public static final int METHODARG=8;
    public static final int AFFECT=9;
    public static final int IF=10;
    public static final int FOR=11;
    public static final int GROUP=12;
    public static final int WRITE=13;
    public static final int READ=14;
    public static final int RETURN=15;
    public static final int EXPR=16;
    public static final int NEW=17;
    public static final int METHODCALLING=18;
    public static final int THIS=19;
    public static final int SUPER=20;
    public static final int NEG=21;
    public static final int VIDE=22;
    public static final int INT=23;
    public static final int STRING=24;
    public static final int ARG=25;
    public static final int BLOCK=26;
    public static final int DO=27;
    public static final int ELSE=28;
    public static final int IDFC=29;
    public static final int IDF=30;
    public static final int CSTE_ENT=31;
    public static final int CSTE_CHAINE=32;
    public static final int ESC_SEQ=33;
    public static final int WS=34;
    public static final int COMMENT=35;
    public static final int UNICODE_ESC=36;
    public static final int OCTAL_ESC=37;
    public static final int HEX_DIGIT=38;

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


       /** Return a list of all ancestors of this node.  The first node of
       *  list is the root and the last is the parent of this node.
       * @param <T>
       * @param t
       * @return
       */
      public static List<? extends Tree> getAncestors( Tree t) {

          List<Tree> ancestors = new ArrayList<>();
          t = t.getParent();
          while ( t!=null ) {
              ancestors.add(0, t); // insert at start
              t = t.getParent();
          }

          return ancestors;
      }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Looc.g:66:1: program : ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ ) ;
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
            // Looc.g:66:8: ( ( class_decl )* ( var_decl )* ( instruction )+ -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ ) )
            // Looc.g:66:12: ( class_decl )* ( var_decl )* ( instruction )+
            {
            // Looc.g:66:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:66:13: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program215);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    stream_class_decl.add(class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Looc.g:66:26: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:66:27: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_program220);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Looc.g:66:38: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==50||LA3_0==54||LA3_0==58||LA3_0==61||(LA3_0>=64 && LA3_0<=66)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:66:39: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_program225);
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
            // 66:53: -> ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ )
            {
                // Looc.g:66:56: ^( PROGRAM ( class_decl )* ( var_decl )* ( instruction )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // Looc.g:66:66: ( class_decl )*
                while ( stream_class_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_decl.nextTree());

                }
                stream_class_decl.reset();
                // Looc.g:66:80: ( var_decl )*
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
    // Looc.g:68:1: class_decl : 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC ( IDFC )? class_item_decl ) ;
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
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_class_item_decl=new RewriteRuleSubtreeStream(adaptor,"rule class_item_decl");
        try {
            // Looc.g:68:11: ( 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')' -> ^( CLASS IDFC ( IDFC )? class_item_decl ) )
            // Looc.g:68:15: 'class' IDFC ( 'inherit' IDFC )? '=' '(' class_item_decl ')'
            {
            string_literal4=(Token)match(input,39,FOLLOW_39_in_class_decl257);  
            stream_39.add(string_literal4);

            IDFC5=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl259);  
            stream_IDFC.add(IDFC5);

            // Looc.g:68:28: ( 'inherit' IDFC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Looc.g:68:29: 'inherit' IDFC
                    {
                    string_literal6=(Token)match(input,40,FOLLOW_40_in_class_decl262);  
                    stream_40.add(string_literal6);

                    IDFC7=(Token)match(input,IDFC,FOLLOW_IDFC_in_class_decl264);  
                    stream_IDFC.add(IDFC7);


                    }
                    break;

            }

            char_literal8=(Token)match(input,41,FOLLOW_41_in_class_decl268);  
            stream_41.add(char_literal8);

            char_literal9=(Token)match(input,42,FOLLOW_42_in_class_decl270);  
            stream_42.add(char_literal9);

            pushFollow(FOLLOW_class_item_decl_in_class_decl272);
            class_item_decl10=class_item_decl();

            state._fsp--;

            stream_class_item_decl.add(class_item_decl10.getTree());
            char_literal11=(Token)match(input,43,FOLLOW_43_in_class_decl274);  
            stream_43.add(char_literal11);



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
            // 68:74: -> ^( CLASS IDFC ( IDFC )? class_item_decl )
            {
                // Looc.g:68:77: ^( CLASS IDFC ( IDFC )? class_item_decl )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLASS, "CLASS"), root_1);

                adaptor.addChild(root_1, stream_IDFC.nextNode());
                // Looc.g:68:90: ( IDFC )?
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
    // Looc.g:70:1: class_item_decl : ( var_decl )* ( method_decl )* -> ^( BLOCK ( var_decl )* ( method_decl )* ) ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;


        RewriteRuleSubtreeStream stream_method_decl=new RewriteRuleSubtreeStream(adaptor,"rule method_decl");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // Looc.g:70:16: ( ( var_decl )* ( method_decl )* -> ^( BLOCK ( var_decl )* ( method_decl )* ) )
            // Looc.g:70:20: ( var_decl )* ( method_decl )*
            {
            // Looc.g:70:20: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==44) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:70:21: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl299);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Looc.g:70:32: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==49) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:70:33: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl304);
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
            // 70:47: -> ^( BLOCK ( var_decl )* ( method_decl )* )
            {
                // Looc.g:70:50: ^( BLOCK ( var_decl )* ( method_decl )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // Looc.g:70:58: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                // Looc.g:70:70: ( method_decl )*
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
    // Looc.g:72:1: var_decl : 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) ;
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:72:9: ( 'var' IDF ':' type ';' -> ^( VARDEC IDF type ) )
            // Looc.g:72:13: 'var' IDF ':' type ';'
            {
            string_literal14=(Token)match(input,44,FOLLOW_44_in_var_decl331);  
            stream_44.add(string_literal14);

            IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl333);  
            stream_IDF.add(IDF15);

            char_literal16=(Token)match(input,45,FOLLOW_45_in_var_decl335);  
            stream_45.add(char_literal16);

            pushFollow(FOLLOW_type_in_var_decl337);
            type17=type();

            state._fsp--;

            stream_type.add(type17.getTree());
            char_literal18=(Token)match(input,46,FOLLOW_46_in_var_decl339);  
            stream_46.add(char_literal18);



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
            // 72:36: -> ^( VARDEC IDF type )
            {
                // Looc.g:72:39: ^( VARDEC IDF type )
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
    // Looc.g:74:1: type : ( IDFC -> ^( IDFC ) | 'int' -> ^( INT ) | 'string' -> ^( STRING ) );
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
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");

        try {
            // Looc.g:74:5: ( IDFC -> ^( IDFC ) | 'int' -> ^( INT ) | 'string' -> ^( STRING ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case IDFC:
                {
                alt7=1;
                }
                break;
            case 47:
                {
                alt7=2;
                }
                break;
            case 48:
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
                    // Looc.g:74:9: IDFC
                    {
                    IDFC19=(Token)match(input,IDFC,FOLLOW_IDFC_in_type358);  
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
                    // 74:14: -> ^( IDFC )
                    {
                        // Looc.g:74:17: ^( IDFC )
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
                    // Looc.g:75:9: 'int'
                    {
                    string_literal20=(Token)match(input,47,FOLLOW_47_in_type374);  
                    stream_47.add(string_literal20);



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
                    // 75:15: -> ^( INT )
                    {
                        // Looc.g:75:18: ^( INT )
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
                    // Looc.g:76:9: 'string'
                    {
                    string_literal21=(Token)match(input,48,FOLLOW_48_in_type390);  
                    stream_48.add(string_literal21);



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
                    // 76:18: -> ^( STRING )
                    {
                        // Looc.g:76:21: ^( STRING )
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
    // Looc.g:79:1: method_decl : 'method' IDF '(' ( method_args )? ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ^( METHODDEC IDF ( method_args )? ( type )? ( var_decl )* ^( BLOCK ( instruction )+ ) ) ;
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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_method_args=new RewriteRuleSubtreeStream(adaptor,"rule method_args");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:79:12: ( 'method' IDF '(' ( method_args )? ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}' -> ^( METHODDEC IDF ( method_args )? ( type )? ( var_decl )* ^( BLOCK ( instruction )+ ) ) )
            // Looc.g:79:16: 'method' IDF '(' ( method_args )? ')' ( ':' type )? '{' ( var_decl )* ( instruction )+ '}'
            {
            string_literal22=(Token)match(input,49,FOLLOW_49_in_method_decl410);  
            stream_49.add(string_literal22);

            IDF23=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl412);  
            stream_IDF.add(IDF23);

            char_literal24=(Token)match(input,42,FOLLOW_42_in_method_decl414);  
            stream_42.add(char_literal24);

            // Looc.g:79:33: ( method_args )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDF) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Looc.g:79:33: method_args
                    {
                    pushFollow(FOLLOW_method_args_in_method_decl416);
                    method_args25=method_args();

                    state._fsp--;

                    stream_method_args.add(method_args25.getTree());

                    }
                    break;

            }

            char_literal26=(Token)match(input,43,FOLLOW_43_in_method_decl419);  
            stream_43.add(char_literal26);

            // Looc.g:79:50: ( ':' type )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==45) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Looc.g:79:51: ':' type
                    {
                    char_literal27=(Token)match(input,45,FOLLOW_45_in_method_decl422);  
                    stream_45.add(char_literal27);

                    pushFollow(FOLLOW_type_in_method_decl424);
                    type28=type();

                    state._fsp--;

                    stream_type.add(type28.getTree());

                    }
                    break;

            }

            char_literal29=(Token)match(input,50,FOLLOW_50_in_method_decl428);  
            stream_50.add(char_literal29);

            // Looc.g:79:66: ( var_decl )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Looc.g:79:66: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_method_decl430);
            	    var_decl30=var_decl();

            	    state._fsp--;

            	    stream_var_decl.add(var_decl30.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // Looc.g:79:76: ( instruction )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDF||LA11_0==50||LA11_0==54||LA11_0==58||LA11_0==61||(LA11_0>=64 && LA11_0<=66)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Looc.g:79:76: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_method_decl433);
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

            char_literal32=(Token)match(input,51,FOLLOW_51_in_method_decl436);  
            stream_51.add(char_literal32);



            // AST REWRITE
            // elements: type, instruction, var_decl, IDF, method_args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 79:93: -> ^( METHODDEC IDF ( method_args )? ( type )? ( var_decl )* ^( BLOCK ( instruction )+ ) )
            {
                // Looc.g:79:96: ^( METHODDEC IDF ( method_args )? ( type )? ( var_decl )* ^( BLOCK ( instruction )+ ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODDEC, "METHODDEC"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Looc.g:79:112: ( method_args )?
                if ( stream_method_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_method_args.nextTree());

                }
                stream_method_args.reset();
                // Looc.g:79:125: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // Looc.g:79:131: ( var_decl )*
                while ( stream_var_decl.hasNext() ) {
                    adaptor.addChild(root_1, stream_var_decl.nextTree());

                }
                stream_var_decl.reset();
                // Looc.g:79:141: ^( BLOCK ( instruction )+ )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);

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
    // Looc.g:81:1: method_args : IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARG ^( ARG IDF type ) ( ^( ARG IDF type ) )* ) ;
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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Looc.g:81:12: ( IDF ':' type ( ',' IDF ':' type )* -> ^( METHODARG ^( ARG IDF type ) ( ^( ARG IDF type ) )* ) )
            // Looc.g:81:16: IDF ':' type ( ',' IDF ':' type )*
            {
            IDF33=(Token)match(input,IDF,FOLLOW_IDF_in_method_args469);  
            stream_IDF.add(IDF33);

            char_literal34=(Token)match(input,45,FOLLOW_45_in_method_args471);  
            stream_45.add(char_literal34);

            pushFollow(FOLLOW_type_in_method_args473);
            type35=type();

            state._fsp--;

            stream_type.add(type35.getTree());
            // Looc.g:81:29: ( ',' IDF ':' type )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==52) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Looc.g:81:30: ',' IDF ':' type
            	    {
            	    char_literal36=(Token)match(input,52,FOLLOW_52_in_method_args476);  
            	    stream_52.add(char_literal36);

            	    IDF37=(Token)match(input,IDF,FOLLOW_IDF_in_method_args478);  
            	    stream_IDF.add(IDF37);

            	    char_literal38=(Token)match(input,45,FOLLOW_45_in_method_args480);  
            	    stream_45.add(char_literal38);

            	    pushFollow(FOLLOW_type_in_method_args482);
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
            // elements: type, type, IDF, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 81:49: -> ^( METHODARG ^( ARG IDF type ) ( ^( ARG IDF type ) )* )
            {
                // Looc.g:81:52: ^( METHODARG ^( ARG IDF type ) ( ^( ARG IDF type ) )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODARG, "METHODARG"), root_1);

                // Looc.g:81:64: ^( ARG IDF type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, "ARG"), root_2);

                adaptor.addChild(root_2, stream_IDF.nextNode());
                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Looc.g:81:80: ( ^( ARG IDF type ) )*
                while ( stream_type.hasNext()||stream_IDF.hasNext() ) {
                    // Looc.g:81:80: ^( ARG IDF type )
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
    // Looc.g:83:1: instruction : ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' (a+= instruction )* ( 'else' (b+= instruction )* )? 'fi' -> ^( IF expression ^( DO ( $a)* ) ( ^( ELSE ( $b)* ) )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ^( DO ( instruction )+ ) ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( GROUP ( var_decl )* ( instruction )+ ) | 'do' expression ';' -> expression | print | read | returnstate );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF40=null;
        Token string_literal41=null;
        Token char_literal43=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal47=null;
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
        List list_a=null;
        List list_b=null;
        LoocParser.affectation_return affectation42 = null;

        LoocParser.expression_return expression45 = null;

        LoocParser.expression_return expression52 = null;

        LoocParser.expression_return expression54 = null;

        LoocParser.instruction_return instruction56 = null;

        LoocParser.var_decl_return var_decl59 = null;

        LoocParser.instruction_return instruction60 = null;

        LoocParser.expression_return expression63 = null;

        LoocParser.print_return print65 = null;

        LoocParser.read_return read66 = null;

        LoocParser.returnstate_return returnstate67 = null;

        RuleReturnScope a = null;
        RuleReturnScope b = null;
        CommonTree IDF40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal47_tree=null;
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
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_affectation=new RewriteRuleSubtreeStream(adaptor,"rule affectation");
        try {
            // Looc.g:83:12: ( IDF ':=' affectation ';' -> ^( AFFECT IDF affectation ) | 'if' expression 'then' (a+= instruction )* ( 'else' (b+= instruction )* )? 'fi' -> ^( IF expression ^( DO ( $a)* ) ( ^( ELSE ( $b)* ) )? ) | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' -> ^( FOR IDF expression expression ^( DO ( instruction )+ ) ) | '{' ( var_decl )* ( instruction )+ '}' -> ^( GROUP ( var_decl )* ( instruction )+ ) | 'do' expression ';' -> expression | print | read | returnstate )
            int alt19=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt19=1;
                }
                break;
            case 54:
                {
                alt19=2;
                }
                break;
            case 58:
                {
                alt19=3;
                }
                break;
            case 50:
                {
                alt19=4;
                }
                break;
            case 61:
                {
                alt19=5;
                }
                break;
            case 64:
                {
                alt19=6;
                }
                break;
            case 65:
                {
                alt19=7;
                }
                break;
            case 66:
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
                    // Looc.g:83:16: IDF ':=' affectation ';'
                    {
                    IDF40=(Token)match(input,IDF,FOLLOW_IDF_in_instruction516);  
                    stream_IDF.add(IDF40);

                    string_literal41=(Token)match(input,53,FOLLOW_53_in_instruction518);  
                    stream_53.add(string_literal41);

                    pushFollow(FOLLOW_affectation_in_instruction520);
                    affectation42=affectation();

                    state._fsp--;

                    stream_affectation.add(affectation42.getTree());
                    char_literal43=(Token)match(input,46,FOLLOW_46_in_instruction522);  
                    stream_46.add(char_literal43);



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
                    // 83:41: -> ^( AFFECT IDF affectation )
                    {
                        // Looc.g:83:44: ^( AFFECT IDF affectation )
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
                    // Looc.g:84:16: 'if' expression 'then' (a+= instruction )* ( 'else' (b+= instruction )* )? 'fi'
                    {
                    string_literal44=(Token)match(input,54,FOLLOW_54_in_instruction549);  
                    stream_54.add(string_literal44);

                    pushFollow(FOLLOW_expression_in_instruction551);
                    expression45=expression();

                    state._fsp--;

                    stream_expression.add(expression45.getTree());
                    string_literal46=(Token)match(input,55,FOLLOW_55_in_instruction553);  
                    stream_55.add(string_literal46);

                    // Looc.g:84:40: (a+= instruction )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IDF||LA13_0==50||LA13_0==54||LA13_0==58||LA13_0==61||(LA13_0>=64 && LA13_0<=66)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Looc.g:84:40: a+= instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction557);
                    	    a=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(a.getTree());
                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // Looc.g:84:55: ( 'else' (b+= instruction )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==56) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Looc.g:84:56: 'else' (b+= instruction )*
                            {
                            string_literal47=(Token)match(input,56,FOLLOW_56_in_instruction561);  
                            stream_56.add(string_literal47);

                            // Looc.g:84:64: (b+= instruction )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==IDF||LA14_0==50||LA14_0==54||LA14_0==58||LA14_0==61||(LA14_0>=64 && LA14_0<=66)) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // Looc.g:84:64: b+= instruction
                            	    {
                            	    pushFollow(FOLLOW_instruction_in_instruction565);
                            	    b=instruction();

                            	    state._fsp--;

                            	    stream_instruction.add(b.getTree());
                            	    if (list_b==null) list_b=new ArrayList();
                            	    list_b.add(b.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    string_literal48=(Token)match(input,57,FOLLOW_57_in_instruction570);  
                    stream_57.add(string_literal48);



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
                    // 84:86: -> ^( IF expression ^( DO ( $a)* ) ( ^( ELSE ( $b)* ) )? )
                    {
                        // Looc.g:84:89: ^( IF expression ^( DO ( $a)* ) ( ^( ELSE ( $b)* ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // Looc.g:84:105: ^( DO ( $a)* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DO, "DO"), root_2);

                        // Looc.g:84:110: ( $a)*
                        while ( stream_a.hasNext() ) {
                            adaptor.addChild(root_2, stream_a.nextTree());

                        }
                        stream_a.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // Looc.g:84:115: ( ^( ELSE ( $b)* ) )?
                        if ( stream_b.hasNext() ) {
                            // Looc.g:84:115: ^( ELSE ( $b)* )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);

                            // Looc.g:84:122: ( $b)*
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
                    // Looc.g:85:16: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    string_literal49=(Token)match(input,58,FOLLOW_58_in_instruction612);  
                    stream_58.add(string_literal49);

                    IDF50=(Token)match(input,IDF,FOLLOW_IDF_in_instruction614);  
                    stream_IDF.add(IDF50);

                    string_literal51=(Token)match(input,59,FOLLOW_59_in_instruction616);  
                    stream_59.add(string_literal51);

                    pushFollow(FOLLOW_expression_in_instruction618);
                    expression52=expression();

                    state._fsp--;

                    stream_expression.add(expression52.getTree());
                    string_literal53=(Token)match(input,60,FOLLOW_60_in_instruction620);  
                    stream_60.add(string_literal53);

                    pushFollow(FOLLOW_expression_in_instruction622);
                    expression54=expression();

                    state._fsp--;

                    stream_expression.add(expression54.getTree());
                    string_literal55=(Token)match(input,61,FOLLOW_61_in_instruction624);  
                    stream_61.add(string_literal55);

                    // Looc.g:85:63: ( instruction )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==IDF||LA16_0==50||LA16_0==54||LA16_0==58||LA16_0==61||(LA16_0>=64 && LA16_0<=66)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Looc.g:85:63: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction626);
                    	    instruction56=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction56.getTree());

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

                    string_literal57=(Token)match(input,62,FOLLOW_62_in_instruction629);  
                    stream_62.add(string_literal57);



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
                    // 85:82: -> ^( FOR IDF expression expression ^( DO ( instruction )+ ) )
                    {
                        // Looc.g:85:85: ^( FOR IDF expression expression ^( DO ( instruction )+ ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // Looc.g:85:117: ^( DO ( instruction )+ )
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
                    // Looc.g:86:16: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    char_literal58=(Token)match(input,50,FOLLOW_50_in_instruction665);  
                    stream_50.add(char_literal58);

                    // Looc.g:86:20: ( var_decl )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==44) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Looc.g:86:20: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction667);
                    	    var_decl59=var_decl();

                    	    state._fsp--;

                    	    stream_var_decl.add(var_decl59.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // Looc.g:86:30: ( instruction )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==IDF||LA18_0==50||LA18_0==54||LA18_0==58||LA18_0==61||(LA18_0>=64 && LA18_0<=66)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Looc.g:86:30: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction670);
                    	    instruction60=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction60.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    char_literal61=(Token)match(input,51,FOLLOW_51_in_instruction673);  
                    stream_51.add(char_literal61);



                    // AST REWRITE
                    // elements: var_decl, instruction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:47: -> ^( GROUP ( var_decl )* ( instruction )+ )
                    {
                        // Looc.g:86:50: ^( GROUP ( var_decl )* ( instruction )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUP, "GROUP"), root_1);

                        // Looc.g:86:58: ( var_decl )*
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
                    // Looc.g:87:16: 'do' expression ';'
                    {
                    string_literal62=(Token)match(input,61,FOLLOW_61_in_instruction702);  
                    stream_61.add(string_literal62);

                    pushFollow(FOLLOW_expression_in_instruction704);
                    expression63=expression();

                    state._fsp--;

                    stream_expression.add(expression63.getTree());
                    char_literal64=(Token)match(input,46,FOLLOW_46_in_instruction706);  
                    stream_46.add(char_literal64);



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
                    // 87:36: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Looc.g:88:16: print
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instruction727);
                    print65=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print65.getTree());

                    }
                    break;
                case 7 :
                    // Looc.g:89:16: read
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_read_in_instruction744);
                    read66=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read66.getTree());

                    }
                    break;
                case 8 :
                    // Looc.g:90:16: returnstate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_returnstate_in_instruction761);
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
    // Looc.g:93:1: affectation : ( expression | 'nil' );
    public final LoocParser.affectation_return affectation() throws RecognitionException {
        LoocParser.affectation_return retval = new LoocParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal69=null;
        LoocParser.expression_return expression68 = null;


        CommonTree string_literal69_tree=null;

        try {
            // Looc.g:93:12: ( expression | 'nil' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=IDF && LA20_0<=CSTE_CHAINE)||LA20_0==42||(LA20_0>=67 && LA20_0<=70)) ) {
                alt20=1;
            }
            else if ( (LA20_0==63) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // Looc.g:93:16: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_affectation782);
                    expression68=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression68.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:94:16: 'nil'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal69=(Token)match(input,63,FOLLOW_63_in_affectation799); 
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
    // Looc.g:97:1: print : 'write' expression ';' -> ^( WRITE expression ) ;
    public final LoocParser.print_return print() throws RecognitionException {
        LoocParser.print_return retval = new LoocParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal70=null;
        Token char_literal72=null;
        LoocParser.expression_return expression71 = null;


        CommonTree string_literal70_tree=null;
        CommonTree char_literal72_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:97:6: ( 'write' expression ';' -> ^( WRITE expression ) )
            // Looc.g:97:10: 'write' expression ';'
            {
            string_literal70=(Token)match(input,64,FOLLOW_64_in_print820);  
            stream_64.add(string_literal70);

            pushFollow(FOLLOW_expression_in_print822);
            expression71=expression();

            state._fsp--;

            stream_expression.add(expression71.getTree());
            char_literal72=(Token)match(input,46,FOLLOW_46_in_print824);  
            stream_46.add(char_literal72);



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
            // 97:33: -> ^( WRITE expression )
            {
                // Looc.g:97:36: ^( WRITE expression )
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
    // Looc.g:99:1: read : 'read' IDF ';' -> ^( READ IDF ) ;
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
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            // Looc.g:99:5: ( 'read' IDF ';' -> ^( READ IDF ) )
            // Looc.g:99:9: 'read' IDF ';'
            {
            string_literal73=(Token)match(input,65,FOLLOW_65_in_read841);  
            stream_65.add(string_literal73);

            IDF74=(Token)match(input,IDF,FOLLOW_IDF_in_read843);  
            stream_IDF.add(IDF74);

            char_literal75=(Token)match(input,46,FOLLOW_46_in_read845);  
            stream_46.add(char_literal75);



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
            // 99:24: -> ^( READ IDF )
            {
                // Looc.g:99:27: ^( READ IDF )
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
    // Looc.g:101:1: returnstate : 'return' '(' expression ')' ';' -> ^( RETURN expression ) ;
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
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // Looc.g:101:12: ( 'return' '(' expression ')' ';' -> ^( RETURN expression ) )
            // Looc.g:101:16: 'return' '(' expression ')' ';'
            {
            string_literal76=(Token)match(input,66,FOLLOW_66_in_returnstate862);  
            stream_66.add(string_literal76);

            char_literal77=(Token)match(input,42,FOLLOW_42_in_returnstate864);  
            stream_42.add(char_literal77);

            pushFollow(FOLLOW_expression_in_returnstate866);
            expression78=expression();

            state._fsp--;

            stream_expression.add(expression78.getTree());
            char_literal79=(Token)match(input,43,FOLLOW_43_in_returnstate868);  
            stream_43.add(char_literal79);

            char_literal80=(Token)match(input,46,FOLLOW_46_in_returnstate870);  
            stream_46.add(char_literal80);



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
            // 101:48: -> ^( RETURN expression )
            {
                // Looc.g:101:51: ^( RETURN expression )
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
    // Looc.g:105:1: expression : ( IDF expressionbis -> IDF ( expressionbis )? | 'this' expressionbis -> ^( THIS ( expressionbis )? ) | 'super' expressionbis -> ^( SUPER ( expressionbis )? ) | CSTE_ENT expressionbis -> CSTE_ENT ( expressionbis )? | CSTE_CHAINE expressionbis -> CSTE_CHAINE ( expressionbis )? | 'new' IDFC expressionbis -> ^( NEW IDFC ( expressionbis )? ) | '(' expression ')' expressionbis -> expression ( expressionbis )? | '-' expression expressionbis -> ^( NEG expression ( expressionbis )? ) );
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
        LoocParser.expressionbis_return expressionbis82 = null;

        LoocParser.expressionbis_return expressionbis84 = null;

        LoocParser.expressionbis_return expressionbis86 = null;

        LoocParser.expressionbis_return expressionbis88 = null;

        LoocParser.expressionbis_return expressionbis90 = null;

        LoocParser.expressionbis_return expressionbis93 = null;

        LoocParser.expression_return expression95 = null;

        LoocParser.expressionbis_return expressionbis97 = null;

        LoocParser.expression_return expression99 = null;

        LoocParser.expressionbis_return expressionbis100 = null;


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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_IDFC=new RewriteRuleTokenStream(adaptor,"token IDFC");
        RewriteRuleTokenStream stream_CSTE_CHAINE=new RewriteRuleTokenStream(adaptor,"token CSTE_CHAINE");
        RewriteRuleTokenStream stream_CSTE_ENT=new RewriteRuleTokenStream(adaptor,"token CSTE_ENT");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionbis=new RewriteRuleSubtreeStream(adaptor,"rule expressionbis");
        try {
            // Looc.g:105:11: ( IDF expressionbis -> IDF ( expressionbis )? | 'this' expressionbis -> ^( THIS ( expressionbis )? ) | 'super' expressionbis -> ^( SUPER ( expressionbis )? ) | CSTE_ENT expressionbis -> CSTE_ENT ( expressionbis )? | CSTE_CHAINE expressionbis -> CSTE_CHAINE ( expressionbis )? | 'new' IDFC expressionbis -> ^( NEW IDFC ( expressionbis )? ) | '(' expression ')' expressionbis -> expression ( expressionbis )? | '-' expression expressionbis -> ^( NEG expression ( expressionbis )? ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt21=1;
                }
                break;
            case 67:
                {
                alt21=2;
                }
                break;
            case 68:
                {
                alt21=3;
                }
                break;
            case CSTE_ENT:
                {
                alt21=4;
                }
                break;
            case CSTE_CHAINE:
                {
                alt21=5;
                }
                break;
            case 69:
                {
                alt21=6;
                }
                break;
            case 42:
                {
                alt21=7;
                }
                break;
            case 70:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // Looc.g:105:15: IDF expressionbis
                    {
                    IDF81=(Token)match(input,IDF,FOLLOW_IDF_in_expression890);  
                    stream_IDF.add(IDF81);

                    pushFollow(FOLLOW_expressionbis_in_expression892);
                    expressionbis82=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis82.getTree());


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
                    // 105:33: -> IDF ( expressionbis )?
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());
                        // Looc.g:105:40: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_0, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Looc.g:106:15: 'this' expressionbis
                    {
                    string_literal83=(Token)match(input,67,FOLLOW_67_in_expression917);  
                    stream_67.add(string_literal83);

                    pushFollow(FOLLOW_expressionbis_in_expression919);
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
                    // 106:36: -> ^( THIS ( expressionbis )? )
                    {
                        // Looc.g:106:39: ^( THIS ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THIS, "THIS"), root_1);

                        // Looc.g:106:46: ( expressionbis )?
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
                    // Looc.g:107:15: 'super' expressionbis
                    {
                    string_literal85=(Token)match(input,68,FOLLOW_68_in_expression944);  
                    stream_68.add(string_literal85);

                    pushFollow(FOLLOW_expressionbis_in_expression946);
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
                    // 107:37: -> ^( SUPER ( expressionbis )? )
                    {
                        // Looc.g:107:40: ^( SUPER ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER, "SUPER"), root_1);

                        // Looc.g:107:48: ( expressionbis )?
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
                    // Looc.g:108:15: CSTE_ENT expressionbis
                    {
                    CSTE_ENT87=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression971);  
                    stream_CSTE_ENT.add(CSTE_ENT87);

                    pushFollow(FOLLOW_expressionbis_in_expression973);
                    expressionbis88=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis88.getTree());


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
                    // 108:38: -> CSTE_ENT ( expressionbis )?
                    {
                        adaptor.addChild(root_0, stream_CSTE_ENT.nextNode());
                        // Looc.g:108:50: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_0, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Looc.g:109:15: CSTE_CHAINE expressionbis
                    {
                    CSTE_CHAINE89=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_expression996);  
                    stream_CSTE_CHAINE.add(CSTE_CHAINE89);

                    pushFollow(FOLLOW_expressionbis_in_expression998);
                    expressionbis90=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis90.getTree());


                    // AST REWRITE
                    // elements: CSTE_CHAINE, expressionbis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 109:41: -> CSTE_CHAINE ( expressionbis )?
                    {
                        adaptor.addChild(root_0, stream_CSTE_CHAINE.nextNode());
                        // Looc.g:109:56: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_0, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Looc.g:110:15: 'new' IDFC expressionbis
                    {
                    string_literal91=(Token)match(input,69,FOLLOW_69_in_expression1021);  
                    stream_69.add(string_literal91);

                    IDFC92=(Token)match(input,IDFC,FOLLOW_IDFC_in_expression1023);  
                    stream_IDFC.add(IDFC92);

                    pushFollow(FOLLOW_expressionbis_in_expression1025);
                    expressionbis93=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis93.getTree());


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
                    // 110:40: -> ^( NEW IDFC ( expressionbis )? )
                    {
                        // Looc.g:110:43: ^( NEW IDFC ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_IDFC.nextNode());
                        // Looc.g:110:54: ( expressionbis )?
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
                case 7 :
                    // Looc.g:111:15: '(' expression ')' expressionbis
                    {
                    char_literal94=(Token)match(input,42,FOLLOW_42_in_expression1052);  
                    stream_42.add(char_literal94);

                    pushFollow(FOLLOW_expression_in_expression1054);
                    expression95=expression();

                    state._fsp--;

                    stream_expression.add(expression95.getTree());
                    char_literal96=(Token)match(input,43,FOLLOW_43_in_expression1056);  
                    stream_43.add(char_literal96);

                    pushFollow(FOLLOW_expressionbis_in_expression1058);
                    expressionbis97=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis97.getTree());


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
                    // 111:48: -> expression ( expressionbis )?
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());
                        // Looc.g:111:62: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_0, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // Looc.g:112:15: '-' expression expressionbis
                    {
                    char_literal98=(Token)match(input,70,FOLLOW_70_in_expression1081);  
                    stream_70.add(char_literal98);

                    pushFollow(FOLLOW_expression_in_expression1083);
                    expression99=expression();

                    state._fsp--;

                    stream_expression.add(expression99.getTree());
                    pushFollow(FOLLOW_expressionbis_in_expression1085);
                    expressionbis100=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis100.getTree());


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
                    // 112:44: -> ^( NEG expression ( expressionbis )? )
                    {
                        // Looc.g:112:47: ^( NEG expression ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEG, "NEG"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // Looc.g:112:64: ( expressionbis )?
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
    // Looc.g:115:1: expressionbis : ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis -> ^( METHODCALLING IDF ( ^( ARG ( expression )* ) )? ( expressionbis )? ) | oper expression expressionbis -> ^( oper expression ) ( expressionbis )? | );
    public final LoocParser.expressionbis_return expressionbis() throws RecognitionException {
        LoocParser.expressionbis_return retval = new LoocParser.expressionbis_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal101=null;
        Token IDF102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        LoocParser.expression_return expression104 = null;

        LoocParser.expression_return expression106 = null;

        LoocParser.expressionbis_return expressionbis108 = null;

        LoocParser.oper_return oper109 = null;

        LoocParser.expression_return expression110 = null;

        LoocParser.expressionbis_return expressionbis111 = null;


        CommonTree char_literal101_tree=null;
        CommonTree IDF102_tree=null;
        CommonTree char_literal103_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_oper=new RewriteRuleSubtreeStream(adaptor,"rule oper");
        RewriteRuleSubtreeStream stream_expressionbis=new RewriteRuleSubtreeStream(adaptor,"rule expressionbis");
        try {
            // Looc.g:115:14: ( '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis -> ^( METHODCALLING IDF ( ^( ARG ( expression )* ) )? ( expressionbis )? ) | oper expression expressionbis -> ^( oper expression ) ( expressionbis )? | )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt24=1;
                }
                break;
            case 70:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt24=2;
                }
                break;
            case 43:
            case 46:
            case 52:
            case 55:
            case 60:
            case 61:
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
                    // Looc.g:115:18: '.' IDF '(' ( expression )? ( ',' expression )* ')' expressionbis
                    {
                    char_literal101=(Token)match(input,71,FOLLOW_71_in_expressionbis1116);  
                    stream_71.add(char_literal101);

                    IDF102=(Token)match(input,IDF,FOLLOW_IDF_in_expressionbis1118);  
                    stream_IDF.add(IDF102);

                    char_literal103=(Token)match(input,42,FOLLOW_42_in_expressionbis1120);  
                    stream_42.add(char_literal103);

                    // Looc.g:115:30: ( expression )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=IDF && LA22_0<=CSTE_CHAINE)||LA22_0==42||(LA22_0>=67 && LA22_0<=70)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Looc.g:115:31: expression
                            {
                            pushFollow(FOLLOW_expression_in_expressionbis1123);
                            expression104=expression();

                            state._fsp--;

                            stream_expression.add(expression104.getTree());

                            }
                            break;

                    }

                    // Looc.g:115:44: ( ',' expression )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==52) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Looc.g:115:45: ',' expression
                    	    {
                    	    char_literal105=(Token)match(input,52,FOLLOW_52_in_expressionbis1128);  
                    	    stream_52.add(char_literal105);

                    	    pushFollow(FOLLOW_expression_in_expressionbis1130);
                    	    expression106=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    char_literal107=(Token)match(input,43,FOLLOW_43_in_expressionbis1134);  
                    stream_43.add(char_literal107);

                    pushFollow(FOLLOW_expressionbis_in_expressionbis1136);
                    expressionbis108=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis108.getTree());


                    // AST REWRITE
                    // elements: expression, expressionbis, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 115:80: -> ^( METHODCALLING IDF ( ^( ARG ( expression )* ) )? ( expressionbis )? )
                    {
                        // Looc.g:115:83: ^( METHODCALLING IDF ( ^( ARG ( expression )* ) )? ( expressionbis )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHODCALLING, "METHODCALLING"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Looc.g:115:103: ( ^( ARG ( expression )* ) )?
                        if ( stream_expression.hasNext() ) {
                            // Looc.g:115:103: ^( ARG ( expression )* )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, "ARG"), root_2);

                            // Looc.g:115:109: ( expression )*
                            while ( stream_expression.hasNext() ) {
                                adaptor.addChild(root_2, stream_expression.nextTree());

                            }
                            stream_expression.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        // Looc.g:115:125: ( expressionbis )?
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
                    // Looc.g:116:19: oper expression expressionbis
                    {
                    pushFollow(FOLLOW_oper_in_expressionbis1179);
                    oper109=oper();

                    state._fsp--;

                    stream_oper.add(oper109.getTree());
                    pushFollow(FOLLOW_expression_in_expressionbis1181);
                    expression110=expression();

                    state._fsp--;

                    stream_expression.add(expression110.getTree());
                    pushFollow(FOLLOW_expressionbis_in_expressionbis1183);
                    expressionbis111=expressionbis();

                    state._fsp--;

                    stream_expressionbis.add(expressionbis111.getTree());


                    // AST REWRITE
                    // elements: expressionbis, expression, oper
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 116:49: -> ^( oper expression ) ( expressionbis )?
                    {
                        // Looc.g:116:70: ^( oper expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_oper.nextNode(), root_1);

                        adaptor.addChild(root_1, Tree.parent.getChild(0));
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // Looc.g:116:115: ( expressionbis )?
                        if ( stream_expressionbis.hasNext() ) {
                            adaptor.addChild(root_0, stream_expressionbis.nextTree());

                        }
                        stream_expressionbis.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Looc.g:118:15: 
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

    public static class oper_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // Looc.g:120:1: oper : ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' );
    public final LoocParser.oper_return oper() throws RecognitionException {
        LoocParser.oper_return retval = new LoocParser.oper_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set112=null;

        CommonTree set112_tree=null;

        try {
            // Looc.g:120:5: ( '+' | '-' | '*' | '<' | '<=' | '>' | '>=' | '==' | '!=' )
            // Looc.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set112=(Token)input.LT(1);
            if ( input.LA(1)==70||(input.LA(1)>=72 && input.LA(1)<=79) ) {
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


 

    public static final BitSet FOLLOW_class_decl_in_program215 = new BitSet(new long[]{0x2444108040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_var_decl_in_program220 = new BitSet(new long[]{0x2444100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_instruction_in_program225 = new BitSet(new long[]{0x2444100040000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_39_in_class_decl257 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl259 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_class_decl262 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDFC_in_class_decl264 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_class_decl268 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_class_decl270 = new BitSet(new long[]{0x0002180000000000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl272 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_class_decl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl299 = new BitSet(new long[]{0x0002100000000002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl304 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_44_in_var_decl331 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IDF_in_var_decl333 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_var_decl335 = new BitSet(new long[]{0x0001800020000000L});
    public static final BitSet FOLLOW_type_in_var_decl337 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_var_decl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDFC_in_type358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_type374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_type390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_method_decl410 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IDF_in_method_decl412 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_method_decl414 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_method_args_in_method_decl416 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_method_decl419 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_45_in_method_decl422 = new BitSet(new long[]{0x0001800020000000L});
    public static final BitSet FOLLOW_type_in_method_decl424 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_method_decl428 = new BitSet(new long[]{0x2444100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_var_decl_in_method_decl430 = new BitSet(new long[]{0x2444100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_instruction_in_method_decl433 = new BitSet(new long[]{0x244C100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_51_in_method_decl436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args469 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_method_args471 = new BitSet(new long[]{0x0001800020000000L});
    public static final BitSet FOLLOW_type_in_method_args473 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_method_args476 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IDF_in_method_args478 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_method_args480 = new BitSet(new long[]{0x0001800020000000L});
    public static final BitSet FOLLOW_type_in_method_args482 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_IDF_in_instruction516 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_instruction518 = new BitSet(new long[]{0x80000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_affectation_in_instruction520 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_instruction522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_instruction549 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_instruction551 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_instruction553 = new BitSet(new long[]{0x2744100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_instruction_in_instruction557 = new BitSet(new long[]{0x2744100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_56_in_instruction561 = new BitSet(new long[]{0x2644100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_instruction_in_instruction565 = new BitSet(new long[]{0x2644100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_57_in_instruction570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_instruction612 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IDF_in_instruction614 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_instruction616 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_instruction618 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_instruction620 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_instruction622 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_instruction624 = new BitSet(new long[]{0x2444100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_instruction_in_instruction626 = new BitSet(new long[]{0x6444100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_62_in_instruction629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_instruction665 = new BitSet(new long[]{0x2444100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_var_decl_in_instruction667 = new BitSet(new long[]{0x2444100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_instruction_in_instruction670 = new BitSet(new long[]{0x244C100040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_51_in_instruction673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_instruction702 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_instruction704 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_instruction706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstate_in_instruction761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_affectation782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_affectation799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_print820 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_print822 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_print824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_read841 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IDF_in_read843 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_read845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_returnstate862 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_returnstate864 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_returnstate866 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_returnstate868 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_returnstate870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expression890 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_expression917 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_expression944 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression971 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_expression996 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_expression1021 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_IDFC_in_expression1023 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_expression1052 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_expression1054 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_expression1056 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_expression1081 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_expression1083 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expression1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_expressionbis1116 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IDF_in_expressionbis1118 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expressionbis1120 = new BitSet(new long[]{0x00100C01C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_expressionbis1123 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_52_in_expressionbis1128 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_expressionbis1130 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_43_in_expressionbis1134 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expressionbis1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oper_in_expressionbis1179 = new BitSet(new long[]{0x00000401C0000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_expression_in_expressionbis1181 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_expressionbis_in_expressionbis1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_oper0 = new BitSet(new long[]{0x0000000000000002L});

}