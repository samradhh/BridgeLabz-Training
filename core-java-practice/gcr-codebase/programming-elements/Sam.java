import java.util.Scanner;

public class Sam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in Physics:");
        int phy = sc.nextInt();
        System.out.println("Enter marks obtained in Chemistry:");
        int chem = sc.nextInt();
        System.out.println("Enter marks obtained in Mathematics:");
        int math = sc.nextInt();
        double res = (phy + chem + math) / 3.0;
    System.out.println("Sam's average mark in PCM is " + res);
    sc.close();
    }
}