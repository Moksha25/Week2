package e_commerce_platform;

public class Electronics extends Product implements Taxable
{
    int tax = 12;
    int discount = 30;

    public Electronics(int productID, String name, int price)
    {
        super(productID, name, price);
    }

    public int calculateTax()
    {
        return tax * getPrice()/100;
    }

    public void getTaxDetails()
    {
        System.out.println("Tax on electronics : " + calculateTax());
    }

    @Override
    public int calculateDiscount()
    {
        return getPrice() + tax - discount;
    }
}

