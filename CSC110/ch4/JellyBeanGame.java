//****************************************************************
//   Program Name: JellyBeanGame.java - SKELETON CODE for STEP 1
//  
//   Author :  Nathan DeLano
//
//   Date :  2/21/18
//   Description:
//   Play a game where the user tries to guess the
//   number of jellybeans in a jar.  Can range from 1 to 1000
//   
//   Uses a do..while loop.
//
// ****************************************************************
package ch4;

import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame
{
    public static void main(String[] args)
    {
        int numOfJellyBeans = 0;
        int guess = 0;
        int guessCount = 0;
        String another = "y";
		Random generator = new Random();
		Scanner scan = new Scanner (System.in);
		numOfJellyBeans = generator.nextInt(1000)+1;
		while (another.equalsIgnoreCase("y"))  // allows y or Y
	      {
			do
			{
				if (guessCount==0)
				{
					System.out.println("There are between 1 and 1000 jellybeans in the jar."
									+ "\nHow many do you think are in the jar?");
				}
				System.out.print("Guess: ");
				guess = scan.nextInt();
				if (guess < numOfJellyBeans)
				{
					System.out.print("Higher\n");
				}
				else if (guess > numOfJellyBeans)
				{
					System.out.print("Lower\n");
				}
				guessCount++;
			}	while (guess != numOfJellyBeans);
		System.out.print("Thats It!\nGuesses: " + guessCount+"\nPlay Again? (y/n): ");
        another = scan.nextLine();
        another = scan.nextLine();
          /*It looks stupid with that scan twice, but the
          code wasn't working without 2 of them. It took me
          an upsetting amount of time to get that working and
          i made several attempts to get it to work differently,
          but to no avail.*/
        guessCount = 0;
        numOfJellyBeans = generator.nextInt(1000)+1;
	      }
	    System.out.println("Goodbye!");
		scan.close();
	}
}
/*
output:
There are between 1 and 1000 jellybeans in the jar.
How many do you think are in the jar?
Guess: 500
Higher
Guess: 750
Lower
Guess: 650
Lower
Guess: 550
Lower
Guess: 525
Higher
Guess: 535
Higher
Guess: 545
Higher
Guess: 547
Higher
Guess: 548
Thats It!
Guesses: 9
Play Again? (y/n): y
There are between 1 and 1000 jellybeans in the jar.
How many do you think are in the jar?
Guess: 500
Lower
Guess: 250
Higher
Guess: 350
Higher
Guess: 450
Higher
Guess: 475
Higher
Guess: 485
Lower
Guess: 480
Lower
Guess: 477
Higher
Guess: 478
Thats It!
Guesses: 9
Play Again? (y/n): n
Goodbye!
*/
