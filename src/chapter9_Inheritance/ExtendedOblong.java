package chapter9_Inheritance;

public class ExtendedOblong extends Oblong 
{
	private char symbol;
	
	public ExtendedOblong(double lengthIn, double heightIn, char symbolIn)
	{
		super(lengthIn, heightIn);
		symbol = symbolIn;
	}
	
	public void setSymbol(char symbolIn)
	{
		symbol = symbolIn;
	}
	
	// introducing the new method of type casting
	public String draw()
	{
		String s = new String(); // start off with an empty string
		int l, h; // declare two new integer variables
		
		// in the next two lines we type cast from double to integer,
		// so we have a counter for our draw method
		l = (int) getLength();
		h = (int) getHeight();
		
		for(int i = 1; i <= h; i++)
		{
			for (int j = 1; j <= l; j++)
			{
				s = s + symbol; // add the symbol to the string
			}
			s = s + '\n';			
		}
		return s;
	}
}
