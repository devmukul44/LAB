import java.util.*;
import java.net.*;
import java.io.*;
public class facs
{
	
	public static void main(String []args) throws Exception
	{
		ServerSocket serv = new ServerSocket(3555);
		
		int as;
		
		while(true)
		{
		
		Socket bhu = serv.accept();
			DataOutputStream oname = new DataOutputStream(bhu.getOutputStream());
			BufferedReader uhu = new BufferedReader(new InputStreamReader(bhu.getInputStream()));
			as=Integer.parseInt(uhu.readLine());
			int num=1;
			for(int i=1;i<=as;i++)
			{
				num=num*i;
			}
			
			String tg= Integer.toString(num);
			oname.writeBytes(tg+ '\n');
bhu.close();
		}
		
	}
}