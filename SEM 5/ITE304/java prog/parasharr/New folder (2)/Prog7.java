import java.net.*;
import java.io.*;
public class Prog7
{
public static void main(String args[])
{
try
{
URL ur= new URL(args[0]);
String s;
File f=new File("Radium.txt");
FileWriter fw=new FileWriter(f);
InputStream in=ur.openStream();
Reader r=new InputStreamReader(in);
int c;
while((c=r.read())!=-1)
{
fw.write((char)c);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}