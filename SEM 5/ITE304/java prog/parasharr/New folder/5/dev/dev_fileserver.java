import java.util.*;
import java.io.*;
import java.net.*;

class dev_fileserver
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket welcome = new ServerSocket(6789);
		Socket server = welcome.accept();
		Scanner sc = new Scanner(System.in);
		Scanner client = new Scanner(server.getInputStream());
		DataOutputStream out = new DataOutputStream(server.getOutputStream());

		//FileWriter fw = new FileWriter("output.txt");
		//BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw;
		String x = "";
		while(true)
		{  
		 pw=new PrintWriter(new FileWriter("hello.txt",true));
			try{
				out.writeBytes("true\n");
				x=client.nextLine();
			if(x==null)
				break;
				}

			catch(Exception e)
			{break;}
		
		pw.println(x);
		pw.close();
		}
		
	System.out.println("file saved successfully!!");
		
	}
}