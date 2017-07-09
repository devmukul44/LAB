import java.rmi.*;
import java.rmi.registry.*;
class fileclient
{
public static void main(String [] args)throws Exception
{
Registry reg=LocateRegistry.getRegistry("localhost",6000);
String list[]=reg.list();
for(int i=0;i<list.length;i++)
{
System.out.println(list[i]);
} 
}
}
