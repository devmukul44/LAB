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
PrintWriter pw=new PrintWriter(new FileWriter(bf.readLine()));
String s;


	
		pw.println(bf.readLine());
	

System.out.println("File Successfully Recieved");
pw.close();


}

}