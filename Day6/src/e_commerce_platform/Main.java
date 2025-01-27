package e_commerce_platform;

import java.util.ArrayList;

public class Main
{
    public static void main (String args[])
    {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(123, "Fridge", 15000));
        products.add(new Clothing(456, "Dress", 2000));
        products.add(new Groceries(789, "Maggie", 100));

        for (Product pro : products)
        {
            pro.displayDetails();
            pro.calculateDiscount();

            if(pro instanceof Taxable)
            {
                Taxable tax = (Taxable) pro;
                tax.getTaxDetails();
            }

            System.out.println();
        }
    }
}
