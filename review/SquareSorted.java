import java.util.Arrays;
import java.util.Scanner;

public class SquareSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] square = new int[n];
        System.out.println("Enter sorted array elements which include both negative and positive numbers = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            square[i] = arr[i] * arr[i];
        }
        Arrays.sort(square);
        System.out.println("Squares in sorted order:");
        for (int i = 0; i < n; i++) {
            System.out.print(square[i] + " ");
        }
    }
}
