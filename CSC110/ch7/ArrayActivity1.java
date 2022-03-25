//**********************************************************
//  In class Activity - Ch 7 Arrays - Activity 1 
//  Program Name : ArrayActivity1.java
//
//  Author:
//  Date Written : 
//  Class:
//
//  Brief Description:
//  Intro to arrays in a java
//  
//**********************************************************
package ch7;
//import java.util.Scanner;

public class ArrayActivity1
{
    public static void main(String[] args)
    {
	   double[] myExams = new double[4];
		myExams[0] = 92.3;
		myExams[1] = 82.0;
		myExams[2] = 98.4;
		myExams[3] = 91.0;
		
	   //display the 2nd component
		System.out.println ("The second component is :  " + myExams[1]);


   	//display all the components of the array
		for( int i = 0; i < myExams.length; i++)
		{
			System.out.println(myExams[i]);
		}
		
		//add up all the element values in the array
		double sum = 0;
		for( int i = 0; i < myExams.length; i++)
		{
			sum = sum + myExams[i];
		}
		
		System.out.println("The sum is " + sum);
		
		//double exam4 = myExams[4];

		double maxValue = findMax(myExams);
		System.out.println(maxValue);
    }
    public static double findMax(double[] someArray)
    {
    	double max = someArray[0];
    	for (int i = 0; i < someArray.length; i++)
    	{
    		if(someArray[i]>max)
    		{
    			max=someArray[i];
    		}
    	}
    	return max;
    }
}
