/*
Name: Nathan DeLano
Date: 2/15/18
Program Name: Cards
Class: CSC110
Pseudocode:
	generate suit using random number from 1-4
	then use switch to determine a suit
	generate random number 1-13
	use switch for Ace, Jack, Queen, King
	print lines
*/
package ch4;

import java.util.Random;

public class Cards {

	public static void main(String[] args) {
		Random gen = new Random();
		int suit = gen.nextInt(4)+1;
		int number =gen.nextInt(13)+1;
		System.out.println("You Have Drawn:");
		switch (number)
		{
			case 1:
				System.out.print("Ace of ");
				break;
			case 11:
				System.out.print("Jack of ");
				break;
			case 12:
				System.out.print("Queen of ");
				break;
			case 13:
				System.out.print("King of ");
				break;
			default :
				System.out.print(number+" of ");
		}
		switch (suit)
		{
		case 1:
			System.out.print("Spades");
			break;
		case 2:
			System.out.print("Clubs");
			break;
		case 3:
			System.out.print("Hearts");
			break;
		default:
			System.out.print("Diamonds");
		
		}

	}

}
/*
output:
You Have Drawn:
4 of Clubs
*/
