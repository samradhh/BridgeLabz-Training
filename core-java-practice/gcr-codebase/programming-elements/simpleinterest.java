
import java.util.Scanner;

public class simpleinterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int amou = sc.nextInt();
        System.out.print("Enter Rate of interest: ");
        float rat = sc.nextFloat();
        System.out.print("Enter Time period in years: ");
        int time = sc.nextInt();
        float simpleinter = (amou * rat * time) / 100;
        System.out.print("Simple Interest is: " + simpleinter);
        sc.close();
    }
}
