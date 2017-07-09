import java.util.*;
import java.io.*;
import java.net.*;

class dev_fileclient
{
	public static void main(String args[]) throws Exception
	{
		Socket client = new Socket("localhost",6789);
		Scanner sc = new Scanner(System.in);
		Scanner server = new Scanner(client.getInputStream());
		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		 
		 String s = "";
		 String a = "";

		 while(true)
		 {   
		 	server.nextLine();
		 	s=br.readLine();
		 	if(s==null)
		 	{
		 		break;
		 	}
		 	out.writeBytes(s + "\n");
		 	}
		 	
		 }
		

	}
}