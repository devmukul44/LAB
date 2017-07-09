import java.io.*;
import java.util.*;
import java.net.*;
class FileServer
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(4567);
Socket sk=ss.accept();
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
PrintWriter pw;
String jj=bf.readLine(); 
String s;
while(true)
{
	
try{op.writeBytes("true\n");
	s=bf.readLine();
	
	pw=new PrintWriter(new FileWriter(jj,true));

	
	pw.println(s);
	pw.close();
	if(s==null)
		break;
}
catch(Exception e)
{break;}
}
System.out.println("File Successfully Recieved");



}

}