package projects;

public class Project1 
{
	public static void main(String args[])
	{
		//System.out.println(equation(2,3)+"\n");
		//System.out.println(fact(12)+"\n");
		//System.out.println(printThem(52)+"\n");
		System.out.println(makeChange(56));
	}
	
	public static int equation(int x, int y)
	{
		return x+y;
	}
	
	public static int fact(int n)
	{
		int num = n;
		while(n > 1)
		{
			n--;
			num *= n;
		}
		return num;
	}
	
	public static String printThem(int n)
	{
		String str = "",
			   word = "";
		boolean div3;
		int num = 0;
		for(int i = 1; i <= n; i++)
		{
			if(i%7 == 0)
			{
				continue;
			}
			word = i+" ";	
			div3 = false;
			num++;
			if(i%3 == 0)
			{
				word = "three ";
				div3 = true;
			}
			if(i%5 == 0)
			{
				word = "five ";
				if(div3)
				{
					word = "fifteen ";
				}
			}
			if(num == 15)
			{
				word +="\n";
				num = 0;
			}
			
			str += word;
		}		
		return str;
	}
	
	public static String makeChange(int amnt)
	{
		String str = "Change for "+amnt+" cents:\n";
		int n,d,q;
		q = amnt / 25;
		amnt %= 25;
		d = amnt / 10;
		amnt %= 10;
		n = amnt / 5;
		amnt %= 5;
		str+= "Quarters: "+q+"\n   Dimes: "+d+"\n Nickels: "+n+"\n Pennies: "+amnt+"\nTotal Coins: "+(q+d+n+amnt);
		return str;
	}
	
}
