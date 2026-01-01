public class HotelBooking {
    private String GuestName;
    private String RoomType;
    private int Nights;  
    // Default constructor
    public HotelBooking() {
        this.GuestName = "Guest";
        this.RoomType = "Standard";
        this.Nights = 1;
    } 
    // Parameterized constructor 
    public HotelBooking(String guestName, String roomType, int nights) {
        this.GuestName = guestName;
        this.RoomType = roomType;
        this.Nights = nights;
    }
    //copy constructor
    public HotelBooking(HotelBooking other) {
        this.GuestName = other.GuestName;
        this.RoomType = other.RoomType;
        this.Nights = other.Nights;
    } 
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + GuestName);
        System.out.println("Room Type: " + RoomType);
        System.out.println("Number of Nights: " + Nights);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2); 
        booking1.displayBookingDetails();
        booking2.displayBookingDetails();
        booking3.displayBookingDetails();
    }
}