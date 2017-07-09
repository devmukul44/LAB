import java.net.*;
import java.awt.*;
import java.io.*;
class ConnectionHandler implements Runnable
{
	
		Socket t;
		ConnectionHandler(Socket t)
		{
			this.t=t;
		}
		public void run() 
		{
			while(true)
			{	
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(t.getInputStream()));
			String fromClient=br.readLine();
			System.out.println("Connection Established with:"+fromClient);
		}
		catch(Exception e)
		{}
			}	
		}
	
}