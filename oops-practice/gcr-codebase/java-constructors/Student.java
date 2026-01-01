import java.util.Scanner;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA(){
        return CGPA;
    }

    public void setCGPA(double c){
        this.CGPA = c;
    }

    public void display(){
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Student s = new Student(101, "Bob", 8.5);
        s.display();
        s.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s.getCGPA());
    }
}