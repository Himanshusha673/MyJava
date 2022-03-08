package PepcodePractise;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        inverse(arr);
    }

    private static void inverse(int[] arr) {
        int [] a2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
          a2[arr[i]]=i;
        }
        System.out.println(Arrays.toString(a2));
    }
}
