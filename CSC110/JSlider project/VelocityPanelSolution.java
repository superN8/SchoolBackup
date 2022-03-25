package extra;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Dimension;
import java.text.DecimalFormat;

public class VelocityPanel extends JPanel
{
	private JSlider angleSlider, 
					velocitySlider;
	private JLabel angelLabel, 
				   velocityLabel,
				   distanceLabel,
				   altitudeLabel,
				   timeLabel;
	private JTextField distanceTextField,
				       altitudeTextField,
				       timeTextField;
	private DecimalFormat dFmt;
	private final int minAngle=0, 
					  maxAngle=90, 
					  initAngle=45, 
					  minVelocity=0,
					  maxVelocity=100,
					  initVelocity=50;
	private double distance,
				   altitude,
				   peakTime,
				   launchTime,
				   yVelocity,
				   xVelocity;
	private int launchAngle=initAngle,
				launchVelocity=initVelocity;
	private static final long serialVersionUID = 1L;
	
	public VelocityPanel()
	{
		dFmt = new DecimalFormat("0.00");
		
		//creates Labels
		angelLabel = new JLabel("Launch Angle");
		velocityLabel = new JLabel("Launch Velocity");
		distanceLabel = new JLabel("Distance:");
		altitudeLabel = new JLabel("Max Altitude:");
		timeLabel = new JLabel("Time:");
		
		//creates Text Fields
		distanceTextField = new JTextField(10);
		altitudeTextField = new JTextField(10);
		timeTextField = new JTextField(10);
//create a horizontal slider called angleSlider
//include minAngle, maxAngle and initAngle
		angleSlider = new JSlider(JSlider.HORIZONTAL,minAngle,maxAngle,initAngle);
//set majorTickSpacing to 10 and minorTickSpacing to 5
		angleSlider.setMajorTickSpacing(10);
		angleSlider.setMinorTickSpacing(5);
		angleSlider.setPaintTicks(true);
		angleSlider.setPaintLabels(true);
//connect angleSlider to the change listener
		angleSlider.addChangeListener(new SliderListener());
		
//create another horizontal slider called velocitySlider
//include minVelocity, maxVelocity and initVelocity
		velocitySlider = new JSlider(JSlider.HORIZONTAL,minVelocity,maxVelocity,initVelocity);
//set majorTickSpacing to 10 and minorTickSpacing to 5
		velocitySlider.setMajorTickSpacing(10);
		velocitySlider.setMinorTickSpacing(5);
		velocitySlider.setPaintTicks(true);
		velocitySlider.setPaintLabels(true);
//connect velocitySlider to the change listener 
		velocitySlider.addChangeListener(new SliderListener());

		//calculate the initial values for the text fields
		yVelocity=launchVelocity*Math.sin(Math.toRadians(launchAngle));
		xVelocity=launchVelocity*Math.cos(Math.toRadians(launchAngle));
		peakTime=(0-yVelocity)/-9.8;
		altitude=(yVelocity*peakTime)-(.5*9.8*Math.pow(peakTime, 2));
		launchTime=2*peakTime;
		distance=xVelocity*launchTime;
		distanceTextField.setText(dFmt.format(distance));
		altitudeTextField.setText(dFmt.format(altitude));
		timeTextField.setText(dFmt.format(launchTime));
		
		//add the components
		add(angelLabel);
		add(angleSlider);
		add(velocityLabel);
		add(velocitySlider);
		add(distanceLabel);
		add(distanceTextField);
		add(altitudeLabel);
		add(altitudeTextField);
		add(timeLabel);
		add(timeTextField);
		setPreferredSize(new Dimension(230, 230));
	}
	
	private class SliderListener implements ChangeListener 
	{
		public void stateChanged ( ChangeEvent event )
		{
		
			JSlider source = (JSlider)event.getSource();
      
			if (!source.getValueIsAdjusting());
			{ 
//determine the source and get the value from the angleSlider and velocitySlider
				if (source == angleSlider)
				{
					launchAngle = angleSlider.getValue();
				}
				if (source == velocitySlider)
				{
					launchVelocity = velocitySlider.getValue();
				}
				
				//does the calculations everytime the value is changed
				yVelocity=launchVelocity*Math.sin(Math.toRadians(launchAngle));
				xVelocity=launchVelocity*Math.cos(Math.toRadians(launchAngle));
				peakTime=(0-yVelocity)/-9.8;
				altitude=(yVelocity*peakTime)-(.5*9.8*Math.pow(peakTime, 2));
				launchTime=2*peakTime;
				distance=xVelocity*launchTime;
				//set text fields to new values
				distanceTextField.setText(dFmt.format(distance));
				altitudeTextField.setText(dFmt.format(altitude));
				timeTextField.setText(dFmt.format(launchTime));

			}
		}

	}
}
