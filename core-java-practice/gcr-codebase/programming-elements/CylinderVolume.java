
import java.util.*;

public class CylinderVolume {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radi = sc.nextInt();
        System.out.println("Enter height: ");
        int heigh = sc.nextInt();
        double volu = Math.PI * Math.pow(radi, 2) * heigh;
        System.out.println("Volume of cylinder: " + volu);
        sc.close();
    }
}
