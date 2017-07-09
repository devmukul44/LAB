#include<stdio.h>
#include<regx51.h>
int main()
{
SCON=0x050;
TMOD=0x020;
TH1=0x0fe;
TR1=1;
while(1)
{
SBUF='m';
while(TI==0);
TI=0;
}


}