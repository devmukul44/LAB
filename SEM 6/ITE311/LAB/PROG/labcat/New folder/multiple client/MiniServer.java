import java.net.*;
import java.io.*;
import java.util.*;
public class MiniServer extends Thread{

    private Socket sk = null;

    public MiniServer(Socket socket) {

        super("MiniServer");
        this.sk = socket;

    }

    public void run()
	{
		try{
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
String filename=bf.readLine();
BufferedReader fr=new BufferedReader(new FileReader(filename));
String s="";
while(true)
{
bf.readLine();
s=fr.readLine();
if(s==null)
	break;
op.writeBytes(s+"\n");
}
op.writeBytes("Anand orders Terminate\n");
System.out.println(filename+" File has been successfully Sent");
    }
	catch(Exception e)
	{
	}
            //implement your methods here
	}
}