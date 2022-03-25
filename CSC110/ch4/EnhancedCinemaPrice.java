/*
Name: Nathan DeLano
Date:2/21/18
Program Name:EnhancedCinemaPrice
Class: CSC110
Pseudocode:
	Prompt user for ticket price
	prompt user for age
	if age is not 0
		display cost for that age
			free for ages less than 5 or more than 54
			1/2 off for children 5-12
		prompt user for age again
		display cost for that age
		until age is 0
	if age is 0 display Goodbye!
*/
package ch4;

import java.text.NumberFormat;
import java.util.Scanner;

public class EnhancedCinemaPrice {

	public static void main(String[] args) {
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter Ticket Price: ");
		double price = scan.nextDouble();
		System.out.print("Please Enter Your Age (or '0' to quit): ");
		int age = scan.nextInt();
		while (age != 0)
		{
			String word = "";
			double cost=price;
			if (age<5 || age > 54)
			{
				cost=0;
				word="free ";
			}
			else if (age<13)
			{
				cost=(price/2);
				word="half priced ";
			}
			System.out.print("Your "+ word +"ticket will cost: "+cFmt.format(cost)
							+"\n\nPlease Enter Your Age (or '0' to quit): ");
			age = scan.nextInt();
			
		}
		System.out.print("Goodbye!");
		scan.close();

	}

}
/*
output:
Please Enter Ticket Price: 15
Please Enter Your Age (or '0' to quit): 10
Your half priced ticket will cost: $7.50

Please Enter Your Age (or '0' to quit): 24
Your ticket will cost: $15.00

Please Enter Your Age (or '0' to quit): 0
Goodbye!
*/