package library_management;

public class DVD extends LibraryItem implements Reservable
{
    public boolean reserve = true;

    public DVD(int itemID, String title, String author)
    {
        super(itemID, title, author);
    }

    @Override
    public int getLoanDuration(int days)
    {
        return days;
    }

    public void reserveItem()
    {
        if(reserve == true)
        {
            System.out.println("Book is reserved.");
        }
        else
        {
            reserve = true;
            System.out.println("Book reserved sucessfully.");
        }
    }

    public void checkAvailability()
    {
        if(reserve == true)
        {
            System.out.println("Book is available for loan.");
        }
        else
        {
            System.out.println("Book is reserved");
        }
    }
}
