import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class Ideone
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	char ch=input.charAt(0);
    	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    	System.out.println(ch+" is a vowel\n");
    	else
    	System.out.println(ch+" ia a constant\n")
    	
    }
    }