import java.util.*;

public class Student
{
    public int rollnumber;
    protected String name;
    private double CGPA;

    public Student(int rollnumber, String name, double CGPA)
    {
        this.rollnumber = rollnumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA()
    {
        return CGPA;
    }

    public void setCGPA(double CGPA)
    {
        this.CGPA = CGPA;
    }

    public void displayDetails()
    {
        System.out.println("Name:" + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("CGPA: " + CGPA);
    }

    class PostgraduateStudent extends Student 
    {
        public PostgraduateStudent(int rollNumber, String name, double CGPA) 
        {
            super(rollNumber, name, CGPA);
        }
    }

    public void displayPostgraduateStudent()
    {
        System.out.println("Degree: Postgraduate");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String args[])
    {
        Student student1 = new Student(80, "Mokshini Baglekar", 8.1);
        student1.displayDetails();

        student1.setCGPA(9.1);

        System.out.println("Updated details: ");
        student1.displayDetails();

        Student.PostgraduateStudent pgStudent1 = student1.new PostgraduateStudent(90,"Bhavesh Malviya" , 8.5 );
        pgStudent1.displayPostgraduateStudent();
    }
}