import java.util.*;
import java.net.*;
import java.io.*;
public class r1
{
	public static void main(String []args) throws Exception
	{
		ServerSocket serv = new ServerSocket(3555);
		//String []bn;
		int as;
		String sd;
		while(true)
		{
		int flag=0;
		Socket bhu = serv.accept();
			DataOutputStream oname = new DataOutputStream(bhu.getOutputStream());
			BufferedReader uhu = new BufferedReader(new InputStreamReader(bhu.getInputStream()));
			as=Integer.parseInt(uhu.readLine());
			if(as<=127)
			{
			sd="Class A";
			oname.writeBytes(sd+ '\n');
			
			}
			else if(as>127 && as<=191)
			{
			sd="Class B";
			oname.writeBytes(sd+ '\n');
			
			}
			else if(as>191 && as<=223)
			{
			sd="Class C";
			oname.writeBytes(sd+ '\n');
			
			}
			else if(as>223 && as<=239)
			{
			sd="Class D";
			oname.writeBytes(sd+ '\n');
			
			}
			else if(as>239 && as<=255)
			{
			sd="Class E";
			oname.writeBytes(sd+ '\n');
			
			}
			else 
			{
			sd="Enter Correct IP";
			oname.writeBytes(sd+ '\n');
			
			}
bhu.close();
		}
		
	}
}