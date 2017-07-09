import java.io.*;
import java.util.*;
import java.net.*;
public class dns_client_10
{
	public static void main(String []args) throws Exception
	{
		while(true)
		{
			Socket st = new Socket("localhost", 3555);
			BufferedReader bn = new BufferedReader(new InputStreamReader(st.getInputStream()));
			DataOutputStream oo = new DataOutputStream(st.getOutputStream());
			BufferedReader hn = new BufferedReader(new InputStreamReader(System.in));
			String hr;
			String rr;
			System.out.println("Enter IP Address ");
			
			hr=hn.readLine();
			oo.writeBytes(hr + '\n');
			rr = bn.readLine();
			System.out.println("Server name is ");
			System.out.println(rr);
			st.close();
		}
	}
}