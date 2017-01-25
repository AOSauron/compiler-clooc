/*  GRAMMAIRE POUR LE LANGAGE LOOC POUR PROJET DE COMPILATION TELECOM NANCY 2016-2017
Authors : GARCIA Guillaume
Maj : 25/01/17   14:40  */

 grammar Looc;

 options {
 k=1;  /* Pour forcer LL(?) => LL(1) */
 output=AST;
 ASTLabelType=CommonTree;
 /*buildAST =true;*/   /* Construction de l'Arbre Syntaxique */
 }

 tokens {
   PROGRAM;
   CLASS;
   ITEMDEC;
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
 }


program:   (class_decl)* (var_decl)* (instruction)+ -> ^(PROGRAM (class_decl)* (var_decl)* (instruction)+);

class_decl:   'class' IDFC ('inherit' IDFC)? '=' '(' class_item_decl ')' -> ^(CLASS IDFC IDFC class_item_decl);

class_item_decl:   (var_decl)* (method_decl)* -> ^(ITEMDEC (var_decl)* (method_decl)*);

var_decl:   'var' IDF ':' type ';' -> ^(VARDEC IDF type);

type:   IDFC       //{ $arbre = new Arbre($IDFC.text); }
    |   'int'      //{ $arbre = new Arbre("int"); }
    |   'string'   //{ $arbre = new Arbre("string"); }
    ;

method_decl:   'method' IDF '(' (method_args)* ')' (':' type)? '{' (var_decl)* (instruction)+ '}' -> ^(METHODDEC IDF method_args type (var_decl)* (instruction)+);

method_args:   IDF ':' type (',' IDF ':' type)* -> ^(METHODARG IDF type (IDF type)*);

instruction:   IDF ':=' affectation ';' -> ^(AFFECT IDF affectation)
           |   'if' expression 'then' instruction ('else' instruction)? 'fi' -> ^(IF expression instruction (instruction)?)
           |   'for' IDF 'in' expression '..' expression 'do' (instruction)+ 'end' -> ^(FOR IDF expression expression (instruction)+)
           |   '{' (var_decl)* (instruction)+ '}' -> ^(GROUP (var_decl)* (instruction)+)
           |   'do' expression ';'
           |   print
           |   read
           |   returnstate
           ;

affectation:   expression
           |   'nil'
           ;

print:   'write' expression ';' -> ^(WRITE expression);

read:   'read' IDF ';' -> ^(READ IDF);

returnstate:   'return' '(' expression ')' ';' -> ^(RETURN expression);

/* expression a dû être dérecursivée gauche. */

expression:   IDF expression_bis -> ^(EXPR IDF expression_bis)
          |   'this' expression_bis
          |   'super' expression_bis
          |   CSTE_ENT expression_bis -> ^(EXPR CSTE_ENT expression_bis)
          |   CSTE_CHAINE expression_bis -> ^(EXPR CSTE_CHAINE expression_bis)
          |   'new' IDFC expression_bis -> ^(NEW IDFC expression_bis)
          |   '(' expression ')' expression_bis -> ^(EXPR expression expression_bis)
          |   '-' expression expression_bis -> ^('-' expression expression_bis)
          ;

expression_bis:   '.' IDF '(' (expression)? (',' expression)* ')' expression_bis -> ^(METHODCALLING IDF /*(expression)?*/ (expression)* expression_bis)
              |   oper expression expression_bis -> ^(oper expression expression_bis)
              |    /*Le mot vide*/                   //{ $arbre = null;}
              ;

oper:   '+'     //{ $arbre = new Arbre("+"); }
    |   '-'     //{ $arbre = new Arbre("-"); }
    |   '*'     //{ $arbre = new Arbre("*"); }
    |   '<'     //{ $arbre = new Arbre("<"); }
    |   '<='    //{ $arbre = new Arbre("<="); }
    |   '>'     //{ $arbre = new Arbre(">"); }
    |   '>='    //{ $arbre = new Arbre(">="); }
    |   '=='    //{ $arbre = new Arbre("=="); }
    |   '!='    //{ $arbre = new Arbre("!="); }
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