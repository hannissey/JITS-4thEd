package chapter8_ImplementingClasses;

import java.util.ArrayList;

import chapter7_ClassesAndObjects.BankAccount;

public class Bank {
	
	ArrayList<BankAccount2> list = new ArrayList<>();
	
	// helper method to find the index of a specified account
	// this will only be used within the Bank class
//	private int search(String accountNumberIn)
//	{
//		for(int i = 0; i <= list.size() -1; i++)
//		{
//			// get the account index
//			BankAccount2 tempAccount = list.get(i);
//			// get account number
//			String tempNumber = tempAccount.getAccountNumber();
//			
//			// if account number is the same as the search parameter, return index
//			if(tempNumber.equals(accountNumberIn))
//			{
//				return i;
//			}
//		}
//	}
	

}
