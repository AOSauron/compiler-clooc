/*  GRAMMAIRE POUR LE LANGAGE LOOC POUR PROJET DE COMPILATION TELECOM NANCY 2016-2017
Authors : GARCIA Guillaume
Maj : 21/01/17   14:39  */

 grammar Looc;

 options {
 k=1;  /* Pour forcer LL(?) => LL(1) */
 /*buildAST =true;*/   /* Construction de l'Arbre Syntaxique */
 }

 @members {
  /* AST */
  class Arbre {
    private String noeud;
    private Arbre gauche, droite;
    private static final int ind = 4;

    public Arbre(String n) {
      noeud = n;
      droite = gauche = null;
    }
    public Arbre(String n, Arbre g, Arbre d) {
      noeud= n;
      gauche = g;
      droite = d;
    }
    public Arbre setGauche(Arbre g) {
      gauche = g;
      return this;
    }
    public Arbre setDroite(Arbre d) {
      droite = d;
      return this;
    }
    public String toString() {
      if (gauche == null && droite == null) {
        return " " + noeud;
      }
      StringBuffer s = new StringBuffer("("+noeud);
      s.append(gauche == null ? "()" : gauche.toString());
      s.append(droite == null ? "()" : droite.toString());
      s.append(")");
      return s.toString();
    }
    private void idente(StringBuffer s, int lvl) {
      for (int i = 0; i<ind*lvl; i++) {
        s.append(" ");
      }
    }
    public String prettyPrint(int lvl) {
      StringBuffer s = new StringBuffer();
      idente(s, lvl);
      s.append(noeud+"\n");
      if (gauche == null && droite == null) {
        return s.toString();
      }
      s.append(gauche == null ? "\n" : gauche.prettyPrint(lvl+1));
      s.append(droite == null ? "\n" : droite.prettyPrint(lvl+1));
      return s.toString();
    }
  }
 }

program:   (class_decl)* (var_decl)* (instruction)+ ;

class_decl:   'class' IDFC ('inherit' IDFC)? '=' '(' class_item_decl ')' ;

class_item_decl:   (var_decl)* (method_decl)* ;

var_decl:   'var' IDF ':' type ';' ;

type:   IDFC        //{ $arbre = new Arbre($IDFC.text); }
    |   'int'       //{ $arbre = new Arbre("int"); }
    |   'string'    //{ $arbre = new Arbre("string"); }
    ;

method_decl:   'method' IDF '(' (method_args)* ')' (':' type)? '{' (var_decl)* (instruction)+ '}' ;

method_args:   IDF ':' type (',' IDF ':' type)* ;

instruction:   IDF ':=' affectation ';'
           |   'if' expression 'then' instruction ('else' instruction)? 'fi'
           |   'for' IDF 'in' expression '..' expression 'do' (instruction)+ 'end'
           |   '{' (var_decl)* (instruction)+ '}'
           |   'do' expression ';'
           |   print
           |   read
           |   returnstate
           ;

affectation:   expression
           |   'nil'
           ;

print:   'write' expression ';' ;

read:   'read' IDF ';' ;

returnstate:   'return' '(' expression ')' ';' ;

/* expression a dû être dérecursivée gauche. */

expression:   IDF expression_bis
          |   'this' expression_bis
          |   'super' expression_bis
          |   CSTE_ENT expression_bis
          |   CSTE_CHAINE expression_bis
          |   'new' IDFC expression_bis
          |   '(' expression ')' expression_bis
          |   '-' expression expression_bis
          ;

expression_bis:   '.' IDF '(' (expression)? (',' expression)* ')' expression_bis
              |   oper expression expression_bis
              |   /*Le mot vide*/                   //{ $arbre = null;}
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
