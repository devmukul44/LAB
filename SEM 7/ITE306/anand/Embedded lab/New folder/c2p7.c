#include<regx51.h>
#include "wait.c"
int main(){
	unsigned char c;
	TMOD = 0x20;
	SCON = 0x50;
	TH1 = 0xE7;
	TR1=1;
	while(1){
		while(RI==0);
		c=SBUF;
		P1=(int)c;
		RI=0;
		SBUF=c;
	}
}