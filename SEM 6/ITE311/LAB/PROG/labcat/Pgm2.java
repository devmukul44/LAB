import java.io.*;
import java.net.*;
import java.util.*;
class Pgm2
{
public static void main(String[] args)
{
	try{
		
InetAddress[] in1=InetAddress.getAllByName("www.google.com.");
for(int i=0;i<in1.length;i++)
{
System.out.println("Addr of microsoft is : "+ in1[i].getHostAddress());
}

}
catch(UnknownHostException e)
{
	System.out.println("catched exception");
}
}
}