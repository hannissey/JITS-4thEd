package chapter8_ImplementingClasses;

public class Q6_BankApplication {

	public static void main(String[] args)
	{
		char choice;
		
		Q6_Bank myBank = new Q6_Bank();
		
		// offer menu
		do
		{
			System.out.print("*** Welcome to BankelBanksden Bank ***" + "\n\n"
					+ "1. Create new account" + "\n"
					+ "2. Remove an account" + "\n"
					+ "3. Deposit money" + "\n"
					+ "4. Withdraw money" + "\n"
					+ "5. Check account details" + "\n"
					+ "6. Quit" + "\n\n"
					+ "Enter choice [1-6]" + "\n"
			);
			
			// get choice
			choice = EasyScanner.nextChar();
			
			// process menu options
			switch (choice)
			{
				case '1' : option1(myBank);
				break;
				case '2' : option2(myBank);
				break;
				case '3' : option3(myBank);
				break;
				case '4' : option4(myBank);
				break;
				case '5' : option5(myBank);
				break;
				case '6' : System.out.println("Goodbye!");
				break;
				default : System.out.println("Invalid entry");
			}
			
		} while(choice != '6');
		
	}
		
		// add account
		static void option1(Q6_Bank bankIn)
		{
			// get details from user
			System.out.print("Enter account number: ");
			String number = EasyScanner.nextString();
			System.out.print("Enter account name: ");
			String name = EasyScanner.nextString();
			// add account to list
			boolean success = bankIn.addAccount(number, name);
			if(success)
			{
				System.out.println("Account added." + "\n\n");
			}
			else
			{
				System.out.println("Account number already exists." + "\n\n");
			}
		}
		
		// remove account
		static void option2(Q6_Bank bankIn)
		{
			// get account number of account to remove
			System.out.print("Enter account number: ");
			String number = EasyScanner.nextString();
			// delete item if it exists
			boolean found = bankIn.removeAccount(number);
			
			if(found)
			{
				System.out.println("Account removed.");
			}
			else
			{
				System.out.println("No such account number.");
			}
		}
		
		// deposit money in an account
		static void option3(Q6_Bank bankIn)
		{
			// get details from user
			System.out.print("Enter account number: ");
			String number = EasyScanner.nextString();
			System.out.print("Enter amount to deposit: ");
			double amount = EasyScanner.nextDouble();
			
			boolean found = bankIn.depositMoney(number, amount);
			
			if(found)
			{
				System.out.println("Money deposited.");
			}
			else
			{
				System.out.println("No such account.");
			}
		}
	
		// withdraw money from an account
		static void option4(Q6_Bank bankIn)
		{
			// get details from user
			System.out.println("Enter account number: ");
			String number = EasyScanner.nextString();
			System.out.print("Enter amount to withdraw: ");
			double amount = EasyScanner.nextDouble();
			
			int withdrawStatus = bankIn.withdrawMoney(number, amount);
			
			switch (withdrawStatus)
			{
				case 0 : System.out.println("Test");
				case 1 : System.out.println("Money withdrawn.");
				break;
				case 2 : System.out.println("No such account.");
				break;
				case 3 : System.out.println("Insufficient funds.");
				break;
				default : System.out.println("An error occurred");
			}
		}
		
		// check account details
		static void option5(Q6_Bank bankIn)
		{
			// get details from user
			System.out.print("Enter account number: ");
			String number = EasyScanner.nextString();
			
			BankAccount account = bankIn.getItem(number);
			
			if(account != null)
			{
				System.out.println("Account number: " + account.getAccountNumber());
				System.out.println("Account name: " + account.getAccountName());
				System.out.println("Balance: " + account.getBalance());
			}
			else
			{
				System.out.println("No such account");
			}
		}
}
