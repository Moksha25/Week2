import java.util.*;

public class Item
{
	//Attribute
	private int itemCode;
	private String itemName;
	private int itemPrice;
	
	//Constructor
	public Item(int itemCode, String itemName, int itemPrice)
	{
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public void totalCost(int quantity)
	{
		int TotalCost = itemPrice * quantity;		
		System.out.println("The Total Cost is : " + TotalCost);
	}
	
	public void displayDetails()
	{
		System.out.println("The Item code is : " + itemCode);
		System.out.println("The Item Name is : " + itemName);
		System.out.println("The Item Price is : " + itemPrice);
	}
	
	public static void main (String args[])
	{
		Item item = new Item(110,"DairyMilk",100);
		item.displayDetails();
		item.totalCost(5);
	}
}