package chapter8_ImplementingClasses;

public class ParameterTest {
	public static void main(String[] args)
	{
		// create new bank account
		BankAccount2 testAccount = new BankAccount2("1", "Ann T Dote");
		// send test account to test method
		test(testAccount); 
		// print account details
		System.out.print(
				"Account Number: " + testAccount.getAccountNumber() + "\n" +
				"Account Name: " + testAccount.getAccountName() + "\n" +
				"Balance: £" + testAccount.getBalance()
 		);
	}
	
	
	static void test(BankAccount2 accountIn)
	{
		accountIn.deposit(2500);
	}
}
