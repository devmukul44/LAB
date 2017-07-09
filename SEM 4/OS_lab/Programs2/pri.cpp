#include<iostream>
#include<stdlib.h>
using namespace std;
struct sjf
{
	int pri;
	int at;
	int bt;
	int ct;
	int tat;
	int stt;
};
int main()
{
	int n,i,flag=0 ,count=0,a=0,q=0,max=0;
	cout<<"enter the number of processes\n";
	cin>>n;
	struct sjf s[n+1];
	cout<<"enter the priority,\tarrival time,\nburst time of each process\n";
	for(i=0;i<n;i++)
	{
		cin>>s[i].pri>>s[i].at>>s[i].bt;
		s[i].stt=0;
		if(i<n-1)
		cout<<"next\n";
	}
	s[n].stt=1;
	count=n;
	q=n;
	while(count>0)
	{
		for(i=0;i<n;i++)
		{
			if(s[i].at<=a && s[i].stt==0 && s[i].pri>=max)
			{
				if(s[i].pri==s[q].pri && s[q].at<s[i].at)
				{ q=q;}
				else
				{
					s[q].stt=0;
					q=i;
				}
			  s[q].stt=1;
			  max=s[i].pri;
			  flag=1;	
			}
		}
		if(flag==1)
		{
			s[q].ct=a+s[q].bt;
			s[q].tat=s[q].ct-s[q].at;
			a=a+s[q].bt;
			q=n;
			flag=0;
			max=0;
			count--;
		}
		else
		{
			a+=1;
		}
	}
	for(i=0;i<n;i++)
	{
		cout<<"the completion time for process:\t"<<i+1<<"\tis:\t"<<s[i].ct<<"\tand turn around time is:\t"<<s[i].tat<<"\n\n";
	}
	system("pause");
}
