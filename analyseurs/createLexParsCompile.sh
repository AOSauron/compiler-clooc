#!/bin/bash

echo "Création des analyseurs lexical et syntaxique à partir de la grammaire Looc.g ..."
java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g &> /dev/null
echo "Compilation de la classe test Clooc.java ..."
javac LoocLexer.java LoocParser.java Clooc.java &> /dev/null
echo "Terminé."
echo "Pour analyser un programme Looc : \"java Clooc path/programme/à/parser.looc\""
echo "Pour construire un AST format DOT : \"java Clooc -T path/programme/à/parser.looc path/vers/AST.dot\""
