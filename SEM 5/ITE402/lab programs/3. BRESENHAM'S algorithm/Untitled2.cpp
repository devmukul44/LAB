#include<iostream>
#include<graphics.h>
#include<math.h>
using namespace std;
int main()
{
	int x,y,x1,y1,x2,y2,dx,dy,p;
	cout<<"Enter the points";
	cin>>x1>>y1>>x2>>y2;
	dx=x2-x1;
	dy=y2-y1;
	p=(2*dx)-dy;
	x=x1;y=y1;
	initwindow(500,500,"Bresenhm");
	putpixel(x,y,07);
	while(y<=y2)
	{y++;
	if(p<0)
	{p+=2*dx;
	}
	else
	{
		x++;
		p+=2*(dx-dy);
	}
	putpixel(x,y,07);
	
	}
	getch();
	return 0;
	
}
