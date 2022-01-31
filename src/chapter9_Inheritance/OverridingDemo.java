package chapter9_Inheritance;

public class OverridingDemo {

	public static void main(String[] args)
	{
		boolean ok;
		// declare a BankAccount object
		BankAccount bankAcc = new BankAccount("123", "Ordinary Account Holder");
		// declare a GoldAccount object (note the additional overdraft parameter)
		GoldAccount goldAcc = new GoldAccount("124", "Gold Account Holder", 500);
		
		bankAcc.deposit(1000);
		goldAcc.deposit(1000);
		
		ok = bankAcc.withdraw(1250); // request to withdraw 1250 out of Bank Account
		if (ok)
		{
			System.out.println("Money withdrawn.");
		}
		else
		{
			System.out.println("Insufficient funds.");
		}
		System.out.print("Balance of " + bankAcc.getAccountName() + " is " + bankAcc.getBalance() + "\n\n");

		ok = goldAcc.withdraw(1250); // request to withdraw 1250 out of Gold Account
		if (ok)
		{
			System.out.println("Money withdrawn.");
		}
		else
		{
			System.out.println("Insufficient funds.");
		}
		System.out.print("Balance of " + goldAcc.getAccountName() + " is " + goldAcc.getBalance() + "\n\n");
		
	}
}
