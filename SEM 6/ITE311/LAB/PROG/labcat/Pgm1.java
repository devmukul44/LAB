import java.io.*;
import java.net.*;
import java.util.*;
class Pgm1
{
public static void main(String[] args)
{
	try{
		
InetAddress in1=InetAddress.getByName("www.vit.ac.in");
System.out.println("Addr of vit.ac.in is : "+ in1);
}
catch(UnknownHostException e)
{
	System.out.println("catched exception");
}
}
}