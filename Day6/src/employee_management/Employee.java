package employee_management;

abstract class Employee
{
    private int employeeID;
    private String name;
    private double baseSalary;

    public Employee(int employeeID, String name, double baseSalary)
    {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary()
    {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails()
    {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Name : " + name);
        System.out.println("Base Salary : " + baseSalary + "Rs");
        System.out.println("Calculate Salary : " + calculateSalary());
    }
}
