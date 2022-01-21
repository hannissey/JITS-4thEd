package chapter8_ImplementingClasses;

public class BankAccount2 {
	
	// attributes
	private String accountNumber;
	private String accountName;
	private double balance;
	private static double interestRate;
	
	// user defined constructor 1
	public BankAccount2(String numberIn, String nameIn)
	{
		accountNumber = numberIn;
		accountName = nameIn;
		balance = 0;
	}
	
	// methods
	public String getAccountName()
	{
		return accountName;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amountIn)
	{
		balance = balance + amountIn;
	}
	
	public boolean withdraw(double amountIn)
	{
		if(amountIn > balance)
		{
			return false;
		}
		else
		{
			balance = balance - amountIn;
			return true;
		}
	}
	
	// our static methods concerning interest rate
	public static void setInterestRate(double rateIn)
	{
		interestRate = rateIn;
	}
	
	public static double getInterestRate()
	{
		return interestRate;
	}
	
	public void addInterest()
	{
		balance = balance + (balance * interestRate)/100;
	}
	
	
	
}
