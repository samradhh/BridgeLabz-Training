import java.util.*;
public class AreaOfACircle {
    double radius;
    public AreaOfACircle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        AreaOfACircle circle = new AreaOfACircle(radius);
        double area = circle.calculateArea();
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);
        scanner.close();
    }
}