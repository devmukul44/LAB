#include<graphics.h>
#include<iostream>
using namespace std;

void disp(float x,float y,float xc,float yc)
{
	putpixel(xc+x,yc+y,4);
	putpixel(xc+x,yc-y,4);
	putpixel(xc-x,yc+y,4);
	putpixel(xc-x,yc-y,4);
}
int main()
{
	initwindow(400,500,"");
    float r,xc,yc,a,b;
    cin>>xc>>yc;
    cin>>a>>b;
    float x=0,y=b;
    float p=b*b-((a*a)*b)+((a*a)/4);
    disp(x,y,xc,yc);
    float e=x;
    float c=2*a*a*y;
    while(e<c)
    {
    	x++;
    	e=e+2*b*b;
    	if(p<0)
    	{
    		p=p+e+b*b;
    	}
    	else
    	{
    		y--;
    		c=c-2*a*a;
    		p=p+e-c+b*b;
    	}
    	disp(x,y,xc,yc);
    	
    }
    p=(b*b)*(x+(float)0.5)*(x+(float)0.5)+a*a*(y-1)*(y-1)-(b*b*a*a);
    disp(x,y,xc,yc);
    while(y>0)
    {
    	y--;
    	c=c-2*a*a;
    	if(p>0)
    	{
    		p=p-c+a*a;
    		
    	}
    	else
    	{
    		x++;
    		e=e+2*b*b;
    		p=p+e-c+a*a;
    	}
    	disp(x,y,xc,yc);
    }
    
    
	while(!kbhit());
	
	return 0;
}
