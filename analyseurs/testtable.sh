#!/bin/bash
if [ -z $1 ]
then
  echo "Mode par défaut : Compilation du compilateur ..."
  java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g && javac  LoocLexer.java LoocParser.java TreeParser.java Clooc.java && java Clooc -T ../prog_test/progtestlvl2.looc ../AST/testAST.dot
else
  java Clooc -T ../prog_test/progtestlvl2.looc ../AST/testAST.dot
fi
#java Clooc -T ../prog_test/blocanonyme.looc ../AST/testAST.dot
#-encoding ISO-8859-1
