//Program Name: Bank.java - UPDATE 3
//Author:  PBaker /PJalowiec
//Date : 2011
package ch5;
//Brief Description:  Tests our BankAccount class

public class Bank
{
	public static void main( String [ ] args)
	{
		
		System.out.println("Welcome to our Bank\n");
		
		
		//create BankAccount object
		BankAccount myAcct = new BankAccount();
		
		//display the state of object myAcct
		System.out.println("Beginning state of myAcct :" + myAcct.toString() );
	
		//deposit 100.00 in myAcct
		myAcct.deposit(100);
		
		//display the balance in myAcct
		System.out.println("The balance of myAcct after deposit is : " + myAcct.getBalance( ) );
		
		//withdraw 25.00 from myAcct
		myAcct.withdraw(25);		
		
		//display the state of object myAcct
		//implicit toString.  Same as myAcct.toString()
		System.out.println("State of myAcct after deposit and withdraw : " + myAcct ); 
		
		//create BankAccount object called studentAcct
		BankAccount studentAcct = new BankAccount();
		
		//studentAcct should be owned by Sue Student
		studentAcct.setName("Sue Student");
		
		//studentAcct account number should be 1234
		studentAcct.setAcctNumber(1234);
		
		//display the state of object studentAcct
		System.out.println("State of studentAcct :" + studentAcct.toString() );
	
		//deposit 200.00 in studentAcct
		studentAcct.deposit(200);
		
		//withdraw 30.00 from studentAcct
		studentAcct.withdraw(30);
		
		//display the balance in studentAcct
		System.out.println("The balance of studentAcct after deposit/withdraw is : " + studentAcct.getBalance( ) );
		
		//display the state of object myAcct
		System.out.println("State of myAcct: " + myAcct.toString() );
		
		//display the state of studentAcct
		System.out.println("State of studentAcct: " + studentAcct.toString() );

		//****UPDATE 3****		
		
		//create a BankAccount object called teacherAcct
		//use overloaded (new) constructor with account number 4444, balance of 1500, and name James Gosling
		BankAccount teacherAcct = new BankAccount(4444, 1500.00, "James Gosling");
		
		//display the state of object teacherAcct
		System.out.println("State of teacherAcct: " + teacherAcct.toString() );
		
		//withdraw 50.00 from teacherAcct with a 5.00 fee		
		teacherAcct.withdraw(50, 5);
		
		//display the state of object teacherAcct
		System.out.println("State of teacherAcct after withdraw : " + teacherAcct);
		
		//display the number of BankAccount objects created
		//note that static method getCount is invoked by the class BankAccount
		//       not a specific object
		
		System.out.println("\nThe Bank has " + BankAccount.getCount() + " Accounts." );
		
		//EXTRA INFO can get to the object's class 
		System.out.println("\nmyAcct is an object of " + myAcct.getClass()); 
   	System.out.println("myAcct is a  " + myAcct.getClass().getName() + " object" );
		
		//But cannot display the object's name at runtime (such as myAcct) because it 
		//is a reference to an object - it holds a memory address.  An object can have 
		//multiple references to it.
 	
	}


}//end of Bank

/*
Welcome to our Bank
    
    Beginning state of myAcct : acctNumber: 0 balance : $0.00 name : Unknown
    The balance of myAcct after deposit is : 100.0
    State of myAcct after deposit and withdraw :  acctNumber: 0 balance : $75.00 name : Unknown
    State of studentAcct : acctNumber: 1234 balance : $0.00 name : Sue Student
    The balance of studentAcct after deposit/withdraw is : 170.0
    State of myAcct:  acctNumber: 0 balance : $75.00 name : Unknown
    State of studentAcct:  acctNumber: 1234 balance : $170.00 name : Sue Student
    State of teacherAcct:  acctNumber: 4444 balance : $1,500.00 name : James Gosling
    State of teacherAcct after withdraw :  acctNumber: 4444 balance : $1,445.00 name : James Gosling
    
    The Bank has 3 Accounts.
    
    myAcct is an object of class BankAccount
    myAcct is a  BankAccount object

*/