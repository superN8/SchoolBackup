/*
Name: Nathan DeLano
Date: 3/8/18
Program Name: HospitalEmployee
Class: CSC110
Pseudocode:
	create a class to determine hours worked and 
	pay of a hospital employee
*/

package ch5;

import java.text.NumberFormat;

class HospitalEmployee 
{
	NumberFormat cfmt = NumberFormat.getCurrencyInstance();
	private static int hospitalEmployeeCount = 0;
	private String empName;
	private int empNumber;
	private double hoursWorked, payRate;
	public HospitalEmployee()// default constructor. Assigns instance variables a default value.
							// empName to your name,, empNumber to 9999, hoursWorked to 0 , payRate to 0
	{
		empName = "Nate";
		empNumber = 9999;
		hoursWorked = 0;
		payRate = 0;
		hospitalEmployeeCount++;
	}
	public HospitalEmployee(String eName, int eNumber, double hours, double pay)
	{
		empName = eName;
		empNumber = eNumber;
		hoursWorked = hours;
		payRate = pay;
		hospitalEmployeeCount++;
	}
	
	public String getEmpName() // returns the employee’s name
	{
		return empName;
	}
	public int getEmpNumber() // returns the employee’s number
	{
		return empNumber;
	}
	public double getHoursWorked( ) // returns the hours an employee worked
	{
		return hoursWorked;
	}
	public double getPayRate( ) // returns the employee’s pay rate
	{
		return payRate;
	}
	public void setEmpName(String eName) // sets the name for this employee
	{
		empName = eName;
	}
	public void setEmpNumber(int eNumber) // sets the employee number for this employee
	{
		empNumber = eNumber;
	}
	public void setHoursWorked(double hours) // sets the hours worked for this employee
	{
		if(hours>=0)
		{
		hoursWorked = hours; 
		}
	}		
	public void setPayRate(double pay) // sets the pay rate for this employee
	{
		if(pay>=0)
		{
		payRate = pay;
		}
	}
	public double calculateGrossPay( ) // calculates and returns the employee’s gross pay (hours worked * pay rate)
	{
		return (hoursWorked*payRate);
	}
	public void changeHoursWorked(double hours) // changes the instance variable hoursWorked by the hours .
	{
		hoursWorked = (hoursWorked + hours);
	}
	 // hoursWorked should be updated to hoursWorked + hours.
	public void changePayRate(double amount) // changes the instance variable payRate by the amount.
	{
		payRate = (payRate+ amount);
	}
	 // payRate should be updated to payRate + amount.
	public double calculateBonus(String rating) // returns 500 if rating is “excellent”
	 // returns 300 if rating is “satisfactory”
	 // All other ratings return 0
	{
		if (rating.equals("excellent"))
		{
			return 500;
		}
		else if (rating.equals("satisfactory"))
		{
			return 300;
		}
		else
		{
			return 0;
		}
	}
	public double calculateBonus()
	{
		double overTimeBonus=(hoursWorked-40)*((3/2)*payRate);
		if(overTimeBonus>0)
		{
			return overTimeBonus;
		}
		return 0;
	}
	public String toString() // returns the current state of this employee as a String
	{
		
		return ("Employee: "+empName+" empNumber: "+empNumber+" hoursWorked: "+hoursWorked+" payRate: "+cfmt.format(payRate));
	}
	 // (current values of all instance variables is called the current state)
	public static int getHospitalEmployeeCount()
	{
		return hospitalEmployeeCount;
	}
}
