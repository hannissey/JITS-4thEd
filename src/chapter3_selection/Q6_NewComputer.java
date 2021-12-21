package chapter3_selection;

/*
 * BEGIN
 * 	DISPLAY program name
 *  DISPLAY cost for basic system
 *  ADD cost for basic system to total
 *  DISPLAY choice of screen size
 *  DISPLAY prompt for choice of screen size
 *  SET screen size choice to input
 *  ADD screen size price to total
 *  DISPLAY choice of optional extras
 *  DISPLAY add printer prompt, Y or N
 *  SET extra1 to input
 *  IF extra1 = Y, add printer to total
 *  ELSE add antivirus prompt, Y or N
 *  IF extra2 = Y, add antivirus to total
 *  ELSE display total
 * END
 *  
 *  		
 */
import java.util.Scanner;

public class Q6_NewComputer {
	public static void main(String[] args) {
		
		double total = 375.99;
		double screen38cm = 75.99;
		double screen43cm = 99.99;
		double antivirus = 65.99;
		double printer = 125.00;
		int screenSize;
		char extra1;
		char extra2;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Computer World!");
		System.out.println("Our basic system is £375.99. "
				+ "What screen size would you like with that? We have 38cm or 43cm.");
		screenSize = keyboard.nextInt();
		if (screenSize == 38) {
			total = total + screen38cm;
			System.out.println("You have chosen the 38cm screen."
					+ "Your total is now: £" + total);
		} else if (screenSize == 43) {
			total = total + screen43cm;
			System.out.println("You have chosen the 43cm screen."
					+ "Your total is now: £" + total);
		} else {
			System.out.println("Sorry, we do not offer that screen size.");
		}
		System.out.println("We have optional extras for you, antivirus software and/or a printer."
				+ " Would you like the antivirus? Y or N");
		extra1 = keyboard.next().charAt(0);
		if (extra1 == 'Y') total = total + antivirus;
		System.out.println("Would you like the printer?");
		extra2 = keyboard.next().charAt(0);
		if (extra2 == 'Y') total = total + printer;
		System.out.println("Thank you for shopping with us, your total to pay is £" + total);
		
		
	}
}
