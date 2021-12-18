package chapter3_selection;

import java.util.Scanner;

public class CinemaTicket 
{
	public static void main(String[] args)
	{
		double price = 10.00;
		int age;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();
		// code to reduce ticket price for children goes here
		if (age < 14) price = price * 0.5;
		System.out.println("Ticket price = " + price);
	}
}
