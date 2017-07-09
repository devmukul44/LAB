import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class Serv11
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(4567);
Socket sk=ss.accept();
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
int r=Integer.parseInt(bf.readLine());

int f=1;
for(int i=0;i<r;i++)
f*=i+1;
op.writeBytes(f+"\n");
sk.close();
}
}


