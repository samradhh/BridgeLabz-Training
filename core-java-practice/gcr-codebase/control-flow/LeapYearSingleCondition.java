import java.util.Scanner;

public class LeapYearSingleCondition 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int y = sc.nextInt();

		if (y < 1582) 
        {
			System.out.println("Enter a valid year");
		}

		if ((y % 4 == 0 && y % 100 != 0) || (y % 4 == 0 && y % 100 == 0 && y % 400 == 0))
         {
			System.out.printf("%d is a leap year", y);
		}
         else 
        {
			System.out.printf("%d is not a leap year", y);
		}

		sc.close();
	}
}