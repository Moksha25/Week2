import java.util.*;

public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    //display the area of circle
    public void displayArea()
    {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    public static void main(String[] args)
    {
        Circle c = new Circle(5);
        c.displayArea();
    }
}