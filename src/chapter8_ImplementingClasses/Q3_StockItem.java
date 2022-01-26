package chapter8_ImplementingClasses;

public class Q3_StockItem {

	// attributes
	private String stockNumber = "no number";
	private String name = "no name";
	private double price = 0.00;
	private int totalStock = 0;
	private static double salesTax = 0;
	
	// constructor
	public Q3_StockItem(String numberIn, String nameIn, double priceIn)
	{
		stockNumber = numberIn;
		name = nameIn;
		price = priceIn;
	}
	
	// methods
	
	public void setPrice(double priceIn)
	{
		price = priceIn;
	}
	
	public void increaseTotalStock(int stockIn)
	{
		totalStock = stockIn;
	}
	
	public String getStockNumber()
	{
		return stockNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getTotalStock()
	{
		return totalStock;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double calculateTotalPrice()
	{
		double result = 0;
		result = price * totalStock;
		return result;
	}
	
	public static void setSalesTax(double salesTaxIn)
	{
		salesTax = salesTaxIn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
