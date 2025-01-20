public class Product 
{
    //class variable
    static int totalProduct = 0;

    //instance variable
    private String productName;
    private double price;

    //Parameterized constructor
    public Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
        totalProduct++;
    }

    public void displayDetails()
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price + "Rs");
        System.out.println("Total number of products: " + totalProduct);
    }

    public static void main (String args[])
    {
        Product product1 = new Product("Jeans", 2000);
        product1.displayDetails();

        Product product2 = new Product("Top", 800);
        product2.displayDetails();

        Product product3 = new Product("Dress", 1500);
        product3.displayDetails();
    }
}
