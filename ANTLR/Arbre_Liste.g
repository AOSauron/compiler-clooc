grammar Arbre_Liste;

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

a:   v 
	| '(' a x
	;
                
x:   '.' a ')'
    | s ')'
    ;

s:   ',' a s
	| 
    ;

v:   INT {}
	| 'n' 'i' 'l'
    ; 


INT :   '0'..'9'+ ;


