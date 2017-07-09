import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class Ideone
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    	int i;
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	
	    for(i=0;i<input.length();i++)
	    {char ch=input.charAt(i);
	    int n=(int)ch;
	    
	    if ((n>64 && n<92) || (n>96 && n<123))
	    System.out.println(ch+"character is alphabet");
	    	
	    }
	    
    }
    }ot