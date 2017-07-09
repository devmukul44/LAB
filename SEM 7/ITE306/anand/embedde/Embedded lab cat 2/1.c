#include<stdio.h>
#include<regx51.h>
sbit SW=P2^0;
int main()
{
	unsigned int i;
	unsigned char a[]="Shivam";
	unsigned char b[]="Parashar";
	SCON=0x050;
	TMOD=0x020;
	TH1=0x0fe;
	TR1=1;
	if(SW==0)
	{
		for(i=0;i<6;i++)
		{
			SBUF=a[i];
			while(TI==0);
			TI=0;
		}
	}
	else if(SW==1)
	{
		for(i=0;i<8;i++)
		{
			SBUF=b[i];
			while(TI==0);
			TI=0;
		}
	}
}