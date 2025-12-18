import java.util.Scanner;

public class triangle
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base = ");
        int b = sc.nextInt();
        System.out.print("Enter height = ");
        int h = sc.nextInt();
        System.out.printf("Area of triangle %.2f while in inches is %.2f", (double) (0.5 * b * h), (double) (0.5 * b * h) / 2.54);
        sc.close();
    }
}

