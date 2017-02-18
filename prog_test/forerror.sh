#!/bin/bash

cd ../analyseurs/
echo "[TESTFORERROR] Vérification du forerror.looc sans erreur ..."
java Clooc ../prog_test/forerror.looc
echo "[TESTFORERROR] Terminé"
echo "[TESTFORERROR] Construction de l'AST (format DOT) de forerror.looc ..."
java Clooc -T ../prog_test/forerror.looc ../AST/ASTprogForError.dot
echo "[TESTFORERROR] Terminé"
echo "[TESTFORERROR] Conversion de l'arbre DOT en image PNG ..."
dot -Tpng ../AST/ASTprogForError.dot -O
echo "[TESTFORERROR] Terminé"
cd ../prog_test/
echo "[TESTFORERROR] Affichage de l'arbre"
eog ../AST/ASTprogForError.dot.png &> /dev/null &
