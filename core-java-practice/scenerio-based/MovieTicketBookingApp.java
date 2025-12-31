import java.util.Scanner;

public class Movie_Ticket_booking_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        double actionPrice = 300;
        double dramaPrice = 250;
        double comedyPrice = 200;

        double goldMultiplier = 1.5;
        double silverMultiplier = 1.0;

        double popcornPrice = 120;
        double sodaPrice = 60;
        double nachosPrice = 150;

        while (run) {
            System.out.println("\nNew Customer");
            System.out.println("1 Action");
            System.out.println("2 Drama");
            System.out.println("3 Comedy");
            System.out.print("Choose movie: ");
            String movieInput = sc.nextLine();

            String movie;
            double basePrice;

            if (movieInput.equals("1")) {
                movie = "Action";
                basePrice = actionPrice;
            } else if (movieInput.equals("2")) {
                movie = "Drama";
                basePrice = dramaPrice;
            } else {
                movie = "Comedy";
                basePrice = comedyPrice;
            }

            System.out.print("Seat type (gold/silver): ");
            String seatInput = sc.nextLine().toLowerCase();

            String seat;
            double seatRate;

            if (seatInput.equals("gold")) {
                seat = "Gold";
                seatRate = goldMultiplier;
            } else {
                seat = "Silver";
                seatRate = silverMultiplier;
            }

            System.out.print("Number of tickets: ");
            int tickets;
            try {
                tickets = Integer.parseInt(sc.nextLine());
                if (tickets < 1) tickets = 1;
            } catch (Exception e) {
                tickets = 1;
            }

            double snacksTotal = 0;
            System.out.print("Want snacks (y/n): ");
            String snackChoice = sc.nextLine().toLowerCase();

            if (snackChoice.equals("y")) {
                System.out.println("1 Popcorn");
                System.out.println("2 Soda");
                System.out.println("3 Nachos");
                System.out.print("Enter choices: ");
                String input = sc.nextLine();

                if (!input.isEmpty()) {
                    String[] arr = input.split(",");
                    for (String s : arr) {
                        if (s.trim().equals("1")) snacksTotal += popcornPrice;
                        if (s.trim().equals("2")) snacksTotal += sodaPrice;
                        if (s.trim().equals("3")) snacksTotal += nachosPrice;
                    }
                }
            }

            double ticketPrice = basePrice * seatRate;
            double ticketTotal = ticketPrice * tickets;
            double total = ticketTotal + snacksTotal;

            double discount = 0;
            if (total > 1000) {
                discount = total * 0.1;
                total -= discount;
            }

            System.out.println("\nSummary");
            System.out.println("Movie: " + movie);
            System.out.println("Seat: " + seat);
            System.out.println("Tickets: " + tickets);
            System.out.println("Ticket Cost: " + ticketTotal);
            System.out.println("Snacks Cost: " + snacksTotal);
            System.out.println("Final Amount: " + total);

            System.out.print("Next customer (y/n): ");
            run = sc.nextLine().equalsIgnoreCase("y");
        }

        System.out.println("Thank you");
        sc.close();
    }
}