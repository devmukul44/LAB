import java.io.*;
import java.net.*;
class server7
{
public static void main(String []args) throws Exception
{
ServerSocket ss=new ServerSocket(8790);
while(true)
{
Socket sc=ss.accept();
PrintStream pw=new PrintStream(sc.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
/*//String s[][]={{"ankur","ankur"},{"anand","anand"},{"amit","amit"}};
String s[][]={{"127.68.0.1","1:2:3:4:5:6"},{"127.0.0.1","11:12:13:14:15:16"},{"127.127.127.127","111:122:133:144:155:166"}};
String s1=br.readLine();
/*for(int i=0;i<s.length;i++)
{
if(s[i][0].equals(s1))
{
pw.println("true");
String s2=br.readLine();
if(s[i][1].equals(s2))
pw.println("true");
else
pw.println("false");
}
else pw.println("false");
}
for(int i=0;i<s.length;i++)
{
if(s[i][0].equals(s1))
{
System.out.println(s[i][1]);
}
}*/
/*DNS

InetAddress a[]=InetAddress.getAllByName(br.readLine());
int i=0;
while(i<a.length)
{
System.out.println(a[i]);
i++;
}*/

//Class
int n=Integer.parseInt(br.readLine());
if(n<128)
pw.println("Class A");
else if(n>=128&&n<=191)
pw.println("Class B");
else if(n>=192&&n<=223)
pw.println("Class C");
else if(n>=224&&n<=239)
pw.println("Class D");
else pw.println("Not a vaild class");
}
}
}