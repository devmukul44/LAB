import java.net.*;
import java.awt.*;
import java.io.*;
class server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket s= new ServerSocket(6789);
		//DataOutputStream out=new DataOutputStream(s.getOutputStream());
		//out.writeBytes("amit\n");
		//BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputS))
		while(true)
		{
			Socket x=s.accept();
			ConnectionHandler handler=new ConnectionHandler(x);
			new Thread(handler).start();
		}
	}
}