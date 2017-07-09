import java.io.*;
import java.net.*;
import java.security.*;

public class getHostAddress 
{
public static void main (String[] args) 
{
try 
{
//InetAddress address = InetAddress.getLocalHost();
URL add1 = new URL("https://www.google.com");
URLStreamHandler address = URLStreamHandler.getHostAddress(add1);
System.out.println(address);

}
catch (UnknownHostException e) 
{
System.out.println(e);
}
}
}
