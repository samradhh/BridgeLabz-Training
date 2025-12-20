import java.util.Scanner;

public class FriendsAgeHeight
 {
	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Amar's age = ");
		int AmarAge = sc.nextInt();

		System.out.print("Enter Akbar's age = ");
		int AkbarAge = sc.nextInt();

		System.out.print("Enter Anthony's age = ");
		int AnthonyAge = sc.nextInt();

		System.out.print("Enter Amar's height = ");
		int AmarHeight = sc.nextInt();

		System.out.print("Enter Akbar's height = ");
		int AkbarHeight = sc.nextInt();

		System.out.print("Enter Anthony's height = ");
		int AnthonyHeight = sc.nextInt();

		int minAge = Math.min(AmarAge, Math.min(AnthonyAge, AkbarAge));
		int maxHeight = Math.max(AmarHeight, Math.max(AnthonyHeight, AkbarHeight));

		System.out.printf("Youngest friend is %s%n",AmarAge == minAge ? "Amar" : AkbarAge == minAge ? "Akbar" : "Anthony");

		System.out.printf("Tallest friend is %s%n",AmarHeight == maxHeight ? "Amar" : AkbarHeight == maxHeight ? "Akbar" : "Anthony");
        
		sc.close();
	}
}