import java.io.*;
import java.util.*;
import java.net.*;

public class examserver
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss = new ServerSocket(6790);
			
			while(true)
			{Socket sc = ss.accept();
			PrintWriter pw = new PrintWriter(sc.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			int n=Integer.parseInt(br.readLine().toString());
			n=n+1;
			String s=""+n;
			pw.println(s);
			pw.close();
			br.close();
			sc.close();
			System.out.println("hello");
			}
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}