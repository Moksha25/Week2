import java.util.*;

public class CourseManagement
{
    // class variable
    static String instituteName = "abc institute";

    //Instance variable
    private String courseName;
    private int duration;
    private int fees;

    public CourseManagement(String courseName, int duration, int fees)
    {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    public static void updatedInstituteName(String newinstituteName)
    {
        instituteName = newinstituteName;
    }

    public void displayCourseDetails()
    {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Fees: " + fees + " Rs");
        System.out.println("Institute Name: " + instituteName);
    }

    public static void main (String args[])
    {
        System.out.println("Institute name before updating:");
        CourseManagement course1 = new CourseManagement("Btech", 4, 110000);
        course1.displayCourseDetails();

        System.out.println("Institute name after updating:");
        CourseManagement.updatedInstituteName("Technocrates Instituite of Technology");
        course1.displayCourseDetails();
    }
}