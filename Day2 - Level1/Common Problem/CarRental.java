import java.util.*;

public class CarRental 
{
    private String customerName;
    private String carModel;
    private int rentalDays;

    //Parameterized constructor
    public CarRental(String customer, String carModel, int rentalDays)
    {
        this.customerName = customer;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    //Calculate the total rental cost
    public double calculateRentalCost()
    {
        double cost = 500;
        cost += rentalDays * cost;

        return cost;
    }

    //Display the rental details
    public void displayDetails()
    {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Cost: " + calculateRentalCost());
    }

    public static void main(String[] args)
    {
        CarRental carRental = new CarRental("Mokshini Baglekar", "Tata Altroz", 5);
        carRental.displayDetails();
    }
}
