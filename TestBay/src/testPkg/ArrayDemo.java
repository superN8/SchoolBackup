package testPkg;

public class ArrayDemo 
{
	
	public static void main(String args[])	
	{
		int data[] = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			data[i]=i;
		}
		
		System.out.println(data[0]);
		
		for(int i = 1; i < 10; i++)
		{
			System.out.print(data[i]+" ");
		}
		
		System.out.println("\n"+sum(data[2], data[3]));
	}
	
	private static int sum(int x, int y)
	{
		return x + y;
	}
}
