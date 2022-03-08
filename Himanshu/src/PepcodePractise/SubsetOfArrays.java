package PepcodePractise;

import java.util.Scanner;

public class SubsetOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <(int)Math.pow(2, arr.length); i++) {
            int temp=i;
            String bin="";
            for (int j = arr.length-1; j>=0; j--) {
             int r=temp%2;
             temp=temp/2;
              if(r==0)
              { bin = "-\t" + bin;}
              else {
                  bin = arr[j] + "\t" + bin;
              }
            }
            System.out.println(bin);
        }
    }
}
