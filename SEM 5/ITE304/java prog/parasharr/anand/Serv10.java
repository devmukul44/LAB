import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Serv10
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(4567);
Socket sk=ss.accept();
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
String r=bf.readLine();
String dns[][]={{"10.10.131.132","www.vit.ac.in"},{"10.10.10.10","www.facebok.com"},{"11.11.11.11","www.google.com"},{"12.12.12.12","www.orkut.com"}};
for(int i=0;i<dns.length;i++)
{
if(r.equals(dns[i][0]))
{op.writeBytes(dns[i][1]+"\n");
break;
}
if(i==dns.length-1)
op.writeBytes("Invalid IP address");
}
sk.close();
}
}


