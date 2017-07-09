import java.net.*;
import java.io.*;
import java.util.*;

public class Webcat {
 public static void main(String[] args) {
   for (int i = 0; i < args.length; i++) {
    try {
     URL u = new URL(args[i]);
     InputStream in = u.openStream();
     
	 /*InputStreamReader isr = new InputStreamReader(in);
     BufferedReader br = new BufferedReader(isr);
     */
	 BufferedReader br = new BufferedReader(new InputStreamReader(in));
	 Scanner sc = new Scanner(new InputStreamReader(in));
	 String theLine;
     //while ((theLine = br.readLine()) != null) {
		 while ((theLine = sc.nextLine()) != null) {
      System.out.println(theLine);
     }
    } catch (IOException e) { System.err.println(e);} 
  }
 }
}
