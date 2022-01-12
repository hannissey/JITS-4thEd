package chapter6_Arrays;

public class RaggedArray {
	public static void main(String[] args)
	{
		// initialise ragged array
		char[][] animals =	{
								{'M', 'O', 'N', 'K', 'E', 'Y'},
								{'C', 'A', 'T'},
								{'B', 'I', 'R', 'D'}
		};
		
		for(int row = 0; row < animals.length; row++) // row number is fixed
		{
			for (int col = 0; col < animals[row].length; col++)
			{
				System.out.print(animals[row][col]); // display 1 character
			}	
			System.out.println(); // new line after each row
		}
		
	}
}
