import java.util.Scanner;

public class SplitCompare 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] wordsCharAt = splitUsingCharAt(text);
        String[] wordsBuiltIn = text.split(" ");

        boolean result = compareStringArrays(wordsCharAt, wordsBuiltIn);

        System.out.println("Words using charAt():");
        for (String word : wordsCharAt) 
        {
            System.out.println(word);
        }

        System.out.println("Words using split():");
        for (String word : wordsBuiltIn) 
        {
            System.out.println(word);
        }

        if (result) 
        {
            System.out.println("Both methods produce the same result.");
        } 
        else
         {
            System.out.println("Methods produce different results.");
        }

        sc.close();
    }

    static int getStringLength(String s) 
    {
        int count = 0;
        try 
        {
            while (true)
             {
                s.charAt(count);
                count++;
            }
        }
         catch (IndexOutOfBoundsException e) 
        {
        }
        return count;
    }

    static String[] splitUsingCharAt(String s) 
    {
        int length = getStringLength(s);
        int spaceCount = 0;

        
        for (int i = 0; i < length; i++) 
        {
            if (s.charAt(i) == ' ') 
            {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                words[wordIndex] = s.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }
        words[wordIndex] = s.substring(start, length);

        return words;
    }

    static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}