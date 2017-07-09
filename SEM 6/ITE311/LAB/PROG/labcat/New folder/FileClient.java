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
String ss="",s="";
int k=0;
while((s=fr.readLine())!=null)
{	bf.readLine();
	if(s!=null)
	{
op.writeBytes(s+"\n");
p.println(s);

	}

}


p.println("File Successfully Sent\n");
p.close();


}

}