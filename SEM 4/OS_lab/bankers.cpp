#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;

int n,m;
int available[10];
int mx[10][10];
int allocation[10][10];
int need[10][10];
int work[10];
bool finish[10];
int request[10][10];

int available_temp[10];
int allocation_temp[10][10];
int need_temp[10][10];

int safety() //finding out weather the system is safe state :P
{
	
	for(int i=0;i<m;i++)
	{
		work[i]=available[i];
	}
	
	for(int i=0;i<m;i++)
	{
		finish[i]=false;
	}
	
	int flag=0; //check need<=work for all the resources of a single process!
	int f=0;	// final check...
	int f1=0;	//deadlock condition! breaks...
	int f2=0;	//safe condition! breaks...
	int z[10];	//checks if deadlock !
	int s[10];  //gets the sequence of process execution...
	int a=0;
	for(int i=0;i<n;i++)
	{
		z[i]=0;
	}
	

	for(int i=0;i<n;i=(i+1)%n)
		{
			if(f1==1)
			break;
			
			if(f2==n)
			break;
			
		if(finish[i]==false )
		{
			flag=0;
			
		for(int j=0;j<m;j++)
		{
		
		if(need[i][j]<=work[j])
			{
			work[j] = work[j] + allocation[i][j];
			flag++;
			}
		else
		{	
			z[i]++;		
			
			if(z[i]==n)
			{
			f1++;
			break;
			}
		}
	
		if(flag==m)
			{
				finish[i] = true;
				
				s[a]=i;
				 a++;
				
				f2=0;
				
				for(int k=0;k<n;k++)
				{
				if(finish[k] == true)
					{
						f2++;
					}
				}
			}
		}
		}
	}
	f=0;
	for(int i=0;i<n;i++)
	{
		if(finish[i] == true)
		{
			f++;
		}
	}
	
	if(f==n)
	{
		cout<<"system is in safe state :)\n";
		cout<<"safe sequence:\n";
		
		for(int i=0;i<n;i++)
		{
			cout<<"\n"<<s[i];
		}
		
		return (1);	
	}
	else
	{
		return(0);
	}
	
}

int resource()
{
	int process;
	cout<<"\nEnter the process...\n";
	cin>>process;
	
if(process <= n)
{

		for(int j=0;j<m;j++)
		{
				cout<<"the NEED of your process P"<<process<<"\tResource R"<<j<<"\tis :- \n";
				cout<<need[process][j];
				
				cout<<"Enter the Request\n";
				cin>>request[process][j];
		}


		for(int j=0;j<m;j++)
		{
			if(request[process][j] <= need[process][j])
			{
				if(request[process][j] <= available[j])	//pretend to allocate the resourcs...
				{
					available[j] = available[j] - request[process][j];
					allocation[process][j] = allocation[process][j] + request[process][j];
					need[process][j] = need[process][j] - request[process][j];
					
						int saf=0;
						saf=safety();
						if(saf==1)
						{
							cout<<"allocating resources...";
							
						}
						else
						{
							cout<<"not in safe state(deadlock condition) System exiting...";
							cout<<"\n";
							available[j] = available_temp[j];
							allocation[process][j] = allocation_temp[process][j] ;
							need[process][j] = need_temp[process][j];
						}
				}
				else
				{
					cout<<"your requst is more than available this process has to wait...";
				}
				
			}
			else
			{
				cout<<"you can't request more than your need!";
			}
		}
	
}
else
{
	cout<<"enter valid process!";
}
	return (1);
}

int main()
{
	cout<<"enter number of processes:-";
	cin>>n;
	cout<<"enter number of resources required by each process:-";
	cin>>m;
	
	for(int i=0;i<m;i++)
	{
		cout<<"enter the availability of resource R"<<i<<":-";
		cin>>available[i];
		
		available_temp[i] = available[i];
	}
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
				cout<<"enter the maximum need of process P"<<i<<" "<<"resource R"<<j<<":-";
				cin>>mx[i][j];
		}
	}
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
				cout<<"enter the current allocation of process P"<<i<<" "<<"resource R"<<j<<":-";
				cin>>allocation[i][j];
				
				allocation_temp[i][j] = allocation[i][j];
		}
	}
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
				need[i][j]=mx[i][j]-allocation[i][j];
				
				need_temp[i][j] = need[i][j];
		}
	}
	
	//cout<<"checking if the system is in safe state...\n";
	//	saf= safety();
	/*	if(saf==1)
	{
		// system is in safe state...
		cout<<"\nAllocating resources...\n";
		res =resource();
		if(res==1)
		{
			cout<<"\nresource allocated successfully!! :)";
		}
	}
	else
	{
		cout<<"no system is not in safe state(Deadlock situation!) :( \n"<<"system exiting...\n";
		exit(0);
	}*/
	int saf,res,sw;
	
			do
			{
			cout<<"\nenter the task:\n1.safety check\n2.request resource\n3.Exit";
			cin>>sw;
			
			switch(sw)
			{
			
			case 1:
			cout<<"checking if the system is in safe state...\n";
			saf= safety();
			if(saf==1)
			{
			// system is in safe state...
		
			}
			else
			{
				cout<<"no system is not in safe state(Deadlock situation!) :( \n"<<"system exiting...\n";
			exit(0);
			}
				break;
			case 2:
				res=resource();
				break;
			}
			}while(sw<3);
	return(0);
}

