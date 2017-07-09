import java.io.*;
import java.net.*;

public class FTClient{
	public static void main(String[] args) throws Exception{
		String str="";
		String line;
		Socket s= new Socket("localhost",8081);
		File f=new File("/home/mock3/Desktop/Client/hello.txt");
		if(!f.exists()){
			f.createNewFile();
		}
		
			BufferedReader br =  new BufferedReader(new FileReader(f));
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			System.out.print("Sending File.. ");
			while((line=br.readLine())!=null){
				str+=line;
			}
			pw.println(str);
		
	}
}
