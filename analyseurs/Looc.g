/*  GRAMMAIRE POUR LE LANGAGE LOOC POUR PROJET DE COMPILATION TELECOM NANCY 2016-2017
Authors : GARCIA Guillaume
Maj : 13/01/17   3:03  */

 grammar Looc;

 options {
 k=1;  /* Pour forcer LL(?) => LL(1) */
 /*buildAST =true;*/   /* Construction de l'Arbre Syntaxique Descendant */
 }

program:   (class_decl)* (var_decl)* (instruction)+ ;

class_decl:   'class' IDFC ('inherit' IDFC)? '=' '(' class_item_decl ')' ;

class_item_decl:   (var_decl)* (method_decl)* ;

var_decl:   'var' IDF ':' type ';' ;

type:   IDFC
    |   'int'
    |   'string'
    ;

method_decl:   'method' IDF '(' (method_args)* ')' (':' type)? '{' (var_decl)* (instruction)+ '}' ;

method_args:   IDF ':' type (',' IDF ':' type)* ;

instruction:   IDF ':=' affectation ';'
           |   'if' expression 'then' instruction ('else' instruction)? 'fi'
           |   'for' IDF 'in' expression '..' expression 'do' (instruction)+ 'end'   /* DEMANDER AU PROF, LIGNE ETRANGE */
           |   '{' (var_decl)* (instruction)+ '}'
           |   'do' expression '.' IDF '(' expression (',' expression)* ')' ';'
           |   print
           |   read
           |   return
           ;

affectation:   expression
           |   'nil'
           ;

print:   'write' strprint ';' ;

strprint:   expression
        |   CSTE_CHAINE
        ;

read:   'read' IDF ';' ;

return:   'return' '(' expression ')' ';' ;

/* expression a dû être dérecursivée gauche. */

expression:   IDF expression_bis
          |   'this' expression_bis
          |   'super' expression_bis
          |   CSTE_ENT expression_bis
          |   'new' IDFC expression_bis
          |   '(' expression ')' expression_bis
          |   '-' expression expression_bis
          ;

expression_bis:   '.' IDF '(' expression (',' expression)* ')' expression_bis
              |    oper expression expression_bis
              |   /*Le mot vide*/
              ;

oper:   '+'
    |   '-'
    |   '*'
    |   '<'
    |   '<='
    |   '>'
    |   '>='
    |   '=='
    |   '!='
    ;

IDFC:   ('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

IDF:   ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
   /*|   'this'
   |   'super'*/
   ;

/*
MOT_CLE:   'if'
       |   'fi'
       |   'end'
       |   'then'
       |   'else'
       |   'inherit'
       |   'var'
       |   'class'
       |   'class'
       |   'int'
       |   'string'
       |   'method'
       |   'for'
       |   'in'
       |   'do'
       |   'new'
       |   'return'
       |   'read'
       |   'write'
       ;
*/

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
