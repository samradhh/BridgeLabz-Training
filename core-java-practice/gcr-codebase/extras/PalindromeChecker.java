import java.util.Scanner;
public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input=r.nextLine();
        String reversed="";
        for(int i=input.length()-1;i>=0;i--){
            reversed+=input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println(input+" is a palindrome");
        } else {
            System.out.println(input+" is not a palindrome");
        }
    }
}