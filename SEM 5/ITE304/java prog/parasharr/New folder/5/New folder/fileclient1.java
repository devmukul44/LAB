import java.io.*;
import java.net.*;
class fileclient1
{
public static void main(String []args) throws Exception
{
Socket sc=new Socket("localhost",8790);
File f=new File("input.txt");
BufferedReader br=new BufferedReader(new FileReader(f));
DataOutputStream ds=new DataOutputStream(sc.getOutputStream());
String s="";
String a="";
while((a=br.readLine())!=null)
{
s=s+a;
}
ds.writeBytes(s);
ds.close();
}
}