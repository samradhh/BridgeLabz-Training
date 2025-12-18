import java.util.Scanner;

public class finalprice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of unit in INR = ");
        int unitpr = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quant = sc.nextInt();
        System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d", unitpr * quant, quant, unitpr);
        sc.close();
    }
}