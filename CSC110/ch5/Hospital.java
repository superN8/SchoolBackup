/*
Name: Nathan DeLano
Date: 3/8/18
Program Name: HospitalEmployee
Class: CSC110
Pseudocode:
	designed to test the HospitalEmployee Class
*/

package ch5;

import java.text.NumberFormat;

public class Hospital
{
	public static void main(String [] args)
	{
		NumberFormat cfmt = NumberFormat.getCurrencyInstance();
		//create a HospitalEmployee called worker1
		HospitalEmployee worker1 = new HospitalEmployee();
		//display the state of object worker1 using the toString method
		System.out.println("Welcome to our Hospital!\n\n"
						  +"Beginning state of worker1:");
		System.out.println(worker1.toString()+"\n");
		//set the pay rate of worker1 to 20.00 using the setPayRate method
		worker1.setPayRate(20);
		//display the state of object worker1 using the toString method
		System.out.println("After pay rate is set:");
		System.out.println(worker1.toString()+"\n");
		//change/increase the pay rate of worker1 by 4.50 using the changePayRate method
		worker1.changePayRate(4.5);
		//change/increase the hours worked of worker1 by 30 using the changeHoursWorked method
		worker1.changeHoursWorked(30);
		//display the state of worker1 using the toString method
		System.out.println("After pay rate and hours worked increase:");
		System.out.println(worker1.toString()+"\n");
		//display the name and gross pay of worker1 using getEmpName and calculateGrossPay methods.
		System.out.println("Employee "+worker1.getEmpName()+" earned "
					      +cfmt.format(worker1.calculateGrossPay())+"\n");
		//display the name, bonus, and total earnings of worker1. Use the calculateBonus method when
		System.out.println("After bonus: "+worker1.getEmpName()
						  +" received a bonus of "
						  +cfmt.format(  worker1.calculateBonus("excellent") )
						  +" and earned a total of "
						  +cfmt.format( ( worker1.calculateBonus("excellent") + worker1.calculateGrossPay() ) ) );
		//calculating the bonus for worker1. worker1 is an excellent employee.
		System.out.println("\n=================================\n\n"
						  +"Creating another Hospital Employee");
		HospitalEmployee worker2 = new HospitalEmployee("Sue Smart",1122,0,10.5);
		System.out.println("\nState of worker1: "+worker1.toString()
						  +"\n\nState of worker2: "+worker2.toString()
						  +"\n\nState of workers after worker2 pay rate and hours worked reset.");
		worker2.setPayRate(12.25);
		worker2.setHoursWorked(15);
		worker2.setPayRate(-10.5);
		System.out.println("\nState of worker1: "+worker1.toString()
		  				  +"\n\nState of worker2:"+worker2.toString()
		  				  +"\n\nEmployee "+worker2.getEmpName()+" earned "
					      +cfmt.format(worker2.calculateGrossPay())+"\n\n"
					      +"After Bonus: "+worker2.getEmpName()+" received "
					      +"a bonus of "+cfmt.format(worker2.calculateBonus())+"\n\n"
					      +"Number of HospitalEmployees Created: "
					      +HospitalEmployee.getHospitalEmployeeCount()
					      +"\n\nGoodBye");
	}
	
}

/*
output:
Welcome to our Hospital!

Beginning state of worker1:
Employee: Nate empNumber: 9999 hoursWorked: 0.0 payRate: $0.00

After pay rate is set:
Employee: Nate empNumber: 9999 hoursWorked: 0.0 payRate: $20.00

After pay rate and hours worked increase:
Employee: Nate empNumber: 9999 hoursWorked: 30.0 payRate: $24.50

Employee Nate earned $735.00

After bonus: Nate received a bonus of $500.00 and earned a total of $1,235.00
*/
