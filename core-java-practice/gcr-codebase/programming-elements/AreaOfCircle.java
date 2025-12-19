
import java.util.*;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int rad = sc.nextInt();
        double ar = Math.PI * rad * rad;
        System.out.println("Area of circle: " + ar);
        sc.close();
    }
}
