import java.util.*;

public class MobilePhone
{
    private String brand;
    private String model;
    private int price;

    //Constructor
    public MobilePhone(String brand, String model, int price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    //Method to display mobile phone details
    public void displayDetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price + " Rs");
    }

    public static void main(String[] args)
    {
        MobilePhone mobilePhone = new MobilePhone("Samsung", "Galaxy A50", 22000);
        mobilePhone.displayDetails();
    }
}