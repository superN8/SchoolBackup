/*
 * CSC110AA/CIS163AA

 * This is the starting code for the MultiStatsArray Assignment
 * Houses 2 dimensional array.
 *
 * Starting code written by : Patricia Baker
 *  
 * Constructor is implemented.
 * display method and sortArray methods have been implemented.
 * All other methods as stubs. Use algorithms from similar methods in StatsArray assignment. 
 * New method: getRowSum(int row) -   method to add up a the values in a given row 
 * New method : getColumnSum(int col) -  method to add up the values in a given column )
 */
/*
Name: Nathan DeLano
Date: 4/19/18
Program Name: MultiStatsArray
Class: CSC110
Pseudocode: creates a class for the MultiStatsArrayGUI
*/
package ch7;
import java.awt.*;
import java.util.Random;  //for our random number generator



public class MultiStatsArray {

	private int rowSize;  //number of rows
	private int columnSize; //number of columns
	private int[][]stats; // an array of integers

	
	//default constructor
	//by default the array has 10 rows and 5 columns
	MultiStatsArray() {
		rowSize = 10;
		columnSize = 5;
		stats = new int[rowSize][columnSize];
	}


	public void display(Graphics g) {
		int x = 50;
		int y = 40;
		//displaying the array
		for(int i = 0; i < stats.length; i++) { //rows
			for (int j = 0; j < stats[0].length; j++) { //columns
				g.drawString("" + stats[i][j], x + j * 25,
									(y + 15 * i)); 
			}
		}
	}

	public void fillArray() {
	//fill array with random numbers (int) in the range 0 - 100
		Random random = new Random();
		for(int i =0; i<stats.length; i++)
		{
			for(int j = 0; j<stats[0].length; j++)
			{
				stats[i][j]=random.nextInt(100)+1;
			}
		}
		
	}

	public int getSum() {
		//add up all the values in the array
		int sum=0;
		for(int i =0; i<stats.length; i++)
		{
			for(int j = 0; j<stats[0].length; j++)
			{
				sum+=stats[i][j];
			}
		}
		
		return sum;
	}


	public int getMax() {
		//return the maximum value in the array
		int max=stats[0][0];
		for(int i =0; i<stats.length; i++)
		{
			for(int j = 0; j<stats[0].length; j++)
			{
				if(stats[i][j]>max)
					max=stats[i][j];
			}
		}
		return max;
	}

	public int getMin() {
		//return the minimum value in the array
		int min=stats[0][0];
		for(int i =0; i<stats.length; i++)
		{
			for(int j = 0; j<stats[0].length; j++)
			{
				if(stats[i][j]<min)
					min=stats[i][j];
			}
		}
		return min;
	}

	public double getAverage() {
		//return the average
		int sum=0;
		double avg=0;
		for(int i =0; i<stats.length; i++)
		{
			for(int j = 0; j<stats[0].length; j++)
			{
				sum+=stats[i][j];
			}
		}
		avg=((double) sum/(rowSize*columnSize));
		return avg;
	}

	public int countValues(int lowRange, int highRange) {
		//count how many numbers are >= lowRange and <= highRange
		int valueCount=0;
		for(int i =0; i<stats.length; i++)
		{
			for(int j = 0; j<stats[0].length; j++)
			{
				if(stats[i][j]>=lowRange && stats[i][j]<=highRange)
					valueCount++;
			}
		}
		return valueCount;
	}


	public boolean isValueFound(int someNumber) {
		//check to see if a someNumber is in the array
		boolean valueFound=false;
		for(int i =0; i<stats.length; i++)
		{
			for(int j = 0; j<stats[0].length; j++)
			{
				if(stats[i][j]==someNumber)
					valueFound=true;
			}
		}
		return valueFound;
	}

	public int  getRowSum(int row) {
		//computes and returns the sum of a given row
		int rowSum=0;
		for(int j = 0; j<stats[0].length; j++)
		{
			rowSum+=stats[row][j];
		}
		return rowSum;			
	}

	public int getColumnSum(int col) {
			//computes and return the sum of a given column
		int colSum=0;
		for(int i=0; i<stats.length;i++)
		{
			colSum+=stats[i][col];
		}
		return colSum;
	}
	
	public void sortArray() {
			/*sort the array in ascending order - selection sort
			  loaded the values from the 2 dimensional array
			  into a 1 dimensional array and used the same sort
			  algorithm....*/

			int tempValue;
			int min;
			int sizeOfTempArray = stats.length * stats[0].length;
			int[] tempArray = new int[sizeOfTempArray];
			
			//move values from stats to tempArray
			int x = 0;
			for(int i = 0; i < stats.length; i++) { //rows
			for (int j = 0; j < stats[0].length; j++) { //columns
				tempArray[x] = stats[i][j];
				x = x+1;}}

			
	     //now sort tempArray
			for (int i = 0; i < (tempArray.length - 1); i++)
			{
				min = i;
				for (int j = (i + 1); j < (tempArray.length); j++)
				{
					if (tempArray[j] < tempArray[min])
					{
						min = j;
					}
				}
				tempValue = tempArray[min];
				tempArray[min] = tempArray[i];
				tempArray[i] = tempValue;
			}
			
			//put sorted values back into stats...
			
			
			x = 0;
			for(int i = 0; i < stats.length; i++) { //rows
			for (int j = 0; j < stats[0].length; j++) { //columns
				stats[i][j] = tempArray[x];
				x = x+1;} }		

		}
	
	
}//end of MultiStatsArray class