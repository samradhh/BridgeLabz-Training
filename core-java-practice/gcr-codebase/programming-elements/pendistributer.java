import java.util.Scanner;

public class pendistributer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // pen entry
        System.out.println("Enter number of pens = ");
        int pen = sc.nextInt(); // students entry
        System.out.println("Enter number of students = ");
        int students = sc.nextInt();
        System.out.printf("The Pen Per Student is %d and the remaining pen and distribution is %d", pen / students, pen % students);
        sc.close();
    }
}