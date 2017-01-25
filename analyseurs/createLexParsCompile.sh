#!/bin/bash

echo "Création des analyseurs lexicaux et syntaxique à partir de la grammaire Looc.g ..."
java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g
echo "Compilation de la classe test Clooc.java ..."
javac LoocLexer.java LoocParser.java Clooc.java
echo "Lancer le compilateur avec \"java Clooc ../prog_test/<programme à tester>\""
