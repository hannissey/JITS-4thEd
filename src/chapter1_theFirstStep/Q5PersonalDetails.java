package chapter1_theFirstStep;

public class Q5PersonalDetails 
{	
	public static void main(String[] args) 
	{
		// Printing each statement to a new line
		System.out.println("My name is Candy Cane,");
		System.out.println("I live on Gingerbread Lane,");
		System.out.println("Giving you my number I shall refrain.");
		System.out.println();
		
		// Using concatenation, with no line breaks
		System.out.print
		(
			"My name is Candy Cane, " 
			+ "I live on Gingerbread Lane, "
			+ "Giving you my number I shall refrain."
		);
		
		// Using concatenation, with line breaks \n
		System.out.print
		(
			"\n\nMy name is Candy Cane, " 
			+ "\nI live on Gingerbread Lane, "
			+ "\nGiving you my number I shall refrain."
		);
	}
}
