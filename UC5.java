import java.util.*;
public class UC5
{
	public static void main(String args[])
	{
		String M[]={
		String.join(" ","   ***   " ,"      ***   ","      ******  ","     *****"),
		String.join(" "," **   **   ","  **   **   ","   **    **  ","  **"),
		String.join(" ","**     **   ","**      **   "," **     ** "," **"),
	    String.join(" ","**     **   ","**      **   "," ****** ","     **"),
		String.join(" ","**     **   ","**      **   "," ** ","            ***"),
		String.join(" ","**     **   ","**      **   "," ** ","              **"),
		String.join(" ","**     **   ","**      **   "," ** ","               **"),
		String.join(" "," **   **   ","  **    **   ","  ** ","              **"),
		String.join(" ","   ***   ","      ***   ","     ** ","          *****"),
		};
		for(int i=0;i<=8;i++)
		{
	      System.out.println(M[i]);
		}
	}
}