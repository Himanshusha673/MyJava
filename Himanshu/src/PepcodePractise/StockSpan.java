package PepcodePractise;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        StockSpa(arr);
    }

    private static void StockSpa(int[] arr) {
        int [] sp=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        sp[0]=1;
        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                sp[i]=i+1;
            }else{
                sp[i]=i-st.peek();
            }
            st.push(i);
        }
        for( int val: sp){
            System.out.println(val);
        }
    }
}
