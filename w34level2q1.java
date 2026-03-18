import java.util.*;
public class w34level2q1
{
 public static void main(String args[])
 {
    Scanner ob=new Scanner(System.in);
    int n;
    System.out.println("Enter number");
    n=ob.nextInt();
	if(n>0)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
			if(i%2==0)
			{
			System.out.print("(is even)");
			}
			else
			{
				System.out.print("(is odd)");
			}
			System.out.println(" ");
		}
	}
	else
	{
		System.out.println("not a natural number");
	}
 }
}
 