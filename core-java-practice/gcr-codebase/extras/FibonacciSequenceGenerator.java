import java.util.Scanner;
public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms=r.nextInt(); 
        int first=0, second=1;
        System.out.println("Fibonacci Sequence:");
        for(int i=1;i<=terms;i++){
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }   
    }
}