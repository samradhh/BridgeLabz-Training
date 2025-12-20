import java.util.Scanner;

public class EmployeesBonus 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary: ");
		int sal = sc.nextInt();
		System.out.print("Enter years of service: ");
		int Year = sc.nextInt();
		System.out.printf(Year > 5 ? "Year of service " + Year + " and salary is " + sal + " then bonus is " + (sal * 0.05): "Year of service less than 5");
		sc.close();
	}
}