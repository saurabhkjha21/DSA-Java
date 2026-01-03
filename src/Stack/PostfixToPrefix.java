package Stack;

import java.util.Stack;

public class PostfixToPrefix {
    public static String postfixToInfix(String s){
        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(Character.toString(c));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                st.push(c+t2+t1);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s = "AB-DE+F*/";
        System.out.println("Postfix: "+s);
        System.out.println("Prefix: "+postfixToInfix(s));
    }
}
