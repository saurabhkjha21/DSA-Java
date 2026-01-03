package Collections.Stack;
import java.util.Stack;
public class Class01 {
    public static void main(String[] args) {
//        System.out.println("Try programiz.pro");
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.size());
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
}
