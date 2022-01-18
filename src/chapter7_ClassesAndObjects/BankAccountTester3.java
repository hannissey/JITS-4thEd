package chapter7_ClassesAndObjects;

import java.util.ArrayList;

public class BankAccountTester3 {
	public static void main(String[] args)
	{
		// create an array of references
		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		// create three new accounts, referenced by each element in the array
		accountList.add(new BankAccount("123456", "Mick Jagger"));
		accountList.add(new BankAccount("123457", "Colin Firth"));
		accountList.add(new BankAccount("123458", "Kirsty Wark"));

		// make various deposits and withdrawals
		accountList.get(0).deposit(1000);
		accountList.get(2).deposit(150);
		accountList.get(0).withdraw(500);
		
		// print details of all three accounts
		// this remains the same
		for(BankAccount item : accountList)
		{
			System.out.print("Account number: " + item.getAccountNumber()
			+ "\nAccount name: " + item.getAccountName()
			+ "\nCurrent Balance: " + item.getBalance()
			+ "\n\n");			
		}
		
	}
}
