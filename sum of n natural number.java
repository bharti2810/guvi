import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n;
		double sum=0;
		
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(i=0;i<=n;i++)
	sum=sum+i;
	System.out.println(sum);
		// your code goes here
	}
}