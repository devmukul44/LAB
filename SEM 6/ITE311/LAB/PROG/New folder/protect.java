import java.io.*;
import java.net.*;
class protect
{
public static void main(String [] args)
{
Authenticator.setDefault(new CustomAuthentication());
try{
	URL url=new URL("https://www.google.co.in/?gfe_rd=cr&ei=FB0nV4edAtGL8Qe2vpboAw&gws_rd=ssl");
	BufferedReader b=new BufferedReader(new InputStreamReader(url.openStream()));
	String l;
	while((l=b.readLine())!=null)
	{
	System.out.println(l);
	}
}
catch(Exception e)
{
}
}
}
class CustomAuthentication extends Authenticator
{
protected PasswordAuthentication getPasswordAuthentication()
{
String a=getRequestingHost();
String b=getRequestingPrompt();
InetAddress c=getRequestingSite();
int d=getRequestingPort();
String username="user";
String pass="password";
return new PasswordAuthentication(username,pass.toCharArray()); 
}
}