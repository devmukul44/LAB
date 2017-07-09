import java.io.*;
import java.net.*;
import java.awt.*;
class Pgm9
{
public static void main(String args[])
{
try
{
Desktop d=java.awt.Desktop.getDesktop();
URI u=new URI("https://academics.vit.ac.in/student/stud_login.asp");
d.browse(u);
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
