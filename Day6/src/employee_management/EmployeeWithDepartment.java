package employee_management;

class EmployeeWithDepartment extends Employee implements Department
{
    private String department;

    public EmployeeWithDepartment(int employeeId, String name, double baseSalary, String department)
    {
        super(employeeId, name, baseSalary);
        this.department = department;
    }

    @Override
    public void assignDepartment(String departmentName)
    {
        this.department = departmentName;
    }

    @Override
    public void getDepartmentDetails()
    {
        System.out.println("Department: " + department);
    }

    @Override
    public double calculateSalary()
    {
        return getBaseSalary();
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        getDepartmentDetails();
    }
}



