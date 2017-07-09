import java.io.*;
import java.net.*;
import java.util.*;
public class Prog4
{
public static void main(String[] args)
{
try
{InetAddress one=InetAddress.getByName("www.google.com");
System.out.println("Google's Ip add-"+one);
InetAddress[] two=InetAddress.getAllByName("www.google.com");
System.out.println("All ip address of google are:");
for(int i=0;i<two.length;i++)
{
System.out.println(two[i]);
}
}
catch(UnknownHostException e)
{
System.out.println("Unknown Host Exception");
}
}
}