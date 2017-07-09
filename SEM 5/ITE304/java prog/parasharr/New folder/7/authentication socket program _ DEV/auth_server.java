import java.io.*;
import java.net.*;
import java.util.*;

class auth_server {
public static void main(String args[]) throws Exception
{
String clientSentence;
String modifiedSentence;

String auth[][]={
	{"mukul","dev"},
	{"dev","mukul"}
	};
ServerSocket welcomeSocket = new ServerSocket(6789);

while(true) {
Socket connectionSocket = welcomeSocket.accept();

Scanner inFromClient = new Scanner(connectionSocket.getInputStream());

DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

clientSentence = inFromClient.nextLine();
int flag = 0;
for(int i=0;i<2;i++)
	{
	if(clientSentence.equals(auth[i][0]))
	{
		flag ++;
	}
	}
	if(flag == 1)
	{
		modifiedSentence = "true";
	}
	else
	{
		modifiedSentence = "false";
	}
	System.out.println(modifiedSentence);
	
	outToClient.writeBytes(modifiedSentence+ '\n');

}
}
}
