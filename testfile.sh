#!/bin/bash
#Test un programme looc passé en paramètre et construit son AST en l'affichant
echo "/!\ Le script doit être lancé en bash, à son emplacement. /!\ "
echo "/!\ Les AST sont produits dans le dossier AST/ et leur nom sont préfixés de \"AST\" suivi du nom du programme. /!\ "
if [ -z $1 ]
then
  echo "Erreur : Indiquez un fichier looc à parser."
  exit
fi

if [ -f $1 ]
then
  echo "[TESTLOOC] Export dans CLASSPATH de antlr-3.jar ... (préconfig)"
  fpathantlr=$(readlink -f ANTLR/antlr-3.3-complete.jar)
  export CLASSPATH=$fpathantlr:.:$CLASSPATH
  echo "[TESTLOOC] Terminé."
  fullpath=$(readlink -f $1)
  cd analyseurs/
  filelooc=$(basename $1)
  filename=${filelooc%.*}
  while true; do
  read -p "[TESTLOOC] Voulez vous (re-)compiler la grammaire Looc.g ainsi que le compilateur Clooc.java ? Oui(o/O/y/Y/Entrée) ou Non(n/N) : " comp
      case $comp in
        ""|[OoyY]* ) echo "[TESTLOOC] Création des analyseurs lexical et syntaxique à partir de la grammaire Looc.g ..."
                  java -jar ../ANTLR/antlr-3.3-complete.jar Looc.g #&> /dev/null
                  echo "[TESTLOOC] Compilation de la classe Clooc.java ..."
                  javac LoocLexer.java LoocParser.java Clooc.java #&> /dev/null
                  echo "[TESTLOOC] Compilation terminée."
                  break;;
        [Nn]* ) break;;
        * ) echo "Répondez oui ou non."
            continue;;
      esac
    done
  echo "[TESTLOOC] Vérification du programme $filelooc  ..."
  output=$(java Clooc $fullpath)
  #if [[ -z $ouput ]]; then
    #echo $output
    #echo "[TESTLOOC] - OK - Le programme $filelooc valide la grammaire Looc.g"
  #else
    #echo $output
    #echo "[TESTLOOC] - ERREUR - Le programme $filelooc ne valide pas la grammaire Looc.g"
  #fi
  echo "[TESTLOOC] Terminé (OK si pas de message d'erreur.)"
  while true; do
  read -p "[TESTLOOC] Voulez vous construire l'AST ? Oui(o/O/y/Y/Entrée) ou Non(n/N) : " ok
      case $ok in
       ""|[OoyY]* ) echo "[TESTLOOC] Construction de l'AST (format DOT) de $filelooc ..."
                  path1="../AST/AST$filename.dot"
		              path12="AST/AST$filename.dot"
                  path2="../AST/AST$filename.png"
		              path22="AST/AST$filename.png"
                  java Clooc -T $fullpath  $path1
                  echo "[TESTLOOC] Terminé"
                  echo "[TESTLOOC] Conversion de l'arbre DOT en image PNG ..."
                  dot -Tpng $path1 -o $path2 &> /dev/null
                  echo "[TESTLOOC] Terminé. L'image a été produite dans le fichier $path22"
                  cd ..
                  echo "[TESTLOOC] Affichage de l'arbre"
                  eog $path22 &> /dev/null &
                  break;;
        [Nn]* ) echo "[TESTLOOC] Terminé."
                exit;;
        * ) echo "Répondez oui ou non."
            continue;;
      esac
    done

else
  echo "Erreur : Le fichier n'existe pas."
  exit
fi
