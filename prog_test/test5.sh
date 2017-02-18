#!/bin/bash

cd ../analyseurs/
echo "[TEST5] Vérification du test5.looc sans erreur ..."
java Clooc ../prog_test/test5.looc
echo "[TEST5] Terminé"
echo "[TEST5] Construction de l'AST (format DOT) de test5.looc ..."
java Clooc -T ../prog_test/test5.looc ../AST/ASTprogTest5.dot
echo "[TEST5] Terminé"
echo "[TEST5] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprogTest5.dot -O
echo "[TEST5] Terminé"
cd ../prog_test/
echo "[TEST5] Affichage de l'arbre"
eog ../AST/ASTprogTest5.dot.png &> /dev/null &
