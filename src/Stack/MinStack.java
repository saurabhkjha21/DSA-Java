package Stack;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args){
        MyStack st = new MyStack();
        st.push(-2);
        st.push(4);
        st.push(5);
        System.out.println(st.getMin()+"");
        st.push(-3);
        st.push(9);
        System.out.println(st.getMin()+"");
        st.pop();
        System.out.println(st.getMin()+"");
        System.out.println(st.top()+"");
        st.pop();
        st.push(7);
        System.out.println(st.getMin()+"");

    }
}
class MyStack{
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MyStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    public void pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    public int top(){
       return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
