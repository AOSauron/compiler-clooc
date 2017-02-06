# PCL TNCY 2017

**Compilateur du langage LOOC (Langage Orienté Objet pour la Compilation) produisant du code assembleur microPIUP/ASM**

*Projet de Compilation TELECOM Nancy 2016-2017*

* **Auteurs**
	- DUBOIS Nicolas
	- GARCIA Guillaume
	- HINSBERGER Laure
	- ZAMBAUX Gauthier

* **Dépendances**
	- bash
	- default-jdk 				      																	(Java Development Kit)
	- antlr-3.3-complete.jar			 																(fourni dans le git)
	- graphviz																										(pour visualiser les AST)
	- freeglut3 libgraphviz4 libgts-0.7-5 libgts-bin libgd2-xpm 	(pour graphviz, conseil : utiliser gdebi)

* **Build & execute**
	- Lancez le script analyseurs/createLexParsCompile.sh
	- cd analyseurs/
	- java Clooc \<path/du/programme/à/compiler\>

* **Forge TNCY**
	- Un dépôt du projet est également présent sur la forge de TELECOM Nancy sous *Projets Divers >> COMPIL 2017 >> garcia62* (accès autorisé seulement pour les développeurs pour le moment)
	- L'adresse du dépôt local sur le réseau de l'école est : http://forge.telecomnancy.univ-lorraine.fr/git/garcia62u

## TPs d'initiation

* **Manipulations préalables pour ANTLR**

	- A la fin du fichier **~/.bashrc**, ajouter la ligne `export CLASSPATH=/chemin/vers/antlr-3.3-complete.jar:.:$CLASSPATH`
	- Assurez vous que votre terminal utiliser le shell *bash* avec la commande : `bash`

* **Compiler une grammaire .g : Produit un Lexer.java et un Parser.java**

	- `java org.antlr.Tool grammaire.g`
	- OU `java -jar antlr-3.3-complete.jar grammaire.g`

* **Compiler une classe Test.java avec les Lexer et Parser précédents**

	- `javac grammaireLexer.java grammaireParser.java Test.java`

* **Lancer la classe Test**

	- `java Test`

* **Dans nos exemples sous ANTLR/**

	- Test reconnait des expressions de calculs simples telles que x=1 ou x*y. TestArbre reconnait des arbres, vus en TD de TRAD, tels que (1.2) ou (1,5,(1.8)).
	- Pour utiliser ces tests, rentrer les mots à tester avec un retour à la ligne à chaque fois, puis appuyer sur Ctrl+D pour lancer la vérification. Si l'un des mots n'appartient pas à la grammaire, Test/TestArbre renverra une erreur pointée.

## Utilisation du compilateur

* **Build du compilateur**
	- `cd analyseurs/`
	- Si ce n'est pas déjà le cas, rendre exécutable le builder `chmod +x createLexParsCompile.sh`
	- `./createLexParsCompile.sh`

* **Vérifier un programme Looc**
	- `cd analyseurs/`
	- `java Clooc path/du/programme/à/compiler`

* **Construire l'AST au format DOT d'un programme Looc**
 	- `cd analyseurs/`
	- `java Clooc -T path/du/programme/à/compiler path/vers/AST.dot`

* **Convertir les AST au format DOT en image PNG**
	- `cd AST/`
	- - Si ce n'est pas déjà le cas, rendre exécutable le script `chmod +x exportpng.sh`
	- `./exportpng.sh`

* **Visualiser un AST au format .dot avec ZGRViewer**
	- Lancez ZGRViewer (`./run.sh` dans son dossier d'installation)
	- Si ce n'est pas déjà fait, allez dans View > Préférences pour choisir les dossiers tmp/ et graphs/, ainsi que l'endroit où se situe l'exécutable dot (usuellement sous /usr/bin/dot)
	- File > Open > dot > AST.dot
	- Vous pouvez exporter l'arbre au format .svg ou .png avec File > Export to ...

* **Exporter un AST au format DOT en image PNG en ligne de commande**
	- `dot -Tpng AST.dot -o ASTimage.png`

## ROADMAP

* ~~**Demander aux profs pour la ligne "for ..." dans la grammaire, elle est étrange (expression..expression)**~~
	=> Réglé. La grammaire officielle sera corrigée prochainement par les profs, la nôtre l'est déjà.

* ~~**Rendre la règle expression non-récursive gauche**~~
	=> Réglé. **Voir pour corriger les deux warning restant.**

* ~~**Préparer le terrain pour analyse syntatixe (analyse lexical presque OK)**~~
	=> OK. Grammaire fonctionnelle, reste à la roder sur des tests poussés.

* ~~**Enfin, faire la construction de l'AST**~~
	=> OK dans les grandes lignes, reste à le simplifier, et à le tester de façon poussée aussi.

* ~~**Demander aux profs où est ce git local (l'adresse locale donnée n'existe pas)**~~
	=> C'est OK le git de github a été mirroré sur celui de la forge.

* **Finir complètement la construction de l'AST (voir plus bas)**

	*Revoir les opérateurs (+ *)
	Revoir opérateurs de comparaison
	TRAITER LA PRIORITE DES OPERATEURS*

* **Commencer la construction de table des symboles**
