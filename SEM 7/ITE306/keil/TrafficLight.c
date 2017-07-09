#include<regx51.h>
void delay()
{
	unsigned int i,j;
	for(i=0;i<1000;i++)
	for(j=0;j<10000;j++){}
}
void red()
{
	P0_0=1;
	P0_4=0;
	P0_7=0;
	delay();
}
void yellow()
{
	P0_0=0;
	P0_4=1;
	P0_7=0;
	delay();
}
void green()
{
	P0_0=0;
	P0_4=0;
	P0_7=1;
	delay();
}
int main()
{
	P0=0x00;
	while(1)
	{
	red();
	yellow();
	green();
	}
}