import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Cl7
{
public static void main(String args[])throws Exception
{
Socket sk=new Socket("localhost",4567);
Scanner sc=new Scanner(System.in);


BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());

while(true)
{
	System.out.println("Enter username");
	String un=sc.nextLine();
op.writeBytes(un+"\n");
if(bf.readLine().equals("true"))
{
System.out.println("Enter password");
op.writeBytes(sc.nextLine()+"\n");
if(bf.readLine().equals("true"))
{System.out.println("Successful Login");break;}
else 
System.out.println("Invalid password");
}
else
System.out.println("Invalid Username");

}
sk.close();
}
}


