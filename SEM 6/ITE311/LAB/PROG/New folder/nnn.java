import java.net.*;
import java.awt.*;
import java.io.*;
class client
{
	public static void main(String args[]) throws Exception
	{
		Socket s= new Socket("localhost",6789);
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		out.writeBytes("amit\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		br.readLine();
	}
}