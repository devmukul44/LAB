import java.io.*;
import java.net.*;
import java.util.*;
public class ChatServer
{

public static void main(String ar[]) throws Exception
{
	Scanner in = new Scanner(System.in);
	
	ServerSocket ss = new ServerSocket(8787);
	Socket s = ss.accept();
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	DataInputStream dis = new DataInputStream(s.getInputStream());
	
	System.out.println("please wait ");
	while(true)
	{
		String str = dis.readUTF();
		System.out.println("server says: " + str);
		
		System.out.println("type and press enter to send: ");
		String temp = in.nextLine();
		dos.writeUTF(temp);
	
		
		
	}

}
}
