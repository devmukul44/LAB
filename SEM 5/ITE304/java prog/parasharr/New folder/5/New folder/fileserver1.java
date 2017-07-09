import java.io.*;
import java.net.*;
class fileserver1
{
public static void main(String[]args) throws Exception 
{
ServerSocket ss=new ServerSocket(8790);
while(true)
{
Socket sc=ss.accept();
File f=new File("fileoutput1.txt");
FileWriter fw=new FileWriter(f);
BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
BufferedWriter bw=new BufferedWriter(fw);
bw.write(br.readLine());
bw.close();
}
}
}