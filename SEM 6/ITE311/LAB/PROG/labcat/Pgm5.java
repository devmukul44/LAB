import java.net.*;
import java.io.*;
import java.util.*;
class Pgm5{
public static void main(String args[])throws Exception
{
try{
Scanner sc=new Scanner(System.in);
String s =sc.next();
String s1[]=s.split("\\.");
if(s1[0].equals("127"))
{
System.out.println("entered address is loopback");
}
else
System.out.println("not a loopback address");
}
catch (Exception e)
{
System.out.println(e);
}
}
}
