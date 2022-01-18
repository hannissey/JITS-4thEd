package chapter7_ClassesAndObjects;

public class Q2_CodeName {
	public static void main(String[] args)
	{
		String codeName, confirm;
		boolean match, beginsWith = false;
		char endOf = 'a';
		
		// (a) Prompt to get the user to enter a suitable name into the codeName string;
		System.out.println("Please enter a suitable agent name: ");
		codeName = EasyScanner.nextString();			
		
		/*
		 * (b) Use a while loop to ensure that the string entered is greater than 6
		 * characters in length, if it is not print “INVALID CODENAME” and ask the user
		 * to re-enter a code name;
		*/
		while (codeName.length() < 6)
		{
			System.out.println("INVALID CODENAME");
			System.out.println("Please enter a suitable agent name: ");
			codeName = EasyScanner.nextString();
		}
		
		/*
		 * (d) Use the charAt method to ensure that the code name ends with an ‘X’
			character;
		 */
		
		System.out.println("Starting conditions " + beginsWith + " " + endOf);
		
		while(!beginsWith && endOf != 'X')
		{
			System.out.println("Your agent name must start with Agent.");
			System.out.println("Please enter your agent name prefixed with Agent: ");
			System.out.println("Your Agent name must end with an X");
			System.out.println("Please enter an agent name with an X on the end: ");
			codeName = EasyScanner.nextString();
			
			endOf = codeName.charAt(codeName.length()-1);
			beginsWith = codeName.startsWith("Agent");
			
			System.out.println(beginsWith + " " + endOf);
			
		}
		
		/*
		 * (e) Finally use the startsWith method to ensure that, as well as being
			greater than 6 characters in length, the code name entered also starts with the
			words “Agent”
		 */
		
		
		/*
		 * (c) Once a valid code name has been entered ask the user to re-enter the code
			name into the confirm string and then use an if else statement to ensure
			that the string entered matches the original code name; if it does, print a
			message “CODE NAME CONFIRMED” otherwise print a message saying
			“CODE NAME MIS-MATCH”;
		 */
		
		do {
			System.out.println("Please confirm your agent name: ");
			confirm = EasyScanner.nextString();
			
			match = codeName.equals(confirm);
			if(match)
			{
				System.out.println("CODE NAME CONFIRMED");
			}
			else
			{
				System.out.println("CODE NAME MIS-MATCH");
			}		
			
		} while (!match);
		

		
		

			
		
		


		
		
		
	}
}
