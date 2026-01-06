import java.util.*;
public class StringFormatter {
    public static String formatString(String text) {
    if (text == null || text.trim().isEmpty()) {
        return text;
    }
    text = text.trim().replaceAll("\\s+", " ");
    StringBuilder result = new StringBuilder();
    boolean capitalizeNext = true;
    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        if (capitalizeNext && Character.isLetter(ch)) {
            result.append(Character.toUpperCase(ch));
            capitalizeNext = false;
        } else {
            result.append(ch);
        }
        if (ch == '.' || ch == '?' || ch == '!'||ch==' ') {
            capitalizeNext = true;
            if (i + 1 < text.length() && text.charAt(i + 1) != ' ') {
                result.append(' ');
            }
        }
    }
    return result.toString().trim();
}

    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=r.nextLine();
        System.out.println(formatString(input));
    }
}