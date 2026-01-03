package Stack;

import java.util.Stack;

public class PrefixToPostfix {
    public static String prefixToPostfix(String s){
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(Character.toString(c));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                st.push(t1+t2+c);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "/-AB*+DEF";
        System.out.println("Prefix :"+s);
        System.out.println("Postfix: "+prefixToPostfix(s));
    }
}
