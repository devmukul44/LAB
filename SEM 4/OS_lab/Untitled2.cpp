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
				cout<<"\nProcess- P"<<i<<"is allocated to Memory Block- B"<<j<<"\n";
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
		cout<<"\nprocess- P"<<i<<"not allocated!\n";				
	}
	}
	
	for(int i=0;i<nb;i++)
	{
	if(b[i] != -1)	
	{
		cout<<"\nMemory Block- B"<<i<<"not allocated!\n\n";				
	}
	}
}

void bestfit()
{
	//arrange the number of blocks in accending order!
	for(int i=0; i<nb-1; i++)
	{
		for(int j=0; j<nb-1-i; j++)
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
	
	for(int i=0;i<nb;i++)
	{
		cout<<"array accending order";
		cout<<"\n"<<b[i];
	}

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
	cout<<"enter number of processes!";
	cin>>np;
	cout<<"enter number of Memory blocks!";
	cin>>nb;
		
	for(int i=0;i<np;i++)
	{
	cout<<"\nEnter Memory Requirements for process- P"<<i<<"\n";
	cin>>p[i];
	}
	for(int i=0;i<nb;i++)
	{
	cout<<"\nEnter Size of Memory Block- B"<<i<<"\n";
	cin>>b[i];
	}
	
	int x,cont;
	cout<<"Enter Memory Storage Allocation method you want to use..\n1. First Fit\n2. Best Fit\n3. Worst Fit\n";
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

	return (0);
}
