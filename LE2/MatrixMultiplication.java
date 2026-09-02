import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

    public static int[][] MultiplyMatrix(int[][] A, int[][] B) throws MatrixMismatchException {
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;

        if(c1 != r2)
            throw new MatrixMismatchException("Invalid Multiplication");

        int[][] result = new int[r1][c2];

        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k]*B[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1, c1;
        System.out.println("Enter rows and cols for Matrix A: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter the elements of Matrix A: ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        int r2, c2;
        System.out.println("Enter rows and cols for Matrix B: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("Enter the elements of Matrix B: ");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        try {
            int[][] result = MultiplyMatrix(A, B);

            System.out.println("Resulting Matrix:");
            for(int[] rows : result)
                System.out.println(Arrays.toString(rows));

        } catch (MatrixMismatchException e) {
            System.out.println("Error :" + e.getMessage());
        }

        sc.close();
    }
}