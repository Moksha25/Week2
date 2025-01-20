public class Product 
{
    static double discount = 10;
    private String productName;
    private int price;
    private int quantity;
    final int productID;

    public Product(String productName, int price, int quantity, int productID)
    {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newdiscount)
    {
        discount = newdiscount;
        System.out.println("Updated Discount is : " + discount);
    }

    public void displayProductDetails()
    {
        System.out.println("Product name : " + productName);
        System.out.println("Product price : " + price);
        System.out.println("Product quantity : " + quantity);
        System.out.println("Product ID : " + productID);
        System.out.println("Product Orignal Discount : " + discount);
    }

    public static void main (String args[])
    {
        Product product1 = new Product("Pasta", 200, 1, 123);
        product1.displayProductDetails();

        Product product2 = new Product("Maggie", 14, 10, 1234);
        product2.displayProductDetails();

        Product.updateDiscount(20);
    }
}
