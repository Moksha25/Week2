public class Student 
{
    static String universityName = "Technocrates Institute of Technology";
    private String name;
    final int rollNumber;
    private char grade;
    static int total = 0;

    public Student (String name, int rollNumber, char grade)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        total++;
    }

    public void displayTotalStudent()
    {
        System.out.println("The total student : " + total);
    }

    public static void main (String args[])
    {
        Student student1 = new Student("Mokshini", 80, 'A');

        if (student1 instanceof Student)
        {
            System.out.println("student1 is an instanceof Student class.");
        }
        student1.displayTotalStudent();

        Student student2 = new Student("Bhavesh", 90, 'A');

        if (student2 instanceof Student)
        {
            System.out.println("student1 is an instanceof Student class.");
        }
        student2.displayTotalStudent();
    }
}
