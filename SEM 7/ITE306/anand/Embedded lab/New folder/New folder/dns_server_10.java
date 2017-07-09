import java.util.*;
import java.net.*;
import java.io.*;
public class dns_server_10
{
	public static void main(String []args) throws Exception
	{
		ServerSocket serv = new ServerSocket(3555);
		String [][]bn = {{"10.10.131.132","www.vit.ac.in"},{"10.51.131.132","www.india.in"},{"10.10.157.132","www.vutacade.in"}};
		String as;
		String sd;
		while(true)
		{
		int flag=0;
		Socket bhu = serv.accept();
			DataOutputStream oname = new DataOutputStream(bhu.getOutputStream());
			BufferedReader uhu = new BufferedReader(new InputStreamReader(bhu.getInputStream()));
			as=uhu.readLine();
for(int i=0;i<3;i++)
{
	flag++;
	if(bn[i][0].equals(as))
	{
		sd=bn[i][1];
		oname.writeBytes(sd +'\n');
	}
}	
if(flag==3)
{
	sd="Enter Correct IP Address ";
	oname.writeBytes(sd + '\n');
}
bhu.close();
		}
		
	}
}