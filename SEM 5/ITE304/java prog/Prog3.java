import java.io.*;
import java.net.*;
import java.util.*;
public class Prog3
{
public static void main(String[] args)
{
try
{
InetAddress add=InetAddress.getLocalHost();
System.out.println("LOcal host is :"+add);
System.out.println(add.getHostName());
System.out.println(add.getHostAddress());

}
catch(UnknownHostException e)
{
System.out.println("Unknown Host");
}

}
}