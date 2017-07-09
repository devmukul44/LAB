import java.io.*;
import java.net.*;
public class PortList {
	public static void main(String[] args) throws UnknownHostException, IOException {
		for(int i=0;i<1024;i++)
          {
			
			Socket S=new Socket("localhost",i);
			System.out.println(i);
		}
 	}
}

