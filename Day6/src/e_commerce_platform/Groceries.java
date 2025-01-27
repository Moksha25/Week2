package e_commerce_platform;

class Groceries extends Product implements  Taxable
{
    int tax = 12;
    int discount = 50;

    public Groceries(int productID, String name, int price)
    {
        super(productID, name, price);
    }

    public int calculateTax()
    {
        return tax * getPrice()/100;
    }

    public void getTaxDetails()
    {
        System.out.println("Tax on groceries : " + calculateTax());
    }

    @Override
    public int calculateDiscount()
    {
        return getPrice() + tax - discount;
    }
}
