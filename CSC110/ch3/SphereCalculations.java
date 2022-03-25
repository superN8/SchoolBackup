/*
Name: Nathan DeLano
Date:2/7/18
Program Name: SphereCalculations
Class: CSC110
Pseudocode:
	prompt user for radius of a sphere
	calculate volume and surface area
	display radius, volume and area with 4 decimal places
 */

package ch3;
	import java.text.DecimalFormat;
	import java.util.Scanner;
public class SphereCalculations {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat dFmt = new DecimalFormat("0.####");
		System.out.print("Super Sphere Calculator!\n"+"Radius: ");
		double radius = keyboard.nextDouble();
		double volume = (4*(Math.PI)*(Math.pow(radius, 3)))/3;
		double area = 4*Math.PI*Math.pow(radius, 2);
		System.out.print("\nResults"
						+"\nRadius: "+ dFmt.format(radius)
						+"\nVolume: "+dFmt.format( volume)
						+"\nSurface Area: "+dFmt.format( area));
		keyboard.close();
	}

}
/*
output 1:

Super Sphere Calculator!
Radius: 4.2

Results
Radius: 4.2
Volume: 310.3391
Surface Area: 221.6708
/////////////////////////////////////////////////////////////////////////
output 2:

Super Sphere Calculator!
Radius: 7.5

Results
Radius: 7.5
Volume: 1767.1459
Surface Area: 706.8583
*/