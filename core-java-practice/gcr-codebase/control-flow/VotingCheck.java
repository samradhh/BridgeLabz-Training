import java.util.Scanner;

public class VotingCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age of person: ");
		int age = sc.nextInt();
		if(age >= 18) 
        {
			System.out.printf("The person's age is %d and can vote ",age);
		} 
        else 
        {
			System.out.printf("The person's age is %d and cannot vote ",age);
		}
		sc.close();
	}

}