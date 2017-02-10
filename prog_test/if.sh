#!/bin/bash

cd ../analyseurs/
echo "[TESTIF] Vérification du if.looc sans erreur ..."
java Clooc ../prog_test/if.looc
echo "[TESTIF] Terminé"
echo "[TESTIF] Construction de l'AST (format DOT) de if.looc ..."
java Clooc -T ../prog_test/if.looc ../AST/ASTprogIf.dot
echo "[TESTIF] Terminé"
echo "[TESTIF] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprogIf.dot -O
echo "[TESTIF] Terminé"
cd ../prog_test/
echo "[TESTIF] Affichage de l'arbre"
eog ../AST/ASTprogIf.dot.png &> /dev/null &
