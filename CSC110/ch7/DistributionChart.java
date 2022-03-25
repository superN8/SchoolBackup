
//********************************************************************
// DistributionChart.java       
// Name: Nathan DeLano
// Date: 4/19/18
// 
// 
// Design and implement an application called DistributionChart
// that creates a chart/histogram so that you can visually inspect 
// the frequency distribution of a set of values.
//
// 
//********************************************************************

package ch7;
import java.util.Scanner;

public class DistributionChart 
{
	

   public static void main (String[] args)
   {
      int size = 10;
      int[] ranges = new int[size];  // each entry represents a range of values
	     
      getData(ranges);   //pass the entire array into the method
      
      displayChart(ranges);
      
      System.out.println("\nSee you later!!");
      
   } //end of main
   
   public static void getData(int[] someArray)
   {
	   int value=1, index;
	   Scanner scan = new Scanner (System.in);
 
	   System.out.println ("Enter a series of numbers between 1 and 100. Separate each number with a space.");
	   System.out.println ("Signal the end by entering a number outside " +
	         "of that range and then press enter.");
	   System.out.print("Go: ");
	   
	   //reads an arbitrary number of integers that are in the range 1 to 100 inclusive
	   //for each integer read in, determine which range it is in and increment the corresponding element in the array
	   
	   //your code goes here
	   for(int i=0; i<someArray.length; i++)
	   {
		   someArray[i]=0;
	   }
	  while(value>=1 && value<=100)
	  {
		   value=scan.nextInt();
		   index=(value-1)/10;
		   if(value>0)
		   {
			   switch(index)
			   {
			   case 0:
				   someArray[0]++;
		   			break;
		   		case 1:
		   			someArray[1]++;
		   			break;
		   		case 2:
		   			someArray[2]++;
		   			break;
		   		case 3:
		   			someArray[3]++;
		   			break;
		   		case 4:
		   			someArray[4]++;
		   			break;
		   		case 5:
		   			someArray[5]++;
		   			break;
		   		case 6:
		   			someArray[6]++;
		   			break;
		   		case 7:
		   			someArray[7]++;
		   			break;
		   		case 8:
		   			someArray[8]++;
		   			break;
		   		case 9:
		   			someArray[9]++;
		   			break;
		   		default:
		   		}
		   }
	  }
	   
		  
	    
	    scan.close();  
   }//end of getData
   
   public static void displayChart(int[] someArray)
   {
	   int minIndex,maxIndex;
	   String spacing="   ";
	   //Print chart title with your name
	   System.out.println("\nDistribution Chart by Nathan DeLano\n===================================");
	   //Print histogram.
	   for(int i=0; i<someArray.length; i++)
	   {
		  minIndex=1+(10*i);
		  maxIndex=10+(10*i);
		  if(maxIndex>=20 && maxIndex<100) 
			  spacing="  ";
		  else if (maxIndex==100)
			  spacing=" ";
		  System.out.print(minIndex+"-"+maxIndex+spacing+"|");
		  for(int j=0; j<someArray[i]; j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println("");
	   }
	      
   } //end of displayChart


}// end of DistributionChart tester class

/* Example output.  

Enter a series of numbers between 1 and 100. Separate each number with a space.
Signal the end by entering a number outside of that range and then press enter.
Go: 10 20 30 40 50 60 70 80 90 11 22 33 44 55 66 77 88 99 1 31 31 45 98 99 100 500

Distribution Chart by Nathan DeLano
===================================
1-10   |**
11-20  |**
21-30  |**
31-40  |****
41-50  |***
51-60  |**
61-70  |**
71-80  |**
81-90  |**
91-100 |****

See you later!!
 
*/

