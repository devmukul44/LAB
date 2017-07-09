#include<iostream>
#include<graphics.h>
#include<conio.h>
using  namespace std;


int main()
{
int xc,yc,r;
initwindow(400,400);
cout<<"Enter co-ordinates of the centre:";
cin>>xc>>yc;
cout<<"Enter radius of circle:";
cin>>r;
circle(xc,yc,r);
//cout<<"Enter eny key for boundary fill operation";
//getch();
void bfill(int,int,int,int);
bfill(xc,yc,RED,WHITE);
getch();
return 0;
}

void bfill(int x,int y,int f_col,int b_col)
{
int current = getpixel(x,y);

if(current!=f_col && current!=b_col)
{
delay(1);
putpixel(x,y,f_col);
bfill(x+1,y,f_col,b_col);
bfill(x-1,y,f_col,b_col);
bfill(x,y+1,f_col,b_col);
bfill(x,y-1,f_col,b_col);
}
}
