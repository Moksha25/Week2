public class HotelBooking 
{
    private String guestName;
    private String roomType;
    private int nights;

    //Default constructor
    public HotelBooking()
    {
        guestName = "Mokshini Baglekar";
        roomType = "Deluxe";
        nights = 2;
    }

    //Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights)
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //copy constructor
    public HotelBooking(HotelBooking booking)
    {
        guestName = booking.guestName;
        roomType = booking.roomType;
        nights = booking.nights;
    }

    //Display the booking
    public void displayDetails()
    {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main (String args[])
    {
        //Default constructor
        System.out.println("Default constructor:");
        HotelBooking booking1 = new HotelBooking();
        booking1.displayDetails();

        //Parameterized constructor
        System.out.println("Parameterized constructor:");
        HotelBooking booking2 = new HotelBooking("Bhavesh Malviya", "Standard", 3);
        booking2.displayDetails();

        //Copy constructor
        System.out.println("Copy constructor:");
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayDetails();
    }
}
