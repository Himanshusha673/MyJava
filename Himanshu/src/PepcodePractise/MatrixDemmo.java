package PepcodePractise;

import java.util.Scanner;

public class MatrixDemmo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr No. of Rows");
        int n=sc.nextInt();
        System.out.println("Enetr the no. of columns" );
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(arr[0].length);
        printMatrix(arr,m);

    }

    private static void printMatrix(int[][] arr,int m) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
