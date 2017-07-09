import java.net.*;
import java.io.*;
import java.util.*;
class SortClient
{
public static void main(String[] args)throws Exception
{
Socket sk=new Socket("localhost",4567);
Scanner sc=new Scanner(System.in);
BufferedReader bf=new BufferedReader(new InputStreamReader(sk.getInputStream()));
DataOutputStream op=new DataOutputStream(sk.getOutputStream());
System.out.println("Enter the size of array?");
int np=sc.nextInt();
op.writeBytes(np+"\n");
System.out.println("Enter the array Elements..?");
for(int i=0;i<np;i++)
{
op.writeBytes(sc.nextInt()+"\n");
}
System.out.println("Sorted array Elements are :");
for(int i=0;i<np;i++)
{System.out.println(bf.readLine());

}



}

}