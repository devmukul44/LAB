import java.io.*;
import java.net.*;
import java.util.*;
class Prog6
{
public static void main(String[] args)
{
try
{
InetAddress mi=InetAddress.getByName(args[0]);
System.out.println("Host name is :"+mi.getHostName());
String[] s=(mi.toString()).split("/");
System.out.println("Ip address :"+ s[1]);
}
catch(Exception e)
{System.out.println("Exception in try block!!");
}
}
}