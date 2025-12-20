import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year to check leap year or not :");
		int y = sc.nextInt();
        
		if (y < 1582)
         {
			System.out.println("Year must be 1582 or later (Gregorian calendar)");
		} 
        else
         {
			if (y % 400 == 0) 
            {
				System.out.println("Year is a Leap Year");
			} 
            else if (y % 100 == 0) 
            {
				System.out.println("Year is not a Leap Year");
			} 
            else if (y % 4 == 0) 
            {
				System.out.println("Year is a Leap Year");
			} 
            else
             {
				System.out.println("Year is not a Leap Year");
			}
		}
		sc.close();
	}
}