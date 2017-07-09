#include<stdio.h>
#include<regx51.h>
void delay(const unsigned int x)
{	   unsigned int i,j;
for(i=0;i<x;i++)
for(j=0;j<1275;j++)
{}
}
int main()
{
while(1)
{
P0=0xaa;
delay(600);
P0=0x55;   }


}