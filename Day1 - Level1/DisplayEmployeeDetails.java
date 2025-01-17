import java.util.*;

public class  EmployeeDetails
{
	//Attributes
	private String name;
	private int id;
	private int salary;
	
	//Constructor
	public EmployeeDetails(String name, int id, int salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//Method to display details
	public void DisplayDetails()
	{
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Salary : " + salary);
	}
	
	public static void main (String args[])
	{
		EmployeeDetails employee = new EmployeeDetails("Mokshini", 80, 50000);
		employee.DisplayDetails();
	}
}