import java.io.*;
 
import java.net.*;
 
 
 
public class ProxyExample
 
{
 
      Socket client=null;
 
      SocketAddress address=null;
 
      InetSocketAddress inet=null;
 
      Proxy proxy=null;
 
      String proxyHost=null;
 
      int proxyPort=0;
 
      String host=null;
 
      int port=0;
 
 
 
      public ProxyExample(String argz[])
 
      {
 
            try
 
            {
 
                  // read args
 
                  proxyHost=argz[0];
 
                  proxyPort=Integer.parseInt(argz[1]);
 
                  host=argz[2];
 
                  port=Integer.parseInt(argz[3]);
 
 
 
                  // setup proxy
 
                  address = new InetSocketAddress(proxyHost, proxyPort);
 
                  proxy = new Proxy(Proxy.Type.SOCKS, address);
 
 
 
                  // setup socket
 
                  client = new Socket(proxy);
 
                  inet = new InetSocketAddress(host, port);
 
 
 
                  // connect
 
                  client.connect(inet);
 
 
 
                  // setup I/O streams
 
                  din=new DataInputStream(client.getInputStream());
 
                  write=new PrintWriter(client.getOutputStream(), true);
 
                  rdr=new BufferedReader(new InputStreamReader(din));
 
                  write.println("some string.");
 
            }
 
               catch(Exception e)
 
               {
 
                  e.printStackTrace();
 
               }
 
 
 
      }
 
 
 
      public static void main(String argz[])
 
      {
 
            if(argz.length <3) {
 
                  System.err.println("Usage: java ProxyExample <socksHost> <port> <host> <port>");
 
            }
 
         new ProxyExample(argz);
 
      }
 
 
 
      DataInputStream din=null;
 
      PrintWriter write=null;
 
      BufferedReader rdr=null;
 
}