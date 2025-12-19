import java.util.Scanner;

public class HandshakesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students = ");
        int studs = sc.nextInt();
        System.out.printf("Number of possible handshakes %d", (studs * (studs - 1) / 2));
        sc.close();
    }
}