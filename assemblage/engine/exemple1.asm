	RESETA EQU 0xFFFA
	INA EQU 0xFFA0
	OUTA EQU 0xFFA2
	LOADA EQU 0xFFDC
	SEUIL EQU 0003
	ORG LOADA	//Charge à ladresse..
	START LOADA	//Lance à ladresse ..

DEBUT	LDW R0, @INA	//M[FFA0] dans R0
	LDW R1, #SEUIL	//Seuil dans R1
	SUB R0, R1, R0	//R0-R1 dans R0
	JGE #POSIT-$-2	//Saute si >=0
	NEG R0, R0	//-R0 dans R0

POSIT	SRA R0, R0	//R0/2 dans R0
	STW R0, @OUTA	//R0 dans M[FFA2]
	JMP #DEBUT-$-2	//Retourne � DEBUT
	RSB RESETA-$	//INIT.SRC
	JEA @DEBUT
