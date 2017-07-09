import java.io.*;
import java.net.*;
import java.util.*;

class auth_client {
public static void main(String args[]) throws Exception
{
String sentence;
String serverSentence;

Socket clientSocket = new Socket("localhost", 6789);
Scanner inFromUser =new Scanner(System.in);
DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
Scanner inFromServer = new Scanner(clientSocket.getInputStream());

System.out.println("enter username:\n");
sentence = inFromUser.next();
outToServer.writeBytes(sentence + '\n');

serverSentence = inFromServer.nextLine();

System.out.println("FROM SERVER: " + serverSentence);

if(serverSentence.equals("true"))
{
System.out.println("valid username");
}
else
{
	System.out.println("invalid username");
	}
clientSocket.close();
}
}
