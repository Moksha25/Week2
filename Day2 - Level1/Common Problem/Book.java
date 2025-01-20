import java.util.*;

public class Book
{
    //Attribute
    private String title;
    private String author;
    private int price;

    //Default constructor
    public Book()
    {
        title = "Too Good to be True";
        author = "Prajakta Koli";
        price = 300;
    }

    //Parameterized constructor
    public Book (String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;   
    }

    //Display the book
    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " Rs.");
    }

    public static void main(String args[])
    {
        //Default constructor
        System.out.println("Default constructor:");
        Book book = new Book();
        book.displayDetails();

        //parameterised constructor
        System.out.println("Parameterised constructor:");
        Book book1 = new Book("Believe in yourself", "Joseph Murphy", 254);
        book1.displayDetails();
    }
}