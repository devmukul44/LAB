import java.io.*;
import java.net.*;
import java.util.*;
class Pgm4
{
public static void main(String[] args)
{
	try{
		InetAddress in1=InetAddress.getByName("www.vit.ac.in");

System.out.println("Local host is : "+ in1.getHostName());


}
catch(UnknownHostException e)
{
	System.out.println("catched exception");
}
}
}