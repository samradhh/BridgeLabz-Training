import java.util.Scanner;

public class parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square = ");
        double per = sc.nextDouble();
        double sd = per / 4.0;
        System.out.println("The length of the side is " + sd + " whose perimeter is " + per);
        sc.close();
    }
}