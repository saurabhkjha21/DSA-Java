package Stack;

import java.util.Stack;

public class StringReverse {
    public static String reverse(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            st.push(ch);
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return  res.toString();
    }
    public static void main(String[] args) {
        String s = "amrita kochi";
        System.out.println(reverse(s));
    }
}
