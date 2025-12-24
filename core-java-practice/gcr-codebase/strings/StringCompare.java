import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean resultCharAt = compareUsingCharAt(s1, s2);
        boolean resultEquals = s1.equals(s2);

        if (resultCharAt == resultEquals)
         {
            System.out.println("Both methods give the same result: " + resultCharAt);
        }
         else
          {
            System.out.println("Results are different");
        }

        sc.close();
    }

    static boolean compareUsingCharAt(String a, String b)
     {

        if (a.length() != b.length())
         {
            return false;
        }

        for (int i = 0; i < a.length(); i++)
         {
            if (a.charAt(i) != b.charAt(i))
             {
                return false;
            }
        }

        return true;
    }
}