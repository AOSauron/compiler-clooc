#!/bin/bash

echo "Création des analyseurs lexical et syntaxique à partir de la grammaire Looc.g ..."
java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g #&> /dev/null
echo "Compilation de la classe test Clooc.java ..."
javac *.java #&> /dev/null
echo "Terminé."
java Clooc
