import java.net.*;
import java.io.*;
import java.util.*;
class FileTransferClient
{
public static void main(String[] args)throws Exception
{
Socket sk=new Socket("localhost",4567);
Scanner sc=new Scanner(System.in);
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
System.out.println("Enter the file to be downloaded from server?");
op.writeBytes(sc.next()+"\n");
System.out.println("Save as file name..?");
String fname=sc.next();


PrintWriter pw;
String s="";
while(true)
{pw=new PrintWriter(new FileWriter(fname,true));
try{
op.writeBytes("true"+"\n");
s=bf.readLine();
}
catch(Exception e){break;}
if(s==null)
	break;
pw.println(s);
pw.close();
}
System.out.println("File Received");

}

}