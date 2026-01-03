package Stack;

import java.util.Stack;

public class InfixToPrefix {
    static int prec(char ch){
        return switch (ch){
            case '^' -> 3;
            case '/' , '*' -> 2;
            case '+' , '-' -> 1;
            default -> -1;
        };
    }
    public static String infixToPrefix(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c=='(') sb.append(')');
            else if(c==')') sb.append('(');
            else sb.append(c);
        }
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<sb.length(); i++){
            char c = sb.charAt(i);

            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() &&
                        (prec(c)<prec(st.peek())
                        || (prec(c)==prec(st.peek()) && c!='^'))){
                        ans.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {

        String s = "a+b*(c^d-e)^(f+g*h)-i";
        String result = infixToPrefix(s);
        System.out.println(result);
    }
}
