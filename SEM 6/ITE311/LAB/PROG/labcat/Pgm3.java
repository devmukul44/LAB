import java.io.*;
import java.net.*;
import java.util.*;
class Pgm3
{
public static void main(String[] args)
{
	try{
		InetAddress in = InetAddress.getLocalHost();

System.out.println("Local host is : "+ in.getHostAddress());


}
catch(UnknownHostException e)
{
	System.out.println("catched exception");
}
}
}