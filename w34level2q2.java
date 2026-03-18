import java.util.*;
public class w34level3q1
{
 public static void main(String args[])
 {
    Scanner ob=new Scanner(System.in);
    int n,sum=0,t;
    System.out.println("Enter number");
    n=ob.nextInt();
	t=n;
		while(n>0)
		{
			int d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
 }
 if(t==sum)
 {
	 System.out.println("is an armstrong number");
}
else
{
	System.out.println("is an armstrong number");
}
 }
}
 