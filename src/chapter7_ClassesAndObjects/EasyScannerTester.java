package chapter7_ClassesAndObjects;

public class EasyScannerTester {
	public static void main(String[] args)
	{
		System.out.print("Enter a double: ");
		double d = EasyScanner.nextDouble();
		System.out.print("You entered: " + d + "\n");
		
		System.out.print("\nEnter an integer: ");
		int i = EasyScanner.nextInt();
		System.out.print("You entered: " + i + "\n");
		
		System.out.print("\nEnter a string: ");
		String s = EasyScanner.nextString();
		System.out.print("You entered: " + s + "\n");
		
		System.out.print("\nEnter a character: ");
		char c = EasyScanner.nextChar();
		System.out.print("You entered: " + c + "\n");
	}
	
	
}
