import java.io.*;
import java.net.*;
class fileclient
{
public static void main(String []args) throws Exception
{
Socket sc=new Socket("localhost",8790);
File f=new File("input.txt");
BufferedReader br=new BufferedReader(new FileReader(f));
PrintStream pw=new PrintStream(sc.getOutputStream());
String s="";
while((s=br.readLine())!=null)
{
pw.println(s);
}
pw.close();
}
}