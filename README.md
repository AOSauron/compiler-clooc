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
	- default-jdk 				      (Java Development Kit)
	- antlr-3.3-complete.jar		     (fourni dans le git)

* **Build & execute**
	- à venir ...

* **Forge TNCY**
	- Un dépôt du projet est également présent sur la forge de TELECOM Nancy sous *Projets Divers >> COMPILATION_2A >> garcia62u* (accès autorisé seulement pour les développeurs pour le moment)
	- L'adresse du dépôt local sur le réseau de l'école est : /var/git/garcia62u/trunk

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

## ROADMAP

* **Demander aux profs pour la ligne "for ..." dans la grammaire, elle est étrange (expression..expression)**

* **Rendre la règle expression non-récursive gauche**

* **Préparer le terrain pour analyse syntatixe (analyse lexical presque OK)**

* **Enfin, faire la construction de l'AST**
