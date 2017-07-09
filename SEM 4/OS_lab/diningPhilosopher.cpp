#include<iostream>
using namespace std;
int ch[4],ph[4];

int main()
{
	int n,continew;
	
	for(int i=0;i<4;i++)
	{
		ch[i] = 1;
		ph[i] = i;
	}
	cout<<"you have 4 philosophers and 4 chopsticks...\n";
	
	do
	{
	cout<<"enter philosopher you want,to start eating\n 0,1,2,3\n";
	cin>>n;
	
	for(int i=0;i<4;i++)
	{
		if(ph[i]  == n)
		{
			if(ch[i] == 1 && ch[(i+1)%4] == 1)
			{
				ch[i] = 0;
				ch[(i+1)%4] = 0;
				cout<<"Philosopher- P"<<i<<" is Eating";
			}
			else
			{
				cout<<"resources not free...Philosopher- P"<<i<<" waiting!";
			}
		}
	}
	cout<<"\nDo you want to continew\n1.yes\n2.no\n";
	cin>>continew;
	}while(continew == 1);
return(0);
}
