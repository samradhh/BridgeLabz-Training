import java.util.Scanner;

public class IsLargest 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number = ");
        int num1 = sc.nextInt();

		System.out.print("Enter second number = ");
		int num2 = sc.nextInt();

		System.out.print("Enter third number = ");
		int num3 = sc.nextInt();

		int result = Math.max(num1, Math.max(num2, num3));

		System.out.printf("Is the first number the largest? %s\r\n" + "Is the second number the largest? %s\r\n" + "Is the third number the largest? %s\r\n", result == num1 ? "Yes" : "No", result == num2 ? "Yes" : "No", result == num3 ? "Yes" : "No");

		sc.close();
	}
}