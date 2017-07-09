import java.io.*;
import java.net.*;

class server
{
    public static void main(String args[]) throws Exception
    {

        ServerSocket welcomeSocket = new ServerSocket(6789);
        String[][] Login = {{"MATT","UNCP"},{"JOHN","UNCP"},{"CARL","UNCP"}};
        String username;
        String username1;
        String password;
        String password1;
        while(true)
        {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient =
               new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            username = inFromClient.readLine();
            System.out.println("Username received: " + username);
            password = inFromClient.readLine();
            System.out.println("Password received: " + password);
            username1=username.toUpperCase() + '\n';
            password1=password.toUpperCase() + '\n';

            for(int i = 0; i<Login.length; i++){
                if(Login[i][0].equals(username1) && Login[i][1].equals(password1)){
                    outToClient.writeBytes("Hello " + username1);
                    outToClient.writeBytes("Other users registered on the server currently include: ");}
                    
		else
                    outToClient.writeBytes("Invalid Username and/or password.");

			for(int k = 0; k<Login.length; k++){
                        outToClient.writeBytes(Login[k][0]);}
                  }
            }
        }
}
