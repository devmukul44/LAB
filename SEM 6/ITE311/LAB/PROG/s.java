import java.io.*;
import java.net.*;
importjava.util.*;
public class s extends ProxySelector
{
public static void main(String args[]){

SocketAddressproxyAddress=new InetSocketAddress("academics.vit.ac.in",8000);
Proxy proxy=new  Proxy(Proxy.Type.SOCKS,proxyAddress);
System.out.println(proxy);
}

    @Override
public List<Proxy> select(URI uri) {
throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
public void connectFailed(URI uri, SocketAddresssa, IOExceptionioe) {
throw new UnsupportedOperationException("Not supported yet.");
    }

}

