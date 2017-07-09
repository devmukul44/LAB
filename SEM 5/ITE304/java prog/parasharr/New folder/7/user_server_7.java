import java.net.*;
import java.io.*;
import java.util.*;
public class user_server_7
{
public static void main(String args[]) throws Exception
{
	String pas;
	String user;
    String as;
	String sd;
	ServerSocket ser = new ServerSocket(3256);
	while(true)
	{
	Socket sename = ser.accept();
	BufferedReader bn=new BufferedReader(new InputStreamReader(sename.getInputStream()));
    DataOutputStream oname = new DataOutputStream(sename.getOutputStream());
	 user=bn.readLine();
	 int flag=0;
	 //System.out.println("username is  "+user);
	String [][]username={{"shivamparasharr","doll"},{"ankur","gupta"},{"Mukul","Dev"}};
	for(int i=0;i<username.length;i++)
	{
		flag++;
		if(username[i][0].equals(user))
		{
			as="true";
			oname.writeBytes(as+ '\n');
			pas=bn.readLine();
			if(username[i][1].equals(pas))
			{
				sd="true";
				oname.writeBytes(sd+ '\n');
				break;
			}
			else
			{
				sd="false";
				oname.writeBytes(sd+ '\n');
			}
		}
		else
		{
			if(flag==username.length)
			{
			as="false";
			oname.writeBytes(as+ '\n');
		}
		continue;
		}
	}
	sename.close();	
	}

}
}