import java.io.*;
import java.net.*;
class client5
{
public static void main(String[]args) throws Exception
{
Socket sc=new Socket("localhost",8790);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintStream pw=new PrintStream(sc.getOutputStream());
BufferedReader b=new BufferedReader(new FileReader("input.txt"));
String c;
while((c=b.readLine())!=null)
{
pw.print(c);
}
/*String s=br.readLine();
pw.print(s);*/
pw.close(); 
}
}