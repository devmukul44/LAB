import java.io.*;
import java.net.*;
import java.util.Date;
public class client1
{
public static void main(String[] args)throws IOException
{
Socket s = new Socket("localhost",1432);
BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
String answer= input.readLine();
System.out.println(answer);
System.exit(0);
}
} 
