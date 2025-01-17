import java.util.*;

class CartItem 
{
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) 
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to return a string representation of the CartItem
    public String toString() 
    {
        return itemName + " - Price: " + price + "Rs, Quantity: " + quantity;
    }
}

class ShoppingCart 
{
    private List<CartItem> cart;

    public ShoppingCart() 
    {
        cart = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) 
    {
        cart.add(item);
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) 
    {
        boolean found = false;
        for (CartItem item : cart) 
        {
            if (item.itemName.equals(itemName)) 
            {
                cart.remove(item);
                System.out.println("Removed " + itemName + " from the cart.");
                found = true;
                break;
            }
        }
        if (!found) 
        {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to display all items in the cart
    public void displayCart() 
    {
        if (cart.isEmpty()) 
        {
            System.out.println("The cart is empty.");
        } 
        else 
        {
            System.out.println("Items in the cart:");
            for (CartItem item : cart) 
            {
                System.out.println(item);
            }
        }
    }

    // Method to calculate the total cost of the items in the cart
    public double totalCost() 
    {
        double total = 0;
        for (CartItem item : cart) 
        {
            total += item.price * item.quantity;
        }
        return total;
    }
}

public class ShoppingCartSimulator 
{
    public static void main(String[] args) 
    {
        ShoppingCart cart = new ShoppingCart();

        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Smartphone", 22000, 2);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayCart();

        System.out.println("Total cost: "+ cart.totalCost());

        cart.removeItem("Smartphone");

        cart.displayCart();

        System.out.println("Total cost after removal: "+ cart.totalCost());
    }
}
