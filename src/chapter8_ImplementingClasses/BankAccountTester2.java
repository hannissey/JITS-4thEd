package chapter8_ImplementingClasses;

public class BankAccountTester2 {
	public static void main(String[] args)
	{
		//create bank accounts
		BankAccount2 account1 = new BankAccount2("99786754", "Gayle Forcewind");
		BankAccount2 account2 = new BankAccount2("99887776", "Stan Dandy-Liver");
		
		// make a deposit into accounts
		account1.deposit(200);
		account2.deposit(500);
		
		// set interest rate
		// notice as this is a static method we can use the class to call it
		BankAccount2.setInterestRate(10);
		
		// you can call static method on specific class object, it will update all objects
		account2.setInterestRate(20);
		
		// add interest to accounts
		account1.addInterest();
		account2.addInterest();
		
		// display account details
		System.out.print("*** Account Details ***"+ "\n\n" +
				"Account number: " + account1.getAccountNumber() + "\n" +
				"Account name: " + account1.getAccountName() + "\n" +
				"Interest Rate: " + BankAccount2.getInterestRate() + "%\n" + 
				"Current Balance: £" + account1.getBalance() + "\n\n"
				);
		
		System.out.print("*** Account Details ***"+ "\n\n" +
				"Account number: " + account2.getAccountNumber() + "\n" +
				"Account name: " + account2.getAccountName() + "\n" +
				"Interest Rate: " + BankAccount2.getInterestRate() + "%\n" + 
				"Current Balance: £" + account2.getBalance() + "\n\n"
				);		
		
		
	}
}
