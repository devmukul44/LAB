import java.net.*;
import java.io.*;
public class sample9 {
  public static void main (String args[]) 
  {     
      try {
		URL u = new URL("https://academics.vit.ac.in/student/stud_login.asp");
        InputStream in = u.openStream();
		in = new BufferedInputStream(in);       
		Reader r = new InputStreamReader(in);
        int c;
        while ((c = r.read()) != -1) 
        {          
			System.out.print((char) c);        
		} 
      }
      catch (MalformedURLException ex) 
      {
		  System.err.println(args[0] + " is not a parseable URL");   
		}
      catch (IOException ex) 
		{
		  System.err.println(ex);
		  }
System.out.println();       
   System.exit(0);
  } 
  }
