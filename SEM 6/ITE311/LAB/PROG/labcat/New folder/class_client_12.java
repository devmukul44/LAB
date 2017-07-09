import java.io.*;
import java.util.*;
import java.net.*;
public class r0
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
			String []bs = hr.split(".");
			int bj;
			String zs = bs[0];
			//bj= Integer.parseInt(bs[0]);
			
			oo.writeBytes(zs + '\n');
			rr = bn.readLine();
			System.out.println("IP address belongs to ");
			System.out.println(rr);
			st.close();
		}
	}
}