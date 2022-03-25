package extra;

import javax.swing.JFrame;

public class VelocityGUI 
{
	public static void main (String[] args)
		{
			JFrame frame = new JFrame ("Projectile Motion Calculator");
			VelocityPanel panel = new VelocityPanel();
			frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
		}
}
