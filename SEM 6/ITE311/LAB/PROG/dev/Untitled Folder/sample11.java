import java.io.*;
import java.util.*;
import java.net.*;
class sample11
  {
  public static void main(String args[]) throws Exception
   { System.out.println("enter the url");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String q=URLEncoder.encode(s,"utf-8");
     System.out.println(q);
   }
}
