import java.io.*;
import java.net.*;
import java.util.*;
public class ServerProg5
{
public static void main(String []args) throws Exception
{
ServerSocket s1=new ServerSocket(3555);
while(true)
{
Socket s2=s1.accept();
BufferedReader brr=new BufferedReader(new InputStreamReader(s2.getInputStream()));
DataOutputStream o2=new DataOutputStream(s2.getOutputStream());
String msg1=brr.readLine();
String msg2=msg1.trim();

int a=Integer.parseInt(msg2);
System.out.println(a);
int temp = a;
int sum=0;
int a1;
while(a!=0)
{
a1=a%10;

sum=sum+(a1*a1*a1);

a=a/10;

}
System.out.println(sum);
if(sum == temp)
{
o2.writeBytes("Armstron"+'\n');
}
else
{
o2.writeBytes("not Armstron"+'\n');
}
s2.close();
}
}
}


