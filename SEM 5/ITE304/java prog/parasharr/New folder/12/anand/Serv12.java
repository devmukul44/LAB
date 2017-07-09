import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Serv12
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(4567);
Socket sk=ss.accept();
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
int r=Integer.parseInt(bf.readLine());
String cls="";
if(r<128)
cls="A";
else if(r<192)
cls="B";
else if(r<224)
cls="C";
else if(r<240)
cls="D";
else if(r<256)
cls="E";
else cls="Invalid";
op.writeBytes(cls+"\n");
sk.close();
}
}


