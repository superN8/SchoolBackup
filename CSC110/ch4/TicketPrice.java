//In Class Activity Starting File
//Program ID : TicketPrice.java
//Author : Nathan DeLano Dominic Luzzi
//Date Written : 2/6/18
//Class : CSC110AA and CIS163AA
//Brief Description:
//		This program determines ticket price based on age.  Uses an if..else if
package ch4;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class TicketPrice
{
	public static void main(String[] args)
	{
		int age = 0;
	    double price = 0.0;
		Random gen = new Random();
		
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println( "Movie Ticket Price Calculator");
		
		DecimalFormat dFmt = new DecimalFormat("0.00");
		//price=gen.nextInt(8)+7; 
		price =(7* gen.nextDouble())+7;
     	
		System.out.println( "Full Ticket price: "+price);
	  
        System.out.print( "Your age: ");
	    age = scan.nextInt();
	
	    if (age<6)
	    {
	    	System.out.println("Your ticket will be free!");
	    }
	    else if (age<=20)
	    {
	    	System.out.println("Your ticket will be half priced!");
	    	price=price/2;}
	    if (age>=6) {
	      System.out.println("The ticket will cost: $" + dFmt.format(price));
	scan.close();
	    }
	   	    
	 
		//calculate the ticket prices and display a message
		// based on your if..else if..else statement
		
	}
}
/*output
Bonus 1
Movie Ticket Price Calculator
Full Ticket price: 13.0
Your age: 19
Your ticket will be half priced!
The ticket will cost 6.5

Bonus 2
Movie Ticket Price Calculator
Full Ticket price: 13.463068888227506
Your age: 19
Your ticket will be half priced!
The ticket will cost: $6.73
 */
