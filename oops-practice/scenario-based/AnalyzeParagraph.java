import java.util.*;
class AnalyzeParagraph{
    public static void analyzeParagraph(String str){
        String word[]=str.split("\\s+");
        System.out.println("Total words are :"+word.length);
        Arrays.sort(word,(x,y)->Integer.compare(x.length(),y.length()));
        System.out.println("The Longest word id :"+word[word.length-1]);
    }
    public static String replaceWord(String input,String toBeReplaced,String string){
       input= input.replaceAll(toBeReplaced,string);
        return input;
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the Paragraph :");
        String input=r.nextLine();
        System.out.println(" ");
        if (input == null || input.trim().isEmpty()){
            System.out.print("Empty Paragraph"); 
            return;
        }
        analyzeParagraph(input);
        System.out.print("\nEnter the Wrong Word :");
        String wrongWord=r.next();
        System.out.print("\nenter the replaced word :");
        String rightWord=r.next();
        System.out.print(replaceWord(input,wrongWord,rightWord));
    }
}