import java.io.*;
import java.net.*;
//import ProxyAuthenticator;
class Sample13
{
public static void main(String args[]) throws Exception
{
String username=System.getProperty("proxy.authentication.username");
String password=System.getProperty("proxy.authentication.password");
if(username!=null && username!="")
Authenticator.setDefault("username","password");
}
}
