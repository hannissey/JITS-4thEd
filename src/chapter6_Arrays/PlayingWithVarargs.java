package chapter6_Arrays;

public class PlayingWithVarargs {
	public static void main(String[] args)
	{
		System.out.println("Display multiple arguments as an array");
		varargsMethod(1,2,3,4,5,6,7,8,9,10);
		String[] array = printMessage("Hello ", "I ", "am ", "a ", "human ");
		String[] anotherArray = printMessage("yes", "I", "am");
		displayArray(array, anotherArray);
		
	}
	
	static void varargsMethod(int... valuesIn)
	{
		for (int item : valuesIn)
		{
			System.out.println(item);
		}
	}
	
    public static String[] printMessage(String... messages) 
    {
        String[] copiedMessage = messages;
        for (int i = 0; i < messages.length; i++) 
        {
            System.out.print(copiedMessage[i]);
        }
        return copiedMessage;
    }
    
	static void displayArray(String[] arrayIn, String... anotherArrayIn)
	{
		System.out.println("\n*** DISPLAY ARRAY ***\n");
		// display items using enhanced for loop
		for (String item: arrayIn)
		{
			System.out.println(item);
		}
		for (String item: anotherArrayIn)
		{
			System.out.println(item);
		}
	}
}
