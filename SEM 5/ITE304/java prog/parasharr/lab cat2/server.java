import java.io.*;
import java.net.*;
class server
{
public static void main(String []args) throws Exception
{
ServerSocket ss=new ServerSocket(8790);
while(true)
{
Socket sc=ss.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
PrintStream pw=new PrintStream(sc.getOutputStream());
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int price=a*b;
String s=price+"";
pw.println(s);
}
}
}