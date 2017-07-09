#include<iostream>
using namespace std;

struct p
{
	int at,bt,wt,tat,ft,st;	
}pr[10];
int tq;

int main()
{
	int n=0,f=0,flag=0;
	cout<<"\nEnter number of processes!\n";
	cin>>n;
	
	for(int i=0;i<n;i++)
	{
		//cout<<"\nenter arrival time of each process\n";
		//cin>>pr[i].at;
		
		cout<<"\nenter burst time of each process\n";
		cin>>pr[i].bt;
	}
	
	cout<<"\nEnter time quantum\n";
	cin>>tq;
	f=0;
	int i=0;
	do
	{
		flag=0;
		if(pr[i].bt>=tq)
		{
			pr[i].bt = pr[i].bt - tq;
			f=f+tq;
			pr[i].ft = f;
			pr[i].wt=pr[i].wt+(pr[i].st-pr[i].ft);
		}
		else if(pr[i].bt<tq && pr[i].bt != 0)
		{
			f = f + pr[i].bt;
		    pr[i].bt=0;
			pr[i].ft=f;
			pr[i].wt=pr[i].wt+(pr[i].st-pr[i].ft);
		}
		
		for(int j=0;j<n;j++)
		{
			if(pr[j].bt == 0)
			{
				flag++;
			}
		}
		i=(i+1)%n;				
	}while(flag != n);
	
	for(int i=0;i<n;i++)
	{
		cout<<"\nfinished time of process- P"<<i<<"  is "<<pr[i].ft<<"\n";
		cout<<"\nWaiting time of process- P"<<i<<"  is "<<pr[i].wt<<"\n";
	}
	
	return(0);
}
