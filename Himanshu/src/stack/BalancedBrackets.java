package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = Balancedparenthesis(str);
        if (ans)
            System.out.println("It is an balanced brackets");
        else {
            System.out.println("It is not an balanced brackets");
        }
    }

    private static boolean Balancedparenthesis(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (ch == ')') {
                     if(st.size()==0) {
                        return false;
                    }
                    else if (st.peek() == '(') {
                        st.pop();
                    }else return false;
                }
                if (ch == '}') {
                      if(st.size()==0) {
                        return false;
                    }
                    else if (st.peek() == '{') {
                        st.pop();
                    }
                    else return false;

                }
                if (ch == ']') {
                    if (st.peek() == '['){
                        st.pop();
                }
                    else  if(st.size()==0) {
                        return false;
                    }
                    else return false;

                }
            }
        }
        return st.isEmpty();

    }
}


