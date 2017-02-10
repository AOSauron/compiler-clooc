#!/bin/bash

cd ../analyseurs/
echo "[TESTIFERROR] Vérification du iferror.looc sans erreur ..."
java Clooc ../prog_test/iferror.looc
echo "[TESTIFERROR] Terminé"
echo "[TESTIFERROR] Construction de l'AST (format DOT) de iferror.looc ..."
java Clooc -T ../prog_test/iferror.looc ../AST/ASTprogIfError.dot
echo "[TESTIFERROR] Terminé"
echo "[TESTIFERROR] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprogIfError.dot -O
echo "[TESTIFERROR] Terminé"
cd ../prog_test/
echo "[TESTIFERROR] Affichage de l'arbre"
eog ../AST/ASTprogIfError.dot.png &> /dev/null &
