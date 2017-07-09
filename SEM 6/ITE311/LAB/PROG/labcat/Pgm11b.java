import java.net.*;
public class Pgm11b
 {
    public static void main(String[] args) throws Exception{
        // URL U= new URL("www.vit.ac.in");
        try {
	String url = "http://www.vit.ac.in";
	String encodedUrl = URLEncoder.encode(url);
	System.out.println("Encoded URL " + encodedUrl);
	String decodedUrl = URLDecoder.decode(encodedUrl);
	System.out.println("Dncoded URL " + decodedUrl);
	} catch (Exception e) {
		System.err.println(e);

	}
    }
}
