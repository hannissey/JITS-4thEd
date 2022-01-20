package chapter7_ClassesAndObjects;

// 4. Design and implement a program that performs in the following way:

public class Q4_BankAccount {
	
	public static void main(String[] args)
	{
		String account = "000000";
		char choice = '0';
		int accountExists = -999;
	
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

		//  The balance of the appropriate account is then updated accordingly—or if an
		//	incorrect account number was entered a message to this effect is displayed;	
		

			for (BankAccount item : accountList)
			{
				account = item.getAccountNumber();

				if (account.equals(accountInput))
				{
					// if string is found in loop of account numbers will return 0
					accountExists = account.compareTo(accountInput);
				}
	
			}	
			
			if(accountExists == 0)
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
			} else if(accountExists == -999) {
				System.out.println("Account does not exist");
			}
	
		// The user is then asked if he or she wishes to make more deposits;

		System.out.println("Would you like to make more deposits? Y/N");
		choice = EasyScanner.nextChar();
			
		} while (choice == 'Y' || choice == 'y');
		
		// If the user does not wish to make more deposits, then details of both accounts
		// (account number, account name and balance) are displayed.
		
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
