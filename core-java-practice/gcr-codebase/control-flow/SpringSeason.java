import java.util.Scanner;

public class SpringSeason 
{

	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number: ");
		int month = sc.nextInt();
		System.out.print("Enter date: ");
		int day = sc.nextInt();

		if (month > 3 && month < 6) 
        {
			System.out.print("Its a Spring Season");
		} 
        else if (month == 3 && day > 19)
         {
			System.out.print("Its a Spring Season");
		} 
        else if (month == 6 && day < 21)
         {
			System.out.print("Its a Spring Season");
		} 
        else
         {
			System.out.print("Not a Spring Season");
		}
        
		sc.close();
	}

}