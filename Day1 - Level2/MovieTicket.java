import java.util.*;

public class MovieTicket
{
    private String movieName;
    private int seatNumber;
    private int price;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, int price)
    {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    
    // Method to calculate total price
    public double calculateTotalPrice(int quantity)
    {
        return price * quantity;
    }
    
    public void displayTicketDetails()
    {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price + " Rs");
    }
    
    public static void main(String[] args)
    {
        MovieTicket ticket = new MovieTicket("Inception", 10, 150);
        ticket.displayTicketDetails();
        double totalPrice = ticket.calculateTotalPrice(5);
        System.out.println("Total Price: " + totalPrice + " Rs");
    }
}