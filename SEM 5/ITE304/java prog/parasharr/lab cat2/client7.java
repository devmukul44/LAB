import java.io.*;
import java.net.*;
class client7
{
public static void main(String []args) throws Exception
{
Socket sc=new Socket("localhost",8790);
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
PrintStream pw=new PrintStream(sc.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
/*validate
while(true)
{
System.out.println("Enter username");
String s=b.readLine();
pw.println(s);
if(br.readLine().equals("true"))
{
System.out.println("enter password");
String s1=b.readLine();
pw.println(s1);
if(br.readLine().equals("true"))
{
System.out.println("Login Successful");
break;
}
else
System.out.println("Invalid password");
}
else System.out.println("Invalid username");
}*/
/*
arp ||rarp
pw.println(b.readLine());
pw.close();*/

/*DNS
pw.println(b.readLine());
*/
//class
System.out.println("Enter Ip Address");
String s=b.readLine();
String sp[]=s.split("\\.");
pw.println(sp[0]);
System.out.println(br.readLine());
}
}