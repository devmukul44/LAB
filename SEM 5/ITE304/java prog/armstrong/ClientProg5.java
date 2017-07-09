import java.io.*;
import java.net.*;
import java.util.*;
public class ClientProg5
{
public static void main(String []args) throws Exception
{

Socket s1=new Socket("localhost",3555);
System.out.print("enter the number");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BufferedReader brr=new BufferedReader(new InputStreamReader(s1.getInputStream()));
String a=br.readLine();
String b=a.trim();
DataOutputStream o2=new DataOutputStream(s1.getOutputStream());
o2.writeBytes(b+'\n');
String msg=brr.readLine();
System.out.println(msg+'\n');
s1.close();
}
}
