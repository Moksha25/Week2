import java.util.*;

public class Book
{
	//Attribute
	private String title;
	private String author;
	private int price;
	
	//Constructor
	public Book(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails()
	{
		System.out.println("The book title is '" + title + "' written by " + author + ". Price of this book is " +price+ "Rs.");
	}
	
	public static void main (String args[])
	{
		Book book = new Book("Too Good to Be True", "Prajakta koli", 300);
		book.displayDetails();
	}
}