package Stack;

import java.util.Stack;

public class PrefixToInfix {
    public static String prefixToInfix(String s){
        Stack<String> st = new Stack<>();
        int n=s.length();
        for(int i=n-1; i>=0; i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(Character.toString(c));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = "("+ t1 + c + t2 + ")";
                st.push(con);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "*+PQ-MN";
        System.out.println("Prefix :"+s);
        System.out.println("Infix "+prefixToInfix(s));
    }
}
