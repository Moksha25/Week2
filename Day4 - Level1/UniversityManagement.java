import java.util.ArrayList;

class University
{
    public String universityName; 
    public ArrayList<Department> departments;

    public University(String universityName) 
    {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        System.out.println("Company " + this.universityName + " is created.");
    }

    public void addDepartment(String departmentName) 
    {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    public void delete() 
    {
        System.out.println("Company " + this.universityName + " is deleted.");

        for (Department department : departments) 
        {
            department.delete(); 
        }
        departments.clear(); 
    }
}

class Department
{
    public String departmentName;
    public ArrayList<Faculty> faculties;

    public Department(String departmentName)
    {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
        System.out.println("Department : " + departmentName);
    }

    public void addFaculty(String facultiesName)
    {
        Faculty faculty = new Faculty(facultiesName); 
        faculties.add(faculty);
    }

    public void delete()
    {
        System.out.println("Department : " + this.departmentName + " is deleted.");
    }
}

class Faculty
{
    public String facultyName;

    public Faculty(String facultyName)
    {
        this.facultyName = facultyName;
        System.out.println("Faculty Name : " + facultyName);
    }
}

public class UniversityManagement 
{
    public static void main (String args [])
    {
        University university = new University("Technocrates Institute Of Technology");
        
        university.addDepartment("TNP");
        university.departments.get(0).addFaculty("Mokshini Baglekar");

        university.addDepartment("Management");
        university.departments.get(1).addFaculty("Bhavesh Malviya");

        university.delete();
    }
}
