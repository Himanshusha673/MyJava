package PepcodePractise;

import java.util.Scanner;
public class ReverseOfArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         reverse(arr);
        print(arr);
    }

    private static void print(int[] arr) {
           for(int val:arr){
               System.out.println(val);
           }

    }

    private static void reverse(int[] arr) {
        int i=0;
        int j=arr.length-1;
        if(arr.length%2==0) {
            while (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }else{
                while(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }

    }
}
