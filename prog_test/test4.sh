#!/bin/bash

cd ../analyseurs/
echo "[TEST4] Vérification du progtestlvl4.looc sans erreur ..."
java Clooc ../prog_test/progtestlvl4.looc
echo "[TEST4] Terminé"
echo "[TEST4] Construction de l'AST (format DOT) de progtestlvl4.looc ..."
java Clooc -T ../prog_test/progtestlvl4.looc ../AST/ASTprog4.dot
echo "[TEST4] Terminé"
echo "[TEST4] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprog4.dot -O
echo "[TEST4] Terminé"
cd ../prog_test/
echo "[TEST4] Affichage de l'arbre"
eog ../AST/ASTprog4.dot.png &> /dev/null &
