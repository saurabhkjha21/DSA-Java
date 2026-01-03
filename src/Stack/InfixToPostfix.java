package Stack;

import java.util.Stack;

public class InfixToPostfix {
    static int prec(char ch){

        return switch (ch) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }
    public static String infixToPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            //Case 1 :- Operand -> Directly add to output
            if(Character.isLetterOrDigit(c)){
                ans.append(c);
            }
            //Case 2 :- Left parenthesis -> push to stack
            else if(c=='('){
                st.push(c);

            //Case 3: - Right parenthesis -> pop until '('
            }else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }

                //remove '(' from stack
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
            }
            //Case 4 :-Operator
            else{
                //pop all operator >= precedence from stack
                while (!st.isEmpty() &&
                        (prec(c) < prec(st.peek()) ||
                                (prec(c) == prec(st.peek()) && c != '^'))) {
                    ans.append(st.pop());
                }

                //then push current operator
                st.push(c);
            }
        }
        //pop remaining operators
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        String result = infixToPostfix(s);
        System.out.println(result);
    }
}
