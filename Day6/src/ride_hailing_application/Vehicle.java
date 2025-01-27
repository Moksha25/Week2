package ride_hailing_application;

public abstract class Vehicle
{
    private int vehicleID;
    private String driverName;
    private int ratePerKm;

    public int getVehicleID()
    {
        return vehicleID;
    }

    public void setVehicleID()
    {
        this.vehicleID = vehicleID;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public void setDriverName()
    {
        this.driverName = driverName;
    }

    public int getRatePerKm()
    {
        return ratePerKm;
    }

    public void setRatePerKm()
    {
        this.ratePerKm = ratePerKm;
    }

    public Vehicle(int vehicleID, String driverName, int ratePerKm)
    {
        this.vehicleID = vehicleID;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails()
    {
        System.out.println("Vehicle id : " + vehicleID);
        System.out.println("Driver name : " + driverName);
        System.out.println("Rate per km : " + ratePerKm);
        System.out.println("Total fare : " + calculateFare(180));
    }

}
