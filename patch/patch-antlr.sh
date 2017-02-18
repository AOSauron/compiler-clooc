#!/bin/bash

echo "[PATCHLOOC] Ce patch corrige le jar ANTLR-3.3 pour java 8, l'erreur error(10) est produite par : NullPointerException at (lieu de la correction) org.antlr.tool.Grammar.getIndirectDelegates(Grammar.java:2722). [PATCHLOOC]"
echo "[PATCHLOOC] Ce patch modifie de façon définitive l'archive antlr-3.3-complete.jar. Une version d'origine est disponible sous patch/antlr-3.3-complete-unpatch.jar si besoin. [PATCHLOOC]"
echo "Patch de ../ANTLR/antlr-3.3-complete.jar  (Veillez à bien compiler votre grammaire avec ce jar, et que CLASSPATH pointe bien sur ce jar)"
cd ..
patch --verbose ANTLR/antlr-3.3-complete.jar < patch/patch-antlr-3.3.patch
cd - > /dev/null
echo "Patch terminé."
