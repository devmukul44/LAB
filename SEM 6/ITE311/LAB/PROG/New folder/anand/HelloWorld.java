import java.rmi.Remote;
import java.rmi.RemoteException;
public interface HelloWorld extends Remote{
int[][] helloWorld(int x[][],int y[][])throws RemoteException;
}