package chapter9_Inheritance;

public class BankAccount {

	private String accountNumber;
	private String accountName;
	protected double balance;
	
	public BankAccount(String accountNumberIn, String accountNameIn)
	{
		accountNumber = accountNumberIn;
		accountName = accountNameIn;
		balance = 0;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getAccountName()
	{
		return accountName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double depositIn)
	{
		balance = depositIn + balance;
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
