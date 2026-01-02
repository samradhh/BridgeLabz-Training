public class Student {
    private int rollNumber;
    private String name;
    private double grad;
    private static int studentCount = 0;
    private final String schoolName;
    public Student(int rollNumber, String name, double grad) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grad = grad;
        this.schoolName = "Gla University";
        studentCount++;
    }
    public static int getStudentCount() {
        return studentCount;
    }
    public String updateGrad(double newGrad, int rollNumber) {
        Student student = null;
        if (this.rollNumber == rollNumber) {
            student = this;
        }
        else{
            return "Roll number not found.";
        }
        this.grad = newGrad;
        return "Graduation year updated to: " + newGrad;
    }
    public void displayStudentInfo() {
        if(this instanceof Student) {
            System.out.println("School: " + schoolName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Graduation Year: " + grad);
            System.out.println("---------------------------");
        }
        else{
            System.out.println("Not a valid instance");
        }
    }
    public static void main(String[] args) {
        Student stu1 = new Student(1, "John Doe", 2023);
        Student stu2 = new Student(2, "Jane Smith", 2024);
        stu1.displayStudentInfo();
        stu2.displayStudentInfo();
        System.out.println("Total Students: " + Student.getStudentCount());
        System.out.println(stu1.updateGrad(2025, 1));
        stu1.displayStudentInfo();
    }
}