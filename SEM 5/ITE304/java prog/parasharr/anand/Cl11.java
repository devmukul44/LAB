import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Cl11
{
public static void main(String args[])throws Exception
{
Socket sk=new Socket("localhost",4567);
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
String ipa=n+"";
op.writeBytes(ipa+"\n");
String cls=bf.readLine();
System.out.println(" factorial = "+cls);
sk.close();
}
}


