import java.io.*;
import java.util.*;
import java.net.*;

public class examclient
{
	public static void main(String args[])
	{
		try
		{
			Socket sc = new Socket(InetAddress.getLocalHost(),6790);
			PrintWriter pw = new PrintWriter(sc.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter a number!");
			pw.println(key.readLine().toString());
			System.out.println("your factorial is:"+br.readLine());
			pw.close();
			br.close();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}