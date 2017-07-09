import java.io.*;
import java.util.*;
import java.net.*;
public class server1
{
public static void main(String[] args)throws IOException
{
ServerSocket listener = new ServerSocket(1432);
try{
while(true){
Socket socket= listener.accept();
try
{
PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
out.println(new Date().toString());
}
finally{
socket.close();
}
}
}
finally{
listener.close();
}
}
}
