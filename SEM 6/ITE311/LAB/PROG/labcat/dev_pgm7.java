import java.io.*;
import java.net.*;
import java.util.*;

class dev_pgm7
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("enter ip address");
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();
		InetAddress address = InetAddress.getByName(ip);
		if(isIPv4CompatibleAddress(address))
		{
			System.out.println("IPV4 address");
		}
		else
		{
			System.out.println("IPV6 address");
		}

	}
}