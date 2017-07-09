import java.rmi.Naming;
import java.util.*;
public class RMIClient {
    static String message="blank";
    static HelloWorld obj=null;
    public static void main(String[] args){
        try
        {
            obj=(HelloWorld)Naming.lookup("//"+"localhost:1099"+"/HelloWorld");
	    Scanner sc=new Scanner(System.in);
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
System.out.println("enter a");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
		System.out.println("Enter at "+i+", "+j);
        	a[i][j]=sc.nextInt();
}
}
System.out.println("enter b");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
		System.out.println("Enter at "+i+", "+j);
        	b[i][j]=sc.nextInt();
}
}
            int c[][]=obj.helloWorld(a,b);
           // System.out.println("Message from the RMI-server was: \""+ message +"\"");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println();
}

            }
        catch(Exception e)
            {
                System.out.println("RMIServer erro: "+ e.getMessage());
                e.printStackTrace();
            }
        }
    } 

