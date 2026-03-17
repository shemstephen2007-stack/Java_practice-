
			
public class UC6
{
	static String[] get0pattern()
	{
		return new String[]
		{"   ***    ",
		" **   **  ",
		"**     ** ",
	    "**     ** ",
		"**     ** ",
		"**     ** ",
		"**     ** ",
		" **   **  ",
		"   ***   "};
	}
	static String[] getPpattern()
	{
		return new String[]
		{" ******  ",
		"**    **  ",
		"**     ** ",
		"**    ** ",
		"****** ",
		"** ",
		"** ",
		"** ",
		" ** "};
	}
	static String[] getSpattern()
	{
		return new String[]
		{"       *****",
		"     **",
		"   **",
		"     **",
		"         ***",
		"                 **",
		"                **",
		"               **",
        "          *****"};
	}
	public static void main(String args[])
	{
		String Opattern[]=get0pattern();
		String Ppattern[]=getPpattern();
		String Spattern[]=getSpattern();
		
		int i;
		for(i=0;i<Spattern.length;i++)
		{
			System.out.println(Opattern[i]+" "+Opattern[i]+" "+Ppattern[i]+" "+Spattern[i]);
		}
	}
}