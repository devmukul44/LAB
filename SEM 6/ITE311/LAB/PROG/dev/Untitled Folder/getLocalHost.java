import java.io.*;
import java.net.*;

public class getLocalHost 
{
public static void main (String[] args) 
{
try 
{
InetAddress address = InetAddress.getLocalHost();

System.out.println(address);

}
catch (UnknownHostException e) 
{
System.out.println(e);
}
}
}
