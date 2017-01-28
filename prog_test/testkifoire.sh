#!/bin/bash

cd ../analyseurs/
echo "[TESTFOIRE] Vérification du testkifoire.looc sans erreur ..."
java Clooc ../prog_test/testkifoire.looc
echo "[TESTFOIRE] Terminé"
echo "[TESTFOIRE] Construction de l'AST (format DOT) de testkifoire.looc ..."
java Clooc -T ../prog_test/testkifoire.looc ../AST/ASTprogfoire.dot
echo "[TESTFOIRE] Terminé"
echo "[TESTFOIRE] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprogfoire.dot -O
echo "[TESTFOIRE] Terminé"
cd ../prog_test/
echo "[TESTFOIRE] Affichage de l'arbre"
eog ../AST/ASTprogfoire.dot.png &> /dev/null &
