import java.io.*;
import java.net.*;
import java.util.*;
public class ChatClient
{
public static void main(String ar[]) throws Exception
{
	Scanner in = new Scanner(System.in);
	Socket s = new Socket("localhost",8787);
	
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	DataInputStream dis = new DataInputStream(s.getInputStream());
	
	System.out.println("please wait ");
	while(true)
	{
		System.out.println("type and press enter to send: ");
		String temp = in.nextLine();
		dos.writeUTF(temp);
			

		String str = dis.readUTF();
		System.out.println("client says: " + str);
		
		
		
		
	}

}
}
