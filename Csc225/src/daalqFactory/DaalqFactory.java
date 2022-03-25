package daalqFactory;

public class DaalqFactory 
{
	static String tempStr;
	
	private static boolean randB()
	{
		return (int)(Math.random()*2) == 0;
	}
	
	public static String getTiztbym()
	{
		if(randB())
			tempStr ="x";
		else
			tempStr = "e";
		tempStr += "s";
		return tempStr;
	}
	
	public static String getTizooym()
	{
		tempStr = getTiztbym() + "k";
		return tempStr;
	}
	
	public static String getMultipleTizooyms()
	{
		tempStr=getTizooym();
		if(randB())
			tempStr += getMultipleTizooyms();
		return tempStr;
	}
	
	public static String generateDaalq()
	{
		tempStr = getMultipleTizooyms();
		if(randB())
			tempStr += getTiztbym();
		return tempStr;
	}
	
	public static void main(String args[])
	{
		for(int i = 0; i < 10; i++)
			System.out.println(generateDaalq());
	}
}
