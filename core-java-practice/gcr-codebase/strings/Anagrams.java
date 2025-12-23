import java.util.*;
public class Anagrams
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String text1=sc.next();
        String text2=sc.next();
        int freqtext1[]=new int[26];
        if(text1.length()!=(text2.length())){
            System.out.println("Not a anagram");
            return;
        }
        for(char i:text1.toCharArray())
        {
            freqtext1[i-'a']++;
        }
        int freqtext2[]=new int[26];
        for(char i:text2.toCharArray())
        {
            freqtext2[i-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freqtext1[i]!=freqtext2[i])
            {
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
    }
}