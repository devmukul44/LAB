#include<iostream>
using namespace std;
int wrt=1,readcount=0,mutex=1;
void wait(int wrt)
{
	wrt--;
}
void signal(int wrt)
{
	wrt++;
}
int main()
{
	int n,continew,reader=0,writer,i=1,j,k;
	
	do
	{
			cout<<"enter the task:\n1.read\n2.write";
			cin>>n;
			switch(n)
			{
			
			case 1:
				do{
				
				//wait(mutex);
				mutex--;
				if(wrt==1){
			
				readcount++;
				
				if(readcount==1)
				{
					//wait(wrt);
					wrt--;
				}
				//signal(mutex);
				mutex++;
				cout<<"reading...\n";
			
				//i++;
				
				
			}
			else{
				if(readcount>=1)
				{
					readcount++;
				
				//signal(mutex);
				mutex++;
				cout<<"reading...\n";
			
				//i++;
				}
				else
				{
				cout<<"writing process going on!";
				}
			}
			cout<<"do you want to add more readers?\n1.yes\n2.no";
			    cin>>reader;
				 }while(reader==1);
			
			
			do{
					cout<<"do you want to stop reading??\n1.yes\n2.no";
					cin>>j;
				if(j==1)
				{
					
					wait(mutex);
				{
					if(readcount!=0)
					readcount--;
					cout<<"terminating reading....\n";
					if(readcount==0)
					{
						//signal(wrt);
						wrt++;
					}
				}
				signal(mutex);
			   }
			   else
			   {
			   	cout<<"exiting....";
			   }
			}while(j==1);
				
				break;
				case 2:
				do
				{
				if(wrt==1)
				{
				//wait(wrt);
				wrt--;
				cout<<"writing....";
				}
				else
				{
					cout<<"some one is currently reading or writing!";
				}
				
				cout<<"do you want to stop writing?\n1.yes\n2.no";
				cin>>k;
				if(k==1)
				{
					wrt++;
				}
				
				cout<<"do you want to continew writing process?\n1.yes\n2.no";
			    cin>>writer;
				}while(writer==1);
				
				break;
			
		}
			cout<<"do you want to continew the process?\n1.yes\n2.no";
			cin>>continew;
	}while(continew==1);
	
	
	return(0);
}
