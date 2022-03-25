/*
 * CSC110AA/CIS163AA
 * An Integer Array
 *
 * This is the starting code for the StatsArray Assignment
 * The display method and the sortArray methods have been implemented
 *
 *
 * All of the other methods are just returning some default value.  You will need to
 * implement these methods so that they return the appropriate value.
 *
 * Patricia Baker 
 */
/*
Name: Nathan DeLano
Date: 4/12/2018
Program Name: StatsArray
Class: CSC110
Pseudocode: a class to work with statsArrayGUI
*/

package ch7;
import java.awt.*;
import java.util.Random;  //for our random number generator




public class StatsArray {

	//instance variables
	private int size;  //how big is the array
	private int[] stats; // an array of integers
	private int sum, min, max, countValue;
	private double average;
	//default constructor -overloaded method
	StatsArray() {
		size = 10;
		stats = new int[size] ;  //instantiate the array called stats
	}

	public void display(Graphics g)
	{
		int x = 50;  //coordinates for displaying
		int y = 40;

		//display the array with position number
		for(int i = 0; i < stats.length; i++)
		{
			g.drawString("Stats [" + i + "] = "+ stats[i],
			 x,	(y + 15 * i));
		}
	}

	public void fillArray()
   {
		/*fill the array with random numbers (int) in the range 0 - 100.*/
		Random random = new Random();
		for (int i = 0; i < stats.length; i++)
		{
			stats[i]=random.nextInt(100)+1;
		}


	}

	public int getSum() 
	{
		//add up all the values in the array
		sum=0;
		for (int i = 0; i < stats.length; i++)
		{
			sum= (sum+stats[i]);
		}
		return sum;
	}


	public int getMax() 
	{
		//return the maximum value in the array
		max=stats[0];
		for (int i = 0; i < stats.length; i++)
		{
			
			if(stats[i]>max)
			{
				max=stats[i];
			}
		}
		return max;
	}

	public int getMin()
	{
		//return the minimum value in the array
		min=stats[0];
		for (int i = 0; i < stats.length; i++)
		{
			if(stats[i]<min)
			{
				min=stats[i];
			}
		}
			return min;
	}

	public double getAverage() 
	{
		//return the average
		sum=0;
		for (int i = 0; i < stats.length; i++)
		{
			sum = (sum+stats[i]);
			
		}
		average=((double)sum/size);
		return average;
	}

	public int countValues(int lowRange, int highRange) 
	{
		countValue=0;
		//count how many numbers are >= lowRange and <= highRange
		for (int i = 0; i < stats.length; i++)
		{
			if (stats[i] >= lowRange && stats[i] <= highRange)
			{
				countValue++;
			}
		}
		return countValue;
	}


	public boolean isValueFound(int someNumber) 
	{
		//check to see if someNumber is in the array
		boolean valueFound=false;
		for (int i = 0; i < stats.length; i++)
		{
			if(stats[i]==someNumber)
			{
				valueFound=true;
				i=size+1;
			}
		}
		return valueFound;
	}


	public void sortArray() 
	{
		/*sort the array in ascending order - selection sort*/

		int tempValue;
		int min;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			min = i;
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[min])
				{
					min = j;
				}
			}
			tempValue = stats[min];
			stats[min] = stats[i];
			stats[i] = tempValue;


		}

	}


	public void sortBArray() {
		/*Here is another common sort algorithm.
		  It sorts the array in ascending order.
		  This is called a bubble sort.  I have added it
		  so that you can take a look at it.*/

		int tempValue;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[i])
				{
					tempValue = stats[i];
					stats[i] = stats[j];
					stats[j] = tempValue;
				}
			}
		}


	}





}//end of StatsArray Class definition