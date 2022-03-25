package testPkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain 
{
	static int num;
	
	public static void main(String[] args)
	{
		
		getDemoCode();
		switch (num)
		{
			default:
			{
				System.out.println("Hello World!");
				break;
			}
			case 1:
			{
				demoContinue();
				break;
			}
			case 2:
			{
				demoBreak();
				break;
			}
			case 3:
			{
				demoAdvancedFor();
				break;
			}
		}	
	}
	
	private static void getDemoCode()
	{
		Scanner keyIn = new Scanner(System.in);	
		System.out.print("input demo code: ");
		try 
		{
			num=keyIn.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid codea");
			getDemoCode(); //recursion
		}
		keyIn.close();
	}
	
	private static void demoContinue()
	{
		for(int i = 1; i <= 10; i++)
		{
			if(i == 2)
			{
				continue; //skips the rest of the loop body for current iteration
			}
			System.out.println(i);
		}
	}
	
	private static void demoBreak()
	{
		for(int i = 1; i <= 10; i++)
		{
			if(i == 5)
				break; //exits loop
			System.out.println(i);
		}			
	}
	
	private static void demoAdvancedFor() //used to parse arrays
	{
		int[] ary = new int[10];
		for(int i = 0; i < ary.length; i++)
		{
			ary[i] = i-10;
		}
		for(int i: ary) //i becomes ary[i], loops for ary.length iterations
		{
			System.out.println(i);
		}
		/*//this loop behaves the exact same way
		for(int c = 0; c < ary.length; c++)
		{
			int i = ary[c];
			System.out.println(i);
		}
		*/
	}
}
