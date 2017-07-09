#include<iostream>
#include<stdlib.h>
using namespace std;
struct rr
{
	int pno;
	int at;
	int bt;
	int stt;
};
int main()
{
	int n,tq,i,j,count=0,temp=0,temp1=0,temp2=0,b;
	cout<<"enter the time quantum\n";
	cin>>tq;
	cout<<"enter the number of processes\n";
	cin>>n;
	struct rr r[n];
	count=n;
	cout<<"enter the process no.,arrival time and burst time of each process\n";
	for(i=0;i<n;i++)
	{
		cin>>r[i].pno>>r[i].at>>r[i].bt;
		r[i].stt=0;
		if(i<n-1)
		cout<<"next\n";
	}
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(r[i].at>r[j].at)
			{
				temp1=r[i].pno;
				r[i].pno=r[j].pno;
				r[j].pno=temp1;
				
				temp=r[i].at;
				r[i].at=r[j].at;
				r[j].at=temp;
				
				temp2=r[i].bt;
				r[i].bt=r[j].bt;
				r[j].bt=temp2;
			}
		}
	}
	while(count>0)
	{
		for(i=0;i<n;i++)
		{
			if(r[i].stt==0)
			{
			r[i].bt-=tq;
			if(r[i].bt<=0)
			{
				cout<<"\n process\t"<<r[i].pno<<"\tis completed";
				r[i].stt=1;
				count--;
			}
			else
			{
				cout<<"\n process\t"<<r[i].pno<<"\t is being processed and \n  now \n" ;
			}
		    }
		}
	}
	system("pause");
}

