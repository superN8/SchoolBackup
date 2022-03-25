/*
Name: Nathan DeLano
Date:
Program Name:
Class: CSC110
Pseudocode:
	prompt user for price
	generate age
	set price to 0 for people younger than 5 or older than 55
	make price half off for kids 5-12
	display age and ticket price
*/

package ch4;

import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class CinemaPrice {

	public static void main(String[] args) {
		Random gen = new Random();
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter Ticket Price: ");
		double price = scan.nextDouble();
		int age = gen.nextInt(100)+1;
		String word = "";
		if (age<5 || age > 54)
		{
			price=0;
			word="free ";
		}
		else if (age<13)
		{
			price=(price/2);
			word="half priced ";
		}
		System.out.print("Your age: "+age+"\nYour "+ word +"ticket will cost: "+cFmt.format(price));
		scan.close();
	}
}
/*
output 1:
Please Enter Ticket Price: 7
Your age: 9
Your half priced ticket will cost: $3.50
 
output 2:
Please Enter Ticket Price: 6
Your age: 31
Your ticket will cost: $6.00

output 3:
Please Enter Ticket Price: 5
Your age: 81
Your free ticket will cost: $0.00
*/
