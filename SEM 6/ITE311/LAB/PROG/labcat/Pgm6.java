import java.io.*;
import java.net.*;
import java.util.*;
class Pgm6
{
public static void main(String[] args)
{
	try{
		
		InetAddress in6=InetAddress.getByName("www.google.com");
        boolean reach=in6.isReachable(100000000);
        System.out.println("Host Reachable: "+reach);


}
catch(Exception e)
{
	System.out.println("catched exception");
}
}
}