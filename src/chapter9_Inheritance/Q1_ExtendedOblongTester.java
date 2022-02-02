package chapter9_Inheritance;

import java.util.Scanner;

public class Q1_ExtendedOblongTester {

	public static void main(String[] args)
	{
		char symbol;
		double length, height;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter length: ");
		length = keyboard.nextDouble();
		System.out.println("Please enter height: ");
		height = keyboard.nextDouble();
		System.out.println("What symbol would you like to use?");
		symbol = keyboard.next().charAt(0);
		
		ExtendedOblong myOblong = new ExtendedOblong(length, height, symbol);
		
		System.out.println(myOblong.draw());
		
		System.out.println("Which symbol would you like to use?");
		symbol = keyboard.next().charAt(0);
		myOblong.setSymbol(symbol);
		
		System.out.println(myOblong.draw());
		
		
		
	}
}
