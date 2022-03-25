/* Class Name: The BankAccount class - UPDATE 3
   Author:  P Baker / P Jalowiec
	Date : 2011
	Brief Description:

    Add overloaded methods.  constructor and withdraw
	 
    Add static variable count to count the number of objects created
	 Add static method getCount to return the count
    
 */
package ch5;
import java.text.NumberFormat;  //using currency format in toString

class BankAccount 
{

    private static int count = 0;   //class to count accounts
  
	 private int acctNumber;
    private double balance;
    private String name;
	 
	 
    
    /* constructs a bank account with zero balance and account number,
       and Unknown name
     */

    public BankAccount() 
	 {
		 acctNumber = 0;
		 balance = 0.0;
		 name = "Unknown";
		 
		 count++;
	 }
	 
	 /*constructs a bank account with an account number, initial balance, and owner*/
	 public BankAccount(int acctNo, double initBalance, String owner)
	 {
	  	 acctNumber =acctNo;
		 balance = initBalance;
		 name = owner;
		 
		 count++;
	 }

 	

    //all of the mutator methods - set

    public void setAcctNumber(int acct)
	 {
		    acctNumber = acct;
    }

 	//not appropriate.  would not want to reset a balance  
	/*public void setBalance(double amount)
	 {
	    balance = amount;
    }*/
   
    public void setName(String owner)
	 {
		name = owner;
    }

	//all of the accessor methods - get
   
	 public int getAcctNumber()
	 {
	    return acctNumber;
    }

    public double getBalance()
	 {
        return balance;
    }

    public String getName()
	 {
	    return name;
    }

    //other methods
	 
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount) 
	 {
        balance = balance - amount;
    }
	 
	 //overloaded method.  charges a fee!
	 public void withdraw(double amount, double fee) 
	 {
        balance = balance - amount - fee;
    }
	 
	 
    public String toString()
    {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
	 	return (" acctNumber: "  + acctNumber +  " balance : " + fmt.format(balance)
			        + " name : " + name  );
	 }
	 
	 //Class method to return the number of accounts created
	 public static int getCount()
	 {
	 	return count;
  	 }

	
}// end of class definition
