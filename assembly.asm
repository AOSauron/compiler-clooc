SP EQU R15
ORG 0x2000
START 0x2000
NEWLINE RSW 1
	LDW R0, #0x0a00
	STW R0, @NEWLINE
entier RSW 1
sum RSW 1
	TRP #64
