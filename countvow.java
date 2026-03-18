import java.util.*;
public class countvow 
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
        int i,vowcount=0,concount=0;
        System.out.println("enter string");
        String str=ob.next();
        int len=str.length();
		str=str.toLowerCase();
        for(i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowcount=vowcount+1;
			}
			else
			{
				concount=concount+1;
			}
			}
		}
		System.out.println("number of vowels:"+vowcount);
		System.out.println("number of consonants:"+concount);
	}
}
			
        
   