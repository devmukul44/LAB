import java.io.*;
import java.net.*;
class Pgm11a
{
public static void main(String []ar) throws Exception
{
/*
String b=URLEncoder.encode("*()&^https://www.vit.ac.in","UTF-8");
System.out.println(b);
String c=URLDecoder.decode(b,"UTF-8");
System.out.println(c);
*/
  try {
	String url = "http://www.vit.ac.in";
	String encodedUrl = URLEncoder.encode(url,"UTF-8");
	System.out.println("Encoded URL " + encodedUrl);
	String decodedUrl = URLDecoder.decode(encodedUrl,"UTF-8");
	System.out.println("Dncoded URL " + decodedUrl);
	} catch (Exception e) {
		System.err.println(e);

	}
}
}
