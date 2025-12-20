import java.util.Scanner;

public class IsSmallest 
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

		System.out.printf("Is the first number the smallest? %s", num1 < num2 ? num1 < num3 ? "Yes" : "No" : "No");
        
		sc.close();
	}

}