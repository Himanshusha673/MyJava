import java.util.Scanner;

public class BinarySearch {
    //Arrays must be in sorted order
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

        while (i <=j){
            int mid = (i + j) / 2;
            if(d<arr[mid]){
                i=0;
                j=mid-1;
            }else if(d>arr[mid]) {
                i = mid + 1;
                j = arr.length - 1;
            } else {
                System.out.println("presen at" +(i+1)+ "th position");
                return;
            }
        }
        System.out.println(d+"is Not present in this array");
    }
}
