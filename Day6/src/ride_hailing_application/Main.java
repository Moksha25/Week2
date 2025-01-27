package ride_hailing_application;

public class Main
{
    public static void main (String args[])
    {
        Car car = new Car(123,"Mokshini", 20);
        car.getVehicleDetails();
        car.updateLocation("Indore");
        car.getCurrentLocation();
        System.out.println();

        Bike bike = new Bike(456,"Jay", 10);
        bike.getVehicleDetails();
        bike.updateLocation("Bhopal");
        bike.getCurrentLocation();
        System.out.println();

        Auto auto = new Auto(789, "Raghav", 15);
        auto.getVehicleDetails();
        auto.updateLocation("Khandwa");
        auto.getCurrentLocation();
    }
}
