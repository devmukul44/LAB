import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Cl12
{
public static void main(String args[])throws Exception
{
Socket sk=new Socket("localhost",4567);
Scanner sc=new Scanner(System.in);
String ip=sc.nextLine();
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
String ipa[]=ip.split("\\.");
op.writeBytes(ipa[0]+"\n");
String cls=bf.readLine();
System.out.println(" class "+cls);
sk.close();
}
}


