import java.util.*;
public class UC4
{
	public static void main(String args[])
	{
		String M[];
		M=new String[9];
		M[0]=String.join(" ","   ***   " ,"      ***   ","      ******  ","     *****");
		M[1]=String.join(" "," **   **   ","  **   **   ","   **    **  ","  **");
		M[2]=String.join(" ","**     **   ","**      **   "," **     ** "," **");
	    M[3]=String.join(" ","**     **   ","**      **   "," ****** ","     **");
		M[4]=String.join(" ","**     **   ","**      **   "," ** ","            ***");
		M[5]=String.join(" ","**     **   ","**      **   "," ** ","              **");
		M[6]=String.join(" ","**     **   ","**      **   "," ** ","               **");
		M[7]=String.join(" "," **   **   ","  **    **   ","  ** ","              **");
		M[8]=String.join(" ","   ***   ","      ***   ","     ** ","          *****");
		for(int i=0;i<=8;i++)
		{
	      System.out.println(M[i]);
		}
	}
}
