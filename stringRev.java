import java.util.*;
public class stringRev
{
	public static void main(String args[])
	{
		System.out.println("enter string to reverse");
	Scanner ob=new Scanner(System.in);
	String s=ob.next();
	String s2=" ";
	int len=s.length(),i;
	for(i=s.length()-1;i<=0;i--)
	{
		char ch=s.charAt(i);
		s2=s2+ch;
	}
	System.out.println("after reverse:"+s2);
}
}