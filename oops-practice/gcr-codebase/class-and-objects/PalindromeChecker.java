
public class PalindromeChecker {
    static class PalindromeCheckerClass {
        String text;
        PalindromeCheckerClass(String t) { text = t; }
        boolean isPalindrome() {
            String s = text.replaceAll("\\s+", "").toLowerCase();
            StringBuilder sb = new StringBuilder(s);
            return s.equals(sb.reverse().toString());
        }
        void display() {
            if (isPalindrome()) System.out.println(text + " is palindrome");
            else System.out.println(text + " is not Palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromeCheckerClass p1 = new PalindromeCheckerClass("A man a plan a canal Panama");
        PalindromeCheckerClass p2 = new PalindromeCheckerClass("Hello");
        p1.display();
        p2.display();
    }
}
