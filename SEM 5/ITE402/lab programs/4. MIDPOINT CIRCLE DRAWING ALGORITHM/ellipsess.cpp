#include<iostream.h>
#include<math.h>
#include<graphics.h>
void display(int x, int y, int xc, int yc);
int main()
{
	int x,y,rx,ry,xc,yc;
	float p,e,c;
	cout<<"Enter the center co";
	cin>>xc>>yc;
	cout<<"Enter the radius";
	cin>>rx>>ry;
	p=ry*ry - (rx*rx*ry) + (ry*ry/4);
	x=0;
	y=ry;
	e=x;
	c=2*rx*rx*y;
	while(e<c)
	{
		x++;
		e=e+(ry*ry);
		if(p<0)
		{
		p=p+e+(ry*ry);
		}
		else
		{
			y--;
			c=c-(rx*rx*2);
			p+=e-c+(ry*ry);
		}
		display(x,y,rx,ry);
	}
	p=
	
	
}
void display(int x, int y, int xc, int yc)
{
	
}
