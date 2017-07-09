#include<iostream>
#include<math.h>
//#include<stdlib.h>
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
	cout<<"n: "<<n<<"\n";
	cout<<"tn: "<<tn<<"\n";
	int e,x0,x1;
	e = rand() % tn + 1;
		
	while(e % tn == 0)
	{
	    e = rand() % tn + 1;
	}
	e=7;
	cout<<"e: "<<e<<"\n";
	int n1 = n-1;
	x0 = rand() % n1 + 1;  //seed value
	int LSB = x0 & 1;
	cout<<LSB<<"\t";
	
	for(int i=0; i<100; i++)
	{
		x1 = ( (int) ( pow((double)x0,(double)e) ) ) % n ;
		LSB = x1 & 1;
		cout<<LSB<<"\t";
		x0 = x1;
	}
	return 0;
}