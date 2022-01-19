package chapter7_ClassesAndObjects;

// 4. Design and implement a program that performs in the following way:

public class Q4_BankAccount {
	
	public static void main(String[] args)
	{
		String account = "000000";
		char choice = '0';
		boolean exists = false;
	
	 // When the program starts, two bank accounts are created, using names and numbers 
	 // which are written into the code;
			
		BankAccount[] accountList = new BankAccount[2];
		
		accountList[0] = new BankAccount("12345", "Jim Henson");
		accountList[1] = new BankAccount("12346", "Betty White");
		
	//  The user is then asked to enter an account number, followed by an amount to
	//	deposit in that account;	
		
		do
		{
			System.out.println("Please enter an account number: ");
			String accountInput = EasyScanner.nextString();
			
			// need to find out if the account exists first
			for (BankAccount item : accountList)
			{
				if (account.equals(accountInput))
				{
					account = item.getAccountNumber();
					exists = true;
				}

			}
			
			System.out.println(account);
			System.out.println(exists);
			
			

		//  The balance of the appropriate account is then updated accordingly—or if an
		//	incorrect account number was entered a message to this effect is displayed;	
		
	
			if(exists)
			{
				for (BankAccount item : accountList)
				{
					account = item.getAccountNumber();
					if (account.equals(accountInput))
					{
							System.out.println("Please enter amount to deposit: ");
							double amountInput = EasyScanner.nextDouble();
							item.deposit(amountInput);
							System.out.println("Your balance is: " + item.getBalance());				
					} 
				}				
			}

		// The user is then asked if he or she wishes to make more deposits;

		System.out.println("Would you like to make more deposits? Y/N");
		choice = EasyScanner.nextChar();
			
		} while (choice == 'Y' || choice == 'y');
		
		for (BankAccount item : accountList)
		{
			System.out.print("\n\nAccount Number " + item.getAccountNumber()
				+ "\nAccount Name " + item.getAccountName()
				+ "\nBalance " + item.getBalance()
			);
			
		}
		
		System.out.println("\nGoodbye!");

	}
	
}
