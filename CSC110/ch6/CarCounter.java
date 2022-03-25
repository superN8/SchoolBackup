//********************************************************************
//  Program Name:CarCounter.java   CarCounter 3 Activity     
//  Author :  P Baker / P Jalowiec
//  Date :  2011
//
//  Brief Description: Demonstrates a graphical user interface and an event listener.
//********************************************************************
package ch6;
import javax.swing.JFrame;

public class CarCounter
{
   public static void main(String[] args)
   {
 		//Create frame and panel
      JFrame frame = new JFrame("Car Counter");
      CarCounterPanel panel = new CarCounterPanel();

		//set frame behavior
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//place panel in frame
      frame.getContentPane().add(panel);
		
		//format frame and make available/visible
      frame.pack();
      frame.setVisible(true);
   }
}
