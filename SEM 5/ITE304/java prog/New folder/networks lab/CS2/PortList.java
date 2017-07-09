import java.net.*;
import java.io.*;
public class PortList
{
public static void main(String[] args)throws Exception
{
String host="localhost";
if(args.length>0)
{
host=args[0];
}
for(int i=1;i<1024;i++)
{
try
{
Socket s=new Socket(host,i);
System.out.println("There is a server on port"+i+"of"+host);
}
catch(UnknownHostException e){
System.err.println(e);
break;
}
catch(Exception e){
}
}
}
}
