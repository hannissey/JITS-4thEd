package chapter9_Inheritance;

import java.util.Scanner;

public class GoldAccount extends BankAccount {

	private double overdraftLimit;
	
	public GoldAccount(String accountNumberIn, String accountNameIn, double overdraftLimitIn)
	{
		super(accountNumberIn, accountNameIn);
		overdraftLimit = overdraftLimitIn;
	}
	
	public void setLimit(double overdraftLimitIn)
	{
		overdraftLimit = overdraftLimitIn; 
	}
	
	public double getLimit()
	{
		return overdraftLimit;
	}
	
	public boolean withdraw(double amountOut)
	{
		if(balance >= amountOut)
		{
			balance = balance - amountOut;
			return true;
		}
		return false;		
	}
	
	
}
