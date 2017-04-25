// Fichier tst_trp.src
// EXEMPLES D'UTILISATION DES TRAPPES LOGICIELLES EN LANGAGE D'ASSEMBLAGE microPIUP
// auteur: Alexandre Parodi - Avril 2013

EXIT_EXC   equ   64             // n� d'exception de EXIT           (test� sur microPIUPK.jar)
READ_EXC   equ   65             // n� d'exception de READ (1 ligne) (test� sur microPIUPK.jar)
WRITE_EXC  equ   66             // n� d'exception de WRITE (1 ligne)(test� sur microPIUPK.jar)
STACK_ADRS equ   0x1000         // base de pile en 1000h            (par exemple)
           org   0xF000         // adresse de chargement
           start DEBUT          // adresse de d�marrage

KB_BUF     rsb 80               // tampon m�moire de 80 Bytes pour entrer des caract�res depuis le clavier
MSG_ADRS   string "you have typed: " // cha�ne de caract�res constante

// ces alias permettront de changer les r�els registres utilis�s
WR         equ   R14            // Work Register

// PROGRAMME PRINCIPAL
// dans ce programme, seul le mode registre est utilis� pour l'instruction TRP
// et seul le mode indirect (dit aussi "bas�") est utilis� pour l'instruction JEA.

// lit texte au clavier :
DEBUT      LDW R0, #KB_BUF
     // TRP #READ_EXC
           LDW WR, #READ_EXC // WR = READ_EXC = n� exception de READ (lit une ligne depuis le clavier)
           TRP WR            // enregistre texte entr� au clavier � partir de l'adresse contenue dans R0

// affiche texte du message "you have typed: "
           LDW R0, #MSG_ADRS  // charge R0 avec adresse du texte � afficher

     // TRP #WRITE_EXC
           LDW WR, #WRITE_EXC // WR = WRITE_EXC = n� exception de WRITE
           TRP WR             // affiche le texte commen�ant � l'adresse contenue dans R0

// affiche texte lu:
           LDW R0, #KB_BUF    // charge R0 avec adresse du texte � afficher
     // TRP #WRITE_EXC
           LDW WR, #WRITE_EXC // WR = WRITE_EXC = n� exception de WRITE
           TRP WR             // affiche le texte commen�ant � l'adresse contenue dans R0

// arr�te le programme
     // TRP #EXIT_EXC         //
           LDW WR, #EXIT_EXC  // WR = EXIT_EXC = n� exception de EXIT
           TRP WR             // arr�te le programme (et retournerait au "syst�me op�rateur" s'il y en avait un)


// revient au d�but
     // jea @DEBUT
           LDW WR, #DEBUT
           JEA (WR)
