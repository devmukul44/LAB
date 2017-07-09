import java.io.*;
import java.net.*;
import java.util.*;

class sample7
{
public static void main(String args[])
{
System.out.println("enter valid ipv4 or ipv6 address");
Scanner sc=new Scanner(System.in);
String add=sc.nextLine();
String[] arr=add.split(":");
if(arr.length == 4)
System.out.println("ipv4 address");
else
System.out.println("ipv6 address");
}
}
