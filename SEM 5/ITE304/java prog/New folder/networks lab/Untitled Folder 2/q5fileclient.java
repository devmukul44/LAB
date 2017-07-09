import java.util.*;
import java.io.*;
import java.net.*;
public class q5fileclient
{
	public static void main(String args[])throws Exception
	{
		Socket soc=new Socket("localhost",7000);
		while(true)
		{
		DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter filename to send to server");
		String name=read.readLine();
		File myfile=new File(name);
		byte[] arr=new byte[(int)myfile.length()];
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(myfile));
		System.out.println("Sending file "+name+" to server");
		dos.write(arr,0,arr.length);
		}
	}
}

