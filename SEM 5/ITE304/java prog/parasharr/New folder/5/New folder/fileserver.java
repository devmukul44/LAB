import java.io.*;
import java.net.*;
class fileserver
{
public static void main(String[]args) throws Exception 
{
ServerSocket ss=new ServerSocket(8790);
while(true)
{
Socket sc=ss.accept();
File f=new File("fileoutput.txt");
FileWriter fw=new FileWriter(f);
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
String s="";
while((s=br.readLine())!=null)
{
fw.write(s);
}
}
}
}
