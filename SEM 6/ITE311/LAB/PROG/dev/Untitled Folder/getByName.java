import java.net.*;
public class getByName 
{
public static void main (String[] args) 
{
try 
{
InetAddress address = InetAddress.getByName("www.vit.ac.in");
System.out.println(address);
}
catch (UnknownHostException e) 
{
System.out.println("Could not find www.vit.ac.in ");
}
}
}
