import java.net.*;
import java.io.*;
import java.lang.String;
class Dnserver
{
public static void main(String []args)throws Exception
{
DatagramSocket sk=new DatagramSocket(6789);
while(true)
{
byte se[]=new byte[1024];
byte re[]=new byte[1024];
DatagramPacket rec=new DatagramPacket(re,re.length);
sk.receive(rec);
InetAddress ipa=rec.getAddress();
int port=rec.getPort();
String k=new String(rec.getData());
InetAddress ip_send=InetAddress.getByName(k.trim());
k=ip_send.getHostAddress().toString();
System.out.println(k);
se=k.toString().getBytes();
DatagramPacket sen=new DatagramPacket(se,se.length,ipa,port);
sk.send(sen);
}
}
}