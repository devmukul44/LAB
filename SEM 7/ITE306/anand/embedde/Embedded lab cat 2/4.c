#include<stdio.h>
#include<regx51.h>
#include<math.h>
void delay(unsigned int u)
{
	unsigned int i,j;
	for(i=0;i<u;i++)
	{
		for(j=0;j<i;j++)
		{
		}
	}
}
int main()
{
	unsigned int i;
	P2=0x00;
	for(i=0;i<10;i++)
	{
		P1=pow(2,i)-1;
		delay(2000);
		if(P1_7==1)
		{
			P2_0=1;
			while(P2_0==1);
			//delay(30000);
		}
	}
	return 0;
}