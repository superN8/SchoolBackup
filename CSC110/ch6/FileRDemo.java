
package ch6;
//Program Name : FileRDemo.java  Student starting File for Files Activity 1
//               Example of Reading from a file
//Author : P Baker
//Date : 
//Brief Description:  We will use this starting file to show an example
//                    of reading and writing to stream files.
//
//IOExceptions are checked exceptions.  So either must catch or list
//in method header.  We chose the later.
//
//Using Eclipse note:  Create a Java package under src.  All files must be
//                     inside the same Java package.  In my example
//                     I created a package called ch10Files.  So the path 
//                     for all files will be src/ch10Files/~~~~

import java.io.*; //needed for FileReader
import java.text.DecimalFormat;
import java.util.Scanner;


public class FileRDemo {

	public static void main(String[] s) throws IOException 
	{
		//declare and instantiate the input file object and open the file
		Scanner inFile = new Scanner(new FileReader("E://MBR2TB//eclipse workspace//CSC110/ch6/StudentGrades.txt"));
		PrintWriter outFile = new PrintWriter("E://MBR2TB//eclipse workspace//CSC110/ch6/GradeReport.txt");
		DecimalFormat dFmt = new DecimalFormat("0.##");
			
		String line, name; //variable to put each line as read
		int exam1,exam2,exam3;
		double average;
		/*use while because don't know how many lines in the file
		  hasNextLine returns false when the end of the file is reached. */
		line="Java Class Grade Report\n--------------------\n";
		System.out.println(line);
		outFile.println(line);
		while ( inFile.hasNextLine())
		{
				//read a line of text from the file
				line=inFile.nextLine();
				Scanner tokens = new Scanner(line);
				tokens.useDelimiter(",");
				name= tokens.next();
				exam1=tokens.nextInt();
				exam2=tokens.nextInt();
				exam3=tokens.nextInt();
				average=((double) exam1+exam2+exam3)/3;
				
				String firstName,lastName;
				Scanner spaceFinder = new Scanner(name);
				spaceFinder.useDelimiter(" ");
				firstName = spaceFinder.next();
				char firstInitial = firstName.charAt(0);
				lastName = spaceFinder.next();
				//write the same line back out to the console - we aren't doing anything too fancy here
				line=firstInitial+". "+lastName+" has an exam average of "+dFmt.format(average);
				System.out.println(line);
				outFile.println(line);
				tokens.close();
				spaceFinder.close();
		}
	    //close the file
		inFile.close();
		outFile.close();
		
	}
}

/*Expected Output - nothing too fancy.  Just displaying what was read from the input file
Donald Duck,90,80,90
Minnie Mouse,90,98,92
Homer Simpson,60,70,75
*/