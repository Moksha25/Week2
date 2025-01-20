public class Book 
{
    static String LibraryName = "TIT Library";
    private String title;
    private String author;
    final int isbn;

    public Book(String title, String author, int isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayLibraryName()
    {
        System.out.println("Library Name : " + LibraryName);
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
        System.out.println("Book isbn number : " + isbn);
    }

    public static void main (String srgs[])
    {
        Book book1 = new Book("Too Good to be True", "Prajakta Kohli", 123);

        if (book1 instanceof Book)
        {
            System.out.println("book1 is an instanceof Book.");
        }

        book1.displayLibraryName();
    }
}