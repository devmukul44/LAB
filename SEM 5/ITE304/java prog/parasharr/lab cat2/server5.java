import java.io.*;
import java.net.*;
class server5
{
public static void main(String[]args) throws Exception
{
ServerSocket ss=new ServerSocket(8790);
while(true)
{
Socket sc=ss.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
//URL u=new URL(br.readLine());
File f=new File("output.txt");
FileWriter fw=new FileWriter(f);
//InputStream is=u.openStream();
//Reader r=new InputStreamReader(is);
String c;
while((c=br.readLine())!=null)
{
fw.write(c);
}
/*int c;
while((c=r.read())!=-1)
{
fw.write((char)c);
}*/
}
}
}