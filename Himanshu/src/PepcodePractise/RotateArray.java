package PepcodePractise;

import java.util.Scanner;

public class RotateArray {
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){

      int n=a.length;
      if(k>=0) {
          k = k % a.length;
          reverse(a, 0, n - k - 1);
          reverse(a, n - k, n - 1);
          reverse(a, 0, n - 1);
      }
      else {
          k = k + a.length;
          if(k<n){
              k=k%n;
          }

          reverse(a, 0, n - k - 1);
          reverse(a, n - k, n - 1);
          reverse(a, 0, n - 1);
      }
  }

    private static void reverse(int[] a, int li, int ri) {
        while(li < ri){
            int temp = a[li];
            a[li]= a[ri];
            a[ri] = temp;
            li++;
            ri--;
            }
        }

    public static void main(String[] args)  {
    Scanner br = new Scanner(System.in);

    int n = br.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] =br.nextInt();
    }
    int k;
        while( true ) {
            System.out.println("press:1- for Right rotate");
            System.out.println("press:2- for Left rotate");
            System.out.println("press:3- for display");
            System.out.println("press:4 or any key for Exit");
            int m=br.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Enter A rotation Index by which you want to rotate");
                    k=br.nextInt();
                    k = -k;
                    rotate(a, k);
                    break;
                case 2:
                    System.out.println("Enter A rotation Index by which you want to rotate");
                    k=br.nextInt();
                    rotate(a, k);
                    break;
                case 3:
                    display(a);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid number ");
                    return;
            }
        }

 }

}