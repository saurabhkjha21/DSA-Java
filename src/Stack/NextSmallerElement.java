package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static int[] nextSmallestElementReverse(int[] arr){
        int n=arr.length;
        int[] nse = new int[n];
        Arrays.fill(nse, -1); //default -1
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i]<=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()) {
                nse[i]=st.peek();
            }

            st.push(arr[i]);
        }
        return nse;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        System.out.println("original :"+Arrays.toString(arr));
        System.out.println("Output: "+Arrays.toString(nextSmallestElementReverse(arr)));
    }
}
