package vehicle_management;

abstract class Vehicle
{
    private int vehicleNumber;
    private String type;
    private int rentalRate;

    public Vehicle(int vehicleNumber, String type, int rentalRate)
    {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public int getvehicleNumber()
    {
        return vehicleNumber;
    }

    public void setVehicleNumber()
    {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType()
    {
        return type;
    }

    public void setType()
    {
        this.type = type;
    }

    public int getrentalRate()
    {
        return rentalRate;
    }

    public void setRentalRate()
    {
        this.rentalRate = rentalRate;
    }

    public abstract int calculateRentalCost(int days);

    public void displayDetails()
    {
        System.out.println("Vehicle number : " + vehicleNumber);
        System.out.println("Vehicle type : " + type);
        System.out.println("Vehicle rental rate : " + rentalRate);
        System.out.println("Total rental cost : " + calculateRentalCost(5));
    }
}
