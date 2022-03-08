package stack;
import java.util.Scanner ;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean ans=findDuplicate(str);
        if(ans)
        System.out.println("there is no  duplicate brackets");
        else{
            System.out.println("there is an duplicate brackets");
        }
    }
    private static boolean findDuplicate(String str) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                if (st.peek() == ')') {
                    return true;
                }else{
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
                }
            }else
                st.push(ch);
        }
        return false;
    }
}
