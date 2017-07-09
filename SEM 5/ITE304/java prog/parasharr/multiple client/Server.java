import java.net.*;
import java.io.*;
import java.util.*;
public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;

        boolean listeningSocket = true;
        try {
            serverSocket = new ServerSocket(4567);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4567");
        }

        while(listeningSocket){
            Socket sk= serverSocket.accept();
            MiniServer mini = new MiniServer(sk);
            mini.start();
        }
        serverSocket.close();       
    }

}