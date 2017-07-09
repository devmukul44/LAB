import java.io.*;
import java.net.*;

public class Pgm10
 {
    public static void main(String[] args) throws Exception{

    URL url;
    InputStream is = null;
    BufferedReader br;
    String line;

    try {
        url = new URL("http://www.vit.ac.in");
        is = url.openStream();  // throws an IOException
        br = new BufferedReader(new InputStreamReader(is));

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (Exception e) {
         e.printStackTrace();
    }
    is.close();
}
    }
