import java.io.*;
import java.net.*;

public class FTServer{
	public static void main(String[] args) throws Exception{
		String str;
		ServerSocket ss = new ServerSocket(8081);
		Socket s = ss.accept();
		File f=new File("/home/mock3/Desktop/Server/hello.txt");
		if(!f.exists()){
			f.createNewFile();
		}
		
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			str=br.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write(str);
			bw.close();
			System.out.print("Received "+f.getName());
	}
}
