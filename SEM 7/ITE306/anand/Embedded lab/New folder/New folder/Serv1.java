import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Serv1
{
public static void main(String args[])
{
int k;
for(int i=0;i<1024;i++)
{
try
{
ServerSocket ss=new ServerSocket(i);
}
catch(Exception e)
{System.out.println(i+" is hosting a server");
k=1;
}

}}}