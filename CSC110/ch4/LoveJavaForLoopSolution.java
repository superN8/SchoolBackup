// ****************************************************************
//   LoveJavaForLoopSolution.java
//
//   Use a for loop to print many messages declaring your
//   passion for java
//
//  When completed show do loop.
// ****************************************************************
package ch4;
import java.util.Scanner;

public class LoveJavaForLoopSolution
{
    public static void main(String[] args)
    {
		int limit;
		int sum;
		String evenOrOdd;
		String again = "y";
	
		Scanner scan = new Scanner (System.in);
		
		do
		{
	
					System.out.print("Enter the number of times message printed: ");
					limit = scan.nextInt();
				
					sum = 0;
					
					for (int count = 1; count <= limit; count++)
					{
			
						evenOrOdd = (count % 2 == 0)? "even": "odd";
				
					    System.out.println(count + " I love Java!!"
					    			+ " This number is " + evenOrOdd + ".");
				
					    sum += count; //needs to come before incrementing count
					    
					}
			
					System.out.println("Message was printed " + limit + " times.");
					System.out.println("The sum of the numbers from 1 to " + limit + " is " + sum + ".");
					
					System.out.print("Run it again?  Y or N: ");
					again = scan.next();
					
	  } while  ( again.equalsIgnoreCase("y") );
	  
		System.out.println("\nGood bye! \n" );


    }
}
