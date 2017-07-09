
import java.util.*;
import java.net.*;
import java.io.*;
public class ports{
public static void main(String args[]) throws BindException{

for(int port=1;port<1024;port++){
try{
ServerSocket s=new ServerSocket(port);

}

catch(IOException e){
System.out.println("The ports are:"+port);
}
}

}
}
