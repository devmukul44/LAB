import java.net.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class res
{
	public static void main(String args[]) throws Exception
	{
		//Socket s=new Socket("localhost",80);
		URI u=new URI("https://academics.vit.ac.in/");
		URI u1=new URI("/images/vit_logo6.jpg");
		URI uu=u.resolve(u1);
		URL ux=uu.toURL();
		System.out.println(uu);
		BufferedImage image = null;
		image = ImageIO.read(ux);
ImageIO.write(image, "jpg",new File("xyz.jpg"));
System.out.println("Done");
//System.out.println(s.getPort());
		
	}
}