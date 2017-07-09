# include <iostream>
# include <conio.h>
# include <graphics.h>
# include <math.h>
using namespace std;

void Circle(int Radius,int xC,int yC);
int main()
{
	
	initwindow(400,400);
    int Radius, xC, yC;
    cout<< endl << "Enter Center point coordinates...";
    cout<<endl<<"  Xc    : ";
    cin>>xC;
    cout<<endl<<"  Yc    : ";
    cin>>yC;
    cout<<endl<<"Radius  : ";
    cin>>Radius;
    cleardevice();
    Circle(Radius,xC,yC);
    getch();
    return 0;
}
void Circle(int Radius,int xC,int yC)
{
    int P;
    int x,y;
    void Draw(int x,int y,int xC,int yC);
    P = 1 - Radius;
    x = 0;
    y = Radius;
    Draw(x,y,xC,yC);
    while (x<=y)
    {
        if (P<0)
        {
            P = P +(2 * x + 1);
            x = x+1;
        }
        else
        {
            P = P+(2 * (x - y) + 1);
            x = x+1;
            y = y-1;
        }
        Draw(x,y,xC,yC);
    }
}
void Draw(int x,int y,int xC,int yC)
{
	delay(1);
    putpixel(xC + x,yC + y,10);
    putpixel(xC + x,yC - y,10);
    putpixel(xC - x,yC + y,10);
    putpixel(xC - x,yC - y,10);
    putpixel(xC + y,yC + x,10);
    putpixel(xC - y,yC + x,10);
    putpixel(xC + y,yC - x,10);
    putpixel(xC - y,yC - x,10);
}
