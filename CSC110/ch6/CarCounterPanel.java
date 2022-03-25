//********************************************************************
// Program Name:  CarCounterPanel.java Activity 3     
// Author : P Baker / P Jalowiec
// Date : 2011
//
// Brief Description:
// 	Demonstrates a graphical user interface and an event listener.
//		Frames, Panels, labels, textfields,2 buttons
//    Shows how to get info from a textfield
//********************************************************************
package ch6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.text.DecimalFormat;

public class CarCounterPanel extends JPanel
{
   private int carCount;
   private JLabel carLabel;
	private JTextField carTextField;
	private JButton carButton;
	private Random generator;
	private JLabel carMakeLabel;
	private JTextField carMakeTextField;
	private JLabel carPassengerLabel;
	private JTextField carPassengerTextField;
	private JButton carPassengerButton;
	private double totalPassengers;
	private DecimalFormat format;

   public CarCounterPanel()
   {
      carCount = 0;
		generator = new Random();
		totalPassengers = 0;
		format = new DecimalFormat("##0.0");
		
		//create panel components
		carLabel = new JLabel("Number of cars: " );
		carTextField = new JTextField(10);
      carButton = new JButton("Press Here!");
		carMakeLabel = new JLabel("Car Make: " );
		carMakeTextField = new JTextField(10);
		carPassengerLabel = new JLabel("Passengers: " );
		carPassengerTextField = new JTextField(10);
		carPassengerButton = new JButton("Estimate Passengers");
		
		//connect event handler to event source
      carButton.addActionListener(new ButtonListener());
      carPassengerButton.addActionListener(new ButtonListener());
		
		//add components to panel
      this.add(carLabel);
		this.add(carTextField);
      this.add(carMakeLabel);
		this.add(carMakeTextField);
      this.add(carButton);
      this.add(carPassengerLabel);
		this.add(carPassengerTextField);
      this.add(carPassengerButton);
		
		//configure panel
      this.setBackground(Color.cyan);
      this.setPreferredSize(new Dimension(300, 200));
		carTextField.setText(Integer.toString(0));
		carPassengerTextField.setText(Integer.toString(0));
   }

   //internal private class event handler
	private class ButtonListener implements ActionListener
   {
		double passengerAverage;
      public void actionPerformed (ActionEvent event)
      {
			if(event.getSource() == carButton)
			{
         	carCount = generator.nextInt(50) + 1;
         	carTextField.setText(Integer.toString(carCount));
				if((carCount % 2) == 0)
				{
					setBackground(Color.yellow);
					carMakeTextField.setText("Chevrolet");
				}
				else
				{
					setBackground(Color.green);
					carMakeTextField.setText("Ford");
				}
			}
			if(event.getSource() == carPassengerButton)
			{
				//average of 2.0 passengers/car
				//estimate the total passengers.  Number of cars multiplied by 2.0
				//get the value in carTextField. Multiply by 1.8 to get totalPassengers
				//the getText method returns a String, so have to convert to a double 
				totalPassengers = Double.parseDouble(carTextField.getText() ) * 2.0; 
				
				//write the updated value of totalPassengers in carTextField
				//the setText method requires a String, so convert totalPassengers to a String
				carPassengerTextField.setText(Double.toString(totalPassengers) );
			}
			
		
      }
   }
}
