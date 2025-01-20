import java.util.*;

public class Library 
{
    private String title;
    private String author;
    private int price;
    private boolean availability;

    //Parameterized constructor
    public Library(String title, String author, int price, boolean availability)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    
    //Display the book details
    public void displayDetails()
    {
        System.out.println("Book title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + availability);

        if (availability == true)
        {
            availability = false;
            System.out.println("Book is available for borrowing.");
        }
        else
        {
            System.out.println("Book is not available for borrowing");
        }
    }

    public static void main(String[] args)
    {
        Library library1 = new Library("Too Good to be True", "Prajakta Kohli", 300, true);
        library1.displayDetails();

        Library library2 = new Library("Belive in yourself", "Joseph Murphy", 254, false);
        library2.displayDetails();
    }
}
