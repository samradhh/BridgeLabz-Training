import java.util.Scanner;

public class NumberOfDigits 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int digit = 0;
		while (num > 0)
         {
			num /= 10;
			digit++;
		}
		System.out.printf("Number of digits number is %d", digit);

		sc.close();
	}
}