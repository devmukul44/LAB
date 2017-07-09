#include<regx51.h>
#include<Math.h>
void delay()
{
	unsigned int i,j;
	for(i=0;i<1000;i++)
	for(j=0;j<10000;j++){}
}
int main()
{
	unsigned int i;
	P1=0x00;
	P2=0x00;
	for(i=0;i<9;i++)
	{
		P1=pow(2,i)-1;
		delay();
	}
	if(P1_7==1)
	{
		P2_0=1;
		while(1);
	}
}