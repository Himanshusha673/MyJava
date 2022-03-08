package PepcodePractise;
import java.util.Scanner;
public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (d < arr[mid]) {
                j = mid - 1;
            } else if (d > arr[mid]) {
                i = mid + 1;
            } else {
                i = mid - 1;
                j = mid - 1;
            }

        }
        System.out.println("first index is"+i);
                 i = 0;
             j = arr.length - 1;
            while (i <= j) {
                int mid = (i + j) / 2;
                if (d < arr[mid]) {
                    j = mid - 1;
                } else if (d > arr[mid]) {
                    i = mid + 1;
                } else{
                    i = mid + 1;
                j = mid + 1;
            }
                }
        System.out.println("Last Index is "+j);
    }



        }

