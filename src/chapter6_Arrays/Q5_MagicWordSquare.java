package chapter6_Arrays;

public class Q5_MagicWordSquare {
	
	public static void main(String[] args)
	{
		char[][] magicSquare = 	{
				{'P','R','E','Y'},
				{'L','A','V','A'},
				{'O','V','E','R'},
				{'T','E','N','D'},
			};		
	
		displayRow(1, magicSquare); // prints PREY
		displayRow(2, magicSquare); // prints LAVA
		displayRow(3, magicSquare); // prints OVER
		displayRow(4, magicSquare); // prints TEND
		
		displayCol(1, magicSquare); // prints PLOT
		displayCol(2, magicSquare); // prints RAVE
		displayCol(3, magicSquare); // prints EVEN
		displayCol(4, magicSquare); // prints YARD
	}
	
	static void displayRow(int rowIn, char[][] arrayIn)
	{
		for (int col = 1; col <= arrayIn[0].length; col++)
		{
			System.out.print(arrayIn[rowIn-1][col-1]);
		}
		System.out.println();
	}
	
	static void displayCol(int colIn, char[][] arrayIn)
	{
		for (int row = 1; row <= arrayIn[0].length; row++)
		{
			System.out.print(arrayIn[row-1][colIn-1]);
		}
		System.out.println();
	}


}
