package food_delivery_system;

public class NonVegItem extends FoodItem implements Discountable
{
    public int totalPrice=0;
    public NonVegItem(String itemName, int price, int quantity)
    {
        super(itemName, price, quantity);
    }

    public int calculateTotalPrice()
    {
        return getPrice() * getQuantity();
    }

    public double applyDiscount()
    {
        return getPrice() * 0.2;
    }

    public void getDiscountDetails()
    {
        System.out.println("Discounted price : " + (calculateTotalPrice() - applyDiscount()));
    }
}
