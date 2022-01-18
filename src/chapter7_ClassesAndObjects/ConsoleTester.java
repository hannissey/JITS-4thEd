package chapter7_ClassesAndObjects;

import java.io.Console;

public class ConsoleTester {
	public static void main(String[] args)
	{
		System.out.println("Console Tester");
		Console con = System.console();
		
		String name = "Vanessa";
		// Below line throws error, unsure why
		// name = con.readLine("Please enter your name: ");
		System.out.println("Hello " + name);
	}
}
