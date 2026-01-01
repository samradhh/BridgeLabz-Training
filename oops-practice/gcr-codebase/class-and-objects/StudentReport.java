public class StudentReport {
    static class Student {
        String name;
        String rollNumber;
        double m1, m2, m3;
        Student(String name, String roll, double m1, double m2, double m3) {
            this.name = name;
            this.rollNumber = roll;
            this.m1 = m1; this.m2 = m2; this.m3 = m3;
        }
        String grade() {
            double avg = (m1 + m2 + m3) / 3.0;
            if (avg >= 80) return "A";
            else if (avg >= 70) return "B";
            else if (avg >= 50) return "C";
            else return "F";
        }
        void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Student RollNumber: " + rollNumber);
            System.out.println("Student Marks:");
            System.out.println("Mark1: " + m1);
            System.out.println("Mark2: " + m2);
            System.out.println("Mark3: " + m3);
            System.out.println("Grade " + grade());
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Thamarai", "ECE001", 80.0, 70.0, 75.0);
        Student s2 = new Student("Kannan", "CSC002", 60.0, 65.0, 50.0);
        s1.display();
        System.out.println();
        s2.display();
    }
}