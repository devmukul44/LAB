import java.net.*;
import java.util.*;
import java.io.*;
public class user_client_7
{
	public static void main(String []args) throws Exception
	{
		String ud;
		String ua;
		String dp;
		String da;
		while(true)
		{
	Socket cli= new Socket("localhost", 3256);
		BufferedReader bio = new BufferedReader(new InputStreamReader(cli.getInputStream()));
		BufferedReader bo = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream os= new DataOutputStream(cli.getOutputStream());
		
		System.out.println("Enter Username");
		ud = bo.readLine();
		os.writeBytes(ud+ '\n');
		ua=bio.readLine();
		if(ua.equals("true"))
		{
			
			System.out.println("Enter Password" );
           dp=bo.readLine();
           		os.writeBytes(dp+ '\n');
				da=bio.readLine();
				if(da.equals("true"))
				{
					System.out.println("Correct Password \n");
					//break;
				}
				else
				{
					System.out.println("invalid Password");
					// goto bhg;
					
				}
				
		}
		else
		{
			System.out.println("Invalid Username");
			//goto dog;
			
		}
		
		cli.close();
		}
	}
}