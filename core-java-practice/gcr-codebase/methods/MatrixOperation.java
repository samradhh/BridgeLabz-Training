import java.util.Scanner;

public class MatrixOperation {

    static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = (int)(Math.random() * 10);
            }
        }
        return m;
    }

    static int[][] addMatrix(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    static int[][] subtractMatrix(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int r1 = a.length;
        int c1 = a[0].length;
        int c2 = b[0].length;
        int[][] res = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int rows = r.nextInt();
        int cols = r.nextInt();

        int[][] m1 = createMatrix(rows, cols);
        int[][] m2 = createMatrix(rows, cols);

        System.out.println("Matrix A");
        displayMatrix(m1);

        System.out.println("Matrix B");
        displayMatrix(m2);

        System.out.println("Addition");
        displayMatrix(addMatrix(m1, m2));

        System.out.println("Subtraction");
        displayMatrix(subtractMatrix(m1, m2));

        int[][] m3 = createMatrix(cols, rows);

        System.out.println("Matrix C");
        displayMatrix(m3);

        System.out.println("Multiplication (A x C)");
        displayMatrix(multiplyMatrix(m1, m3));
    }
}