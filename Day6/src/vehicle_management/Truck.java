package vehicle_management;

class Truck extends Vehicle implements Insurable
{
    public Truck(int vehicleNumber, String type, int rentalRate)
    {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateInsurance()
    {
        return getrentalRate() * 0.1 ;
    }

    public void getInsuranceDetails()
    {
        System.out.println("Insurance of truck : " + calculateInsurance());
    }

    @Override
    public int calculateRentalCost(int days)
    {
        return getrentalRate() * days;
    }
}
