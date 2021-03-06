#!/bin/bash
echo "[RELEASING JAR] Recompilation générale ..."
java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g && javac *.java
echo "[RELEASING JAR] Formation du Jar clooc.jar SANS les lib antlr et asmMicroPIUP ..."
jar cvmf MANIFEST.MF clooc.jar *.class > /dev/null
echo "[RELEASING JAR] Copie de ce jar dans le répertoire build/"
cd ../build/
mkdir -v clooc/
cp -v one-jar-boot-0.97.jar clooc/one-jar-boot-0.97.jar
cd clooc/
echo "[RELEASING JAR] Build de one-jar ..."
jar xvf one-jar-boot-0.97.jar > /dev/null
rm -v one-jar-boot-0.97.jar
rm -rvf ./src
echo "One-Jar-Main-Class: Clooc" >> boot-manifest.mf
echo "" >> boot-manifest.mf
mkdir -v main/
mv -v ../../analyseurs/clooc.jar main/clooc.jar
mkdir -v lib/
cp -v ../../ANTLR/antlr-3.3-complete.jar ./lib
cp -v ../../assemblage/engine/microPIUP4.jar ./lib
echo "[RELEASING JAR] Production du jar final exécutable à la racine du dépot ..."
jar -cvfm ../../clooc.jar boot-manifest.mf . > /dev/null
cd ..
echo "[RELEASING JAR] Suppression des dossiers du build ..."
cd ..
rm -rf build/clooc
echo "[RELEASING JAR] Terminé. Pour lancer :"
java -jar clooc.jar
cd analyseurs
