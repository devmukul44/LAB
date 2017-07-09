
#include<regx51.h>
#include<stdio.h>
void delay(int t)
{
unsigned i,j;
for(i=0;i<t;i++)
for(j=0;j<1200;j++);
}
void main()
{
unsigned int i;
for(i=1;i<=255;i=i*2)
{P0=i;
delay(1000);
}}