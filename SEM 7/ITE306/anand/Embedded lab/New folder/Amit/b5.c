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
for(x=0;x<=9;x++)
{P2=x;
delay(3000);
}
}