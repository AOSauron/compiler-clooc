 grammar Looc;

 options {
 k=1;  /* Pour forcer LL(?) => LL(1) */
 buildAST =true;   /* Construction de l'Arbre Syntaxique Descendant */
 }

program:   (class_decl)* (var_decl)* (instruction)+ ;

class_decl:   'class' IDFC ('inherit' IDFC)? '=' '(' class_item_decl ')' ;

class_item_decl:   (var_decl)* (method_decl)* ;

var_decl:   'var' IDF ':' type ';' ;

type:   IDFC
    |   'int'
    |   'string'
    ;

method_decl:   'method' IDF '(' (method_args)* ')' '{' (var_decl)* (instruction)+ '}'
           |   'method' IDF '(' (method_args)* ')' ':' type '{' (var_decl)* (instruction)+ '}'
           ;

method_args:   IDF ':' type (',' IDF ':' type)* ;

instruction:   IDF ':=' expression ';'
           |   IDF ':=' 'nil' ';'
           |   'if' expression 'then' instruction ('else' instruction)? 'fi'
           |   'for' IDF 'in' expression .. expression 'do' (instruction)+ 'end'
           |   '{' (var_decl)* (instruction)+ '}'
           |   'do' expression '.' IDF '(' expression (',' expression)* ')' ';'
           |   print
           |   read
           |   return
           ;

print:   'write' expression ';'
     |   'write' CSTE_CHAINE ';'
     ;

read:   'read' IDF ';' ;

return:   'return' '(' expression ')' ';' ;

expression:   IDF
          |   'this'
          |   'super'
          |   CSTE_ENT
          |   'new' IDFC
          |   expression '.' IDF '(' expression (',' expression)* ')'
          |   '(' expression ')'
          |   '-' expression
          |   expression oper expression
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
   |   'this'
   |   'super'
   ;

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
