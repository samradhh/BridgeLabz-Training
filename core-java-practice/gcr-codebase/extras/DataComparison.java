import java.time.LocalDate;
import java.util.Scanner;

public class DataComparison {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-mm-dd): ");
        String firstDateInput = r.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput);

        System.out.println("Enter the second date (yyyy-mm-dd): ");
        String secondDateInput = r.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }

        r.close();
    }
}