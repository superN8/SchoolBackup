/*
Program Name :  MultiplicationTable.java
Author : Nathan DeLano
Date : 3/1/2018
Class: CSC110AA/AB and CIS163AA
Description:
		  This program prompts the user for a number 1 - 5, 
		  checks for bad input,
		  and creates a multiplication table.
		  Student completes.
*/

package ch4;

import java.util.Scanner;

/* produces a multiplication table of integers */

public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		int size=6;
		int value;
		int prompt=1;
		int horiz;
		Scanner scan = new Scanner (System.in);

		//read in size of multiplication table
		while(size!=0)
		{
			while(prompt!=0)
			{
				System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");
				size = scan.nextInt();
				prompt=0;
				if (size<0||size>5)
				{
					System.out.println("Please enter a valid number.");
					prompt=1;
				}
			}
				//using a for loop, display the top header row of numbers
			System.out.print("\t");
			for (horiz = 1; horiz <= size; horiz++)
			{    System.out.print(horiz + "\t");    }
			if (size!=0)
			{System.out.println();}

		
			//using a for loop, display the top header row underline (use a dash)
			System.out.print("\t");
			for (horiz = 1; horiz <= size; horiz++)
			{    System.out.print("-" + "\t");		}

			if (size!=0)
			{System.out.println();}	
		
			/* using a nested for loop create the rest of the table */
			//int column=1;
			for (int row=1;row<=size;row++)
			{
				System.out.print(row+"|");
				for(int column=1;column<=size;column++)
				{
					value=column*row;
					System.out.print("\t"+value);
				}
				System.out.println();
			}
	
			//System.out.println("\nDone!");
			prompt=1;
		
		}
		scan.close();
		System.out.println("\nDone!");
	}
}
/*
output:
Please enter the table size from 1 to 5 (0 to quit): 3
	1	2	3	
	-	-	-	
1|	1	2	3
2|	2	4	6
3|	3	6	9
Please enter the table size from 1 to 5 (0 to quit): 10
Please enter a valid number.
Please enter the table size from 1 to 5 (0 to quit): 0
		
Done!
 */


