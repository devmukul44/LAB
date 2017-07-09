import java.io.*;
import java.net.*;
import java.awt.*;
public class prog12a
{
public static void main(String args[]) throws Exception
{
String im="https://academics.vit.ac.in/student/home.asp";
Desktop.getDesktop().browse(java.net.URI.create(im));
}
}
