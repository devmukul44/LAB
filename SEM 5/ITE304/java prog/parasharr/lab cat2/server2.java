import java.io.*;
import java.net.*;
import java.util.*;
class server2
{
public static void main(String [] args) throws Exception{
ServerSocket ss=new ServerSocket(8790);
while(true)
{
Socket sc=ss.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
String s=br.readLine();
System.out.println(s);
}
}
}