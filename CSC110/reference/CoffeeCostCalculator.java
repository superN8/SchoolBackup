/*
Name: Nathan DeLano
Date: 1/23/2018
Program Name: Coffee Cost Calculator
*/
package reference;


//necessary for keyboard input
import java.util.Scanner;

public class CoffeeCostCalculator {

	public static void main(String[] args) 
	
	{
	//another line for keyboard input	
	Scanner keyboard = new Scanner(System.in);
	
	//Constants
	final int DAYS = 7;
	final int WEEKS = 52;
	
	//another 2 lines for the keyboard input
	System.out.print("Enter the cost per cup: ");
	double cost = keyboard.nextDouble();
	
	//one quick calculation before the outputs
	double C_WEEK = (cost*DAYS);
	
	//outputs
	System.out.println("Cost per cup: " + cost);
	System.out.println("Cost per week: " + C_WEEK);
	System.out.println("Cost per year: " + (C_WEEK*WEEKS));
	
	//last line for keyboard input
	keyboard.close();
	}

}
/*Output:
Enter the cost per cup: 2.6
Cost per cup: 2.6
Cost per week: 18.2
Cost per year: 946.4

*/