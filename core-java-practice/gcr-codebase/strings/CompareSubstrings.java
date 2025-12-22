import java.util.Scanner;

public class CompareSubstrings
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String mainString = sc.next();
		System.out.print("Enter starting index = ");
		int start = sc.nextInt();
		System.out.print("Enter ending index = ");
		int end = sc.nextInt();
		String subString = mainString.substring(start, end);
		StringBuilder charString = new StringBuilder();
		for (int i = start; i < end; i++)
		{
			charString.append(mainString.charAt(i));
		}
		System.out.printf("Substring using substring() method is %s%n", subString);
		System.out.printf("Substring using charAt() method is %s%n", charString);
		System.out.printf("Substring using charAt() and substring() are %s",
				subString.equals(charString.toString()) ? "equal" : "not equal");
		sc.close();
		
	}
}
