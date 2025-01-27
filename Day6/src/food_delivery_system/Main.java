package food_delivery_system;

public class Main
{
    public static void main(String[] args)
    {
        VegItem veg = new VegItem("Veg momos", 150,2);
        veg.getItemDetails();
        veg.getDiscountDetails();
        System.out.println();

        NonVegItem nonveg = new NonVegItem("NonVeg momos", 250, 2);
        nonveg.getItemDetails();
        nonveg.getDiscountDetails();
    }
}
