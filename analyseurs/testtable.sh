#!/bin/bash
if [ -z $1 ]
then
  echo "Mode par défaut : Compilation du compilateur ..."
  java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g #&> /dev/null
  javac -encoding ISO-8859-1 LoocLexer.java LoocParser.java TreeParser.java Clooc.java #&> /dev/null
fi
#java Clooc -T ../prog_test/progtestlvl2.looc ../AST/testAST.dot
java Clooc -T ../prog_test/progtestlvl1.looc ../AST/testAST.dot
