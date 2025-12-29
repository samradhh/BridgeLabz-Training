import java.util.Random;
import java.util.Scanner;

class MatrixOperation2 {

    static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = rand.nextInt(9) + 1;
            }
        }
        return m;
    }

    static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / (double) det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / (double) det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / (double) det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / (double) det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;

        return inv;
    }

    static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    static void displayMatrix(double[][] m) {
        if (m == null) {
            System.out.println("Inverse not possible");
            return;
        }
        for (double[] row : m) {
            for (double v : row) {
                System.out.printf("%.2f ", v);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Enter matrix size (2 or 3): ");
        int n = r.nextInt();

        int[][] matrix = createRandomMatrix(n, n);

        System.out.println("Matrix:");
        displayMatrix(matrix);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix));

        if (n == 2) {
            System.out.println("Determinant: " + determinant2x2(matrix));
            System.out.println("Inverse:");
            displayMatrix(inverse2x2(matrix));
        }

        if (n == 3) {
            System.out.println("Determinant: " + determinant3x3(matrix));
            System.out.println("Inverse:");
            displayMatrix(inverse3x3(matrix));
        }
    }
}