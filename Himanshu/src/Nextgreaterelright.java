import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Nextgreaterelright {
       public static void main(String []args){
              Scanner sc=new Scanner(System.in);
              int n = sc.nextInt();
              int[] arr = new int[n];
              for (int i = 0; i < n; i++) {
                     arr[i] = sc.nextInt();
              }
              Nextgreater(arr);
       }

       private static void Nextgreater(int[] arr) {
              int [] nge =new int[arr.length];
              Stack<Integer>st=new Stack<>();
              st.push(arr[arr.length-1]);
              nge[arr.length-1]=-1;
              for(int i=arr.length-2;i>=0;i--){
                     while(st.size()>0&&arr[i]>=st.peek()){
                            st.pop();
                     }
                     if(st.size()==0){
                            nge[i]=-1;
                     }else {
                            nge[i]=st.peek();
                     }
                     st.push(arr[i]);
              }
              System.out.println(Arrays.toString(nge));

       }
}
