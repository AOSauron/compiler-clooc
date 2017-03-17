		CNTMA EQU 0xFF00
		CNTIA EQU 0xFF02
		SEUIL EQU 0x006F
		SP EQU R15
		INITC EQU 0x0000
		STACKA EQU 0x1000
		VECTA1 EQU 0x0088 //Adresse du vecteur dinterruption IRQ2 : 4*(32+2)=0x0088
		VECTA2 EQU 0x008C //Adresse du vecteur dinterruption IRQ3 : 4*(32+3)=0x008C

	      	ORG	0xFF10
		START 	INITPILE

//Main Program
INITPILE	LDW SP, #STACKA	//Initialise le pointeur de pile
		LDW R6, #IT_PRGA
		STW R6, @VECTA1
		LDW R9, #IT_PRGB
		STW R9, @VECTA2
		ENI

MAIN_PRGA	LDW R1, #INITC
		LDW R2, #SEUIL
		LDW R3, #0x0010

BOUCLE		DSI
		STW R1, @CNTMA
		ENI
		ADD R1, R3, R1
		CMP R2, R1	//5.A, risquerait de fausser le resultat si SR est modifi� par le prog dinterruption
		JGE #BOUCLE-$-2
END		JEA @MAIN_PRGA

//Prog Interruption 1
IT_PRGA		LDW R4, @CNTIA
		LDW R5, #0x0002
		ADD R4, R5, R4
		STW R4, @CNTIA
		ENI		//Autoriser � nouveau les interruptions
		RTI		//Et non RTS car on veut SR (sauv� en pile).

//Prog Interruption 2
IT_PRGB		LDW R7, @CNTMA
		LDW R8, #0x0001
		SUB R7, R8, R7
		STW R7, @CNTMA
		ENI
		RTI

//3.B: Car on peut interrompre n'importe quand donc il faut sauver les registres pour les remettres � leur valeurs avant interruption.
//3.C: Car IF a �t� mis � 0 automatiquement, et on veut permettre � d'autres interruptions de se d�lcencher
//3.D: Pour �viter une interruption dans une interruption.
//3.E: Car on veut SR, main_prga en a besoin (et on peut interrompre � tout moment!). et 5.B
//4.A: num�ro INT � la ligne IRQ2=2+32=34
//6.A: Si il y a interruption entre r�ecriture et chargement de la case m�moire, le r�sultat sera erron�
//7.A: Le CPU se met en attente d'interruption.
//7.B: Non elle consomme moins de puissance �l�ctrique et chauffe alors moins.
//8.B: Le bus mat�riel de IRQ2 est le p�riph�rique le plus proche du bus IRQST
//9.A: On utiliserai TRP #34 pour appeler l'interruption 1
//9.B: Car TRP utilise moins de bits que JSR
//9.C: Permet de r�f�rencer les interruptions
//10.A: Cela D�clenche une interruption trappe mat�rielle
//10.B: D�bordement de pile; Erreur de segmentation; Acc�s � une variable non d�finie
//11.A: Oui c'en est une
//11.B: Par l'instruction RST (ou bouton reset)
//11.C: Le programme en cours s'arrete sans retour et un programme d'initialisation est lanc�.
//11.D: Elle n'est pas vectoris�.
