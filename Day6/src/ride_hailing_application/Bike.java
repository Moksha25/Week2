package ride_hailing_application;

public class Bike extends   Vehicle implements GPS
{
    public String loc;

    public Bike(int vehicleID, String driverName, int ratePerKm)
    {
        super(vehicleID, driverName, ratePerKm);
    }

    public double calculateFare(double distance)
    {
        return getRatePerKm() * distance;
    }

    public void getCurrentLocation()
    {
        System.out.println("Current location of bike :" + loc);
    }

    public void updateLocation(String location)
    {
        loc = location;
    }
}
