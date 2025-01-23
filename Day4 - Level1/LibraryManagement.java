import java.util.*;

class Library
{
    ArrayList<Book> ListOfBooks = new ArrayList<Book>();  

    public void addBook(Book bookName)
    {
        ListOfBooks.add(bookName);
    }

    public void displayBookDetails()
    {
        for(int i=0; i < ListOfBooks.size(); i++)
        {
            System.out.println("Book : " + ListOfBooks.get(i).title + "  Author : " + ListOfBooks.get(i).author);
        }
    }
}

class Book
{
    public String title;
    public String author;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagement
{
    public static void main (String args[])
    {
        Library library = new Library();

        Book book1 = new Book("Too Good to be True", "Prajakta Kohli");
        Book book2 = new Book("Sucess Principles", "Ratan Tata");
        Book book3 = new Book("Belive in Yourself", "Joseph Murphy");
        Book book4 = new Book("Atomic Habbits", "James Clear");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayBookDetails();
    }
}