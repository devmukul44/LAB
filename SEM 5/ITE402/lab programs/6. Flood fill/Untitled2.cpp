#include <iostream>
#include <conio.h>
#include <graphics.h>
using namespace std;

int main()
{
int xc,yc,r;
initwindow(400,400);

cout<<"Enter co-ordinates of the centre:";
cin>>xc>>yc;
cout<<"Enter radius of circle:";
cin>>r;
circle(xc,yc,r);

//cout<<"Press any key to fill circle…";
//getch();
void ffill(int,int,int,int);
ffill(xc,yc,BLACK,RED);
getch();
return 0;
}

void ffill(int x,int y,int o_col,int n_col)
{
int current = getpixel(x,y);

if(current == o_col && current != n_col)
{
//delay(1);
putpixel(x,y,n_col);
ffill(x+1,y,o_col,n_col);
ffill(x-1,y,o_col,n_col);
ffill(x,y+1,o_col,n_col);
ffill(x,y-1,o_col,n_col);
//ffill(x+1,y+1,o_col,n_col);
//ffill(x-1,y-1,o_col,n_col);
//ffill(x+1,y-1,o_col,n_col);
//ffill(x-1,y+1,o_col,n_col);
}
}
