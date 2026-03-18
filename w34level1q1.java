import java.util.*;
public class w34levelq1
{
 public static void main ()
 {
     Scanner in=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter A");
    a=in.nextInt();
    System.out.println("Enter B");
    b=in.nextInt();
    System.out.println("Enter C");
    c=in.nextInt();
      if(a<b && a>c)
      {
          System.out.println ("this is the minimum number"+a);
      }
      else if(b<a && b<c)
      {
         System.out.println("this is the minimum number"+b); 
      }
      else 
      {
          System.out.println("this is the minimum number"+c);
      }
      
    }
    }

