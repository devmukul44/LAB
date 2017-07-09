import java.io.*;
import java.net.*;
import java.util.*;
public class AuthServer
{

public static void main(String ar[]) 
{
	try
	{
	Scanner in = new Scanner(System.in);
	
	ServerSocket ss = new ServerSocket(8790);
	Socket s = ss.accept();
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	DataInputStream dis = new DataInputStream(s.getInputStream());
	
	String uname = "adhi";
	String upass = "ihda";
	while(true)
	{
		String str = dis.readUTF();
		System.out.println("server says: " + str);
		int index = str.indexOf("|");
		String name = str.substring(0,index);
		String pass = str.substring(index+1);
		
		System.out.println(name + "  " + pass);
		if(name.equals(uname)&&pass.equals(upass))
		{
			dos.writeUTF("success");
		}
		else
		{	
			dos.writeUTF("failure");
		}
		
	
		
		
	}
	}
	catch(Exception e)
	{
	}

}
}
