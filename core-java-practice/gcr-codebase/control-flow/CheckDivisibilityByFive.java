import java.util.Scanner;

public class CheckDivisibilityByFive 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.printf("Is the number %d divisible by 5: %s", a, a % 5 == 0 ? "Yes" : "No");
		sc.close();
	}

}