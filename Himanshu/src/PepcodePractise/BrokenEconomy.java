package PepcodePractise;
import java.util.Scanner;
public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int d= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(d == arr[i]){
                System.out.println(arr[i]);
                return;
            }
            if(d<arr[i]){
                System.out.println(arr[i-1]+"\n"+arr[i]);
                return;
            }
        }
        }
}
