package ride_hailing_application;

public class Auto extends Vehicle implements GPS
{
    public String loc;

    public Auto(int vehicleID, String driverName, int ratePerKm)
    {
        super(vehicleID, driverName, ratePerKm);
    }

    public double calculateFare(double distance)
    {
        return getRatePerKm() * distance;
    }

    public void getCurrentLocation()
    {
        System.out.println("Currunt location of auto :" + loc);
    }

    public void updateLocation(String location)
    {
        loc = location;
    }
}
