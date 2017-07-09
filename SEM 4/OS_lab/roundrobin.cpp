#include<stdio.h>
struct p
{
	int at,bt,wt,tt,pn,st,ft;
}pr[10];
int main()
{
	int n,tq,i,flag=0,f=0,twt=0,ttt=0;
	float awt,att;
	printf("\nEnter the number of processes:- ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("\nEnter the arrival time of process P%d :-",(i+1));
		scanf("%d",&pr[i].at);
		pr[i].pn=(i+1);
		printf("\nEnter the burst time of process P%d :-",(i+1));
		scanf("%d",&pr[i].bt);
	}
	for(int i=0;i<n;i++)
	{
		pr[i].wt=0;
		pr[i].tt=0;
	} 
	printf("\nEnter the time quantum :-");
	scanf("%d",&tq);
	i=0;
	pr[0].st=0;
	for(int k=0;k<n;k++)
	{
		pr[k].ft=pr[k].at;
	}
	do
	{
		flag=0;
		if(pr[i].bt>=tq)
		{
			pr[i].bt=pr[i].bt-tq;
			pr[i].wt=pr[i].wt+(pr[i].st-pr[i].ft);
			f=f+tq;
			pr[i].ft=f;
		}
		else if(pr[i].bt<tq&&pr[i].bt!=0)
		{
			f=f+pr[i].bt;
			pr[i].bt=0;
			pr[i].wt=pr[i].wt+(pr[i].st-pr[i].ft);
			pr[i].ft=f;
		}
		else 
		{
			if(pr[i].bt==0)
			{
				pr[i].tt=pr[i].ft;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(pr[j].bt==0)
			flag=flag+1;
		}
		i=(i+1)%n;
		pr[i].st=f;
	}while(flag!=n);
	for(int i=0;i<n;i++)
	{
		printf("\nWaiting time of process P%d : %d",(i+1),pr[i].wt);
		printf("\nTurn around time of process P%d : %d",(i+1),pr[i].ft);
		twt=twt+pr[i].wt;
		ttt=ttt+pr[i].ft;
	}
	awt=(float)twt/n;
	att=(float)ttt/n;
	printf("\nAverage waiting time :- %f",awt);
	printf("\nAverage turn around time :- %f",att);
}
