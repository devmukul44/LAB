import java.io.*;
import java.net.*;
import java.util.*;

class sample8
{
public static void main(String args[])throws IOException
{
	Enumeration obj = NetworkInterface.getNetworkInterfaces();
	while(obj.hasMoreElements())
	{
		System.out.println(obj.nextElement());
		} 
}
}
