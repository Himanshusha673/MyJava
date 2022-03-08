package PepcodePractise;
import java.util.Scanner;
public class DiffOfArrays {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2=sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
       int [] diff=new int[n2];
       int i=a2.length-1;
       int j=a1.length-1;
       int k=diff.length-1;
       int carr=0;
        while(k>=0){
           int d=0;
            int a1val=j>=0?a1[j]:0;
           if((a2[i]+carr)>=a1val){
               d=a2[i]+carr-a1val;
               carr=0;
            }else{
               d=a2[i]+carr+10-a1val;
               carr=-1+d/10;
            }
               diff[k]=d;
           i--;
           j--;
           k--;
           }
        int idx=0;
        while(diff[idx]==0){
            idx++;
           }
        while(idx!=diff.length){

            System.out.println(diff[idx]);
            idx++;

       }
    }
}
