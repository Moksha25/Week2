import java.util.ArrayList;
import java.util.List;

class UniversityStudent 
{
    public int studentId;
    public String name;
    public String email;
    public List<Course> courses;

    public UniversityStudent(int studentId, String name, String email) 
    {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) 
    {
        if (!courses.contains(course)) 
        {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public List<String> getCourses() 
    {
        List<String> courseNames = new ArrayList<>();
        for (Course course : courses) 
        {
            courseNames.add(course.courseName);
        }
        return courseNames;
    }
}

class Professor 
{
    public int professorId;
    public String name;
    public String email;
    public List<Course> courses;

    public Professor(int professorId, String name, String email) 
    {
        this.professorId = professorId;
        this.name = name;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public void assignProfessor(Course course) 
    {
        if (!courses.contains(course)) 
        {
            courses.add(course);
            course.setProfessor(this);
        }
    }

    public List<String> getCourses() 
    {
        List<String> courseNames = new ArrayList<>();
        for (Course course : courses) 
        {
            courseNames.add(course.courseName);
        }
        return courseNames;
    }
}

// Course Class
class Course 
{
    public String courseCode;
    public String courseName;
    public int creditHours;
    public List<UniversityStudent> students;
    public Professor professor;

    public Course(String courseCode, String courseName, int creditHours) 
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.students = new ArrayList<>();
        this.professor = null;
    }

    public void addStudent(UniversityStudent student) 
    {
        if (!students.contains(student)) 
        {
            students.add(student);
        }
    }

    public void setProfessor(Professor professor) 
    {
        this.professor = professor;
    }

    public List<String> getEnrolledStudents() 
    {
        List<String> studentNames = new ArrayList<>();
        for (UniversityStudent student : students) 
        {
            studentNames.add(student.name);
        }
        return studentNames;
    }

    public String getProfessor() 
    {
        return professor != null ? professor.name : "No professor assigned";
    }
}

public class UniversitySystem 
{
    public static void main(String[] args) 
    {
        UniversityStudent student1 = new UniversityStudent(1, "Student1", "student1@gmail.com");
        UniversityStudent student2 = new UniversityStudent(2, "student2", "student2@gmail.com");

        Professor professor1 = new Professor(100, "Professor1", "profesor1@gmail.com");
        Course course1 = new Course("CS101", "Introduction to Computer Science", 3);
        Course course2 = new Course("C100", "Oops", 8);

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);

        professor1.assignProfessor(course1);

        System.out.println("Students enrolled in " + course1.courseName + ": " + course1.getEnrolledStudents());
        System.out.println("Professor for " + course1.courseName + ": " + course1.getProfessor());
        System.out.println(student1.name + "'s courses: " + student1.getCourses());
        System.out.println(student2.name + "'s courses: " + student2.getCourses());
    }
}
