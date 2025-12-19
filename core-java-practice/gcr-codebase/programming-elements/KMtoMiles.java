
import java.util.Scanner;

public class kmtomiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        int k = sc.nextInt();
        double mil = k * 0.621371;
        System.out.println("Distance in miles: " + mil);
        sc.close();
    }
}
