/*Name: Nathan DeLano
Date: 1/31/18
Program Name: Seconds
Class: CSC110
Pseudocode:
	prompt user for hours
	prompt user for minutes
	prompt user for seconds
	convert hours and minutes to seconds
	display the sum of the three values
*/
package CH2;

import java.util.Scanner;

public class Seconds {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Number of hours: ");
		int hours = keyboard.nextInt();
		System.out.print("Number of minutes: ");
		int minutes = keyboard.nextInt();
		System.out.print("Number of seconds: ");
		int seconds = keyboard.nextInt();
		int shours = (hours*3600);
		int sminutes = (minutes*60);
		int sheconds = (seconds + sminutes + shours);
		System.out.println("Total seconds: " + sheconds );
		keyboard.close();
	}

}
/* output:

Number of hours: 1
Number of minutes: 1
Number of seconds: 2
Total seconds: 3662

Number of hours: 1
Number of minutes: 45
Number of seconds: 0
Total seconds: 6300

Number of hours: 0
Number of minutes: 6
Number of seconds: 0
Total seconds: 360

*/