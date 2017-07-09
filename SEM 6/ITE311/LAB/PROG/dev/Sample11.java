import java.io.*;
import java.util.*;
import java.net.*;
class sample11
{
public static void main(String args[])throws Exception
{
	System.out.println("enter url!");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String en = URLEncoder.encode(s , "UTF-8");
	System.out.println("encoded url : " + en);
	
	String de = URLDecoder.decode(en , "UTF-8");
	System.out.println("decoded url : " + de);
}
}
