import java.io.*;
import java.net.*;
import java.util.*;
class Clientf

{
public static void main(String args[])
{
 try
 {
 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 Socket clsct=new Socket("127.0.0.1",1888);
 DataInputStream din=new DataInputStream(clsct.getInputStream());
 DataOutputStream dout=new DataOutputStream(clsct.getOutputStream());
 System.out.println("Enter String");
 String str=in.readLine();
 dout.writeBytes(str+'\n');
 String str1=din.readLine();
 System.out.println("The String is: "+str1);
 clsct.close();
 }
 catch (Exception e)
 {
 System.out.println(e);
 }
 }
}
