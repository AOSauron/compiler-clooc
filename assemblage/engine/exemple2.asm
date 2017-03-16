	RESETA EQU 0xFFFA
	INA EQU 0xFF00
	OUTA EQU 0xFF02
	LOADA EQU 0xFF10
	SEUIL EQU 0x0003
	STACKA EQU 0x1000
	SP EQU R15
	BP EQU R14
	
	ORG LOADA	//Charge � l'adresse..
	START LOADA	//Lance � l'adresse ..
	

	//Programme appelant
DEBUT	LDW SP, #STACKA //Initialse le pointeur de pile SP � STACKA
BOUCLE	LDW R2, @INA	//R2<-M[INA]
	STW R2, -(SP)	//Q8
	LDW R3, #DISTA	//Adressage Registre bas� (question 6)
	JSR (R3)	//Appelle dist(x)
	STW R0, @OUTA	//Stocke le resultat dans la m�moire � 0xFF02
	JMP #BOUCLE-$-2	//Boucle ind�finiement
	

	//Fonction dist(x)
DISTA	LDW BP, (SP)2	//Q8
	LDW R2, (BP)	//Q8
	STW R1, -(SP)	//D�cr�mente SP puis Empile en pile R1
	LDW R1, #SEUIL	//Seuil dans R1
	SUB R2, R1, R0	//R0-R1 dans R0
	JSR @ABSA	//Appelle abs(x)
	SRA R0, R0	//R0/2 dans R0
	LDW R1, (SP)+	//Charge R1 avec le sommet de la pile puis incr�mente (d�pile) SP
	RTS		//Return [avec SP<-SP+T (d�pile)]

	//Fonction abs(x)
ABSA	JGE #POSIT-$-2	//Saute si >=0
	NEG R0,R0	//-R0 dans R0
POSIT	RTS 		//Return et d�pile
	
	//INIT (� la fin sinon �a sort de la m�moire)
	RSB RESETA-$
	JEA @DEBUT
