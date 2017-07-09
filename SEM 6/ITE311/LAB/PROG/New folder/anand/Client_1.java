import java.rmi.*;
import java.rmi.server.*;
public class Client
{
	static Calcu ob=null;
	public static void main(String[] args)
	{try{
		ob=(Calcu)Naming.lookup("//"+"localhost:1099"+"/Calcu");
		System.out.println("Sum= "+ob.add(5,6));
		
	}
	catch(Exception e)
	{
	}
	}
}