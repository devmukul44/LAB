import java.net.*;
import java.io.*;
import java.util.*;

public class input {
 public static void main(String[] args)
 {
 try{
	URL u = new URL("https://www.google.com");
	InputStream in = u.openStream( );
	int c;
	while ((c = in.read( )) != -1)
		System.out.write(c); }
	catch (IOException ex) { System.err.println(ex); }
}
}