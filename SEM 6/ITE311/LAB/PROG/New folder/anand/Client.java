import java.rmi.*;

class Client
{
	public static void main(String[] args) throws Exception
	{
		Adder stub = (Adder)Naming.lookup("rmi://localhost:5000/remote");
		System.out.println(stub.add(10,15));
	}
}