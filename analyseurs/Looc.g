/*  GRAMMAIRE POUR LE LANGAGE LOOC POUR PROJET DE COMPILATION TELECOM NANCY 2016-2017
Authors :
GARCIA Guillaume
ZAMBAUX Gauthier
HINSBERGER Laure
Maj : 26/01/17   16:35  */

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
   VIDE;
   INT;
   STRING;
   ARG;
   BLOCK;
   DO;
   ELSE;
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
          ancestors.add(0, t); // insert at start
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

read:   'read' IDF ';' -> ^(READ IDF);

returnstate:   'return' '(' expression ')' ';' -> ^(RETURN expression);

/* expression a dû être dérecursivée gauche. */

expression returns [int value, int valuee]
          :   IDF
            {
              Integer v = (Integer)memory.get($IDF.text);
              if (v!=null) $value=v.intValue();
              else System.err.println("undefined variable "+$IDF);
            } exprbis=expressionbis /*{$valuee=$exprbis.valuee;}*/ -> IDF expressionbis?   /*-> IDF (expressionbis^)?*/
          |   'this' expressionbis -> ^(THIS expressionbis?)
          |   'super' expressionbis -> ^(SUPER expressionbis?)
          |   CSTE_ENT {$value = Integer.parseInt($CSTE_ENT.text);} expressionbis -> CSTE_ENT expressionbis?
          |   CSTE_CHAINE expressionbis -> CSTE_CHAINE expressionbis?
          |   'new' IDFC expressionbis -> ^(NEW IDFC expressionbis?)
          |   '(' expr=expression ')' {$value=$expr.value;} exprbis=expressionbis {$value=$exprbis.value;} -> expression expressionbis?
          |   '-' expression expressionbis -> ^(NEG expression expressionbis?)
          ;

expressionbis returns [int value, int operator, int valuee]
              :   '.' IDF '(' (expression)? (',' expression)* ')' expressionbis -> ^(METHODCALLING IDF ^(ARG (expression)*)? (expressionbis)?)
              |   oper {$operator=$oper.operator;} expr=expression
                {
                    switch ($operator) {
                      case 1: $value += $expr.value;System.out.println($value+" "+$expr.value); break;
                      case 2: $value -= $expr.value; break;
                      case 3: $value *= $expr.value; break;
                      case 4: $value /= $expr.value; break;
                      //case 5: $value \%= $expression.value; break;

                      case 11: if ($value < $expr.value) $value=1;
                               else $value=0;
                               break;
                      case 12: if ($value <= $expr.value) $value=1;
                               else $value=0;
                               break;
                      case 13: if ($value > $expr.value) $value=1;
                               else $value=0;
                               break;
                      case 14: if ($value >= $expr.value) $value=1;
                               else $value=0;
                               break;
                      case 15: if ($value == $expr.value) $value=1;
                               else $value=0;
                               break;
                      case 16: if ($value != $expr.value) $value=1;
                               else $value=0;
                               break;

                      //case 21: $value = $value && $expression.value; break;
                      //case 22: $value = $value || $expression.value; break;

                      default: System.err.println("undefined operator "+$operator); break;
                    }
                }
                exprbis=expressionbis
                /*{
                  $value=$exprbis.value;
                }*/ -> /*{a=g.getId()}*/ ^(oper /*{Tree.parent.getChild(0)}*/ expression) expressionbis?
              |   /*Le mot vide*/
              ;

oper returns [int operator]
    :   '+' {$operator = 1;}
    |   '-' {$operator = 2;}
    |   '*' {$operator = 3;}
    |   '/' {$operator = 4;}
    //|   '\%' {$operator = 5;}*/
    |   '<' {$operator = 11;}
    |   '<=' {$operator = 12;}
    |   '>' {$operator = 13;}
    |   '>=' {$operator = 14;}
    |   '==' {$operator = 15;}
    |   '!=' {$operator = 16;}
    |   '&&' {$operator = 21;}
    |   '||' {$operator = 22;}
    ;

IDFC:   ('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

IDF:   ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

CSTE_ENT:   '0'..'9'+ ;

CSTE_CHAINE:   '"' (ESC_SEQ | ~('\r'|'\n'|'"'|'\\'))+ '"' ;

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
