package chapter8_ImplementingClasses;

import java.util.ArrayList;

public class Q6_Bank 
{

	ArrayList<BankAccount> list = new ArrayList<>();
	
	// helper method to find the index of a specified account
	private int search(String accountNumberIn)
	{
		for(int i = 0; i <= list.size() - 1; i++)
		{
			BankAccount tempAccount = list.get(i); // find the account at index i
			String tempNumber = tempAccount.getAccountNumber(); // get account number
			if(tempNumber.equals(accountNumberIn)) // if this is the account we are looking for...
			{
				return i; // ... return the index
			}
		}
		// if String does not match account number of object
		return -999;
	}
	
	// return the total number of items
	public int getTotal()
	{
		return list.size();
	}
	
	// return an account with a particular account number
	public BankAccount getItem(String accountNumberIn)
	{
		int index = search(accountNumberIn);
		if (index != -999) // check that account exists
		{
			return list.get(index);
		}
		else
		{
			return null;
		}
	}
	
	// add an item to the list
	public boolean addAccount(String accountNumberIn, String nameIn)
	{
		if(search(accountNumberIn) == -999) // check that account does not already exist
		{
			list.add(new BankAccount(accountNumberIn, nameIn));
			return true;
		}
		return false;
	}
	
	// deposit money in a specified account
	public boolean depositMoney(String accountNumberIn, double amountIn)
	{
		BankAccount acc = getItem(accountNumberIn);
		if (acc != null)
		{
			acc.deposit(amountIn);
			return true; // indicate success
		}
		else
		{
			return false; // indicate failure
		}
	}
	
	// withdraw money from a specified account
	public int withdrawMoney(String accountNumberIn, double amountIn)
	{
		BankAccount acc = getItem(accountNumberIn);
		if(acc != null && acc.getBalance() >= amountIn)
		{
			acc.withdraw(amountIn);
			return 1;
		}
		else if(acc == null)
		{
			return 2;
		}
		else if(acc.getBalance() < amountIn)
		{
			return 3;
		}
		return 0;
	}
	
	// remove an account
	public boolean removeAccount(String accountNumberIn)
	{
		int index = search(accountNumberIn); // find index of account
		if(index != -999) // if account exists
		{
			list.remove(index);
			return true; // remove was successful
		}
		else 
		{
			return false; // remove was unsuccessful
		}
	}
	
}
