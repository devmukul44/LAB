#include<stdio.h>
#include<regx51.h>
void delay(unsigned int x)
{	   unsigned int i,j;
for(i=0;i<x;i++)
for(j=0;j<120;j++)
{}
}
int main()
{
while(1)
{
P1=0x55;
	delay(10000);
	P1=0xff;
	delay(10000);
}
}