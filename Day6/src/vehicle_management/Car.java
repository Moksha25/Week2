package vehicle_management;

class Car extends Vehicle implements Insurable
{
    public Car(int vehicleNumber, String type, int rentalRate)
    {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateInsurance()
    {
        return getrentalRate() * 0.1 ;
    }

    public void getInsuranceDetails()
    {
        System.out.println("Insurance of car : " + calculateInsurance());
    }

    @Override
    public int calculateRentalCost(int days)
    {
        return getrentalRate() * days;
    }
}
