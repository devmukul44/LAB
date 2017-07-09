import java.io.*;
import java.net.*;
import java.util.*;
public class Server8{
	public static void main(String[] args){
		try{
		ServerSocket ss = new ServerSocket(6789);
		while(true){
			    Socket a = ss.accept();
				PrintStream p = new PrintStream(a.getOutputStream());
			    BufferedReader b = new BufferedReader(new InputStreamReader(a.getInputStream()));
			    int i=0,j=0;
			    String array[][] = new String[5][2];
			    for(i=0;i<5;i++){
					array[i][j] = "10.10.141." + i ;
				} 
				j=1;
				for(i=0;i<5;i++){
					array[i][j] = " d4:6d:50:84:db:c" + i;
				}
				String ipp = b.readLine();
				j=0;
				int f=0;
				for(i=0;i<5;i++){
					if(array[i][j].equals(ipp)){
						p.println("Hardware address is:" + array[i][j+1]);
						f=1;
						System.out.println(array[i][j+1]);
						break;
					}
				}
				if(f==0){
				p.println("ip address not found");
				System.out.println("ip address not found");
			}
			}
		}
		catch(Exception e)
		{}
	}
}
