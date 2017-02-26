/*  GRAMMAIRE POUR LE LANGAGE LOOC POUR PROJET DE COMPILATION TELECOM NANCY 2016-2017
Authors :
GARCIA Guillaume
ZAMBAUX Gauthier
HINSBERGER Laure
Maj : 06/02/17   22:24  */

 grammar Looc;

 options {
   k=1;  /* Pour forcer LL(?) => LL(1) */
   output=AST;
   ASTLabelType=CommonTree;
 }

/* Tokens imaginaires pour l'AST */
 tokens {
   PROGRAM;
   CLASS;
   VARDEC;
   METHODDEC;
   METHODARG;
   AFFECT;
   IF;
   FOR;
   GROUP;
   WRITE;
   READ;
   RETURN;
   EXPR;
   NEW;
   METHODCALLING;
   THIS;
   SUPER;
   NEG;
   INT;
   STRING;
   ARG;
   BLOCK;
   DO;
   ELSE;
   OR;
   AND;
   MULTDIVMOD;
   NEGPLUS;
   MINUSPLUS;
   ISGREATERLOWER;
   ISDIFF;
}

@header {
  import java.util.HashMap;
}

@members {
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
          ancestors.add(0, t);
          t = t.getParent();
      }

      return ancestors;
  }

  /* Table des symboles */
  HashMap<String,Integer> memory = new HashMap<String,Integer>();
}

program:   (class_decl)* (var_decl)* (instruction {System.out.println($instruction.idf+" = "+$instruction.value);})+ -> ^(PROGRAM (class_decl)* (var_decl)* (instruction)+);

class_decl:   'class' IDFC ('inherit' IDFC)? '=' '(' class_item_decl ')' -> ^(CLASS IDFC (IDFC)? class_item_decl);

class_item_decl:   (var_decl)* (method_decl)* -> ^(BLOCK (var_decl)* (method_decl)*);

var_decl:   'var' IDF ':' type ';' -> ^(VARDEC IDF type);

type:   IDFC -> ^(IDFC)
    |   'int' -> ^(INT)
    |   'string' -> ^(STRING)
    ;

method_decl:   'method' IDF '(' method_args? ')' (':' type)? '{' var_decl* instruction+ '}' -> ^(METHODDEC IDF method_args? type? var_decl* ^(BLOCK instruction+));

method_args:   IDF ':' type (',' IDF ':' type)* -> ^(METHODARG ^(ARG IDF type) ^(ARG IDF type)*);

instruction returns [int value, String idf]
           :   IDF ':=' aff=affectation {$value=$aff.value;$idf=$IDF.text;memory.put($IDF.text, new Integer($aff.value));} ';' -> ^(AFFECT IDF affectation)
           |   'if' expression 'then' a+=instruction* ('else' b+=instruction*)? 'fi' -> ^(IF expression ^(DO $a*) ^(ELSE $b*)?)
           |   'for' IDF 'in' expression '..' expression 'do' instruction+ 'end' -> ^(FOR IDF expression expression ^(DO instruction+))
           |   '{' var_decl* instruction+ '}' -> ^(GROUP var_decl* instruction+)
           |   'do' expression ';' -> expression
           |   print
           |   read
           |   returnstate
           ;

affectation returns [int value]
           :   expr=expression {$value=$expr.value;}
           |   'nil'
           ;

print:   'write' expression ';' -> ^(WRITE expression);

read:   'read' INT_CST ';' -> ^(READ INT_CST); //'read' IDF ';' -> ^(READ IDF);  //Contradiction dans le sujet !!!!!

returnstate:   'return' '(' expression ')' ';' -> ^(RETURN expression);

expression:   //IDF expressionbis -> IDF expressionbis? /* -> IDF (expressionbis^)?*/
          /*|*/   'this' expressionbis -> ^(THIS expressionbis?)
          |   'super' expressionbis -> ^(SUPER expressionbis?)
          //|   INT_CST expressionbis -> INT_CST expressionbis?
          |   STRING_CST expressionbis -> ^(STRING_CST expressionbis?)
          |   'new' IDFC expressionbis -> ^(NEW IDFC expressionbis?)
          //|   '(' expression ')' expressionbis -> ^(expression expressionbis?)
          //|   '-' expression expressionbis -> ^(NEG expression expressionbis?)
          |   exprio4 expressionbis -> exprio4
          ;

//expression : exprio1 ;

//exprio1 : exprio2 ( '||'^ exprio2)* ;

//exprio2 : exprio3 ( '&&'^ exprio3)* ;

//exprio3 : exprio4 ( '=='^ exprio4 | '!='^ exprio4)* ;

exprio4 : exprio5 ( '=='^ exprio5 | '!='^ exprio5 | '<'^ exprio5 | '<='^ exprio5 | '>'^ exprio5 | '>='^ exprio5)* ;

exprio5 : exprio6 ( '+'^ exprio6 | '-'^ exprio6)* ;

exprio6 : exprio7 ( '*'^ exprio7 /*|  '/'^ exprio7 | '%'^ exprio7*/)* ;

exprio7 : ('-'^)? exprio8 ;

exprio8 : INT_CST -> ^(INT_CST)
        | IDF -> ^(IDF)
        | '(' expression ')' -> expression
        ;

expressionbis:   '.' IDF '(' (expression)? (',' expression)* ')' expressionbis -> ^(METHODCALLING IDF ^(ARG (expression)*)? (expressionbis)?)
            //  |   oper expression expressionbis -> /*{a=g.getId()}*/ /* ^(oper /*{Tree.parent.getChild(0)}*/ /*expression) expressionbis? */
              |   /*Le mot vide*/
              //|   exprio1 -> exprio1

IDFC:   ('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

IDF:   ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT_CST:   '0'..'9'+ ;

STRING_CST:   '"' (ESC_SEQ | ~('\r'|'\n'|'"'|'\\'))+ '"' ;

WS  :   (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;} ;

COMMENT:   '/*' (options {greedy=false;}:.)* '*/' {$channel=HIDDEN;} ;

fragment ESC_SEQ:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
                |   UNICODE_ESC
                |   OCTAL_ESC
                ;

fragment OCTAL_ESC:   '\\' ('0'..'3')('0'..'7')('0'..'7')
                  |   '\\' ('0'..'7')('0'..'7')
                  |   '\\' ('0'..'7')
                  ;

fragment UNICODE_ESC:   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;

fragment HEX_DIGIT:   ('0'..'9'|'a'..'f'|'A'..'F') ;
