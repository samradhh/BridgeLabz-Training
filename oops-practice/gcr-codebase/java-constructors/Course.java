import java.util.Scanner;

public class Course {
    String courseName;
    String duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, String duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name){
        instituteName = name;
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Course c1 = new Course("Java", "3 months", 15000);
        c1.displayCourseDetails();
        Course.updateInstituteName("New Institute");
        c1.displayCourseDetails();
    }
}