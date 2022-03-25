/*
Name: Nathan DeLano
Date: 1/31/18
Program Name: ChangeMaker
Class: CSC110
Pseudocode:
	prompt user for cents
	use modulus operator to find quarters and remainder of cents
	find dimes from remainder
	subtract dimes from remainder to make new remainder
	find nickels from new remainder
	find pennies from remainder of cents/5
	display the coin quantities
*/
package CH2;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("cents (1-99): ");
		int cents = keyboard.nextInt();
		int quarters=(cents/25);
		int dimes=((cents%25)/10);
		int nickels=(((cents%25)-(10*dimes))/5);
		int pennies=((cents%5));	
		System.out.println("Quarters :"+quarters);
		System.out.println("Dimes: "+dimes);
		System.out.println("Nickels: "+nickels);
		System.out.println("Pennies: "+pennies);
	}
}
/*output:

cents (1-99): 88
Quarters :3
Dimes: 1
Nickels: 0
Pennies: 3

cents (1-99): 51
Quarters :2
Dimes: 0
Nickels: 0
Pennies: 1

cents (1-99): 17
Quarters :0
Dimes: 1
Nickels: 1
Pennies: 2

cents (1-99): 4
Quarters :0
Dimes: 0
Nickels: 0
Pennies: 4
 
*/
