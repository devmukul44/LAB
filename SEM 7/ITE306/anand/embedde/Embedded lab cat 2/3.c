#include<stdio.h>
#include<regx51.h>
int main()
{
	unsigned char x;
	unsigned int i;
	TMOD=0x020;
	SCON=0x050;
	TH1=0x0fe;
	TR1=1;
	
	while(1)
	{
	x=SBUF;
	i=x;
		SBUF=x;
		if(i%2==0)
		{
			P1_1=0;
			P1_7=0;
		}
		else
		{
			P1_1=1;
			P1_7=1;
		}
		while(RI==0);
		RI=0;
	}
}