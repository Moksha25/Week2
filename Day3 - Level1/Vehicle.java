public class Vehicle
{
    static int registrationFees = 500;
    private String ownerName;
    private String vehicleType;
    final int registrationNumber;
    
    public Vehicle(String ownerName, String vehicleType, int registrationNumber)
    {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFees(int newRegistrationFees)
    {
        registrationFees = newRegistrationFees;
        System.out.println("The updated registration fees : " + newRegistrationFees);
    }

    public void displayVehicleDetails()
    {
        System.out.println("Vehicle owner name : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Vehicle registration number : " + registrationNumber);
        System.out.println("Vehicle registration fees : " + registrationFees);
    }

    public static void main (String args[])
    {
        Vehicle vehicle1 = new Vehicle("Mokshini", "Scooty", 1234);

        if (vehicle1 instanceof Vehicle)
        {
            System.out.println("vehicle1 is an instanceof Vehicle class.");
        }
        vehicle1.displayVehicleDetails();

        Vehicle.updateRegistrationFees(1000);
    }
}
