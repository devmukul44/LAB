import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class RMIServer extends UnicastRemoteObject implements HelloWorld{
public RMIServer() throws RemoteException{
    super();
}    
public int[][] helloWorld(int a[][],int b[][]){
    System.out.println("Invocation to helloWorld was successful!");
int c[][]=new int [2][2];
for(int x=0;x<2;x++)
{
for(int y=0;y<2;y++)
{
for(int k=0;k<2;k++)
{c[x][y]+=a[x][k]*b[k][y];
}
}
}
return c;
   // return "Hello world from RMI Server "+(x*10);
}
public static void main(String[] args){
    try
    {
        RMIServer obj= new RMIServer();
        Naming.rebind("HelloWorld", obj);
        System.out.println("HelloWorld bound in registry");
            }
    catch(Exception e)
            {
                System.out.println("RMIServer erro: "+ e.getMessage());
                e.printStackTrace();
            }
}
}
