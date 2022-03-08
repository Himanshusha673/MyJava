import java.util.Scanner;
public class MatrixMultiplictaion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr No. of Rows of first matrix");
        int n1 = sc.nextInt();
        System.out.println("Enetr the no. of columns of first matrixn");
        int m1 = sc.nextInt();
        int[][] arr1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enetr No. of Rows of Second matrix");
        int n2 = sc.nextInt();
        System.out.println("Enetr the no. of columns of Second matrixn");
        int m2 = sc.nextInt();
        int[][] arr2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (m1 == n2) {
            MatrixMultiply(arr1, arr2, m2);
        } else {
            System.out.println("invalid Input");
        }
    }

    private static void MatrixMultiply(int[][] arr1, int[][] arr2, int m2) {
        int[][] arr3 = new int[arr1.length][m2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < m2; j++) {
                int c = 0;
                for (int k = 0; k < arr2.length; k++) {
                    c = arr1[i][k] * arr2[k][j] + c;
                }
                arr3[i][j] = c;
            }
        }
        printMatrix(arr3, m2);

    }

    public static void printMatrix(int[][] arr, int m) {
        for (int[] ints : arr) {
            for (int j = 0; j < m; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
