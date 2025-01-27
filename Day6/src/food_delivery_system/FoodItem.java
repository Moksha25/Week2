package food_delivery_system;

abstract class FoodItem
{
    private String itemName;
    private int price;
    private int quantity;

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName()
    {
        this.itemName = itemName;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public FoodItem(String itemName, int price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract int calculateTotalPrice();

    public void getItemDetails()
    {
        System.out.println("Item name : " + itemName);
        System.out.println("Item price : " + price);
        System.out.println("Item quantity : " + quantity);
        System.out.println("Total price : " + calculateTotalPrice());
    }
}
