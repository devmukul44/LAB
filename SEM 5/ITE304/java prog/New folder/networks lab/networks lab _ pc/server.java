import java.io.*;
import java.net.*;
public class server
{
public static void main(String ar[])
{
	try{
	ServerSocket ss = new ServerSocket(8787);
	Socket s = ss.accept();
	OutputStream f1 = new FileOutputStream("test1.txt");
	DataInputStream dis = new DataInputStream(s.getInputStream());
	
	while(true)
	{
		String str = dis.readUTF();
		System.out.print(str);
		
		byte b[] = str.getBytes();
		f1.write(b[0]);
		
	}
	}
	catch(Exception e)
	{
	}


}
}
