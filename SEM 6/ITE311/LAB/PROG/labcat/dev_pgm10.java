import java.net.*;
import java.io.*;
import java.util.*;

class dev_pgm10
 {
	 public static void main(String args[]) throws Exception
	 {
		URL u = new URL(args[0]);
		InputStream in = u.openStream();
		Scanner sc = new Scanner(new InputStreamReader(in));
		String line;
		while ((line = sc.nextLine()) != null) 
		{
		System.out.println(line);
		}
	 }
 }