import java.util.Scanner;

public class CollinearPoints {

    static boolean checkBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    static boolean checkByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double x1 = r.nextDouble();
        double y1 = r.nextDouble();
        double x2 = r.nextDouble();
        double y2 = r.nextDouble();
        double x3 = r.nextDouble();
        double y3 = r.nextDouble();

        boolean slopeResult = checkBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = checkByArea(x1, y1, x2, y2, x3, y3);

        if (slopeResult && areaResult) {
            System.out.println("The given points are Collinear");
        } else {
            System.out.println("The given points are Not Collinear");
        }
    }
}