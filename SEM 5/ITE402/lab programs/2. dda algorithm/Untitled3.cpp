#include<iostream>
#include<graphics.h>
using  namespace std;
int main()
{
float  xa,xb,ya,yb,dx,dy,len;
float  xinc,yinc;
cout<<" \nenter the value of x1  : ";
cin>>xa;
cout<<" \nenter the value of y1  : ";
cin>>ya;
cout<<" \nenter the value of x2  : ";
cin>>xb;
cout<<" \nenter the value of y2  : ";
cin>>yb;

dx=xb-xa;
dy=yb-ya;
if(dx>dy)
{
len =dx;
}
else
{
len= dy;
}
xinc=dx/len;
yinc=dy/len;
int x,y;
x=xa;
y=ya;
float a,b;
initwindow(400,400);
putpixel(xa,ya,10);
for(int i=0;i<len;i++)
{
a=x+xinc;
b=y+yinc;
x=(int)a;
y=(int)b;
putpixel(x,y,10);
}
getch();
return 0;
}

