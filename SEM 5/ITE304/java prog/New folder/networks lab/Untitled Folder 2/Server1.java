import java.io.*;
import java.net.*;
import java.util.*;
class Server1
{
public static void main(String[]  args)throws Exception
{
   String a="";
   String b="";
   ServerSocket s1=new ServerSocket(1234);
   BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

  Socket  s2=s1.accept();
while(true)
{



 
 BufferedReader br=new BufferedReader(new InputStreamReader(s2.getInputStream()));
DataOutputStream tc=new DataOutputStream(s2.getOutputStream());

  a=br.readLine();
  System.out.print("Client:"+a);
   
  System.out.println();

   System.out.print("Server:");
   b=br1.readLine();
   tc.writeBytes(b+'\n');
}

}
}

