import java.io.*;
import java.net.*;
import java.util.*;
public class AuthClient
{
public static void main(String ar[]) throws Exception
{
	Scanner in = new Scanner(System.in);
	Socket s = new Socket("localhost",8790);
	String uname = "", upass = "";
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	DataInputStream dis = new DataInputStream(s.getInputStream());
	
	
	
		System.out.println("Enter your username ");
		uname = in.nextLine();
		System.out.println("Enter your password ");
		upass = in.nextLine();
		String msg = uname + "|" + upass;
		dos.writeUTF(msg);
			
	while(true)
	{
		String str = dis.readUTF();
		System.out.println("Report: " + str);
		
		
		
		
	}

}
}
