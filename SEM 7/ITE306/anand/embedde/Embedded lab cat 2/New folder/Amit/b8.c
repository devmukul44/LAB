#include<stdio.h>
#include<regx51.h>
void delay(const unsigned int x)
{	   unsigned int i,j;
for(i=0;i<x;i++)
for(j=0;j<120;j++)
{}
}
int main()
{
while(1)
{
P0=0x01;
delay(20000);
P0=0x03;   }


}