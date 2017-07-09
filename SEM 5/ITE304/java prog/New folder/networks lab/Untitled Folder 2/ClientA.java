import java.util.*;
import java.io.*;
import java.net.*;

class ClientA
{
	public static void main(String[] args) throws Exception
	{
		String uname;
		String pword;
		Socket c = new Socket("sjt217site59" , 3000);
		DataOutputStream outtoserver = new DataOutputStream(c.getOutputStream());
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username: ");
		uname = s.next();
		System.out.println("Enter password: ");
		pword = s.next();
		System.out.println();
		outtoserver.writeBytes(uname + " " + pword + "\n");
		BufferedReader infromserver = new BufferedReader(new InputStreamReader(c.getInputStream()));
		System.out.println(infromserver.readLine());
	}
}
