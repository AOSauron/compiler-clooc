grammar Arbre_Liste;

options {
k=1;
}

prog:   a ;
       
a : v 
  |'(' a x 
  ;


x : '.' a ')'
  |s ')'
  ;


s : '.' a s
  |
  ;

v : INT 
  | 'nil'
  ;

INT :   '0'..'9'+ ;
WS  :   (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;};
