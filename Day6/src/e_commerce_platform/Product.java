package e_commerce_platform;

abstract public class Product
{
    private int productID;
    private String name;
    private int price;

    public Product(int productID, String name, int price)
    {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public int getProductID()
    {
        return productID;
    }

    public void setProductID()
    {
        this.productID = productID;
    }

    public String getName()
    {
        return name;
    }

    public void setname()
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice()
    {
        this.price = price;
    }

    public abstract int calculateDiscount();

    public void displayDetails()
    {
        System.out.println("Product ID : " + productID);
        System.out.println("Product name : " + name);
        System.out.println("Product price : " + price);
        System.out.println("Calculate discount : " + calculateDiscount());
    }
}
