package lab7;

public class Lab7 
{
	static int tempInt;
	//TODO delete main body
	public static void main(String args[]) 
	{
		System.out.println(factorial(0));
		System.out.println(fibonacci(5));
		System.out.println(gcd(66,55));
		System.out.println(isPalindrome("mom"));
	}
	
	public static int factorial(int n)
	{	
		tempInt = 1;
		if(n > 0)
			tempInt = n * factorial(n-1);
		return tempInt;
	}
	
	public static int fibonacci(int n)
	{
		tempInt = n;
		if (n > 1)
			tempInt=fibonacci(n-2)+fibonacci(n-1);
		return tempInt;
	}
	
	public static int gcd(int a, int b)
	{
		if(a == b)
			return a;
		else if (a > b)
			return gcd(a-b,b);
		else
			return gcd(a,b-a);
	}
	
	public static boolean isPalindrome(String s)
	{
		String tempStr = s;
		boolean b=true;
		if(tempStr.length() > 1)
		{
			b = tempStr.charAt(0) == tempStr.charAt(tempStr.length()-1); 
			isPalindrome(tempStr.substring(1,tempStr.length()-2));
		}
		return b;
	}
}
