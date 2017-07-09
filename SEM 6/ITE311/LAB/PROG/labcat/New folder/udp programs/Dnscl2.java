import java.net.*;
import java.io.*;
import java.net.*;
import java.util.*;
class Dnscl2
{
public static void main(String []args)throws Exception
{
DatagramSocket sk=new DatagramSocket();
System.out.println("Enter the Web url to get the ip address");
Scanner sc=new Scanner(System.in);
String uu=sc.next();

byte se[]=new byte[1024];
byte re[]=new byte[1024];
se=uu.getBytes();
InetAddress ipa=InetAddress.getByName("localhost");
DatagramPacket sen=new DatagramPacket(se,se.length,ipa,6789);
sk.send(sen);



DatagramPacket rec=new DatagramPacket(re,re.length);
sk.receive(rec);
String op=new String(rec.getData());
System.out.println(op);
}
}
