        import java.util.*;
        import java.lang.*;
        import java.io.*;
     
        /* Name of the class has to be "Main" only if the class is public. */
        class Ideone
        {
        	public static void main (String[] args) throws java.lang.Exception
        	{
        	int number;
        	Scanner s=new Scanner(System.in);
        	number=s.nextInt();
        	if(number>0)
        	{System.out.println("positive");}
        	else if(number<0)
        	{System.out.println("negative");}
        	else
        	{System.out.println("zero");}
        	}
        }