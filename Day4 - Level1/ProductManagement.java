import java.util.ArrayList;

class Customer
{
    public String customerName;

    public Customer(String customerName)
    {
        this.customerName = customerName;
        System.out.println("Customer Name : " + customerName);
    }
}

class Order
{
    public String orderName;
    public ArrayList<Product> products;

    public Order(String orderName)
    {
        this.orderName = orderName;
        this.products = new ArrayList<>();
    }

    public void displayOrder()
    {
        System.out.println(orderName);
    }

    public void addProducts(Product p)
    {
        products.add(p);
    }
}

class Product
{
    public String productName;
    public int quantity;
    public ArrayList<Order> orders;

    public void addOrder(String orderName)
    {
        Order order = new Order(orderName);
        orders.add(order);
        System.out.println(orderName);
    }

    public Product(String productName, int quantity)
    {
        this.productName = productName;
        this.quantity = quantity;
        this.orders = new ArrayList<>();
        
        System.out.println("Product " + productName + " of quantity " + quantity);
    }
}

public class ProductManagement 
{
    public static void main (String args[])
    {
        Customer customer = new Customer("Mokshini Baglekar");
        Order order1 = new Order("Order1");

        order1.displayOrder();
        Product product1 = new Product("IceCream", 10);
        Product product2 = new Product("Chocolate", 2);
        order1.addProducts(product1);
        order1.addProducts(product2);
    }
    
}
