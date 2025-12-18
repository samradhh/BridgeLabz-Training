import java.util.Scanner;
public class harry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the birth year of harry __");
        int year = sc.nextInt();
        System.out.print("Harry's age in 2024 is "+(2024-year));
        sc.close();
    }
}