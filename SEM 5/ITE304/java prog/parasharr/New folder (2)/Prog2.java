import java.io.*;
import java.util.*;
import java.net.*;
public class Prog2
{
public static void main(String args[])throws Exception
{
try
{
Runtime r=Runtime.getRuntime();
Process p=r.exec(args[0]+" "+args[1]);
DataInputStream br=new DataInputStream(p.getInputStream());
String s;

while((s=br.readLine())!=null)
{
System.out.println(s);
}
}
catch(Exception e)
{
System.out.println("Something went wrong ");
}
}
}
