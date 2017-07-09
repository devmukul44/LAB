#include<stdio.h>
#include<regx51.h>
int main()
{
	unsigned char x;
	TMOD=0x020;
	SCON=0x050;
	TH1=0x0fe;
	TR1=1;
	while(1)
	{
		x=SBUF;
		P3=x;
		SBUF=x;
		while(RI==0);
		RI=0;
	}
}