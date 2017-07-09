#include<iostream>
using namespace std;
int n;
int a[10];

int main()
{
	cout<<"enter number of elements in array";
	cin>>n;
	
	for(int i=0;i<n;i++)
	{
	cout<<"enter array elements\n";
	cin>>a[i];
	}
	
	cout<<"\nbefore sorting";	
	for(int i=0;i<n;i++)
	{
		cout<<"\n"<<a[i];
	}
	
	for(int i=0; i<n-1; i++)
	{
		for(int j=0; j<n-1-i; j++)
		{
			if(a[j] < a[j+1])
			{
				int temp;
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	
	cout<<"\narray elements in decending order";
	for(int i=0;i<n;i++)
	{
		cout<<"\n"<<a[i];
	}
return (0);
}
