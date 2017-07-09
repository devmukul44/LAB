import java.io.*;
import java.net.*;
import java.util.*;
class Pgm7
{
public static void main(String[] args)
{
	try{
	 Scanner sc=new Scanner(System.in);
        System.out.println("Enter ip address: ");
        String ip=sc.next();
        InetAddress in7=InetAddress.getByName(ip);
        if(in7 instanceof Inet4Address)
        {
            System.out.println("Version 4");
        }
        else if(in7 instanceof Inet6Address)
        {
            System.out.println("Version 6");
        }
        else
        System.out.println("Could not recognise ip adrr");
		

}
catch(UnknownHostException e)
{
	System.out.println("catched exception");
}
}
}