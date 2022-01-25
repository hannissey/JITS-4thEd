package chapter8_ImplementingClasses;

/*
 * 			CircularShape						} class name
			_______________________

			-radius : double					} attributes								
			_______________________

			+CircularShape(double)
			+setRadius(double)
			+getRadius() : double
			+calculateArea() : double			} methods
			+calculateCircumference(): double
 */


public class Q1_CircularShape {
	
	// attributes
	private double radius = -0;
	final double PI = 3.1416;
	
	//  methods
	//	+CircularShape(double)
	public Q1_CircularShape(double radiusIn)
	{
		radius = radiusIn;
	}
	
	//	+setRadius(double)
	public void setRadius(double radiusIn)
	{
		radius = radiusIn;
	}	
	
	//	+getRadius() : double
	public double getRadius()
	{
		return radius;
	}
	
	//	+calculateArea() : double	
	public double calculateArea()
	{
		double area = 0;
		area = PI * (radius * radius);
		return area;
	}
	
	//	+calculateCircumference(): double
	public double calculateCircumference()
	{
		double circumference = 0;
		circumference = 2 * PI * radius;
		return circumference;
	}
	
	// +calculateDiameter(): double
	public double calculateDiameter()
	{
		double diameter = 0;
		diameter = 2 * radius;
		return diameter;
	}
}
