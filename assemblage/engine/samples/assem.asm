ORG 0x1000
START 0x1000

entier rsw 1
SUM rsw 1

// Carriage return
CAR rsw 1
LDW R3, #0x0a00
STW R3, @CAR

// Debut programme
LDW R10, #1
STW R10, @entier
LDW R10, #7
STW R10, @SUM

LDW R1, @entier
LDW R2, @SUM
ADD R2, R1, R2

STW R2, @SUM

// Write
LDW R3, #0x0030
ADD R2, R3, R0

SHL R0, R0
SHL R0, R0
SHL R0, R0
SHL R0, R0
SHL R0, R0
SHL R0, R0
SHL R0, R0
SHL R0, R0

PRINT rsw 1

STW R0, @PRINT
LDW R0, #PRINT
TRP #66

LDW R0, #CAR
TRP #66


SP EQU R15

//STW "salut", SP
//LDW R0, SP
//TRP #66


// Exit 0
TRP #64
