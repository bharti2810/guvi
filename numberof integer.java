mport java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main(String []args){
      int i,count=0;
     
      Scanner s= new Scanner(System.in);
      String number= s.nextLine();
      String number=Integer.toString(number);
      for(i=0;i<number.length();i++)
      {
         count++;
       }
     
      System.out.println(count);
}
    }