import java.util.*;

public class Employee 
{
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) 
    {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public void displayEmployeeDetails() 
    {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    class Manager extends Employee 
    {
        public Manager(String employeeID, String department, double salary) 
        {
            super(employeeID, department, salary);  
        }

        public void displayManagerDetails() 
        {
            System.out.println("Manager Details:");
            System.out.println("Employee ID: " + employeeID);  
            System.out.println("Department: " + department);  
            System.out.println("Salary: " + getSalary());  
        }
    }

    public static void main(String[] args) 
    {
        Employee employee1 = new Employee("E1", "Software", 60000);
        employee1.displayEmployeeDetails();  

        employee1.setSalary(65000);

        System.out.println("\nUpdated Employee Details:");
        employee1.displayEmployeeDetails();

        Employee.Manager manager1 = employee1.new Manager("E1", "Development", 50000);
        manager1.displayManagerDetails();  
    }
}
