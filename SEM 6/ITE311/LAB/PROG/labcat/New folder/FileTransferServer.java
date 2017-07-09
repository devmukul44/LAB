import java.net.*;
import java.io.*;
import java.util.*;
class FileTransferServer
{
public static void main(String[] args)throws Exception
{
ServerSocket ss=new ServerSocket(4567);
Socket sk=ss.accept();

BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
String filename=bf.readLine();
BufferedReader fr=new BufferedReader(new FileReader(filename));
String s="";
while(true)
{
bf.readLine();
s=fr.readLine();
if(s==null)
	break;
op.writeBytes(s+"\n");
}
System.out.println("File Sent");
}

}