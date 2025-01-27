package library_management;

public class Main
{
    public static void main (String args[])
    {
        Book book = new Book(123, "Too Good to be True", "Prajakta Kohli");
        book.getItemDetails();
        book.checkAvailability();
        System.out.println();

        Magazine mag = new Magazine(456,"Food", "Pankaj");
        mag.getItemDetails();
        mag.checkAvailability();
        System.out.println();

        DVD dvd = new DVD(789, "Movie", "Director");
        dvd.getItemDetails();
        dvd.checkAvailability();
    }
}
