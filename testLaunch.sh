#!/bin/bash
#Lance un jeu de test pour stresser le compilateur.
cd analyseurs/
./generateJar.sh
exit
fullname="prog_test/progtestlvl2.looc"
filelooc=$(basename $fullname)
filename=${filelooc%.*}
echo "[JEU DE TEST CLOOC] [Etape 1/5] Regénération au format JAR du compilateur :"
echo ""
cd analyseurs/
./generateJar.sh
cd ..
echo ""
echo "************************************************************************************************************"
echo ""
sleep 2
echo "[JEU DE TEST CLOOC] [Etape 2/6] Compilation normale (+Warnings) produisant un fichier source ASM/microPIUP d'un fichier test :"
echo ""
java -jar clooc.jar -sWd $fullname assemblage/sources
echo ""
echo "************************************************************************************************************"
echo ""
sleep 4
echo "[JEU DE TEST CLOOC] [Etape 3/6] Affichage de l'AST (et erreurs lexicales/syntaxiques) :"
echo ""
java -jar clooc.jar -T $fullname
mv $filename.ast.* AST/
echo ""
echo "************************************************************************************************************"
echo ""
sleep 5
echo "[JEU DE TEST CLOOC] [Etape 4/6] Affichage de la TDS (et erreurs sémantiques) :"
echo ""
java -jar clooc.jar -vsd $fullname assemblage/sources
echo ""
echo "************************************************************************************************************"
echo ""
sleep 4
echo "[JEU DE TEST CLOOC] [Etape 5/6] Compilation (microPIUP.jar) du programme ASM produit par le compilateur :"
echo ""
cd assemblage/engine
java -jar microPIUP4.jar -ass ../sources/$filename.asm
mv $filename.iup ../bin
echo ""
echo "************************************************************************************************************"
echo ""
sleep 3
echo "[JEU DE TEST CLOOC] [Etape 6/6] Execution de l'exécutable final du programme looc :"
echo ""
java -jar microPIUP4.jar -batch ../bin/$filename.iup
