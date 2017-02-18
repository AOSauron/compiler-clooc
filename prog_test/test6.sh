#!/bin/bash

cd ../analyseurs/
echo "[TEST4] Vérification du testAnimalJuste.looc sans erreur ..."
java Clooc ../prog_test/testAnimalJuste.looc
echo "[TEST4] Terminé"
echo "[TEST4] Construction de l'AST (format DOT) de testAnimalJuste.looc ..."
java Clooc -T ../prog_test/testAnimalJuste.looc ../AST/ASTprog5.dot
echo "[TEST4] Terminé"
echo "[TEST4] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprog5.dot -O
echo "[TEST4] Terminé"
cd ../prog_test/
echo "[TEST4] Affichage de l'arbre"
eog ../AST/ASTprog5.dot.png &> /dev/null &
