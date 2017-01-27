#!/bin/bash
#Test un programme looc passé en paramètre et construit son AST en l'affichant
echo "/!\ Evitez les path absolus. Les AST sont produits dans le dossier AST/ et leur nom sont préfixés de \"AST\" suivi du nom du programme. /!\\"
if [ -z $1 ]
then
  echo "Erreur : Indiquez un fichier looc à parser."
  exit
fi

if [ -f $1 ]
then
  cd analyseurs/
  filelooc=$(basename $1)
  filename=${filelooc%.*}
  #echo `readlink -f $1`
  #fullpathdir="$fullpathdir"
  #fullpath=$fullpathdir
  fullpath=../$fullpath
  #echo $fullpath
  echo "[TEST] Vérification de $1 sans erreur ..."
  java Clooc $fullpath
  echo "[TEST] Terminé"
  echo "[TEST] Construction de l'AST (format DOT) de $1 ..."
  path1="../AST/AST$filename.dot"
  path2="../AST/AST$filename.png"
  java Clooc -T $fullpath  $path1
  echo "[TEST] Terminé"
  echo "[TEST] Conversion de l'arbre DOT en image PNG ..."
  dot -Tpng $path1 -o $path2
  echo "[TEST] Terminé. L'image a été produite dans le fichier $path2"
  cd ..
  echo "[TEST] Affichage de l'arbre"
  path2="AST/AST$filename.png"
  eog $path2 &> /dev/null &
else
  echo "Erreur : Le fichier n'existe pas."
  exit
fi
