#include<iostream>
#include<math.h>
using namespace std;

int main()
{
	int p,q,n,tn;
	cout<<"enter p (prime)";
	cin>>p;
	cout<<"enter q (prime)";
	cin>>q;
	
	n = p*q;
	tn = (p-1) * (q-1);
	
	int e x0,x1;
	e = random(tn-1+1);		// upper - lower + 1
	x0 = random(n-1-1+1);
	cout<<x0<<"/t";
	for(int i=0; i<100; i++)
	{
		x1 = (int) ( pow((double)x0,(double)e) );
		cout<<"x1"<<"\t";
		x0 = x1;
	}
}