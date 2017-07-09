import java.io.*;
import java.net.*;
import java.util.*;
public class q5fileserver
{
public static void main(String args[]) throws Exception
{
	ServerSocket soc=new ServerSocket(7000);
	while(true)
	{
		Socket sock=soc.accept();
		byte[] byarray=new byte[1024];
		InputStream is=sock.getInputStream();
		FileOutputStream fos=new FileOutputStream("server.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int bytesRead=is.read(byarray,0,byarray.length);
		bos.write(byarray,0,bytesRead);
		bos.close();
		System.out.println("File Received from client");
	}
}
}
