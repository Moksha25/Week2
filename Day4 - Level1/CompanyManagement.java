import java.util.*;

class Employee   
{
    public String name;

    public Employee(String name) 
    {
        this.name = name;
        System.out.println("Employee " + this.name + " is created.");
    }

    public void delete() {
        System.out.println("Employee " + this.name + " is deleted.");
    }
}

class Department 
{
    public String name; 
    public ArrayList<Employee> employees;  

    public Department(String name) 
    {
        this.name = name;
        this.employees = new ArrayList<>();
        System.out.println("Department " + this.name + " is created.");
    }

    public void addEmployee(String employeeName) 
    {
        Employee employee = new Employee(employeeName);
        employees.add(employee);
    }

    public void delete() 
    {
        System.out.println("Department " + this.name + " is deleted.");
        for (Employee employee : employees) 
        {
            employee.delete(); 
        }
        employees.clear();
    }
}

class Company 
{
    public String companyName; 
    public ArrayList<Department> departments;

    public Company(String companyName) 
    {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
        System.out.println("Company " + this.companyName + " is created.");
    }

    public void addDepartment(String departmentName) 
    {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    public void delete() 
    {
        System.out.println("Company " + this.companyName + " is deleted.");

        for (Department department : departments) 
        {
            department.delete(); 
        }
        departments.clear(); 
    }
}

public class CompanyManagement
{
    public static void main(String[] args) 
    {
        Company company = new Company("Capgemini");

        company.addDepartment("HR");
        company.addDepartment("TR");

        company.departments.get(0).addEmployee("Mokshini Baglekar");
        company.departments.get(1).addEmployee("Bhavesh Malviya");

        company.delete();
    }
}
