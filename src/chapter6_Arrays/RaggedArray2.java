package chapter6_Arrays;

public class RaggedArray2 {
	public static void main(String[] args)
	{
		// initialise ragged array
		char[][] animals =	{
								{'M', 'O', 'N', 'K', 'E', 'Y'},
								{'C', 'A', 'T'},
								{'B', 'I', 'R', 'D'}
		};
		
		fillArray(animals);
		displayArray(animals);

		
	}
	
	// fill array 
	static void fillArray(char[][] arrayIn)
	{
		for(int row = 0; row < arrayIn.length; row++)
		{
			for (int col = 0; col < arrayIn[row].length; col++)
			{
				arrayIn[row][col] = 'A';
			}
		}
	}
	
	// method
	static void displayArray(char[][] arrayIn)
	{
		for(int row = 0; row < arrayIn.length; row++) // row number is fixed
		{
			for (int col = 0; col < arrayIn[row].length; col++)
			{
				System.out.print(arrayIn[row][col]); // display 1 character
			}	
			System.out.println(); // new line after each row
		}	
	}
}
