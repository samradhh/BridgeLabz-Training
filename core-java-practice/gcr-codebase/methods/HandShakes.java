import java.util.*;
public class HandShakes {
    public static int calculate(int n){
        int total=(n*(n-1))/2;
        return total;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        System.out.println("The total handshakes is"+(calculate(students)));
    }
}