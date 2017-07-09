import java.io.*;
import java.net.*;
import java.util.*;
class client2
{
public static void main(String[]args) throws Exception
{
Socket sc=new Socket("localhost",8790);
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
PrintStream ps=new PrintStream(sc.getOutputStream());
Date d=new Date();
String s=d.toString();
ps.print(s);
ps.close();
}
}