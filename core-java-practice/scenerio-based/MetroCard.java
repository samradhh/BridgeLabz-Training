import java.util.Scanner;

public class Metro_card
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int balance = 200; 
        System.out.println("Welcome to Delhi Metro Smart Card System");
        System.out.println("Your starting balance: ₹" + balance);

        while (balance > 0)
         {
            System.out.print("\nEnter distance traveled (km) or 'q' to quit: ");
            String input = sc.next();

            if (input.equalsIgnoreCase("q")) 
            {
                System.out.println("You exited the metro system. Thank you!");
                break;
            }

            double distance;
            try 
            {
                distance = Double.parseDouble(input);
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a number or 'q'.");
                continue;
            }

            int fare = (distance <= 5) ? 10 : (distance <= 12) ? 20 : 40;

            if (balance >= fare) 
            {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare + ". Remaining balance: ₹" + balance);
            } 
            else 
            {
                System.out.println("Insufficient balance! Please recharge your card.");
                break;
            }
        }

        if (balance == 0) {
            System.out.println("Your balance is exhausted. Please recharge to continue.");
        }

        sc.close();
    }
}