package chapter7_ClassesAndObjects;

public class BankAccountTester2 {
	public static void main(String[] args)
	{
		// create an array of references
		// this creates references only, not objects
		BankAccount[] accountList = new BankAccount[3];
		
		// prints out null, as objects have not yet been created
		System.out.println(accountList[0]);
		
		// create three new accounts, referenced by each element in the array
		accountList[0] = new BankAccount("123456", "Mick Jagger");
		accountList[1] = new BankAccount("123457", "Colin Firth");
		accountList[2] = new BankAccount("123458", "Kirsty Wark");
		
		// make various deposits and withdrawals
		// to call a method on an array object, we use the dot operator after the
		// array index specification
		accountList[0].deposit(1000);
		accountList[1].deposit(150);
		accountList[2].withdraw(500);
		
		// print details of all three accounts
		// we are dealing with an array of BankAccount objects, therefore we need to
		// specify this data type in the enhanced for loop
		for(BankAccount item : accountList)
		{
			System.out.print("Account number: " + item.getAccountNumber()
			+ "\nAccount name: " + item.getAccountName()
			+ "\nCurrent Balance: " + item.getBalance()
			+ "\n\n");
		}
	}
}
