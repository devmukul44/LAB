MOV SCON,#50H
MOV TMOD ,#20H
MOV TH1,#0FAH
SETB TR1
AGAIN:MOV SBUF,#'M'
LOOP:JNB RI,LOOP
CLR RI
SJMP AGAIN
END