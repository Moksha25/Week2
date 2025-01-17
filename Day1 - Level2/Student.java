import java.util.*;

public class Student
{
    private String name;
    private int rollnumber;
    private int marks;
    private char grade;

    //Constructor
    public Student(String name, int rollnumber, int marks)
    {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    //To calculate the grade based on the marks.
    public void calculateGrade()
    {
        if (marks >= 90)
        {
            grade = 'A';
        }
        else if (marks >= 80)
        {
            grade = 'B';
        }
        else if (marks >= 70)
        {
            grade = 'C';
        }
        else if (marks >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("The grade is : " + grade);
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Marks: " + marks);
        calculateGrade();
    }

    public static void main (String args[])
    {
        Student student = new Student("Mokshini",80,81);
        student.displayDetails();
    }
}