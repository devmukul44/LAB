#include<iostream>
using namespace std;
int np,nb;
int p[10],b[10];

void firstfit()
{
	for(int i=0;i<np;i++)
	{
		for(int j=0;j<nb;j++)
		{
			if(p[i] <= b[j])
			{
				cout<<"\nProcess- P"<<i<<"is allocated to Memory Block- B"<<j;
				b[j] = -1;
				p[i] = -1;
				break;
			}
			
		}
	}
	for(int i=0;i<np;i++)
	{
	if(p[i] != -1)	
	{
		cout<<"process- P"<<i<<"not allocated!";				
	}
	}
	
	for(int i=0;i<nb;i++)
	{
	if(b[i] != -1)	
	{
		cout<<"Memory Block- B"<<i<<"not allocated!";				
	}
	}
}

void bestfit()
{
	//arrange the number of blocks in accending order!
	for(int i=0;i<(nb-1);i++)
	{
		for(int j=0;i<((nb-1)-i);i++)
		{
			if(b[j] > b[j+1])
			{
				int temp;
				temp = b[j];
				b[j] = b[j+1];
				b[j+1] = temp;
			}
		}
	}
	firstfit();

}

void worstfit()
{
		//arrange the number of blocks in decending order!
	for(int i=0;i<(nb-1);i++)
	{
		for(int j=0;i<((nb-1)-i);i++)
		{
			if(b[j] < b[j+1])
			{
				int temp;
				temp = b[j];
				b[j] = b[j+1];
				b[j+1] = temp;
			}
		}
	}
	firstfit();
}

int main()
{
	cout<<"enter number of Memory blocks!";
	cin>>nb;
	cout<<"enter number of processes!";
	cin>>np;
	
	for(int i=0;i<np;i++)
	{
	cout<<"\nEnter Memory Requirements for processes- P"<<i;
	cin>>p[i];
	}
	for(int i=0;i<nb;i++)
	{
	cout<<"\nEnter Size of Memory Block- B"<<i;
	cin>>b[i];
	}
	int x,cont;
	do
	{	
	cout<<"Enter Memory Storage Allocation method you want to use..\n";
	cout<<"1. First Fit\n2. Best Fit\n3. Worst Fit\n";
	cin>>x;

	switch(x)
	{
	case 1:
	firstfit();
	break;
	
	case2:
	bestfit();
	break;
	
	case 3:
	worstfit();	
	break;
	}
	cout<<"Do you want to continew\n1. Yes\n2. No";
	cin>>cont;
	}while(cont==1);
	return (0);
}
