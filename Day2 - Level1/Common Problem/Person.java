import java.util.*;

public class Person
{
    private String name;
    private int rollnum;
    private String branch;

    //Default constructor
    public Person()
    {
        name = "Mokshini Baglekar";
        rollnum = 80;
        branch = "Computer Science";
    }

    //Parameterized constructor
    public Person(String name, int rollnum, String branch)
    {
        this.name = name;
        this.rollnum = rollnum;
        this.branch = branch;
    }

    //Copy constructor
    public Person(Person person)
    {
        this.name = person.name;
        this.rollnum = person.rollnum;
        this.branch = person.branch;
    }

    //display details
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnum);
        System.out.println("Branch: " + branch);
    }

    public static void main(String args[])
    {
        //Default constructor
        System.out.println("Default constructor:");
        Person person = new Person();
        person.displayDetails();

        //Parameterized constructor
        System.out.println("Parameterized constructor:");
        Person person1 = new Person("Pallavi Parihar", 100, "Comput Science");
        person1.displayDetails();

        //Copy constructor
        System.out.println("Copy constructor:");
        Person person2 = new Person(person1);
        person2.displayDetails();
    }
}