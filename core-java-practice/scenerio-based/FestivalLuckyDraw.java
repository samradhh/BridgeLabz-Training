import java.util.Scanner;

public class Festval_Lucky_Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("* Festival Lucky Draw");
        System.out.println("At Diwali mela, each visitor draws a number.");
        
        while (true) {
            System.out.print("Enter the number of visitors: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                continue;
            }
            
            int visitors = scanner.nextInt();
            
            if (visitors <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                continue;
            }
            
            for (int i = 1; i <= visitors; i++) {
                System.out.print("Visitor " + i + " enters number: ");
                
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine();
                    i--;
                    continue;
                }
                
                int number = scanner.nextInt();
                
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("Visitor " + i + " wins a gift!");
                } else {
                    System.out.println("Visitor " + i + " does not win.");
                }
            }
            
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.next().toLowerCase();
            
            if (!response.equals("yes")) {
                break;
            }
        }
        
        scanner.close();
        System.out.println("Thank you for participating!");
    }
}