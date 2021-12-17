package chapter3_selection;

import java.util.Scanner;

public class TimetableWithSwitch {
	public static void main(String[] args)
	{
		char group;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("*** Lab Times ***");
		System.out.println("Enter your group (A, B, C, D or E)");
		group = keyboard.next().charAt(0);
		
		switch (group) {
			case 'A' :
				System.out.println("10.00am");
				break;
			case 'B' :
				System.out.println("1.00pm");
				break;
			case 'C' :
				System.out.println("11.00am");
				break;
			case 'D' : case 'E' :
				System.out.println("This is an example of grouped cases.");
				break;
			default :
				System.out.println("No such group.");	
		}
		
	}
}
