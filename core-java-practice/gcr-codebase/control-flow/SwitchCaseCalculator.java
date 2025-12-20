import java.util.Scanner;

public class SwitchCaseCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		System.out.print("Enter operator: ");
		String operator = sc.next();
		switch (operator)
         {
		case "+": 
        {
			System.out.println(a + b);
			break;
		}
		case "-": 
        {
			System.out.println(a - b);
			break;
		}
		case "*": 
        {
			System.out.println(a * b);
			break;
		}
		case "/":
       {
			System.out.println(a / b);
			break;
		}
		default:
			System.out.println("unexpected operator");
		}
		sc.close();
	}
}