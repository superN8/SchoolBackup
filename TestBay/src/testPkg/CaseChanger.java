package testPkg;

public class CaseChanger 
{
	private static char abc[]=new char[26],
			    		ABC[]=new char[26];
	public static void main(String args[])
	{
		String song = "",
			   na="na";
		for(int i = 0; i < 10; i++)
		{
			song+=na;
			na = invertCase(na);				
		}
		System.out.println(song+" Batman");
		System.out.println(invertCase("hELLO mY nAME iS nATHAN"));
		
	}
	
	private static char[] getLowerCase()
	{
		abc[0]  = 'a';
		abc[1]  = 'b';
		abc[2]  = 'c';
		abc[3]  = 'd';
		abc[4]  = 'e';
		abc[5]  = 'f';
		abc[6]  = 'g';
		abc[7]  = 'h';
		abc[8]  = 'i';
		abc[9]  = 'j';
		abc[10] = 'k';
		abc[11] = 'l';
		abc[12] = 'm';
		abc[13] = 'n';
		abc[14] = 'o';
		abc[15] = 'p';
		abc[16] = 'q';
		abc[17] = 'r';
		abc[18] = 's';
		abc[19] = 't';
		abc[20] = 'u';
		abc[21] = 'v';
		abc[22] = 'w';
		abc[23] = 'x';
		abc[24] = 'y';
		abc[25] = 'z';
		return abc;
	}
	
	private static char[] getUpperCase()
	{
		ABC[0]  = 'A';
		ABC[1]  = 'B';
		ABC[2]  = 'C';
		ABC[3]  = 'D';
		ABC[4]  = 'E';
		ABC[5]  = 'F';
		ABC[6]  = 'G';
		ABC[7]  = 'H';
		ABC[8]  = 'I';
		ABC[9]  = 'J';
		ABC[10] = 'K';
		ABC[11] = 'L';
		ABC[12] = 'M';
		ABC[13] = 'N';
		ABC[14] = 'O';
		ABC[15] = 'P';
		ABC[16] = 'Q';
		ABC[17] = 'R';
		ABC[18] = 'S';
		ABC[19] = 'T';
		ABC[20] = 'U';
		ABC[21] = 'V';
		ABC[22] = 'W';
		ABC[23] = 'X';
		ABC[24] = 'Y';
		ABC[25] = 'Z';
		return ABC;
	}
	
	public static String capitalize(String str)
	{
		getLowerCase();
		getUpperCase();
		char[] ary = toArray(str);
		
		for(int i = 0; i < ary.length; i++)
		{
			for(int i2 = 0; i2 < abc.length; i2++)
			{
				if(ary[i] == abc[i2])
				{
					ary[i] = ABC[i2];
				}
			}
		}
		
		return toString(ary);				
	}
	
	public static String minimize(String str)
	{
		getLowerCase();
		getUpperCase();
		char[] ary = toArray(str);
		
		for(int i = 0; i < ary.length; i++)
		{
			for(int i2 = 0; i2 < abc.length; i2++)
			{
				if(ary[i] == ABC[i2])
				{
					ary[i] = abc[i2];
				}
			}
		}
		
		return toString(ary);
	}
	
	public static String invertCase(String str)
	{
		getLowerCase();
		getUpperCase();
		char[] ary = toArray(str);
		for(int i = 0; i < ary.length; i++)
		{
			for(int i2 = 0; i2 < abc.length; i2++)
			{
				if(ary[i] == abc[i2])
				{
					ary[i] = ABC[i2];
				}
				else if(ary[i] == ABC[i2])
				{
					ary[i] = abc[i2];
				}
			}
		}
		return toString(ary);
	}
	
	public static char[] toArray(String str)
	{
		char[] ary = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			ary[i]=str.charAt(i);
		}
		return ary;
	}
	
	public static String toString(char[] ary)
	{
		String str = "";
		for(int i = 0; i < ary.length; i++)
		{
			str+=ary[i];
		}
		return str;
	}
}