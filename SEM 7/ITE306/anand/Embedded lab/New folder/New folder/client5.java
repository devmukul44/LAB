import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class client5 {

  public final static int SOCKET_PORT = 13267;      
  public final static String SERVER = "localhost";  
  public final static String FILE_TO_RECEIVED = "/home/mock3/Documents/destn.txt";  

  public final static int FILE_SIZE = 6022386; 

  public static void main (String [] args ) throws IOException {
    int bytesRead;
    int current = 0;
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    Socket sock = null;
    try {
      sock = new Socket(SERVER, SOCKET_PORT);
      System.out.println("Connecting...");

      byte [] mybytearray  = new byte [FILE_SIZE];
      InputStream is = sock.getInputStream();
      fos = new FileOutputStream(FILE_TO_RECEIVED);
      bos = new BufferedOutputStream(fos);
      System.out.println(is);
      bytesRead = is.read(mybytearray,0,mybytearray.length);
      current = bytesRead;

      do {
         bytesRead = is.read(mybytearray, current, (mybytearray.length-current));
         
     if(bytesRead >= 0) current += bytesRead;
      } while(bytesRead > -1);

      bos.write(mybytearray, 0 , current);
      bos.flush();
      System.out.println("File " + FILE_TO_RECEIVED + " downloaded (" + current + " bytes read)");
    BufferedReader br = new BufferedReader(new FileReader(FILE_TO_RECEIVED));
    for (String line; (line = br.readLine()) != null;) {
        System.out.print(line + "\n");
        }
}
    finally {
      if (fos != null) fos.close();
      if (bos != null) bos.close();
      if (sock != null) sock.close();
    }
  }

}
