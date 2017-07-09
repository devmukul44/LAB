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
unsigned int x;
P1=0x06;
x=P1;
while(1)
{
 P1=x<<1;
 delay(1000);
}
}