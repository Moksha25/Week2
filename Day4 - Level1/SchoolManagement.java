import java.util.ArrayList;

class Student
{
    public String name;

    public Student(String name)
    {
        this.name = name;
        System.out.println("Student : " + name);
    }
}

class School
{
    public String schoolName;
    public ArrayList<Courses> courses;
    
    public School (String schoolName)
    {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
        System.out.println("School Name : " + schoolName);
    }

    public void addCourse(String coursesName)
    {
        Courses course = new Courses(coursesName);
        courses.add(course);
    }
}

class Courses
{
    public String name;
    public ArrayList<Student> students;

    public Courses(String name)
    {
        this.name = name;
        this.students = new ArrayList<>();
        System.out.println("Course : " + name);
    }

    public void addStudent(String studentName)
    {
        Student student = new Student(studentName);
        students.add(student);
    }
}

public class SchoolManagement 
{
    public static void main (String args[])
    {
        School school = new School("St Pius Sen Sec School");

        school.addCourse("PCM");
        school.courses.get(0).addStudent("Mokshini Baglekar");

        school.addCourse("PCB");
        school.courses.get(1).addStudent("Bhavesh Malviya");
    }
}
