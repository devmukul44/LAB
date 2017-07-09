import java.io.*;
import java.net.*;
import java.util.*;
public class Prog5
{
public static void main(String[] args)throws SocketException
{
Enumeration e=NetworkInterface.getNetworkInterfaces();
while(e.hasMoreElements())
{System.out.println(e.nextElement());
}

}
}