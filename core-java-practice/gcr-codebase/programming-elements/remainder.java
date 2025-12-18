import java.util.Scanner;

public class remainder {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number = ");
        int n2 = sc.nextInt();
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d", n1 / n2, n1 % n2, n1, n2);
        sc.close();
    }
}
