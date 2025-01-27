package library_management;

public abstract class LibraryItem
{
    private int itemID;
    private String title;
    private String author;

    public LibraryItem(int itemID, String title, String author)
    {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    public int getItemID()
    {
        return itemID;
    }

    public void setItemID()
    {
        this.itemID = itemID;
    }

    public String getTitle()
    {
        return title;
    }

    public String setTitle()
    {
        return author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor()
    {
        this.author = author;
    }

    public abstract int getLoanDuration(int days);

    public void getItemDetails()
    {
        System.out.println("Book ID : " + itemID);
        System.out.println("Book title : " + title);
        System.out.println("Book author : " + author);
        System.out.println("Book loan duration : " + getLoanDuration(10));
    }
}
