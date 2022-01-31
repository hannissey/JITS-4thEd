package chapter9_Inheritance;

import java.util.Scanner;
public class PartTimeEmployeeTester {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboardString = new Scanner(System.in);
		String number, name;
		double pay;
		int hours;
		PartTimeEmployee emp;
		
		// get details from the user
		System.out.println("Employee Number?");
		number = keyboardString.nextLine();
		System.out.println("Employee's Name?");
		name = keyboardString.nextLine();
		System.out.println("Hourly pay?");
		pay = keyboard.nextDouble();
		System.out.println("Hours worked this week?");
		hours = keyboard.nextInt();
		
		// create a new part time employee
		emp = new PartTimeEmployee(number, name, pay);
		
		// display part-time employee's details, including weekly pay
		System.out.print("Employee Details: " + "\n"
				+ "Name: " + emp.getName() + "\n"
				+ "Number: " + emp.getNumber() + "\n"
				+ "Weekly Pay: £" + emp.calculateWeeklyPay(hours) + "\n\n"
				);
	}
}
