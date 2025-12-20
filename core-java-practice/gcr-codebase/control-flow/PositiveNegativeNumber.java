import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		System.out.printf("If the number is positive, print %s",
				number <= 0 ? number == 0 ? "Zero" : "Negative" : "Positive");
		sc.close();
	}
}