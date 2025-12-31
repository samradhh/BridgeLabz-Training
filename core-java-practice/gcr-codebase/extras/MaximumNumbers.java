import java.util.Scanner;
public class Maximum_Number {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int first=r.nextInt();
        int second=r.nextInt();
        int third=r.nextInt();
        if(first>=second && first>=third){
            System.out.println(first+" is the maximum number");
        }
        else if(second>=first && second>=third){
            System.out.println(second+" is the maximum number");
        }
        else{
            System.out.println(third+" is the maximum number");
        }
        
    }

}