package chapter7_ClassesAndObjects;

public class BankAccountTester {

	public static void main(String[] args)
	{
		double amount;
		boolean ok;
		
		BankAccount account1 = new BankAccount("000001", "Susan Richards");
		
		System.out.print("Enter amount to deposit: ");
		amount = EasyScanner.nextDouble();
		account1.deposit(amount);
		System.out.print("Deposit was made: " 
			+ "\nBalance = " + account1.getBalance()
			+ "\n"				
		);
		
		System.out.print("Enter amount to withdraw: ");
		amount = EasyScanner.nextDouble();
		// this assigns the result of the method withdraw() to the variable ok
		// because withdraw returns a boolean, we use an if statement to determine
		// what is displayed to the user, so if(ok) basically means "if ok is equal to
		// true". The else is the opposite to this, therefore false.
		// We don't need to put if (ok == true) as if(ok) is true by default
		ok = account1.withdraw(amount);
		if(ok)
		{
			System.out.println("Withdrawal made");
		} 
		else
		{
			System.out.println("Insufficient funds");
		}
		System.out.println("Balance = " + account1.getBalance());
		System.out.println();
	}
	
}
