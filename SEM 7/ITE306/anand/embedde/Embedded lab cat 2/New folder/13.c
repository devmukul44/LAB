#include<stdio.h>
#include<regx51.h>
void sh(unsigned char h)
{
	SBUF=h;
	while(TI==0);
		TI=0;
}
int main()
{
	TMOD=0x020;
	SCON=0x050;
	TH1=0x0fe;
	TR1=1;
	while(1)
	{
sh('D');
sh('S');
sh('h');
sh('i');
sh('v');
sh('a');
sh('m');		
	}
}