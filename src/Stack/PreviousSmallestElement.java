package Stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallestElement {
    public static int[] printPreviousSmallestElement(int[] arr){
        int  n=arr.length;
        int[] pse = new int[n];
        Arrays.fill(pse, -1);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[i]<=st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                pse[i]=st.peek();
            }
            st.push(arr[i]);

        }
        return pse;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,7,1,-1,9,0};
        System.out.println("Original: "+Arrays.toString(arr));
        System.out.println("PSE: "+Arrays.toString(printPreviousSmallestElement(arr)));
    }
}
