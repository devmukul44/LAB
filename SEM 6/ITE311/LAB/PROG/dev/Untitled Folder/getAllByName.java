import java.io.*;
import java.net.*;

public class url
{
public static void main (String[] args) throws MalformedURLException
{
URL url=new URL("http://jey@www.vit.ac.in/results.html");
System.out.println("protocol:"+url.getProtocol());
System.out.println("port:"+url.getPort());
System.out.println("default port:"+url.getDefaultPort());
System.out.println("userinfo:"+url.getUserInfo());
System.out.println("host:"+url.getHost());
System.out.println("file:"+url.getFile());
System.out.println("path:"+url.getPath());


}
}
