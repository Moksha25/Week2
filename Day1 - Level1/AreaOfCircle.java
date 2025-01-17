import java.util.*;

public class Circle
{
	//Attribute
	private int radius;
	
	//Constructor
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public void area()
	{
		System.out.println("Area of circle : " + Math.PI*radius*radius);
	}
	
	public void circumference()
	{
		System.out.println("Circumference of circle is : " + 2*Math.PI*radius);
		
	}
	
	public void displayDetails()
	{
		area();
		circumference();
	}
	
	public static void main (String args[])
	{
		Circle circle = new Circle(5);
		circle.displayDetails();
	}
}