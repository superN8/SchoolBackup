package ch6;
//********************************************************************

//  Program Name:BankGUI.java      
//  Author :  P Baker 

//
//  Brief Description: Creates a simple GUI for the BankAccount Class
//********************************************************************

import javax.swing.JFrame;

public class BankGUI {
	// -----------------------------------------------------------------
	// Creates and displays the main program frame.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Bank Account");
		BankPanel panel = new BankPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
