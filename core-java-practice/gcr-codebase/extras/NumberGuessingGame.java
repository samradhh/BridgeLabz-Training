import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 7;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        int targetNumber = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                attempt--;
                continue;
            }

            int guess = scanner.nextInt();

            if (guess < lowerBound || guess > upperBound) {
                System.out.println("Your guess is out of bounds. Please guess a number between " + lowerBound + " and " + upperBound + ".");
                attempt--;
                continue;
            }

            if (guess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempt == maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
            }
        }

        scanner.close();
        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}