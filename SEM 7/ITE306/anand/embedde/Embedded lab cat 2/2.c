#include<stdio.h>
#include<regx51.h>
void wait(unsigned int h)
{
	unsigned int i,j;
	for(i=0;i<h;i++)
	{
		for(j=0;j<120;j++)
		{
		}
	}
}
int main()
{
	P0=0x00;
	while(1)
	{
		P0_0=1;
		wait(40000);
		P0_0=0;
		P0_1=1;
		wait(5000);
     P0_1=0;
		P0_2=1;
		wait(40000);
		P0_2=0;
		P0_1=1;
		wait(5000);
     P0_1=0;
	}
}