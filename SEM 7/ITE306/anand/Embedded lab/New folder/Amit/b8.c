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
P0_0=0;
delay(2000);
P0_0=1;
delay(2000);
   }


}