package chapter4_Iteration;

/*
 *	
 * 		PROMPT for mark
		ENTER mark
	BEGIN
		WHILE mark < 0 OR mark > 100:
	  		PROMPT for mark
			ENTER mark		
			DISPLAY error message to user
			ENTER mark
	END
// 	REST OF PROGRAM HERE
 */

import java.util.Scanner;

	public class WhileLoopPseudoCodeToProgram {
		public static void main (String[] args)
		{
			int mark;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("What exam mark did you get?");
			mark = keyboard.nextInt();
			
			while (mark < 0 || mark > 100) {
				System.out.println("Mark not valid. Please re-enter: ");
				//System.out.println("What exam mark did you get?");
				mark = keyboard.nextInt();			
			}
			
			if (mark >= 40)
			{
				// executed when test is true
				System.out.println("Congratulations, you passed!");
			} 
			else 
			{
				// executed when test is false
				System.out.println("I'm sorry, but you failed.");
			}
			System.out.println("Good luck with your other exams.");
		}
}
