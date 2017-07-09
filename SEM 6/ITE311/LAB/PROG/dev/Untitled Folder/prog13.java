import java.net.Authenticator;
import ProxyAuthenticator;
public class prog13
{
public static void main(String args[])
{
String username=System.getProperty("proxy.authentication.username");
String password=System.getProperty("proxy.authentication.password");
if(username!=null && !username.equals(""))
Authenticator.setDefault(new ProxyAuthenticator(username,password));
}
}

