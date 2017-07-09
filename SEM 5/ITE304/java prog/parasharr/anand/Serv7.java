import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Serv7
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(4567);
Socket sk=ss.accept();

BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
String dns[][]={{"anand","anand"},{"rhythm","rhythm"},{"ankur","ankur"},{"mehi","mehi"}};
while(true)
{

String r=bf.readLine();

for(int i=0;i<dns.length;i++)
{
if(r.equals(dns[i][0]))
{
op.writeBytes("true"+"\n");
if(bf.readLine().equals(dns[i][1]))
{
op.writeBytes("true"+"\n");
break;}
else 
op.writeBytes("false"+"\n");

}
if(i==dns.length-1)
op.writeBytes("false"+"\n");
}
}

}
}


