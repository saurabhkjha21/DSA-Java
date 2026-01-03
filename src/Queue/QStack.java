package Queue;

import java.util.Stack;

public class QStack {
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public  boolean isEmpty(){
            return s1.isEmpty();
        }
        public   void add(int data){
            //move all element from s1 to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //push new data into s1
            s1.push(data);
            //move back all elements from s2 to s1
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public  int remove(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }
        public  int peek(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
