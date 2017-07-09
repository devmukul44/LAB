import java.net.*;
import java.io.*;
class Download
{
public static void main(String[] args)throws Exception
{
URL ur=new URL(args[0]);
BufferedReader bf=new BufferedReader(new InputStreamReader(ur.openStream()));
PrintWriter pw;
String f="doopooooo.txt";
String s="";
while((s=bf.readLine())!=null)
{
pw=new PrintWriter(new FileWriter(f,true));
pw.println(s);
pw.close();
}
}
}