package chapter5_Methods;

import java.util.Scanner;

public class TimetableWithLoop {
	public static void main(String[] args)
	{
		char group, response;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("*** Lab Times ***");
		do // put code in loop
		{
			// offer menu of options
			System.out.print("[1] TIME FOR GROUP A"
					+ "\n[2] TIME FOR GROUP B"
					+ "\n[3] TIME FOR GROUP C"
					+ "\n[4] QUIT PROGRAM"
					+ "\nEnter choice [1, 2, 3 or 4]: "		
			);
			response = keyboard.next().charAt(0); // get response
			
			switch(response)
			{
			case '1' :
				System.out.println("10.00am\n");
			break;
			case '2' :
				System.out.println("1.00pm\n");
			break;
			case '3' :
				System.out.println("11.00am\n");
			break;
			case '4' :
				System.out.println("Goodbye.\n");
			break;
			default :
				System.out.println("Options 1-4 only.\n");
			}
		} while (response !='4');
	}
}
