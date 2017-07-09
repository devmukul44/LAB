import java.io.*;
import java.net.*;
import java.util.*;
public class Client8{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			Socket s = new Socket("localhost",6789);
			System.out.println("enter the logical address");
			String ip = sc.nextLine();
			PrintStream pr = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pr.println(ip);
			System.out.println(br.readLine());
			pr.close();
			br.close();
			s.close();
		}
		catch(Exception e)
		{}
	}
}
