#!/bin/bash

cd ../analyseurs/
echo "[TEST1] Vérification du progtestlvl1.looc sans erreur ..."
java Clooc ../prog_test/progtestlvl1.looc
echo "[TEST1] Terminé"
echo "[TEST1] Vérification du progtestlvl1.looc avec erreurs lexicales ... "
java Clooc ../prog_test/progtestlvl1_lexerr.looc
echo "[TEST1] Terminé"
echo "[TEST1] Vérification du progtestlvl1.looc avec erreurs syntaxiques ... "
java Clooc ../prog_test/progtestlvl1_synerr.looc
echo "[TEST1] Terminé"
echo "[TEST1] Construction de l'AST (format DOT) de progtestlvl1.looc ..."
java Clooc -T ../prog_test/progtestlvl1.looc ../AST/ASTprog1.dot
echo "[TEST1] Terminé"
echo "[TEST1] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprog1.dot -O
echo "[TEST1] Terminé"
cd ../prog_test/
echo "[TEST1] Affichage de l'arbre"
eog ../AST/ASTprog1.dot.png &> /dev/null &
