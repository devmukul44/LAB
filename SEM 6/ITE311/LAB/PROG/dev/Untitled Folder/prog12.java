import java.io.*;
import java.net.*;
import java.awt.*;
public class prog12
{
public static void main(String args[]) throws Exception
{
File f=new File("/home/mock1/im1");
Desktop dt=Desktop.getDesktop();
dt.open(f);
}
}
