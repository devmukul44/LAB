import java.io.*;
import java.util.*;
import java.net.*;
class FileClient
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
Socket sk=new Socket("localhost",4567);
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
PrintStream p=new PrintStream(System.out);

p.println("Enter the file name to be sent");
String fsent=sc.next();
BufferedReader fr=new BufferedReader(new FileReader(fsent));
p.println("Enter the name of file to be saved as");
op.writeBytes(sc.next()+"\n");

String s;
while((s=fr.readLine())!=null)
op.writeBytes(s+"\n");
op.writeBytes("File Successfully Sent\n");
p.close();

}

}