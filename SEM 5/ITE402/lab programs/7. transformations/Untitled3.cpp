#include <iostream>
#include <graphics.h>
#include <math.h>
#include <conio.h>
using namespace std;

int main()
{
int x1=200,y1=200,x2=250,y2=250,x3=180,y3=270,option;

initwindow(400,400,"transformations");

matrix(int x, int y)
{
	    if(y==m)
    {
 
        for(i=0;i<x;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j]=0;
                for(int k=0;k<m;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
 
        cout<<"\n-----------------------------------------------------------\n";
 
        cout<<"\n\nMultiplication of Matrix A and Matrix B :\n\n";
 
        for(i=0;i<x;i++)
        {
            for(j=0;j<n;j++)
            {
                cout<<"\t"<<c[i][j];
            }
            cout<<"\n\n";
        }
    }
    else
    {
        cout<<"\n\nMultiplication is not possible";
    }
}
do
{
//gotoxy(1,1);
line(x1,y1,x2,y2);
line(x2,y2,x3,y3);
line(x3,y3,x1,y1);
cout<<"\n1.Translation 2.Scaling 3.Rotation 4.Exit\nEnter your choice:";
cin>>option;
switch(option){
case 1:
float tx,ty;
cout<<"Enter tx & ty: ";
cin>>tx>>ty;
matrix(tx,ty);
//x1+=tx;x2+=tx;x3+=tx;
//y1+=ty;y2+=ty;y3+=ty;
break;

case 2:
float sx,sy;
cout<<"Enter sx & sy: ";
cin>>sx>>sy;
matrix(sx,sy);
//x1*=sx;x2*=sx;x3*=sx;
//y1*=sy;y2*=sy;y3*=sy;
break;

case 3:
float deg;
cout<<"Enter angle: ";
cin>>deg;
deg = deg*3.14/180;
int x,y;
matrix(x,y);
/*x=x1;y=y1;
x1 = x*cos(deg)-y*sin(deg);
y1 = x*sin(deg)+y*cos(deg);
x=x2;y=y2;
x2 = x*cos(deg)-y*sin(deg);
y2 = x*sin(deg)+y*cos(deg);
x=x3;y=y3;
x3 = x*cos(deg)-y*sin(deg);
y3 = x*sin(deg)+y*cos(deg);*/
break;

default:
cout<<"Invalid choice";
}
}while(option <= 4);
return 0;
}
