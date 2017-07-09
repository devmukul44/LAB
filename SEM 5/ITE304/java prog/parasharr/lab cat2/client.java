import java.io.*;
import java.net.*;
class client
{
public static void main(String[]args) throws Exception
{
Socket sc=new Socket("localhost",8790);
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
PrintStream pw=new PrintStream(sc.getOutputStream());
System.out.println("Enter product name");
String s=b.readLine();
System.out.println("Enter price");
String s1=b.readLine();
System.out.println("Enter Quantity");
String s2=b.readLine();
pw.println(s1);
pw.println(s2);
System.out.println(s);
System.out.println(br.readLine());
pw.close();
}
}