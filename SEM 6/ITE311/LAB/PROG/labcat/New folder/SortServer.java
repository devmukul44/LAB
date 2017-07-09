import java.net.*;
import java.io.*;
import java.util.*;
class SortServer
{
public static void main(String[] args)throws Exception
{
	int i,j;
	
ServerSocket ss=new ServerSocket(4567);
Socket sk=ss.accept();

BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());

String arsize=bf.readLine();
int asize=Integer.parseInt(arsize);
int a[]=new int[asize];
for(i=0;i<asize;i++)
{
	a[i]=Integer.parseInt(bf.readLine());
}
for(i=0;i<asize-1;i++)
{
	for(j=i+1;j<asize;j++)
	{
		if(a[i]>a[j])
		{a[i]=a[i]+a[j];
	a[j]=a[i]-a[j];
	a[i]=a[i]-a[j];
	}
	}
}
for(i=0;i<asize;i++)
{
op.writeBytes(a[i]+"\n");
}
}}

