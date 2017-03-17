#!/bin/bash
echo "[RELEASING JAR] Recompilation générale ..."
java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g && javac *.java
echo "[RELEASING JAR] Formation du Jar clooc.jar SANS les lib antlr et asmMicroPIUP ..."
jar cvmf MANIFEST.MF clooc.jar *.class > /dev/null
echo "[RELEASING JAR] Copie de ce jar dans le répertoire build/"
mv -v clooc.jar ../build/clooc/main
cd ../build/clooc
mkdir -v lib/
cp -v ../../ANTLR/antlr-3.3-complete.jar ./lib
cp -v ../../assemblage/engine/microPIUP4.jar ./lib
echo "[RELEASING JAR] Production du jar final exécutable à la racine du dépot ..."
jar -cvfm ../../clooc.jar boot-manifest.mf . > /dev/null
rm -rf ./lib
rm -rf ./main/clooc.jar
cd - > /dev/null
echo "[RELEASING JAR] Terminé. Pour lancer :"
java Clooc
