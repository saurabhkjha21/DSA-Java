package Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class NextGreaterElement {
    public static ArrayList<Integer> nextGreaterElement(int[] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            res.add(-1);
        }
        Stack<Integer> st  = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                res.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static int[] nextGreaterElementReverse(int[] arr){
        int n = arr.length;
        int[] ngeA = new int[n];
        Arrays.fill(ngeA, -1);
        Stack<Integer> st  = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ngeA[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ngeA;
    }
    public static void main(String[] args) {
//        NextGreaterElement nge = new NextGreaterElement();
        int[] arr = {1,3,2,4};
        System.out.println("Original : "+Arrays.toString(arr));
        System.out.println("Output ArrayList: "+nextGreaterElement(arr));
        System.out.println("Output :"+Arrays.toString(nextGreaterElementReverse(arr)));

    }
}
