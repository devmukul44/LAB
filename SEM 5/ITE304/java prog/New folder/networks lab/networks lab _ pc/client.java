import java.io.*;
import java.net.*;
public class client
{
public static void main(String ar[]) throws Exception
{
	Socket s = new Socket("localhost",8787);
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	
	InputStream f1 = new FileInputStream("test.txt");
	int eof = f1.available();
	System.out.println(eof);
	for(int i=0;i<eof;i++)
	{
	dos.writeUTF(((char) f1.read() + ""));
	
	}



}
}
