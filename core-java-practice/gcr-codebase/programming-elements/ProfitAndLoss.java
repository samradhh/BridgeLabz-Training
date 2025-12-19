import java.util.Scanner;

public class ProfitAndLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price in INR: ");
        int costpr = sc.nextInt();
        System.out.print("Enter selling price in INR: ");
        int sellpr = sc.nextInt();
        System.out.printf("The Cost Price int INR %d and Selling Price in INR %d%nThe Profit is INR %d and the Profit Percentage is %.2f", costpr, sellpr, (sellpr - costpr), (double) (sellpr - costpr) / costpr * 100);
    }
}
