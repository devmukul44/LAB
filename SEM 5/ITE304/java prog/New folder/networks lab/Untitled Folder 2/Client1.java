import java.io.*;
import java.net.*;
import java.util.*;
class Client1
{
public static void main(String[]  args)throws Exception
{
  Socket s=new Socket("sjt217site59",1234);
 DataOutputStream ts=new DataOutputStream(s.getOutputStream());
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
 String x="";
String y="";
 while(true)
 {
   System.out.print("Client:");
  x=br.readLine();
  
  
  
ts.writeBytes(x+'\n');
y=br1.readLine();
 System.out.print("Server:");
  System.out.print(y);
  System.out.println(); 
 }


}
}

 


