package ch7;
//**********************************************************
//  In class Activity - Ch 7 Arrays - 2D/Multidimensional
//  Program Name : ArrayActivity2D.java  Starting File
//
//  Author:
//  Date Written : Skeleton by PBaker.  Additions by : 
//  Class:
//
//  Brief Description:
//  Intro to 2 dimensional arrays in a java
//  
//**********************************************************
import java.util.Scanner;
public class ArrayActivity2D
{
    public static void main(String[] args)
    {
		double value = 0.0;
		double sum = 0.0;
		double average = 0.0;
		int countValues = 0;
		int examRow=0;
		Scanner scan = new Scanner(System.in);
		while(examRow<1)
		{
			System.out.println("Input rows: ");
			examRow=scan.nextInt();
			if (examRow<1)
			{
				System.out.println("Please enter a valid value");
			}
		}
		
		
		//Declare an array called myExams that keeps track of exam scores for 10 students.
		//Each student has 3 quiz scores.
		
		double[][] myExams = new double[examRow][3];

    	//load the array with the values 0 - 29, in order
		System.out.println("Display the array\n");
		// display all the components of the array
		for(int row = 0; row < myExams.length; row++)
				{
					for(int col=0; col < myExams[0].length; col++)
					{
						myExams[row][col] = value;
						
						sum=sum+myExams[row][col];
						System.out.print(myExams[row][col]+"  ");
						if(value>22)
							{
								countValues++;
							}
						value++;
						
					}
					System.out.println();
					
				}
		
					System.out.println("The sum of the array: " + sum);
				
		
    	

					
		
		
		
					System.out.println("\nChallenge: Calculate the average ");
					average=sum/(myExams.length * myExams[0].length);
					System.out.println("The average is : " + average);
		
		
		
					System.out.println("\nChallenge: Count how many values that are greater than 22: ");
					System.out.println("Number of values greater than 22: " + countValues);
		scan.close();


    }
}
