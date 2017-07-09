
import java.net.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class DateServer3
{
	
	public static void main(String []args) throws Exception
	{
		ServerSocket serv = new ServerSocket(3555);
		
		int n;
		
		while(true)
		{
		
		Socket soc = serv.accept();
			DataOutputStream op = new DataOutputStream(soc.getOutputStream());
			BufferedReader bf = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			n=Integer.parseInt(bf.readLine());
			
			
			String tg= dat(n);
			op.writeBytes(tg+ '\n');
soc.close();
		}
		
	}
	public static String dat(int n)
{

DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Calendar c = Calendar.getInstance();
c.setTime(new Date()); 
c.add(Calendar.DATE, n); 
String output = sdf.format(c.getTime());

System.out.println("The required date is "+output);
return output;
}
}