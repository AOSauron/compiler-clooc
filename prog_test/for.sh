#!/bin/bash

cd ../analyseurs/
echo "[TESTFOR] Vérification du for.looc sans erreur ..."
java Clooc ../prog_test/for.looc
echo "[TESTFOR] Terminé"
echo "[TESTFOR] Construction de l'AST (format DOT) de for.looc ..."
java Clooc -T ../prog_test/for.looc ../AST/ASTprogFor.dot
echo "[TESTFOR] Terminé"
echo "[TESTFOR] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprogFor.dot -O
echo "[TESTFOR] Terminé"
cd ../prog_test/
echo "[TESTFOR] Affichage de l'arbre"
eog ../AST/ASTprogFor.dot.png &> /dev/null &
