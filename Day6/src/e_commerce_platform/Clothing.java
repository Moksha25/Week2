package e_commerce_platform;

class Clothing extends Product implements Taxable
{
    int tax = 12;
    int discount = 40;

    public Clothing(int productID, String name, int price)
    {
        super(productID, name, price);
    }

    public int calculateTax()
    {
        return tax * getPrice()/100;
    }

    public void getTaxDetails()
    {
        System.out.println("Tax on clothing : " + calculateTax());
    }

    @Override
    public int calculateDiscount()
    {
        return getPrice() + tax - discount;
    }
}
