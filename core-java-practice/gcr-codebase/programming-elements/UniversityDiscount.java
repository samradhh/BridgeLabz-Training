import java.util.Scanner;

public class UniversityDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fees of university = ");
        int fee = sc.nextInt();
        System.out.print("Enter the discount = ");
        int disPer = sc.nextInt();
        System.out.printf("The fees you have to pay by subtracting the discount from the fee: %.2f", (double) fee - fee / disPer);
        sc.close();
    }
}