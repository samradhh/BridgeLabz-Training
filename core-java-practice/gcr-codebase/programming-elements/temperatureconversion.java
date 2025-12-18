
import java.util.*;

public class temperatureconversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in degree:");
        int temperat= sc.nextInt();
        int convert = (temperat * (9 / 5)) + 32;
        System.out.println("After conversion: " + convert);
        sc.close();
    }
}
