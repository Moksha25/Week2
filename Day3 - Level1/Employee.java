public class Employee 
{
    static String companyName = "Capgemini";
    private String name;
    final int id;
    private String designation;
    static int total = 0;

    public Employee(String name, int id, String designation)
    {
        this.name = name;
        this.id = id;
        this.designation = designation;

        total++;
    }

    public void displayTotalEmployee()
    {
        System.out.println("Company Name : " + companyName);
        System.out.println("The total number of employee : " + total);
    }

    public static void main (String args[])
    {
        Employee employee1 = new Employee("Mokshini", 123, "Software Developer");

        if(employee1 instanceof Employee)
        {
            System.out.println("employee1 is an instanceof Employee class.");
        }
        employee1.displayTotalEmployee();

        Employee employee2 = new Employee("Bhavesh", 456, "Dietition");

        if(employee2 instanceof Employee)
        {
            System.out.println("employee1 is an instanceof Employee class.");
        }
        employee2.displayTotalEmployee();
    }
}
