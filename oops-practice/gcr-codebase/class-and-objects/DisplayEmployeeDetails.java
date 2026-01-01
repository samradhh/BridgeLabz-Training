import java.util.*;
public class DisplayEmployeeDetails {
    String name;
    int id;
    int salary;
    public DisplayEmployeeDetails(String name, int id,int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public static void displayEmployeeDetails(DisplayEmployeeDetails emp) {
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee Salary: " + emp.salary);
            System.out.println("---------------------------");
    }   
    public static void main(String[] args) {
        DisplayEmployeeDetails emp1 = new DisplayEmployeeDetails("Alice", 101, 50000);
        DisplayEmployeeDetails emp2 = new DisplayEmployeeDetails("Bob", 102, 60000);
        DisplayEmployeeDetails emp3 = new DisplayEmployeeDetails("Charlie", 103, 55000);

        List<DisplayEmployeeDetails> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

       for (DisplayEmployeeDetails emp : employees) {
            displayEmployeeDetails(emp);
        }
    }
}