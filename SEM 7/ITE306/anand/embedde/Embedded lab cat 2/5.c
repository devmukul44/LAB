#include<stdio.h>
#include<regx51.h>
int main()
{
	unsigned int i;
	unsigned char x;
	TMOD=0x020;
	SCON=0x050;
	TH1=0x0fe;
	TR1=1;
	while(1)
	{
		x=SBUF;
		SBUF=x;
		i=x;
		if(i%2==0)
		{
			P1_1=0;
		}
		else
		{
			P1_1=1;
		}
		while(RI==0);
		RI=0;
	}
}
