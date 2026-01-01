public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        System.out.println("Radius: " + defaultCircle.getRadius());
        System.out.println("Area: " + defaultCircle.getArea());
        System.out.println("Circumference: " + defaultCircle.getCircumference());

        Circle customCircle = new Circle(5.0);
        System.out.println("\nCustom Circle:");
        System.out.println("Radius: " + customCircle.getRadius());
        System.out.println("Area: " + customCircle.getArea());
        System.out.println("Circumference: " + customCircle.getCircumference());
    }
}