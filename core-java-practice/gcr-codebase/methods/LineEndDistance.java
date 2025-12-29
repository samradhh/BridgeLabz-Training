import java.util.Scanner;

public class LineEndDistance {

    static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }

    static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double x1 = r.nextDouble();
        double y1 = r.nextDouble();
        double x2 = r.nextDouble();
        double y2 = r.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance = %.2f%n", distance);
        System.out.printf("Equation of Line: y = %.2fx + %.2f%n", line[0], line[1]);
    }
}