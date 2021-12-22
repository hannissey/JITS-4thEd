package chapter4_Iteration;

import java.util.Scanner;

public class Q9_VendingMachine {

	public static void main(String[] args)
	{
		char choice = '0';
		int gum = 0, chocolate = 0, popcorn = 0, juice = 0;

		do {
			System.out.print("Hello!"
					+ "\nSnack Machine Menu"
					+ "\n[1] Get Gum"
					+ "\n[2] Get Chocolate"
					+ "\n[3] Get Popcorn"
					+ "\n[4] Get Juice"
					+ "\n[5] Display total so far"
					+ "\n[6] Quit"
					
					);		
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("\nWhat would you like to do?");
			choice = keyboard.next().charAt(0);
			
//			while ()
//			{
//				System.out.println("Error, options 1-6 only!");
//				System.out.println("\nWhat would you like to do?");
//				choice = keyboard.next().charAt(0);
//			}
			
			switch (choice)
			{
				case '1' :
					System.out.println("Here is your gum.");
					gum++;
				break;
				case '2' :
					System.out.println("Here is your chocolate.");
					chocolate++;
				break;
				case '3' :
					System.out.println("Here is your popcorn.");
					popcorn++;
				break;
				case '4' :
					System.out.println("Here is your juice.");
					juice++;
				break;
				case '5' :
					System.out.print("Your basket currently holds: \n"
							+ gum + " items of gum\n"
							+ chocolate + " items of chocolate\n"
							+ popcorn + " items of popcorn\n"
							+ juice + " items of juice");
					System.out.println();
				case '6' :
					break;
				default : 
					System.out.println("Error, options 1-6 only!");
			}
				
		} while (choice != '6');
		System.out.println("Hope to see you again soon!");
	}

	
}
