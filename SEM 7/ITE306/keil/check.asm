MOV DPTR,#1000H
MOV R0,#0AH
MOV B,#9FH
LOOP:
     MOVX A,@DPTR
	 CJNE A,B,LB
	 LB:
	 JNC LBA
	 MOV B,A
LBA:
     INC DPTR
	 DJNZ R0,LOOP
	 END