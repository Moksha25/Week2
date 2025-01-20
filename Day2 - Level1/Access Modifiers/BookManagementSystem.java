import java.util.*;

public class BookManagementSystem
{
    public String ISBN;
    protected String title;
    private String author;
    
    public BookManagementSystem(String ISBN, String title, String author) 
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
       this.author = author;
    }

    public void displayBookDetails() 
    {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    class EBook extends BookManagementSystem 
    {
        public EBook(String ISBN, String title, String author) 
        {
            super(ISBN, title, author);
        }
    
        public void displayEBookDetails() 
        {
            System.out.println("EBook Details:");
            System.out.println("ISBN: " + ISBN); 
            System.out.println("Title: " + title);  
            System.out.println("Author: " + getAuthor()); 
        }
    }
    
    public static void main(String[] args)
    {
        BookManagementSystem book1 = new BookManagementSystem("1234", "Too Good to be True", "Prajakta kohli");
        book1.displayBookDetails();
        
        book1.setAuthor("Prajakta Kohli");

        System.out.println("Updated Book Details:");
        book1.displayBookDetails();

        BookManagementSystem.EBook ebook1 = book1.new EBook("5678", "Believe in yourself", "Joseph Murphy");
        ebook1.displayEBookDetails();
    }
}