package ride_hailing_application;

public class Car extends Vehicle implements GPS
{
    public String loc;

    public Car(int vehicleID, String driverName, int ratePerKm)
    {
        super(vehicleID, driverName, ratePerKm);
    }

    public double calculateFare(double distance)
    {
        return getRatePerKm() * distance;
    }

    public void getCurrentLocation()
    {
        System.out.println("Current location of car :" + loc);
    }

    public void updateLocation(String location)
    {
        loc = location;
    }
}
