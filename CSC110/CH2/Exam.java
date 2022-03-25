/*
Name: Nathan DeLano
Date: 1/31/18
Program Name: Exam
Class: CSC110
Pseudocode:
	prompt user for 3 exam scores
	find the average of the scores
*/
package CH2;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("First exam score: ");
		int exam1 = keyboard.nextInt();
		System.out.print("Second exam score: ");
		int exam2 = keyboard.nextInt();
		System.out.print("Third exam score: ");
		int exam3 = keyboard.nextInt();
		double average = ((double)(exam1+exam2+exam3)/3);
		keyboard.close();
		System.out.println("Average exam score: "+average);
	}

}
/* Output:

First exam score: 90
Second exam score: 91
Third exam score: 100
Average exam score: 93.66666666666667

*/