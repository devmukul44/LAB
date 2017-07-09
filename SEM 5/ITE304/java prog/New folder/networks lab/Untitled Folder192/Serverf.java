import java.io.*;
import java.net.*;
import java.util.*;
class Serverf
{
 public static void main(String args[])
 {
 try
 {
ServerSocket obj=new ServerSocket(1888);
 while(true)
 {
Socket obj1=obj.accept();
DataInputStream din=new DataInputStream(obj1.getInputStream());
DataOutputStream dout=new DataOutputStream(obj1.getOutputStream());
 String str=din.readLine();
 dout.writeBytes(str+'\n');
System.out.println(str);
}
 }
catch(Exception e)
 {
 System.out.println(e);
}
}
}
