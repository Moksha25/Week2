package employee_management;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(101, "Mokshini", 50000, 5000));
        employees.add(new PartTimeEmployee(102, "Bhavesh", 10000, 120, 20));
        employees.add(new EmployeeWithDepartment(103, "Gautam", 40000, "HR"));

        for (Employee emp : employees)
        {
            emp.displayDetails();
            System.out.println();
        }
    }
}
