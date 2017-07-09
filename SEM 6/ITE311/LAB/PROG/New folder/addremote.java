import java.rmi.*;
import java.rmi.server.*;
class addremote extends UnicastRemoteObject implements add
{
addremote()throws Exception
{
super();
}
public int add(int a,int b)throws RemoteException
{
return a+b;
}
}