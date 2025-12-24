import java.util.Scanner;

public class SubsStringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String subCharAt = createSubstring(text, start, end);
        String subBuiltIn = text.substring(start, end);

        boolean result = compareStrings(subCharAt, subBuiltIn);

        if (result) {
            System.out.println("Both substrings are equal");
        } else {
            System.out.println("Substrings are not equal");
        }

        sc.close();
    }

    static String createSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + s.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}