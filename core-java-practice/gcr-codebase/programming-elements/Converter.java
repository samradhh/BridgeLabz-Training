import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm = ");
        double h = sc.nextDouble();
        double cmpinch = 2.54;
        int inchpf = 12;
        int totalInches = (int) Math.round(h / cmpinch);
        int fe = totalInches / inchpf;
        int inch = totalInches % inchpf;
        System.out.println("Your Height in cm is " + h + " while in feet is " + fe + " and inches is " + inch);
        sc.close();
    }
}