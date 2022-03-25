/*
Name: Nathan DeLano
Date: 4/5/2018
Program Name:FamousCS
Class: CSC110
Pseudocode: reads from a file and writes to another one
*/

package ch7;

import java.util.Scanner;
import java.io.*;

public class FamousCS 
{

	public static void main(String[] s) throws IOException 
	{
		Scanner inFile = new Scanner(new FileReader("E://MBR2TB//eclipse workspace//CSC110/ch7/names.txt"));
		PrintWriter outFile = new PrintWriter("E://MBR2TB//eclipse workspace//CSC110/ch7/CSReport.txt");
		String line, fName, lName, fameClaim;
		char fInitial;
		int counter=0;
		
		while( inFile.hasNextLine())
		{
			line=inFile.nextLine();
			Scanner tokens = new Scanner(line);
			tokens.useDelimiter(",");
			lName=tokens.next();
			fName=tokens.next();
			fameClaim=tokens.next();
			fInitial=fName.charAt(0);
			line=fInitial+". "+lName+" "+fameClaim+".";
			System.out.println(line);
			outFile.println(line);
			counter++;
			tokens.close();
		}
		System.out.println("There are "+counter+" famous computer scientists in this file");
		outFile.print("There are "+counter+" famous computer scientists in this file");
		inFile.close();
		outFile.close();
	}

}
/*
outut:
J. Gosling is often called the inventor of Java.
E. Dijkstra was the supreme algorithmist - he researched and developed how to solve problems fast.
A. Kay developed the first OO programming language called Smalltalk.
R. Pausch led the team of Carnegie Mellon graduate students that developed the Alice programming language.
A. Turing is often considered the father of modern computer science.
J. Backus developed the Fortran language with his team at IBM.
D. Knuth wrote the ultimate Computer Science comprehensive text called The Art of Computer Programming.
J. McCarthy is famous for his contributions to and coined the term Artificial Intelligence.
G. Hopper was a Navy Admiral who invented the first compiler.
J. von Neumann developed the von Neumann architecture used in virtually every non-parallel processing computer.
A. Lovelace was a mathematician who is credited for writing the first computer program in the 1840's.
There are 11 famous computer scientists in this file
*/
