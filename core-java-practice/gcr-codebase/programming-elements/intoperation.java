import java.util.Scanner;
public class intoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number = ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number = ");
        int n3 = sc.nextInt();
        System.out.printf("Operations:\n" + "a + b * c = %d\n" + "a * b + c = %d\n" + "c + a / b = %d\n" + "a %% b + c = %d\n", (n1 + n2 * n3), (n1 * n2 + n3), (n3 + n2 / n1), (n1 % n2 * n3));
        sc.close();
    }
}