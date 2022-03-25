/*
Name: Nathan DeLano
Date:2/7/18
Program Name: UsernameGenerator
Class: CSC110
Pseudocode:
	prompt user for first name
	prompt user for last name
	prompt user for birth year
	generate a username in the format: [1st two characters of first name] 
									+ [length of the first name] + [full last name]
									+ [random number 50-75]
	generate a username in the format: [1st character of first name] 
									+ [full last name] + [last two digits of birth year] 
									+ [random number 1-100]
	generate a username in the format: [1st three characters of last name] 
									+ [1st two digits of birth year] + [full first name] 
									+ [random number 1000 – 2000]
*/
package ch3;
	import java.util.Scanner;
	import java.util.Random;
public class UsernameGenerator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random gen = new Random();
		System.out.print("Super Name Generator!"+"\nFirst Name: ");
		String fName = keyboard.nextLine();
		System.out.print("Last Name: ");
		String lName = keyboard.nextLine();
		System.out.print("Birth Year: ");
		String year = keyboard.nextLine();
		int number1 = gen.nextInt(25)+50;
		int number2 = gen.nextInt(100)+1;
		int number3 = gen.nextInt(1000)+1000;
		System.out.print("\nHere are some generated names!\n"
						+fName.substring(0, 2)+fName.length()+lName+number1+"\n"
						+fName.charAt(0)+lName+year.substring(2,4)+number2+"\n"
						+lName.substring(0, 3)+year.substring(0,2)+fName+number3
						);
		
		keyboard.close();
	}

}
/*
Output:
Super Name Generator!
First Name: Nathan
Last Name: DeLano
Birth Year: 1997

Here are some generated names!
Na6DeLano61
NDeLano9750
DeL19Nathan1753
*/
