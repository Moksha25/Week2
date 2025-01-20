import java.util.*;

public class Vehicle
{
    // class variable
    static int registrationFees = 500;

    //Instance variable
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType)
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updatedRegistrationFees(int newFees)
    {
        registrationFees = newFees;
    }

    public void displayVehicleDetails()
    {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fees: " + registrationFees + " Rs");
    }

    public static void main (String args[])
    {
        System.out.println("Registration fees before updating:");
        Vehicle vehicle1 = new Vehicle("Mokshini", "Scooty");
        vehicle1.displayVehicleDetails();

        System.out.println("Registration fees after updating:");
        Vehicle.updatedRegistrationFees(1000);
        vehicle1.displayVehicleDetails();
    }
}