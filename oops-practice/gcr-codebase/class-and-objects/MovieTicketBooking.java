public class MovieTicketBooking {
    static class MovieTicket {
        String movieName;
        String seatNumber;
        double price;
        boolean booked;
        MovieTicket() { booked = false; }
        void book(String movie, String seat, double price) {
            if (!booked) {
                booked = true; movieName = movie; seatNumber = seat; this.price = price;
                System.out.println("Ticket booked for movie: " + movieName);
                System.out.println("Seat Number: " + seatNumber);
            } else {
                System.out.println("House full!!! sorry..... Ticket already booked");
            }
        }
        void display() {
            if (!booked) System.out.println("Ticket have not booked yet....");
            else {
                System.out.println("Ticket booked for movie: " + movieName);
                System.out.println("Seat Number: " + seatNumber);
                System.out.println("Price: $" + price);
            }
        }
    }
    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.display();
        t.book("Dragon", "A10", 120.0);
        t.book("Dragon", "A10", 120.0);
        t.book("Dragon", "A10", 120.0);
        System.out.println("Price: $" + t.price);
        System.out.println();
        MovieTicket t2 = new MovieTicket();
        t2.book("Dragon", "A10", 120.0);
        t2.display();
    }
}