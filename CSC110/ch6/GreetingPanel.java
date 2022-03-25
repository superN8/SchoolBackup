	//********************************************************************
	// Program Name:  GreetingPanel.java  - Starting Code 
	// Author : P Baker and ???
	// Date : 
	//
	// Brief Description:  User puts their name in the JTextField.  When the
    //                       button is clicked, the name is retrieved and 
    //                       a nice message is displayed by setting the
    //                       text of a JLabel.
	//********************************************************************
	package ch6;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	

	public class GreetingPanel extends JPanel
	{
	   
	   private JLabel questionLabel;  
	   private JTextField answerTextField;
	   private JButton button;
	   private JLabel niceMessageLabel;
	     

	 	//Constructor:  Sets up the Panel  
	   public GreetingPanel()
	   {
			
			//create all the panel components
			
	        questionLabel = new JLabel("What is your name?");
	        answerTextField = new JTextField(10);
		    button = new JButton("Press Here!");
		    niceMessageLabel = new JLabel();
		    
		    //create Fonts
		    Font questionFont = new Font(Font.SERIF, Font.PLAIN, 15);
		    Font buttonFont = new Font(Font.MONOSPACED, Font.BOLD, 15);
		    Font niceMessageFont = new Font(Font.DIALOG, Font.ITALIC,15);
		    
		    //set fonts
		    questionLabel.setFont(questionFont);
		    button.setFont(buttonFont);
		    niceMessageLabel.setFont(niceMessageFont);
		    
			
		    //create and set font color
		    //Color blue = new Color(0,0,255);
		    niceMessageLabel.setForeground(Color.blue);
		    
			//add all the components to panel.  order is important
		    add(questionLabel);
		    add(answerTextField);
		    add(button); 
		    add(niceMessageLabel);
		   
	        //connect event handler to event source
	        button.addActionListener(new ButtonListener());
					
			//configure panel.  
	        setBackground(Color.LIGHT_GRAY);
	        setPreferredSize(new Dimension(170, 200));
		  
	   }

	   //private internal class that is a listener for button push (action) events.
		//also called an event handler
		private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	   //get the name the user put in the answerTextField
	    	   String answer = answerTextField.getText();
	    	   
	    	   //now set the text of the niceMessageLabel 
	    	   //to a nice message that includes the name 
	    	  niceMessageLabel.setText("Hello, "+answer);
	    	   
	           
				  
				  
	      }//end of ActionPerformed method
			
	   }//end of ButtonListener
		
		private static final long serialVersionUID = 1L;	}//end of GreetingPanel


