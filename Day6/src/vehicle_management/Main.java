package vehicle_management;
import java.util.ArrayList;

public class Main
{
    public static void main (String args[])
    {
        ArrayList<Vehicle> vehicle = new ArrayList<>();

        vehicle.add(new Bike(123, "electric", 500));
        vehicle.add(new Car(456, "diesel", 2000));
        vehicle.add(new Truck(789, "petrol", 5000));

        for (Vehicle v : vehicle)
        {
            v.displayDetails();
            v.calculateRentalCost(5);

            if(v instanceof Insurable)
            {
                ((Insurable) v).getInsuranceDetails();
            }

            System.out.println();
        }
    }
}
