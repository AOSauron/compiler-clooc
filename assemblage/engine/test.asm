
  LOADA EQU 0xFFDC
  SP EQU R15
  STDIN EQU 0x8000
  STDOUT EQU 0x8088
  STACKA EQU 0x1000

  ORG LOADA
  START LOADA

//Test print
DEBUT LDW SP, #STACKA
      LDW R0, #STDOUT
      LDW R1, #0x3031
CHAINE string "TEST"
      STW R1, @0xffe8
      LDW R0, #CHAINE
      TRP #66
      //RTI
//CHNE string "dr"
      //LDW R0, #CHNE
      //TRP #66
      TRP #64
